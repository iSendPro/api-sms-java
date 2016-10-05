# SetListeNoireApi

All URIs are relative to *https://apirest.isendpro.com/cgi-bin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**setListeNoire**](SetListeNoireApi.md#setListeNoire) | **POST** /setlistenoire | Ajoute un numero en liste noire


<a name="setListeNoire"></a>
# **setListeNoire**
> LISTENOIREReponse setListeNoire(keyid, setlisteNoire, num)

Ajoute un numero en liste noire

Ajoute un numero en liste noire. Une fois ajouté, les requêtes d&#39;envoi de SMS marketing vers ce numéro seront refusées.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SetListeNoireApi;


SetListeNoireApi apiInstance = new SetListeNoireApi();
String keyid = "keyid_example"; // String | Clé API
String setlisteNoire = "setlisteNoire_example"; // String | Doit valoir \"1\"
String num = "num_example"; // String | numéro de mobile à insérer en liste noire
try {
    LISTENOIREReponse result = apiInstance.setListeNoire(keyid, setlisteNoire, num);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SetListeNoireApi#setListeNoire");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyid** | **String**| Clé API |
 **setlisteNoire** | **String**| Doit valoir \&quot;1\&quot; | [enum: 1]
 **num** | **String**| numéro de mobile à insérer en liste noire |

### Return type

[**LISTENOIREReponse**](LISTENOIREReponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

