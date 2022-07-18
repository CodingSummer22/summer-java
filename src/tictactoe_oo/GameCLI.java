package tictactoe_oo;

import tictactoe.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameCLI {

    private Scanner input;
    private Game game;

    public GameCLI() {
        game = new Game();
        input = new Scanner(System.in);
    }

    public void readNames() {
        System.out.print("Name of X: ");
        String playerX = input.nextLine();
        game.setPlayerX(playerX);
        System.out.print("Name of O: ");
        String playerO = input.nextLine();
        game.setPlayerO(playerO);
    }

    public void displayBoard() {
        for(int r = 1; r <= 3; r++) {
            for(int c = 1; c <= 3; c++) {
                System.out.print(game.getCellValue(r, c) + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        int row, col;
        System.out.println(game.getCurrentPlayer() + " plays");
        try {
            System.out.print("Row (1-3): ");
            row = input.nextInt();
            System.out.print("Col (1-3): ");
            col = input.nextInt();
            String result = game.play(row, col);
            if(!result.equals("OK")) {
                System.out.println(result);
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Error: give integer values only");
            input.nextLine();
        }
    }

    public void runGame() {
        readNames();
        while(true) {
            displayBoard();
            play();
            String winner = game.checkWinner();
            if(winner != null) {
                System.out.println(winner + " wins!");
                break;
            }
            if(game.isTie()) {
                System.out.println("It's a tie");
                break;
            }
        }
        displayBoard();
        System.out.println("GAME OVER");
    }

    public static void main(String[] args) {
        GameCLI game = new GameCLI();
        game.runGame();
    }
}
