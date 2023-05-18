/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdetailsprint;
/**
 *
 * @author sahibjotsingh
 */
import java.util.*;
public class NewClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // array of object decalration
         Student[] list =  new Student[3];
         Scanner inp = new Scanner(System.in);
         for(int i=0;i<list.length;i++)
         {
             String n = inp.next();
             int a = inp.nextInt();
             //create object?
             Student s1 = new Student (n,a);
             list[i] = s1;
          
         }
         for(Student list1 : list) {
             System.out.println(list1.getName() + " " + list1.getAge());
         }
         
    }}
