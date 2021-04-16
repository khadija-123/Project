/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author Umar
 */
public class CommitteeMmbr {
    List <Advisors> advisorsList=new ArrayList<> ();
    List <Students> studentsList=new ArrayList<> ();

    List <Projects> projectsList=new ArrayList<> ();
    List <Evaluations> evaluationsList=new ArrayList<> ();
    
    public boolean addStudent(Students s)
    {
        studentsList.add(s);
        return true;
    }
    private int searchIndex(String number)
    {
        int index = -1;
         for(int i = 0 ; i  < studentsList.size(); i++)
         {
             if(studentsList.get(i).getRegNo().equals(number))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    public boolean deleteStudent(String number){
       int index = searchIndex(number);
       
       if(index == -1)
           return false;
       else {
           studentsList.remove(index);
           return true;
       }
    }
    
    
    
    
}
