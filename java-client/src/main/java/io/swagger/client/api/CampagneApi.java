/**
 * API iSendPro
 * [1] Liste des fonctionnalités : - envoi de SMS à un ou plusieurs destinataires, - lookup HLR, - récupération des récapitulatifs de campagne, - gestion des répertoires, - ajout en liste noire. - comptage du nombre de caractères des SMS  [2] Pour utiliser cette API vous devez: - Créer un compte iSendPro sur https://isendpro.com/ - Créditer votre compte      - Remarque: obtention d'un crédit de test possible sous conditions - Noter votre clé de compte (keyid)   - Elle vous sera indispensable à l'utilisation de l'API   - Vous pouvez la trouver dans le rubrique mon \"compte\", sous-rubrique \"mon API\" - Configurer le contrôle IP   - Le contrôle IP est configurable dans le rubrique mon \"compte\", sous-rubrique \"mon API\"   - Il s'agit d'un système de liste blanche, vous devez entrer les IP utilisées pour appeler l'API   - Vous pouvez également désactiver totalement le contrôle IP 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@isendpro.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.Erreur;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CampagneApi {
    private ApiClient apiClient;

    public CampagneApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CampagneApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCampagne */
    private com.squareup.okhttp.Call getCampagneCall(String keyid, String rapportCampagne, String dateDeb, String dateFin, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'keyid' is set
        if (keyid == null) {
            throw new ApiException("Missing the required parameter 'keyid' when calling getCampagne(Async)");
        }
        
        // verify the required parameter 'rapportCampagne' is set
        if (rapportCampagne == null) {
            throw new ApiException("Missing the required parameter 'rapportCampagne' when calling getCampagne(Async)");
        }
        
        // verify the required parameter 'dateDeb' is set
        if (dateDeb == null) {
            throw new ApiException("Missing the required parameter 'dateDeb' when calling getCampagne(Async)");
        }
        
        // verify the required parameter 'dateFin' is set
        if (dateFin == null) {
            throw new ApiException("Missing the required parameter 'dateFin' when calling getCampagne(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/campagne".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (keyid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "keyid", keyid));
        if (rapportCampagne != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "rapportCampagne", rapportCampagne));
        if (dateDeb != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_deb", dateDeb));
        if (dateFin != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_fin", dateFin));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "file"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Retourne les SMS envoyés sur une période donnée
     * Retourne les SMS envoyés sur une période donnée en fonction d&#39;une date de début et d&#39;une date de fin.   Les dates sont au format YYYY-MM-DD hh:mm.   Le fichier rapport de campagne est sous la forme d&#39;un fichier zip + contenant un fichier csv contenant le détail des envois. 
     * @param keyid Clé API (required)
     * @param rapportCampagne Doit valoir \&quot;1\&quot; (required)
     * @param dateDeb date de debut au format YYYY-MM-DD hh:mm (required)
     * @param dateFin date de fin au format YYYY-MM-DD hh:mm (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getCampagne(String keyid, String rapportCampagne, String dateDeb, String dateFin) throws ApiException {
        ApiResponse<File> resp = getCampagneWithHttpInfo(keyid, rapportCampagne, dateDeb, dateFin);
        return resp.getData();
    }

    /**
     * Retourne les SMS envoyés sur une période donnée
     * Retourne les SMS envoyés sur une période donnée en fonction d&#39;une date de début et d&#39;une date de fin.   Les dates sont au format YYYY-MM-DD hh:mm.   Le fichier rapport de campagne est sous la forme d&#39;un fichier zip + contenant un fichier csv contenant le détail des envois. 
     * @param keyid Clé API (required)
     * @param rapportCampagne Doit valoir \&quot;1\&quot; (required)
     * @param dateDeb date de debut au format YYYY-MM-DD hh:mm (required)
     * @param dateFin date de fin au format YYYY-MM-DD hh:mm (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getCampagneWithHttpInfo(String keyid, String rapportCampagne, String dateDeb, String dateFin) throws ApiException {
        com.squareup.okhttp.Call call = getCampagneCall(keyid, rapportCampagne, dateDeb, dateFin, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retourne les SMS envoyés sur une période donnée (asynchronously)
     * Retourne les SMS envoyés sur une période donnée en fonction d&#39;une date de début et d&#39;une date de fin.   Les dates sont au format YYYY-MM-DD hh:mm.   Le fichier rapport de campagne est sous la forme d&#39;un fichier zip + contenant un fichier csv contenant le détail des envois. 
     * @param keyid Clé API (required)
     * @param rapportCampagne Doit valoir \&quot;1\&quot; (required)
     * @param dateDeb date de debut au format YYYY-MM-DD hh:mm (required)
     * @param dateFin date de fin au format YYYY-MM-DD hh:mm (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCampagneAsync(String keyid, String rapportCampagne, String dateDeb, String dateFin, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCampagneCall(keyid, rapportCampagne, dateDeb, dateFin, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}