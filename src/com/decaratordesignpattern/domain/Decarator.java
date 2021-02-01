
package com.decaratordesignpattern.domain;

import com.decaratordesignpattern.Interfaces.IMail;

public abstract class Decarator implements IMail{
    
    private IMail mail; 
    
    public Decarator(IMail mail){
        
        this.mail = mail;
        
    }

    @Override
    public void send() {
        mail.send();
    }
    
}
