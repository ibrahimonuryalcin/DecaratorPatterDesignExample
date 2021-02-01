
package com.decaratordesignpattern.domain;

import com.decaratordesignpattern.Interfaces.IMail;

public class GeneralMail implements IMail{
    
    private String from;
    private String to;
    
    public GeneralMail(String from, String to){
        
        this.from = from;
        this.to = to;
        
    }

    @Override
    public void send() {
        System.out.println("Mail goes from " + from + " to " + to);
    }
    
    
    
    
}
