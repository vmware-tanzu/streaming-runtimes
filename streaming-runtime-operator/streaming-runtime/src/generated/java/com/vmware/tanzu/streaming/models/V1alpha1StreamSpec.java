/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.19.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.vmware.tanzu.streaming.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vmware.tanzu.streaming.models.V1alpha1StreamSpecDataSchemaContext;
import com.vmware.tanzu.streaming.models.V1alpha1StreamSpecStorage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1alpha1StreamSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T09:15:52.676Z[Etc/UTC]")
public class V1alpha1StreamSpec {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = null;

  public static final String SERIALIZED_NAME_BINDING = "binding";
  @SerializedName(SERIALIZED_NAME_BINDING)
  private String binding;

  public static final String SERIALIZED_NAME_DATA_SCHEMA_CONTEXT = "dataSchemaContext";
  @SerializedName(SERIALIZED_NAME_DATA_SCHEMA_CONTEXT)
  private V1alpha1StreamSpecDataSchemaContext dataSchemaContext;

  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<String> keys = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private V1alpha1StreamSpecStorage storage;

  public static final String SERIALIZED_NAME_STREAM_MODE = "streamMode";
  @SerializedName(SERIALIZED_NAME_STREAM_MODE)
  private List<String> streamMode = null;


  public V1alpha1StreamSpec attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public V1alpha1StreamSpec putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  public V1alpha1StreamSpec binding(String binding) {
    
    this.binding = binding;
    return this;
  }

   /**
   * Get binding
   * @return binding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBinding() {
    return binding;
  }


  public void setBinding(String binding) {
    this.binding = binding;
  }


  public V1alpha1StreamSpec dataSchemaContext(V1alpha1StreamSpecDataSchemaContext dataSchemaContext) {
    
    this.dataSchemaContext = dataSchemaContext;
    return this;
  }

   /**
   * Get dataSchemaContext
   * @return dataSchemaContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1StreamSpecDataSchemaContext getDataSchemaContext() {
    return dataSchemaContext;
  }


  public void setDataSchemaContext(V1alpha1StreamSpecDataSchemaContext dataSchemaContext) {
    this.dataSchemaContext = dataSchemaContext;
  }


  public V1alpha1StreamSpec keys(List<String> keys) {
    
    this.keys = keys;
    return this;
  }

  public V1alpha1StreamSpec addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKeys() {
    return keys;
  }


  public void setKeys(List<String> keys) {
    this.keys = keys;
  }


  public V1alpha1StreamSpec name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1StreamSpec protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public V1alpha1StreamSpec storage(V1alpha1StreamSpecStorage storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1StreamSpecStorage getStorage() {
    return storage;
  }


  public void setStorage(V1alpha1StreamSpecStorage storage) {
    this.storage = storage;
  }


  public V1alpha1StreamSpec streamMode(List<String> streamMode) {
    
    this.streamMode = streamMode;
    return this;
  }

  public V1alpha1StreamSpec addStreamModeItem(String streamModeItem) {
    if (this.streamMode == null) {
      this.streamMode = new ArrayList<>();
    }
    this.streamMode.add(streamModeItem);
    return this;
  }

   /**
   * Get streamMode
   * @return streamMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStreamMode() {
    return streamMode;
  }


  public void setStreamMode(List<String> streamMode) {
    this.streamMode = streamMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1StreamSpec v1alpha1StreamSpec = (V1alpha1StreamSpec) o;
    return Objects.equals(this.attributes, v1alpha1StreamSpec.attributes) &&
        Objects.equals(this.binding, v1alpha1StreamSpec.binding) &&
        Objects.equals(this.dataSchemaContext, v1alpha1StreamSpec.dataSchemaContext) &&
        Objects.equals(this.keys, v1alpha1StreamSpec.keys) &&
        Objects.equals(this.name, v1alpha1StreamSpec.name) &&
        Objects.equals(this.protocol, v1alpha1StreamSpec.protocol) &&
        Objects.equals(this.storage, v1alpha1StreamSpec.storage) &&
        Objects.equals(this.streamMode, v1alpha1StreamSpec.streamMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, binding, dataSchemaContext, keys, name, protocol, storage, streamMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1StreamSpec {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
    sb.append("    dataSchemaContext: ").append(toIndentedString(dataSchemaContext)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    streamMode: ").append(toIndentedString(streamMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

