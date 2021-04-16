/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Umar
 */
public class LoginMains {
    public String email;
    public String pass;

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        
        int size=email.length();
        boolean flag=false;
        for (int i=0;i<size; i++)
        {
            if (email.charAt(i)=='@')
            {
                if (email.charAt(i)=='.')
                {
                    flag=true;
                }
            }
        }
        if (flag==true)
            this.email = email;
        
        return flag;
    }

    public String getPass() {
        return pass;
    }

    public boolean setPass(String pass) {
        int size=pass.length();
        
        boolean flag=false;
        for (int i=0;i<size; i++)
        {
            if ((pass.charAt(i)>='a' && pass.charAt(i)<='z' ) && (pass.charAt(i)>='A' && pass.charAt(i)<='Z' ) && (pass.charAt(i)>='0' && pass.charAt(i)<='9' ))
            {
                flag=true;
            }
        }    
        if (flag==true)
        {
            this.pass = pass;
        }
        return flag;
    }
    
    
}
