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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * HLRReponseEtatEtat
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-08T09:49:05.172Z")
public class HLRReponseEtatEtat   {
  @SerializedName("tel")
  private String tel = null;

  @SerializedName("operateur")
  private String operateur = null;

  public HLRReponseEtatEtat tel(String tel) {
    this.tel = tel;
    return this;
  }

   /**
   * Numero de téléphone concerné
   * @return tel
  **/
  @ApiModelProperty(example = "null", required = true, value = "Numero de téléphone concerné")
  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public HLRReponseEtatEtat operateur(String operateur) {
    this.operateur = operateur;
    return this;
  }

   /**
   * Opérateur associé (si numéro valide)
   * @return operateur
  **/
  @ApiModelProperty(example = "null", required = true, value = "Opérateur associé (si numéro valide)")
  public String getOperateur() {
    return operateur;
  }

  public void setOperateur(String operateur) {
    this.operateur = operateur;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HLRReponseEtatEtat hLRReponseEtatEtat = (HLRReponseEtatEtat) o;
    return Objects.equals(this.tel, hLRReponseEtatEtat.tel) &&
        Objects.equals(this.operateur, hLRReponseEtatEtat.operateur);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tel, operateur);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HLRReponseEtatEtat {\n");
    
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    operateur: ").append(toIndentedString(operateur)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

