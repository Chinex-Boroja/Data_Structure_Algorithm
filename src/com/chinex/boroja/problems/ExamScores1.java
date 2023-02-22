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
public class ExamScores1 {
    public static void main(String[] args) {
        // Create a 2D array for the score data and populating the data
        int[][] scores = {
                {56, 43, 57, 60},
                {76, 56, 67, 68},
                {47, 38, 75, 59},
                {37, 49, 64, 58},
                {58, 75, 57, 60}
        };

        // create a two-dimensional array/list for the score depicted above
        System.out.println("Students Score Data");
        System.out.println("-------------------");
        // Display data using enhanced for loop
        for (int[] score : scores) {
            System.out.println(Arrays.toString(score));
        }

        System.out.println("-------------------------");


        int[] studentTotals = new int[5];
        int[] subjectTotals = new int[4];
        int maxScore = 0;
        int maxScoreStudent = 0;
        int maxScoreSubject = 0;
        int meanScore = 0;
        int aboveMean = 0;

        // Average or mean score per student
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                studentTotals[i] += scores[i][j];
                subjectTotals[j] += scores[i][j];
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                    maxScoreStudent = i;
                    maxScoreSubject = j;
                }
            }
            System.out.println("Student " + (i + 1) + ": Average Score = " + (double)studentTotals[i] / 4);
        }

        meanScore = (subjectTotals[0] + subjectTotals[1] + subjectTotals[2] + subjectTotals[3]) / 20;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (scores[i][j] >= meanScore) {
                    aboveMean++;
                    break;
                }
            }
        }
        System.out.println("Maximum Score: " + maxScore + " by Student " + (maxScoreStudent + 1)
                + " in Subject " + (maxScoreSubject + 1));
        System.out.println("Number of students scoring above the mean: " + aboveMean);

    }
}
