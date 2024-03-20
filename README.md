<div align="left">

[![Visit Clickup](./header.png)](https://clickup.com)

# [Clickup](https://clickup.com)

This is the ClickUp API Reference where you can learn about specific endpoints and parameters in detail.

Browse the available endpoints using the sidebar on the left.

**Not sure where to begin?**
[Get Started with the ClickUp API](https://clickup.com/api)


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=ClickUp&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>click-up-java-sdk</artifactId>
  <version>2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:click-up-java-sdk:2.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/click-up-java-sdk-2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttachmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String taskId = "9hv"; // 
    Boolean customTaskIds = true; // If you want to reference a task by it's custom task id, this value must be `true`.
    Double teamId = 123D; // Only used when the `custom_task_ids` parameter is set to `true`.\\  \\ For example: `custom_task_ids=true&team_id=123`.
    List<Object> attachment = Arrays.asList(null);
    try {
      CreateTaskAttachmentresponse result = client
              .attachments
              .uploadFileToTaskAsAttachment(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .attachment(attachment)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getDate());
      System.out.println(result.getExtension());
      System.out.println(result.getThumbnailSmall());
      System.out.println(result.getThumbnailLarge());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#uploadFileToTaskAsAttachment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateTaskAttachmentresponse> response = client
              .attachments
              .uploadFileToTaskAsAttachment(taskId)
              .customTaskIds(customTaskIds)
              .teamId(teamId)
              .attachment(attachment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#uploadFileToTaskAsAttachment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.clickup.com/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttachmentsApi* | [**uploadFileToTaskAsAttachment**](docs/AttachmentsApi.md#uploadFileToTaskAsAttachment) | **POST** /task/{task_id}/attachment | Create Task Attachment
*AuthorizationApi* | [**getAccessToken**](docs/AuthorizationApi.md#getAccessToken) | **POST** /oauth/token | Get Access Token
*AuthorizationApi* | [**getWorkspaceList**](docs/AuthorizationApi.md#getWorkspaceList) | **GET** /team | Get Authorized Teams (Workspaces)
*AuthorizationApi* | [**viewAccountDetails**](docs/AuthorizationApi.md#viewAccountDetails) | **GET** /user | Get Authorized User
*CommentsApi* | [**addToListComment**](docs/CommentsApi.md#addToListComment) | **POST** /list/{list_id}/comment | Create List Comment
*CommentsApi* | [**createChatViewComment**](docs/CommentsApi.md#createChatViewComment) | **POST** /view/{view_id}/comment | Create Chat View Comment
*CommentsApi* | [**createNewTaskComment**](docs/CommentsApi.md#createNewTaskComment) | **POST** /task/{task_id}/comment | Create Task Comment
*CommentsApi* | [**deleteTaskComment**](docs/CommentsApi.md#deleteTaskComment) | **DELETE** /comment/{comment_id} | Delete Comment
*CommentsApi* | [**getListComments**](docs/CommentsApi.md#getListComments) | **GET** /list/{list_id}/comment | Get List Comments
*CommentsApi* | [**getTaskComments**](docs/CommentsApi.md#getTaskComments) | **GET** /task/{task_id}/comment | Get Task Comments
*CommentsApi* | [**getViewComments**](docs/CommentsApi.md#getViewComments) | **GET** /view/{view_id}/comment | Get Chat View Comments
*CommentsApi* | [**updateTaskComment**](docs/CommentsApi.md#updateTaskComment) | **PUT** /comment/{comment_id} | Update Comment
*CustomFieldsApi* | [**getListFields**](docs/CustomFieldsApi.md#getListFields) | **GET** /list/{list_id}/field | Get Accessible Custom Fields
*CustomFieldsApi* | [**removeFieldValue**](docs/CustomFieldsApi.md#removeFieldValue) | **DELETE** /task/{task_id}/field/{field_id} | Remove Custom Field Value
*CustomFieldsApi* | [**setFieldValue**](docs/CustomFieldsApi.md#setFieldValue) | **POST** /task/{task_id}/field/{field_id} | Set Custom Field Value
*CustomTaskTypesApi* | [**getAvailableTaskTypes**](docs/CustomTaskTypesApi.md#getAvailableTaskTypes) | **GET** /team/{team_id}/custom_item | Get Custom Task Types
*FoldersApi* | [**createNewFolder**](docs/FoldersApi.md#createNewFolder) | **POST** /space/{space_id}/folder | Create Folder
*FoldersApi* | [**getContentsOf**](docs/FoldersApi.md#getContentsOf) | **GET** /space/{space_id}/folder | Get Folders
*FoldersApi* | [**getFolderContent**](docs/FoldersApi.md#getFolderContent) | **GET** /folder/{folder_id} | Get Folder
*FoldersApi* | [**removeFolder**](docs/FoldersApi.md#removeFolder) | **DELETE** /folder/{folder_id} | Delete Folder
*FoldersApi* | [**renameFolder**](docs/FoldersApi.md#renameFolder) | **PUT** /folder/{folder_id} | Update Folder
*GoalsApi* | [**addKeyResult**](docs/GoalsApi.md#addKeyResult) | **POST** /goal/{goal_id}/key_result | Create Key Result
*GoalsApi* | [**addNewGoalToWorkspace**](docs/GoalsApi.md#addNewGoalToWorkspace) | **POST** /team/{team_id}/goal | Create Goal
*GoalsApi* | [**getDetails**](docs/GoalsApi.md#getDetails) | **GET** /goal/{goal_id} | Get Goal
*GoalsApi* | [**getWorkspaceGoals**](docs/GoalsApi.md#getWorkspaceGoals) | **GET** /team/{team_id}/goal | Get Goals
*GoalsApi* | [**removeGoal**](docs/GoalsApi.md#removeGoal) | **DELETE** /goal/{goal_id} | Delete Goal
*GoalsApi* | [**removeTarget**](docs/GoalsApi.md#removeTarget) | **DELETE** /key_result/{key_result_id} | Delete Key Result
*GoalsApi* | [**updateGoalDetails**](docs/GoalsApi.md#updateGoalDetails) | **PUT** /goal/{goal_id} | Update Goal
*GoalsApi* | [**updateKeyResult**](docs/GoalsApi.md#updateKeyResult) | **PUT** /key_result/{key_result_id} | Edit Key Result
*GuestsApi* | [**addGuestToFolder**](docs/GuestsApi.md#addGuestToFolder) | **POST** /folder/{folder_id}/guest/{guest_id} | Add Guest To Folder
*GuestsApi* | [**addToTask**](docs/GuestsApi.md#addToTask) | **POST** /task/{task_id}/guest/{guest_id} | Add Guest To Task
*GuestsApi* | [**editGuestOnWorkspace**](docs/GuestsApi.md#editGuestOnWorkspace) | **PUT** /team/{team_id}/guest/{guest_id} | Edit Guest On Workspace
*GuestsApi* | [**getGuestInformation**](docs/GuestsApi.md#getGuestInformation) | **GET** /team/{team_id}/guest/{guest_id} | Get Guest
*GuestsApi* | [**inviteToWorkspace**](docs/GuestsApi.md#inviteToWorkspace) | **POST** /team/{team_id}/guest | Invite Guest To Workspace
*GuestsApi* | [**removeFromList**](docs/GuestsApi.md#removeFromList) | **DELETE** /list/{list_id}/guest/{guest_id} | Remove Guest From List
*GuestsApi* | [**revokeAccessFromFolder**](docs/GuestsApi.md#revokeAccessFromFolder) | **DELETE** /folder/{folder_id}/guest/{guest_id} | Remove Guest From Folder
*GuestsApi* | [**revokeAccessToTask**](docs/GuestsApi.md#revokeAccessToTask) | **DELETE** /task/{task_id}/guest/{guest_id} | Remove Guest From Task
*GuestsApi* | [**revokeGuestAccessToWorkspace**](docs/GuestsApi.md#revokeGuestAccessToWorkspace) | **DELETE** /team/{team_id}/guest/{guest_id} | Remove Guest From Workspace
*GuestsApi* | [**shareListWith**](docs/GuestsApi.md#shareListWith) | **POST** /list/{list_id}/guest/{guest_id} | Add Guest To List
*ListsApi* | [**addTaskToList**](docs/ListsApi.md#addTaskToList) | **POST** /list/{list_id}/task/{task_id} | Add Task To List
*ListsApi* | [**addToFolder**](docs/ListsApi.md#addToFolder) | **POST** /folder/{folder_id}/list | Create List
*ListsApi* | [**createFolderlessList**](docs/ListsApi.md#createFolderlessList) | **POST** /space/{space_id}/list | Create Folderless List
*ListsApi* | [**getFolderLists**](docs/ListsApi.md#getFolderLists) | **GET** /folder/{folder_id}/list | Get Lists
*ListsApi* | [**getFolderless**](docs/ListsApi.md#getFolderless) | **GET** /space/{space_id}/list | Get Folderless Lists
*ListsApi* | [**getListDetails**](docs/ListsApi.md#getListDetails) | **GET** /list/{list_id} | Get List
*ListsApi* | [**removeList**](docs/ListsApi.md#removeList) | **DELETE** /list/{list_id} | Delete List
*ListsApi* | [**removeTaskFromList**](docs/ListsApi.md#removeTaskFromList) | **DELETE** /list/{list_id}/task/{task_id} | Remove Task From List
*ListsApi* | [**updateListInfoDueDatePriorityAssigneeColor**](docs/ListsApi.md#updateListInfoDueDatePriorityAssigneeColor) | **PUT** /list/{list_id} | Update List
*MembersApi* | [**getListUsers**](docs/MembersApi.md#getListUsers) | **GET** /list/{list_id}/member | Get List Members
*MembersApi* | [**getTaskAccess**](docs/MembersApi.md#getTaskAccess) | **GET** /task/{task_id}/member | Get Task Members
*RolesApi* | [**listAvailableCustomRoles**](docs/RolesApi.md#listAvailableCustomRoles) | **GET** /team/{team_id}/customroles | Get Custom Roles
*SharedHierarchyApi* | [**viewTasksListsFolders**](docs/SharedHierarchyApi.md#viewTasksListsFolders) | **GET** /team/{team_id}/shared | Shared Hierarchy
*SpacesApi* | [**addNewSpaceToWorkspace**](docs/SpacesApi.md#addNewSpaceToWorkspace) | **POST** /team/{team_id}/space | Create Space
*SpacesApi* | [**getDetails**](docs/SpacesApi.md#getDetails) | **GET** /space/{space_id} | Get Space
*SpacesApi* | [**getSpaceDetails**](docs/SpacesApi.md#getSpaceDetails) | **GET** /team/{team_id}/space | Get Spaces
*SpacesApi* | [**removeSpace**](docs/SpacesApi.md#removeSpace) | **DELETE** /space/{space_id} | Delete Space
*SpacesApi* | [**updateDetailsAndEnableClickApps**](docs/SpacesApi.md#updateDetailsAndEnableClickApps) | **PUT** /space/{space_id} | Update Space
*TagsApi* | [**addToTask**](docs/TagsApi.md#addToTask) | **POST** /task/{task_id}/tag/{tag_name} | Add Tag To Task
*TagsApi* | [**createSpaceTag**](docs/TagsApi.md#createSpaceTag) | **POST** /space/{space_id}/tag | Create Space Tag
*TagsApi* | [**getSpace**](docs/TagsApi.md#getSpace) | **GET** /space/{space_id}/tag | Get Space Tags
*TagsApi* | [**removeFromTask**](docs/TagsApi.md#removeFromTask) | **DELETE** /task/{task_id}/tag/{tag_name} | Remove Tag From Task
*TagsApi* | [**removeSpaceTag**](docs/TagsApi.md#removeSpaceTag) | **DELETE** /space/{space_id}/tag/{tag_name} | Delete Space Tag
*TagsApi* | [**updateSpaceTag**](docs/TagsApi.md#updateSpaceTag) | **PUT** /space/{space_id}/tag/{tag_name} | Edit Space Tag
*TaskChecklistsApi* | [**addLineItem**](docs/TaskChecklistsApi.md#addLineItem) | **POST** /checklist/{checklist_id}/checklist_item | Create Checklist Item
*TaskChecklistsApi* | [**createNewChecklist**](docs/TaskChecklistsApi.md#createNewChecklist) | **POST** /task/{task_id}/checklist | Create Checklist
*TaskChecklistsApi* | [**removeChecklist**](docs/TaskChecklistsApi.md#removeChecklist) | **DELETE** /checklist/{checklist_id} | Delete Checklist
*TaskChecklistsApi* | [**removeChecklistItem**](docs/TaskChecklistsApi.md#removeChecklistItem) | **DELETE** /checklist/{checklist_id}/checklist_item/{checklist_item_id} | Delete Checklist Item
*TaskChecklistsApi* | [**updateChecklist**](docs/TaskChecklistsApi.md#updateChecklist) | **PUT** /checklist/{checklist_id} | Edit Checklist
*TaskChecklistsApi* | [**updateChecklistItem**](docs/TaskChecklistsApi.md#updateChecklistItem) | **PUT** /checklist/{checklist_id}/checklist_item/{checklist_item_id} | Edit Checklist Item
*TaskRelationshipsApi* | [**addDependency**](docs/TaskRelationshipsApi.md#addDependency) | **POST** /task/{task_id}/dependency | Add Dependency
*TaskRelationshipsApi* | [**linkTasks**](docs/TaskRelationshipsApi.md#linkTasks) | **POST** /task/{task_id}/link/{links_to} | Add Task Link
*TaskRelationshipsApi* | [**removeDependency**](docs/TaskRelationshipsApi.md#removeDependency) | **DELETE** /task/{task_id}/dependency | Delete Dependency
*TaskRelationshipsApi* | [**removeLinkBetweenTasks**](docs/TaskRelationshipsApi.md#removeLinkBetweenTasks) | **DELETE** /task/{task_id}/link/{links_to} | Delete Task Link
*TaskTemplatesApi* | [**createFromTemplate**](docs/TaskTemplatesApi.md#createFromTemplate) | **POST** /list/{list_id}/taskTemplate/{template_id} | Create Task From Template
*TaskTemplatesApi* | [**getTemplates**](docs/TaskTemplatesApi.md#getTemplates) | **GET** /team/{team_id}/taskTemplate | Get Task Templates
*TasksApi* | [**createNewTask**](docs/TasksApi.md#createNewTask) | **POST** /list/{list_id}/task | Create Task
*TasksApi* | [**filterTeamTasks**](docs/TasksApi.md#filterTeamTasks) | **GET** /team/{team_Id}/task | Get Filtered Team Tasks
*TasksApi* | [**getListTasks**](docs/TasksApi.md#getListTasks) | **GET** /list/{list_id}/task | Get Tasks
*TasksApi* | [**getTaskDetails**](docs/TasksApi.md#getTaskDetails) | **GET** /task/{task_id} | Get Task
*TasksApi* | [**getTimeInStatus**](docs/TasksApi.md#getTimeInStatus) | **GET** /task/{task_id}/time_in_status | Get Task&#39;s Time in Status
*TasksApi* | [**getTimeInStatusBulk**](docs/TasksApi.md#getTimeInStatusBulk) | **GET** /task/bulk_time_in_status/task_ids | Get Bulk Tasks&#39; Time in Status
*TasksApi* | [**removeTaskById**](docs/TasksApi.md#removeTaskById) | **DELETE** /task/{task_id} | Delete Task
*TasksApi* | [**updateTaskFields**](docs/TasksApi.md#updateTaskFields) | **PUT** /task/{task_id} | Update Task
*TeamsUserGroupsApi* | [**createTeam**](docs/TeamsUserGroupsApi.md#createTeam) | **POST** /team/{team_id}/group | Create Team
*TeamsUserGroupsApi* | [**getUserGroups**](docs/TeamsUserGroupsApi.md#getUserGroups) | **GET** /group | Get Teams
*TeamsUserGroupsApi* | [**removeGroup**](docs/TeamsUserGroupsApi.md#removeGroup) | **DELETE** /group/{group_id} | Delete Team
*TeamsUserGroupsApi* | [**updateUserGroup**](docs/TeamsUserGroupsApi.md#updateUserGroup) | **PUT** /group/{group_id} | Update Team
*TeamsWorkspacesApi* | [**getWorkspaceList**](docs/TeamsWorkspacesApi.md#getWorkspaceList) | **GET** /team | Get Authorized Teams (Workspaces)
*TeamsWorkspacesApi* | [**getWorkspacePlan**](docs/TeamsWorkspacesApi.md#getWorkspacePlan) | **GET** /team/{team_id}/plan | Get Workspace Plan
*TeamsWorkspacesApi* | [**getWorkspaceSeats**](docs/TeamsWorkspacesApi.md#getWorkspaceSeats) | **GET** /team/{team_id}/seats | Get Workspace seats
*TimeTrackingApi* | [**addTagsFromTimeEntries**](docs/TimeTrackingApi.md#addTagsFromTimeEntries) | **POST** /team/{team_id}/time_entries/tags | Add tags from time entries
*TimeTrackingApi* | [**changeTagNames**](docs/TimeTrackingApi.md#changeTagNames) | **PUT** /team/{team_id}/time_entries/tags | Change tag names from time entries
*TimeTrackingApi* | [**createTimeEntry**](docs/TimeTrackingApi.md#createTimeEntry) | **POST** /team/{team_Id}/time_entries | Create a time entry
*TimeTrackingApi* | [**getAllTagsFromTimeEntries**](docs/TimeTrackingApi.md#getAllTagsFromTimeEntries) | **GET** /team/{team_id}/time_entries/tags | Get all tags from time entries
*TimeTrackingApi* | [**getCurrentTimeEntry**](docs/TimeTrackingApi.md#getCurrentTimeEntry) | **GET** /team/{team_id}/time_entries/current | Get running time entry
*TimeTrackingApi* | [**getSingleTimeEntry**](docs/TimeTrackingApi.md#getSingleTimeEntry) | **GET** /team/{team_id}/time_entries/{timer_id} | Get singular time entry
*TimeTrackingApi* | [**getTimeEntriesWithinDateRange**](docs/TimeTrackingApi.md#getTimeEntriesWithinDateRange) | **GET** /team/{team_Id}/time_entries | Get time entries within a date range
*TimeTrackingApi* | [**getTimeEntryHistory**](docs/TimeTrackingApi.md#getTimeEntryHistory) | **GET** /team/{team_id}/time_entries/{timer_id}/history | Get time entry history
*TimeTrackingApi* | [**removeEntry**](docs/TimeTrackingApi.md#removeEntry) | **DELETE** /team/{team_id}/time_entries/{timer_id} | Delete a time Entry
*TimeTrackingApi* | [**removeTagsFromTimeEntries**](docs/TimeTrackingApi.md#removeTagsFromTimeEntries) | **DELETE** /team/{team_id}/time_entries/tags | Remove tags from time entries
*TimeTrackingApi* | [**startTimer**](docs/TimeTrackingApi.md#startTimer) | **POST** /team/{team_Id}/time_entries/start | Start a time Entry
*TimeTrackingApi* | [**stopTimeEntry**](docs/TimeTrackingApi.md#stopTimeEntry) | **POST** /team/{team_id}/time_entries/stop | Stop a time Entry
*TimeTrackingApi* | [**updateTimeEntryDetails**](docs/TimeTrackingApi.md#updateTimeEntryDetails) | **PUT** /team/{team_id}/time_entries/{timer_id} | Update a time Entry
*TimeTrackingLegacyApi* | [**editTimeTracked**](docs/TimeTrackingLegacyApi.md#editTimeTracked) | **PUT** /task/{task_id}/time/{interval_id} | Edit time tracked
*TimeTrackingLegacyApi* | [**getTrackedTime**](docs/TimeTrackingLegacyApi.md#getTrackedTime) | **GET** /task/{task_id}/time | Get tracked time
*TimeTrackingLegacyApi* | [**recordTimeForTask**](docs/TimeTrackingLegacyApi.md#recordTimeForTask) | **POST** /task/{task_id}/time | Track time
*TimeTrackingLegacyApi* | [**removeTrackedTime**](docs/TimeTrackingLegacyApi.md#removeTrackedTime) | **DELETE** /task/{task_id}/time/{interval_id} | Delete time tracked
*UsersApi* | [**deactivateFromWorkspace**](docs/UsersApi.md#deactivateFromWorkspace) | **DELETE** /team/{team_id}/user/{user_id} | Remove User From Workspace
*UsersApi* | [**getUserDetails**](docs/UsersApi.md#getUserDetails) | **GET** /team/{team_id}/user/{user_id} | Get User
*UsersApi* | [**inviteUserToWorkspace**](docs/UsersApi.md#inviteUserToWorkspace) | **POST** /team/{team_id}/user | Invite User To Workspace
*UsersApi* | [**updateUserDetails**](docs/UsersApi.md#updateUserDetails) | **PUT** /team/{team_id}/user/{user_id} | Edit User On Workspace
*ViewsApi* | [**addViewToFolder**](docs/ViewsApi.md#addViewToFolder) | **POST** /folder/{folder_id}/view | Create Folder View
*ViewsApi* | [**addViewToList**](docs/ViewsApi.md#addViewToList) | **POST** /list/{list_id}/view | Create List View
*ViewsApi* | [**addViewToSpace**](docs/ViewsApi.md#addViewToSpace) | **POST** /space/{space_id}/view | Create Space View
*ViewsApi* | [**createWorkspaceViewEverythingLevel**](docs/ViewsApi.md#createWorkspaceViewEverythingLevel) | **POST** /team/{team_id}/view | Create Workspace (Everything level) View
*ViewsApi* | [**deleteViewById**](docs/ViewsApi.md#deleteViewById) | **DELETE** /view/{view_id} | Delete View
*ViewsApi* | [**folderViewsGet**](docs/ViewsApi.md#folderViewsGet) | **GET** /folder/{folder_id}/view | Get Folder Views
*ViewsApi* | [**getEverythingLevel**](docs/ViewsApi.md#getEverythingLevel) | **GET** /team/{team_id}/view | Get Workspace (Everything level) Views
*ViewsApi* | [**getListViews**](docs/ViewsApi.md#getListViews) | **GET** /list/{list_id}/view | Get List Views
*ViewsApi* | [**getTasksInView**](docs/ViewsApi.md#getTasksInView) | **GET** /view/{view_id}/task | Get View Tasks
*ViewsApi* | [**getViewInfo**](docs/ViewsApi.md#getViewInfo) | **GET** /view/{view_id} | Get View
*ViewsApi* | [**spaceViewsGet**](docs/ViewsApi.md#spaceViewsGet) | **GET** /space/{space_id}/view | Get Space Views
*ViewsApi* | [**updateViewDetails**](docs/ViewsApi.md#updateViewDetails) | **PUT** /view/{view_id} | Update View
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /team/{team_id}/webhook | Create Webhook
*WebhooksApi* | [**removeWebhookById**](docs/WebhooksApi.md#removeWebhookById) | **DELETE** /webhook/{webhook_id} | Delete Webhook
*WebhooksApi* | [**updateEventsToMonitor**](docs/WebhooksApi.md#updateEventsToMonitor) | **PUT** /webhook/{webhook_id} | Update Webhook
*WebhooksApi* | [**workspaceGet**](docs/WebhooksApi.md#workspaceGet) | **GET** /team/{team_id}/webhook | Get Webhooks


## Documentation for Models

 - [AddDependencyrequest](docs/AddDependencyrequest.md)
 - [AddGuestToFolderrequest](docs/AddGuestToFolderrequest.md)
 - [AddGuestToFolderresponse](docs/AddGuestToFolderresponse.md)
 - [AddGuestToListrequest](docs/AddGuestToListrequest.md)
 - [AddGuestToListresponse](docs/AddGuestToListresponse.md)
 - [AddGuestToTaskrequest](docs/AddGuestToTaskrequest.md)
 - [AddGuestToTaskresponse](docs/AddGuestToTaskresponse.md)
 - [AddTaskLinkresponse](docs/AddTaskLinkresponse.md)
 - [Addtagsfromtimeentriesrequest](docs/Addtagsfromtimeentriesrequest.md)
 - [AssignedBy](docs/AssignedBy.md)
 - [Assignee](docs/Assignee.md)
 - [Assignee3](docs/Assignee3.md)
 - [Assignees](docs/Assignees.md)
 - [Assignees1](docs/Assignees1.md)
 - [AttachmentsUploadFileToTaskAsAttachmentRequest](docs/AttachmentsUploadFileToTaskAsAttachmentRequest.md)
 - [Avatar](docs/Avatar.md)
 - [Changetagnamesfromtimeentriesrequest](docs/Changetagnamesfromtimeentriesrequest.md)
 - [Checklist](docs/Checklist.md)
 - [Checklist1](docs/Checklist1.md)
 - [Checklist2](docs/Checklist2.md)
 - [Checklists](docs/Checklists.md)
 - [Checklists6](docs/Checklists6.md)
 - [Columns](docs/Columns.md)
 - [Comment](docs/Comment.md)
 - [Comment1](docs/Comment1.md)
 - [Comment2](docs/Comment2.md)
 - [CreateChatViewCommentrequest](docs/CreateChatViewCommentrequest.md)
 - [CreateChatViewCommentresponse](docs/CreateChatViewCommentresponse.md)
 - [CreateChecklistItemrequest](docs/CreateChecklistItemrequest.md)
 - [CreateChecklistItemresponse](docs/CreateChecklistItemresponse.md)
 - [CreateChecklistrequest](docs/CreateChecklistrequest.md)
 - [CreateChecklistresponse](docs/CreateChecklistresponse.md)
 - [CreateFolderViewrequest](docs/CreateFolderViewrequest.md)
 - [CreateFolderViewresponse](docs/CreateFolderViewresponse.md)
 - [CreateFolderlessListrequest](docs/CreateFolderlessListrequest.md)
 - [CreateFolderlessListresponse](docs/CreateFolderlessListresponse.md)
 - [CreateFolderrequest](docs/CreateFolderrequest.md)
 - [CreateFolderresponse](docs/CreateFolderresponse.md)
 - [CreateGoalrequest](docs/CreateGoalrequest.md)
 - [CreateGoalresponse](docs/CreateGoalresponse.md)
 - [CreateKeyResultrequest](docs/CreateKeyResultrequest.md)
 - [CreateKeyResultresponse](docs/CreateKeyResultresponse.md)
 - [CreateListCommentrequest](docs/CreateListCommentrequest.md)
 - [CreateListCommentresponse](docs/CreateListCommentresponse.md)
 - [CreateListViewrequest](docs/CreateListViewrequest.md)
 - [CreateListViewresponse](docs/CreateListViewresponse.md)
 - [CreateListrequest](docs/CreateListrequest.md)
 - [CreateListresponse](docs/CreateListresponse.md)
 - [CreateSpaceTagrequest](docs/CreateSpaceTagrequest.md)
 - [CreateSpaceViewrequest](docs/CreateSpaceViewrequest.md)
 - [CreateSpaceViewresponse](docs/CreateSpaceViewresponse.md)
 - [CreateSpacerequest](docs/CreateSpacerequest.md)
 - [CreateSpaceresponse](docs/CreateSpaceresponse.md)
 - [CreateTaskAttachmentresponse](docs/CreateTaskAttachmentresponse.md)
 - [CreateTaskCommentrequest](docs/CreateTaskCommentrequest.md)
 - [CreateTaskCommentresponse](docs/CreateTaskCommentresponse.md)
 - [CreateTaskFromTemplaterequest](docs/CreateTaskFromTemplaterequest.md)
 - [CreateTaskrequest](docs/CreateTaskrequest.md)
 - [CreateTaskresponse](docs/CreateTaskresponse.md)
 - [CreateTeamViewrequest](docs/CreateTeamViewrequest.md)
 - [CreateTeamViewresponse](docs/CreateTeamViewresponse.md)
 - [CreateTeamrequest](docs/CreateTeamrequest.md)
 - [CreateTeamresponse](docs/CreateTeamresponse.md)
 - [CreateWebhookrequest](docs/CreateWebhookrequest.md)
 - [CreateWebhookresponse](docs/CreateWebhookresponse.md)
 - [Createatimeentryrequest](docs/Createatimeentryrequest.md)
 - [Createatimeentryresponse](docs/Createatimeentryresponse.md)
 - [Creator](docs/Creator.md)
 - [Creator5](docs/Creator5.md)
 - [CurrentStatus](docs/CurrentStatus.md)
 - [CustomFields](docs/CustomFields.md)
 - [CustomFields6](docs/CustomFields6.md)
 - [CustomFields7](docs/CustomFields7.md)
 - [CustomFields8](docs/CustomFields8.md)
 - [CustomFields9](docs/CustomFields9.md)
 - [CustomItem](docs/CustomItem.md)
 - [CustomItems](docs/CustomItems.md)
 - [CustomRole](docs/CustomRole.md)
 - [CustomRole2](docs/CustomRole2.md)
 - [Data](docs/Data.md)
 - [Data1](docs/Data1.md)
 - [Data2](docs/Data2.md)
 - [Data3](docs/Data3.md)
 - [Datum](docs/Datum.md)
 - [Datum1](docs/Datum1.md)
 - [Datum2](docs/Datum2.md)
 - [DeleteSpaceTagrequest](docs/DeleteSpaceTagrequest.md)
 - [DeleteTaskLinkresponse](docs/DeleteTaskLinkresponse.md)
 - [DeleteatimeEntryresponse](docs/DeleteatimeEntryresponse.md)
 - [DependencyWarning](docs/DependencyWarning.md)
 - [Divide](docs/Divide.md)
 - [DueDates](docs/DueDates.md)
 - [EditChecklistItemrequest](docs/EditChecklistItemrequest.md)
 - [EditChecklistItemresponse](docs/EditChecklistItemresponse.md)
 - [EditChecklistrequest](docs/EditChecklistrequest.md)
 - [EditGuestOnWorkspacerequest](docs/EditGuestOnWorkspacerequest.md)
 - [EditGuestOnWorkspaceresponse](docs/EditGuestOnWorkspaceresponse.md)
 - [EditKeyResultrequest](docs/EditKeyResultrequest.md)
 - [EditKeyResultresponse](docs/EditKeyResultresponse.md)
 - [EditSpaceTagrequest](docs/EditSpaceTagrequest.md)
 - [EditSpaceTagresponse](docs/EditSpaceTagresponse.md)
 - [EditUserOnWorkspacerequest](docs/EditUserOnWorkspacerequest.md)
 - [EditUserOnWorkspaceresponse](docs/EditUserOnWorkspaceresponse.md)
 - [Edittimetrackedrequest](docs/Edittimetrackedrequest.md)
 - [Emails](docs/Emails.md)
 - [Features](docs/Features.md)
 - [Features1](docs/Features1.md)
 - [Features4](docs/Features4.md)
 - [Field](docs/Field.md)
 - [Filters](docs/Filters.md)
 - [Folder](docs/Folder.md)
 - [Folder11](docs/Folder11.md)
 - [Folder2](docs/Folder2.md)
 - [Folder3](docs/Folder3.md)
 - [Folder4](docs/Folder4.md)
 - [Folder5](docs/Folder5.md)
 - [GetAccessTokenresponse](docs/GetAccessTokenresponse.md)
 - [GetAccessibleCustomFieldsresponse](docs/GetAccessibleCustomFieldsresponse.md)
 - [GetAuthorizedTeamsresponse](docs/GetAuthorizedTeamsresponse.md)
 - [GetAuthorizedUserresponse](docs/GetAuthorizedUserresponse.md)
 - [GetBulkTasksTimeinStatusresponse](docs/GetBulkTasksTimeinStatusresponse.md)
 - [GetChatViewCommentsresponse](docs/GetChatViewCommentsresponse.md)
 - [GetCustomItemsResponse](docs/GetCustomItemsResponse.md)
 - [GetCustomRolesresponse](docs/GetCustomRolesresponse.md)
 - [GetFilteredTeamTasksresponse](docs/GetFilteredTeamTasksresponse.md)
 - [GetFolderViewsresponse](docs/GetFolderViewsresponse.md)
 - [GetFolderlessListsresponse](docs/GetFolderlessListsresponse.md)
 - [GetFolderresponse](docs/GetFolderresponse.md)
 - [GetFoldersresponse](docs/GetFoldersresponse.md)
 - [GetGoalresponse](docs/GetGoalresponse.md)
 - [GetGoalsresponse](docs/GetGoalsresponse.md)
 - [GetListCommentsresponse](docs/GetListCommentsresponse.md)
 - [GetListMembersresponse](docs/GetListMembersresponse.md)
 - [GetListViewsresponse](docs/GetListViewsresponse.md)
 - [GetListresponse](docs/GetListresponse.md)
 - [GetListsresponse](docs/GetListsresponse.md)
 - [GetSpaceTagsresponse](docs/GetSpaceTagsresponse.md)
 - [GetSpaceViewsresponse](docs/GetSpaceViewsresponse.md)
 - [GetSpaceresponse](docs/GetSpaceresponse.md)
 - [GetSpacesresponse](docs/GetSpacesresponse.md)
 - [GetTaskCommentsresponse](docs/GetTaskCommentsresponse.md)
 - [GetTaskMembersresponse](docs/GetTaskMembersresponse.md)
 - [GetTaskTemplatesresponse](docs/GetTaskTemplatesresponse.md)
 - [GetTaskresponse](docs/GetTaskresponse.md)
 - [GetTasksTimeinStatusresponse](docs/GetTasksTimeinStatusresponse.md)
 - [GetTasksresponse](docs/GetTasksresponse.md)
 - [GetTeamViewsresponse](docs/GetTeamViewsresponse.md)
 - [GetTeamsresponse](docs/GetTeamsresponse.md)
 - [GetUserresponse](docs/GetUserresponse.md)
 - [GetViewTasksresponse](docs/GetViewTasksresponse.md)
 - [GetViewresponse](docs/GetViewresponse.md)
 - [GetWebhooksresponse](docs/GetWebhooksresponse.md)
 - [GetWorkspaceplanresponse](docs/GetWorkspaceplanresponse.md)
 - [GetWorkspaceseatsresponse](docs/GetWorkspaceseatsresponse.md)
 - [Getalltagsfromtimeentriesresponse](docs/Getalltagsfromtimeentriesresponse.md)
 - [Getrunningtimeentryresponse](docs/Getrunningtimeentryresponse.md)
 - [Getsingulartimeentryresponse](docs/Getsingulartimeentryresponse.md)
 - [Gettimeentrieswithinadaterangeresponse](docs/Gettimeentrieswithinadaterangeresponse.md)
 - [Gettrackedtimeresponse](docs/Gettrackedtimeresponse.md)
 - [Goal](docs/Goal.md)
 - [Goal2](docs/Goal2.md)
 - [Goal3](docs/Goal3.md)
 - [Group](docs/Group.md)
 - [Grouping](docs/Grouping.md)
 - [Guest](docs/Guest.md)
 - [Guest1](docs/Guest1.md)
 - [Guest2](docs/Guest2.md)
 - [Guest3](docs/Guest3.md)
 - [Guest5](docs/Guest5.md)
 - [Guests](docs/Guests.md)
 - [Health](docs/Health.md)
 - [Interval](docs/Interval.md)
 - [InviteGuestToWorkspacerequest](docs/InviteGuestToWorkspacerequest.md)
 - [InviteGuestToWorkspaceresponse](docs/InviteGuestToWorkspaceresponse.md)
 - [InviteUserToWorkspacerequest](docs/InviteUserToWorkspacerequest.md)
 - [InviteUserToWorkspaceresponse](docs/InviteUserToWorkspaceresponse.md)
 - [InvitedBy](docs/InvitedBy.md)
 - [Item](docs/Item.md)
 - [Item1](docs/Item1.md)
 - [KeyResult](docs/KeyResult.md)
 - [KeyResult1](docs/KeyResult1.md)
 - [LastAction](docs/LastAction.md)
 - [LastAction1](docs/LastAction1.md)
 - [LinkedTask](docs/LinkedTask.md)
 - [List](docs/List.md)
 - [List2](docs/List2.md)
 - [List3](docs/List3.md)
 - [List4](docs/List4.md)
 - [List6](docs/List6.md)
 - [Member](docs/Member.md)
 - [Member1](docs/Member1.md)
 - [Member2](docs/Member2.md)
 - [Member4](docs/Member4.md)
 - [Member5](docs/Member5.md)
 - [Member7](docs/Member7.md)
 - [Members](docs/Members.md)
 - [Members1](docs/Members1.md)
 - [Members2](docs/Members2.md)
 - [Members3](docs/Members3.md)
 - [Members5](docs/Members5.md)
 - [Milestones](docs/Milestones.md)
 - [Model20bbn28](docs/Model20bbn28.md)
 - [Model27075wz](docs/Model27075wz.md)
 - [MultipleAssignees](docs/MultipleAssignees.md)
 - [Option](docs/Option.md)
 - [Owner](docs/Owner.md)
 - [Parent](docs/Parent.md)
 - [Points](docs/Points.md)
 - [Portfolios](docs/Portfolios.md)
 - [Priority](docs/Priority.md)
 - [Priority1](docs/Priority1.md)
 - [Priority4](docs/Priority4.md)
 - [ProfileInfo](docs/ProfileInfo.md)
 - [Project](docs/Project.md)
 - [RemapDependencies](docs/RemapDependencies.md)
 - [RemoveGuestFromFolderresponse](docs/RemoveGuestFromFolderresponse.md)
 - [RemoveGuestFromListresponse](docs/RemoveGuestFromListresponse.md)
 - [RemoveGuestFromTaskresponse](docs/RemoveGuestFromTaskresponse.md)
 - [RemoveGuestFromWorkspaceresponse](docs/RemoveGuestFromWorkspaceresponse.md)
 - [RemoveUserFromWorkspaceresponse](docs/RemoveUserFromWorkspaceresponse.md)
 - [Removetagsfromtimeentriesrequest](docs/Removetagsfromtimeentriesrequest.md)
 - [Role](docs/Role.md)
 - [SetCustomFieldValuerequest](docs/SetCustomFieldValuerequest.md)
 - [SetCustomFieldValuerequestValueOptions](docs/SetCustomFieldValuerequestValueOptions.md)
 - [Settings](docs/Settings.md)
 - [Shared](docs/Shared.md)
 - [Shared1](docs/Shared1.md)
 - [Shared3](docs/Shared3.md)
 - [Shared5](docs/Shared5.md)
 - [Shared7](docs/Shared7.md)
 - [SharedHierarchyresponse](docs/SharedHierarchyresponse.md)
 - [Sorting](docs/Sorting.md)
 - [Space](docs/Space.md)
 - [Space13](docs/Space13.md)
 - [Space2](docs/Space2.md)
 - [Sprints](docs/Sprints.md)
 - [StartatimeEntryrequest](docs/StartatimeEntryrequest.md)
 - [StartatimeEntryresponse](docs/StartatimeEntryresponse.md)
 - [Status](docs/Status.md)
 - [Status11](docs/Status11.md)
 - [Status15](docs/Status15.md)
 - [Status5](docs/Status5.md)
 - [StatusHistory](docs/StatusHistory.md)
 - [StopatimeEntryresponse](docs/StopatimeEntryresponse.md)
 - [Tag](docs/Tag.md)
 - [Tag1](docs/Tag1.md)
 - [Tags](docs/Tags.md)
 - [Tags10](docs/Tags10.md)
 - [Tags6](docs/Tags6.md)
 - [Task](docs/Task.md)
 - [Task1](docs/Task1.md)
 - [Task2](docs/Task2.md)
 - [Task3](docs/Task3.md)
 - [Task4](docs/Task4.md)
 - [Task5](docs/Task5.md)
 - [Task6](docs/Task6.md)
 - [Task9](docs/Task9.md)
 - [TaskLocation](docs/TaskLocation.md)
 - [TaskTag](docs/TaskTag.md)
 - [Team](docs/Team.md)
 - [Team1](docs/Team1.md)
 - [Team2](docs/Team2.md)
 - [Team3](docs/Team3.md)
 - [TeamSidebar](docs/TeamSidebar.md)
 - [TimeEstimates](docs/TimeEstimates.md)
 - [TimeTracking](docs/TimeTracking.md)
 - [TotalTime](docs/TotalTime.md)
 - [Tracking](docs/Tracking.md)
 - [Tracktimerequest](docs/Tracktimerequest.md)
 - [Tracktimeresponse](docs/Tracktimeresponse.md)
 - [TypeConfig](docs/TypeConfig.md)
 - [TypeConfig1](docs/TypeConfig1.md)
 - [UpdateCommentrequest](docs/UpdateCommentrequest.md)
 - [UpdateFolderrequest](docs/UpdateFolderrequest.md)
 - [UpdateFolderresponse](docs/UpdateFolderresponse.md)
 - [UpdateGoalrequest](docs/UpdateGoalrequest.md)
 - [UpdateGoalresponse](docs/UpdateGoalresponse.md)
 - [UpdateListrequest](docs/UpdateListrequest.md)
 - [UpdateListresponse](docs/UpdateListresponse.md)
 - [UpdateSpacerequest](docs/UpdateSpacerequest.md)
 - [UpdateSpaceresponse](docs/UpdateSpaceresponse.md)
 - [UpdateTaskrequest](docs/UpdateTaskrequest.md)
 - [UpdateTaskresponse](docs/UpdateTaskresponse.md)
 - [UpdateTeamrequest](docs/UpdateTeamrequest.md)
 - [UpdateTeamresponse](docs/UpdateTeamresponse.md)
 - [UpdateViewrequest](docs/UpdateViewrequest.md)
 - [UpdateViewresponse](docs/UpdateViewresponse.md)
 - [UpdateWebhookrequest](docs/UpdateWebhookrequest.md)
 - [UpdateWebhookresponse](docs/UpdateWebhookresponse.md)
 - [UpdateatimeEntryrequest](docs/UpdateatimeEntryrequest.md)
 - [User](docs/User.md)
 - [User13](docs/User13.md)
 - [User2](docs/User2.md)
 - [User21](docs/User21.md)
 - [User5](docs/User5.md)
 - [User7](docs/User7.md)
 - [Value](docs/Value.md)
 - [Value1](docs/Value1.md)
 - [Value2](docs/Value2.md)
 - [View](docs/View.md)
 - [Watchers1](docs/Watchers1.md)
 - [Webhook](docs/Webhook.md)
 - [Zoom](docs/Zoom.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
