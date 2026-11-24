/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robillos_javaopp2;

/**
 *
 * @author ROBILLOS_CPE113
 */
public class Robillos_JavaOpp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create two student records
        LabGrade ana = new LabGrade("Ana", 80, 90);
        LabGrade ben = new LabGrade("Ben", 101, 85);
        
        // Display Ana's record
        System.out.println("Ana's Record (80, 90)");
        System.out.println("Final Grade: " + ana.getFinalGrade());
        System.out.println("Passing: " + ana.isPassing());

        System.out.println();
        
        // Display Ben's record
        System.out.println("Ben's Record (101, 85)");
        System.out.println("Final Grade: " + ben.getFinalGrade());
        System.out.println("Passing: " + ben.isPassing());

        System.out.println();
        
        // Test invalid update
        System.out.println("Update Ana (95, 101): " + ana.updateScores(95, 101));
        
        // Display Ana's record
        System.out.println("Ana's Record");
        System.out.println("Final Grade: " + ana.getFinalGrade());
        System.out.println("Passing: " + ana.isPassing());

        System.out.println();
        
        // Test valid update
        System.out.println("Update Ana (74, 75): " + ana.updateScores(74, 75));

        // Display updated record
        System.out.println("Ana's Updated Record");
        System.out.println("Final Grade: " + ana.getFinalGrade());
        System.out.println("Passing: " + ana.isPassing());

        System.out.println();
        
        // Test another valid update
        System.out.println("Update Ana (75, 75): " + ana.updateScores(75, 75));

        // Display final record
        System.out.println("Ana's Final Record");
        System.out.println("Final Grade: " + ana.getFinalGrade());
        System.out.println("Passing: " + ana.isPassing());

        System.out.println();
        
        // Check Ben's record
        System.out.println("Ben's Record");
        System.out.println("Final Grade: " + ben.getFinalGrade());
        System.out.println("Passing: " + ben.isPassing());

    }

}


/*

Activity 2 Question:

Why must you validate both new scores before assigning either one?

Both new scores must be checked first to ensure they are within the allowed 
range before making any changes. This avoids updating one score when the other 
is invalid and keeps the original scores safe from unwanted changes.

*/