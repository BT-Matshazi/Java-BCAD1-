//bekithemba matshazi

import javax.swing.*;

public class Vehicle {

    public static void main(String[] args) {
        
        //Array declaration
        
        int [] vin={112367,212367,312367};
        String[] manufacturer={"AUDI","BMW","VOLVO"};
        double[]price={180000,170000,210000};
        int choice=0;
        choice=Integer.parseInt(JOptionPane.showInputDialog("Enter(1) to search for vehicle details" +
                                            "\n Enter(2) to display all the vehicle details" +
                                            "\n Enter(0) to exit.","Input Menu Choice"));
        SearchArray(vin,manufacturer,price,choice);
        display(vin,manufacturer,price,choice);
        logout(choice);
       
    }

    public static void SearchArray(int[] vin, String[] manufacturer, double[] price,int choice) {
        int vinNum=0;
        if(choice==1){
          vinNum=  Integer.parseInt(JOptionPane.showInputDialog("Enter Vehicle VIN", "Input Vin")); 
          for(int x=0;x<vin.length;x++){
              if(vin[x]==vinNum){
                  JOptionPane.showMessageDialog(null,"VIN" + vin[x] + 
                                                "\n Manufacturer: " + manufacturer[x] +
                                                "\n PRICE: " + price[x]);
              break;
              }
              else
                  JOptionPane.showMessageDialog(null,"The vehicle you hav entered does not exist");
                  break;
              }
              
          }
        }

    private static void display(int[] vin, String[] manufacturer, double[] price, int choice) {
        if (choice==2){
            for(int x=0;x<vin.length;x++){
                JOptionPane.showMessageDialog(null,"VIN \t VEHICLE \t PRICE"+
                                                "\n VIN" + vin[x] + 
                                                "\n Manufacturer: " + manufacturer[x] +
                                                "\n PRICE: " + price[x] +" " +vin.length);
                
            }
            
        }
    }

    private static void logout(int choice) {
        if(choice==0){
            JOptionPane.showMessageDialog(null,"Goodbye, Thank you for using our System");
            System.exit(0);
        }
    }
        
    }
    

