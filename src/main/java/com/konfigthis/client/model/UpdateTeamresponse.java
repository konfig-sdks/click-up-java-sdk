/*
 * ClickUp API Reference
 * This is the ClickUp API Reference where you can learn about specific endpoints and parameters in detail.  Browse the available endpoints using the sidebar on the left.  **Not sure where to begin?** [Get Started with the ClickUp API](https://clickup.com/api) 
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Avatar;
import com.konfigthis.client.model.Members3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * UpdateTeamresponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateTeamresponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TEAM_ID = "team_id";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private String teamId;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HANDLE = "handle";
  @SerializedName(SERIALIZED_NAME_HANDLE)
  private String handle;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_INITIALS = "initials";
  @SerializedName(SERIALIZED_NAME_INITIALS)
  private String initials;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<Members3> members = new ArrayList<>();

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private Avatar avatar;

  public UpdateTeamresponse() {
  }

  public UpdateTeamresponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4bfdfcec-6f4f-40a7-b0d6-22660d51870dX", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public UpdateTeamresponse teamId(String teamId) {
    
    
    
    
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123456", required = true, value = "")

  public String getTeamId() {
    return teamId;
  }


  public void setTeamId(String teamId) {
    
    
    
    this.teamId = teamId;
  }


  public UpdateTeamresponse userid(Integer userid) {
    
    
    
    
    this.userid = userid;
    return this;
  }

   /**
   * Get userid
   * @return userid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "301828", required = true, value = "")

  public Integer getUserid() {
    return userid;
  }


  public void setUserid(Integer userid) {
    
    
    
    this.userid = userid;
  }


  public UpdateTeamresponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "New User Group Name", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UpdateTeamresponse handle(String handle) {
    
    
    
    
    this.handle = handle;
    return this;
  }

   /**
   * Get handle
   * @return handle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "newusergroupname", required = true, value = "")

  public String getHandle() {
    return handle;
  }


  public void setHandle(String handle) {
    
    
    
    this.handle = handle;
  }


  public UpdateTeamresponse dateCreated(String dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1640122639829", required = true, value = "")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public UpdateTeamresponse initials(String initials) {
    
    
    
    
    this.initials = initials;
    return this;
  }

   /**
   * Get initials
   * @return initials
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "NN", required = true, value = "")

  public String getInitials() {
    return initials;
  }


  public void setInitials(String initials) {
    
    
    
    this.initials = initials;
  }


  public UpdateTeamresponse members(List<Members3> members) {
    
    
    
    
    this.members = members;
    return this;
  }

  public UpdateTeamresponse addMembersItem(Members3 membersItem) {
    this.members.add(membersItem);
    return this;
  }

   /**
   * 
   * @return members
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Members3> getMembers() {
    return members;
  }


  public void setMembers(List<Members3> members) {
    
    
    
    this.members = members;
  }


  public UpdateTeamresponse avatar(Avatar avatar) {
    
    
    
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Avatar getAvatar() {
    return avatar;
  }


  public void setAvatar(Avatar avatar) {
    
    
    
    this.avatar = avatar;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UpdateTeamresponse instance itself
   */
  public UpdateTeamresponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTeamresponse updateTeamresponse = (UpdateTeamresponse) o;
    return Objects.equals(this.id, updateTeamresponse.id) &&
        Objects.equals(this.teamId, updateTeamresponse.teamId) &&
        Objects.equals(this.userid, updateTeamresponse.userid) &&
        Objects.equals(this.name, updateTeamresponse.name) &&
        Objects.equals(this.handle, updateTeamresponse.handle) &&
        Objects.equals(this.dateCreated, updateTeamresponse.dateCreated) &&
        Objects.equals(this.initials, updateTeamresponse.initials) &&
        Objects.equals(this.members, updateTeamresponse.members) &&
        Objects.equals(this.avatar, updateTeamresponse.avatar)&&
        Objects.equals(this.additionalProperties, updateTeamresponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, teamId, userid, name, handle, dateCreated, initials, members, avatar, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTeamresponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    initials: ").append(toIndentedString(initials)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("team_id");
    openapiFields.add("userid");
    openapiFields.add("name");
    openapiFields.add("handle");
    openapiFields.add("date_created");
    openapiFields.add("initials");
    openapiFields.add("members");
    openapiFields.add("avatar");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("team_id");
    openapiRequiredFields.add("userid");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("handle");
    openapiRequiredFields.add("date_created");
    openapiRequiredFields.add("initials");
    openapiRequiredFields.add("members");
    openapiRequiredFields.add("avatar");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateTeamresponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateTeamresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTeamresponse is not found in the empty JSON string", UpdateTeamresponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateTeamresponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("team_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("handle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handle").toString()));
      }
      if (!jsonObj.get("date_created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_created").toString()));
      }
      if (!jsonObj.get("initials").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initials` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initials").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("members").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
      }

      JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
      // validate the required field `members` (array)
      for (int i = 0; i < jsonArraymembers.size(); i++) {
        Members3.validateJsonObject(jsonArraymembers.get(i).getAsJsonObject());
      };
      // validate the required field `avatar`
      Avatar.validateJsonObject(jsonObj.getAsJsonObject("avatar"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTeamresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTeamresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTeamresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTeamresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTeamresponse>() {
           @Override
           public void write(JsonWriter out, UpdateTeamresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTeamresponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateTeamresponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTeamresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTeamresponse
  * @throws IOException if the JSON string is invalid with respect to UpdateTeamresponse
  */
  public static UpdateTeamresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTeamresponse.class);
  }

 /**
  * Convert an instance of UpdateTeamresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

