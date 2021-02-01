
package com.decaratordesignpattern.domain;

import com.decaratordesignpattern.Interfaces.IMail;

public class PasswordDecarator extends Decarator{
    
    public PasswordDecarator(IMail mail) {
        super(mail);
    }

    @Override
    public void send() {
        super.send(); 
        
        System.out.println("Mail is encrypted");
    }
    
    
    
    
    
}
