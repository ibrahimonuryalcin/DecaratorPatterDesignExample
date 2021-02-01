
package com.decaratordesignpattern.main;

import com.decaratordesignpattern.Interfaces.IMail;
import com.decaratordesignpattern.domain.GeneralMail;
import com.decaratordesignpattern.domain.PasswordDecarator;
import com.decaratordesignpattern.domain.SignedMailDecarator;

public class Driver {
    
    public static void main(String[] args) {
        String from = "Onur YALÇIN";
        String to = "Mehmet YALÇIN";
        IMail standartMail = new GeneralMail(from, to);
        IMail signedMail = new SignedMailDecarator(standartMail, from);
        IMail passwordMail = new PasswordDecarator(signedMail);
        
        passwordMail.send();
    }
    
}
