# HlrApi

All URIs are relative to *https://apirest.isendpro.com/cgi-bin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHlr**](HlrApi.md#getHlr) | **POST** /hlr | Vérifier la validité d&#39;un numéro


<a name="getHlr"></a>
# **getHlr**
> HLRReponse getHlr(hlrrequest)

Vérifier la validité d&#39;un numéro

Réalise un lookup HLR sur les numéros  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HlrApi;


HlrApi apiInstance = new HlrApi();
HLRrequest hlrrequest = new HLRrequest(); // HLRrequest | 
try {
    HLRReponse result = apiInstance.getHlr(hlrrequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HlrApi#getHlr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hlrrequest** | [**HLRrequest**](HLRrequest.md)|  |

### Return type

[**HLRReponse**](HLRReponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

