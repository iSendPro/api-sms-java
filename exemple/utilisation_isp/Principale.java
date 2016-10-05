import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.model.HLRrequest.*;
import io.swagger.client.model.ComptageRequest.*;
import io.swagger.client.api.CreditApi;
import io.swagger.client.api.HlrApi;
import io.swagger.client.api.*;

import java.io.File;
import java.util.*;
public class Principale {

	public static void main(String[] args) {
		/*
		 * Credit
		 * */
		CreditApi apiInstance = new CreditApi();
        String keyid = ""; // String | Clee de compte iSendPro
        String credit = "1"; // String | Type de reponse demand�e, 1 pour euro et 2 pour messages
        try {
            CreditResponse result = apiInstance.getCredit(keyid, credit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreditApi#getCredit");
            e.printStackTrace();
        }
        /*
		 * Comptage
		 * */
        ComptageApi apiInstanceCpt = new ComptageApi();
        ComptageRequest cptr = new ComptageRequest();
        cptr.setKeyid(keyid);
        cptr.setComptage(ComptageEnum._1);
        cptr.setSms("test comptage nbr caractere");
        cptr.setNum("0601020304");
        try {
			ComptageReponse cptrep = apiInstanceCpt.comptage(cptr);
			System.out.println(cptrep);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        /*
		 * Hlr
		 * */
        HlrApi apiInstance2 = new HlrApi();
        HLRrequest hlrrequest = new HLRrequest(); // HLRrequest | Clee de compte sms low cost
		hlrrequest.setGetHLR(GetHLREnum._1);
        hlrrequest.setKeyid(keyid);
        ArrayList<String> nums= new ArrayList<String>();
        nums.add("0671820318");
        hlrrequest.setNum(nums);
        try {
            HLRReponse result = apiInstance2.getHlr(hlrrequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HlrApi#getHlr");
            e.printStackTrace();
        }
        /*
		 * Sms plusieurs destinataires
		 * */
        SmsApi apiInstance3 = new SmsApi();
        SMSRequest smsrequest = new SMSRequest(); // SMSRequest | sms request
        smsrequest.setKeyid(keyid);
        nums.add("0750961586");
        smsrequest.setNum(nums);
        ArrayList<String> smss=new ArrayList<String>();
        smss.add("Bonjour éè@€\n\n FIN ");
        smsrequest.setSms(smss);
        try {
            SMSReponse result = apiInstance3.sendSmsMulti(smsrequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SmsApi#sendSmsMulti");
            e.printStackTrace();
        }
        /*
		 * sms unique destinataire
		 * */
        SmsUniqueRequest smsrequestunique = new SmsUniqueRequest();
        smsrequestunique.setSms("Bonjour éè@€\n\n FIN 56789");
        smsrequestunique.setKeyid(keyid);
        smsrequestunique.setNum("0671820318");
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
