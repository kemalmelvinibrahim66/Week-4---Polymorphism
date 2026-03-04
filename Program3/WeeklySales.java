// *************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
// ************************************************************

import java.util.Scanner;

public class WeeklySales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size;

        System.out.print("Berapa Staff yang ingin dimasukan datanya? ");
        size = scan.nextInt();
        Salesperson[] salesStaff = new Salesperson[size];

        for(int i = 0; i < size; i++){
            System.out.println("Masukan data Staff ke " + (i+1) + ": ");
            
            System.out.print("First Name: ");
            String firstN = scan.next();

            System.out.print("Last Name: ");
            String lastN = scan.next();

            System.out.print("Total sales: ");
            int sales = scan.nextInt();

            salesStaff[i] = new Salesperson(firstN, lastN, sales);
        }

        scan.close();

        Sorting.insertionSort(salesStaff);
        System.out.println ("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
        System.out.println (s);
    }
} 