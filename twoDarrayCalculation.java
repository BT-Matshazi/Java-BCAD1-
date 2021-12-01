


public class twoDarrayCalculation {

   
    public static void main(String[] args) {
        String[] cars={"SUV","COUPE","SEDAN","VAN"};
        int [][] sales={
                            {25,15,35},
                            {25,55,35},
                            {11,20,45},
                            {17,27,25}
                         };
        
        double totalSales=0;
        //Display headings
        System.out.println("***************************");
        System.out.println("Vehicle Sales Report");
        System.out.println("***************************");
        System.out.println("\tJAN" + "\tFEB"+"\tMAR");
        for(int row=0;row<sales.length;row++){
            System.out.print(cars[row]);
            for(int col=0;col<sales[row].length;col++){
                
                System.out.print("\t" +sales[row][col]);
                
            }
            System.out.println();
            
        }
        //calculating totals
        System.out.println("***************************");
        System.out.println("Vehicle Total Sales");
        System.out.println("***************************");
        
        for(int row=0;row<sales.length;row++){
            System.out.print(cars[row]);
            for(int col=0;col<sales[row].length;col++){
                totalSales+=sales[row][col];
            }
            //print individual totals
            System.out.println("\t"+cars[row] + "\t " + totalSales + "(Silver Star)");
            totalSales=0;
            }
    }
    
}
