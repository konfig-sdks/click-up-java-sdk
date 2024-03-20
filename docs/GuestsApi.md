# GuestsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGuestToFolder**](GuestsApi.md#addGuestToFolder) | **POST** /folder/{folder_id}/guest/{guest_id} | Add Guest To Folder |
| [**addToTask**](GuestsApi.md#addToTask) | **POST** /task/{task_id}/guest/{guest_id} | Add Guest To Task |
| [**editGuestOnWorkspace**](GuestsApi.md#editGuestOnWorkspace) | **PUT** /team/{team_id}/guest/{guest_id} | Edit Guest On Workspace |
| [**getGuestInformation**](GuestsApi.md#getGuestInformation) | **GET** /team/{team_id}/guest/{guest_id} | Get Guest |
| [**inviteToWorkspace**](GuestsApi.md#inviteToWorkspace) | **POST** /team/{team_id}/guest | Invite Guest To Workspace |
| [**removeFromList**](GuestsApi.md#removeFromList) | **DELETE** /list/{list_id}/guest/{guest_id} | Remove Guest From List |
| [**revokeAccessFromFolder**](GuestsApi.md#revokeAccessFromFolder) | **DELETE** /folder/{folder_id}/guest/{guest_id} | Remove Guest From Folder |
| [**revokeAccessToTask**](GuestsApi.md#revokeAccessToTask) | **DELETE** /task/{task_id}/guest/{guest_id} | Remove Guest From Task |
| [**revokeGuestAccessToWorkspace**](GuestsApi.md#revokeGuestAccessToWorkspace) | **DELETE** /team/{team_id}/guest/{guest_id} | Remove Guest From Workspace |
| [**shareListWith**](GuestsApi.md#shareListWith) | **POST** /list/{list_id}/guest/{guest_id} | Add Guest To List |


<a name="addGuestToFolder"></a>
# **addGuestToFolder**
> AddGuestToFolderresponse addGuestToFolder(folderId, guestId, addGuestToFolderrequest).includeShared(includeShared).execute();

Add Guest To Folder

Share a Folder with a guest. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String permissionLevel = "permissionLevel_example"; // Can be `read` (view only), `comment`, `edit`, or `create` (full).
    Double folderId = 1057D; // 
    Double guestId = 403D; // 
    Boolean includeShared = false; // Exclude details of items shared with the guest by setting this parameter to `false`. By default this parameter is set to `true`.
    try {
      AddGuestToFolderresponse result = client
              .guests
              .addGuestToFolder(permissionLevel, folderId, guestId)
              .includeShared(includeShared)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#addGuestToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddGuestToFolderresponse> response = client
              .guests
              .addGuestToFolder(permissionLevel, folderId, guestId)
              .includeShared(includeShared)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#addGuestToFolder");
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
| **guestId** | **Double**|  | |
| **addGuestToFolderrequest** | [**AddGuestToFolderrequest**](AddGuestToFolderrequest.md)|  | |
| **includeShared** | **Boolean**| Exclude details of items shared with the guest by setting this parameter to &#x60;false&#x60;. By default this parameter is set to &#x60;true&#x60;. | [optional] |

### Return type

[**AddGuestToFolderresponse**](AddGuestToFolderresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="addToTask"></a>
# **addToTask**
> AddGuestToTaskresponse addToTask(taskId, guestId, addGuestToTaskrequest).includeShared(includeShared).customTaskIds(customTaskIds).teamId(teamId).execute();

Add Guest To Task

Share a task with a guest. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String permissionLevel = "permissionLevel_example"; // Can be `read` (view only), `comment`, `edit`, or `create` (full).
    String taskId = "c04"; // 
    Double guestId = 403D; // 
    Boolean includeShared = false; // Exclude details of items shared with the guest by setting this parameter to `false`. By default this parameter is set to `true`.
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      AddGuestToTaskresponse result = client
              .guests
              .addToTask(permissionLevel, taskId, guestId)
              .includeShared(includeShared)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#addToTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddGuestToTaskresponse> response = client
              .guests
              .addToTask(permissionLevel, taskId, guestId)
              .includeShared(includeShared)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#addToTask");
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
| **guestId** | **Double**|  | |
| **addGuestToTaskrequest** | [**AddGuestToTaskrequest**](AddGuestToTaskrequest.md)|  | |
| **includeShared** | **Boolean**| Exclude details of items shared with the guest by setting this parameter to &#x60;false&#x60;. By default this parameter is set to &#x60;true&#x60;. | [optional] |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**AddGuestToTaskresponse**](AddGuestToTaskresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="editGuestOnWorkspace"></a>
# **editGuestOnWorkspace**
> EditGuestOnWorkspaceresponse editGuestOnWorkspace(teamId, guestId, editGuestOnWorkspacerequest).execute();

Edit Guest On Workspace

Rename and configure options for a guest. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String username = "username_example";
    Boolean canEditTags = true;
    Boolean canSeeTimeSpent = true;
    Boolean canSeeTimeEstimated = true;
    Boolean canCreateViews = true;
    Integer customRoleId = 56;
    Double teamId = 123D; // Team ID (Workspace)
    Double guestId = 403D; // 
    try {
      EditGuestOnWorkspaceresponse result = client
              .guests
              .editGuestOnWorkspace(username, canEditTags, canSeeTimeSpent, canSeeTimeEstimated, canCreateViews, customRoleId, teamId, guestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#editGuestOnWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditGuestOnWorkspaceresponse> response = client
              .guests
              .editGuestOnWorkspace(username, canEditTags, canSeeTimeSpent, canSeeTimeEstimated, canCreateViews, customRoleId, teamId, guestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#editGuestOnWorkspace");
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
| **guestId** | **Double**|  | |
| **editGuestOnWorkspacerequest** | [**EditGuestOnWorkspacerequest**](EditGuestOnWorkspacerequest.md)|  | |

### Return type

[**EditGuestOnWorkspaceresponse**](EditGuestOnWorkspaceresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getGuestInformation"></a>
# **getGuestInformation**
> Object getGuestInformation(teamId, guestId).execute();

Get Guest

View information about a guest. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
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
    Double guestId = 403D; // 
    try {
      Object result = client
              .guests
              .getGuestInformation(teamId, guestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#getGuestInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .guests
              .getGuestInformation(teamId, guestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#getGuestInformation");
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
| **guestId** | **Double**|  | |

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

<a name="inviteToWorkspace"></a>
# **inviteToWorkspace**
> InviteGuestToWorkspaceresponse inviteToWorkspace(teamId, inviteGuestToWorkspacerequest).execute();

Invite Guest To Workspace

Invite a guest to join a Workspace. To invite a member to your Workspace, use the [Invite User to Workspace](https://clickup.com/api/clickupreference/operation/InviteUserToWorkspace/) endpoint. \\  \\ You&#39;ll also need to grant the guest access to specific items using the following endpoints: [Add Guest to Folder](clickupreference/operation/AddGuestToFolder/), [Add Guest to List](clickupreference/operation/AddGuestToList/), or [Add Guest to Task](clickupreference/operation/AddGuestToTask/). \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String email = "email_example";
    Boolean canEditTags = true;
    Boolean canSeeTimeSpent = true;
    Boolean canSeeTimeEstimated = true;
    Boolean canCreateViews = true;
    Integer customRoleId = 56;
    Double teamId = 123D; // Team ID (Workspace)
    try {
      InviteGuestToWorkspaceresponse result = client
              .guests
              .inviteToWorkspace(email, canEditTags, canSeeTimeSpent, canSeeTimeEstimated, canCreateViews, customRoleId, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTeam());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#inviteToWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InviteGuestToWorkspaceresponse> response = client
              .guests
              .inviteToWorkspace(email, canEditTags, canSeeTimeSpent, canSeeTimeEstimated, canCreateViews, customRoleId, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#inviteToWorkspace");
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
| **inviteGuestToWorkspacerequest** | [**InviteGuestToWorkspacerequest**](InviteGuestToWorkspacerequest.md)|  | |

### Return type

[**InviteGuestToWorkspaceresponse**](InviteGuestToWorkspaceresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeFromList"></a>
# **removeFromList**
> RemoveGuestFromListresponse removeFromList(listId, guestId).includeShared(includeShared).execute();

Remove Guest From List

Revoke a guest&#39;s access to a List.\\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double listId = 1427D; // 
    Double guestId = 403D; // 
    Boolean includeShared = false; // Exclude details of items shared with the guest by setting this parameter to `false`. By default this parameter is set to `true`.
    try {
      RemoveGuestFromListresponse result = client
              .guests
              .removeFromList(listId, guestId)
              .includeShared(includeShared)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#removeFromList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoveGuestFromListresponse> response = client
              .guests
              .removeFromList(listId, guestId)
              .includeShared(includeShared)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#removeFromList");
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
| **guestId** | **Double**|  | |
| **includeShared** | **Boolean**| Exclude details of items shared with the guest by setting this parameter to &#x60;false&#x60;. By default this parameter is set to &#x60;true&#x60;. | [optional] |

### Return type

[**RemoveGuestFromListresponse**](RemoveGuestFromListresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="revokeAccessFromFolder"></a>
# **revokeAccessFromFolder**
> RemoveGuestFromFolderresponse revokeAccessFromFolder(folderId, guestId).includeShared(includeShared).execute();

Remove Guest From Folder

Revoke a guest&#39;s access to a Folder. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double folderId = 1057D; // 
    Double guestId = 403D; // 
    Boolean includeShared = false; // Exclude details of items shared with the guest by setting this parameter to `false`. By default this parameter is set to `true`.
    try {
      RemoveGuestFromFolderresponse result = client
              .guests
              .revokeAccessFromFolder(folderId, guestId)
              .includeShared(includeShared)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#revokeAccessFromFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoveGuestFromFolderresponse> response = client
              .guests
              .revokeAccessFromFolder(folderId, guestId)
              .includeShared(includeShared)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#revokeAccessFromFolder");
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
| **guestId** | **Double**|  | |
| **includeShared** | **Boolean**| Exclude details of items shared with the guest by setting this parameter to &#x60;false&#x60;. By default this parameter is set to &#x60;true&#x60;. | [optional] |

### Return type

[**RemoveGuestFromFolderresponse**](RemoveGuestFromFolderresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="revokeAccessToTask"></a>
# **revokeAccessToTask**
> RemoveGuestFromTaskresponse revokeAccessToTask(taskId, guestId).includeShared(includeShared).customTaskIds(customTaskIds).teamId(teamId).execute();

Remove Guest From Task

Revoke a guest&#39;s access to a task. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskId = "c04"; // 
    Double guestId = 403D; // 
    Boolean includeShared = false; // Exclude details of items shared with the guest by setting this parameter to `false`. By default this parameter is set to `true`.
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      RemoveGuestFromTaskresponse result = client
              .guests
              .revokeAccessToTask(taskId, guestId)
              .includeShared(includeShared)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#revokeAccessToTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoveGuestFromTaskresponse> response = client
              .guests
              .revokeAccessToTask(taskId, guestId)
              .includeShared(includeShared)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#revokeAccessToTask");
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
| **guestId** | **Double**|  | |
| **includeShared** | **Boolean**| Exclude details of items shared with the guest by setting this parameter to &#x60;false&#x60;. By default this parameter is set to &#x60;true&#x60;. | [optional] |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**RemoveGuestFromTaskresponse**](RemoveGuestFromTaskresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="revokeGuestAccessToWorkspace"></a>
# **revokeGuestAccessToWorkspace**
> RemoveGuestFromWorkspaceresponse revokeGuestAccessToWorkspace(teamId, guestId).execute();

Remove Guest From Workspace

Revoke a guest&#39;s access to a Workspace. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
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
    Double guestId = 403D; // 
    try {
      RemoveGuestFromWorkspaceresponse result = client
              .guests
              .revokeGuestAccessToWorkspace(teamId, guestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTeam());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#revokeGuestAccessToWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoveGuestFromWorkspaceresponse> response = client
              .guests
              .revokeGuestAccessToWorkspace(teamId, guestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#revokeGuestAccessToWorkspace");
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
| **guestId** | **Double**|  | |

### Return type

[**RemoveGuestFromWorkspaceresponse**](RemoveGuestFromWorkspaceresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="shareListWith"></a>
# **shareListWith**
> AddGuestToListresponse shareListWith(listId, guestId, addGuestToListrequest).includeShared(includeShared).execute();

Add Guest To List

Share a List with a guest. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GuestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String permissionLevel = "permissionLevel_example"; // Can be `read` (view only), `comment`, `edit`, or `create` (full).
    Double listId = 1427D; // 
    Double guestId = 403D; // 
    Boolean includeShared = false; // Exclude details of items shared with the guest by setting this parameter to `false`. By default this parameter is set to `true`.
    try {
      AddGuestToListresponse result = client
              .guests
              .shareListWith(permissionLevel, listId, guestId)
              .includeShared(includeShared)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#shareListWith");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddGuestToListresponse> response = client
              .guests
              .shareListWith(permissionLevel, listId, guestId)
              .includeShared(includeShared)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestsApi#shareListWith");
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
| **guestId** | **Double**|  | |
| **addGuestToListrequest** | [**AddGuestToListrequest**](AddGuestToListrequest.md)|  | |
| **includeShared** | **Boolean**| Exclude details of items shared with the guest by setting this parameter to &#x60;false&#x60;. By default this parameter is set to &#x60;true&#x60;. | [optional] |

### Return type

[**AddGuestToListresponse**](AddGuestToListresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

