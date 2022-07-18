package tictactoe_oo;

public class Game {
    private String playerX, playerO, currentPlayer;
    private String symbolX, symbolO;
    private int [][] board;

    public Game() {
        board = new int[3][3];
        playerX = playerO = "";
        symbolX = "X";
        symbolO = "O";
    }

    public void setPlayerX(String playerX) {
        this.playerX = playerX;
        currentPlayer = playerX;
    }

    public void setPlayerO(String playerO) {
        this.playerO = playerO;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public String getCellValue(int row, int col) {
        if(board[row-1][col-1] == 0) {
            return "-";
        }
        else if(board[row-1][col-1] == 1) {
            return symbolX;
        }
        else {
            return symbolO;
        }
    }

    public String play(int row, int col) {
        if (row > 0 && row <= 3 && col > 0 && col <= 3) {  // ok
            if (board[row - 1][col - 1] == 0) { // ok, cell is empty
                board[row - 1][col - 1] = currentPlayer == playerX ? 1 : 2;
                currentPlayer = currentPlayer == playerX ? playerO : playerX;
                return "OK";
            } else {
                return "Error: cell not empty";
            }
        } else {
            return "Error: row or column out of range 1-3";
        }
    }

    public String checkWinner() {
        // Check rows
        for(int r = 0; r < 3; r++) {
            if(board[r][0] != 0 && board[r][0] == board[r][1] && board[r][0] == board[r][2]) {
                return board[r][0] == 1 ? playerX : playerO;
            }
        }
        // Check columns
        // Check diagonals
        return null;
    }

    public boolean isTie() {
        // Loop every row and column. If cell is zero return false
        return false;
    }
}
