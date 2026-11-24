/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robillos_javaopp2;

/**
 *
 * @author ROBILLOS_CPE113
 */
public class LabGrade {
    private String studentName;
    private int quizScore;
    private int labScore;

    // Constructor
    public LabGrade(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;

        this.quizScore = (quizScore >= 0 && quizScore <= 100)
                ? quizScore : 0;

        this.labScore = (labScore >= 0 && labScore <= 100)
                ? labScore : 0;
    }

    // Update scores
    public boolean updateScores(int quizScore, int labScore) {

        if (quizScore < 0 || quizScore > 100 ||
            labScore < 0 || labScore > 100) {
            return false;
        }

        this.quizScore = quizScore;
        this.labScore = labScore;

        return true;
    }

    // Calculate final grade
    public double getFinalGrade() {
        return (quizScore * 0.40) + (labScore * 0.60);
    }

    // Check passing grade
    public boolean isPassing() {
        return getFinalGrade() >= 75.0;
    }

    // Get student name
    public String getStudentName() {
        return this.studentName;
    }
}
