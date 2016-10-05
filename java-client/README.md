# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CampagneApi;

import java.io.File;
import java.util.*;

public class CampagneApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://apirest.isendpro.com/cgi-bin*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CampagneApi* | [**getCampagne**](docs/CampagneApi.md#getCampagne) | **GET** /campagne | Retourne les SMS envoyés sur une période donnée
*ComptageApi* | [**comptage**](docs/ComptageApi.md#comptage) | **POST** /comptage | Compter le nombre de caractère 
*CreditApi* | [**getCredit**](docs/CreditApi.md#getCredit) | **GET** /credit | Interrogation credit
*HlrApi* | [**getHlr**](docs/HlrApi.md#getHlr) | **POST** /hlr | Vérifier la validité d&#39;un numéro
*RepertoireApi* | [**repertoire**](docs/RepertoireApi.md#repertoire) | **PUT** /repertoire | Gestion repertoire (modification)
*RepertoireApi* | [**repertoireCrea**](docs/RepertoireApi.md#repertoireCrea) | **POST** /repertoire | Gestion repertoire (creation)
*SetListeNoireApi* | [**setListeNoire**](docs/SetListeNoireApi.md#setListeNoire) | **POST** /setlistenoire | Ajoute un numero en liste noire
*SmsApi* | [**sendSms**](docs/SmsApi.md#sendSms) | **POST** /sms | Envoyer un sms
*SmsApi* | [**sendSmsMulti**](docs/SmsApi.md#sendSmsMulti) | **POST** /smsmulti | Envoyer des SMS


## Documentation for Models

 - [ComptageReponse](docs/ComptageReponse.md)
 - [ComptageReponseEtat](docs/ComptageReponseEtat.md)
 - [ComptageReponseEtatEtat](docs/ComptageReponseEtatEtat.md)
 - [ComptageRequest](docs/ComptageRequest.md)
 - [CreditResponse](docs/CreditResponse.md)
 - [CreditResponseEtat](docs/CreditResponseEtat.md)
 - [Erreur](docs/Erreur.md)
 - [ErreurEtat](docs/ErreurEtat.md)
 - [ErreurEtatEtat](docs/ErreurEtatEtat.md)
 - [HLRReponse](docs/HLRReponse.md)
 - [HLRReponseEtat](docs/HLRReponseEtat.md)
 - [HLRReponseEtatEtat](docs/HLRReponseEtatEtat.md)
 - [HLRrequest](docs/HLRrequest.md)
 - [LISTENOIREReponse](docs/LISTENOIREReponse.md)
 - [LISTENOIREReponseEtat](docs/LISTENOIREReponseEtat.md)
 - [LISTENOIREReponseEtatEtat](docs/LISTENOIREReponseEtatEtat.md)
 - [REPERTOIREcreatereponse](docs/REPERTOIREcreatereponse.md)
 - [REPERTOIREcreatereponseEtat](docs/REPERTOIREcreatereponseEtat.md)
 - [REPERTOIREcreatereponseEtatEtat](docs/REPERTOIREcreatereponseEtatEtat.md)
 - [REPERTOIREcreaterequest](docs/REPERTOIREcreaterequest.md)
 - [REPERTOIREmodifreponse](docs/REPERTOIREmodifreponse.md)
 - [REPERTOIREmodifreponseEtat](docs/REPERTOIREmodifreponseEtat.md)
 - [REPERTOIREmodifreponseEtatEtat](docs/REPERTOIREmodifreponseEtatEtat.md)
 - [REPERTOIREmodifrequest](docs/REPERTOIREmodifrequest.md)
 - [SMSReponse](docs/SMSReponse.md)
 - [SMSReponseEtat](docs/SMSReponseEtat.md)
 - [SMSReponseEtatEtat](docs/SMSReponseEtatEtat.md)
 - [SMSRequest](docs/SMSRequest.md)
 - [SmsUniqueRequest](docs/SmsUniqueRequest.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

support@isendpro.com

