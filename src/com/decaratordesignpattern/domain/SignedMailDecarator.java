
package com.decaratordesignpattern.domain;

import com.decaratordesignpattern.Interfaces.IMail;

public class SignedMailDecarator extends Decarator{
    private String sign; 
    
    public SignedMailDecarator(IMail mail, String sign){
        super(mail);
        this.sign = sign;
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Signed by " + sign);
    }
    
    
    
    
}
