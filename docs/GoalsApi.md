# GoalsApi

All URIs are relative to *https://api.clickup.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addKeyResult**](GoalsApi.md#addKeyResult) | **POST** /goal/{goal_id}/key_result | Create Key Result |
| [**addNewGoalToWorkspace**](GoalsApi.md#addNewGoalToWorkspace) | **POST** /team/{team_id}/goal | Create Goal |
| [**getDetails**](GoalsApi.md#getDetails) | **GET** /goal/{goal_id} | Get Goal |
| [**getWorkspaceGoals**](GoalsApi.md#getWorkspaceGoals) | **GET** /team/{team_id}/goal | Get Goals |
| [**removeGoal**](GoalsApi.md#removeGoal) | **DELETE** /goal/{goal_id} | Delete Goal |
| [**removeTarget**](GoalsApi.md#removeTarget) | **DELETE** /key_result/{key_result_id} | Delete Key Result |
| [**updateGoalDetails**](GoalsApi.md#updateGoalDetails) | **PUT** /goal/{goal_id} | Update Goal |
| [**updateKeyResult**](GoalsApi.md#updateKeyResult) | **PUT** /key_result/{key_result_id} | Edit Key Result |


<a name="addKeyResult"></a>
# **addKeyResult**
> CreateKeyResultresponse addKeyResult(goalId, createKeyResultrequest).execute();

Create Key Result

Add a Target to a Goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    List<Integer> owners = Arrays.asList(); // 
    String type = "type_example"; // Target (key result) types include: `number`, `currency`, `boolean`, `percentage`, or `automatic`.
    Integer stepsStart = 56;
    Integer stepsEnd = 56;
    String unit = "unit_example";
    List<String> taskIds = Arrays.asList(); // Enter an array of task IDs to link this target with one or more tasks.
    List<String> listIds = Arrays.asList(); // Enter an array of List IDs to link this target with one or more Lists.
    String goalId = "e53a033c"; // 900e-462d-a849-4a216b06d930 (uuid)
    try {
      CreateKeyResultresponse result = client
              .goals
              .addKeyResult(name, owners, type, stepsStart, stepsEnd, unit, taskIds, listIds, goalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeyResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#addKeyResult");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateKeyResultresponse> response = client
              .goals
              .addKeyResult(name, owners, type, stepsStart, stepsEnd, unit, taskIds, listIds, goalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#addKeyResult");
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
| **goalId** | **String**| 900e-462d-a849-4a216b06d930 (uuid) | |
| **createKeyResultrequest** | [**CreateKeyResultrequest**](CreateKeyResultrequest.md)|  | |

### Return type

[**CreateKeyResultresponse**](CreateKeyResultresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="addNewGoalToWorkspace"></a>
# **addNewGoalToWorkspace**
> CreateGoalresponse addNewGoalToWorkspace(teamId, createGoalrequest).execute();

Create Goal

Add a new Goal to a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String description = "description_example";
    String name = "name_example";
    Integer dueDate = 56;
    Boolean multipleOwners = true;
    List<Integer> owners = Arrays.asList(); // Array of user IDs.
    String color = "color_example";
    Double teamId = 123D; // Team ID (Workspace)
    try {
      CreateGoalresponse result = client
              .goals
              .addNewGoalToWorkspace(description, name, dueDate, multipleOwners, owners, color, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoal());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#addNewGoalToWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateGoalresponse> response = client
              .goals
              .addNewGoalToWorkspace(description, name, dueDate, multipleOwners, owners, color, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#addNewGoalToWorkspace");
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
| **createGoalrequest** | [**CreateGoalrequest**](CreateGoalrequest.md)|  | |

### Return type

[**CreateGoalresponse**](CreateGoalresponse.md)

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
> GetGoalresponse getDetails(goalId).execute();

Get Goal

View the details of a Goal including its Targets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String goalId = "e53a033c"; // 900e-462d-a849-4a216b06d930 (uuid)
    try {
      GetGoalresponse result = client
              .goals
              .getDetails(goalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoal());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetGoalresponse> response = client
              .goals
              .getDetails(goalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getDetails");
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
| **goalId** | **String**| 900e-462d-a849-4a216b06d930 (uuid) | |

### Return type

[**GetGoalresponse**](GetGoalresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getWorkspaceGoals"></a>
# **getWorkspaceGoals**
> GetGoalsresponse getWorkspaceGoals(teamId).includeCompleted(includeCompleted).execute();

Get Goals

View the Goals available in a Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    Boolean includeCompleted = true; // 
    try {
      GetGoalsresponse result = client
              .goals
              .getWorkspaceGoals(teamId)
              .includeCompleted(includeCompleted)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoals());
      System.out.println(result.getFolders());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getWorkspaceGoals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetGoalsresponse> response = client
              .goals
              .getWorkspaceGoals(teamId)
              .includeCompleted(includeCompleted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getWorkspaceGoals");
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
| **includeCompleted** | **Boolean**|  | [optional] |

### Return type

[**GetGoalsresponse**](GetGoalsresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeGoal"></a>
# **removeGoal**
> Object removeGoal(goalId).execute();

Delete Goal

Remove a Goal from your Workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String goalId = "e53a033c"; // 900e-462d-a849-4a216b06d930 (uuid)
    try {
      Object result = client
              .goals
              .removeGoal(goalId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#removeGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .goals
              .removeGoal(goalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#removeGoal");
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
| **goalId** | **String**| 900e-462d-a849-4a216b06d930 (uuid) | |

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

<a name="removeTarget"></a>
# **removeTarget**
> Object removeTarget(keyResultId).execute();

Delete Key Result

Delete a target from a Goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String keyResultId = "947d46ed"; // 8480-49bc-8c57-e569747efe93 (uuid)
    try {
      Object result = client
              .goals
              .removeTarget(keyResultId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#removeTarget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .goals
              .removeTarget(keyResultId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#removeTarget");
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
| **keyResultId** | **String**| 8480-49bc-8c57-e569747efe93 (uuid) | |

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

<a name="updateGoalDetails"></a>
# **updateGoalDetails**
> UpdateGoalresponse updateGoalDetails(goalId, updateGoalrequest).execute();

Update Goal

Rename a Goal, set the due date, replace the description, add or remove owners, and set the Goal color.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    String description = "description_example";
    String name = "name_example";
    Integer dueDate = 56;
    List<Integer> remOwners = Arrays.asList(); // Array of user IDs.
    List<Integer> addOwners = Arrays.asList(); // Array of user IDs.
    String color = "color_example";
    String goalId = "e53a033c"; // 900e-462d-a849-4a216b06d930 (uuid)
    try {
      UpdateGoalresponse result = client
              .goals
              .updateGoalDetails(description, name, dueDate, remOwners, addOwners, color, goalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoal());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateGoalDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateGoalresponse> response = client
              .goals
              .updateGoalDetails(description, name, dueDate, remOwners, addOwners, color, goalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateGoalDetails");
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
| **goalId** | **String**| 900e-462d-a849-4a216b06d930 (uuid) | |
| **updateGoalrequest** | [**UpdateGoalrequest**](UpdateGoalrequest.md)|  | |

### Return type

[**UpdateGoalresponse**](UpdateGoalresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateKeyResult"></a>
# **updateKeyResult**
> EditKeyResultresponse updateKeyResult(keyResultId, editKeyResultrequest).execute();

Edit Key Result

Update a Target.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClickUp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clickup.com/api/v2";
    
    configuration.authorizationToken  = "YOUR API KEY";
    ClickUp client = new ClickUp(configuration);
    Integer stepsCurrent = 56;
    String note = "note_example";
    String keyResultId = "947d46ed"; // 8480-49bc-8c57-e569747efe93 (uuid)
    try {
      EditKeyResultresponse result = client
              .goals
              .updateKeyResult(stepsCurrent, note, keyResultId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeyResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateKeyResult");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditKeyResultresponse> response = client
              .goals
              .updateKeyResult(stepsCurrent, note, keyResultId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateKeyResult");
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
| **keyResultId** | **String**| 8480-49bc-8c57-e569747efe93 (uuid) | |
| **editKeyResultrequest** | [**EditKeyResultrequest**](EditKeyResultrequest.md)| All properties available in the Create Key Result endpoint may also be used along with the additional properties below. | |

### Return type

[**EditKeyResultresponse**](EditKeyResultresponse.md)

### Authorization

[Authorization Token](../README.md#Authorization Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

