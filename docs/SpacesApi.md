# SpacesApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewSpaceToWorkspace**](SpacesApi.md#addNewSpaceToWorkspace) | **POST** /team/{team_id}/space | Create Space |
| [**getDetails**](SpacesApi.md#getDetails) | **GET** /space/{space_id} | Get Space |
| [**getSpaceDetails**](SpacesApi.md#getSpaceDetails) | **GET** /team/{team_id}/space | Get Spaces |
| [**removeSpace**](SpacesApi.md#removeSpace) | **DELETE** /space/{space_id} | Delete Space |
| [**updateDetailsAndEnableClickApps**](SpacesApi.md#updateDetailsAndEnableClickApps) | **PUT** /space/{space_id} | Update Space |


<a name="addNewSpaceToWorkspace"></a>
# **addNewSpaceToWorkspace**
> CreateSpaceresponse addNewSpaceToWorkspace(teamId, createSpacerequest).execute();

Create Space

Add a new Space to a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
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
    Boolean multipleAssignees = true;
    Features features = new Features();
    Double teamId = 123D; // Team ID (Workspace)
    try {
      CreateSpaceresponse result = client
              .spaces
              .addNewSpaceToWorkspace(name, multipleAssignees, features, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getPrivate());
      System.out.println(result.getStatuses());
      System.out.println(result.getMultipleAssignees());
      System.out.println(result.getFeatures());
      System.out.println(result.getArchived());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#addNewSpaceToWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateSpaceresponse> response = client
              .spaces
              .addNewSpaceToWorkspace(name, multipleAssignees, features, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#addNewSpaceToWorkspace");
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
| **createSpacerequest** | [**CreateSpacerequest**](CreateSpacerequest.md)|  | |

### Return type

[**CreateSpaceresponse**](CreateSpaceresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getDetails"></a>
# **getDetails**
> GetSpaceresponse getDetails(spaceId).execute();

Get Space

View the Spaces available in a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double spaceId = 790D; // 
    try {
      GetSpaceresponse result = client
              .spaces
              .getDetails(spaceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getPrivate());
      System.out.println(result.getStatuses());
      System.out.println(result.getMultipleAssignees());
      System.out.println(result.getFeatures());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetSpaceresponse> response = client
              .spaces
              .getDetails(spaceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getDetails");
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

### Return type

[**GetSpaceresponse**](GetSpaceresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getSpaceDetails"></a>
# **getSpaceDetails**
> GetSpacesresponse getSpaceDetails(teamId).archived(archived).execute();

Get Spaces

View the Spaces avialable in a Workspace. You can only get member info in private Spaces.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
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
    Boolean archived = false; // 
    try {
      GetSpacesresponse result = client
              .spaces
              .getSpaceDetails(teamId)
              .archived(archived)
              .execute();
      System.out.println(result);
      System.out.println(result.getSpaces());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getSpaceDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetSpacesresponse> response = client
              .spaces
              .getSpaceDetails(teamId)
              .archived(archived)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getSpaceDetails");
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
| **archived** | **Boolean**|  | [optional] |

### Return type

[**GetSpacesresponse**](GetSpacesresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeSpace"></a>
# **removeSpace**
> Object removeSpace(spaceId).execute();

Delete Space

Delete a Space from your Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double spaceId = 790D; // 
    try {
      Object result = client
              .spaces
              .removeSpace(spaceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#removeSpace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .spaces
              .removeSpace(spaceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#removeSpace");
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

<a name="updateDetailsAndEnableClickApps"></a>
# **updateDetailsAndEnableClickApps**
> UpdateSpaceresponse updateDetailsAndEnableClickApps(spaceId, updateSpacerequest).execute();

Update Space

Rename, set the Space color, and enable ClickApps for a Space.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
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
    String color = "color_example";
    Boolean _private = true;
    Boolean adminCanManage = true; // ***Note:** Allowing or restricting admins from managing private Spaces using `\\\"admin_can_manage\\\"` is an [Enterprise Plan](https://clickup.com/pricing) feature.*
    Boolean multipleAssignees = true;
    Features features = new Features();
    Double spaceId = 790D; // 
    try {
      UpdateSpaceresponse result = client
              .spaces
              .updateDetailsAndEnableClickApps(name, color, _private, adminCanManage, multipleAssignees, features, spaceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getPrivate());
      System.out.println(result.getStatuses());
      System.out.println(result.getMultipleAssignees());
      System.out.println(result.getFeatures());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#updateDetailsAndEnableClickApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateSpaceresponse> response = client
              .spaces
              .updateDetailsAndEnableClickApps(name, color, _private, adminCanManage, multipleAssignees, features, spaceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#updateDetailsAndEnableClickApps");
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
| **updateSpacerequest** | [**UpdateSpacerequest**](UpdateSpacerequest.md)|  | |

### Return type

[**UpdateSpaceresponse**](UpdateSpaceresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

