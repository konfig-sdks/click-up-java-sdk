# CommentsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToListComment**](CommentsApi.md#addToListComment) | **POST** /list/{list_id}/comment | Create List Comment |
| [**createChatViewComment**](CommentsApi.md#createChatViewComment) | **POST** /view/{view_id}/comment | Create Chat View Comment |
| [**createNewTaskComment**](CommentsApi.md#createNewTaskComment) | **POST** /task/{task_id}/comment | Create Task Comment |
| [**deleteTaskComment**](CommentsApi.md#deleteTaskComment) | **DELETE** /comment/{comment_id} | Delete Comment |
| [**getListComments**](CommentsApi.md#getListComments) | **GET** /list/{list_id}/comment | Get List Comments |
| [**getTaskComments**](CommentsApi.md#getTaskComments) | **GET** /task/{task_id}/comment | Get Task Comments |
| [**getViewComments**](CommentsApi.md#getViewComments) | **GET** /view/{view_id}/comment | Get Chat View Comments |
| [**updateTaskComment**](CommentsApi.md#updateTaskComment) | **PUT** /comment/{comment_id} | Update Comment |


<a name="addToListComment"></a>
# **addToListComment**
> CreateListCommentresponse addToListComment(listId, createListCommentrequest).execute();

Create List Comment

Add a comment to a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String commentText = "commentText_example";
    Integer assignee = 56;
    Boolean notifyAll = true; // If `notify_all` is true, notifications will be sent to everyone including the creator of the comment.
    Double listId = 124D; // 
    try {
      CreateListCommentresponse result = client
              .comments
              .addToListComment(commentText, assignee, notifyAll, listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getHistId());
      System.out.println(result.getDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#addToListComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateListCommentresponse> response = client
              .comments
              .addToListComment(commentText, assignee, notifyAll, listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#addToListComment");
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
| **createListCommentrequest** | [**CreateListCommentrequest**](CreateListCommentrequest.md)|  | |

### Return type

[**CreateListCommentresponse**](CreateListCommentresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="createChatViewComment"></a>
# **createChatViewComment**
> CreateChatViewCommentresponse createChatViewComment(viewId, createChatViewCommentrequest).execute();

Create Chat View Comment

Add a new comment to a Chat view.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String commentText = "commentText_example";
    Boolean notifyAll = true; // If `notify_all` is true, notifications will be sent to everyone including the creator of the comment.
    String viewId = "3c"; // 105 (string)
    try {
      CreateChatViewCommentresponse result = client
              .comments
              .createChatViewComment(commentText, notifyAll, viewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getHistId());
      System.out.println(result.getDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createChatViewComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateChatViewCommentresponse> response = client
              .comments
              .createChatViewComment(commentText, notifyAll, viewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createChatViewComment");
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
| **viewId** | **String**| 105 (string) | |
| **createChatViewCommentrequest** | [**CreateChatViewCommentrequest**](CreateChatViewCommentrequest.md)|  | |

### Return type

[**CreateChatViewCommentresponse**](CreateChatViewCommentresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="createNewTaskComment"></a>
# **createNewTaskComment**
> CreateTaskCommentresponse createNewTaskComment(taskId, createTaskCommentrequest).customTaskIds(customTaskIds).teamId(teamId).execute();

Create Task Comment

Add a new comment to a task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String commentText = "commentText_example";
    Integer assignee = 56;
    Boolean notifyAll = true; // If `notify_all` is true, notifications will be sent to everyone including the creator of the comment.
    String taskId = "9hz"; // 
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      CreateTaskCommentresponse result = client
              .comments
              .createNewTaskComment(commentText, assignee, notifyAll, taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getHistId());
      System.out.println(result.getDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createNewTaskComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateTaskCommentresponse> response = client
              .comments
              .createNewTaskComment(commentText, assignee, notifyAll, taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createNewTaskComment");
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
| **createTaskCommentrequest** | [**CreateTaskCommentrequest**](CreateTaskCommentrequest.md)|  | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**CreateTaskCommentresponse**](CreateTaskCommentresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="deleteTaskComment"></a>
# **deleteTaskComment**
> Object deleteTaskComment(commentId).execute();

Delete Comment

Delete a task comment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double commentId = 456D; // 
    try {
      Object result = client
              .comments
              .deleteTaskComment(commentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#deleteTaskComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .comments
              .deleteTaskComment(commentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#deleteTaskComment");
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
| **commentId** | **Double**|  | |

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

<a name="getListComments"></a>
# **getListComments**
> GetListCommentsresponse getListComments(listId).start(start).startId(startId).execute();

Get List Comments

View the comments added to a List. \\  \\ If you do not include the &#x60;start&#x60; and &#x60;start_id&#x60; parameters, this endpoint will return the most recent 25 comments.\\  \\ Use the &#x60;start&#x60; and &#x60;start id&#x60; parameters of the oldest comment to retrieve the next 25 comments.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
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
    Integer start = 56; // Enter the `date` of a List info comment using Unix time in milliseconds.
    String startId = "startId_example"; // Enter the Comment `id` of a List info comment.
    try {
      GetListCommentsresponse result = client
              .comments
              .getListComments(listId)
              .start(start)
              .startId(startId)
              .execute();
      System.out.println(result);
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getListComments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetListCommentsresponse> response = client
              .comments
              .getListComments(listId)
              .start(start)
              .startId(startId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getListComments");
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
| **start** | **Integer**| Enter the &#x60;date&#x60; of a List info comment using Unix time in milliseconds. | [optional] |
| **startId** | **String**| Enter the Comment &#x60;id&#x60; of a List info comment. | [optional] |

### Return type

[**GetListCommentsresponse**](GetListCommentsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getTaskComments"></a>
# **getTaskComments**
> GetTaskCommentsresponse getTaskComments(taskId).customTaskIds(customTaskIds).teamId(teamId).start(start).startId(startId).execute();

Get Task Comments

View task comments. \\  \\ If you do not include the &#x60;start&#x60; and &#x60;start_id&#x60; parameters, this endpoint will return the most recent 25 comments.\\  \\ Use the &#x60;start&#x60; and &#x60;start id&#x60; parameters of the oldest comment to retrieve the next 25 comments.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
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
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    Integer start = 56; // Enter the `date` of a task comment using Unix time in milliseconds.
    String startId = "startId_example"; // Enter the Comment `id` of a task comment.
    try {
      GetTaskCommentsresponse result = client
              .comments
              .getTaskComments(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .start(start)
              .startId(startId)
              .execute();
      System.out.println(result);
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getTaskComments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetTaskCommentsresponse> response = client
              .comments
              .getTaskComments(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .start(start)
              .startId(startId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getTaskComments");
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
| **start** | **Integer**| Enter the &#x60;date&#x60; of a task comment using Unix time in milliseconds. | [optional] |
| **startId** | **String**| Enter the Comment &#x60;id&#x60; of a task comment. | [optional] |

### Return type

[**GetTaskCommentsresponse**](GetTaskCommentsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getViewComments"></a>
# **getViewComments**
> GetChatViewCommentsresponse getViewComments(viewId).start(start).startId(startId).execute();

Get Chat View Comments

View comments from a Chat view. \\  \\ If you do not include the &#x60;start&#x60; and &#x60;start_id&#x60; parameters, this endpoint will return the most recent 25 comments.\\  \\ Use the &#x60;start&#x60; and &#x60;start id&#x60; parameters of the oldest comment to retrieve the next 25 comments.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String viewId = "3c"; // 105 (string)
    Integer start = 56; // Enter the `date` of a Chat view comment using Unix time in milliseconds.
    String startId = "startId_example"; // Enter the Comment `id` of a Chat view comment.
    try {
      GetChatViewCommentsresponse result = client
              .comments
              .getViewComments(viewId)
              .start(start)
              .startId(startId)
              .execute();
      System.out.println(result);
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getViewComments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetChatViewCommentsresponse> response = client
              .comments
              .getViewComments(viewId)
              .start(start)
              .startId(startId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getViewComments");
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
| **viewId** | **String**| 105 (string) | |
| **start** | **Integer**| Enter the &#x60;date&#x60; of a Chat view comment using Unix time in milliseconds. | [optional] |
| **startId** | **String**| Enter the Comment &#x60;id&#x60; of a Chat view comment. | [optional] |

### Return type

[**GetChatViewCommentsresponse**](GetChatViewCommentsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateTaskComment"></a>
# **updateTaskComment**
> Object updateTaskComment(commentId, updateCommentrequest).execute();

Update Comment

Replace the content of a task commment, assign a comment, and mark a comment as resolved.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String commentText = "commentText_example";
    Integer assignee = 56;
    Boolean resolved = true; // 
    Double commentId = 456D; // 
    try {
      Object result = client
              .comments
              .updateTaskComment(commentText, assignee, resolved, commentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#updateTaskComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .comments
              .updateTaskComment(commentText, assignee, resolved, commentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#updateTaskComment");
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
| **commentId** | **Double**|  | |
| **updateCommentrequest** | [**UpdateCommentrequest**](UpdateCommentrequest.md)|  | |

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

