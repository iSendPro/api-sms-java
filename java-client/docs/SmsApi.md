# SmsApi

All URIs are relative to *https://apirest.isendpro.com/cgi-bin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendSms**](SmsApi.md#sendSms) | **POST** /sms | Envoyer un sms
[**sendSmsMulti**](SmsApi.md#sendSmsMulti) | **POST** /smsmulti | Envoyer des SMS


<a name="sendSms"></a>
# **sendSms**
> SMSReponse sendSms(smsrequest)

Envoyer un sms

Envoi un sms vers un unique destinataire

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SmsApi;


SmsApi apiInstance = new SmsApi();
SmsUniqueRequest smsrequest = new SmsUniqueRequest(); // SmsUniqueRequest | sms request
try {
    SMSReponse result = apiInstance.sendSms(smsrequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#sendSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsrequest** | [**SmsUniqueRequest**](SmsUniqueRequest.md)| sms request |

### Return type

[**SMSReponse**](SMSReponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendSmsMulti"></a>
# **sendSmsMulti**
> SMSReponse sendSmsMulti(smsrequest)

Envoyer des SMS

Envoi de SMS vers 1 ou plusieurs destinataires 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SmsApi;


SmsApi apiInstance = new SmsApi();
SMSRequest smsrequest = new SMSRequest(); // SMSRequest | sms request
try {
    SMSReponse result = apiInstance.sendSmsMulti(smsrequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#sendSmsMulti");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsrequest** | [**SMSRequest**](SMSRequest.md)| sms request |

### Return type

[**SMSReponse**](SMSReponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

