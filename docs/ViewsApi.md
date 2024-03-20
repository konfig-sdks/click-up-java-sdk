# ViewsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addViewToFolder**](ViewsApi.md#addViewToFolder) | **POST** /folder/{folder_id}/view | Create Folder View |
| [**addViewToList**](ViewsApi.md#addViewToList) | **POST** /list/{list_id}/view | Create List View |
| [**addViewToSpace**](ViewsApi.md#addViewToSpace) | **POST** /space/{space_id}/view | Create Space View |
| [**createWorkspaceViewEverythingLevel**](ViewsApi.md#createWorkspaceViewEverythingLevel) | **POST** /team/{team_id}/view | Create Workspace (Everything level) View |
| [**deleteViewById**](ViewsApi.md#deleteViewById) | **DELETE** /view/{view_id} | Delete View |
| [**folderViewsGet**](ViewsApi.md#folderViewsGet) | **GET** /folder/{folder_id}/view | Get Folder Views |
| [**getEverythingLevel**](ViewsApi.md#getEverythingLevel) | **GET** /team/{team_id}/view | Get Workspace (Everything level) Views |
| [**getListViews**](ViewsApi.md#getListViews) | **GET** /list/{list_id}/view | Get List Views |
| [**getTasksInView**](ViewsApi.md#getTasksInView) | **GET** /view/{view_id}/task | Get View Tasks |
| [**getViewInfo**](ViewsApi.md#getViewInfo) | **GET** /view/{view_id} | Get View |
| [**spaceViewsGet**](ViewsApi.md#spaceViewsGet) | **GET** /space/{space_id}/view | Get Space Views |
| [**updateViewDetails**](ViewsApi.md#updateViewDetails) | **PUT** /view/{view_id} | Update View |


<a name="addViewToFolder"></a>
# **addViewToFolder**
> CreateFolderViewresponse addViewToFolder(folderId, createFolderViewrequest).execute();

Create Folder View

Add a List, Board, Calendar, Table, Timeline, Workload, Activity, Map, Chat, or Gantt view to a Folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    String type = "type_example"; // The type of view to create. Options include: `list`, `board`, `calendar`, `table`, `timeline`, `workload`, `activity`, `map`, `conversation`, or `gantt`.
    Grouping grouping = new Grouping();
    Divide divide = new Divide();
    Sorting sorting = new Sorting();
    Filters filters = new Filters();
    Columns columns = new Columns();
    TeamSidebar teamSidebar = new TeamSidebar();
    Settings settings = new Settings();
    Double folderId = 457D; // 
    try {
      CreateFolderViewresponse result = client
              .views
              .addViewToFolder(name, type, grouping, divide, sorting, filters, columns, teamSidebar, settings, folderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#addViewToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateFolderViewresponse> response = client
              .views
              .addViewToFolder(name, type, grouping, divide, sorting, filters, columns, teamSidebar, settings, folderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#addViewToFolder");
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
| **createFolderViewrequest** | [**CreateFolderViewrequest**](CreateFolderViewrequest.md)|  | |

### Return type

[**CreateFolderViewresponse**](CreateFolderViewresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="addViewToList"></a>
# **addViewToList**
> CreateListViewresponse addViewToList(listId, createListViewrequest).execute();

Create List View

Add a List, Board, Calendar, Table, Timeline, Workload, Activity, Map, Chat, or Gantt view to a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    String type = "type_example"; // The type of view to create. Options include: `list`, `board`, `calendar`, `table`, `timeline`, `workload`, `activity`, `map`, `conversation`, or `gantt`.
    Grouping grouping = new Grouping();
    Divide divide = new Divide();
    Sorting sorting = new Sorting();
    Filters filters = new Filters();
    Columns columns = new Columns();
    TeamSidebar teamSidebar = new TeamSidebar();
    Settings settings = new Settings();
    Double listId = 124D; // 
    try {
      CreateListViewresponse result = client
              .views
              .addViewToList(name, type, grouping, divide, sorting, filters, columns, teamSidebar, settings, listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#addViewToList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateListViewresponse> response = client
              .views
              .addViewToList(name, type, grouping, divide, sorting, filters, columns, teamSidebar, settings, listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#addViewToList");
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
| **createListViewrequest** | [**CreateListViewrequest**](CreateListViewrequest.md)|  | |

### Return type

[**CreateListViewresponse**](CreateListViewresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="addViewToSpace"></a>
# **addViewToSpace**
> CreateSpaceViewresponse addViewToSpace(spaceId, createSpaceViewrequest).execute();

Create Space View

Add a List, Board, Calendar, Table, Timeline, Workload, Activity, Map, Chat, or Gantt view to a Space.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    String type = "type_example"; // The type of view to create. Options include: `list`, `board`, `calendar`, `table`, `timeline`, `workload`, `activity`, `map`, `conversation`, or `gantt`.
    Grouping grouping = new Grouping();
    Divide divide = new Divide();
    Sorting sorting = new Sorting();
    Filters filters = new Filters();
    Columns columns = new Columns();
    TeamSidebar teamSidebar = new TeamSidebar();
    Settings settings = new Settings();
    Double spaceId = 790D; // 
    try {
      CreateSpaceViewresponse result = client
              .views
              .addViewToSpace(name, type, grouping, divide, sorting, filters, columns, teamSidebar, settings, spaceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#addViewToSpace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateSpaceViewresponse> response = client
              .views
              .addViewToSpace(name, type, grouping, divide, sorting, filters, columns, teamSidebar, settings, spaceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#addViewToSpace");
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
| **createSpaceViewrequest** | [**CreateSpaceViewrequest**](CreateSpaceViewrequest.md)|  | |

### Return type

[**CreateSpaceViewresponse**](CreateSpaceViewresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="createWorkspaceViewEverythingLevel"></a>
# **createWorkspaceViewEverythingLevel**
> CreateTeamViewresponse createWorkspaceViewEverythingLevel(teamId, createTeamViewrequest).execute();

Create Workspace (Everything level) View

Add a List, Board, Calendar, Table, Timeline, Workload, Activity, Map, Chat, or Gantt view at the Everything Level of a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    String type = "type_example"; // The type of view to create. Options include: `list`, `board`, `calendar`, `table`, `timeline`, `workload`, `activity`, `map`, `conversation`, or `gantt`.
    Grouping grouping = new Grouping();
    Divide divide = new Divide();
    Sorting sorting = new Sorting();
    Filters filters = new Filters();
    Columns columns = new Columns();
    TeamSidebar teamSidebar = new TeamSidebar();
    Settings settings = new Settings();
    Double teamId = 123D; // Team ID (Workspace)
    try {
      CreateTeamViewresponse result = client
              .views
              .createWorkspaceViewEverythingLevel(name, type, grouping, divide, sorting, filters, columns, teamSidebar, settings, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#createWorkspaceViewEverythingLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateTeamViewresponse> response = client
              .views
              .createWorkspaceViewEverythingLevel(name, type, grouping, divide, sorting, filters, columns, teamSidebar, settings, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#createWorkspaceViewEverythingLevel");
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
| **createTeamViewrequest** | [**CreateTeamViewrequest**](CreateTeamViewrequest.md)|  | |

### Return type

[**CreateTeamViewresponse**](CreateTeamViewresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="deleteViewById"></a>
# **deleteViewById**
> Object deleteViewById(viewId).execute();

Delete View

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    try {
      Object result = client
              .views
              .deleteViewById(viewId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#deleteViewById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .views
              .deleteViewById(viewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#deleteViewById");
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

<a name="folderViewsGet"></a>
# **folderViewsGet**
> GetFolderViewsresponse folderViewsGet(folderId).execute();

Get Folder Views

View the task and page views available for a Folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double folderId = 457D; // 
    try {
      GetFolderViewsresponse result = client
              .views
              .folderViewsGet(folderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getViews());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#folderViewsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetFolderViewsresponse> response = client
              .views
              .folderViewsGet(folderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#folderViewsGet");
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

### Return type

[**GetFolderViewsresponse**](GetFolderViewsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getEverythingLevel"></a>
# **getEverythingLevel**
> GetTeamViewsresponse getEverythingLevel(teamId).execute();

Get Workspace (Everything level) Views

View the task and page views available at the Everything Level of a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    try {
      GetTeamViewsresponse result = client
              .views
              .getEverythingLevel(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getViews());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getEverythingLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetTeamViewsresponse> response = client
              .views
              .getEverythingLevel(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getEverythingLevel");
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

### Return type

[**GetTeamViewsresponse**](GetTeamViewsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getListViews"></a>
# **getListViews**
> GetListViewsresponse getListViews(listId).execute();

Get List Views

View the task and page views available for a List.&lt;br&gt; Views and required views are separate responses.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
      GetListViewsresponse result = client
              .views
              .getListViews(listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getViews());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getListViews");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetListViewsresponse> response = client
              .views
              .getListViews(listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getListViews");
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

[**GetListViewsresponse**](GetListViewsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getTasksInView"></a>
# **getTasksInView**
> GetViewTasksresponse getTasksInView(viewId, page).execute();

Get View Tasks

See all visible tasks in a view in ClickUp.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    Integer page = 0; // 
    try {
      GetViewTasksresponse result = client
              .views
              .getTasksInView(viewId, page)
              .execute();
      System.out.println(result);
      System.out.println(result.getTasks());
      System.out.println(result.getLastPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getTasksInView");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetViewTasksresponse> response = client
              .views
              .getTasksInView(viewId, page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getTasksInView");
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
| **page** | **Integer**|  | |

### Return type

[**GetViewTasksresponse**](GetViewTasksresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getViewInfo"></a>
# **getViewInfo**
> GetViewresponse getViewInfo(viewId).execute();

Get View

View information about a specific task or page view.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String viewId = "3c-105"; // 
    try {
      GetViewresponse result = client
              .views
              .getViewInfo(viewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getViewInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetViewresponse> response = client
              .views
              .getViewInfo(viewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#getViewInfo");
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
| **viewId** | **String**|  | |

### Return type

[**GetViewresponse**](GetViewresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="spaceViewsGet"></a>
# **spaceViewsGet**
> GetSpaceViewsresponse spaceViewsGet(spaceId).execute();

Get Space Views

View the task and page views available for a Space.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
      GetSpaceViewsresponse result = client
              .views
              .spaceViewsGet(spaceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getViews());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#spaceViewsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetSpaceViewsresponse> response = client
              .views
              .spaceViewsGet(spaceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#spaceViewsGet");
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

[**GetSpaceViewsresponse**](GetSpaceViewsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateViewDetails"></a>
# **updateViewDetails**
> UpdateViewresponse updateViewDetails(viewId, updateViewrequest).execute();

Update View

Rename a view, update the grouping, sorting, filters, columns, and settings of a view.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    String type = "type_example";
    Parent parent = new Parent();
    Grouping grouping = new Grouping();
    Divide divide = new Divide();
    Sorting sorting = new Sorting();
    Filters filters = new Filters();
    Columns columns = new Columns();
    TeamSidebar teamSidebar = new TeamSidebar();
    Settings settings = new Settings();
    String viewId = "3c"; // 
    try {
      UpdateViewresponse result = client
              .views
              .updateViewDetails(name, type, parent, grouping, divide, sorting, filters, columns, teamSidebar, settings, viewId)
              .execute();
      System.out.println(result);
      System.out.println(result.getView());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#updateViewDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateViewresponse> response = client
              .views
              .updateViewDetails(name, type, parent, grouping, divide, sorting, filters, columns, teamSidebar, settings, viewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#updateViewDetails");
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
| **viewId** | **String**|  | |
| **updateViewrequest** | [**UpdateViewrequest**](UpdateViewrequest.md)|  | |

### Return type

[**UpdateViewresponse**](UpdateViewresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

