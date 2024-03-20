# AuthorizationApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccessToken**](AuthorizationApi.md#getAccessToken) | **POST** /oauth/token | Get Access Token |
| [**getWorkspaceList**](AuthorizationApi.md#getWorkspaceList) | **GET** /team | Get Authorized Teams (Workspaces) |
| [**viewAccountDetails**](AuthorizationApi.md#viewAccountDetails) | **GET** /user | Get Authorized User |


<a name="getAccessToken"></a>
# **getAccessToken**
> GetAccessTokenresponse getAccessToken(clientId, clientSecret, code).execute();

Get Access Token

These are the routes for authing the API and going through the [OAuth flow](https://clickup.com/api).\\  \\ Applications utilizing a personal API token don&#39;t use this endpoint.\\  \\ ***Note:** OAuth tokens are not supported when using the [**Try It** feature](https://clickup.com/api) of our Reference docs. You can&#39;t try this endpoint from your web browser.* 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    ClickUp client = new ClickUp(configuration);
    String clientId = "clientId_example"; // Oauth app client id
    String clientSecret = "clientSecret_example"; // Oauth app client secret
    String code = "code_example"; // Code given in redirect url
    try {
      GetAccessTokenresponse result = client
              .authorization
              .getAccessToken(clientId, clientSecret, code)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#getAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetAccessTokenresponse> response = client
              .authorization
              .getAccessToken(clientId, clientSecret, code)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#getAccessToken");
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
| **clientId** | **String**| Oauth app client id | |
| **clientSecret** | **String**| Oauth app client secret | |
| **code** | **String**| Code given in redirect url | |

### Return type

[**GetAccessTokenresponse**](GetAccessTokenresponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

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
import com.konfigthis.client.api.AuthorizationApi;
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
              .authorization
              .getWorkspaceList()
              .execute();
      System.out.println(result);
      System.out.println(result.getTeams());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#getWorkspaceList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetAuthorizedTeamsresponse> response = client
              .authorization
              .getWorkspaceList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#getWorkspaceList");
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

<a name="viewAccountDetails"></a>
# **viewAccountDetails**
> GetAuthorizedUserresponse viewAccountDetails().execute();

Get Authorized User

View the details of the authenticated user&#39;s ClickUp account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationApi;
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
      GetAuthorizedUserresponse result = client
              .authorization
              .viewAccountDetails()
              .execute();
      System.out.println(result);
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#viewAccountDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetAuthorizedUserresponse> response = client
              .authorization
              .viewAccountDetails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#viewAccountDetails");
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

[**GetAuthorizedUserresponse**](GetAuthorizedUserresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

