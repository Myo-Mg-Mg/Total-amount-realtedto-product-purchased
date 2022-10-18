package Projects;

import java.util.Scanner;

public class Product_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String product[][];
        int n,amount,total_amount;
        
        total_amount = 0;
        
        System.out.println("Enter number of porducts which you bought");
        n = scan.nextInt();
        
        product = new String[n][3];
        
        System.out.println("Enter porduct information which you bought");
        System.out.println("******************************************");
        
        scan.nextLine();  // Clear inout mixed process 
        
        
        for(int i =0; i<n; i++){
            System.out.println("Enter product name:");
            product[i][0] = scan.nextLine();
            System.out.println("Enter product price:");
            product[i][1] = scan.nextLine();
            System.out.println("Enter product quantity:");
            product[i][2] = scan.nextLine();
            System.out.println("******************************************");
            
        }
        System.out.println("Name\tPrice\tQuantity\tAmount");
        
        for(int row =0; row<n; row++){
            for (int col =0; col <3; col++){
                System.out.print(product[row][col] + "\t");  
            }
            amount = Integer.parseInt(product[row][1]) *
                     Integer.parseInt(product[row][2]);
            System.out.println(amount);
            total_amount += amount;
        }
        
        System.out.println("Total Amount = " + total_amount);
    }
}
