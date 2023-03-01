package com.chinex.boroja.problems;

/**
 * Suppose you need to write a program that grades multiple-choice tests. Assume there are eight
 * students and ten questions, and the answers are stored in a two-dimensional array. Each row
 * records a student’s answers to the questions, as shown in the following array.
 */
public class GradeExam {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all answers
        for (int row = 0; row < answers.length; row++) {
            //Grade one student
            int correctCount = 0;
            for (int column = 0; column < answers[row].length; column++) {
                if (answers[row][column] == keys[column])
                    correctCount++;
            }
            System.out.println("Student " + row + "'s correct count us " + correctCount);
        }
    }
}
