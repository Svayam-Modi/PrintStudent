/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentarray;

/**
 *
 * @author Svayam Modi
 *date :- 25
 * hi 
 */
public class StudentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("Svayam");
        s1.setAge(18);
        
        Student s2 = new Student();
        s2.setName("Kartik");
        s2.setAge(18);
        
        Student s3 = new Student();
        s3.setName("Utsav");
        s3.setAge(19);
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i =0; i< 3; i++)
        {
            System.out.println(list[i]);
        }

        for(int i =0; i< 3; i++)
        {
            System.out.println(list[i].getName() +" "+ list[i].getAge());
            System.out.println("Hi there");
        }        
    }
    
}
