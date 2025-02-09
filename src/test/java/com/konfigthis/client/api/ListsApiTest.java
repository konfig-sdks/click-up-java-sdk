/*
 * ClickUp API Reference
 * This is the ClickUp API Reference where you can learn about specific endpoints and parameters in detail.  Browse the available endpoints using the sidebar on the left.  **Not sure where to begin?** [Get Started with the ClickUp API](https://clickup.com/api) 
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CreateFolderlessListrequest;
import com.konfigthis.client.model.CreateFolderlessListresponse;
import com.konfigthis.client.model.CreateListrequest;
import com.konfigthis.client.model.CreateListresponse;
import com.konfigthis.client.model.GetFolderlessListsresponse;
import com.konfigthis.client.model.GetListresponse;
import com.konfigthis.client.model.GetListsresponse;
import com.konfigthis.client.model.UpdateListrequest;
import com.konfigthis.client.model.UpdateListresponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListsApi
 */
@Disabled
public class ListsApiTest {

    private static ListsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ListsApi(apiClient);
    }

    /**
     * Add Task To List
     *
     * Add a task to an additional List. \\  \\ ***Note:** This endpoint requires the [Tasks in Multiple List ClickApp](https://help.clickup.com/hc/en-us/articles/6309958824727-Tasks-in-Multiple-Lists) to be enabled.*
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addTaskToListTest() throws ApiException {
        Double listId = null;
        String taskId = null;
        Object response = api.addTaskToList(listId, taskId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create List
     *
     * Add a new List to a Folder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToFolderTest() throws ApiException {
        String name = null;
        Double folderId = null;
        String content = null;
        Integer dueDate = null;
        Boolean dueDateTime = null;
        Integer priority = null;
        Integer assignee = null;
        String status = null;
        CreateListresponse response = api.addToFolder(name, folderId)
                .content(content)
                .dueDate(dueDate)
                .dueDateTime(dueDateTime)
                .priority(priority)
                .assignee(assignee)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * Create Folderless List
     *
     * Add a new List in a Space.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFolderlessListTest() throws ApiException {
        String name = null;
        Double spaceId = null;
        String content = null;
        Integer dueDate = null;
        Boolean dueDateTime = null;
        Integer priority = null;
        Integer assignee = null;
        String status = null;
        CreateFolderlessListresponse response = api.createFolderlessList(name, spaceId)
                .content(content)
                .dueDate(dueDate)
                .dueDateTime(dueDateTime)
                .priority(priority)
                .assignee(assignee)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Lists
     *
     * View the Lists within a Folder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFolderListsTest() throws ApiException {
        Double folderId = null;
        Boolean archived = null;
        GetListsresponse response = api.getFolderLists(folderId)
                .archived(archived)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Folderless Lists
     *
     * View the Lists in a Space that aren&#39;t located in a Folder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFolderlessTest() throws ApiException {
        Double spaceId = null;
        Boolean archived = null;
        GetFolderlessListsresponse response = api.getFolderless(spaceId)
                .archived(archived)
                .execute();
        // TODO: test validations
    }

    /**
     * Get List
     *
     * View information about a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListDetailsTest() throws ApiException {
        Double listId = null;
        GetListresponse response = api.getListDetails(listId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete List
     *
     * Delete a List from your Workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeListTest() throws ApiException {
        Double listId = null;
        Object response = api.removeList(listId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove Task From List
     *
     * Remove a task from an additional List. You can&#39;t remove a task from its home List. \\  \\ ***Note:** This endpoint requires the [Tasks in Multiple List ClickApp](https://help.clickup.com/hc/en-us/articles/6309958824727-Tasks-in-Multiple-Lists) to be enabled.*
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTaskFromListTest() throws ApiException {
        Double listId = null;
        String taskId = null;
        Object response = api.removeTaskFromList(listId, taskId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update List
     *
     * Rename a List, update the List Info description, set a due date/time, set the List&#39;s priority, set an assignee, set or remove the List color.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateListInfoDueDatePriorityAssigneeColorTest() throws ApiException {
        String name = null;
        String content = null;
        Integer dueDate = null;
        Boolean dueDateTime = null;
        Integer priority = null;
        String assignee = null;
        String status = null;
        Boolean unsetStatus = null;
        String listId = null;
        UpdateListresponse response = api.updateListInfoDueDatePriorityAssigneeColor(name, content, dueDate, dueDateTime, priority, assignee, status, unsetStatus, listId)
                .execute();
        // TODO: test validations
    }

}
