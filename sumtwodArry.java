


public class sumtwodArry {

    public static void main(String[] args) {
        String [] phone={"IPHONE 7", "Samsung 8","Huawei Mate 10"};
        int [][]sales={
            {30,15,35},
            {20,25,30},
            {25,11,32}
        };
        //display headings
        int total=0;
        System.out.println("********************************");
       System.out.println("\t\t\tJAN"+ "\t\tFEB"+ "\t\tMARCH");
       System.out.println("********************************");
       
       for(int row=0;row<sales.length;row++){
                System.out.print(phone[row]);
           for(int col=0;col<sales[row].length;col++){
                System.out.print("\t\t"+ sales[row][col]);
               
           }
           System.out.print("\n");
       }
       System.out.print("Monthly Totals:");
       for(int col=0;col<sales[0].length;col++){
            total=0;
           for(int row=0;row<sales.length;row++){
              
               total+=sales[row][col];
           }
           
           System.out.print("\t\t" + total);
       }
        
    }
    
}
