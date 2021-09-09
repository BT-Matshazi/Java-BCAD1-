

import java.util.*;
public class courseCal {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
         String moduleCode="";
        System.out.print("Enter Module Code: ");
        moduleCode=input.next();
        int size=0;
        System.out.print("Enter number of Students:");
        
        size=input.nextInt();
        
        int[] noOfStudents=new int[size];
       
            //fill Array
        for(int x=0;x<noOfStudents.length;x++){
            System.out.print("Enter Student " + (x+1));
            noOfStudents[x]=input.nextInt();
        }
        //method call
         displayStudents(noOfStudents,moduleCode);
        
    }
    
    public static void displayStudents(int[]noOfStudents,String moduleCode){
       
        int sum=0;
        int average=0;
        int count=0;
        
        System.out.println("---------------------------------------------");
        System.out.println(moduleCode + " Results Report");
        
        System.out.println("---------------------------------------------");
        
         for(int x=0;x<noOfStudents.length;x++){
             sum+=noOfStudents[x];
             count=noOfStudents.length;
             System.out.println("Student " + (x+1) + " " +
                     noOfStudents[x] + "% Received " );
         }    
         if(sum!=0 && count>0){
            average=sum/count;
         }
         else{
             System.out.println("can't devide by 0");
         }
        System.out.println("---------------------------------------------");
        System.out.println("Student Count: " + count);
        System.out.println("Student Average: " + average);
        System.out.println("---------------------------------------------");
    }
    
}
