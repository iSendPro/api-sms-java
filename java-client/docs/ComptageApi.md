# ComptageApi

All URIs are relative to *https://apirest.isendpro.com/cgi-bin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comptage**](ComptageApi.md#comptage) | **POST** /comptage | Compter le nombre de caractère 


<a name="comptage"></a>
# **comptage**
> ComptageReponse comptage(comptagerequest)

Compter le nombre de caractère 

Compte le nombre de SMS necessaire à un envoi

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComptageApi;


ComptageApi apiInstance = new ComptageApi();
ComptageRequest comptagerequest = new ComptageRequest(); // ComptageRequest | sms request
try {
    ComptageReponse result = apiInstance.comptage(comptagerequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComptageApi#comptage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **comptagerequest** | [**ComptageRequest**](ComptageRequest.md)| sms request |

### Return type

[**ComptageReponse**](ComptageReponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

