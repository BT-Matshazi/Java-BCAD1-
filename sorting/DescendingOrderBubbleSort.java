//bubble sort decending order
//bekithemba matshazi

import javax.swing.JOptionPane;
import java.util.*;

public class DescendingOrderBubbleSort
{
    static int num = 10;
    static int[] numbers = new int[num];
    static int temp;

    public static void main (String [] args)
    {
        userInput();

        sortArray();

        displayArray();
    }

    public static void userInput()
    {
        int count = 0;
        int num_input;
        Scanner keyboard=new Scanner(System.in);

        while( count < 10)
        {   
            System.out.print("Enter a score: ");
            num_input=keyboard.nextInt();
            numbers[count]=num_input;
            count++;
        }
    }

    public static void sortArray()
    {
        int n = numbers.length;
        int temp = 0;
        
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
            
                if(numbers[j-1] < numbers[j])
                {
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void displayArray()
    {
        System.out.print(" ");
        System.out.print("The values in descending order are: ");

        for(int x = 0; x < num; x++){
            System.out.print( numbers[x] + " ");
        }

    }
}
