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
import io.swagger.client.model.UserResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * UsersResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-26T06:54:11.907891916Z[GMT]")

public class UsersResponse {
  @SerializedName("users")
  private List<UserResponse> users = new ArrayList<UserResponse>();

  @SerializedName("total")
  private Integer total = null;

  public UsersResponse users(List<UserResponse> users) {
    this.users = users;
    return this;
  }

  public UsersResponse addUsersItem(UserResponse usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @Schema(required = true, description = "")
  public List<UserResponse> getUsers() {
    return users;
  }

  public void setUsers(List<UserResponse> users) {
    this.users = users;
  }

  public UsersResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(required = true, description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersResponse usersResponse = (UsersResponse) o;
    return Objects.equals(this.users, usersResponse.users) &&
        Objects.equals(this.total, usersResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersResponse {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
