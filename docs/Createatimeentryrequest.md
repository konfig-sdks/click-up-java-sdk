

# Createatimeentryrequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;Tags6&gt;**](Tags6.md) | Users on the Business Plan and above can include a time tracking label. |  [optional] |
|**description** | **String** |  |  [optional] |
|**start** | **Integer** |  |  |
|**stop** | **Integer** | The &#x60;duration&#x60; parameter can be used instead of the &#x60;stop&#x60; parameter.  |  [optional] |
|**end** | **Integer** |  |  [optional] |
|**billable** | **Boolean** |  |  [optional] |
|**duration** | **Integer** | When there are values for both &#x60;start&#x60; and &#x60;end&#x60;, &#x60;duration&#x60; is ignored. The &#x60;stop&#x60; parameter can be used instead of the &#x60;duration&#x60; parameter. |  |
|**assignee** | **Integer** | Workspace owners and admins can include any user id. Workspace members can only include their own user id. |  [optional] |
|**tid** | **String** |  |  [optional] |



