/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Umar
 */
public class CommitteeMmbr extends LoginMains{
    List <Advisors> advisorsList=new ArrayList<> ();
    List <Students> studentsList=new ArrayList<> ();

    List <Projects> projectsList=new ArrayList<> ();
    List <Evaluations> evaluationsList=new ArrayList<> ();
    
    public boolean addStudent(Students s)
    {
        studentsList.add(s);
        return true;
    }
    public boolean indexVisible(String regno)
    {
    
        boolean flag=false;
        for(int i = 0 ; i  < studentsList.size(); i++)
         {
             if(studentsList.get(i).getRegNo().equals(regno))
             {
                 flag=true;
                 break;
             }
             else
             {
                 flag=false;
             }
         }
        return flag;
    }
    public int searchIndex(String regno)
    {
        int index = -1;
         for(int i = 0 ; i  < studentsList.size(); i++)
         {
             if(studentsList.get(i).getRegNo().equals(regno))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    public boolean deleteStudent(String regno){
        
       int index;
       index=searchIndex(regno);
       
       if(index == -1)
           return false;
       else {
           studentsList.remove(index);
           return true;
       }
    }
    public void saveData(Students s) throws IOException{
    Writer writer = null;
    
    try
    {
    
    File file = new File("Students.pdf");
    writer = new BufferedWriter(new FileWriter(file));
    writer.write("PDF Created");
    } catch (FileNotFoundException e)
    {
    } catch (IOException e)
    {
    } finally
    {
    if (writer != null)
    {
    writer.close();
    }
    }
    }
        public void loadData(LoginMains l)
        {
        try {
            FileReader fr = new FileReader("emails.txt");
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
          line = br.readLine();
          while(line != null)
          {
               l=new CommitteeMmbr();
               String[] toks = line.split(",");
               l.setEmail(toks[0]);
               l.setPass(toks[1]);               
          }
        
            br.close();
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(LoginMains.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}

   
