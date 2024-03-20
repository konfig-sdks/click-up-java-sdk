# TeamsUserGroupsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTeam**](TeamsUserGroupsApi.md#createTeam) | **POST** /team/{team_id}/group | Create Team |
| [**getUserGroups**](TeamsUserGroupsApi.md#getUserGroups) | **GET** /group | Get Teams |
| [**removeGroup**](TeamsUserGroupsApi.md#removeGroup) | **DELETE** /group/{group_id} | Delete Team |
| [**updateUserGroup**](TeamsUserGroupsApi.md#updateUserGroup) | **PUT** /group/{group_id} | Update Team |


<a name="createTeam"></a>
# **createTeam**
> CreateTeamresponse createTeam(teamId, createTeamrequest).execute();

Create Team

This endpoint is used to create [Teams: user groups](https://docs.clickup.com/en/articles/4010016-teams-how-to-create-user-groups) which are groups of users you can assign items to in your Workspace.\\  \\ In our API documentation, &#x60;team_id&#x60; refers to the id of a Workspace, and &#x60;group_id&#x60; refers to the id of a user group.\\  \\ **Note:** Adding a guest with view only permissions to a Team automatically converts them to a paid guest.\\  \\ If you don&#39;t have any paid guest seats available, a new member seat is automatically added to increase the number of paid guest seats available.\\  \\ This incurs a prorated charge based on your billing cycle.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsUserGroupsApi;
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
    List<Integer> members = Arrays.asList(); // 
    Double teamId = 123D; // Team ID (Workspace)
    try {
      CreateTeamresponse result = client
              .teamsUserGroups
              .createTeam(name, members, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getTeamId());
      System.out.println(result.getUserid());
      System.out.println(result.getName());
      System.out.println(result.getHandle());
      System.out.println(result.getDateCreated());
      System.out.println(result.getInitials());
      System.out.println(result.getMembers());
      System.out.println(result.getAvatar());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsUserGroupsApi#createTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateTeamresponse> response = client
              .teamsUserGroups
              .createTeam(name, members, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsUserGroupsApi#createTeam");
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
| **createTeamrequest** | [**CreateTeamrequest**](CreateTeamrequest.md)|  | |

### Return type

[**CreateTeamresponse**](CreateTeamresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getUserGroups"></a>
# **getUserGroups**
> GetTeamsresponse getUserGroups().teamId(teamId).groupIds(groupIds).execute();

Get Teams

This endpoint is used to view [Teams: user groups](https://docs.clickup.com/en/articles/4010016-teams-how-to-create-user-groups) in your Workspace.\\  \\ In our API documentation, &#x60;team_id&#x60; refers to the id of a Workspace, and &#x60;group_id&#x60; refers to the id of a user group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsUserGroupsApi;
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
    String groupIds = "C9C58BE9-7C73-4002-A6A9-310014852858"; // Enter one or more Team ids (user groups) to retrieve information about specific Teams.
    try {
      GetTeamsresponse result = client
              .teamsUserGroups
              .getUserGroups()
              .teamId(teamId)
              .groupIds(groupIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsUserGroupsApi#getUserGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetTeamsresponse> response = client
              .teamsUserGroups
              .getUserGroups()
              .teamId(teamId)
              .groupIds(groupIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsUserGroupsApi#getUserGroups");
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
| **teamId** | **Double**| Team ID (Workspace) | [optional] |
| **groupIds** | **String**| Enter one or more Team ids (user groups) to retrieve information about specific Teams. | [optional] |

### Return type

[**GetTeamsresponse**](GetTeamsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeGroup"></a>
# **removeGroup**
> Object removeGroup(groupId).execute();

Delete Team

This endpoint is used to remove a [Team: user group](https://docs.clickup.com/en/articles/4010016-teams-how-to-create-user-groups) from your Workspace.\\  \\ In our API documentation, &#x60;team_id&#x60; refers to the id of a Workspace, and &#x60;group_id&#x60; refers to the id of a user group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsUserGroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String groupId = "C9C58BE9"; // 7C73-4002-A6A9-310014852858 (string) - Team ID (user group)
    try {
      Object result = client
              .teamsUserGroups
              .removeGroup(groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsUserGroupsApi#removeGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .teamsUserGroups
              .removeGroup(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsUserGroupsApi#removeGroup");
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
| **groupId** | **String**| 7C73-4002-A6A9-310014852858 (string) - Team ID (user group) | |

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

<a name="updateUserGroup"></a>
# **updateUserGroup**
> UpdateTeamresponse updateUserGroup(groupId, updateTeamrequest).execute();

Update Team

This endpoint is used to manage [Teams: user groups](https://docs.clickup.com/en/articles/4010016-teams-how-to-create-user-groups) which are groups of users you can assign items to in your Workspace.\\  \\ In our API documentation, &#x60;team_id&#x60; refers to the id of a Workspace, and &#x60;group_id&#x60; refers to the id of a user group.\\  \\ **Note:** Adding a guest with view only permissions to a Team automatically converts them to a paid guest.\\  \\ If you don&#39;t have any paid guest seats available, a new member seat is automatically added to increase the number of paid guest seats available.\\  \\ This incurs a prorated charge based on your billing cycle.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsUserGroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String groupId = "C9C58BE9"; // 7C73-4002-A6A9-310014852858 (string) - Team ID (user group)
    String name = "name_example";
    String handle = "handle_example";
    Members2 members = new Members2();
    try {
      UpdateTeamresponse result = client
              .teamsUserGroups
              .updateUserGroup(groupId)
              .name(name)
              .handle(handle)
              .members(members)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getTeamId());
      System.out.println(result.getUserid());
      System.out.println(result.getName());
      System.out.println(result.getHandle());
      System.out.println(result.getDateCreated());
      System.out.println(result.getInitials());
      System.out.println(result.getMembers());
      System.out.println(result.getAvatar());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsUserGroupsApi#updateUserGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateTeamresponse> response = client
              .teamsUserGroups
              .updateUserGroup(groupId)
              .name(name)
              .handle(handle)
              .members(members)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsUserGroupsApi#updateUserGroup");
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
| **groupId** | **String**| 7C73-4002-A6A9-310014852858 (string) - Team ID (user group) | |
| **updateTeamrequest** | [**UpdateTeamrequest**](UpdateTeamrequest.md)| You can update the team &#x60;handle&#x60; which is used to @mention a Team (user group) in your Workspace.\\  \\ Add or remove members to and from a Team (user group) using the &#x60;\&quot;add\&quot;&#x60; and/or &#x60;\&quot;rem\&quot;&#x60; parameters and including an array of user ids. | |

### Return type

[**UpdateTeamresponse**](UpdateTeamresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

