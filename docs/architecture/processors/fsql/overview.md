# Apache Flink SQL Processor (FSQL)

Backed by [Apache Flink Streaming SQL](https://nightlies.apache.org/flink/flink-docs-master/docs/dev/table/sql/queries/overview/), it allows inline Query definitions to be defined in the CR resource. 
The set of input stream data which should trigger a transformation is represented by a (streaming) SQL query across the various inputs which yields event tuples which are emitted to the output streams.

Like the other processor types, the `FSQL` uses the [Processor CRD](https://github.com/vmware-tanzu/streaming-runtimes/blob/main/streaming-runtime-operator/crds/processor-crd.yaml) custom resource to configure the processor within the SR Control Plane. 

The `spec.inlineQuery` property should contain one or more, Apache Flink compliant, [streaming SQL queries](https://nightlies.apache.org/flink/flink-docs-master/docs/dev/table/sql/queries/overview/).
The FSQL processor does __NOT__ use the `spec.inputs` and `spec.outputs` to configure the inbound or outbound Streams. 
Instead those are configured within the SQL queries using the following placeholder convention: ``` [[STREAM:<stream-name>]] ``` , where the `<stream-name>` should refer to an existing `Stream` CR name.

The [sql-aggregator](https://github.com/vmware-tanzu/streaming-runtimes/tree/main/sql-aggregator) event-driven application implements the Data Plane FSQL capabilities. It is implemented as SpringBoot app that runs embedded Apache Flink.

## FSQL Attributes

Few specific attributes are used to configure the FSQL specific debug capabilities.


| FSQL Attribute    | Description                          |
| ----------------- | ------------------------------------ |
| `debugQuery`      | Optionally you can configure a side query that is continuously against input and output processor's streams and show the result in container's console log. Handy to debug processor output results correctness.  |
| `debugExplain`    | print the SQL queries logical and physical plans for selected (by index) inline queries. Indices correspond to the inlineQuery order |

## Usage

```yaml
apiVersion: streaming.tanzu.vmware.com/v1alpha1
kind: Processor
metadata: {}
spec:
    # Type of the processor. In this case FSQL
    type: FSQL
    # List of streaming SQL queries that will be executed by the processor. 
    # Queries are executed in the order of their definition.
    # Uses in-query stream name placeholders: [[STREAM:<stream-cr-name>]]
    inlineQuery:
        - <string sql>
    attributes:
        # Optionally you can configure a side query that is continuously 
        # against input and output processor's streams and show the result 
        # in container's console log.
        # Handy to debug processor output results correctness.
        debugQuery: <string sql>
        # (optional) Additionally can print the SQL queries logical 
        # and physical plans for selected (by index) inline queries. 
        # Indices correspond to the inlineQuery order.
        debugExplain: <list of integers>
```

Example FSQL definition:

```yaml
apiVersion: streaming.tanzu.vmware.com/v1alpha1
kind: Processor
metadata:
  name: topk-songs-join
spec:
  type: FSQL
  inlineQuery:
    - "INSERT INTO [[STREAM:songplays-stream]] 
        SELECT Plays.song_id, Songs.album, Songs.artist, Songs.name, Songs.genre, Plays.duration, Plays.event_time   
        FROM(SELECT * FROM [[STREAM:playevents-stream]] WHERE duration >= 30000) AS Plays 
        INNER JOIN [[STREAM:songs-stream]] as Songs ON Plays.song_id = Songs.song_id"
  attributes:
    debugQuery: "SELECT * FROM SongPlays" 
```

The `inlineQuery` continuously joins the input `songs-stream` and `playevents-stream` streams on the `song_id` field and writes the projected, results in the `songplays-stream` output stream.
A sub-query is used to filter in only the playevents-stream events that have `duration >= 30000`.

The `debugQuery` helps to print in the processor's container log the last join results. Note that the `SongPlays` is the name of the Stream `spec.name` not the `metadata.name` used in the placeholders.

## Examples

![](../../../samples/top-k-songs/topk-deployed.svg)

- ![anomaly detection logo](../../../samples/anomaly-detection/anomaly-detection-logo.png){ align=left, width="25"} [Anomaly Detection](../../../samples/anomaly-detection/anomaly-detection.md) (FSQL, SRP)- detect, in real time, suspicious credit card transactions, and extract them for further processing.
- ![clickstream logo](../../../samples/clickstream/clickstream-logo.png){ align=left, width="25"} [Clickstream Analysis](../../../samples/clickstream/clickstream.md) (FSQL, SRP) -   for an input clickstream stream, we want to know who are the high status customers, currently using the website so that we can engage with them or to find how much they buy or how long they stay on the site that day.
- ![iot logo](../../../samples/iot-monitoring/iot-logo.png){ align=left, width="20"} [IoT Monitoring analysis](../../../samples/iot-monitoring/iot-monitoring.md) (FSQL, SRP) - real-time analysis of IoT monitoring log.
- ![top-k-songs-logo](../../../samples/top-k-songs/top-k-songs-logo.png){ align=left, width="20"} [Streaming Music Service](../../../samples/top-k-songs/top-k-songs.md) (FSQL, SRP) - music ranking application that continuously computes the latest Top-K music charts based on song play events collected in real-time.