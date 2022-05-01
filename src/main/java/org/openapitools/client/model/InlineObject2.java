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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineObject2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-01T20:35:15.858+08:00[Asia/Shanghai]")
public class InlineObject2 {
  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Integer time;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_PAYMENTPASS = "paymentpass";
  @SerializedName(SERIALIZED_NAME_PAYMENTPASS)
  private String paymentpass;

  public static final String SERIALIZED_NAME_OPENID = "openid";
  @SerializedName(SERIALIZED_NAME_OPENID)
  private String openid;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_UNSIGNTXJSON = "unsigntxjson";
  @SerializedName(SERIALIZED_NAME_UNSIGNTXJSON)
  private List<String> unsigntxjson = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CHAINTYPE = "chaintype";
  @SerializedName(SERIALIZED_NAME_CHAINTYPE)
  private String chaintype;


  public InlineObject2 phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public InlineObject2 account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * 通过接入jugugu申请
   * @return account
  **/
  @ApiModelProperty(required = true, value = "通过接入jugugu申请")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public InlineObject2 secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * 通过接入jugugu申请
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "通过接入jugugu申请")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public InlineObject2 time(Integer time) {
    
    this.time = time;
    return this;
  }

   /**
   * int64类型
   * @return time
  **/
  @ApiModelProperty(required = true, value = "int64类型")

  public Integer getTime() {
    return time;
  }


  public void setTime(Integer time) {
    this.time = time;
  }


  public InlineObject2 token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * 登录或者首次登录时获得
   * @return token
  **/
  @ApiModelProperty(required = true, value = "登录或者首次登录时获得")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public InlineObject2 paymentpass(String paymentpass) {
    
    this.paymentpass = paymentpass;
    return this;
  }

   /**
   * 可以自由设置也可以传“”空字符串，系统随机生成，建议让系统随机生成
   * @return paymentpass
  **/
  @ApiModelProperty(required = true, value = "可以自由设置也可以传“”空字符串，系统随机生成，建议让系统随机生成")

  public String getPaymentpass() {
    return paymentpass;
  }


  public void setPaymentpass(String paymentpass) {
    this.paymentpass = paymentpass;
  }


  public InlineObject2 openid(String openid) {
    
    this.openid = openid;
    return this;
  }

   /**
   * 项目方账户系统的唯一识别码，用于绑定登录jugugu系统
   * @return openid
  **/
  @ApiModelProperty(required = true, value = "项目方账户系统的唯一识别码，用于绑定登录jugugu系统")

  public String getOpenid() {
    return openid;
  }


  public void setOpenid(String openid) {
    this.openid = openid;
  }


  public InlineObject2 from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * jugugu区块链地址，与phone对应
   * @return from
  **/
  @ApiModelProperty(required = true, value = "jugugu区块链地址，与phone对应")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public InlineObject2 unsigntxjson(List<String> unsigntxjson) {
    
    this.unsigntxjson = unsigntxjson;
    return this;
  }

  public InlineObject2 addUnsigntxjsonItem(String unsigntxjsonItem) {
    this.unsigntxjson.add(unsigntxjsonItem);
    return this;
  }

   /**
   * Get unsigntxjson
   * @return unsigntxjson
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getUnsigntxjson() {
    return unsigntxjson;
  }


  public void setUnsigntxjson(List<String> unsigntxjson) {
    this.unsigntxjson = unsigntxjson;
  }


  public InlineObject2 chaintype(String chaintype) {
    
    this.chaintype = chaintype;
    return this;
  }

   /**
   * 这里填cfx即可
   * @return chaintype
  **/
  @ApiModelProperty(required = true, value = "这里填cfx即可")

  public String getChaintype() {
    return chaintype;
  }


  public void setChaintype(String chaintype) {
    this.chaintype = chaintype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(this.phone, inlineObject2.phone) &&
        Objects.equals(this.account, inlineObject2.account) &&
        Objects.equals(this.secret, inlineObject2.secret) &&
        Objects.equals(this.time, inlineObject2.time) &&
        Objects.equals(this.token, inlineObject2.token) &&
        Objects.equals(this.paymentpass, inlineObject2.paymentpass) &&
        Objects.equals(this.openid, inlineObject2.openid) &&
        Objects.equals(this.from, inlineObject2.from) &&
        Objects.equals(this.unsigntxjson, inlineObject2.unsigntxjson) &&
        Objects.equals(this.chaintype, inlineObject2.chaintype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, account, secret, time, token, paymentpass, openid, from, unsigntxjson, chaintype);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    paymentpass: ").append(toIndentedString(paymentpass)).append("\n");
    sb.append("    openid: ").append(toIndentedString(openid)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    unsigntxjson: ").append(toIndentedString(unsigntxjson)).append("\n");
    sb.append("    chaintype: ").append(toIndentedString(chaintype)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

