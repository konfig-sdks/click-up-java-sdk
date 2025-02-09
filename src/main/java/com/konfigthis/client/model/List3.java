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
import com.konfigthis.client.model.Status;
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
 * List3
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class List3 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDERINDEX = "orderindex";
  @SerializedName(SERIALIZED_NAME_ORDERINDEX)
  private Integer orderindex;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status = null;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Object priority = null;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private Object assignee = null;

  public static final String SERIALIZED_NAME_TASK_COUNT = "task_count";
  @SerializedName(SERIALIZED_NAME_TASK_COUNT)
  private String taskCount;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private Object dueDate = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Object startDate = null;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_OVERRIDE_STATUSES = "override_statuses";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_STATUSES)
  private Boolean overrideStatuses;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<Status> statuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERMISSION_LEVEL = "permission_level";
  @SerializedName(SERIALIZED_NAME_PERMISSION_LEVEL)
  private String permissionLevel;

  public List3() {
  }

  public List3 id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1427X", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public List3 name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "List Name", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public List3 orderindex(Integer orderindex) {
    
    
    
    
    this.orderindex = orderindex;
    return this;
  }

   /**
   * Get orderindex
   * @return orderindex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getOrderindex() {
    return orderindex;
  }


  public void setOrderindex(Integer orderindex) {
    
    
    
    this.orderindex = orderindex;
  }


  public List3 status(Object status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getStatus() {
    return status;
  }


  public void setStatus(Object status) {
    
    
    
    this.status = status;
  }


  public List3 priority(Object priority) {
    
    
    
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getPriority() {
    return priority;
  }


  public void setPriority(Object priority) {
    
    
    
    this.priority = priority;
  }


  public List3 assignee(Object assignee) {
    
    
    
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getAssignee() {
    return assignee;
  }


  public void setAssignee(Object assignee) {
    
    
    
    this.assignee = assignee;
  }


  public List3 taskCount(String taskCount) {
    
    
    
    
    this.taskCount = taskCount;
    return this;
  }

   /**
   * Get taskCount
   * @return taskCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "")

  public String getTaskCount() {
    return taskCount;
  }


  public void setTaskCount(String taskCount) {
    
    
    
    this.taskCount = taskCount;
  }


  public List3 dueDate(Object dueDate) {
    
    
    
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getDueDate() {
    return dueDate;
  }


  public void setDueDate(Object dueDate) {
    
    
    
    this.dueDate = dueDate;
  }


  public List3 startDate(Object startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getStartDate() {
    return startDate;
  }


  public void setStartDate(Object startDate) {
    
    
    
    this.startDate = startDate;
  }


  public List3 archived(Boolean archived) {
    
    
    
    
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    
    
    
    this.archived = archived;
  }


  public List3 overrideStatuses(Boolean overrideStatuses) {
    
    
    
    
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


  public List3 statuses(List<Status> statuses) {
    
    
    
    
    this.statuses = statuses;
    return this;
  }

  public List3 addStatusesItem(Status statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * 
   * @return statuses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Status> getStatuses() {
    return statuses;
  }


  public void setStatuses(List<Status> statuses) {
    
    
    
    this.statuses = statuses;
  }


  public List3 permissionLevel(String permissionLevel) {
    
    
    
    
    this.permissionLevel = permissionLevel;
    return this;
  }

   /**
   * Get permissionLevel
   * @return permissionLevel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "read", required = true, value = "")

  public String getPermissionLevel() {
    return permissionLevel;
  }


  public void setPermissionLevel(String permissionLevel) {
    
    
    
    this.permissionLevel = permissionLevel;
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
   * @return the List3 instance itself
   */
  public List3 putAdditionalProperty(String key, Object value) {
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
    List3 list3 = (List3) o;
    return Objects.equals(this.id, list3.id) &&
        Objects.equals(this.name, list3.name) &&
        Objects.equals(this.orderindex, list3.orderindex) &&
        Objects.equals(this.status, list3.status) &&
        Objects.equals(this.priority, list3.priority) &&
        Objects.equals(this.assignee, list3.assignee) &&
        Objects.equals(this.taskCount, list3.taskCount) &&
        Objects.equals(this.dueDate, list3.dueDate) &&
        Objects.equals(this.startDate, list3.startDate) &&
        Objects.equals(this.archived, list3.archived) &&
        Objects.equals(this.overrideStatuses, list3.overrideStatuses) &&
        Objects.equals(this.statuses, list3.statuses) &&
        Objects.equals(this.permissionLevel, list3.permissionLevel)&&
        Objects.equals(this.additionalProperties, list3.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orderindex, status, priority, assignee, taskCount, dueDate, startDate, archived, overrideStatuses, statuses, permissionLevel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class List3 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderindex: ").append(toIndentedString(orderindex)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    overrideStatuses: ").append(toIndentedString(overrideStatuses)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    permissionLevel: ").append(toIndentedString(permissionLevel)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("priority");
    openapiFields.add("assignee");
    openapiFields.add("task_count");
    openapiFields.add("due_date");
    openapiFields.add("start_date");
    openapiFields.add("archived");
    openapiFields.add("override_statuses");
    openapiFields.add("statuses");
    openapiFields.add("permission_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("orderindex");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("assignee");
    openapiRequiredFields.add("task_count");
    openapiRequiredFields.add("due_date");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("archived");
    openapiRequiredFields.add("override_statuses");
    openapiRequiredFields.add("statuses");
    openapiRequiredFields.add("permission_level");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to List3
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!List3.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in List3 is not found in the empty JSON string", List3.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : List3.openapiRequiredFields) {
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
      if (!jsonObj.get("task_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_count").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("statuses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
      }

      JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
      // validate the required field `statuses` (array)
      for (int i = 0; i < jsonArraystatuses.size(); i++) {
        Status.validateJsonObject(jsonArraystatuses.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("permission_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission_level").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!List3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'List3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<List3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(List3.class));

       return (TypeAdapter<T>) new TypeAdapter<List3>() {
           @Override
           public void write(JsonWriter out, List3 value) throws IOException {
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
           public List3 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             List3 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of List3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of List3
  * @throws IOException if the JSON string is invalid with respect to List3
  */
  public static List3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, List3.class);
  }

 /**
  * Convert an instance of List3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

