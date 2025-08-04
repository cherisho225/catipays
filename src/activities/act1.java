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
public class act1 {
    public static void main(String [] args){
   
        Scanner sc = new Scanner(System.in);

        String name;
        int subjects;
        double total = 0;
        double average;

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter grade for sub" + i + ": ");
            double grade = sc.nextDouble();
            total += grade;
        }

        average = total / subjects;

        System.out.println("\nClass Name: activity1");
        System.out.println("------------------------");
        System.out.println("Enter student name: " + name);
        System.out.println("Enter number of subjects: " + subjects);
        System.out.printf("Average: %.2f\n", average);

        if (average >= 75) {
            System.out.println("Remarks: PASSED");
        } else {
            System.out.println("Remarks: FAILED");
        }

        sc.close();
    }
}
   
}
