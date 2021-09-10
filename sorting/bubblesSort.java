//bekithemba matshazi
//bubble sort program

public class bubblesSort
{
        static String [] tvShow = new String[] {"Big Bang Theory","Scandal","Modern Family","Dexter","Grand Designs"};

        static int [][] ratings = new int[][] {{9, 8, 5},
                                        {7, 5, 5},
                                        {8, 8, 8},
                                        {10, 7, 8},
                                        {3, 1, 5}};
    public static void main (String [] args)
    {

        report();

    }

    public static void report()
    {
        int avg =0;
        int sum = 0;
        int row = 0;
        int count = 0;
        String result ="";

        while (count < 3)
        {
            sum = sum + ratings[row][count];
            count++;
        }
        avg = sum/3;

        if(avg >= 7)
        {
            result = "yes";
        }
        if(avg < 7)
        {
            result = "no";
        }

        System.out.println("TV Show \t\t Ratings \t\t series continues");
        System.out.println(tvShow[1] );
        System.out.println(tvShow[2] );
        System.out.println(tvShow[3] );
        System.out.println(tvShow[4] );
        System.out.println(tvShow[5] );




    }
}
