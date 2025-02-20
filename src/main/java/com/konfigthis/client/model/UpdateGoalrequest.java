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
 * UpdateGoalrequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateGoalrequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private Integer dueDate;

  public static final String SERIALIZED_NAME_REM_OWNERS = "rem_owners";
  @SerializedName(SERIALIZED_NAME_REM_OWNERS)
  private List<Integer> remOwners = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADD_OWNERS = "add_owners";
  @SerializedName(SERIALIZED_NAME_ADD_OWNERS)
  private List<Integer> addOwners = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public UpdateGoalrequest() {
  }

  public UpdateGoalrequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Updated Goal Description", required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public UpdateGoalrequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Updated Goal Name", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UpdateGoalrequest dueDate(Integer dueDate) {
    
    
    
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1568036964079", required = true, value = "")

  public Integer getDueDate() {
    return dueDate;
  }


  public void setDueDate(Integer dueDate) {
    
    
    
    this.dueDate = dueDate;
  }


  public UpdateGoalrequest remOwners(List<Integer> remOwners) {
    
    
    
    
    this.remOwners = remOwners;
    return this;
  }

  public UpdateGoalrequest addRemOwnersItem(Integer remOwnersItem) {
    this.remOwners.add(remOwnersItem);
    return this;
  }

   /**
   * Array of user IDs.
   * @return remOwners
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of user IDs.")

  public List<Integer> getRemOwners() {
    return remOwners;
  }


  public void setRemOwners(List<Integer> remOwners) {
    
    
    
    this.remOwners = remOwners;
  }


  public UpdateGoalrequest addOwners(List<Integer> addOwners) {
    
    
    
    
    this.addOwners = addOwners;
    return this;
  }

  public UpdateGoalrequest addAddOwnersItem(Integer addOwnersItem) {
    this.addOwners.add(addOwnersItem);
    return this;
  }

   /**
   * Array of user IDs.
   * @return addOwners
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of user IDs.")

  public List<Integer> getAddOwners() {
    return addOwners;
  }


  public void setAddOwners(List<Integer> addOwners) {
    
    
    
    this.addOwners = addOwners;
  }


  public UpdateGoalrequest color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "#32a852", required = true, value = "")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
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
   * @return the UpdateGoalrequest instance itself
   */
  public UpdateGoalrequest putAdditionalProperty(String key, Object value) {
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
    UpdateGoalrequest updateGoalrequest = (UpdateGoalrequest) o;
    return Objects.equals(this.description, updateGoalrequest.description) &&
        Objects.equals(this.name, updateGoalrequest.name) &&
        Objects.equals(this.dueDate, updateGoalrequest.dueDate) &&
        Objects.equals(this.remOwners, updateGoalrequest.remOwners) &&
        Objects.equals(this.addOwners, updateGoalrequest.addOwners) &&
        Objects.equals(this.color, updateGoalrequest.color)&&
        Objects.equals(this.additionalProperties, updateGoalrequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, dueDate, remOwners, addOwners, color, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGoalrequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    remOwners: ").append(toIndentedString(remOwners)).append("\n");
    sb.append("    addOwners: ").append(toIndentedString(addOwners)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("due_date");
    openapiFields.add("rem_owners");
    openapiFields.add("add_owners");
    openapiFields.add("color");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("due_date");
    openapiRequiredFields.add("rem_owners");
    openapiRequiredFields.add("add_owners");
    openapiRequiredFields.add("color");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateGoalrequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateGoalrequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGoalrequest is not found in the empty JSON string", UpdateGoalrequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateGoalrequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("rem_owners") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("rem_owners").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rem_owners` to be an array in the JSON string but got `%s`", jsonObj.get("rem_owners").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("add_owners") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("add_owners").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_owners` to be an array in the JSON string but got `%s`", jsonObj.get("add_owners").toString()));
      }
      if (!jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGoalrequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGoalrequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGoalrequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGoalrequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGoalrequest>() {
           @Override
           public void write(JsonWriter out, UpdateGoalrequest value) throws IOException {
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
           public UpdateGoalrequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateGoalrequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateGoalrequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateGoalrequest
  * @throws IOException if the JSON string is invalid with respect to UpdateGoalrequest
  */
  public static UpdateGoalrequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGoalrequest.class);
  }

 /**
  * Convert an instance of UpdateGoalrequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

