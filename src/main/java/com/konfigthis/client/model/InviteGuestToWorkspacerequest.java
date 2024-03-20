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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * InviteGuestToWorkspacerequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InviteGuestToWorkspacerequest {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_CAN_EDIT_TAGS = "can_edit_tags";
  @SerializedName(SERIALIZED_NAME_CAN_EDIT_TAGS)
  private Boolean canEditTags;

  public static final String SERIALIZED_NAME_CAN_SEE_TIME_SPENT = "can_see_time_spent";
  @SerializedName(SERIALIZED_NAME_CAN_SEE_TIME_SPENT)
  private Boolean canSeeTimeSpent;

  public static final String SERIALIZED_NAME_CAN_SEE_TIME_ESTIMATED = "can_see_time_estimated";
  @SerializedName(SERIALIZED_NAME_CAN_SEE_TIME_ESTIMATED)
  private Boolean canSeeTimeEstimated;

  public static final String SERIALIZED_NAME_CAN_CREATE_VIEWS = "can_create_views";
  @SerializedName(SERIALIZED_NAME_CAN_CREATE_VIEWS)
  private Boolean canCreateViews;

  public static final String SERIALIZED_NAME_CUSTOM_ROLE_ID = "custom_role_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ROLE_ID)
  private Integer customRoleId;

  public InviteGuestToWorkspacerequest() {
  }

  public InviteGuestToWorkspacerequest email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "guest@example.com", required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public InviteGuestToWorkspacerequest canEditTags(Boolean canEditTags) {
    
    
    
    
    this.canEditTags = canEditTags;
    return this;
  }

   /**
   * Get canEditTags
   * @return canEditTags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getCanEditTags() {
    return canEditTags;
  }


  public void setCanEditTags(Boolean canEditTags) {
    
    
    
    this.canEditTags = canEditTags;
  }


  public InviteGuestToWorkspacerequest canSeeTimeSpent(Boolean canSeeTimeSpent) {
    
    
    
    
    this.canSeeTimeSpent = canSeeTimeSpent;
    return this;
  }

   /**
   * Get canSeeTimeSpent
   * @return canSeeTimeSpent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getCanSeeTimeSpent() {
    return canSeeTimeSpent;
  }


  public void setCanSeeTimeSpent(Boolean canSeeTimeSpent) {
    
    
    
    this.canSeeTimeSpent = canSeeTimeSpent;
  }


  public InviteGuestToWorkspacerequest canSeeTimeEstimated(Boolean canSeeTimeEstimated) {
    
    
    
    
    this.canSeeTimeEstimated = canSeeTimeEstimated;
    return this;
  }

   /**
   * Get canSeeTimeEstimated
   * @return canSeeTimeEstimated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getCanSeeTimeEstimated() {
    return canSeeTimeEstimated;
  }


  public void setCanSeeTimeEstimated(Boolean canSeeTimeEstimated) {
    
    
    
    this.canSeeTimeEstimated = canSeeTimeEstimated;
  }


  public InviteGuestToWorkspacerequest canCreateViews(Boolean canCreateViews) {
    
    
    
    
    this.canCreateViews = canCreateViews;
    return this;
  }

   /**
   * Get canCreateViews
   * @return canCreateViews
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getCanCreateViews() {
    return canCreateViews;
  }


  public void setCanCreateViews(Boolean canCreateViews) {
    
    
    
    this.canCreateViews = canCreateViews;
  }


  public InviteGuestToWorkspacerequest customRoleId(Integer customRoleId) {
    
    
    
    
    this.customRoleId = customRoleId;
    return this;
  }

   /**
   * Get customRoleId
   * @return customRoleId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12345", required = true, value = "")

  public Integer getCustomRoleId() {
    return customRoleId;
  }


  public void setCustomRoleId(Integer customRoleId) {
    
    
    
    this.customRoleId = customRoleId;
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
   * @return the InviteGuestToWorkspacerequest instance itself
   */
  public InviteGuestToWorkspacerequest putAdditionalProperty(String key, Object value) {
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
    InviteGuestToWorkspacerequest inviteGuestToWorkspacerequest = (InviteGuestToWorkspacerequest) o;
    return Objects.equals(this.email, inviteGuestToWorkspacerequest.email) &&
        Objects.equals(this.canEditTags, inviteGuestToWorkspacerequest.canEditTags) &&
        Objects.equals(this.canSeeTimeSpent, inviteGuestToWorkspacerequest.canSeeTimeSpent) &&
        Objects.equals(this.canSeeTimeEstimated, inviteGuestToWorkspacerequest.canSeeTimeEstimated) &&
        Objects.equals(this.canCreateViews, inviteGuestToWorkspacerequest.canCreateViews) &&
        Objects.equals(this.customRoleId, inviteGuestToWorkspacerequest.customRoleId)&&
        Objects.equals(this.additionalProperties, inviteGuestToWorkspacerequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, canEditTags, canSeeTimeSpent, canSeeTimeEstimated, canCreateViews, customRoleId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteGuestToWorkspacerequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    canEditTags: ").append(toIndentedString(canEditTags)).append("\n");
    sb.append("    canSeeTimeSpent: ").append(toIndentedString(canSeeTimeSpent)).append("\n");
    sb.append("    canSeeTimeEstimated: ").append(toIndentedString(canSeeTimeEstimated)).append("\n");
    sb.append("    canCreateViews: ").append(toIndentedString(canCreateViews)).append("\n");
    sb.append("    customRoleId: ").append(toIndentedString(customRoleId)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("can_edit_tags");
    openapiFields.add("can_see_time_spent");
    openapiFields.add("can_see_time_estimated");
    openapiFields.add("can_create_views");
    openapiFields.add("custom_role_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("can_edit_tags");
    openapiRequiredFields.add("can_see_time_spent");
    openapiRequiredFields.add("can_see_time_estimated");
    openapiRequiredFields.add("can_create_views");
    openapiRequiredFields.add("custom_role_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InviteGuestToWorkspacerequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InviteGuestToWorkspacerequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InviteGuestToWorkspacerequest is not found in the empty JSON string", InviteGuestToWorkspacerequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InviteGuestToWorkspacerequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InviteGuestToWorkspacerequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InviteGuestToWorkspacerequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InviteGuestToWorkspacerequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InviteGuestToWorkspacerequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InviteGuestToWorkspacerequest>() {
           @Override
           public void write(JsonWriter out, InviteGuestToWorkspacerequest value) throws IOException {
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
           public InviteGuestToWorkspacerequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InviteGuestToWorkspacerequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InviteGuestToWorkspacerequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InviteGuestToWorkspacerequest
  * @throws IOException if the JSON string is invalid with respect to InviteGuestToWorkspacerequest
  */
  public static InviteGuestToWorkspacerequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InviteGuestToWorkspacerequest.class);
  }

 /**
  * Convert an instance of InviteGuestToWorkspacerequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

