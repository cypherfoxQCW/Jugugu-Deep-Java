/*
 * Jugugu密钥Fast模式
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineObject1;
import org.openapitools.client.model.InlineObject2;
import org.openapitools.client.model.InlineObject3;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for juguguFastGetNFTPost
     * @param inlineObject  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguFastGetNFTPostCall(InlineObject inlineObject, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject;

        // create path and map variables
        String localVarPath = "/Jugugu_FastGetNFT";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call juguguFastGetNFTPostValidateBeforeCall(InlineObject inlineObject, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = juguguFastGetNFTPostCall(inlineObject, _callback);
        return localVarCall;

    }

    /**
     * 3.jugugu获取小红花POAP
     * 使用项目方自己账户体系的OpenID注册并绑定jugugu账号，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行小红花POAP领取。
     * @param inlineObject  (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse200 juguguFastGetNFTPost(InlineObject inlineObject) throws ApiException {
        ApiResponse<InlineResponse200> localVarResp = juguguFastGetNFTPostWithHttpInfo(inlineObject);
        return localVarResp.getData();
    }

    /**
     * 3.jugugu获取小红花POAP
     * 使用项目方自己账户体系的OpenID注册并绑定jugugu账号，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行小红花POAP领取。
     * @param inlineObject  (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse200> juguguFastGetNFTPostWithHttpInfo(InlineObject inlineObject) throws ApiException {
        okhttp3.Call localVarCall = juguguFastGetNFTPostValidateBeforeCall(inlineObject, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 3.jugugu获取小红花POAP (asynchronously)
     * 使用项目方自己账户体系的OpenID注册并绑定jugugu账号，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行小红花POAP领取。
     * @param inlineObject  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguFastGetNFTPostAsync(InlineObject inlineObject, final ApiCallback<InlineResponse200> _callback) throws ApiException {

        okhttp3.Call localVarCall = juguguFastGetNFTPostValidateBeforeCall(inlineObject, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for juguguFastLoginPost
     * @param inlineObject3  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguFastLoginPostCall(InlineObject3 inlineObject3, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject3;

        // create path and map variables
        String localVarPath = "/Jugugu_FastLogin";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call juguguFastLoginPostValidateBeforeCall(InlineObject3 inlineObject3, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = juguguFastLoginPostCall(inlineObject3, _callback);
        return localVarCall;

    }

    /**
     * 2.注册jugugu登录
     * 使用项目方自己账户体系OpenID,用户手机号，项目方接入jugugu的Account和Secret登录用户jugugu账户，获得登录token  该token用于后续函数调用
     * @param inlineObject3  (optional)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2001 juguguFastLoginPost(InlineObject3 inlineObject3) throws ApiException {
        ApiResponse<InlineResponse2001> localVarResp = juguguFastLoginPostWithHttpInfo(inlineObject3);
        return localVarResp.getData();
    }

    /**
     * 2.注册jugugu登录
     * 使用项目方自己账户体系OpenID,用户手机号，项目方接入jugugu的Account和Secret登录用户jugugu账户，获得登录token  该token用于后续函数调用
     * @param inlineObject3  (optional)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2001> juguguFastLoginPostWithHttpInfo(InlineObject3 inlineObject3) throws ApiException {
        okhttp3.Call localVarCall = juguguFastLoginPostValidateBeforeCall(inlineObject3, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 2.注册jugugu登录 (asynchronously)
     * 使用项目方自己账户体系OpenID,用户手机号，项目方接入jugugu的Account和Secret登录用户jugugu账户，获得登录token  该token用于后续函数调用
     * @param inlineObject3  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguFastLoginPostAsync(InlineObject3 inlineObject3, final ApiCallback<InlineResponse2001> _callback) throws ApiException {

        okhttp3.Call localVarCall = juguguFastLoginPostValidateBeforeCall(inlineObject3, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for juguguFastRegPost
     * @param inlineObject1  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguFastRegPostCall(InlineObject1 inlineObject1, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject1;

        // create path and map variables
        String localVarPath = "/Jugugu_FastReg";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call juguguFastRegPostValidateBeforeCall(InlineObject1 inlineObject1, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = juguguFastRegPostCall(inlineObject1, _callback);
        return localVarCall;

    }

    /**
     * 1.注册jugugu
     * 使用项目方自己账户体系的OpenID注册并绑定jugugu账号，如果该手机已经注册jugugu则直接进行绑定OpenID。注册的用户返回短密钥，绑定的用户不返回短密钥，短密钥请务必加密存储，建议使用ECC256进行加密，加密解密密钥妥善保存，建议内存中存放
     * @param inlineObject1  (optional)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2001 juguguFastRegPost(InlineObject1 inlineObject1) throws ApiException {
        ApiResponse<InlineResponse2001> localVarResp = juguguFastRegPostWithHttpInfo(inlineObject1);
        return localVarResp.getData();
    }

    /**
     * 1.注册jugugu
     * 使用项目方自己账户体系的OpenID注册并绑定jugugu账号，如果该手机已经注册jugugu则直接进行绑定OpenID。注册的用户返回短密钥，绑定的用户不返回短密钥，短密钥请务必加密存储，建议使用ECC256进行加密，加密解密密钥妥善保存，建议内存中存放
     * @param inlineObject1  (optional)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2001> juguguFastRegPostWithHttpInfo(InlineObject1 inlineObject1) throws ApiException {
        okhttp3.Call localVarCall = juguguFastRegPostValidateBeforeCall(inlineObject1, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 1.注册jugugu (asynchronously)
     * 使用项目方自己账户体系的OpenID注册并绑定jugugu账号，如果该手机已经注册jugugu则直接进行绑定OpenID。注册的用户返回短密钥，绑定的用户不返回短密钥，短密钥请务必加密存储，建议使用ECC256进行加密，加密解密密钥妥善保存，建议内存中存放
     * @param inlineObject1  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguFastRegPostAsync(InlineObject1 inlineObject1, final ApiCallback<InlineResponse2001> _callback) throws ApiException {

        okhttp3.Call localVarCall = juguguFastRegPostValidateBeforeCall(inlineObject1, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for juguguFastSignTxPost
     * @param inlineObject2  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguFastSignTxPostCall(InlineObject2 inlineObject2, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject2;

        // create path and map variables
        String localVarPath = "/Jugugu_FastSignTx";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call juguguFastSignTxPostValidateBeforeCall(InlineObject2 inlineObject2, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = juguguFastSignTxPostCall(inlineObject2, _callback);
        return localVarCall;

    }

    /**
     * 4.使用jugugu进行交易签名
     * 使用项目方自己账户体系的OpenID，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行交易签名,返回签名后的交易数据rowData。详情见示例代码
     * @param inlineObject2  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public Object juguguFastSignTxPost(InlineObject2 inlineObject2) throws ApiException {
        ApiResponse<Object> localVarResp = juguguFastSignTxPostWithHttpInfo(inlineObject2);
        return localVarResp.getData();
    }

    /**
     * 4.使用jugugu进行交易签名
     * 使用项目方自己账户体系的OpenID，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行交易签名,返回签名后的交易数据rowData。详情见示例代码
     * @param inlineObject2  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> juguguFastSignTxPostWithHttpInfo(InlineObject2 inlineObject2) throws ApiException {
        okhttp3.Call localVarCall = juguguFastSignTxPostValidateBeforeCall(inlineObject2, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 4.使用jugugu进行交易签名 (asynchronously)
     * 使用项目方自己账户体系的OpenID，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行交易签名,返回签名后的交易数据rowData。详情见示例代码
     * @param inlineObject2  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguFastSignTxPostAsync(InlineObject2 inlineObject2, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = juguguFastSignTxPostValidateBeforeCall(inlineObject2, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}