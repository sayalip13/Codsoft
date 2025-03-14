package com.CodeSoft.Task2;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int totalMarks = 0;
        int marks;
        
        // Input marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            marks = scanner.nextInt();
            
            // Validate marks input
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks! Enter again (0-100): ");
                marks = scanner.nextInt();
            }
            
            totalMarks += marks;
        }
        
        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        
        // Determine grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

