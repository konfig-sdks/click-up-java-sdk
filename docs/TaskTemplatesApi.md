# TaskTemplatesApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFromTemplate**](TaskTemplatesApi.md#createFromTemplate) | **POST** /list/{list_id}/taskTemplate/{template_id} | Create Task From Template |
| [**getTemplates**](TaskTemplatesApi.md#getTemplates) | **GET** /team/{team_id}/taskTemplate | Get Task Templates |


<a name="createFromTemplate"></a>
# **createFromTemplate**
> Object createFromTemplate(listId, templateId, createTaskFromTemplaterequest).execute();

Create Task From Template

Create a new task using a task template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskTemplatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String name = "name_example";
    Double listId = 512D; // 
    String templateId = "9hz"; // 
    try {
      Object result = client
              .taskTemplates
              .createFromTemplate(name, listId, templateId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTemplatesApi#createFromTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .taskTemplates
              .createFromTemplate(name, listId, templateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTemplatesApi#createFromTemplate");
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
| **templateId** | **String**|  | |
| **createTaskFromTemplaterequest** | [**CreateTaskFromTemplaterequest**](CreateTaskFromTemplaterequest.md)|  | |

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

<a name="getTemplates"></a>
# **getTemplates**
> GetTaskTemplatesresponse getTemplates(teamId, page).execute();

Get Task Templates

View the task templates available in a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskTemplatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double teamId = 123D; // Team ID (Workspace)
    Integer page = 0; // 
    try {
      GetTaskTemplatesresponse result = client
              .taskTemplates
              .getTemplates(teamId, page)
              .execute();
      System.out.println(result);
      System.out.println(result.getTemplates());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTemplatesApi#getTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetTaskTemplatesresponse> response = client
              .taskTemplates
              .getTemplates(teamId, page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskTemplatesApi#getTemplates");
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
| **teamId** | **Double**| Team ID (Workspace) | |
| **page** | **Integer**|  | |

### Return type

[**GetTaskTemplatesresponse**](GetTaskTemplatesresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

