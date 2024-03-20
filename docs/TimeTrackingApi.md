# TimeTrackingApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTagsFromTimeEntries**](TimeTrackingApi.md#addTagsFromTimeEntries) | **POST** /team/{team_id}/time_entries/tags | Add tags from time entries |
| [**changeTagNames**](TimeTrackingApi.md#changeTagNames) | **PUT** /team/{team_id}/time_entries/tags | Change tag names from time entries |
| [**createTimeEntry**](TimeTrackingApi.md#createTimeEntry) | **POST** /team/{team_Id}/time_entries | Create a time entry |
| [**getAllTagsFromTimeEntries**](TimeTrackingApi.md#getAllTagsFromTimeEntries) | **GET** /team/{team_id}/time_entries/tags | Get all tags from time entries |
| [**getCurrentTimeEntry**](TimeTrackingApi.md#getCurrentTimeEntry) | **GET** /team/{team_id}/time_entries/current | Get running time entry |
| [**getSingleTimeEntry**](TimeTrackingApi.md#getSingleTimeEntry) | **GET** /team/{team_id}/time_entries/{timer_id} | Get singular time entry |
| [**getTimeEntriesWithinDateRange**](TimeTrackingApi.md#getTimeEntriesWithinDateRange) | **GET** /team/{team_Id}/time_entries | Get time entries within a date range |
| [**getTimeEntryHistory**](TimeTrackingApi.md#getTimeEntryHistory) | **GET** /team/{team_id}/time_entries/{timer_id}/history | Get time entry history |
| [**removeEntry**](TimeTrackingApi.md#removeEntry) | **DELETE** /team/{team_id}/time_entries/{timer_id} | Delete a time Entry |
| [**removeTagsFromTimeEntries**](TimeTrackingApi.md#removeTagsFromTimeEntries) | **DELETE** /team/{team_id}/time_entries/tags | Remove tags from time entries |
| [**startTimer**](TimeTrackingApi.md#startTimer) | **POST** /team/{team_Id}/time_entries/start | Start a time Entry |
| [**stopTimeEntry**](TimeTrackingApi.md#stopTimeEntry) | **POST** /team/{team_id}/time_entries/stop | Stop a time Entry |
| [**updateTimeEntryDetails**](TimeTrackingApi.md#updateTimeEntryDetails) | **PUT** /team/{team_id}/time_entries/{timer_id} | Update a time Entry |


<a name="addTagsFromTimeEntries"></a>
# **addTagsFromTimeEntries**
> Object addTagsFromTimeEntries(teamId, addtagsfromtimeentriesrequest).execute();

Add tags from time entries

Add a label to a time entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    List<Tags6> tags = Arrays.asList(); // 
    List<String> timeEntryIds = Arrays.asList(); // 
    Double teamId = 123D; // Team ID (Workspace)
    try {
      Object result = client
              .timeTracking
              .addTagsFromTimeEntries(tags, timeEntryIds, teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#addTagsFromTimeEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timeTracking
              .addTagsFromTimeEntries(tags, timeEntryIds, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#addTagsFromTimeEntries");
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
| **addtagsfromtimeentriesrequest** | [**Addtagsfromtimeentriesrequest**](Addtagsfromtimeentriesrequest.md)|  | |

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

<a name="changeTagNames"></a>
# **changeTagNames**
> Object changeTagNames(teamId, changetagnamesfromtimeentriesrequest).execute();

Change tag names from time entries

Rename an time entry label.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String newName = "newName_example";
    String tagBg = "tagBg_example";
    String tagFg = "tagFg_example";
    Double teamId = 123D; // Team ID (Workspace)
    try {
      Object result = client
              .timeTracking
              .changeTagNames(name, newName, tagBg, tagFg, teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#changeTagNames");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timeTracking
              .changeTagNames(name, newName, tagBg, tagFg, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#changeTagNames");
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
| **changetagnamesfromtimeentriesrequest** | [**Changetagnamesfromtimeentriesrequest**](Changetagnamesfromtimeentriesrequest.md)|  | |

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

<a name="createTimeEntry"></a>
# **createTimeEntry**
> Createatimeentryresponse createTimeEntry(teamId, createatimeentryrequest).customTaskIds(customTaskIds).teamId2(teamId2).execute();

Create a time entry

Create a time entry. \\  \\ ***Note:** A time entry that has a negative duration means that timer is currently running for that user.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Integer start = 56;
    Integer duration = 56; // When there are values for both `start` and `end`, `duration` is ignored. The `stop` parameter can be used instead of the `duration` parameter.
    Double teamId = 123D; // Team ID (Workspace)
    List<Tags6> tags = Arrays.asList(); // Users on the Business Plan and above can include a time tracking label.
    String description = "description_example";
    Integer stop = 56; // The `duration` parameter can be used instead of the `stop` parameter. 
    Integer end = 56;
    Boolean billable = true;
    Integer assignee = 56; // Workspace owners and admins can include any user id. Workspace members can only include their own user id.
    String tid = "tid_example";
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId2 = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Createatimeentryresponse result = client
              .timeTracking
              .createTimeEntry(start, duration, teamId)
              .tags(tags)
              .description(description)
              .stop(stop)
              .end(end)
              .billable(billable)
              .assignee(assignee)
              .tid(tid)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getStart());
      System.out.println(result.getBillable());
      System.out.println(result.getDuration());
      System.out.println(result.getAssignee());
      System.out.println(result.getTid());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#createTimeEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Createatimeentryresponse> response = client
              .timeTracking
              .createTimeEntry(start, duration, teamId)
              .tags(tags)
              .description(description)
              .stop(stop)
              .end(end)
              .billable(billable)
              .assignee(assignee)
              .tid(tid)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#createTimeEntry");
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
| **createatimeentryrequest** | [**Createatimeentryrequest**](Createatimeentryrequest.md)| Associate a time entry with a task using the &#x60;tid&#x60; parameter. | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId2** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**Createatimeentryresponse**](Createatimeentryresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getAllTagsFromTimeEntries"></a>
# **getAllTagsFromTimeEntries**
> Getalltagsfromtimeentriesresponse getAllTagsFromTimeEntries(teamId).execute();

Get all tags from time entries

View all the labels that have been applied to time entries in a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
      Getalltagsfromtimeentriesresponse result = client
              .timeTracking
              .getAllTagsFromTimeEntries(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getAllTagsFromTimeEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Getalltagsfromtimeentriesresponse> response = client
              .timeTracking
              .getAllTagsFromTimeEntries(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getAllTagsFromTimeEntries");
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

[**Getalltagsfromtimeentriesresponse**](Getalltagsfromtimeentriesresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getCurrentTimeEntry"></a>
# **getCurrentTimeEntry**
> Getrunningtimeentryresponse getCurrentTimeEntry(teamId).assignee(assignee).execute();

Get running time entry

View a time entry that&#39;s currently tracking time for the authenticated user. \\  \\ ***Note:** A time entry that has a negative duration means that timer is currently running for that user.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    Double assignee = 3.4D; // user id
    try {
      Getrunningtimeentryresponse result = client
              .timeTracking
              .getCurrentTimeEntry(teamId)
              .assignee(assignee)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getCurrentTimeEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Getrunningtimeentryresponse> response = client
              .timeTracking
              .getCurrentTimeEntry(teamId)
              .assignee(assignee)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getCurrentTimeEntry");
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
| **assignee** | **Double**| user id | [optional] |

### Return type

[**Getrunningtimeentryresponse**](Getrunningtimeentryresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getSingleTimeEntry"></a>
# **getSingleTimeEntry**
> Getsingulartimeentryresponse getSingleTimeEntry(teamId, timerId).includeTask(includeTask).includeLocationNames(includeLocationNames).execute();

Get singular time entry

View a single time entry. \\  \\ ***Note:** A time entry that has a negative duration means that timer is currently running for that user.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String timerId = "1963465985517105840"; // The ID of a time entry. \\  \\ This can be found using the [Get Time Entries Within a Date Range](https://clickup.com/api) endpoint.
    Boolean includeTask = true; // Include task  in the response for time entries associated with tasks.
    Boolean includeLocationNames = true; // Include the names of the List, Folder, and Space along with `list_id`,`folder_id`, and `space_id`.
    try {
      Getsingulartimeentryresponse result = client
              .timeTracking
              .getSingleTimeEntry(teamId, timerId)
              .includeTask(includeTask)
              .includeLocationNames(includeLocationNames)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getSingleTimeEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Getsingulartimeentryresponse> response = client
              .timeTracking
              .getSingleTimeEntry(teamId, timerId)
              .includeTask(includeTask)
              .includeLocationNames(includeLocationNames)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getSingleTimeEntry");
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
| **timerId** | **String**| The ID of a time entry. \\  \\ This can be found using the [Get Time Entries Within a Date Range](https://clickup.com/api) endpoint. | |
| **includeTask** | **Boolean**| Include task  in the response for time entries associated with tasks. | [optional] |
| **includeLocationNames** | **Boolean**| Include the names of the List, Folder, and Space along with &#x60;list_id&#x60;,&#x60;folder_id&#x60;, and &#x60;space_id&#x60;. | [optional] |

### Return type

[**Getsingulartimeentryresponse**](Getsingulartimeentryresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getTimeEntriesWithinDateRange"></a>
# **getTimeEntriesWithinDateRange**
> Gettimeentrieswithinadaterangeresponse getTimeEntriesWithinDateRange(teamId).startDate(startDate).endDate(endDate).assignee(assignee).includeTaskTags(includeTaskTags).includeLocationNames(includeLocationNames).spaceId(spaceId).folderId(folderId).listId(listId).taskId(taskId).customTaskIds(customTaskIds).teamId2(teamId2).execute();

Get time entries within a date range

View time entries filtered by start and end date. \\  \\ By default, this endpoint returns time entries from the last 30 days created by the authenticated user. \\  \\ To retrieve time entries for other users, you must include the &#x60;assignee&#x60; query parameter. \\  \\ Only one of the following location filters can be included at a time: &#x60;space_id&#x60;, &#x60;folder_id&#x60;, &#x60;list_id&#x60;, or &#x60;task_id&#x60;. \\  \\ ***Note:** A time entry that has a negative duration means that timer is currently running for that user.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    Double startDate = 3.4D; // Unix time in milliseconds
    Double endDate = 3.4D; // Unix time in milliseconds
    Double assignee = 3.4D; // Filter by `user_id`. For multiple assignees, separate `user_id` using commas.\\  \\  **Example:** `assignee=1234,9876`\\  \\ ***Note:** Only Workspace Owners/Admins have access to do this.*
    Boolean includeTaskTags = true; // Include task tags in the response for time entries associated with tasks.
    Boolean includeLocationNames = true; // Include the names of the List, Folder, and Space along with the `list_id`,`folder_id`, and `space_id`.
    Double spaceId = 3.4D; // Only include time entries associated with tasks in a specific Space.
    Double folderId = 3.4D; // Only include time entries associated with tasks in a specific Folder.
    Double listId = 3.4D; // Only include time entries associated with tasks in a specific List.
    String taskId = "taskId_example"; // Only include time entries associated with a specific task.
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId2 = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Gettimeentrieswithinadaterangeresponse result = client
              .timeTracking
              .getTimeEntriesWithinDateRange(teamId)
              .startDate(startDate)
              .endDate(endDate)
              .assignee(assignee)
              .includeTaskTags(includeTaskTags)
              .includeLocationNames(includeLocationNames)
              .spaceId(spaceId)
              .folderId(folderId)
              .listId(listId)
              .taskId(taskId)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getTimeEntriesWithinDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Gettimeentrieswithinadaterangeresponse> response = client
              .timeTracking
              .getTimeEntriesWithinDateRange(teamId)
              .startDate(startDate)
              .endDate(endDate)
              .assignee(assignee)
              .includeTaskTags(includeTaskTags)
              .includeLocationNames(includeLocationNames)
              .spaceId(spaceId)
              .folderId(folderId)
              .listId(listId)
              .taskId(taskId)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getTimeEntriesWithinDateRange");
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
| **startDate** | **Double**| Unix time in milliseconds | [optional] |
| **endDate** | **Double**| Unix time in milliseconds | [optional] |
| **assignee** | **Double**| Filter by &#x60;user_id&#x60;. For multiple assignees, separate &#x60;user_id&#x60; using commas.\\  \\  **Example:** &#x60;assignee&#x3D;1234,9876&#x60;\\  \\ ***Note:** Only Workspace Owners/Admins have access to do this.* | [optional] |
| **includeTaskTags** | **Boolean**| Include task tags in the response for time entries associated with tasks. | [optional] |
| **includeLocationNames** | **Boolean**| Include the names of the List, Folder, and Space along with the &#x60;list_id&#x60;,&#x60;folder_id&#x60;, and &#x60;space_id&#x60;. | [optional] |
| **spaceId** | **Double**| Only include time entries associated with tasks in a specific Space. | [optional] |
| **folderId** | **Double**| Only include time entries associated with tasks in a specific Folder. | [optional] |
| **listId** | **Double**| Only include time entries associated with tasks in a specific List. | [optional] |
| **taskId** | **String**| Only include time entries associated with a specific task. | [optional] |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId2** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**Gettimeentrieswithinadaterangeresponse**](Gettimeentrieswithinadaterangeresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | If your time entry is associated with a task that uses custom task ids you can expect a &#x60;custom_id&#x60;&#x60; field in the body of the response. The task field will only be included if there is a task associated with a time entry. |  -  |

<a name="getTimeEntryHistory"></a>
# **getTimeEntryHistory**
> Object getTimeEntryHistory(teamId, timerId).execute();

Get time entry history

View a list of changes made to a time entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String timerId = "1963465985517105840"; // The ID of a time entry. \\  \\ This can be found using the [Get Time Entries Within a Date Range](https://clickup.com/api/clickupreference/operation/Gettimeentrieswithinadaterange/) endpoint.
    try {
      Object result = client
              .timeTracking
              .getTimeEntryHistory(teamId, timerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getTimeEntryHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timeTracking
              .getTimeEntryHistory(teamId, timerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getTimeEntryHistory");
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
| **timerId** | **String**| The ID of a time entry. \\  \\ This can be found using the [Get Time Entries Within a Date Range](https://clickup.com/api/clickupreference/operation/Gettimeentrieswithinadaterange/) endpoint. | |

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

<a name="removeEntry"></a>
# **removeEntry**
> DeleteatimeEntryresponse removeEntry(teamId, timerId).execute();

Delete a time Entry

Delete a time entry from a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    Double timerId = 3.4D; // Array of timer ids to delete separated by commas
    try {
      DeleteatimeEntryresponse result = client
              .timeTracking
              .removeEntry(teamId, timerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#removeEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeleteatimeEntryresponse> response = client
              .timeTracking
              .removeEntry(teamId, timerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#removeEntry");
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
| **timerId** | **Double**| Array of timer ids to delete separated by commas | |

### Return type

[**DeleteatimeEntryresponse**](DeleteatimeEntryresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeTagsFromTimeEntries"></a>
# **removeTagsFromTimeEntries**
> Object removeTagsFromTimeEntries(teamId, removetagsfromtimeentriesrequest).execute();

Remove tags from time entries

Remove labels from time entries. This does not remove the label from a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    List<Tags10> tags = Arrays.asList(); // 
    List<String> timeEntryIds = Arrays.asList(); // 
    Double teamId = 123D; // Team ID (Workspace)
    try {
      Object result = client
              .timeTracking
              .removeTagsFromTimeEntries(tags, timeEntryIds, teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#removeTagsFromTimeEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timeTracking
              .removeTagsFromTimeEntries(tags, timeEntryIds, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#removeTagsFromTimeEntries");
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
| **removetagsfromtimeentriesrequest** | [**Removetagsfromtimeentriesrequest**](Removetagsfromtimeentriesrequest.md)|  | |

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

<a name="startTimer"></a>
# **startTimer**
> StartatimeEntryresponse startTimer(teamId, startatimeEntryrequest).customTaskIds(customTaskIds).teamId2(teamId2).execute();

Start a time Entry

Start a timer for the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    List<Tags10> tags = Arrays.asList(); // Users on the Business Plan and above can include a time tracking label.
    String description = "description_example";
    String tid = "tid_example";
    Boolean billable = true;
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId2 = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      StartatimeEntryresponse result = client
              .timeTracking
              .startTimer(teamId)
              .tags(tags)
              .description(description)
              .tid(tid)
              .billable(billable)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#startTimer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StartatimeEntryresponse> response = client
              .timeTracking
              .startTimer(teamId)
              .tags(tags)
              .description(description)
              .tid(tid)
              .billable(billable)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#startTimer");
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
| **startatimeEntryrequest** | [**StartatimeEntryrequest**](StartatimeEntryrequest.md)| For Workspaces on the Free Forever or Unlimited Plan, either the &#x60;timer_id&#x60; parameter or the &#x60;\&quot;tid\&quot;&#x60; field in the body of the request are required fields. | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId2** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**StartatimeEntryresponse**](StartatimeEntryresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="stopTimeEntry"></a>
# **stopTimeEntry**
> StopatimeEntryresponse stopTimeEntry(teamId).execute();

Stop a time Entry

Stop a timer that&#39;s currently running for the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
      StopatimeEntryresponse result = client
              .timeTracking
              .stopTimeEntry(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#stopTimeEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StopatimeEntryresponse> response = client
              .timeTracking
              .stopTimeEntry(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#stopTimeEntry");
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

[**StopatimeEntryresponse**](StopatimeEntryresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateTimeEntryDetails"></a>
# **updateTimeEntryDetails**
> Object updateTimeEntryDetails(teamId, timerId, updateatimeEntryrequest).customTaskIds(customTaskIds).teamId2(teamId2).execute();

Update a time Entry

Update the details of a time entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    List<Tags6> tags = Arrays.asList(); // Users on the Business Plan and above can include a time tracking label.
    Double teamId = 123D; // Team ID (Workspace)
    Double timerId = 2004673344540003600D; // 
    String description = "description_example";
    String tagAction = "tagAction_example";
    Integer start = 56; // When providing `start`, you must also provide `end`.
    Integer end = 56; // When providing `end`, you must also provide `start`.
    String tid = "tid_example";
    Boolean billable = true;
    Integer duration = 56;
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId2 = 123D; // Only used when the parameter is set to `custom_task_ids=true`\\  \\ For example: `custom_task_ids=true&team_id=123`
    try {
      Object result = client
              .timeTracking
              .updateTimeEntryDetails(tags, teamId, timerId)
              .description(description)
              .tagAction(tagAction)
              .start(start)
              .end(end)
              .tid(tid)
              .billable(billable)
              .duration(duration)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#updateTimeEntryDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timeTracking
              .updateTimeEntryDetails(tags, teamId, timerId)
              .description(description)
              .tagAction(tagAction)
              .start(start)
              .end(end)
              .tid(tid)
              .billable(billable)
              .duration(duration)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#updateTimeEntryDetails");
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
| **timerId** | **Double**|  | |
| **updateatimeEntryrequest** | [**UpdateatimeEntryrequest**](UpdateatimeEntryrequest.md)| Accessible tag actions are &#x60;[\&quot;replace\&quot;, \&quot;add\&quot;, \&quot;remove\&quot;]&#x60; | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId2** | **Double**| Only used when the parameter is set to &#x60;custom_task_ids&#x3D;true&#x60;\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60; | [optional] |

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

