/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activities;

import java.util.Scanner;
/**
 *
 * @author SCC-COLLEGE
 */
public class AirFare {
    public static void main(String[] args) {
        
        System.out.println("Enter Disstance(km)");
        double km = scanner.nextDouble();
        
        
        System.out.print("Class (1 or 2): ");
        int choice = scanner.nextInt();

         double baseFarePerKm;

        if (choice == 1) {
          
            baseFarePerKm = 250;
        } else if (choice == 2) {
            
            baseFarePerKm = 500;
        } else {
            System.out.println("Invalid class selection!");
            scanner.close();
            return;
        }

        double totalFare = distance * baseFarePerKm;

        

        System.out.printf("Total Fare: ₱%.2f%n", totalFare);

        scanner.close();
    }
}
