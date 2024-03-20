# UsersApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deactivateFromWorkspace**](UsersApi.md#deactivateFromWorkspace) | **DELETE** /team/{team_id}/user/{user_id} | Remove User From Workspace |
| [**getUserDetails**](UsersApi.md#getUserDetails) | **GET** /team/{team_id}/user/{user_id} | Get User |
| [**inviteUserToWorkspace**](UsersApi.md#inviteUserToWorkspace) | **POST** /team/{team_id}/user | Invite User To Workspace |
| [**updateUserDetails**](UsersApi.md#updateUserDetails) | **PUT** /team/{team_id}/user/{user_id} | Edit User On Workspace |


<a name="deactivateFromWorkspace"></a>
# **deactivateFromWorkspace**
> RemoveUserFromWorkspaceresponse deactivateFromWorkspace(teamId, userId).execute();

Remove User From Workspace

Deactivate a user from a Workspace. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Double userId = 403D; // 
    try {
      RemoveUserFromWorkspaceresponse result = client
              .users
              .deactivateFromWorkspace(teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTeam());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deactivateFromWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoveUserFromWorkspaceresponse> response = client
              .users
              .deactivateFromWorkspace(teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deactivateFromWorkspace");
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
| **userId** | **Double**|  | |

### Return type

[**RemoveUserFromWorkspaceresponse**](RemoveUserFromWorkspaceresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getUserDetails"></a>
# **getUserDetails**
> GetUserresponse getUserDetails(teamId, userId).execute();

Get User

View information about a user in a Workspace. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Double userId = 403D; // 
    try {
      GetUserresponse result = client
              .users
              .getUserDetails(teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMember());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetUserresponse> response = client
              .users
              .getUserDetails(teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserDetails");
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
| **userId** | **Double**|  | |

### Return type

[**GetUserresponse**](GetUserresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="inviteUserToWorkspace"></a>
# **inviteUserToWorkspace**
> InviteUserToWorkspaceresponse inviteUserToWorkspace(teamId, inviteUserToWorkspacerequest).execute();

Invite User To Workspace

Invite someone to join your Workspace as a member. To invite someone as a guest, use the [Invite Guest](https://clickup.com/api/clickupreference/operation/InviteGuestToWorkspace/) endpoint.\\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Boolean admin = true;
    Double teamId = 123D; // Team ID (Workspace)
    Integer customRoleId = 56;
    try {
      InviteUserToWorkspaceresponse result = client
              .users
              .inviteUserToWorkspace(email, admin, teamId)
              .customRoleId(customRoleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTeam());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#inviteUserToWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InviteUserToWorkspaceresponse> response = client
              .users
              .inviteUserToWorkspace(email, admin, teamId)
              .customRoleId(customRoleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#inviteUserToWorkspace");
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
| **inviteUserToWorkspacerequest** | [**InviteUserToWorkspacerequest**](InviteUserToWorkspacerequest.md)|  | |

### Return type

[**InviteUserToWorkspaceresponse**](InviteUserToWorkspaceresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateUserDetails"></a>
# **updateUserDetails**
> EditUserOnWorkspaceresponse updateUserDetails(teamId, userId, editUserOnWorkspacerequest).execute();

Edit User On Workspace

Update a user&#39;s name and role. \\  \\ ***Note:** This endpoint is only available to Workspaces on our [Enterprise Plan](https://clickup.com/pricing).*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Boolean admin = true;
    Integer customRoleId = 56;
    Double teamId = 123D; // Team ID (Workspace)
    Double userId = 403D; // 
    try {
      EditUserOnWorkspaceresponse result = client
              .users
              .updateUserDetails(username, admin, customRoleId, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMember());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditUserOnWorkspaceresponse> response = client
              .users
              .updateUserDetails(username, admin, customRoleId, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserDetails");
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
| **userId** | **Double**|  | |
| **editUserOnWorkspacerequest** | [**EditUserOnWorkspacerequest**](EditUserOnWorkspacerequest.md)|  | |

### Return type

[**EditUserOnWorkspaceresponse**](EditUserOnWorkspaceresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

