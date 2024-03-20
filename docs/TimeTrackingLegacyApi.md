# TimeTrackingLegacyApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**editTimeTracked**](TimeTrackingLegacyApi.md#editTimeTracked) | **PUT** /task/{task_id}/time/{interval_id} | Edit time tracked |
| [**getTrackedTime**](TimeTrackingLegacyApi.md#getTrackedTime) | **GET** /task/{task_id}/time | Get tracked time |
| [**recordTimeForTask**](TimeTrackingLegacyApi.md#recordTimeForTask) | **POST** /task/{task_id}/time | Track time |
| [**removeTrackedTime**](TimeTrackingLegacyApi.md#removeTrackedTime) | **DELETE** /task/{task_id}/time/{interval_id} | Delete time tracked |


<a name="editTimeTracked"></a>
# **editTimeTracked**
> Object editTimeTracked(taskId, intervalId, edittimetrackedrequest).customTaskIds(customTaskIds).teamId(teamId).execute();

Edit time tracked

***Note:** This is a legacy time tracking endpoint. We recommend using the Time Tracking API endpoints to manage time entries.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingLegacyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Integer start = 56;
    Integer end = 56;
    Integer time = 56;
    String taskId = "9hv"; // 
    String intervalId = "123"; // 
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Object result = client
              .timeTrackingLegacy
              .editTimeTracked(start, end, time, taskId, intervalId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingLegacyApi#editTimeTracked");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timeTrackingLegacy
              .editTimeTracked(start, end, time, taskId, intervalId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingLegacyApi#editTimeTracked");
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
| **intervalId** | **String**|  | |
| **edittimetrackedrequest** | [**Edittimetrackedrequest**](Edittimetrackedrequest.md)| Edit the start, end, or total time of a time tracked entry. | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
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

<a name="getTrackedTime"></a>
# **getTrackedTime**
> Gettrackedtimeresponse getTrackedTime(taskId).customTaskIds(customTaskIds).teamId(teamId).execute();

Get tracked time

***Note:** This is a legacy time tracking endpoint. We recommend using the Time Tracking API endpoints to manage time entries.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingLegacyApi;
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
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Gettrackedtimeresponse result = client
              .timeTrackingLegacy
              .getTrackedTime(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingLegacyApi#getTrackedTime");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Gettrackedtimeresponse> response = client
              .timeTrackingLegacy
              .getTrackedTime(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingLegacyApi#getTrackedTime");
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
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**Gettrackedtimeresponse**](Gettrackedtimeresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="recordTimeForTask"></a>
# **recordTimeForTask**
> Tracktimeresponse recordTimeForTask(taskId, tracktimerequest).customTaskIds(customTaskIds).teamId(teamId).execute();

Track time

***Note:** This is a legacy time tracking endpoint. We recommend using the Time Tracking API endpoints to manage time entries.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingLegacyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Integer start = 56;
    Integer end = 56;
    Integer time = 56;
    String taskId = "9hv"; // 
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Tracktimeresponse result = client
              .timeTrackingLegacy
              .recordTimeForTask(start, end, time, taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingLegacyApi#recordTimeForTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Tracktimeresponse> response = client
              .timeTrackingLegacy
              .recordTimeForTask(start, end, time, taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingLegacyApi#recordTimeForTask");
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
| **tracktimerequest** | [**Tracktimerequest**](Tracktimerequest.md)| Include the total time or the start time and end time.\\  \\ The total time is in milliseconds and &#x60;\&quot;start\&quot;&#x60; and &#x60;\&quot;end\&quot;&#x60; values are Unix time in milliseconds. | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**Tracktimeresponse**](Tracktimeresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeTrackedTime"></a>
# **removeTrackedTime**
> Object removeTrackedTime(taskId, intervalId).customTaskIds(customTaskIds).teamId(teamId).execute();

Delete time tracked

***Note:** This is a legacy time tracking endpoint. We recommend using the Time Tracking API endpoints to manage time entries.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingLegacyApi;
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
    String intervalId = "123"; // 
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Object result = client
              .timeTrackingLegacy
              .removeTrackedTime(taskId, intervalId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingLegacyApi#removeTrackedTime");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timeTrackingLegacy
              .removeTrackedTime(taskId, intervalId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingLegacyApi#removeTrackedTime");
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
| **intervalId** | **String**|  | |
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

