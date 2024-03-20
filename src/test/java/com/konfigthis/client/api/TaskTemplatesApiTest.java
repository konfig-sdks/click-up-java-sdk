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
import com.konfigthis.client.model.CreateTaskFromTemplaterequest;
import com.konfigthis.client.model.GetTaskTemplatesresponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskTemplatesApi
 */
@Disabled
public class TaskTemplatesApiTest {

    private static TaskTemplatesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TaskTemplatesApi(apiClient);
    }

    /**
     * Create Task From Template
     *
     * Create a new task using a task template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFromTemplateTest() throws ApiException {
        String name = null;
        Double listId = null;
        String templateId = null;
        Object response = api.createFromTemplate(name, listId, templateId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Task Templates
     *
     * View the task templates available in a Workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTemplatesTest() throws ApiException {
        Double teamId = null;
        Integer page = null;
        GetTaskTemplatesresponse response = api.getTemplates(teamId, page)
                .execute();
        // TODO: test validations
    }

}
