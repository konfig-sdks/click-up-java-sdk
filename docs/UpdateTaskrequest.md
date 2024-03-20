

# UpdateTaskrequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | To clear the task description, include &#x60;Description&#x60; with &#x60;\&quot; \&quot;&#x60;. |  [optional] |
|**customItemId** | **Object** | To convert an item using a custom task type into a task, send &#x60;&#39;null&#39;&#x60;. \\  \\ To update this task to be a Milestone, send a value of &#x60;1&#x60;. \\  \\ To use a custom task type, send the custom task type ID as defined in your Workspace, such as &#x60;2&#x60;. |  [optional] |
|**name** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**priority** | **Integer** |  |  [optional] |
|**dueDate** | **Integer** |  |  [optional] |
|**dueDateTime** | **Boolean** |  |  [optional] |
|**parent** | **String** | You can move a subtask to another parent task by including &#x60;\&quot;parent\&quot;&#x60; with a valid &#x60;task id&#x60;.\\  \\ You cannot convert a subtask to a task by setting &#x60;\&quot;parent\&quot;&#x60; to &#x60;null&#x60;. |  [optional] |
|**timeEstimate** | **Integer** |  |  [optional] |
|**startDate** | **Integer** |  |  [optional] |
|**startDateTime** | **Boolean** |  |  [optional] |
|**assignees** | [**Assignees**](Assignees.md) |  |  [optional] |
|**archived** | **Boolean** |  |  [optional] |



