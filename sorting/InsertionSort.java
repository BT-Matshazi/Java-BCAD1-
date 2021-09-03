public class InsertionSort
{
    static int[] arr = { 50, 80, 10, 30, 90, 60, 89, 56, 98, 19, 22, 37};
    public static void main(String [] args)
    {
        insertionSort();
        
        printArray();
    }

    public static void insertionSort() 
    {
        int n = arr.length;

        for(int i = 1; i < n; i++) 
        {
            int key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && arr[j] > key) 
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
      }

      public static void printArray()
      {
            for(int x = 0; x < arr.length; x++)
            {
                System.out.println( arr[x] + "  ");
            }
      }
}