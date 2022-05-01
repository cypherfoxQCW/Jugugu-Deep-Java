# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**juguguFastGetNFTPost**](DefaultApi.md#juguguFastGetNFTPost) | **POST** /Jugugu_FastGetNFT | 3.jugugu获取小红花POAP
[**juguguFastLoginPost**](DefaultApi.md#juguguFastLoginPost) | **POST** /Jugugu_FastLogin | 2.注册jugugu登录
[**juguguFastRegPost**](DefaultApi.md#juguguFastRegPost) | **POST** /Jugugu_FastReg | 1.注册jugugu
[**juguguFastSignTxPost**](DefaultApi.md#juguguFastSignTxPost) | **POST** /Jugugu_FastSignTx | 4.使用jugugu进行交易签名


<a name="juguguFastGetNFTPost"></a>
# **juguguFastGetNFTPost**
> InlineResponse200 juguguFastGetNFTPost(inlineObject)

3.jugugu获取小红花POAP

使用项目方自己账户体系的OpenID注册并绑定jugugu账号，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行小红花POAP领取。

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      InlineResponse200 result = apiInstance.juguguFastGetNFTPost(inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#juguguFastGetNFTPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功 |  -  |

<a name="juguguFastLoginPost"></a>
# **juguguFastLoginPost**
> InlineResponse2001 juguguFastLoginPost(inlineObject3)

2.注册jugugu登录

使用项目方自己账户体系OpenID,用户手机号，项目方接入jugugu的Account和Secret登录用户jugugu账户，获得登录token  该token用于后续函数调用

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      InlineResponse2001 result = apiInstance.juguguFastLoginPost(inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#juguguFastLoginPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功 |  -  |

<a name="juguguFastRegPost"></a>
# **juguguFastRegPost**
> InlineResponse2001 juguguFastRegPost(inlineObject1)

1.注册jugugu

使用项目方自己账户体系的OpenID注册并绑定jugugu账号，如果该手机已经注册jugugu则直接进行绑定OpenID。注册的用户返回短密钥，绑定的用户不返回短密钥，短密钥请务必加密存储，建议使用ECC256进行加密，加密解密密钥妥善保存，建议内存中存放

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      InlineResponse2001 result = apiInstance.juguguFastRegPost(inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#juguguFastRegPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功 |  -  |

<a name="juguguFastSignTxPost"></a>
# **juguguFastSignTxPost**
> Object juguguFastSignTxPost(inlineObject2)

4.使用jugugu进行交易签名

使用项目方自己账户体系的OpenID，项目方接入jugugu的Account和Secret以及用户登录后的登录令牌token，等参数请求进行交易签名,返回签名后的交易数据rowData。详情见示例代码

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      Object result = apiInstance.juguguFastSignTxPost(inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#juguguFastSignTxPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功 |  -  |

