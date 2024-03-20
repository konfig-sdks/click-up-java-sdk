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
import com.konfigthis.client.model.Features;
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
 * UpdateSpacerequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateSpacerequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_PRIVATE = "private";
  @SerializedName(SERIALIZED_NAME_PRIVATE)
  private Boolean _private;

  public static final String SERIALIZED_NAME_ADMIN_CAN_MANAGE = "admin_can_manage";
  @SerializedName(SERIALIZED_NAME_ADMIN_CAN_MANAGE)
  private Boolean adminCanManage;

  public static final String SERIALIZED_NAME_MULTIPLE_ASSIGNEES = "multiple_assignees";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_ASSIGNEES)
  private Boolean multipleAssignees;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private Features features;

  public UpdateSpacerequest() {
  }

  public UpdateSpacerequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Updated Space Name", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UpdateSpacerequest color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "#7B68EE", required = true, value = "")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
  }


  public UpdateSpacerequest _private(Boolean _private) {
    
    
    
    
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getPrivate() {
    return _private;
  }


  public void setPrivate(Boolean _private) {
    
    
    
    this._private = _private;
  }


  public UpdateSpacerequest adminCanManage(Boolean adminCanManage) {
    
    
    
    
    this.adminCanManage = adminCanManage;
    return this;
  }

   /**
   * ***Note:** Allowing or restricting admins from managing private Spaces using &#x60;\&quot;admin_can_manage\&quot;&#x60; is an [Enterprise Plan](https://clickup.com/pricing) feature.*
   * @return adminCanManage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "***Note:** Allowing or restricting admins from managing private Spaces using `\"admin_can_manage\"` is an [Enterprise Plan](https://clickup.com/pricing) feature.*")

  public Boolean getAdminCanManage() {
    return adminCanManage;
  }


  public void setAdminCanManage(Boolean adminCanManage) {
    
    
    
    this.adminCanManage = adminCanManage;
  }


  public UpdateSpacerequest multipleAssignees(Boolean multipleAssignees) {
    
    
    
    
    this.multipleAssignees = multipleAssignees;
    return this;
  }

   /**
   * Get multipleAssignees
   * @return multipleAssignees
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getMultipleAssignees() {
    return multipleAssignees;
  }


  public void setMultipleAssignees(Boolean multipleAssignees) {
    
    
    
    this.multipleAssignees = multipleAssignees;
  }


  public UpdateSpacerequest features(Features features) {
    
    
    
    
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Features getFeatures() {
    return features;
  }


  public void setFeatures(Features features) {
    
    
    
    this.features = features;
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
   * @return the UpdateSpacerequest instance itself
   */
  public UpdateSpacerequest putAdditionalProperty(String key, Object value) {
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
    UpdateSpacerequest updateSpacerequest = (UpdateSpacerequest) o;
    return Objects.equals(this.name, updateSpacerequest.name) &&
        Objects.equals(this.color, updateSpacerequest.color) &&
        Objects.equals(this._private, updateSpacerequest._private) &&
        Objects.equals(this.adminCanManage, updateSpacerequest.adminCanManage) &&
        Objects.equals(this.multipleAssignees, updateSpacerequest.multipleAssignees) &&
        Objects.equals(this.features, updateSpacerequest.features)&&
        Objects.equals(this.additionalProperties, updateSpacerequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, color, _private, adminCanManage, multipleAssignees, features, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSpacerequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    adminCanManage: ").append(toIndentedString(adminCanManage)).append("\n");
    sb.append("    multipleAssignees: ").append(toIndentedString(multipleAssignees)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("color");
    openapiFields.add("private");
    openapiFields.add("admin_can_manage");
    openapiFields.add("multiple_assignees");
    openapiFields.add("features");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("color");
    openapiRequiredFields.add("private");
    openapiRequiredFields.add("admin_can_manage");
    openapiRequiredFields.add("multiple_assignees");
    openapiRequiredFields.add("features");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateSpacerequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateSpacerequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSpacerequest is not found in the empty JSON string", UpdateSpacerequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateSpacerequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      // validate the required field `features`
      Features.validateJsonObject(jsonObj.getAsJsonObject("features"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSpacerequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSpacerequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSpacerequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSpacerequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSpacerequest>() {
           @Override
           public void write(JsonWriter out, UpdateSpacerequest value) throws IOException {
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
           public UpdateSpacerequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateSpacerequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateSpacerequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSpacerequest
  * @throws IOException if the JSON string is invalid with respect to UpdateSpacerequest
  */
  public static UpdateSpacerequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSpacerequest.class);
  }

 /**
  * Convert an instance of UpdateSpacerequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

