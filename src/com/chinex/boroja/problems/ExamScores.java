package com.chinex.boroja.problems;

import java.util.Arrays;

/**
 * Created by Chinedu
 * Date: 30th January 2023
 *
 * Five candidates (Taiwo„ Kenny, Usman, Nkechi„ and Ofure) took part in a University Entrance Examination comprising
 * four Subjects (English, Mathematics, Physics and Chemistry).
 * The scores obtained in each of the subjects are depicted below:
 *          Eng	Maths	Phy	Chem
 * Taiwo	56	 43	    57	60
 * Kenny	76	 56	    67	68
 * Usman	47	 38	    75	59
 * Nkechi	37	 49	    64	58
 * Ofure	58	 75	    57  60
 *
 * Implement an OOP computer program to achieve the following tasks
 * (a)Create a two-dimensional array / list for the score data depicted above
 * (b)populate the array list With the exact data depicted above
 * (c)Write codes to print out
 * --------------------------------------------------------------------------
 * (i)Average or mean score per student
 * (ii)The maximum score
 * (iii)The student and the Subject with the maximum score
 * The number of students that score the mean score and above
 */
public class ExamScores {
    public static void main(String[] args) {
        // Create a 2D array for the score data
        int[][] scores = {
                {56, 43, 57, 60},
                {76, 56, 67, 68},
                {47, 38, 75, 59},
                {37, 49, 64, 58},
                {58, 75, 57, 60}
        };

        String[] students = {"Taiwo", "Kenny", "Usman", "Nkechi", "Ofure"};
        String[] subjects = {"English", "Maths", "Physics", "Chemistry"};

        // create a two-dimensional array/list for the score depicted above
        System.out.println("Students Score Data");
        System.out.println("-------------------");
        // Display data using enhanced for loop
        for (int[] score : scores) {
            System.out.println(Arrays.toString(score));
        }

        System.out.println("-------------------------");

        // Average or mean score per student
        for (int i = 0; i < students.length; i++){
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double mean = (double) total / scores[i].length;
            System.out.println("Average score for " + students[i] + ": " + mean);
    }

        // The maximum score
        int maxScore = Integer.MIN_VALUE;
        String maxStudent = "";
        String maxSubject = "";
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                    maxStudent = students[i];
                    maxSubject = subjects[j];
                }
            }
        }
        System.out.println("Maximum score: " + maxScore);
        System.out.println("Student with maximum score: " + maxStudent);
        System.out.println("Subject with maximum score: " + maxSubject);

        // The number of students that score the mean score and above
        int meanScoreCount = 0;
        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double mean = (double) total / scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] >= mean) {
                    meanScoreCount++;
                    break;
                }
            }
        }
        System.out.println("Number of students that score mean score and above: " + meanScoreCount);
    }

}
