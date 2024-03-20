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
import com.konfigthis.client.model.Tags6;
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
 * Createatimeentryrequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Createatimeentryrequest {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tags6> tags = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_STOP = "stop";
  @SerializedName(SERIALIZED_NAME_STOP)
  private Integer stop;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public static final String SERIALIZED_NAME_BILLABLE = "billable";
  @SerializedName(SERIALIZED_NAME_BILLABLE)
  private Boolean billable;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private Integer assignee;

  public static final String SERIALIZED_NAME_TID = "tid";
  @SerializedName(SERIALIZED_NAME_TID)
  private String tid;

  public Createatimeentryrequest() {
  }

  public Createatimeentryrequest tags(List<Tags6> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public Createatimeentryrequest addTagsItem(Tags6 tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Users on the Business Plan and above can include a time tracking label.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Users on the Business Plan and above can include a time tracking label.")

  public List<Tags6> getTags() {
    return tags;
  }


  public void setTags(List<Tags6> tags) {
    
    
    
    this.tags = tags;
  }


  public Createatimeentryrequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "from api", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public Createatimeentryrequest start(Integer start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1595282645000", required = true, value = "")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    
    
    
    this.start = start;
  }


  public Createatimeentryrequest stop(Integer stop) {
    
    
    
    
    this.stop = stop;
    return this;
  }

   /**
   * The &#x60;duration&#x60; parameter can be used instead of the &#x60;stop&#x60; parameter. 
   * @return stop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `duration` parameter can be used instead of the `stop` parameter. ")

  public Integer getStop() {
    return stop;
  }


  public void setStop(Integer stop) {
    
    
    
    this.stop = stop;
  }


  public Createatimeentryrequest end(Integer end) {
    
    
    
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1595282660000", value = "")

  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    
    
    
    this.end = end;
  }


  public Createatimeentryrequest billable(Boolean billable) {
    
    
    
    
    this.billable = billable;
    return this;
  }

   /**
   * Get billable
   * @return billable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getBillable() {
    return billable;
  }


  public void setBillable(Boolean billable) {
    
    
    
    this.billable = billable;
  }


  public Createatimeentryrequest duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * When there are values for both &#x60;start&#x60; and &#x60;end&#x60;, &#x60;duration&#x60; is ignored. The &#x60;stop&#x60; parameter can be used instead of the &#x60;duration&#x60; parameter.
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "50000", required = true, value = "When there are values for both `start` and `end`, `duration` is ignored. The `stop` parameter can be used instead of the `duration` parameter.")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public Createatimeentryrequest assignee(Integer assignee) {
    
    
    
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Workspace owners and admins can include any user id. Workspace members can only include their own user id.
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Workspace owners and admins can include any user id. Workspace members can only include their own user id.")

  public Integer getAssignee() {
    return assignee;
  }


  public void setAssignee(Integer assignee) {
    
    
    
    this.assignee = assignee;
  }


  public Createatimeentryrequest tid(String tid) {
    
    
    
    
    this.tid = tid;
    return this;
  }

   /**
   * Get tid
   * @return tid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "task_id", value = "")

  public String getTid() {
    return tid;
  }


  public void setTid(String tid) {
    
    
    
    this.tid = tid;
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
   * @return the Createatimeentryrequest instance itself
   */
  public Createatimeentryrequest putAdditionalProperty(String key, Object value) {
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
    Createatimeentryrequest createatimeentryrequest = (Createatimeentryrequest) o;
    return Objects.equals(this.tags, createatimeentryrequest.tags) &&
        Objects.equals(this.description, createatimeentryrequest.description) &&
        Objects.equals(this.start, createatimeentryrequest.start) &&
        Objects.equals(this.stop, createatimeentryrequest.stop) &&
        Objects.equals(this.end, createatimeentryrequest.end) &&
        Objects.equals(this.billable, createatimeentryrequest.billable) &&
        Objects.equals(this.duration, createatimeentryrequest.duration) &&
        Objects.equals(this.assignee, createatimeentryrequest.assignee) &&
        Objects.equals(this.tid, createatimeentryrequest.tid)&&
        Objects.equals(this.additionalProperties, createatimeentryrequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, description, start, stop, end, billable, duration, assignee, tid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Createatimeentryrequest {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    billable: ").append(toIndentedString(billable)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("stop");
    openapiFields.add("end");
    openapiFields.add("billable");
    openapiFields.add("duration");
    openapiFields.add("assignee");
    openapiFields.add("tid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("duration");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Createatimeentryrequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Createatimeentryrequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Createatimeentryrequest is not found in the empty JSON string", Createatimeentryrequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Createatimeentryrequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            Tags6.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("tid") != null && !jsonObj.get("tid").isJsonNull()) && !jsonObj.get("tid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Createatimeentryrequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Createatimeentryrequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Createatimeentryrequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Createatimeentryrequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Createatimeentryrequest>() {
           @Override
           public void write(JsonWriter out, Createatimeentryrequest value) throws IOException {
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
           public Createatimeentryrequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Createatimeentryrequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Createatimeentryrequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Createatimeentryrequest
  * @throws IOException if the JSON string is invalid with respect to Createatimeentryrequest
  */
  public static Createatimeentryrequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Createatimeentryrequest.class);
  }

 /**
  * Convert an instance of Createatimeentryrequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

