# CreditApi

All URIs are relative to *https://apirest.isendpro.com/cgi-bin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCredit**](CreditApi.md#getCredit) | **GET** /credit | Interrogation credit


<a name="getCredit"></a>
# **getCredit**
> CreditResponse getCredit(keyid, credit)

Interrogation credit

Retourne le credit existant associe au compte. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreditApi;


CreditApi apiInstance = new CreditApi();
String keyid = "keyid_example"; // String | Clé API
String credit = "credit_example"; // String | Type de reponse demandée, 1 pour euro, 2 pour euro + estimation quantité
try {
    CreditResponse result = apiInstance.getCredit(keyid, credit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditApi#getCredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyid** | **String**| Clé API |
 **credit** | **String**| Type de reponse demandée, 1 pour euro, 2 pour euro + estimation quantité | [enum: 1, 2]

### Return type

[**CreditResponse**](CreditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

