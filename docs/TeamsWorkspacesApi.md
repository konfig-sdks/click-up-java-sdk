# TeamsWorkspacesApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWorkspaceList**](TeamsWorkspacesApi.md#getWorkspaceList) | **GET** /team | Get Authorized Teams (Workspaces) |
| [**getWorkspacePlan**](TeamsWorkspacesApi.md#getWorkspacePlan) | **GET** /team/{team_id}/plan | Get Workspace Plan |
| [**getWorkspaceSeats**](TeamsWorkspacesApi.md#getWorkspaceSeats) | **GET** /team/{team_id}/seats | Get Workspace seats |


<a name="getWorkspaceList"></a>
# **getWorkspaceList**
> GetAuthorizedTeamsresponse getWorkspaceList().execute();

Get Authorized Teams (Workspaces)

View the Workspaces available to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsWorkspacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    try {
      GetAuthorizedTeamsresponse result = client
              .teamsWorkspaces
              .getWorkspaceList()
              .execute();
      System.out.println(result);
      System.out.println(result.getTeams());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsWorkspacesApi#getWorkspaceList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetAuthorizedTeamsresponse> response = client
              .teamsWorkspaces
              .getWorkspaceList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsWorkspacesApi#getWorkspaceList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAuthorizedTeamsresponse**](GetAuthorizedTeamsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getWorkspacePlan"></a>
# **getWorkspacePlan**
> GetWorkspaceplanresponse getWorkspacePlan(teamId).execute();

Get Workspace Plan

View the current [Plan](https://clickup.com/pricing) for the specified Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsWorkspacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String teamId = "teamId_example"; // Team ID (Workspace)
    try {
      GetWorkspaceplanresponse result = client
              .teamsWorkspaces
              .getWorkspacePlan(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlanName());
      System.out.println(result.getPlanId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsWorkspacesApi#getWorkspacePlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetWorkspaceplanresponse> response = client
              .teamsWorkspaces
              .getWorkspacePlan(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsWorkspacesApi#getWorkspacePlan");
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
| **teamId** | **String**| Team ID (Workspace) | |

### Return type

[**GetWorkspaceplanresponse**](GetWorkspaceplanresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getWorkspaceSeats"></a>
# **getWorkspaceSeats**
> GetWorkspaceseatsresponse getWorkspaceSeats(teamId).execute();

Get Workspace seats

View the used, total, and available member and guest seats for a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsWorkspacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String teamId = "teamId_example"; // Team ID (Workspace)
    try {
      GetWorkspaceseatsresponse result = client
              .teamsWorkspaces
              .getWorkspaceSeats(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMembers());
      System.out.println(result.getGuests());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsWorkspacesApi#getWorkspaceSeats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetWorkspaceseatsresponse> response = client
              .teamsWorkspaces
              .getWorkspaceSeats(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsWorkspacesApi#getWorkspaceSeats");
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
| **teamId** | **String**| Team ID (Workspace) | |

### Return type

[**GetWorkspaceseatsresponse**](GetWorkspaceseatsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

