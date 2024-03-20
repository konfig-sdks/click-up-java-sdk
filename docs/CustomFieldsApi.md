# CustomFieldsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListFields**](CustomFieldsApi.md#getListFields) | **GET** /list/{list_id}/field | Get Accessible Custom Fields |
| [**removeFieldValue**](CustomFieldsApi.md#removeFieldValue) | **DELETE** /task/{task_id}/field/{field_id} | Remove Custom Field Value |
| [**setFieldValue**](CustomFieldsApi.md#setFieldValue) | **POST** /task/{task_id}/field/{field_id} | Set Custom Field Value |


<a name="getListFields"></a>
# **getListFields**
> GetAccessibleCustomFieldsresponse getListFields(listId).execute();

Get Accessible Custom Fields

View the Custom Fields available on tasks in a specific List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double listId = 123D; // 
    try {
      GetAccessibleCustomFieldsresponse result = client
              .customFields
              .getListFields(listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getListFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetAccessibleCustomFieldsresponse> response = client
              .customFields
              .getListFields(listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getListFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **Double**|  | |

### Return type

[**GetAccessibleCustomFieldsresponse**](GetAccessibleCustomFieldsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeFieldValue"></a>
# **removeFieldValue**
> Object removeFieldValue(taskId, fieldId).customTaskIds(customTaskIds).teamId(teamId).execute();

Remove Custom Field Value

Remove the data from a Custom Field on a task. This does not delete the option from the Custom Field.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskId = "9hv"; // 
    String fieldId = "b955c4dc"; // b8a8-48d8-a0c6-b4200788a683 (uuid)
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Object result = client
              .customFields
              .removeFieldValue(taskId, fieldId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#removeFieldValue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .customFields
              .removeFieldValue(taskId, fieldId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#removeFieldValue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**|  | |
| **fieldId** | **String**| b8a8-48d8-a0c6-b4200788a683 (uuid) | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

**Object**

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="setFieldValue"></a>
# **setFieldValue**
> Object setFieldValue(taskId, fieldId, setCustomFieldValuerequest).customTaskIds(customTaskIds).teamId(teamId).execute();

Set Custom Field Value

Add data to a Custom field on a task. \\  \\ You&#39;ll need to know the &#x60;task_id&#x60; of the task you want to update, and the universal unique identifier (UUID) &#x60;field_id&#x60; of the Custom Field you want to set. \\  \\ You can use [Get Accessible Custom Fields](https://clickup.com/api) or the [Get Task](https://clickup.com/api) endpoint to find the &#x60;field_id&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskId = "9hv"; // Enter the task ID of the task you want to update.
    String fieldId = "b955c4dc"; // Enter the universal unique identifier (UUID) of the Custom Field you want to set.
    Object value = null;
    SetCustomFieldValuerequestValueOptions valueOptions = new SetCustomFieldValuerequestValueOptions();
    Boolean customTaskIds = true; // If you want to reference a task by its Custom Task ID, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Object result = client
              .customFields
              .setFieldValue(taskId, fieldId)
              .value(value)
              .valueOptions(valueOptions)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#setFieldValue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .customFields
              .setFieldValue(taskId, fieldId)
              .value(value)
              .valueOptions(valueOptions)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#setFieldValue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| Enter the task ID of the task you want to update. | |
| **fieldId** | **String**| Enter the universal unique identifier (UUID) of the Custom Field you want to set. | |
| **setCustomFieldValuerequest** | [**SetCustomFieldValuerequest**](SetCustomFieldValuerequest.md)|  | |
| **customTaskIds** | **Boolean**| If you want to reference a task by its Custom Task ID, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

**Object**

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

