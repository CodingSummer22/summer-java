package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    private String playerX, playerO, currentPlayer;
    private int [][] board;
    private Scanner input;

    public TicTacToe() {
        board = new int[3][3];
        input = new Scanner(System.in);
    }

    public void readNames() {
        System.out.print("Name of X: ");
        playerX = input.nextLine();
        System.out.print("Name of O: ");
        playerO = input.nextLine();
        currentPlayer = playerX;
    }

    public void displayBoard() {
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                if(board[r][c] == 0) {
                    System.out.print("- ");
                }
                else if(board[r][c] == 1) {
                    System.out.print("X ");
                }
                else if(board[r][c] == 2) {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    public void play() {
        int row, col;
        System.out.println(currentPlayer + " plays");
        try {
            System.out.print("Row (1-3): ");
            row = input.nextInt();
            System.out.print("Col (1-3): ");
            col = input.nextInt();
            if (row > 0 && row <= 3 && col > 0 && col <= 3) {  // ok
                if (board[row - 1][col - 1] == 0) { // ok, cell is empty
                    board[row - 1][col - 1] = currentPlayer == playerX ? 1 : 2;
                    currentPlayer = currentPlayer == playerX ? playerO : playerX;
                } else {
                    System.out.println("Error: cell not empty");
                }
            } else {
                System.out.println("Error: row or column out of range 1-3");
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Error: give integer values only");
            input.nextLine();
        }
    }

    public boolean checkWinner() {
        // Check rows
        for(int r = 0; r < 3; r++) {
            if(board[r][0] != 0 && board[r][0] == board[r][1] && board[r][0] == board[r][2]) {
                printWinner(board[r][0]);
                return true;
            }
        }
        // Check columns
        // Check diagonals
        return false;
    }

    public void printWinner(int w) {
        if(w == 1) {
            System.out.println(playerX + " WINS!");
        }
        else if(w == 2) {
            System.out.println(playerO + " WINS!");
        }
    }

    public boolean checkTie() {
        // Loop every row and column. If cell is zero return false
        return false;
    }

    public void runGame() {
        readNames();
        while(true) {
            displayBoard();
            play();
            if(checkWinner()) {
                break;
            }
            if(checkTie()) {
                break;
            }
        }
        displayBoard();
        System.out.println("GAME OVER");
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.runGame();
    }
}
