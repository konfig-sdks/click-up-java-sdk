# WebhooksApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /team/{team_id}/webhook | Create Webhook |
| [**removeWebhookById**](WebhooksApi.md#removeWebhookById) | **DELETE** /webhook/{webhook_id} | Delete Webhook |
| [**updateEventsToMonitor**](WebhooksApi.md#updateEventsToMonitor) | **PUT** /webhook/{webhook_id} | Update Webhook |
| [**workspaceGet**](WebhooksApi.md#workspaceGet) | **GET** /team/{team_id}/webhook | Get Webhooks |


<a name="createWebhook"></a>
# **createWebhook**
> CreateWebhookresponse createWebhook(teamId, createWebhookrequest).execute();

Create Webhook

Set up a webhook to monitor for events.&lt;br&gt; We do not have a dedicated IP address for webhooks. We use our domain name and dynamic addressing.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String endpoint = "endpoint_example";
    List<String> events = Arrays.asList();
    Double teamId = 123D; // Team ID (Workspace)
    Integer spaceId = 56;
    Integer folderId = 56;
    Integer listId = 56;
    String taskId = "taskId_example";
    try {
      CreateWebhookresponse result = client
              .webhooks
              .createWebhook(endpoint, events, teamId)
              .spaceId(spaceId)
              .folderId(folderId)
              .listId(listId)
              .taskId(taskId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebhook());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#createWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateWebhookresponse> response = client
              .webhooks
              .createWebhook(endpoint, events, teamId)
              .spaceId(spaceId)
              .folderId(folderId)
              .listId(listId)
              .taskId(taskId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#createWebhook");
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
| **createWebhookrequest** | [**CreateWebhookrequest**](CreateWebhookrequest.md)| You can subscribe to specific events, and one specific location per webhook. [Learn more](https://clickup.com/api). | |

### Return type

[**CreateWebhookresponse**](CreateWebhookresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeWebhookById"></a>
# **removeWebhookById**
> Object removeWebhookById(webhookId).execute();

Delete Webhook

Delete a webhook to stop monitoring the events and locations of the webhook.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String webhookId = "4b67ac88"; // e506-4a29-9d42-26e504e3435e (uuid)
    try {
      Object result = client
              .webhooks
              .removeWebhookById(webhookId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#removeWebhookById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .webhooks
              .removeWebhookById(webhookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#removeWebhookById");
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
| **webhookId** | **String**| e506-4a29-9d42-26e504e3435e (uuid) | |

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

<a name="updateEventsToMonitor"></a>
# **updateEventsToMonitor**
> UpdateWebhookresponse updateEventsToMonitor(webhookId, updateWebhookrequest).execute();

Update Webhook

Update a webhook to change the events to be monitored.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String endpoint = "endpoint_example";
    String events = "events_example";
    String status = "status_example";
    String webhookId = "4b67ac88"; // e506-4a29-9d42-26e504e3435e (uuid)
    try {
      UpdateWebhookresponse result = client
              .webhooks
              .updateEventsToMonitor(endpoint, events, status, webhookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebhook());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateEventsToMonitor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateWebhookresponse> response = client
              .webhooks
              .updateEventsToMonitor(endpoint, events, status, webhookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateEventsToMonitor");
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
| **webhookId** | **String**| e506-4a29-9d42-26e504e3435e (uuid) | |
| **updateWebhookrequest** | [**UpdateWebhookrequest**](UpdateWebhookrequest.md)| To subscribe to specific events, pass an array of &#x60;events&#x60; that you want to subscribe to, or use the wildcard character &#x60;\&quot;*\&quot;&#x60; to subscribe to everything.\\  \\ If you don&#39;t specify any events, all events will be sent to the webhook. | |

### Return type

[**UpdateWebhookresponse**](UpdateWebhookresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="workspaceGet"></a>
# **workspaceGet**
> GetWebhooksresponse workspaceGet(teamId).execute();

Get Webhooks

View the webhooks created via the API for a Workspace. This endpoint returns webhooks created by the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    try {
      GetWebhooksresponse result = client
              .webhooks
              .workspaceGet(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebhooks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#workspaceGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetWebhooksresponse> response = client
              .webhooks
              .workspaceGet(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#workspaceGet");
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

### Return type

[**GetWebhooksresponse**](GetWebhooksresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

