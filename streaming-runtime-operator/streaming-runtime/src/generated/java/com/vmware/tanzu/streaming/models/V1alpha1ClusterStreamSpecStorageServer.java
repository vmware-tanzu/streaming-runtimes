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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1ClusterStreamSpecStorageServer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T09:15:52.676Z[Etc/UTC]")
public class V1alpha1ClusterStreamSpecStorageServer {
  public static final String SERIALIZED_NAME_BINDING = "binding";
  @SerializedName(SERIALIZED_NAME_BINDING)
  private String binding;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public V1alpha1ClusterStreamSpecStorageServer binding(String binding) {
    
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


  public V1alpha1ClusterStreamSpecStorageServer protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public V1alpha1ClusterStreamSpecStorageServer url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterStreamSpecStorageServer v1alpha1ClusterStreamSpecStorageServer = (V1alpha1ClusterStreamSpecStorageServer) o;
    return Objects.equals(this.binding, v1alpha1ClusterStreamSpecStorageServer.binding) &&
        Objects.equals(this.protocol, v1alpha1ClusterStreamSpecStorageServer.protocol) &&
        Objects.equals(this.url, v1alpha1ClusterStreamSpecStorageServer.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binding, protocol, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterStreamSpecStorageServer {\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

