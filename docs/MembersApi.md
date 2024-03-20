# MembersApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListUsers**](MembersApi.md#getListUsers) | **GET** /list/{list_id}/member | Get List Members |
| [**getTaskAccess**](MembersApi.md#getTaskAccess) | **GET** /task/{task_id}/member | Get Task Members |


<a name="getListUsers"></a>
# **getListUsers**
> GetListMembersresponse getListUsers(listId).execute();

Get List Members

View the people who have access to a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MembersApi;
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
      GetListMembersresponse result = client
              .members
              .getListUsers(listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMembers());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getListUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetListMembersresponse> response = client
              .members
              .getListUsers(listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getListUsers");
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

[**GetListMembersresponse**](GetListMembersresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getTaskAccess"></a>
# **getTaskAccess**
> GetTaskMembersresponse getTaskAccess(taskId).execute();

Get Task Members

View the people who have access to a task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MembersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskId = "9hz"; // 
    try {
      GetTaskMembersresponse result = client
              .members
              .getTaskAccess(taskId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMembers());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getTaskAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetTaskMembersresponse> response = client
              .members
              .getTaskAccess(taskId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getTaskAccess");
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

### Return type

[**GetTaskMembersresponse**](GetTaskMembersresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

