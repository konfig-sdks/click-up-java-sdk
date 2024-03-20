

# CreateTaskrequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**assignees** | **List&lt;Integer&gt;** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**priority** | **Object** |  |  [optional] |
|**dueDate** | **Integer** |  |  [optional] |
|**dueDateTime** | **Boolean** |  |  [optional] |
|**timeEstimate** | **Integer** |  |  [optional] |
|**startDate** | **Integer** |  |  [optional] |
|**startDateTime** | **Boolean** |  |  [optional] |
|**notifyAll** | **Boolean** | If &#x60;notify_all&#x60; is true, notifications will be sent to everyone including the creator of the comment. |  [optional] |
|**parent** | **Object** | You can create a subtask by including an existing task ID.\\  \\ The &#x60;parent&#x60; task ID you include cannot be a subtask, and must be in the same List specified in the path parameter. |  [optional] |
|**linksTo** | **Object** | Include a task ID to create a linked dependency with your new task. |  [optional] |
|**checkRequiredCustomFields** | **Boolean** | When creating a task via API any required Custom Fields are ignored by default (&#x60;false&#x60;).\\  \\ You can enforce required Custom Fields by including &#x60;check_required_custom_fields: true&#x60;. |  [optional] |
|**customFields** | [**List&lt;CustomFields6&gt;**](CustomFields6.md) | [Filter by Custom Fields.](https://clickup.com/api) |  [optional] |
|**customItemId** | **Double** | To create a task that doesn&#39;t use a custom task type, either don&#39;t include this field in the request body, or send &#x60;&#39;null&#39;&#x60;. \\  \\ To create this task as a Milestone, send a value of &#x60;1&#x60;.\\  \\ To use a custom task type, send the custom task type ID as defined in your Workspace, such as &#x60;2&#x60;. |  [optional] |



