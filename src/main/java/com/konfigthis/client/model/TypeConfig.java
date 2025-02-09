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
import com.konfigthis.client.model.Option;
import com.konfigthis.client.model.Tracking;
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
 * TypeConfig
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TypeConfig {
  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<Option> options = null;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Object _default = null;

  public static final String SERIALIZED_NAME_PRECISION = "precision";
  @SerializedName(SERIALIZED_NAME_PRECISION)
  private Integer precision;

  public static final String SERIALIZED_NAME_CURRENCY_TYPE = "currency_type";
  @SerializedName(SERIALIZED_NAME_CURRENCY_TYPE)
  private String currencyType;

  public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
  private Object placeholder = null;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_CODE_POINT = "code_point";
  @SerializedName(SERIALIZED_NAME_CODE_POINT)
  private String codePoint;

  public static final String SERIALIZED_NAME_TRACKING = "tracking";
  @SerializedName(SERIALIZED_NAME_TRACKING)
  private Tracking tracking;

  public static final String SERIALIZED_NAME_COMPLETE_ON = "complete_on";
  @SerializedName(SERIALIZED_NAME_COMPLETE_ON)
  private Integer completeOn;

  public TypeConfig() {
  }

  public TypeConfig options(List<Option> options) {
    
    
    
    
    this.options = options;
    return this;
  }

  public TypeConfig addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * 
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Option> getOptions() {
    return options;
  }


  public void setOptions(List<Option> options) {
    
    
    
    this.options = options;
  }


  public TypeConfig _default(Object _default) {
    
    
    
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDefault() {
    return _default;
  }


  public void setDefault(Object _default) {
    
    
    
    this._default = _default;
  }


  public TypeConfig precision(Integer precision) {
    
    
    
    
    this.precision = precision;
    return this;
  }

   /**
   * Get precision
   * @return precision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPrecision() {
    return precision;
  }


  public void setPrecision(Integer precision) {
    
    
    
    this.precision = precision;
  }


  public TypeConfig currencyType(String currencyType) {
    
    
    
    
    this.currencyType = currencyType;
    return this;
  }

   /**
   * Get currencyType
   * @return currencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrencyType() {
    return currencyType;
  }


  public void setCurrencyType(String currencyType) {
    
    
    
    this.currencyType = currencyType;
  }


  public TypeConfig placeholder(Object placeholder) {
    
    
    
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Get placeholder
   * @return placeholder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPlaceholder() {
    return placeholder;
  }


  public void setPlaceholder(Object placeholder) {
    
    
    
    this.placeholder = placeholder;
  }


  public TypeConfig end(Integer end) {
    
    
    
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    
    
    
    this.end = end;
  }


  public TypeConfig start(Integer start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    
    
    
    this.start = start;
  }


  public TypeConfig count(Integer count) {
    
    
    
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    
    
    
    this.count = count;
  }


  public TypeConfig codePoint(String codePoint) {
    
    
    
    
    this.codePoint = codePoint;
    return this;
  }

   /**
   * Get codePoint
   * @return codePoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodePoint() {
    return codePoint;
  }


  public void setCodePoint(String codePoint) {
    
    
    
    this.codePoint = codePoint;
  }


  public TypeConfig tracking(Tracking tracking) {
    
    
    
    
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Tracking getTracking() {
    return tracking;
  }


  public void setTracking(Tracking tracking) {
    
    
    
    this.tracking = tracking;
  }


  public TypeConfig completeOn(Integer completeOn) {
    
    
    
    
    this.completeOn = completeOn;
    return this;
  }

   /**
   * Get completeOn
   * @return completeOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompleteOn() {
    return completeOn;
  }


  public void setCompleteOn(Integer completeOn) {
    
    
    
    this.completeOn = completeOn;
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
   * @return the TypeConfig instance itself
   */
  public TypeConfig putAdditionalProperty(String key, Object value) {
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
    TypeConfig typeConfig = (TypeConfig) o;
    return Objects.equals(this.options, typeConfig.options) &&
        Objects.equals(this._default, typeConfig._default) &&
        Objects.equals(this.precision, typeConfig.precision) &&
        Objects.equals(this.currencyType, typeConfig.currencyType) &&
        Objects.equals(this.placeholder, typeConfig.placeholder) &&
        Objects.equals(this.end, typeConfig.end) &&
        Objects.equals(this.start, typeConfig.start) &&
        Objects.equals(this.count, typeConfig.count) &&
        Objects.equals(this.codePoint, typeConfig.codePoint) &&
        Objects.equals(this.tracking, typeConfig.tracking) &&
        Objects.equals(this.completeOn, typeConfig.completeOn)&&
        Objects.equals(this.additionalProperties, typeConfig.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, _default, precision, currencyType, placeholder, end, start, count, codePoint, tracking, completeOn, additionalProperties);
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
    sb.append("class TypeConfig {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    currencyType: ").append(toIndentedString(currencyType)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    codePoint: ").append(toIndentedString(codePoint)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    completeOn: ").append(toIndentedString(completeOn)).append("\n");
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
    openapiFields.add("options");
    openapiFields.add("default");
    openapiFields.add("precision");
    openapiFields.add("currency_type");
    openapiFields.add("placeholder");
    openapiFields.add("end");
    openapiFields.add("start");
    openapiFields.add("count");
    openapiFields.add("code_point");
    openapiFields.add("tracking");
    openapiFields.add("complete_on");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TypeConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TypeConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TypeConfig is not found in the empty JSON string", TypeConfig.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            Option.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("currency_type") != null && !jsonObj.get("currency_type").isJsonNull()) && !jsonObj.get("currency_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_type").toString()));
      }
      if ((jsonObj.get("code_point") != null && !jsonObj.get("code_point").isJsonNull()) && !jsonObj.get("code_point").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code_point` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code_point").toString()));
      }
      // validate the optional field `tracking`
      if (jsonObj.get("tracking") != null && !jsonObj.get("tracking").isJsonNull()) {
        Tracking.validateJsonObject(jsonObj.getAsJsonObject("tracking"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TypeConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TypeConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TypeConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TypeConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<TypeConfig>() {
           @Override
           public void write(JsonWriter out, TypeConfig value) throws IOException {
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
           public TypeConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TypeConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TypeConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TypeConfig
  * @throws IOException if the JSON string is invalid with respect to TypeConfig
  */
  public static TypeConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TypeConfig.class);
  }

 /**
  * Convert an instance of TypeConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

