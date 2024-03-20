# AttachmentsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**uploadFileToTaskAsAttachment**](AttachmentsApi.md#uploadFileToTaskAsAttachment) | **POST** /task/{task_id}/attachment | Create Task Attachment |


<a name="uploadFileToTaskAsAttachment"></a>
# **uploadFileToTaskAsAttachment**
> CreateTaskAttachmentresponse uploadFileToTaskAsAttachment(taskId, attachmentsUploadFileToTaskAsAttachmentRequest).customTaskIds(customTaskIds).teamId(teamId).attachment(attachment).execute();

Create Task Attachment

Upload a file to a task as an attachment. \\  \\ ***Note:** This request uses multipart/form-data as the content type.*

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**|  | |
| **attachmentsUploadFileToTaskAsAttachmentRequest** | [**AttachmentsUploadFileToTaskAsAttachmentRequest**](AttachmentsUploadFileToTaskAsAttachmentRequest.md)|  | |
| **customTaskIds** | **Boolean**| If you want to reference a task by it&#39;s custom task id, this value must be &#x60;true&#x60;. | [optional] |
| **teamId** | **Double**| Only used when the &#x60;custom_task_ids&#x60; parameter is set to &#x60;true&#x60;.\\  \\ For example: &#x60;custom_task_ids&#x3D;true&amp;team_id&#x3D;123&#x60;. | [optional] |
| **attachment** | [**List&lt;Object&gt;**](Object.md)|  | [optional] |

### Return type

[**CreateTaskAttachmentresponse**](CreateTaskAttachmentresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

