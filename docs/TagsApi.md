# TagsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToTask**](TagsApi.md#addToTask) | **POST** /task/{task_id}/tag/{tag_name} | Add Tag To Task |
| [**createSpaceTag**](TagsApi.md#createSpaceTag) | **POST** /space/{space_id}/tag | Create Space Tag |
| [**getSpace**](TagsApi.md#getSpace) | **GET** /space/{space_id}/tag | Get Space Tags |
| [**removeFromTask**](TagsApi.md#removeFromTask) | **DELETE** /task/{task_id}/tag/{tag_name} | Remove Tag From Task |
| [**removeSpaceTag**](TagsApi.md#removeSpaceTag) | **DELETE** /space/{space_id}/tag/{tag_name} | Delete Space Tag |
| [**updateSpaceTag**](TagsApi.md#updateSpaceTag) | **PUT** /space/{space_id}/tag/{tag_name} | Edit Space Tag |


<a name="addToTask"></a>
# **addToTask**
> Object addToTask(taskId, tagName).customTaskIds(customTaskIds).teamId(teamId).execute();

Add Tag To Task

Add a Tag to a task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskId = "abc"; // 
    String tagName = "name"; // 
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Object result = client
              .tags
              .addToTask(taskId, tagName)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#addToTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tags
              .addToTask(taskId, tagName)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#addToTask");
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
| **tagName** | **String**|  | |
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

<a name="createSpaceTag"></a>
# **createSpaceTag**
> Object createSpaceTag(spaceId, createSpaceTagrequest).execute();

Create Space Tag

Add a new task Tag to a Space.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Tag tag = new Tag();
    Double spaceId = 512D; // 
    try {
      Object result = client
              .tags
              .createSpaceTag(tag, spaceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createSpaceTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tags
              .createSpaceTag(tag, spaceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createSpaceTag");
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
| **spaceId** | **Double**|  | |
| **createSpaceTagrequest** | [**CreateSpaceTagrequest**](CreateSpaceTagrequest.md)|  | |

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

<a name="getSpace"></a>
# **getSpace**
> GetSpaceTagsresponse getSpace(spaceId).execute();

Get Space Tags

View the task Tags available in a Space.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double spaceId = 512D; // 
    try {
      GetSpaceTagsresponse result = client
              .tags
              .getSpace(spaceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#getSpace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetSpaceTagsresponse> response = client
              .tags
              .getSpace(spaceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#getSpace");
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
| **spaceId** | **Double**|  | |

### Return type

[**GetSpaceTagsresponse**](GetSpaceTagsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeFromTask"></a>
# **removeFromTask**
> Object removeFromTask(taskId, tagName).customTaskIds(customTaskIds).teamId(teamId).execute();

Remove Tag From Task

Remove a Tag from a task. This does not delete the Tag from the Space.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskId = "abc"; // 
    String tagName = "name"; // 
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Object result = client
              .tags
              .removeFromTask(taskId, tagName)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#removeFromTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tags
              .removeFromTask(taskId, tagName)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#removeFromTask");
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
| **tagName** | **String**|  | |
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

<a name="removeSpaceTag"></a>
# **removeSpaceTag**
> Object removeSpaceTag(spaceId, tagName, deleteSpaceTagrequest).execute();

Delete Space Tag

Delete a task Tag from a Space.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Tag tag = new Tag();
    Double spaceId = 512D; // 
    String tagName = "name"; // 
    try {
      Object result = client
              .tags
              .removeSpaceTag(tag, spaceId, tagName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#removeSpaceTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tags
              .removeSpaceTag(tag, spaceId, tagName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#removeSpaceTag");
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
| **spaceId** | **Double**|  | |
| **tagName** | **String**|  | |
| **deleteSpaceTagrequest** | [**DeleteSpaceTagrequest**](DeleteSpaceTagrequest.md)|  | |

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

<a name="updateSpaceTag"></a>
# **updateSpaceTag**
> EditSpaceTagresponse updateSpaceTag(spaceId, tagName, editSpaceTagrequest).execute();

Edit Space Tag

Update a task Tag.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Tag1 tag = new Tag1();
    Double spaceId = 512D; // 
    String tagName = "name"; // 
    try {
      EditSpaceTagresponse result = client
              .tags
              .updateSpaceTag(tag, spaceId, tagName)
              .execute();
      System.out.println(result);
      System.out.println(result.getTag());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#updateSpaceTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditSpaceTagresponse> response = client
              .tags
              .updateSpaceTag(tag, spaceId, tagName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#updateSpaceTag");
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
| **spaceId** | **Double**|  | |
| **tagName** | **String**|  | |
| **editSpaceTagrequest** | [**EditSpaceTagrequest**](EditSpaceTagrequest.md)|  | |

### Return type

[**EditSpaceTagresponse**](EditSpaceTagresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

