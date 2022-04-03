package com.simplilearn;
//Java  Naming Conventions
import java.util.Date;
//class names are nouns in upper camel case
public class CreditCard {
//    constants should be decalred in all uppercase letters
    public final int VISA = 5001;
    
//    variable  names are short but meaningful in lower camel case
    public String accountName;
    public String cardNumber;
    public Date expDate;
    
//    methods should be verbs , in lower camel case
    public double getCharges() {
        return 0.0;
    }
    
    public void disputeCharge(String chargeId,float amount) {
        
    }
}
