/*
 * MarzbanAPI
 * Unified GUI Censorship Resistant Solution Powered by Xray
 *
 * OpenAPI spec version: 0.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CoreStats
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-26T06:54:11.907891916Z[GMT]")

public class CoreStats {
  @SerializedName("version")
  private String version = null;

  @SerializedName("started")
  private Boolean started = null;

  @SerializedName("logs_websocket")
  private String logsWebsocket = null;

  public CoreStats version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(required = true, description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public CoreStats started(Boolean started) {
    this.started = started;
    return this;
  }

   /**
   * Get started
   * @return started
  **/
  @Schema(required = true, description = "")
  public Boolean isStarted() {
    return started;
  }

  public void setStarted(Boolean started) {
    this.started = started;
  }

  public CoreStats logsWebsocket(String logsWebsocket) {
    this.logsWebsocket = logsWebsocket;
    return this;
  }

   /**
   * Get logsWebsocket
   * @return logsWebsocket
  **/
  @Schema(required = true, description = "")
  public String getLogsWebsocket() {
    return logsWebsocket;
  }

  public void setLogsWebsocket(String logsWebsocket) {
    this.logsWebsocket = logsWebsocket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreStats coreStats = (CoreStats) o;
    return Objects.equals(this.version, coreStats.version) &&
        Objects.equals(this.started, coreStats.started) &&
        Objects.equals(this.logsWebsocket, coreStats.logsWebsocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, started, logsWebsocket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreStats {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    logsWebsocket: ").append(toIndentedString(logsWebsocket)).append("\n");
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