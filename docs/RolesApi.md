# RolesApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAvailableCustomRoles**](RolesApi.md#listAvailableCustomRoles) | **GET** /team/{team_id}/customroles | Get Custom Roles |


<a name="listAvailableCustomRoles"></a>
# **listAvailableCustomRoles**
> GetCustomRolesresponse listAvailableCustomRoles(teamId).includeMembers(includeMembers).execute();

Get Custom Roles

View the Custom Roles available in a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RolesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double teamId = 123D; // 
    Boolean includeMembers = true; // 
    try {
      GetCustomRolesresponse result = client
              .roles
              .listAvailableCustomRoles(teamId)
              .includeMembers(includeMembers)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomRoles());
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#listAvailableCustomRoles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetCustomRolesresponse> response = client
              .roles
              .listAvailableCustomRoles(teamId)
              .includeMembers(includeMembers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#listAvailableCustomRoles");
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
| **teamId** | **Double**|  | |
| **includeMembers** | **Boolean**|  | [optional] |

### Return type

[**GetCustomRolesresponse**](GetCustomRolesresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

