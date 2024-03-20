# ListsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTaskToList**](ListsApi.md#addTaskToList) | **POST** /list/{list_id}/task/{task_id} | Add Task To List |
| [**addToFolder**](ListsApi.md#addToFolder) | **POST** /folder/{folder_id}/list | Create List |
| [**createFolderlessList**](ListsApi.md#createFolderlessList) | **POST** /space/{space_id}/list | Create Folderless List |
| [**getFolderLists**](ListsApi.md#getFolderLists) | **GET** /folder/{folder_id}/list | Get Lists |
| [**getFolderless**](ListsApi.md#getFolderless) | **GET** /space/{space_id}/list | Get Folderless Lists |
| [**getListDetails**](ListsApi.md#getListDetails) | **GET** /list/{list_id} | Get List |
| [**removeList**](ListsApi.md#removeList) | **DELETE** /list/{list_id} | Delete List |
| [**removeTaskFromList**](ListsApi.md#removeTaskFromList) | **DELETE** /list/{list_id}/task/{task_id} | Remove Task From List |
| [**updateListInfoDueDatePriorityAssigneeColor**](ListsApi.md#updateListInfoDueDatePriorityAssigneeColor) | **PUT** /list/{list_id} | Update List |


<a name="addTaskToList"></a>
# **addTaskToList**
> Object addTaskToList(listId, taskId).execute();

Add Task To List

Add a task to an additional List. \\  \\ ***Note:** This endpoint requires the [Tasks in Multiple List ClickApp](https://help.clickup.com/hc/en-us/articles/6309958824727-Tasks-in-Multiple-Lists) to be enabled.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String taskId = "9hz"; // 
    try {
      Object result = client
              .lists
              .addTaskToList(listId, taskId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addTaskToList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .lists
              .addTaskToList(listId, taskId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addTaskToList");
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
| **taskId** | **String**|  | |

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

<a name="addToFolder"></a>
# **addToFolder**
> CreateListresponse addToFolder(folderId, createListrequest).execute();

Create List

Add a new List to a Folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    Double folderId = 456D; // 
    String content = "content_example";
    Integer dueDate = 56;
    Boolean dueDateTime = true;
    Integer priority = 56;
    Integer assignee = 56; // Include a `user_id` to assign this List.
    String status = "status_example"; // **Status** refers to the List color rather than the task Statuses available in the List.
    try {
      CreateListresponse result = client
              .lists
              .addToFolder(name, folderId)
              .content(content)
              .dueDate(dueDate)
              .dueDateTime(dueDateTime)
              .priority(priority)
              .assignee(assignee)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getOrderindex());
      System.out.println(result.getContent());
      System.out.println(result.getStatus());
      System.out.println(result.getPriority());
      System.out.println(result.getAssignee());
      System.out.println(result.getTaskCount());
      System.out.println(result.getDueDate());
      System.out.println(result.getDueDateTime());
      System.out.println(result.getStartDate());
      System.out.println(result.getStartDateTime());
      System.out.println(result.getFolder());
      System.out.println(result.getSpace());
      System.out.println(result.getStatuses());
      System.out.println(result.getInboundAddress());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateListresponse> response = client
              .lists
              .addToFolder(name, folderId)
              .content(content)
              .dueDate(dueDate)
              .dueDateTime(dueDateTime)
              .priority(priority)
              .assignee(assignee)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addToFolder");
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
| **folderId** | **Double**|  | |
| **createListrequest** | [**CreateListrequest**](CreateListrequest.md)|  | |

### Return type

[**CreateListresponse**](CreateListresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="createFolderlessList"></a>
# **createFolderlessList**
> CreateFolderlessListresponse createFolderlessList(spaceId, createFolderlessListrequest).execute();

Create Folderless List

Add a new List in a Space.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    Double spaceId = 789D; // 
    String content = "content_example";
    Integer dueDate = 56;
    Boolean dueDateTime = true;
    Integer priority = 56;
    Integer assignee = 56; // Include a `user_id` to add a List owner.
    String status = "status_example"; // **Status** refers to the List color rather than the task Statuses available in the List.
    try {
      CreateFolderlessListresponse result = client
              .lists
              .createFolderlessList(name, spaceId)
              .content(content)
              .dueDate(dueDate)
              .dueDateTime(dueDateTime)
              .priority(priority)
              .assignee(assignee)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getOrderindex());
      System.out.println(result.getContent());
      System.out.println(result.getStatus());
      System.out.println(result.getPriority());
      System.out.println(result.getAssignee());
      System.out.println(result.getTaskCount());
      System.out.println(result.getDueDate());
      System.out.println(result.getDueDateTime());
      System.out.println(result.getStartDate());
      System.out.println(result.getStartDateTime());
      System.out.println(result.getFolder());
      System.out.println(result.getSpace());
      System.out.println(result.getStatuses());
      System.out.println(result.getInboundAddress());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#createFolderlessList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateFolderlessListresponse> response = client
              .lists
              .createFolderlessList(name, spaceId)
              .content(content)
              .dueDate(dueDate)
              .dueDateTime(dueDateTime)
              .priority(priority)
              .assignee(assignee)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#createFolderlessList");
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
| **createFolderlessListrequest** | [**CreateFolderlessListrequest**](CreateFolderlessListrequest.md)|  | |

### Return type

[**CreateFolderlessListresponse**](CreateFolderlessListresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getFolderLists"></a>
# **getFolderLists**
> GetListsresponse getFolderLists(folderId).archived(archived).execute();

Get Lists

View the Lists within a Folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double folderId = 456D; // 
    Boolean archived = false; // 
    try {
      GetListsresponse result = client
              .lists
              .getFolderLists(folderId)
              .archived(archived)
              .execute();
      System.out.println(result);
      System.out.println(result.getLists());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getFolderLists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetListsresponse> response = client
              .lists
              .getFolderLists(folderId)
              .archived(archived)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getFolderLists");
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
| **folderId** | **Double**|  | |
| **archived** | **Boolean**|  | [optional] |

### Return type

[**GetListsresponse**](GetListsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getFolderless"></a>
# **getFolderless**
> GetFolderlessListsresponse getFolderless(spaceId).archived(archived).execute();

Get Folderless Lists

View the Lists in a Space that aren&#39;t located in a Folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double spaceId = 789D; // 
    Boolean archived = false; // 
    try {
      GetFolderlessListsresponse result = client
              .lists
              .getFolderless(spaceId)
              .archived(archived)
              .execute();
      System.out.println(result);
      System.out.println(result.getLists());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getFolderless");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetFolderlessListsresponse> response = client
              .lists
              .getFolderless(spaceId)
              .archived(archived)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getFolderless");
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
| **archived** | **Boolean**|  | [optional] |

### Return type

[**GetFolderlessListsresponse**](GetFolderlessListsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getListDetails"></a>
# **getListDetails**
> GetListresponse getListDetails(listId).execute();

Get List

View information about a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double listId = 124D; // 
    try {
      GetListresponse result = client
              .lists
              .getListDetails(listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getOrderindex());
      System.out.println(result.getContent());
      System.out.println(result.getStatus());
      System.out.println(result.getPriority());
      System.out.println(result.getAssignee());
      System.out.println(result.getDueDate());
      System.out.println(result.getDueDateTime());
      System.out.println(result.getStartDate());
      System.out.println(result.getStartDateTime());
      System.out.println(result.getFolder());
      System.out.println(result.getSpace());
      System.out.println(result.getInboundAddress());
      System.out.println(result.getArchived());
      System.out.println(result.getOverrideStatuses());
      System.out.println(result.getStatuses());
      System.out.println(result.getPermissionLevel());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getListDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetListresponse> response = client
              .lists
              .getListDetails(listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getListDetails");
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

[**GetListresponse**](GetListresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeList"></a>
# **removeList**
> Object removeList(listId).execute();

Delete List

Delete a List from your Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double listId = 124D; // 
    try {
      Object result = client
              .lists
              .removeList(listId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .lists
              .removeList(listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeList");
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

<a name="removeTaskFromList"></a>
# **removeTaskFromList**
> Object removeTaskFromList(listId, taskId).execute();

Remove Task From List

Remove a task from an additional List. You can&#39;t remove a task from its home List. \\  \\ ***Note:** This endpoint requires the [Tasks in Multiple List ClickApp](https://help.clickup.com/hc/en-us/articles/6309958824727-Tasks-in-Multiple-Lists) to be enabled.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String taskId = "9hz"; // 
    try {
      Object result = client
              .lists
              .removeTaskFromList(listId, taskId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeTaskFromList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .lists
              .removeTaskFromList(listId, taskId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeTaskFromList");
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
| **taskId** | **String**|  | |

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

<a name="updateListInfoDueDatePriorityAssigneeColor"></a>
# **updateListInfoDueDatePriorityAssigneeColor**
> UpdateListresponse updateListInfoDueDatePriorityAssigneeColor(listId, updateListrequest).execute();

Update List

Rename a List, update the List Info description, set a due date/time, set the List&#39;s priority, set an assignee, set or remove the List color.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String content = "content_example";
    Integer dueDate = 56;
    Boolean dueDateTime = true;
    Integer priority = 56;
    String assignee = "assignee_example";
    String status = "status_example"; // **Status** refers to the List color rather than the task Statuses available in the List.
    Boolean unsetStatus = true; // By default, this is `false.` To remove the List color use `unset_status: true`.
    String listId = "124"; // 
    try {
      UpdateListresponse result = client
              .lists
              .updateListInfoDueDatePriorityAssigneeColor(name, content, dueDate, dueDateTime, priority, assignee, status, unsetStatus, listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getOrderindex());
      System.out.println(result.getContent());
      System.out.println(result.getStatus());
      System.out.println(result.getPriority());
      System.out.println(result.getAssignee());
      System.out.println(result.getTaskCount());
      System.out.println(result.getDueDate());
      System.out.println(result.getDueDateTime());
      System.out.println(result.getStartDate());
      System.out.println(result.getStartDateTime());
      System.out.println(result.getFolder());
      System.out.println(result.getSpace());
      System.out.println(result.getStatuses());
      System.out.println(result.getInboundAddress());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateListInfoDueDatePriorityAssigneeColor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateListresponse> response = client
              .lists
              .updateListInfoDueDatePriorityAssigneeColor(name, content, dueDate, dueDateTime, priority, assignee, status, unsetStatus, listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateListInfoDueDatePriorityAssigneeColor");
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
| **listId** | **String**|  | |
| **updateListrequest** | [**UpdateListrequest**](UpdateListrequest.md)|  | |

### Return type

[**UpdateListresponse**](UpdateListresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

