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
import com.konfigthis.client.model.Space2;
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
 * Folder5
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Folder5 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDERINDEX = "orderindex";
  @SerializedName(SERIALIZED_NAME_ORDERINDEX)
  private Integer orderindex;

  public static final String SERIALIZED_NAME_OVERRIDE_STATUSES = "override_statuses";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_STATUSES)
  private Boolean overrideStatuses;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_SPACE = "space";
  @SerializedName(SERIALIZED_NAME_SPACE)
  private Space2 space;

  public static final String SERIALIZED_NAME_TASK_COUNT = "task_count";
  @SerializedName(SERIALIZED_NAME_TASK_COUNT)
  private String taskCount;

  public static final String SERIALIZED_NAME_LISTS = "lists";
  @SerializedName(SERIALIZED_NAME_LISTS)
  private List<String> lists = new ArrayList<>();

  public Folder5() {
  }

  public Folder5 id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1057X", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Folder5 name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Folder Name", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public Folder5 orderindex(Integer orderindex) {
    
    
    
    
    this.orderindex = orderindex;
    return this;
  }

   /**
   * Get orderindex
   * @return orderindex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "")

  public Integer getOrderindex() {
    return orderindex;
  }


  public void setOrderindex(Integer orderindex) {
    
    
    
    this.orderindex = orderindex;
  }


  public Folder5 overrideStatuses(Boolean overrideStatuses) {
    
    
    
    
    this.overrideStatuses = overrideStatuses;
    return this;
  }

   /**
   * Get overrideStatuses
   * @return overrideStatuses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getOverrideStatuses() {
    return overrideStatuses;
  }


  public void setOverrideStatuses(Boolean overrideStatuses) {
    
    
    
    this.overrideStatuses = overrideStatuses;
  }


  public Folder5 hidden(Boolean hidden) {
    
    
    
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Get hidden
   * @return hidden
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    
    
    
    this.hidden = hidden;
  }


  public Folder5 space(Space2 space) {
    
    
    
    
    this.space = space;
    return this;
  }

   /**
   * Get space
   * @return space
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Space2 getSpace() {
    return space;
  }


  public void setSpace(Space2 space) {
    
    
    
    this.space = space;
  }


  public Folder5 taskCount(String taskCount) {
    
    
    
    
    this.taskCount = taskCount;
    return this;
  }

   /**
   * Get taskCount
   * @return taskCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "")

  public String getTaskCount() {
    return taskCount;
  }


  public void setTaskCount(String taskCount) {
    
    
    
    this.taskCount = taskCount;
  }


  public Folder5 lists(List<String> lists) {
    
    
    
    
    this.lists = lists;
    return this;
  }

  public Folder5 addListsItem(String listsItem) {
    this.lists.add(listsItem);
    return this;
  }

   /**
   * Get lists
   * @return lists
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getLists() {
    return lists;
  }


  public void setLists(List<String> lists) {
    
    
    
    this.lists = lists;
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
   * @return the Folder5 instance itself
   */
  public Folder5 putAdditionalProperty(String key, Object value) {
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
    Folder5 folder5 = (Folder5) o;
    return Objects.equals(this.id, folder5.id) &&
        Objects.equals(this.name, folder5.name) &&
        Objects.equals(this.orderindex, folder5.orderindex) &&
        Objects.equals(this.overrideStatuses, folder5.overrideStatuses) &&
        Objects.equals(this.hidden, folder5.hidden) &&
        Objects.equals(this.space, folder5.space) &&
        Objects.equals(this.taskCount, folder5.taskCount) &&
        Objects.equals(this.lists, folder5.lists)&&
        Objects.equals(this.additionalProperties, folder5.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orderindex, overrideStatuses, hidden, space, taskCount, lists, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder5 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderindex: ").append(toIndentedString(orderindex)).append("\n");
    sb.append("    overrideStatuses: ").append(toIndentedString(overrideStatuses)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("orderindex");
    openapiFields.add("override_statuses");
    openapiFields.add("hidden");
    openapiFields.add("space");
    openapiFields.add("task_count");
    openapiFields.add("lists");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("orderindex");
    openapiRequiredFields.add("override_statuses");
    openapiRequiredFields.add("hidden");
    openapiRequiredFields.add("space");
    openapiRequiredFields.add("task_count");
    openapiRequiredFields.add("lists");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Folder5
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Folder5.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Folder5 is not found in the empty JSON string", Folder5.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Folder5.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `space`
      Space2.validateJsonObject(jsonObj.getAsJsonObject("space"));
      if (!jsonObj.get("task_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_count").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("lists") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("lists").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lists` to be an array in the JSON string but got `%s`", jsonObj.get("lists").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Folder5.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Folder5' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Folder5> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Folder5.class));

       return (TypeAdapter<T>) new TypeAdapter<Folder5>() {
           @Override
           public void write(JsonWriter out, Folder5 value) throws IOException {
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
           public Folder5 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Folder5 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Folder5 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Folder5
  * @throws IOException if the JSON string is invalid with respect to Folder5
  */
  public static Folder5 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Folder5.class);
  }

 /**
  * Convert an instance of Folder5 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

