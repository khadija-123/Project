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
public class Students {

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        boolean flag=false;
      for(int i=0;i<name.length();i++)
      {
         if(name.charAt(i)==' '||name.charAt(i)>='a'&&name.charAt(i)<='z'||name.charAt(i)>='A'&&name.charAt(i)<='Z')
         {
            flag=true;
         }
         else
         {
            flag=false;
            break;
         }
      }
      if(flag==true)
      {
         this.name = name;
      }
      return flag;
        
    }

    public String getRegNo() {
        return regNo;
    }

    public boolean setRegNo(String regno) {
        boolean flag=false;
      int size=regno.length();
      if (regno.charAt(0) == '2' && regno.charAt(1) == '0')
      {
         flag = true;
      }
      else
      {
         flag = false;
      }
    
      if (flag == true)
      {
         for (int i = 2; i < 4; i++)
         {
            if (regno.charAt(i) >= '0' && regno.charAt(i) <= '9')
            {
               flag = true;
            }
            else
            {
               flag = false;
            }
         }
      }
      if (flag == true)
      {
         if (regno.charAt(4) == '-')
         {
            flag = true;
         }
         else
         {
            flag = false;
         }
      }
      if (flag == true)
      {
         for (int i = 5; i < 7; i++)
         {
            if (regno.charAt(i) >= 'A' && regno.charAt(i) <= 'Z')
            {
               flag = true;
            }
            else
            {
               flag = false;
            }
         }
      }
      if (flag == true)
      {
         if (regno.charAt(7) == '-')
         {
            flag = true;
         }
         else
         {
            flag = false;
         }
      }
      if (flag == true)
      {
         for (int i = 8; i < size; i++)
         {
            if (regno.charAt(i) >= '0' && regno.charAt(i) <= '9')
            {
               flag = true;
            }
            else
            {
               flag = false;
            }
         }
      }
    
      if (flag==true)
      {
         this.regNo = regno;
         return true;
      }
      else
      {
         return false;
      }
        
    }

    public String getSession() {
        return session;
    }

    public void setSession(String regNo) {
        String session="";
        for (int i=0;i<4;i++)
        {
            char arr=regNo.charAt(i);
            session=session+arr;
        }
        this.session=session;
    }
    private String name;
    private String regNo;
    private String session;
    
}
