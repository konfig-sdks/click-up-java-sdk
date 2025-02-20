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
import com.konfigthis.client.model.Creator;
import com.konfigthis.client.model.CustomFields8;
import com.konfigthis.client.model.Folder;
import com.konfigthis.client.model.Space;
import com.konfigthis.client.model.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CreateTaskresponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateTaskresponse {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CUSTOM_ID = "custom_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ID)
  private Object customId = null;

  public static final String SERIALIZED_NAME_CUSTOM_ITEM_ID = "custom_item_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ITEM_ID)
  private Object customItemId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEXT_CONTENT = "text_content";
  @SerializedName(SERIALIZED_NAME_TEXT_CONTENT)
  private String textContent;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public static final String SERIALIZED_NAME_ORDERINDEX = "orderindex";
  @SerializedName(SERIALIZED_NAME_ORDERINDEX)
  private String orderindex;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private String dateUpdated;

  public static final String SERIALIZED_NAME_DATE_CLOSED = "date_closed";
  @SerializedName(SERIALIZED_NAME_DATE_CLOSED)
  private Object dateClosed = null;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private Creator creator;

  public static final String SERIALIZED_NAME_ASSIGNEES = "assignees";
  @SerializedName(SERIALIZED_NAME_ASSIGNEES)
  private List<String> assignees = null;

  public static final String SERIALIZED_NAME_CHECKLISTS = "checklists";
  @SerializedName(SERIALIZED_NAME_CHECKLISTS)
  private List<String> checklists = null;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private Object parent = null;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Object priority = null;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private Object dueDate = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Object startDate = null;

  public static final String SERIALIZED_NAME_TIME_ESTIMATE = "time_estimate";
  @SerializedName(SERIALIZED_NAME_TIME_ESTIMATE)
  private Object timeEstimate = null;

  public static final String SERIALIZED_NAME_TIME_SPENT = "time_spent";
  @SerializedName(SERIALIZED_NAME_TIME_SPENT)
  private Object timeSpent = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<CustomFields8> customFields = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List list;

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private Folder folder;

  public static final String SERIALIZED_NAME_SPACE = "space";
  @SerializedName(SERIALIZED_NAME_SPACE)
  private Space space;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public CreateTaskresponse() {
  }

  public CreateTaskresponse tags(List<String> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public CreateTaskresponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    
    
    
    this.tags = tags;
  }


  public CreateTaskresponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CreateTaskresponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public CreateTaskresponse customId(Object customId) {
    
    
    
    
    this.customId = customId;
    return this;
  }

   /**
   * Get customId
   * @return customId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCustomId() {
    return customId;
  }


  public void setCustomId(Object customId) {
    
    
    
    this.customId = customId;
  }


  public CreateTaskresponse customItemId(Object customItemId) {
    
    
    
    
    this.customItemId = customItemId;
    return this;
  }

   /**
   * A &#x60;null&#x60; value means this item is a task. A value of &#x60;1&#x60; is a Milestone. Any other number is a custom task type.
   * @return customItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A `null` value means this item is a task. A value of `1` is a Milestone. Any other number is a custom task type.")

  public Object getCustomItemId() {
    return customItemId;
  }


  public void setCustomItemId(Object customItemId) {
    
    
    
    this.customItemId = customItemId;
  }


  public CreateTaskresponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CreateTaskresponse textContent(String textContent) {
    
    
    
    
    this.textContent = textContent;
    return this;
  }

   /**
   * Get textContent
   * @return textContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTextContent() {
    return textContent;
  }


  public void setTextContent(String textContent) {
    
    
    
    this.textContent = textContent;
  }


  public CreateTaskresponse status(Status status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Status getStatus() {
    return status;
  }


  public void setStatus(Status status) {
    
    
    
    this.status = status;
  }


  public CreateTaskresponse orderindex(String orderindex) {
    
    
    
    
    this.orderindex = orderindex;
    return this;
  }

   /**
   * Get orderindex
   * @return orderindex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderindex() {
    return orderindex;
  }


  public void setOrderindex(String orderindex) {
    
    
    
    this.orderindex = orderindex;
  }


  public CreateTaskresponse dateCreated(String dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public CreateTaskresponse dateUpdated(String dateUpdated) {
    
    
    
    
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateUpdated() {
    return dateUpdated;
  }


  public void setDateUpdated(String dateUpdated) {
    
    
    
    this.dateUpdated = dateUpdated;
  }


  public CreateTaskresponse dateClosed(Object dateClosed) {
    
    
    
    
    this.dateClosed = dateClosed;
    return this;
  }

   /**
   * Get dateClosed
   * @return dateClosed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDateClosed() {
    return dateClosed;
  }


  public void setDateClosed(Object dateClosed) {
    
    
    
    this.dateClosed = dateClosed;
  }


  public CreateTaskresponse creator(Creator creator) {
    
    
    
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Creator getCreator() {
    return creator;
  }


  public void setCreator(Creator creator) {
    
    
    
    this.creator = creator;
  }


  public CreateTaskresponse assignees(List<String> assignees) {
    
    
    
    
    this.assignees = assignees;
    return this;
  }

  public CreateTaskresponse addAssigneesItem(String assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * 
   * @return assignees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAssignees() {
    return assignees;
  }


  public void setAssignees(List<String> assignees) {
    
    
    
    this.assignees = assignees;
  }


  public CreateTaskresponse checklists(List<String> checklists) {
    
    
    
    
    this.checklists = checklists;
    return this;
  }

  public CreateTaskresponse addChecklistsItem(String checklistsItem) {
    if (this.checklists == null) {
      this.checklists = new ArrayList<>();
    }
    this.checklists.add(checklistsItem);
    return this;
  }

   /**
   * 
   * @return checklists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChecklists() {
    return checklists;
  }


  public void setChecklists(List<String> checklists) {
    
    
    
    this.checklists = checklists;
  }


  public CreateTaskresponse parent(Object parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getParent() {
    return parent;
  }


  public void setParent(Object parent) {
    
    
    
    this.parent = parent;
  }


  public CreateTaskresponse priority(Object priority) {
    
    
    
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPriority() {
    return priority;
  }


  public void setPriority(Object priority) {
    
    
    
    this.priority = priority;
  }


  public CreateTaskresponse dueDate(Object dueDate) {
    
    
    
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDueDate() {
    return dueDate;
  }


  public void setDueDate(Object dueDate) {
    
    
    
    this.dueDate = dueDate;
  }


  public CreateTaskresponse startDate(Object startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStartDate() {
    return startDate;
  }


  public void setStartDate(Object startDate) {
    
    
    
    this.startDate = startDate;
  }


  public CreateTaskresponse timeEstimate(Object timeEstimate) {
    
    
    
    
    this.timeEstimate = timeEstimate;
    return this;
  }

   /**
   * Get timeEstimate
   * @return timeEstimate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTimeEstimate() {
    return timeEstimate;
  }


  public void setTimeEstimate(Object timeEstimate) {
    
    
    
    this.timeEstimate = timeEstimate;
  }


  public CreateTaskresponse timeSpent(Object timeSpent) {
    
    
    
    
    this.timeSpent = timeSpent;
    return this;
  }

   /**
   * Get timeSpent
   * @return timeSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTimeSpent() {
    return timeSpent;
  }


  public void setTimeSpent(Object timeSpent) {
    
    
    
    this.timeSpent = timeSpent;
  }


  public CreateTaskresponse customFields(List<CustomFields8> customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

  public CreateTaskresponse addCustomFieldsItem(CustomFields8 customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * 
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomFields8> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(List<CustomFields8> customFields) {
    
    
    
    this.customFields = customFields;
  }


  public CreateTaskresponse list(List list) {
    
    
    
    
    this.list = list;
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List getList() {
    return list;
  }


  public void setList(List list) {
    
    
    
    this.list = list;
  }


  public CreateTaskresponse folder(Folder folder) {
    
    
    
    
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Folder getFolder() {
    return folder;
  }


  public void setFolder(Folder folder) {
    
    
    
    this.folder = folder;
  }


  public CreateTaskresponse space(Space space) {
    
    
    
    
    this.space = space;
    return this;
  }

   /**
   * Get space
   * @return space
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Space getSpace() {
    return space;
  }


  public void setSpace(Space space) {
    
    
    
    this.space = space;
  }


  public CreateTaskresponse url(String url) {
    
    
    
    
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
   * @return the CreateTaskresponse instance itself
   */
  public CreateTaskresponse putAdditionalProperty(String key, Object value) {
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
    CreateTaskresponse createTaskresponse = (CreateTaskresponse) o;
    return Objects.equals(this.tags, createTaskresponse.tags) &&
        Objects.equals(this.description, createTaskresponse.description) &&
        Objects.equals(this.id, createTaskresponse.id) &&
        Objects.equals(this.customId, createTaskresponse.customId) &&
        Objects.equals(this.customItemId, createTaskresponse.customItemId) &&
        Objects.equals(this.name, createTaskresponse.name) &&
        Objects.equals(this.textContent, createTaskresponse.textContent) &&
        Objects.equals(this.status, createTaskresponse.status) &&
        Objects.equals(this.orderindex, createTaskresponse.orderindex) &&
        Objects.equals(this.dateCreated, createTaskresponse.dateCreated) &&
        Objects.equals(this.dateUpdated, createTaskresponse.dateUpdated) &&
        Objects.equals(this.dateClosed, createTaskresponse.dateClosed) &&
        Objects.equals(this.creator, createTaskresponse.creator) &&
        Objects.equals(this.assignees, createTaskresponse.assignees) &&
        Objects.equals(this.checklists, createTaskresponse.checklists) &&
        Objects.equals(this.parent, createTaskresponse.parent) &&
        Objects.equals(this.priority, createTaskresponse.priority) &&
        Objects.equals(this.dueDate, createTaskresponse.dueDate) &&
        Objects.equals(this.startDate, createTaskresponse.startDate) &&
        Objects.equals(this.timeEstimate, createTaskresponse.timeEstimate) &&
        Objects.equals(this.timeSpent, createTaskresponse.timeSpent) &&
        Objects.equals(this.customFields, createTaskresponse.customFields) &&
        Objects.equals(this.list, createTaskresponse.list) &&
        Objects.equals(this.folder, createTaskresponse.folder) &&
        Objects.equals(this.space, createTaskresponse.space) &&
        Objects.equals(this.url, createTaskresponse.url)&&
        Objects.equals(this.additionalProperties, createTaskresponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, description, id, customId, customItemId, name, textContent, status, orderindex, dateCreated, dateUpdated, dateClosed, creator, assignees, checklists, parent, priority, dueDate, startDate, timeEstimate, timeSpent, customFields, list, folder, space, url, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTaskresponse {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    customItemId: ").append(toIndentedString(customItemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderindex: ").append(toIndentedString(orderindex)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    dateClosed: ").append(toIndentedString(dateClosed)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    checklists: ").append(toIndentedString(checklists)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    timeEstimate: ").append(toIndentedString(timeEstimate)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("custom_id");
    openapiFields.add("custom_item_id");
    openapiFields.add("name");
    openapiFields.add("text_content");
    openapiFields.add("status");
    openapiFields.add("orderindex");
    openapiFields.add("date_created");
    openapiFields.add("date_updated");
    openapiFields.add("date_closed");
    openapiFields.add("creator");
    openapiFields.add("assignees");
    openapiFields.add("checklists");
    openapiFields.add("parent");
    openapiFields.add("priority");
    openapiFields.add("due_date");
    openapiFields.add("start_date");
    openapiFields.add("time_estimate");
    openapiFields.add("time_spent");
    openapiFields.add("custom_fields");
    openapiFields.add("list");
    openapiFields.add("folder");
    openapiFields.add("space");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateTaskresponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateTaskresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTaskresponse is not found in the empty JSON string", CreateTaskresponse.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("text_content") != null && !jsonObj.get("text_content").isJsonNull()) && !jsonObj.get("text_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text_content").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Status.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      if ((jsonObj.get("orderindex") != null && !jsonObj.get("orderindex").isJsonNull()) && !jsonObj.get("orderindex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderindex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderindex").toString()));
      }
      if ((jsonObj.get("date_created") != null && !jsonObj.get("date_created").isJsonNull()) && !jsonObj.get("date_created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_created").toString()));
      }
      if ((jsonObj.get("date_updated") != null && !jsonObj.get("date_updated").isJsonNull()) && !jsonObj.get("date_updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_updated").toString()));
      }
      // validate the optional field `creator`
      if (jsonObj.get("creator") != null && !jsonObj.get("creator").isJsonNull()) {
        Creator.validateJsonObject(jsonObj.getAsJsonObject("creator"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("assignees") != null && !jsonObj.get("assignees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignees` to be an array in the JSON string but got `%s`", jsonObj.get("assignees").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("checklists") != null && !jsonObj.get("checklists").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `checklists` to be an array in the JSON string but got `%s`", jsonObj.get("checklists").toString()));
      }
      if (jsonObj.get("custom_fields") != null && !jsonObj.get("custom_fields").isJsonNull()) {
        JsonArray jsonArraycustomFields = jsonObj.getAsJsonArray("custom_fields");
        if (jsonArraycustomFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_fields` to be an array in the JSON string but got `%s`", jsonObj.get("custom_fields").toString()));
          }

          // validate the optional field `custom_fields` (array)
          for (int i = 0; i < jsonArraycustomFields.size(); i++) {
            CustomFields8.validateJsonObject(jsonArraycustomFields.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `list`
      if (jsonObj.get("list") != null && !jsonObj.get("list").isJsonNull()) {
        List.validateJsonObject(jsonObj.getAsJsonObject("list"));
      }
      // validate the optional field `folder`
      if (jsonObj.get("folder") != null && !jsonObj.get("folder").isJsonNull()) {
        Folder.validateJsonObject(jsonObj.getAsJsonObject("folder"));
      }
      // validate the optional field `space`
      if (jsonObj.get("space") != null && !jsonObj.get("space").isJsonNull()) {
        Space.validateJsonObject(jsonObj.getAsJsonObject("space"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTaskresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTaskresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTaskresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTaskresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTaskresponse>() {
           @Override
           public void write(JsonWriter out, CreateTaskresponse value) throws IOException {
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
           public CreateTaskresponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateTaskresponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateTaskresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTaskresponse
  * @throws IOException if the JSON string is invalid with respect to CreateTaskresponse
  */
  public static CreateTaskresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTaskresponse.class);
  }

 /**
  * Convert an instance of CreateTaskresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

