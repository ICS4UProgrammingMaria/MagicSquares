package com.company;

/*
 * Created by: Maria Temu
 * Created on: 15-April-2020
 * Created for: ICS4U
 * Day #29 (Magic Squares)
 * This program that determines whether a group
 * of numbers is a magic square or not
 */
public class Main {

    public static void main(String[] args) {
        int matrixMat[][] = {{ 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 }};

        if (magicSquare(matrixMat))
            System.out.println("True\nIt is a Magic Square");
        else
            System.out.println("False\nIt Is not a Magic Square");

    }


    static boolean magicSquare(int mS[][])
    {
        int x = 3;

        int answer = 0,answerTwo=0;
        for (int i = 0; i < x; i++) answer = answer + mS[i][i];//mS diagonal
        for (int i = 0; i < x; i++) answerTwo = answerTwo + mS[i][x-1-i];

        if(answer!=answerTwo)
            return false;

        for (int i = 0; i < x; i++) //row answer
        {

            int numRows = 0;
            for (int j = 0; j < x; j++) numRows += mS[i][j];

            if (numRows != answer)
                return false;//if not magic square
        }

        for (int i = 0; i < x; i++) //column answr
        {

            int numColumns = 0;
            for (int j = 0; j < x; j++) numColumns += mS[j][i];


            if (answer != numColumns)//column equal diagonal?
                return false;
        }

        return true;//if magic square
    }
}
