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
import com.konfigthis.client.model.Folder3;
import com.konfigthis.client.model.Priority1;
import com.konfigthis.client.model.Space2;
import com.konfigthis.client.model.Status;
import com.konfigthis.client.model.Status5;
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
 * UpdateListresponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateListresponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDERINDEX = "orderindex";
  @SerializedName(SERIALIZED_NAME_ORDERINDEX)
  private Integer orderindex;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status5 status;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Priority1 priority;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private Object assignee = null;

  public static final String SERIALIZED_NAME_TASK_COUNT = "task_count";
  @SerializedName(SERIALIZED_NAME_TASK_COUNT)
  private Object taskCount = null;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private String dueDate;

  public static final String SERIALIZED_NAME_DUE_DATE_TIME = "due_date_time";
  @SerializedName(SERIALIZED_NAME_DUE_DATE_TIME)
  private Boolean dueDateTime;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Object startDate = null;

  public static final String SERIALIZED_NAME_START_DATE_TIME = "start_date_time";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private Object startDateTime = null;

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private Folder3 folder;

  public static final String SERIALIZED_NAME_SPACE = "space";
  @SerializedName(SERIALIZED_NAME_SPACE)
  private Space2 space;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<Status> statuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_INBOUND_ADDRESS = "inbound_address";
  @SerializedName(SERIALIZED_NAME_INBOUND_ADDRESS)
  private String inboundAddress;

  public UpdateListresponse() {
  }

  public UpdateListresponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "124X", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public UpdateListresponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Updated List Name", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UpdateListresponse orderindex(Integer orderindex) {
    
    
    
    
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


  public UpdateListresponse content(String content) {
    
    
    
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Updated List Content", required = true, value = "")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    
    
    
    this.content = content;
  }


  public UpdateListresponse status(Status5 status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Status5 getStatus() {
    return status;
  }


  public void setStatus(Status5 status) {
    
    
    
    this.status = status;
  }


  public UpdateListresponse priority(Priority1 priority) {
    
    
    
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Priority1 getPriority() {
    return priority;
  }


  public void setPriority(Priority1 priority) {
    
    
    
    this.priority = priority;
  }


  public UpdateListresponse assignee(Object assignee) {
    
    
    
    
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


  public UpdateListresponse taskCount(Object taskCount) {
    
    
    
    
    this.taskCount = taskCount;
    return this;
  }

   /**
   * Get taskCount
   * @return taskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getTaskCount() {
    return taskCount;
  }


  public void setTaskCount(Object taskCount) {
    
    
    
    this.taskCount = taskCount;
  }


  public UpdateListresponse dueDate(String dueDate) {
    
    
    
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1567780450202", required = true, value = "")

  public String getDueDate() {
    return dueDate;
  }


  public void setDueDate(String dueDate) {
    
    
    
    this.dueDate = dueDate;
  }


  public UpdateListresponse dueDateTime(Boolean dueDateTime) {
    
    
    
    
    this.dueDateTime = dueDateTime;
    return this;
  }

   /**
   * Get dueDateTime
   * @return dueDateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getDueDateTime() {
    return dueDateTime;
  }


  public void setDueDateTime(Boolean dueDateTime) {
    
    
    
    this.dueDateTime = dueDateTime;
  }


  public UpdateListresponse startDate(Object startDate) {
    
    
    
    
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


  public UpdateListresponse startDateTime(Object startDateTime) {
    
    
    
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getStartDateTime() {
    return startDateTime;
  }


  public void setStartDateTime(Object startDateTime) {
    
    
    
    this.startDateTime = startDateTime;
  }


  public UpdateListresponse folder(Folder3 folder) {
    
    
    
    
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Folder3 getFolder() {
    return folder;
  }


  public void setFolder(Folder3 folder) {
    
    
    
    this.folder = folder;
  }


  public UpdateListresponse space(Space2 space) {
    
    
    
    
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


  public UpdateListresponse statuses(List<Status> statuses) {
    
    
    
    
    this.statuses = statuses;
    return this;
  }

  public UpdateListresponse addStatusesItem(Status statusesItem) {
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


  public UpdateListresponse inboundAddress(String inboundAddress) {
    
    
    
    
    this.inboundAddress = inboundAddress;
    return this;
  }

   /**
   * Get inboundAddress
   * @return inboundAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "add.task.1389.ac725f.31518a6a-05bb-4997-92a6-1dcfe2f527ca@tasks.clickup.com", required = true, value = "")

  public String getInboundAddress() {
    return inboundAddress;
  }


  public void setInboundAddress(String inboundAddress) {
    
    
    
    this.inboundAddress = inboundAddress;
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
   * @return the UpdateListresponse instance itself
   */
  public UpdateListresponse putAdditionalProperty(String key, Object value) {
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
    UpdateListresponse updateListresponse = (UpdateListresponse) o;
    return Objects.equals(this.id, updateListresponse.id) &&
        Objects.equals(this.name, updateListresponse.name) &&
        Objects.equals(this.orderindex, updateListresponse.orderindex) &&
        Objects.equals(this.content, updateListresponse.content) &&
        Objects.equals(this.status, updateListresponse.status) &&
        Objects.equals(this.priority, updateListresponse.priority) &&
        Objects.equals(this.assignee, updateListresponse.assignee) &&
        Objects.equals(this.taskCount, updateListresponse.taskCount) &&
        Objects.equals(this.dueDate, updateListresponse.dueDate) &&
        Objects.equals(this.dueDateTime, updateListresponse.dueDateTime) &&
        Objects.equals(this.startDate, updateListresponse.startDate) &&
        Objects.equals(this.startDateTime, updateListresponse.startDateTime) &&
        Objects.equals(this.folder, updateListresponse.folder) &&
        Objects.equals(this.space, updateListresponse.space) &&
        Objects.equals(this.statuses, updateListresponse.statuses) &&
        Objects.equals(this.inboundAddress, updateListresponse.inboundAddress)&&
        Objects.equals(this.additionalProperties, updateListresponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orderindex, content, status, priority, assignee, taskCount, dueDate, dueDateTime, startDate, startDateTime, folder, space, statuses, inboundAddress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateListresponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderindex: ").append(toIndentedString(orderindex)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueDateTime: ").append(toIndentedString(dueDateTime)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    inboundAddress: ").append(toIndentedString(inboundAddress)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("status");
    openapiFields.add("priority");
    openapiFields.add("assignee");
    openapiFields.add("task_count");
    openapiFields.add("due_date");
    openapiFields.add("due_date_time");
    openapiFields.add("start_date");
    openapiFields.add("start_date_time");
    openapiFields.add("folder");
    openapiFields.add("space");
    openapiFields.add("statuses");
    openapiFields.add("inbound_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("orderindex");
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("assignee");
    openapiRequiredFields.add("task_count");
    openapiRequiredFields.add("due_date");
    openapiRequiredFields.add("due_date_time");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("start_date_time");
    openapiRequiredFields.add("folder");
    openapiRequiredFields.add("space");
    openapiRequiredFields.add("statuses");
    openapiRequiredFields.add("inbound_address");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateListresponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateListresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateListresponse is not found in the empty JSON string", UpdateListresponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateListresponse.openapiRequiredFields) {
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
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      // validate the required field `status`
      Status5.validateJsonObject(jsonObj.getAsJsonObject("status"));
      // validate the required field `priority`
      Priority1.validateJsonObject(jsonObj.getAsJsonObject("priority"));
      if (!jsonObj.get("due_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `due_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("due_date").toString()));
      }
      // validate the required field `folder`
      Folder3.validateJsonObject(jsonObj.getAsJsonObject("folder"));
      // validate the required field `space`
      Space2.validateJsonObject(jsonObj.getAsJsonObject("space"));
      // ensure the json data is an array
      if (!jsonObj.get("statuses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
      }

      JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
      // validate the required field `statuses` (array)
      for (int i = 0; i < jsonArraystatuses.size(); i++) {
        Status.validateJsonObject(jsonArraystatuses.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("inbound_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inbound_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inbound_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateListresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateListresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateListresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateListresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateListresponse>() {
           @Override
           public void write(JsonWriter out, UpdateListresponse value) throws IOException {
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
           public UpdateListresponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateListresponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateListresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateListresponse
  * @throws IOException if the JSON string is invalid with respect to UpdateListresponse
  */
  public static UpdateListresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateListresponse.class);
  }

 /**
  * Convert an instance of UpdateListresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

