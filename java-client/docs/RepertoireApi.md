# RepertoireApi

All URIs are relative to *https://apirest.isendpro.com/cgi-bin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repertoire**](RepertoireApi.md#repertoire) | **PUT** /repertoire | Gestion repertoire (modification)
[**repertoireCrea**](RepertoireApi.md#repertoireCrea) | **POST** /repertoire | Gestion repertoire (creation)


<a name="repertoire"></a>
# **repertoire**
> REPERTOIREmodifreponse repertoire(repertoiremodifrequest)

Gestion repertoire (modification)

Ajoute ou supprime une liste de numéros à un répertoire existant.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepertoireApi;


RepertoireApi apiInstance = new RepertoireApi();
REPERTOIREmodifrequest repertoiremodifrequest = new REPERTOIREmodifrequest(); // REPERTOIREmodifrequest | Requête de creation repertoire
try {
    REPERTOIREmodifreponse result = apiInstance.repertoire(repertoiremodifrequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepertoireApi#repertoire");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repertoiremodifrequest** | [**REPERTOIREmodifrequest**](REPERTOIREmodifrequest.md)| Requête de creation repertoire |

### Return type

[**REPERTOIREmodifreponse**](REPERTOIREmodifreponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repertoireCrea"></a>
# **repertoireCrea**
> REPERTOIREcreatereponse repertoireCrea(repertoirecreaterequest)

Gestion repertoire (creation)

Cree un nouveau répertoire et retourne son identifiant. Cet identifiant pourra être utilisé pour ajouter ou supprimer des numéros via l&#39;API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepertoireApi;


RepertoireApi apiInstance = new RepertoireApi();
REPERTOIREcreaterequest repertoirecreaterequest = new REPERTOIREcreaterequest(); // REPERTOIREcreaterequest | Creation repertoire
try {
    REPERTOIREcreatereponse result = apiInstance.repertoireCrea(repertoirecreaterequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepertoireApi#repertoireCrea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repertoirecreaterequest** | [**REPERTOIREcreaterequest**](REPERTOIREcreaterequest.md)| Creation repertoire |

### Return type

[**REPERTOIREcreatereponse**](REPERTOIREcreatereponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

