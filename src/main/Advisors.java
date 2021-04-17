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
public class Advisors extends LoginMains{
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    private String name;
    private String status;
    private String id;
    private String project;
    private double marks;
}
