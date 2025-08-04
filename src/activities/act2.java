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
public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter hourly rate: ");
        float rate = sc.nextFloat();
        System.out.println("Enter total hours worked: ");
        float hours = sc.nextFloat();
        
        System.out.println("-----------Wage Summary-----------");
        System.out.println("Employee: "+name);
        System.out.println("Hourly rate: P"+rate);
        System.out.println("Hours worked: "+hours);
        System.out.println("Gross weekly wage: "+(hours*rate));
        System.out.printf("SSS Contribution(10%%): P%.2f)\n", (hours*rate)*0.1);
        System.out.println("--------------------------------");
        System.out.printf("NEt weekly Wage: P%.2f\n\n",+((hours*rate)-((hours*rate)*0.1)));
        
        
              
    }
}
