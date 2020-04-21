package com.company;

/* mport java.util.Scanner;

public class g {

    public static void main(String[] args) {
        int mat[][] = {{ 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 }};
        userMatrix();

        if (magicSquare(mS))
            System.out.println("True\nIs a Magic Square");
        else
            System.out.println("False\nIs not a magic" + " Square");

    }

    // Function to read matrix
    public static void userMatrix()
    {
        int numRows, numColumns, i, j;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.println("Enter the number of rows of the matrix");
            numRows = in.nextInt();

            System.out.println("Enter the number of columns of the matrix");
            numColumns = in.nextInt();

            int mS[][] = new int[numRows][numColumns];

            System.out.println("Enter the elements of the matrix (hit enter after each number)");
            for (i = 0; i < numRows; i++)
                for (j = 0; j < numColumns; j++) mS[i][j] = in.nextInt();

            //print elements
            System.out.println("Elements of the matrix are");
            for (i = 0; i < numRows; i++) {
                for (j = 0; j < numColumns; j++)
                    System.out.print(mS[i][j] + "  ");
                System.out.println();
            }
        }
        catch (Exception e) {
        }
        finally {
            in.close();
        }
    }


    static int x = 3;

    // Returns true if mat[][] is magic
    // square, else returns false.
    static boolean magicSquare(int mS[][])
    {

        int mS[][] = int mS[];


        int answer = 0,answerTwo=0;
        for (int i = 0; i < x; i++) answer = answer + mS[i][i];//mS diagonal

        for (int i = 0; i < x; i++) answerTwo = answerTwo + mS[i][x-1-i];//mS diagonal

        if(answer!=answerTwo)
            return false;

        // For sums of Rows
        for (int i = 0; i < x; i++) {

            int numRows = 0;
            for (int j = 0; j < x; j++) numRows += sec[i][j];

            // check if every row answer is
            // equal to prime diagonal answer
            if (numRows != answer)
                return false;
        }

        // For sums of Columns
        for (int i = 0; i < x; i++) {

            int numColumns = 0;
            for (int j = 0; j < x; j++) numColumns += mS[j][i];

            // check if every column answer is
            // equal to prime diagonal answer
            if (answer != numColumns)
                return false;
        }

        return true;
    }
}

*/