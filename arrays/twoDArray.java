//creating a 2d and 1d array

public class Array
{
    public static void main (String [] args) 
    {
        string [] tvShow = new string[] {"Big Bang Theory","Scandal","Modern Family","Dexter","Grand Designs"};

        int [][] ratings = new int[][] {{9, 8, 5},
                                        {7, 5, 5},
                                        {8, 8, 8},
                                        {10, 7, 8},
                                        {3, 1, 5}};

        System.out.println(ratings[1][2]);
    }
}
