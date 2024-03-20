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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.GetAccessTokenresponse;
import com.konfigthis.client.model.GetAuthorizedTeamsresponse;
import com.konfigthis.client.model.GetAuthorizedUserresponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthorizationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthorizationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AuthorizationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getAuthorizationToken() == null) {
            throw new IllegalArgumentException("\"Authorization\" is required but no API key was provided. Please set \"Authorization\" with ApiClient#setAuthorizationToken(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getAccessTokenCall(String clientId, String clientSecret, String code, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/oauth/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clientId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("client_id", clientId));
        }

        if (clientSecret != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("client_secret", clientSecret));
        }

        if (code != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("code", code));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccessTokenValidateBeforeCall(String clientId, String clientSecret, String code, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getAccessToken(Async)");
        }

        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new ApiException("Missing the required parameter 'clientSecret' when calling getAccessToken(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getAccessToken(Async)");
        }

        return getAccessTokenCall(clientId, clientSecret, code, _callback);

    }


    private ApiResponse<GetAccessTokenresponse> getAccessTokenWithHttpInfo(String clientId, String clientSecret, String code) throws ApiException {
        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(clientId, clientSecret, code, null);
        Type localVarReturnType = new TypeToken<GetAccessTokenresponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAccessTokenAsync(String clientId, String clientSecret, String code, final ApiCallback<GetAccessTokenresponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(clientId, clientSecret, code, _callback);
        Type localVarReturnType = new TypeToken<GetAccessTokenresponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAccessTokenRequestBuilder {
        private final String clientId;
        private final String clientSecret;
        private final String code;

        private GetAccessTokenRequestBuilder(String clientId, String clientSecret, String code) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.code = code;
        }

        /**
         * Build call for getAccessToken
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAccessTokenCall(clientId, clientSecret, code, _callback);
        }


        /**
         * Execute getAccessToken request
         * @return GetAccessTokenresponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public GetAccessTokenresponse execute() throws ApiException {
            ApiResponse<GetAccessTokenresponse> localVarResp = getAccessTokenWithHttpInfo(clientId, clientSecret, code);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAccessToken request with HTTP info returned
         * @return ApiResponse&lt;GetAccessTokenresponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetAccessTokenresponse> executeWithHttpInfo() throws ApiException {
            return getAccessTokenWithHttpInfo(clientId, clientSecret, code);
        }

        /**
         * Execute getAccessToken request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetAccessTokenresponse> _callback) throws ApiException {
            return getAccessTokenAsync(clientId, clientSecret, code, _callback);
        }
    }

    /**
     * Get Access Token
     * These are the routes for authing the API and going through the [OAuth flow](https://clickup.com/api).\\  \\ Applications utilizing a personal API token don&#39;t use this endpoint.\\  \\ ***Note:** OAuth tokens are not supported when using the [**Try It** feature](https://clickup.com/api) of our Reference docs. You can&#39;t try this endpoint from your web browser.* 
     * @param clientId Oauth app client id (required)
     * @param clientSecret Oauth app client secret (required)
     * @param code Code given in redirect url (required)
     * @return GetAccessTokenRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetAccessTokenRequestBuilder getAccessToken(String clientId, String clientSecret, String code) throws IllegalArgumentException {
        if (clientId == null) throw new IllegalArgumentException("\"clientId\" is required but got null");
            

        if (clientSecret == null) throw new IllegalArgumentException("\"clientSecret\" is required but got null");
            

        if (code == null) throw new IllegalArgumentException("\"code\" is required but got null");
            

        return new GetAccessTokenRequestBuilder(clientId, clientSecret, code);
    }
    private okhttp3.Call getWorkspaceListCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/team";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization Token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWorkspaceListValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getWorkspaceListCall(_callback);

    }


    private ApiResponse<GetAuthorizedTeamsresponse> getWorkspaceListWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getWorkspaceListValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetAuthorizedTeamsresponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getWorkspaceListAsync(final ApiCallback<GetAuthorizedTeamsresponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorkspaceListValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetAuthorizedTeamsresponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetWorkspaceListRequestBuilder {

        private GetWorkspaceListRequestBuilder() {
        }

        /**
         * Build call for getWorkspaceList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getWorkspaceListCall(_callback);
        }


        /**
         * Execute getWorkspaceList request
         * @return GetAuthorizedTeamsresponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public GetAuthorizedTeamsresponse execute() throws ApiException {
            ApiResponse<GetAuthorizedTeamsresponse> localVarResp = getWorkspaceListWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getWorkspaceList request with HTTP info returned
         * @return ApiResponse&lt;GetAuthorizedTeamsresponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetAuthorizedTeamsresponse> executeWithHttpInfo() throws ApiException {
            return getWorkspaceListWithHttpInfo();
        }

        /**
         * Execute getWorkspaceList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetAuthorizedTeamsresponse> _callback) throws ApiException {
            return getWorkspaceListAsync(_callback);
        }
    }

    /**
     * Get Authorized Teams (Workspaces)
     * View the Workspaces available to the authenticated user.
     * @return GetWorkspaceListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetWorkspaceListRequestBuilder getWorkspaceList() throws IllegalArgumentException {
        return new GetWorkspaceListRequestBuilder();
    }
    private okhttp3.Call viewAccountDetailsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization Token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call viewAccountDetailsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return viewAccountDetailsCall(_callback);

    }


    private ApiResponse<GetAuthorizedUserresponse> viewAccountDetailsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = viewAccountDetailsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetAuthorizedUserresponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call viewAccountDetailsAsync(final ApiCallback<GetAuthorizedUserresponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = viewAccountDetailsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetAuthorizedUserresponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ViewAccountDetailsRequestBuilder {

        private ViewAccountDetailsRequestBuilder() {
        }

        /**
         * Build call for viewAccountDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return viewAccountDetailsCall(_callback);
        }


        /**
         * Execute viewAccountDetails request
         * @return GetAuthorizedUserresponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public GetAuthorizedUserresponse execute() throws ApiException {
            ApiResponse<GetAuthorizedUserresponse> localVarResp = viewAccountDetailsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute viewAccountDetails request with HTTP info returned
         * @return ApiResponse&lt;GetAuthorizedUserresponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetAuthorizedUserresponse> executeWithHttpInfo() throws ApiException {
            return viewAccountDetailsWithHttpInfo();
        }

        /**
         * Execute viewAccountDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetAuthorizedUserresponse> _callback) throws ApiException {
            return viewAccountDetailsAsync(_callback);
        }
    }

    /**
     * Get Authorized User
     * View the details of the authenticated user&#39;s ClickUp account.
     * @return ViewAccountDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ViewAccountDetailsRequestBuilder viewAccountDetails() throws IllegalArgumentException {
        return new ViewAccountDetailsRequestBuilder();
    }
}
