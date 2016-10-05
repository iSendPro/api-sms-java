<<<<<<< HEAD
# API : Envoi de SMS en PHP
ISendPro Telecom : Envoi de SMS depuis l'API en PHP<br />
https://www.isendpro.com/api-sms/api-envoi-sms-php
=======
# API : Envoi de SMS en JAVA
ISendPro Telecom : Envoi de SMS depuis l'API en JAVA<br />
https://www.isendpro.com/api-sms/api-envoi-sms-java
>>>>>>> origin/master

## Auteur
ISendPro Telecom<br />
https://www.isendpro.com

<<<<<<< HEAD
## La clé API

L'authentification nécessite une clé API. Cette clé est indispensable car elle vous identifie pour effectuer toutes vos requêtes via notre API SMS.
- Connectez vous à votre compte iSendPro Telecom ici : https://www.isendpro.com/connexion.php
- Cliquez ensuite sur l'onglet "Mon compte" puis sur la sous-rubrique "Mon API"
- Notez votre clé API "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"

## Autoriser l'accès

Le contrôle IP permet d'améliorer la sécurité en limitant l'accès à votre clé API. Vous pouvez soit renseigner une liste d'IP autorisées, soit désactiver totalement le contrôle IP.

- Cliquez sur l'onglet "Mon compte" puis sur la sous-rubrique "Mon API"
- Dans la rubrique "Gestion des adresses IP", ajoutez l'adresse IP appelante ou désactivez simplement le contrôle IP.

## Réaliser un premier appel à l'API

- Téléchargez le Wrapper PHP : https://github.com/iSendPro/api-sms-php
- Uploadez sur votre serveur le Wrapper PHP
- Éditez le fichier nommé testSms.php

## Réaliser un premier appel à l'API

Exemple de script pour l'envoi d'un simple SMS :

    <?php
    require_once("php-client/SwaggerClient-php/autoload.php");
    $api_instance = new Swagger\Client\Api\SmsApi();
    $smsrequest = new \Swagger\Client\Model\SmsUniqueRequest(); 
    $smsrequest["keyid"] ="ICI_CLE_API";
    $smsrequest["num"]="ICI_NUMERO_TELEPHONE";
    $smsrequest["sms"]="Ceci est un test avec un envoi unique!";
    try {
        $result = $api_instance->sendSms($smsrequest);
        print_r($result);
    } catch (Exception $e) {
        echo 'Exception when calling SmsApi->sendSms: ',print_r($e), PHP_EOL;
        print_r($e->getResponseObject());
    }
    ?>

Voici le type de réponse attendue aprés l'exécution de ce script :
=======
## La clÃ© API

L'authentification nÃ©cessite une clÃ© API. Cette clÃ© est indispensable car elle vous identifie pour effectuer toutes vos requÃªtes via notre API SMS.
- Connectez vous Ã  votre compte iSendPro Telecom ici : https://www.isendpro.com/connexion.php
- Cliquez ensuite sur l'onglet "Mon compte" puis sur la sous-rubrique "Mon API"
- Notez votre clÃ© API "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"

## Autoriser l'accÃ¨s

Le contrÃ´le IP permet d'amÃ©liorer la sÃ©curitÃ© en limitant l'accÃ¨s Ã  votre clÃ© API. Vous pouvez soit renseigner une liste d'IP autorisÃ©es, soit dÃ©sactiver totalement le contrÃ´le IP.

- Cliquez sur l'onglet "Mon compte" puis sur la sous-rubrique "Mon API"
- Dans la rubrique "Gestion des adresses IP", ajoutez l'adresse IP appelante ou dÃ©sactivez simplement le contrÃ´le IP.

## RÃ©aliser un premier appel Ã  l'API

- TÃ©lÃ©chargez le Wrapper JAVA : https://github.com/iSendPro/api-sms-java


Exemple de script pour l'envoi d'un simple SMS :

    import io.swagger.client.*;
    import io.swagger.client.auth.*;
    import io.swagger.client.model.*;
    import io.swagger.client.api.*;
    
    import java.io.File;
    import java.util.*;
    public class Principale {
    
            public static void main(String[] args) {
            
            SmsUniqueRequest smsrequestunique = new SmsUniqueRequest();
            smsrequestunique.setSms("Ceci est un test avec un envoi unique !");
            smsrequestunique.setKeyid("ICI_CLE_API");
            smsrequestunique.setNum("ICI_NUMERO_TELEPHONE");
            try{
                    SMSReponse result = apiInstance3.sendSms(smsrequestunique);
                System.out.println(result);
            }
            catch (ApiException e)
            {
                    System.err.println("Exception when calling SmsApi#sendSms");
                e.printStackTrace();
            }
            
            }
    
    }

Voici le type de rÃ©ponse attendue aprÃ©s l'exÃ©cution de ce script :
>>>>>>> origin/master

    {  
       "etat":{  
          "etat":[  
             {  
                "code":0,
                "tel":"06xxxxxxxx",
                "message":"Votre message a bien ete envoye"
             }
          ]
       }
    }

<<<<<<< HEAD
## Les paramètres

Il est possible de spécifier différents paramètres (optionnels) :

- date_envoi :	Date au format YYYY-MM-DD hh:mm. A utiliser uniquement en cas d'envoi différé

- emetteur :	L’émetteur doit être une chaîne alphanumérique comprise entre 4 et 11 caractères. Les caractères acceptés sont les chiffres entre 0 et 9, les lettres entre A et Z et l’espace. Il ne peut pas comporter uniquement des chiffres. Pour la modification de l’émetteur et dans le cadre de campagnes commerciales, les opérateurs imposent contractuellement d’ajouter en fin de message le texte suivant : STOP XXXXX De ce fait, le message envoyé ne pourra excéder une longueur de 149 caractères au lieu des 160 caractères, le « STOP » étant rajouté automatiquement.

- tracker	: Le tracker doit être une chaîne alphanumérique de moins de 50 caractères. Ce tracker sera ensuite renvoyé en paramètre des urls pour les retours des accusés de réception.

- smslong :	Nombre maximum de SMS concaténés que vous autorisez pour l'envoi de ce SMS. Le SMS long permet de dépasser la limite de 160 caractères en envoyant un message constitué de plusieurs SMS. Pour obtenir un calcul dynamique du nombre de SMS alors il faut renseigner smslong = 999

- nostop :	Si le message n’est pas à but commercial, vous pouvez faire une demande pour retirer l'obligation du STOP.

- ucs2 : Il est également possible d'envoyer des SMS en alphabet non latin (russe, chinois, arabe, etc) sur les numéros hors France métropolitaine. Pour ce faire, la requête devrait être encodée au format UTF-8 et contenir l'argument suivant ucs2 = 1 Du fait de contraintes techniques, 1 SMS unique ne pourra pas dépasser 70 caractères (au lieu des 160 usuels) et dans le cas de SMS long, chaque SMS ne pourra dépasser 67 caractères.

## La documentation complète

Documentation complète : https://www.isendpro.com/api-sms/doc-api-sms-restjson-isendpro.pdf

## Support technique

Si vous avez des questions techniques merci de contacter le support à l’adresse suivante : support@iSendPro.com. Le support technique est joignable tous les jours de la semaine de 9h à 13h et de 14h à 17h.
=======
## Les paramÃ¨tres

Il est possible de spÃ©cifier diffÃ©rents paramÃ¨tres (optionnels) :

- date_envoi :	Date au format YYYY-MM-DD hh:mm. A utiliser uniquement en cas d'envoi diffÃ©rÃ©

- emetteur :	Lâ€™Ã©metteur doit Ãªtre une chaÃ®ne alphanumÃ©rique comprise entre 4 et 11 caractÃ¨res. Les caractÃ¨res acceptÃ©s sont les chiffres entre 0 et 9, les lettres entre A et Z et lâ€™espace. Il ne peut pas comporter uniquement des chiffres. Pour la modification de lâ€™Ã©metteur et dans le cadre de campagnes commerciales, les opÃ©rateurs imposent contractuellement dâ€™ajouter en fin de message le texte suivant : STOP XXXXX De ce fait, le message envoyÃ© ne pourra excÃ©der une longueur de 149 caractÃ¨res au lieu des 160 caractÃ¨res, le Â« STOP Â» Ã©tant rajoutÃ© automatiquement.

- tracker	: Le tracker doit Ãªtre une chaÃ®ne alphanumÃ©rique de moins de 50 caractÃ¨res. Ce tracker sera ensuite renvoyÃ© en paramÃ¨tre des urls pour les retours des accusÃ©s de rÃ©ception.

- smslong :	Nombre maximum de SMS concatÃ©nÃ©s que vous autorisez pour l'envoi de ce SMS. Le SMS long permet de dÃ©passer la limite de 160 caractÃ¨res en envoyant un message constituÃ© de plusieurs SMS. Pour obtenir un calcul dynamique du nombre de SMS alors il faut renseigner smslong = 999

- nostop :	Si le message nâ€™est pas Ã  but commercial, vous pouvez faire une demande pour retirer l'obligation du STOP.

- ucs2 : Il est Ã©galement possible d'envoyer des SMS en alphabet non latin (russe, chinois, arabe, etc) sur les numÃ©ros hors France mÃ©tropolitaine. Pour ce faire, la requÃªte devrait Ãªtre encodÃ©e au format UTF-8 et contenir l'argument suivant ucs2 = 1 Du fait de contraintes techniques, 1 SMS unique ne pourra pas dÃ©passer 70 caractÃ¨res (au lieu des 160 usuels) et dans le cas de SMS long, chaque SMS ne pourra dÃ©passer 67 caractÃ¨res.

## La documentation complÃ¨te

Ce guide vous a permis d'envoyer votre premier SMS avec le wrapper JAVA de l'API REST. Vous pouvez maintenant poursuivre l'intÃ©gration de ce service dans votre application. Notre documentation complÃ¨te vous permettra de dÃ©couvrir d'autres options pour faciliter l'intÃ©gration de services tels que : La consultation du crÃ©dit, l'envoi d'un SMS Ã  de multiples destinataires, la qualification d'un numÃ©ro (Lookup HLR), tÃ©lÃ©chargement des rÃ©capitulatifs de campagne etc...

Documentation complÃ¨te : https://www.isendpro.com/api-sms/doc-api-sms-restjson-isendpro.pdf

## Support technique

Si vous avez des questions techniques merci de contacter le support Ã  lâ€™adresse suivante : support@iSendPro.com. Le support technique est joignable tous les jours de la semaine de 9h Ã  13h et de 14h Ã  17h.
>>>>>>> origin/master

