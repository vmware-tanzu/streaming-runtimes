## 4. Stateless Replication

By default the Processor controller deploys one instance for every Processor.
The `spec.replicas` is used to set the desired number of processor instances.

For not-partitioned input the runtime creates, stateless, Kubernetes Deployment Pods for every processor instance and configures round-robing message delivery policy. 
Every inbound message is deliver to ONLY one processor instance selected on round-robing principle. The order of the instances is not guarantied.

In case of partitioned input or processor 'forceStatefulSet=true' attribute, the runtime operator creates StatefulSet Pods with strict guarantees about the ordering and uniqueness of these Pods.
Unlike a Deployment, the StatefulSet maintains a sticky identity for each of their Pods. These pods are created from the same spec, but are not interchangeable: each has a persistent identifier that it maintains across any rescheduling.

If you want to use storage volumes to provide persistence for your workload, or use Stream partitioning, then `StatefulSet` is default configuration. Although individual Pods in a `StatefulSet` are susceptible to failure, the persistent Pod identifiers make it easier to match existing volumes to the new Pods that replace any that have failed.
