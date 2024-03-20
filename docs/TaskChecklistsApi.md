# TaskChecklistsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLineItem**](TaskChecklistsApi.md#addLineItem) | **POST** /checklist/{checklist_id}/checklist_item | Create Checklist Item |
| [**createNewChecklist**](TaskChecklistsApi.md#createNewChecklist) | **POST** /task/{task_id}/checklist | Create Checklist |
| [**removeChecklist**](TaskChecklistsApi.md#removeChecklist) | **DELETE** /checklist/{checklist_id} | Delete Checklist |
| [**removeChecklistItem**](TaskChecklistsApi.md#removeChecklistItem) | **DELETE** /checklist/{checklist_id}/checklist_item/{checklist_item_id} | Delete Checklist Item |
| [**updateChecklist**](TaskChecklistsApi.md#updateChecklist) | **PUT** /checklist/{checklist_id} | Edit Checklist |
| [**updateChecklistItem**](TaskChecklistsApi.md#updateChecklistItem) | **PUT** /checklist/{checklist_id}/checklist_item/{checklist_item_id} | Edit Checklist Item |


<a name="addLineItem"></a>
# **addLineItem**
> CreateChecklistItemresponse addLineItem(checklistId, createChecklistItemrequest).execute();

Create Checklist Item

Add a line item to a task checklist.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskChecklistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String checklistId = "b955c4dc"; // b8a8-48d8-a0c6-b4200788a683 (uuid)
    String name = "name_example";
    Integer assignee = 56;
    try {
      CreateChecklistItemresponse result = client
              .taskChecklists
              .addLineItem(checklistId)
              .name(name)
              .assignee(assignee)
              .execute();
      System.out.println(result);
      System.out.println(result.getChecklist());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#addLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateChecklistItemresponse> response = client
              .taskChecklists
              .addLineItem(checklistId)
              .name(name)
              .assignee(assignee)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#addLineItem");
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
| **checklistId** | **String**| b8a8-48d8-a0c6-b4200788a683 (uuid) | |
| **createChecklistItemrequest** | [**CreateChecklistItemrequest**](CreateChecklistItemrequest.md)|  | |

### Return type

[**CreateChecklistItemresponse**](CreateChecklistItemresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="createNewChecklist"></a>
# **createNewChecklist**
> CreateChecklistresponse createNewChecklist(taskId, createChecklistrequest).customTaskIds(customTaskIds).teamId(teamId).execute();

Create Checklist

Add a new checklist to a task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskChecklistsApi;
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
    String taskId = "9hz"; // 
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      CreateChecklistresponse result = client
              .taskChecklists
              .createNewChecklist(name, taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChecklist());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#createNewChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateChecklistresponse> response = client
              .taskChecklists
              .createNewChecklist(name, taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#createNewChecklist");
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
| **createChecklistrequest** | [**CreateChecklistrequest**](CreateChecklistrequest.md)|  | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**CreateChecklistresponse**](CreateChecklistresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeChecklist"></a>
# **removeChecklist**
> Object removeChecklist(checklistId).execute();

Delete Checklist

Delete a checklist from a task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskChecklistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String checklistId = "b955c4dc"; // b8a8-48d8-a0c6-b4200788a683 (uuid)
    try {
      Object result = client
              .taskChecklists
              .removeChecklist(checklistId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#removeChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .taskChecklists
              .removeChecklist(checklistId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#removeChecklist");
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
| **checklistId** | **String**| b8a8-48d8-a0c6-b4200788a683 (uuid) | |

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

<a name="removeChecklistItem"></a>
# **removeChecklistItem**
> Object removeChecklistItem(checklistId, checklistItemId).execute();

Delete Checklist Item

Delete a line item from a task checklist.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskChecklistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String checklistId = "b955c4dc"; // b8a8-48d8-a0c6-b4200788a683 (uuid)
    String checklistItemId = "21e08dc8"; // e491-47f5-9fd8-d1dc4cedcc6f (uuid)
    try {
      Object result = client
              .taskChecklists
              .removeChecklistItem(checklistId, checklistItemId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#removeChecklistItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .taskChecklists
              .removeChecklistItem(checklistId, checklistItemId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#removeChecklistItem");
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
| **checklistId** | **String**| b8a8-48d8-a0c6-b4200788a683 (uuid) | |
| **checklistItemId** | **String**| e491-47f5-9fd8-d1dc4cedcc6f (uuid) | |

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

<a name="updateChecklist"></a>
# **updateChecklist**
> Object updateChecklist(checklistId, editChecklistrequest).execute();

Edit Checklist

Rename a task checklist, or reorder a checklist so it appears above or below other checklists on a task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskChecklistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String checklistId = "b955c4dc"; // b8a8-48d8-a0c6-b4200788a683 (uuid)
    String name = "name_example";
    Integer position = 56; // Position refers to the order of appearance of checklists on a task.\\\\  \\\\ To set a checklist to appear at the top of the checklists section of a task, use `\\\"position\\\": 0`.
    try {
      Object result = client
              .taskChecklists
              .updateChecklist(checklistId)
              .name(name)
              .position(position)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#updateChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .taskChecklists
              .updateChecklist(checklistId)
              .name(name)
              .position(position)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#updateChecklist");
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
| **checklistId** | **String**| b8a8-48d8-a0c6-b4200788a683 (uuid) | |
| **editChecklistrequest** | [**EditChecklistrequest**](EditChecklistrequest.md)|  | |

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

<a name="updateChecklistItem"></a>
# **updateChecklistItem**
> EditChecklistItemresponse updateChecklistItem(checklistId, checklistItemId, editChecklistItemrequest).execute();

Edit Checklist Item

Update an individual line item in a task checklist. \\  \\ You can rename it, set the assignee, mark it as resolved, or nest it under another checklist item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskChecklistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String checklistId = "b955c4dc"; // b8a8-48d8-a0c6-b4200788a683 (uuid)
    String checklistItemId = "21e08dc8"; // e491-47f5-9fd8-d1dc4cedcc6f (uuid)
    String name = "name_example";
    Object assignee = null;
    Boolean resolved = true;
    Object parent = null; // To nest a checklist item under another checklist item, include the other item's `checklist_item_id`.
    try {
      EditChecklistItemresponse result = client
              .taskChecklists
              .updateChecklistItem(checklistId, checklistItemId)
              .name(name)
              .assignee(assignee)
              .resolved(resolved)
              .parent(parent)
              .execute();
      System.out.println(result);
      System.out.println(result.getChecklist());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#updateChecklistItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditChecklistItemresponse> response = client
              .taskChecklists
              .updateChecklistItem(checklistId, checklistItemId)
              .name(name)
              .assignee(assignee)
              .resolved(resolved)
              .parent(parent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskChecklistsApi#updateChecklistItem");
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
| **checklistId** | **String**| b8a8-48d8-a0c6-b4200788a683 (uuid) | |
| **checklistItemId** | **String**| e491-47f5-9fd8-d1dc4cedcc6f (uuid) | |
| **editChecklistItemrequest** | [**EditChecklistItemrequest**](EditChecklistItemrequest.md)|  | |

### Return type

[**EditChecklistItemresponse**](EditChecklistItemresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

