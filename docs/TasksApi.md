# TasksApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTask**](TasksApi.md#createNewTask) | **POST** /list/{list_id}/task | Create Task |
| [**filterTeamTasks**](TasksApi.md#filterTeamTasks) | **GET** /team/{team_Id}/task | Get Filtered Team Tasks |
| [**getListTasks**](TasksApi.md#getListTasks) | **GET** /list/{list_id}/task | Get Tasks |
| [**getTaskDetails**](TasksApi.md#getTaskDetails) | **GET** /task/{task_id} | Get Task |
| [**getTimeInStatus**](TasksApi.md#getTimeInStatus) | **GET** /task/{task_id}/time_in_status | Get Task&#39;s Time in Status |
| [**getTimeInStatusBulk**](TasksApi.md#getTimeInStatusBulk) | **GET** /task/bulk_time_in_status/task_ids | Get Bulk Tasks&#39; Time in Status |
| [**removeTaskById**](TasksApi.md#removeTaskById) | **DELETE** /task/{task_id} | Delete Task |
| [**updateTaskFields**](TasksApi.md#updateTaskFields) | **PUT** /task/{task_id} | Update Task |


<a name="createNewTask"></a>
# **createNewTask**
> CreateTaskresponse createNewTask(listId, createTaskrequest).customTaskIds(customTaskIds).teamId(teamId).execute();

Create Task

Create a new task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    Double listId = 123D; // 
    List<String> tags = Arrays.asList(); // 
    String description = "description_example";
    List<Integer> assignees = Arrays.asList(); // 
    String status = "status_example";
    Object priority = null;
    Integer dueDate = 56;
    Boolean dueDateTime = true;
    Integer timeEstimate = 56;
    Integer startDate = 56;
    Boolean startDateTime = true;
    Boolean notifyAll = true; // If `notify_all` is true, notifications will be sent to everyone including the creator of the comment.
    Object parent = null; // You can create a subtask by including an existing task ID.\\\\  \\\\ The `parent` task ID you include cannot be a subtask, and must be in the same List specified in the path parameter.
    Object linksTo = null; // Include a task ID to create a linked dependency with your new task.
    Boolean checkRequiredCustomFields = true; // When creating a task via API any required Custom Fields are ignored by default (`false`).\\\\  \\\\ You can enforce required Custom Fields by including `check_required_custom_fields: true`.
    List<CustomFields6> customFields = Arrays.asList(); // [Filter by Custom Fields.](https://clickup.com/api)
    Double customItemId = 3.4D; // To create a task that doesn't use a custom task type, either don't include this field in the request body, or send `'null'`. \\\\  \\\\ To create this task as a Milestone, send a value of `1`.\\\\  \\\\ To use a custom task type, send the custom task type ID as defined in your Workspace, such as `2`.
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      CreateTaskresponse result = client
              .tasks
              .createNewTask(name, listId)
              .tags(tags)
              .description(description)
              .assignees(assignees)
              .status(status)
              .priority(priority)
              .dueDate(dueDate)
              .dueDateTime(dueDateTime)
              .timeEstimate(timeEstimate)
              .startDate(startDate)
              .startDateTime(startDateTime)
              .notifyAll(notifyAll)
              .parent(parent)
              .linksTo(linksTo)
              .checkRequiredCustomFields(checkRequiredCustomFields)
              .customFields(customFields)
              .customItemId(customItemId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCustomId());
      System.out.println(result.getCustomItemId());
      System.out.println(result.getName());
      System.out.println(result.getTextContent());
      System.out.println(result.getStatus());
      System.out.println(result.getOrderindex());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateUpdated());
      System.out.println(result.getDateClosed());
      System.out.println(result.getCreator());
      System.out.println(result.getAssignees());
      System.out.println(result.getChecklists());
      System.out.println(result.getParent());
      System.out.println(result.getPriority());
      System.out.println(result.getDueDate());
      System.out.println(result.getStartDate());
      System.out.println(result.getTimeEstimate());
      System.out.println(result.getTimeSpent());
      System.out.println(result.getCustomFields());
      System.out.println(result.getList());
      System.out.println(result.getFolder());
      System.out.println(result.getSpace());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createNewTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateTaskresponse> response = client
              .tasks
              .createNewTask(name, listId)
              .tags(tags)
              .description(description)
              .assignees(assignees)
              .status(status)
              .priority(priority)
              .dueDate(dueDate)
              .dueDateTime(dueDateTime)
              .timeEstimate(timeEstimate)
              .startDate(startDate)
              .startDateTime(startDateTime)
              .notifyAll(notifyAll)
              .parent(parent)
              .linksTo(linksTo)
              .checkRequiredCustomFields(checkRequiredCustomFields)
              .customFields(customFields)
              .customItemId(customItemId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createNewTask");
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
| **createTaskrequest** | [**CreateTaskrequest**](CreateTaskrequest.md)|  | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**CreateTaskresponse**](CreateTaskresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="filterTeamTasks"></a>
# **filterTeamTasks**
> GetFilteredTeamTasksresponse filterTeamTasks(teamId).page(page).orderBy(orderBy).reverse(reverse).subtasks(subtasks).spaceIds(spaceIds).projectIds(projectIds).listIds(listIds).statuses(statuses).includeClosed(includeClosed).assignees(assignees).tags(tags).dueDateGt(dueDateGt).dueDateLt(dueDateLt).dateCreatedGt(dateCreatedGt).dateCreatedLt(dateCreatedLt).dateUpdatedGt(dateUpdatedGt).dateUpdatedLt(dateUpdatedLt).dateDoneGt(dateDoneGt).dateDoneLt(dateDoneLt).customFields(customFields).customTaskIds(customTaskIds).teamId2(teamId2).parent(parent).includeMarkdownDescription(includeMarkdownDescription).customItems(customItems).execute();

Get Filtered Team Tasks

View the tasks that meet specific criteria from a Workspace. Responses are limited to 100 tasks per page.  \\  \\ You can only view task information of tasks you can access.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    Integer page = 56; // Page to fetch (starts at 0).
    String orderBy = "orderBy_example"; // Order by a particular field. By default, tasks are ordered by `created`.\\  \\ Options include: `id`, `created`, `updated`, and `due_date`.
    Boolean reverse = true; // Tasks are displayed in reverse order.
    Boolean subtasks = true; // Include or exclude subtasks. By default, subtasks are excluded.
    List<String> spaceIds = Arrays.asList(); // Filter by Spaces. For example: \\  \\ `?space_ids[]=1234&space_ids[]=6789`
    List<String> projectIds = Arrays.asList(); // Filter by Folders. For example: \\  \\ `?project_ids[]=1234&project_ids[]=6789`
    List<String> listIds = Arrays.asList(); // Filter by Lists. For example: \\  \\ `?list_ids[]=1234&list_ids[]=6789`
    List<String> statuses = Arrays.asList(); // Filter by statuses. Use `%20` to represent a space character. To include closed tasks, use the `include_closed` parameter. \\  \\ For example: \\  \\ `?statuses[]=to%20do&statuses[]=in%20progress`
    Boolean includeClosed = true; // Include or excluse closed tasks. By default, they are excluded.\\  \\ To include closed tasks, use `include_closed: true`.
    List<String> assignees = Arrays.asList(); // Filter by Assignees using people's ClickUp user id. For example: \\  \\ `?assignees[]=1234&assignees[]=5678`
    List<String> tags = Arrays.asList(); // Filter by tags. User `%20` to represent a space character. For example: \\  \\ `?tags[]=tag1&tags[]=this%20tag`
    Integer dueDateGt = 56; // Filter by due date greater than Unix time in milliseconds.
    Integer dueDateLt = 56; // Filter by due date less than Unix time in milliseconds.
    Integer dateCreatedGt = 56; // Filter by date created greater than Unix time in milliseconds.
    Integer dateCreatedLt = 56; // Filter by date created less than Unix time in milliseconds.
    Integer dateUpdatedGt = 56; // Filter by date updated greater than Unix time in milliseconds.
    Integer dateUpdatedLt = 56; // Filter by date updated less than Unix time in milliseconds.
    Integer dateDoneGt = 56; // Filter by date done greater than Unix time in milliseconds.
    Integer dateDoneLt = 56; // Filter by date done less than Unix time in milliseconds.
    List<String> customFields = Arrays.asList(); // Include tasks with specific values in one or more Custom Fields.\\  \\ For example: `?custom_fields=[{\"field_id\":\"abcdefghi12345678\",\"operator\":\"=\",\"value\":\"1234\"}{\"field_id\":\"jklmnop123456\",\"operator\":\"<\",\"value\":\"5\"}]`\\  \\ Learn more about [filtering using Custom Fields.](https://clickup.com/api)
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId2 = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    String parent = "parent_example"; // Include the parent task ID to return subtasks.
    Boolean includeMarkdownDescription = true; // To return task descriptions in Markdown format, use `?include_markdown_description=true`.
    List<Double> customItems = Arrays.asList(); // Filter by custom task types. For example: \\  \\ `?custom_items[]=0&custom_items[]=1300` \\  \\ Including `0` returns tasks. Including `1` returns Milestones. Including any other number returns the custom task type as defined in your Workspace.
    try {
      GetFilteredTeamTasksresponse result = client
              .tasks
              .filterTeamTasks(teamId)
              .page(page)
              .orderBy(orderBy)
              .reverse(reverse)
              .subtasks(subtasks)
              .spaceIds(spaceIds)
              .projectIds(projectIds)
              .listIds(listIds)
              .statuses(statuses)
              .includeClosed(includeClosed)
              .assignees(assignees)
              .tags(tags)
              .dueDateGt(dueDateGt)
              .dueDateLt(dueDateLt)
              .dateCreatedGt(dateCreatedGt)
              .dateCreatedLt(dateCreatedLt)
              .dateUpdatedGt(dateUpdatedGt)
              .dateUpdatedLt(dateUpdatedLt)
              .dateDoneGt(dateDoneGt)
              .dateDoneLt(dateDoneLt)
              .customFields(customFields)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .parent(parent)
              .includeMarkdownDescription(includeMarkdownDescription)
              .customItems(customItems)
              .execute();
      System.out.println(result);
      System.out.println(result.getTasks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#filterTeamTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetFilteredTeamTasksresponse> response = client
              .tasks
              .filterTeamTasks(teamId)
              .page(page)
              .orderBy(orderBy)
              .reverse(reverse)
              .subtasks(subtasks)
              .spaceIds(spaceIds)
              .projectIds(projectIds)
              .listIds(listIds)
              .statuses(statuses)
              .includeClosed(includeClosed)
              .assignees(assignees)
              .tags(tags)
              .dueDateGt(dueDateGt)
              .dueDateLt(dueDateLt)
              .dateCreatedGt(dateCreatedGt)
              .dateCreatedLt(dateCreatedLt)
              .dateUpdatedGt(dateUpdatedGt)
              .dateUpdatedLt(dateUpdatedLt)
              .dateDoneGt(dateDoneGt)
              .dateDoneLt(dateDoneLt)
              .customFields(customFields)
              .customTaskIds(customTaskIds)
              .teamId2(teamId2)
              .parent(parent)
              .includeMarkdownDescription(includeMarkdownDescription)
              .customItems(customItems)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#filterTeamTasks");
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
| **page** | **Integer**| Page to fetch (starts at 0). | [optional] |
| **orderBy** | **String**| Order by a particular field. By default, tasks are ordered by &#x60;created&#x60;.\\  \\ Options include: &#x60;id&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;, and &#x60;due_date&#x60;. | [optional] |
| **reverse** | **Boolean**| Tasks are displayed in reverse order. | [optional] |
| **subtasks** | **Boolean**| Include or exclude subtasks. By default, subtasks are excluded. | [optional] |
| **spaceIds** | [**List&lt;String&gt;**](String.md)| Filter by Spaces. For example: \\  \\ &#x60;?space_ids[]&#x3D;1234&amp;space_ids[]&#x3D;6789&#x60; | [optional] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Filter by Folders. For example: \\  \\ &#x60;?project_ids[]&#x3D;1234&amp;project_ids[]&#x3D;6789&#x60; | [optional] |
| **listIds** | [**List&lt;String&gt;**](String.md)| Filter by Lists. For example: \\  \\ &#x60;?list_ids[]&#x3D;1234&amp;list_ids[]&#x3D;6789&#x60; | [optional] |
| **statuses** | [**List&lt;String&gt;**](String.md)| Filter by statuses. Use &#x60;%20&#x60; to represent a space character. To include closed tasks, use the &#x60;include_closed&#x60; parameter. \\  \\ For example: \\  \\ &#x60;?statuses[]&#x3D;to%20do&amp;statuses[]&#x3D;in%20progress&#x60; | [optional] |
| **includeClosed** | **Boolean**| Include or excluse closed tasks. By default, they are excluded.\\  \\ To include closed tasks, use &#x60;include_closed: true&#x60;. | [optional] |
| **assignees** | [**List&lt;String&gt;**](String.md)| Filter by Assignees using people&#39;s ClickUp user id. For example: \\  \\ &#x60;?assignees[]&#x3D;1234&amp;assignees[]&#x3D;5678&#x60; | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| Filter by tags. User &#x60;%20&#x60; to represent a space character. For example: \\  \\ &#x60;?tags[]&#x3D;tag1&amp;tags[]&#x3D;this%20tag&#x60; | [optional] |
| **dueDateGt** | **Integer**| Filter by due date greater than Unix time in milliseconds. | [optional] |
| **dueDateLt** | **Integer**| Filter by due date less than Unix time in milliseconds. | [optional] |
| **dateCreatedGt** | **Integer**| Filter by date created greater than Unix time in milliseconds. | [optional] |
| **dateCreatedLt** | **Integer**| Filter by date created less than Unix time in milliseconds. | [optional] |
| **dateUpdatedGt** | **Integer**| Filter by date updated greater than Unix time in milliseconds. | [optional] |
| **dateUpdatedLt** | **Integer**| Filter by date updated less than Unix time in milliseconds. | [optional] |
| **dateDoneGt** | **Integer**| Filter by date done greater than Unix time in milliseconds. | [optional] |
| **dateDoneLt** | **Integer**| Filter by date done less than Unix time in milliseconds. | [optional] |
| **customFields** | [**List&lt;String&gt;**](String.md)| Include tasks with specific values in one or more Custom Fields.\\  \\ For example: &#x60;?custom_fields&#x3D;[{\&quot;field_id\&quot;:\&quot;abcdefghi12345678\&quot;,\&quot;operator\&quot;:\&quot;&#x3D;\&quot;,\&quot;value\&quot;:\&quot;1234\&quot;}{\&quot;field_id\&quot;:\&quot;jklmnop123456\&quot;,\&quot;operator\&quot;:\&quot;&lt;\&quot;,\&quot;value\&quot;:\&quot;5\&quot;}]&#x60;\\  \\ Learn more about [filtering using Custom Fields.](https://clickup.com/api) | [optional] |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId2** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |
| **parent** | **String**| Include the parent task ID to return subtasks. | [optional] |
| **includeMarkdownDescription** | **Boolean**| To return task descriptions in Markdown format, use &#x60;?include_markdown_description&#x3D;true&#x60;. | [optional] |
| **customItems** | [**List&lt;Double&gt;**](Double.md)| Filter by custom task types. For example: \\  \\ &#x60;?custom_items[]&#x3D;0&amp;custom_items[]&#x3D;1300&#x60; \\  \\ Including &#x60;0&#x60; returns tasks. Including &#x60;1&#x60; returns Milestones. Including any other number returns the custom task type as defined in your Workspace. | [optional] |

### Return type

[**GetFilteredTeamTasksresponse**](GetFilteredTeamTasksresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getListTasks"></a>
# **getListTasks**
> GetTasksresponse getListTasks(listId).archived(archived).includeMarkdownDescription(includeMarkdownDescription).page(page).orderBy(orderBy).reverse(reverse).subtasks(subtasks).statuses(statuses).includeClosed(includeClosed).assignees(assignees).tags(tags).dueDateGt(dueDateGt).dueDateLt(dueDateLt).dateCreatedGt(dateCreatedGt).dateCreatedLt(dateCreatedLt).dateUpdatedGt(dateUpdatedGt).dateUpdatedLt(dateUpdatedLt).dateDoneGt(dateDoneGt).dateDoneLt(dateDoneLt).customFields(customFields).customItems(customItems).execute();

Get Tasks

View the tasks in a List. Responses are limited to 100 tasks per page. You can only view task information of tasks you can access. \\  \\ This endpoint only includes tasks where the specified &#x60;list_id&#x60; is their home List. Tasks added to the &#x60;list_id&#x60; with a different home List are not included in the response.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Double listId = 123D; // To find the list_id:<br> 1. In the Sidebar, hover over the List and click the **ellipsis ...** menu.<br> 2. Select **Copy link.**<br> 3. Use the copied URL to find the list_id. The list_id is the number that follows /li in the URL.
    Boolean archived = false; // 
    Boolean includeMarkdownDescription = true; // To return task descriptions in Markdown format, use `?include_markdown_description=true`.
    Integer page = 56; // Page to fetch (starts at 0).
    String orderBy = "orderBy_example"; // Order by a particular field. By default, tasks are ordered by `created`.\\  \\ Options include: `id`, `created`, `updated`, and `due_date`.
    Boolean reverse = true; // Tasks are displayed in reverse order.
    Boolean subtasks = true; // Include or exclude subtasks. By default, subtasks are excluded.
    List<String> statuses = Arrays.asList(); // Filter by statuses. To include closed tasks, use the `include_closed` parameter. \\  \\ For example: \\  \\ `?statuses[]=to%20do&statuses[]=in%20progress`
    Boolean includeClosed = true; // Include or excluse closed tasks. By default, they are excluded.\\  \\ To include closed tasks, use `include_closed: true`.
    List<String> assignees = Arrays.asList(); // Filter by Assignees. For example: \\  \\ `?assignees[]=1234&assignees[]=5678`
    List<String> tags = Arrays.asList(); // Filter by tags. For example: \\  \\ `?tags[]=tag1&tags[]=this%20tag`
    Integer dueDateGt = 56; // Filter by due date greater than Unix time in milliseconds.
    Integer dueDateLt = 56; // Filter by due date less than Unix time in milliseconds.
    Integer dateCreatedGt = 56; // Filter by date created greater than Unix time in milliseconds.
    Integer dateCreatedLt = 56; // Filter by date created less than Unix time in milliseconds.
    Integer dateUpdatedGt = 56; // Filter by date updated greater than Unix time in milliseconds.
    Integer dateUpdatedLt = 56; // Filter by date updated less than Unix time in milliseconds.
    Integer dateDoneGt = 56; // Filter by date done greater than Unix time in milliseconds.
    Integer dateDoneLt = 56; // Filter by date done less than Unix time in milliseconds.
    List<String> customFields = Arrays.asList(); // Include tasks with specific values in multiple Custom Fields.\\  \\ For example: `?custom_fields=[{\"field_id\":\"abcdefghi12345678\",\"operator\":\"=\",\"value\":\"1234\"},{\"field_id\":\"jklmnop123456\",\"operator\":\"<\",\"value\":\"5\"}]`\\  \\ If you want to include tasks with specific values in only one Custom Field, use `custom_field` instead.\\  \\ Learn more about [filtering using Custom Fields.](https://clickup.com/api)
    List<Double> customItems = Arrays.asList(); // Filter by custom task types. For example: \\  \\ `?custom_items[]=0&custom_items[]=1300` \\  \\ Including `0` returns tasks. Including `1` returns Milestones. Including any other number returns the custom task type as defined in your Workspace.
    try {
      GetTasksresponse result = client
              .tasks
              .getListTasks(listId)
              .archived(archived)
              .includeMarkdownDescription(includeMarkdownDescription)
              .page(page)
              .orderBy(orderBy)
              .reverse(reverse)
              .subtasks(subtasks)
              .statuses(statuses)
              .includeClosed(includeClosed)
              .assignees(assignees)
              .tags(tags)
              .dueDateGt(dueDateGt)
              .dueDateLt(dueDateLt)
              .dateCreatedGt(dateCreatedGt)
              .dateCreatedLt(dateCreatedLt)
              .dateUpdatedGt(dateUpdatedGt)
              .dateUpdatedLt(dateUpdatedLt)
              .dateDoneGt(dateDoneGt)
              .dateDoneLt(dateDoneLt)
              .customFields(customFields)
              .customItems(customItems)
              .execute();
      System.out.println(result);
      System.out.println(result.getTasks());
      System.out.println(result.getLastPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getListTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetTasksresponse> response = client
              .tasks
              .getListTasks(listId)
              .archived(archived)
              .includeMarkdownDescription(includeMarkdownDescription)
              .page(page)
              .orderBy(orderBy)
              .reverse(reverse)
              .subtasks(subtasks)
              .statuses(statuses)
              .includeClosed(includeClosed)
              .assignees(assignees)
              .tags(tags)
              .dueDateGt(dueDateGt)
              .dueDateLt(dueDateLt)
              .dateCreatedGt(dateCreatedGt)
              .dateCreatedLt(dateCreatedLt)
              .dateUpdatedGt(dateUpdatedGt)
              .dateUpdatedLt(dateUpdatedLt)
              .dateDoneGt(dateDoneGt)
              .dateDoneLt(dateDoneLt)
              .customFields(customFields)
              .customItems(customItems)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getListTasks");
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
| **listId** | **Double**| To find the list_id:&lt;br&gt; 1. In the Sidebar, hover over the List and click the **ellipsis ...** menu.&lt;br&gt; 2. Select **Copy link.**&lt;br&gt; 3. Use the copied URL to find the list_id. The list_id is the number that follows /li in the URL. | |
| **archived** | **Boolean**|  | [optional] |
| **includeMarkdownDescription** | **Boolean**| To return task descriptions in Markdown format, use &#x60;?include_markdown_description&#x3D;true&#x60;. | [optional] |
| **page** | **Integer**| Page to fetch (starts at 0). | [optional] |
| **orderBy** | **String**| Order by a particular field. By default, tasks are ordered by &#x60;created&#x60;.\\  \\ Options include: &#x60;id&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;, and &#x60;due_date&#x60;. | [optional] |
| **reverse** | **Boolean**| Tasks are displayed in reverse order. | [optional] |
| **subtasks** | **Boolean**| Include or exclude subtasks. By default, subtasks are excluded. | [optional] |
| **statuses** | [**List&lt;String&gt;**](String.md)| Filter by statuses. To include closed tasks, use the &#x60;include_closed&#x60; parameter. \\  \\ For example: \\  \\ &#x60;?statuses[]&#x3D;to%20do&amp;statuses[]&#x3D;in%20progress&#x60; | [optional] |
| **includeClosed** | **Boolean**| Include or excluse closed tasks. By default, they are excluded.\\  \\ To include closed tasks, use &#x60;include_closed: true&#x60;. | [optional] |
| **assignees** | [**List&lt;String&gt;**](String.md)| Filter by Assignees. For example: \\  \\ &#x60;?assignees[]&#x3D;1234&amp;assignees[]&#x3D;5678&#x60; | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| Filter by tags. For example: \\  \\ &#x60;?tags[]&#x3D;tag1&amp;tags[]&#x3D;this%20tag&#x60; | [optional] |
| **dueDateGt** | **Integer**| Filter by due date greater than Unix time in milliseconds. | [optional] |
| **dueDateLt** | **Integer**| Filter by due date less than Unix time in milliseconds. | [optional] |
| **dateCreatedGt** | **Integer**| Filter by date created greater than Unix time in milliseconds. | [optional] |
| **dateCreatedLt** | **Integer**| Filter by date created less than Unix time in milliseconds. | [optional] |
| **dateUpdatedGt** | **Integer**| Filter by date updated greater than Unix time in milliseconds. | [optional] |
| **dateUpdatedLt** | **Integer**| Filter by date updated less than Unix time in milliseconds. | [optional] |
| **dateDoneGt** | **Integer**| Filter by date done greater than Unix time in milliseconds. | [optional] |
| **dateDoneLt** | **Integer**| Filter by date done less than Unix time in milliseconds. | [optional] |
| **customFields** | [**List&lt;String&gt;**](String.md)| Include tasks with specific values in multiple Custom Fields.\\  \\ For example: &#x60;?custom_fields&#x3D;[{\&quot;field_id\&quot;:\&quot;abcdefghi12345678\&quot;,\&quot;operator\&quot;:\&quot;&#x3D;\&quot;,\&quot;value\&quot;:\&quot;1234\&quot;},{\&quot;field_id\&quot;:\&quot;jklmnop123456\&quot;,\&quot;operator\&quot;:\&quot;&lt;\&quot;,\&quot;value\&quot;:\&quot;5\&quot;}]&#x60;\\  \\ If you want to include tasks with specific values in only one Custom Field, use &#x60;custom_field&#x60; instead.\\  \\ Learn more about [filtering using Custom Fields.](https://clickup.com/api) | [optional] |
| **customItems** | [**List&lt;Double&gt;**](Double.md)| Filter by custom task types. For example: \\  \\ &#x60;?custom_items[]&#x3D;0&amp;custom_items[]&#x3D;1300&#x60; \\  \\ Including &#x60;0&#x60; returns tasks. Including &#x60;1&#x60; returns Milestones. Including any other number returns the custom task type as defined in your Workspace. | [optional] |

### Return type

[**GetTasksresponse**](GetTasksresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getTaskDetails"></a>
# **getTaskDetails**
> GetTaskresponse getTaskDetails(taskId).customTaskIds(customTaskIds).teamId(teamId).includeSubtasks(includeSubtasks).includeMarkdownDescription(includeMarkdownDescription).execute();

Get Task

View information about a task. You can only view task information of tasks you can access. \\  \\ Tasks with attachments will return an \&quot;attachments\&quot; response.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    Boolean includeSubtasks = true; // Include subtasks, default false
    Boolean includeMarkdownDescription = true; // To return task descriptions in Markdown format, use `?include_markdown_description=true`.
    try {
      GetTaskresponse result = client
              .tasks
              .getTaskDetails(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .includeSubtasks(includeSubtasks)
              .includeMarkdownDescription(includeMarkdownDescription)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCustomId());
      System.out.println(result.getCustomItemId());
      System.out.println(result.getName());
      System.out.println(result.getTextContent());
      System.out.println(result.getStatus());
      System.out.println(result.getOrderindex());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateUpdated());
      System.out.println(result.getDateClosed());
      System.out.println(result.getCreator());
      System.out.println(result.getAssignees());
      System.out.println(result.getChecklists());
      System.out.println(result.getParent());
      System.out.println(result.getPriority());
      System.out.println(result.getDueDate());
      System.out.println(result.getStartDate());
      System.out.println(result.getTimeEstimate());
      System.out.println(result.getTimeSpent());
      System.out.println(result.getCustomFields());
      System.out.println(result.getList());
      System.out.println(result.getFolder());
      System.out.println(result.getSpace());
      System.out.println(result.getUrl());
      System.out.println(result.getMarkdownDescription());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTaskDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetTaskresponse> response = client
              .tasks
              .getTaskDetails(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .includeSubtasks(includeSubtasks)
              .includeMarkdownDescription(includeMarkdownDescription)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTaskDetails");
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
| **includeSubtasks** | **Boolean**| Include subtasks, default false | [optional] |
| **includeMarkdownDescription** | **Boolean**| To return task descriptions in Markdown format, use &#x60;?include_markdown_description&#x3D;true&#x60;. | [optional] |

### Return type

[**GetTaskresponse**](GetTaskresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getTimeInStatus"></a>
# **getTimeInStatus**
> GetTasksTimeinStatusresponse getTimeInStatus(taskId).customTaskIds(customTaskIds).teamId(teamId).execute();

Get Task&#39;s Time in Status

View how long a task has been in each status. The Total time in Status ClickApp must first be enabled by the Workspace owner or an admin.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    try {
      GetTasksTimeinStatusresponse result = client
              .tasks
              .getTimeInStatus(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrentStatus());
      System.out.println(result.getStatusHistory());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTimeInStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetTasksTimeinStatusresponse> response = client
              .tasks
              .getTimeInStatus(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTimeInStatus");
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

### Return type

[**GetTasksTimeinStatusresponse**](GetTasksTimeinStatusresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getTimeInStatusBulk"></a>
# **getTimeInStatusBulk**
> GetBulkTasksTimeinStatusresponse getTimeInStatusBulk(taskIds).customTaskIds(customTaskIds).teamId(teamId).execute();

Get Bulk Tasks&#39; Time in Status

View how long two or more tasks have been in each status.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskIds = "taskIds_example"; // Include this paramater once per `task_id`. You can include up to 100 task ids per request. For example: `task_ids=3cuh&task_ids=g4fs`
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      GetBulkTasksTimeinStatusresponse result = client
              .tasks
              .getTimeInStatusBulk(taskIds)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.get27075wz());
      System.out.println(result.get20bbn28());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTimeInStatusBulk");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetBulkTasksTimeinStatusresponse> response = client
              .tasks
              .getTimeInStatusBulk(taskIds)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTimeInStatusBulk");
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
| **taskIds** | **String**| Include this paramater once per &#x60;task_id&#x60;. You can include up to 100 task ids per request. For example: &#x60;task_ids&#x3D;3cuh&amp;task_ids&#x3D;g4fs&#x60; | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**GetBulkTasksTimeinStatusresponse**](GetBulkTasksTimeinStatusresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeTaskById"></a>
# **removeTaskById**
> Object removeTaskById(taskId).customTaskIds(customTaskIds).teamId(teamId).execute();

Delete Task

Delete a task from your Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskId = "9xh"; // 
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      Object result = client
              .tasks
              .removeTaskById(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#removeTaskById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tasks
              .removeTaskById(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#removeTaskById");
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

<a name="updateTaskFields"></a>
# **updateTaskFields**
> UpdateTaskresponse updateTaskFields(taskId, updateTaskrequest).customTaskIds(customTaskIds).teamId(teamId).execute();

Update Task

Update a task by including one or more fields in the request body.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskId = "9hx"; // 
    String description = "description_example"; // To clear the task description, include `Description` with `\\\" \\\"`.
    Object customItemId = null; // To convert an item using a custom task type into a task, send `'null'`. \\\\  \\\\ To update this task to be a Milestone, send a value of `1`. \\\\  \\\\ To use a custom task type, send the custom task type ID as defined in your Workspace, such as `2`.
    String name = "name_example";
    String status = "status_example";
    Integer priority = 56;
    Integer dueDate = 56;
    Boolean dueDateTime = true;
    String parent = "parent_example"; // You can move a subtask to another parent task by including `\\\"parent\\\"` with a valid `task id`.\\\\  \\\\ You cannot convert a subtask to a task by setting `\\\"parent\\\"` to `null`.
    Integer timeEstimate = 56;
    Integer startDate = 56;
    Boolean startDateTime = true;
    Assignees assignees = new Assignees();
    Boolean archived = true;
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    try {
      UpdateTaskresponse result = client
              .tasks
              .updateTaskFields(taskId)
              .description(description)
              .customItemId(customItemId)
              .name(name)
              .status(status)
              .priority(priority)
              .dueDate(dueDate)
              .dueDateTime(dueDateTime)
              .parent(parent)
              .timeEstimate(timeEstimate)
              .startDate(startDate)
              .startDateTime(startDateTime)
              .assignees(assignees)
              .archived(archived)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCustomId());
      System.out.println(result.getCustomItemId());
      System.out.println(result.getName());
      System.out.println(result.getTextContent());
      System.out.println(result.getStatus());
      System.out.println(result.getArchived());
      System.out.println(result.getOrderindex());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateUpdated());
      System.out.println(result.getDateClosed());
      System.out.println(result.getCreator());
      System.out.println(result.getAssignees());
      System.out.println(result.getChecklists());
      System.out.println(result.getParent());
      System.out.println(result.getPriority());
      System.out.println(result.getDueDate());
      System.out.println(result.getStartDate());
      System.out.println(result.getTimeEstimate());
      System.out.println(result.getTimeSpent());
      System.out.println(result.getCustomFields());
      System.out.println(result.getList());
      System.out.println(result.getFolder());
      System.out.println(result.getSpace());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#updateTaskFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateTaskresponse> response = client
              .tasks
              .updateTaskFields(taskId)
              .description(description)
              .customItemId(customItemId)
              .name(name)
              .status(status)
              .priority(priority)
              .dueDate(dueDate)
              .dueDateTime(dueDateTime)
              .parent(parent)
              .timeEstimate(timeEstimate)
              .startDate(startDate)
              .startDateTime(startDateTime)
              .assignees(assignees)
              .archived(archived)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#updateTaskFields");
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
| **updateTaskrequest** | [**UpdateTaskrequest**](UpdateTaskrequest.md)| ***Note:** To update Custom Fields on a task, you must use the Set Custom Field endpoint.* | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |

### Return type

[**UpdateTaskresponse**](UpdateTaskresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

