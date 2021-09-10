//bekithemb matshazi
//java insertion sort program

import javax.swing.JOptionPane;
import java.util.*;

public class StringBubbleSort
{
    static int num = 15;
    static String [] words = new Sting[num];
    static String temp;
    public static void main (String [] args)
    {
        userInput();

        displayArray();
    }

    public static void userInput()
    {
        int count = 0;
        String word_input;
        Scanner keyboard = new Scanner(System.in);

        while( count < 15)
        {   
            System.out.print("Enter a word: ");
            word_input =keyboard.nextLine();
            words[count] = word_input;
            count++;
        }
    }

    public static void displayArray()
    {
        System.out.print(" ");
        // System.out.print("The values in descending order are: ");

        for(int x = 0; x < num; x++){
            System.out.print( words[x] + " ");
        }

    }

}
