package com.chinex.boroja.amigoscode;

import java.util.Arrays;

public class Impl2D {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        //Inline the array
        char[][] boardTwo = new char[][] {
                new char[] {'9', '2', '3'},
                new char[] {'8', '7', '2'},
                new char[] {'2', '1', '6'}
        };

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
