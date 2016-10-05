# CampagneApi

All URIs are relative to *https://apirest.isendpro.com/cgi-bin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCampagne**](CampagneApi.md#getCampagne) | **GET** /campagne | Retourne les SMS envoyés sur une période donnée


<a name="getCampagne"></a>
# **getCampagne**
> File getCampagne(keyid, rapportCampagne, dateDeb, dateFin)

Retourne les SMS envoyés sur une période donnée

Retourne les SMS envoyés sur une période donnée en fonction d&#39;une date de début et d&#39;une date de fin.   Les dates sont au format YYYY-MM-DD hh:mm.   Le fichier rapport de campagne est sous la forme d&#39;un fichier zip + contenant un fichier csv contenant le détail des envois. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampagneApi;


CampagneApi apiInstance = new CampagneApi();
String keyid = "keyid_example"; // String | Clé API
String rapportCampagne = "rapportCampagne_example"; // String | Doit valoir \"1\"
String dateDeb = "dateDeb_example"; // String | date de debut au format YYYY-MM-DD hh:mm
String dateFin = "dateFin_example"; // String | date de fin au format YYYY-MM-DD hh:mm
try {
    File result = apiInstance.getCampagne(keyid, rapportCampagne, dateDeb, dateFin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampagneApi#getCampagne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyid** | **String**| Clé API |
 **rapportCampagne** | **String**| Doit valoir \&quot;1\&quot; | [enum: 1]
 **dateDeb** | **String**| date de debut au format YYYY-MM-DD hh:mm |
 **dateFin** | **String**| date de fin au format YYYY-MM-DD hh:mm |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, file

