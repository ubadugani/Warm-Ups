package com.example.hackerrank;

import java.awt.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CastleOnGrid {

    // Complete the minimumMoves function below.
    int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) {
        int gl= grid.length;
        int[][] gameboard = new int[gl][gl];
        for (int i=0;i < gl;i++) {
            for (int j=0;j < gl;j++) {
                gameboard[i][j]=grid[i].charAt(j) == '.'?-1:-2;
            }
        }
        gameboard[startX][startY] = 0;
        int count = 0;
        boolean cont=true;
        while (cont) {
            count++;
            for (int i=0;i < gl;i++) {
                for (int j=0;j < gl;j++) {
                    if (gameboard[i][j] == -1) {
                        move(gameboard,i,j,count);
                        if (i == goalX && j == goalY && gameboard[i][j] != -1) {
                            return count;
                        }
                    }
                }
            }
        }
        return count;
    }

    public void move(int[][] gameboard,int x,int y,int count) {
        int gbl= gameboard.length;
        for (int j=y-1;j > -1 && gameboard[x][j] != -2;j--) {
            if (gameboard[x][j] == count-1) {
                gameboard[x][y]=count;
            }
        }
        for (int j=y+1;j < gbl && gameboard[x][j] != -2;j++) {
            if (gameboard[x][j] == count-1) {
                gameboard[x][y]=count;
            }
        }
        for (int i=x-1;i > -1 && gameboard[i][y] != -2;i--) {
            if (gameboard[i][y] == count-1) {
                gameboard[x][y]=count;
            }
        }
        for (int i=x+1;i < gbl && gameboard[i][y] != -2;i++) {
            if (gameboard[i][y] == count-1) {
                gameboard[x][y]=count;
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] startXStartY = scanner.nextLine().split(" ");

        int startX = Integer.parseInt(startXStartY[0]);

        int startY = Integer.parseInt(startXStartY[1]);

        int goalX = Integer.parseInt(startXStartY[2]);

        int goalY = Integer.parseInt(startXStartY[3]);

        CastleOnGrid mm=new CastleOnGrid();

        int result = mm.minimumMoves(grid, startX, startY, goalX, goalY);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
