# QualificationApi

All URIs are relative to *https://apirest.isendpro.com/cgi-bin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qualification**](QualificationApi.md#qualification) | **POST** /qualification | Qualification de numéros


<a name="qualification"></a>
# **qualification**
> QUALIFICATIONreponse qualification(qualificationrequest)

Qualification de numéros

Retourne la qualification d&#39;une liste de numeros. Informations de qualification: validité du préfixe, présence en  liste noire, opérateur attributaire technique).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QualificationApi;


QualificationApi apiInstance = new QualificationApi();
QUALIFICATIONrequest qualificationrequest = new QUALIFICATIONrequest(); // QUALIFICATIONrequest | Requête de qualification
try {
    QUALIFICATIONreponse result = apiInstance.qualification(qualificationrequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualificationApi#qualification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qualificationrequest** | [**QUALIFICATIONrequest**](QUALIFICATIONrequest.md)| Requête de qualification |

### Return type

[**QUALIFICATIONreponse**](QUALIFICATIONreponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

