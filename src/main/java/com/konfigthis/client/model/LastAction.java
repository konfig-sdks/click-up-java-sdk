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
 * LastAction
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LastAction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY_RESULT_ID = "key_result_id";
  @SerializedName(SERIALIZED_NAME_KEY_RESULT_ID)
  private String keyResultId;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private String dateModified;

  public static final String SERIALIZED_NAME_STEPS_TAKEN = "steps_taken";
  @SerializedName(SERIALIZED_NAME_STEPS_TAKEN)
  private Object stepsTaken = null;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_STEPS_BEFORE = "steps_before";
  @SerializedName(SERIALIZED_NAME_STEPS_BEFORE)
  private Object stepsBefore = null;

  public static final String SERIALIZED_NAME_STEPS_CURRENT = "steps_current";
  @SerializedName(SERIALIZED_NAME_STEPS_CURRENT)
  private Object stepsCurrent = null;

  public LastAction() {
  }

  public LastAction id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "d3183d0f-5cbd-4158-b015-71465f1df269X", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public LastAction keyResultId(String keyResultId) {
    
    
    
    
    this.keyResultId = keyResultId;
    return this;
  }

   /**
   * Get keyResultId
   * @return keyResultId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "947d46ed-8480-49bc-8c57-e569747efe93", required = true, value = "")

  public String getKeyResultId() {
    return keyResultId;
  }


  public void setKeyResultId(String keyResultId) {
    
    
    
    this.keyResultId = keyResultId;
  }


  public LastAction userid(Integer userid) {
    
    
    
    
    this.userid = userid;
    return this;
  }

   /**
   * Get userid
   * @return userid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "183", required = true, value = "")

  public Integer getUserid() {
    return userid;
  }


  public void setUserid(Integer userid) {
    
    
    
    this.userid = userid;
  }


  public LastAction dateModified(String dateModified) {
    
    
    
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Get dateModified
   * @return dateModified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1568062902048", required = true, value = "")

  public String getDateModified() {
    return dateModified;
  }


  public void setDateModified(String dateModified) {
    
    
    
    this.dateModified = dateModified;
  }


  public LastAction stepsTaken(Object stepsTaken) {
    
    
    
    
    this.stepsTaken = stepsTaken;
    return this;
  }

   /**
   * Get stepsTaken
   * @return stepsTaken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getStepsTaken() {
    return stepsTaken;
  }


  public void setStepsTaken(Object stepsTaken) {
    
    
    
    this.stepsTaken = stepsTaken;
  }


  public LastAction note(String note) {
    
    
    
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Created Key Result", required = true, value = "")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    
    
    
    this.note = note;
  }


  public LastAction stepsBefore(Object stepsBefore) {
    
    
    
    
    this.stepsBefore = stepsBefore;
    return this;
  }

   /**
   * Get stepsBefore
   * @return stepsBefore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getStepsBefore() {
    return stepsBefore;
  }


  public void setStepsBefore(Object stepsBefore) {
    
    
    
    this.stepsBefore = stepsBefore;
  }


  public LastAction stepsCurrent(Object stepsCurrent) {
    
    
    
    
    this.stepsCurrent = stepsCurrent;
    return this;
  }

   /**
   * Get stepsCurrent
   * @return stepsCurrent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getStepsCurrent() {
    return stepsCurrent;
  }


  public void setStepsCurrent(Object stepsCurrent) {
    
    
    
    this.stepsCurrent = stepsCurrent;
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
   * @return the LastAction instance itself
   */
  public LastAction putAdditionalProperty(String key, Object value) {
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
    LastAction lastAction = (LastAction) o;
    return Objects.equals(this.id, lastAction.id) &&
        Objects.equals(this.keyResultId, lastAction.keyResultId) &&
        Objects.equals(this.userid, lastAction.userid) &&
        Objects.equals(this.dateModified, lastAction.dateModified) &&
        Objects.equals(this.stepsTaken, lastAction.stepsTaken) &&
        Objects.equals(this.note, lastAction.note) &&
        Objects.equals(this.stepsBefore, lastAction.stepsBefore) &&
        Objects.equals(this.stepsCurrent, lastAction.stepsCurrent)&&
        Objects.equals(this.additionalProperties, lastAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keyResultId, userid, dateModified, stepsTaken, note, stepsBefore, stepsCurrent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastAction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyResultId: ").append(toIndentedString(keyResultId)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    stepsTaken: ").append(toIndentedString(stepsTaken)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    stepsBefore: ").append(toIndentedString(stepsBefore)).append("\n");
    sb.append("    stepsCurrent: ").append(toIndentedString(stepsCurrent)).append("\n");
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
    openapiFields.add("key_result_id");
    openapiFields.add("userid");
    openapiFields.add("date_modified");
    openapiFields.add("steps_taken");
    openapiFields.add("note");
    openapiFields.add("steps_before");
    openapiFields.add("steps_current");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("key_result_id");
    openapiRequiredFields.add("userid");
    openapiRequiredFields.add("date_modified");
    openapiRequiredFields.add("steps_taken");
    openapiRequiredFields.add("note");
    openapiRequiredFields.add("steps_before");
    openapiRequiredFields.add("steps_current");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LastAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LastAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LastAction is not found in the empty JSON string", LastAction.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LastAction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("key_result_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_result_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_result_id").toString()));
      }
      if (!jsonObj.get("date_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_modified").toString()));
      }
      if (!jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LastAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LastAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LastAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LastAction.class));

       return (TypeAdapter<T>) new TypeAdapter<LastAction>() {
           @Override
           public void write(JsonWriter out, LastAction value) throws IOException {
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
           public LastAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LastAction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LastAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LastAction
  * @throws IOException if the JSON string is invalid with respect to LastAction
  */
  public static LastAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LastAction.class);
  }

 /**
  * Convert an instance of LastAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

