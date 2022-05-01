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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineObject1;
import org.openapitools.client.model.InlineObject2;
import org.openapitools.client.model.InlineObject3;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 3.jugugu获取小红花POAP
     *
     * 使用项目方自己账户体系的OpenID注册并绑定jugugu账号，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行小红花POAP领取。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void juguguFastGetNFTPostTest() throws ApiException {
        InlineObject inlineObject = null;
        InlineResponse200 response = api.juguguFastGetNFTPost(inlineObject);

        // TODO: test validations
    }
    
    /**
     * 2.注册jugugu登录
     *
     * 使用项目方自己账户体系OpenID,用户手机号，项目方接入jugugu的Account和Secret登录用户jugugu账户，获得登录token  该token用于后续函数调用
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void juguguFastLoginPostTest() throws ApiException {
        InlineObject3 inlineObject3 = null;
        InlineResponse2001 response = api.juguguFastLoginPost(inlineObject3);

        // TODO: test validations
    }
    
    /**
     * 1.注册jugugu
     *
     * 使用项目方自己账户体系的OpenID注册并绑定jugugu账号，如果该手机已经注册jugugu则直接进行绑定OpenID。注册的用户返回短密钥，绑定的用户不返回短密钥，短密钥请务必加密存储，建议使用ECC256进行加密，加密解密密钥妥善保存，建议内存中存放
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void juguguFastRegPostTest() throws ApiException {
        InlineObject1 inlineObject1 = null;
        InlineResponse2001 response = api.juguguFastRegPost(inlineObject1);

        // TODO: test validations
    }
    
    /**
     * 4.使用jugugu进行交易签名
     *
     * 使用项目方自己账户体系的OpenID，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行交易签名,返回签名后的交易数据rowData。详情见示例代码
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void juguguFastSignTxPostTest() throws ApiException {
        InlineObject2 inlineObject2 = null;
        Object response = api.juguguFastSignTxPost(inlineObject2);

        // TODO: test validations
    }
    
}