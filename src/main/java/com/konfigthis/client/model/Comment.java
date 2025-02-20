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
import com.konfigthis.client.model.AssignedBy;
import com.konfigthis.client.model.Assignee;
import com.konfigthis.client.model.Comment1;
import com.konfigthis.client.model.User2;
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
 * Comment
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Comment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private List<Comment1> comment = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT_TEXT = "comment_text";
  @SerializedName(SERIALIZED_NAME_COMMENT_TEXT)
  private String commentText;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User2 user;

  public static final String SERIALIZED_NAME_RESOLVED = "resolved";
  @SerializedName(SERIALIZED_NAME_RESOLVED)
  private Boolean resolved;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private Assignee assignee;

  public static final String SERIALIZED_NAME_ASSIGNED_BY = "assigned_by";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_BY)
  private AssignedBy assignedBy;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private List<String> reactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public Comment() {
  }

  public Comment id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "458X", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Comment comment(List<Comment1> comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

  public Comment addCommentItem(Comment1 commentItem) {
    this.comment.add(commentItem);
    return this;
  }

   /**
   * 
   * @return comment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Comment1> getComment() {
    return comment;
  }


  public void setComment(List<Comment1> comment) {
    
    
    
    this.comment = comment;
  }


  public Comment commentText(String commentText) {
    
    
    
    
    this.commentText = commentText;
    return this;
  }

   /**
   * Get commentText
   * @return commentText
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Task comment content", required = true, value = "")

  public String getCommentText() {
    return commentText;
  }


  public void setCommentText(String commentText) {
    
    
    
    this.commentText = commentText;
  }


  public Comment user(User2 user) {
    
    
    
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public User2 getUser() {
    return user;
  }


  public void setUser(User2 user) {
    
    
    
    this.user = user;
  }


  public Comment resolved(Boolean resolved) {
    
    
    
    
    this.resolved = resolved;
    return this;
  }

   /**
   * Get resolved
   * @return resolved
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getResolved() {
    return resolved;
  }


  public void setResolved(Boolean resolved) {
    
    
    
    this.resolved = resolved;
  }


  public Comment assignee(Assignee assignee) {
    
    
    
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Assignee getAssignee() {
    return assignee;
  }


  public void setAssignee(Assignee assignee) {
    
    
    
    this.assignee = assignee;
  }


  public Comment assignedBy(AssignedBy assignedBy) {
    
    
    
    
    this.assignedBy = assignedBy;
    return this;
  }

   /**
   * Get assignedBy
   * @return assignedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AssignedBy getAssignedBy() {
    return assignedBy;
  }


  public void setAssignedBy(AssignedBy assignedBy) {
    
    
    
    this.assignedBy = assignedBy;
  }


  public Comment reactions(List<String> reactions) {
    
    
    
    
    this.reactions = reactions;
    return this;
  }

  public Comment addReactionsItem(String reactionsItem) {
    this.reactions.add(reactionsItem);
    return this;
  }

   /**
   * 
   * @return reactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getReactions() {
    return reactions;
  }


  public void setReactions(List<String> reactions) {
    
    
    
    this.reactions = reactions;
  }


  public Comment date(String date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1568036964079", required = true, value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    
    
    
    this.date = date;
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
   * @return the Comment instance itself
   */
  public Comment putAdditionalProperty(String key, Object value) {
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
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.comment, comment.comment) &&
        Objects.equals(this.commentText, comment.commentText) &&
        Objects.equals(this.user, comment.user) &&
        Objects.equals(this.resolved, comment.resolved) &&
        Objects.equals(this.assignee, comment.assignee) &&
        Objects.equals(this.assignedBy, comment.assignedBy) &&
        Objects.equals(this.reactions, comment.reactions) &&
        Objects.equals(this.date, comment.date)&&
        Objects.equals(this.additionalProperties, comment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, comment, commentText, user, resolved, assignee, assignedBy, reactions, date, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assignedBy: ").append(toIndentedString(assignedBy)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("comment_text");
    openapiFields.add("user");
    openapiFields.add("resolved");
    openapiFields.add("assignee");
    openapiFields.add("assigned_by");
    openapiFields.add("reactions");
    openapiFields.add("date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("comment_text");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("resolved");
    openapiRequiredFields.add("assignee");
    openapiRequiredFields.add("assigned_by");
    openapiRequiredFields.add("reactions");
    openapiRequiredFields.add("date");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Comment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Comment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Comment is not found in the empty JSON string", Comment.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Comment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("comment").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be an array in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }

      JsonArray jsonArraycomment = jsonObj.getAsJsonArray("comment");
      // validate the required field `comment` (array)
      for (int i = 0; i < jsonArraycomment.size(); i++) {
        Comment1.validateJsonObject(jsonArraycomment.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("comment_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment_text").toString()));
      }
      // validate the required field `user`
      User2.validateJsonObject(jsonObj.getAsJsonObject("user"));
      // validate the required field `assignee`
      Assignee.validateJsonObject(jsonObj.getAsJsonObject("assignee"));
      // validate the required field `assigned_by`
      AssignedBy.validateJsonObject(jsonObj.getAsJsonObject("assigned_by"));
      // ensure the required json array is present
      if (jsonObj.get("reactions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("reactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reactions` to be an array in the JSON string but got `%s`", jsonObj.get("reactions").toString()));
      }
      if (!jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Comment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Comment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Comment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Comment.class));

       return (TypeAdapter<T>) new TypeAdapter<Comment>() {
           @Override
           public void write(JsonWriter out, Comment value) throws IOException {
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
           public Comment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Comment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Comment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Comment
  * @throws IOException if the JSON string is invalid with respect to Comment
  */
  public static Comment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Comment.class);
  }

 /**
  * Convert an instance of Comment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

