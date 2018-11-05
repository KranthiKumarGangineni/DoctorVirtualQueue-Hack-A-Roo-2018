package HackARoo.TeamAlpha.sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
	public static final String ACCOUNT_SID = "ACfbe36e923e31cec7558386ce0b8d33c0";
    public static final String AUTH_TOKEN = "c80297c19e25f50ede129cf730e3427f";

    public static void main(String[] args) {
        
    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    	
    	if(args != null && args.length > 0) {
    		Message.creator(new PhoneNumber(args[1]),
    	            new PhoneNumber("+16203749149"), args[0]).create();
    	}else {
    	    Message message = Message.creator(new PhoneNumber("+19136341342"),
            new PhoneNumber("+19203106287"), 
            "Some Unknown Number tried to login").create();

        System.out.println(message.getSid());
    	}
    }
}
