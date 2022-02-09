/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Yuneider
 */
public class boardController {

    private cell[][] board;
    private cell[][] auxBoard;

    public boardController(int size) {
        this.board = this.auxBoard = new cell[size][size];
        initBoard(this.board);
        initBoard(this.auxBoard);
    }

    private void initBoard(cell[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = new cell(false);
            }
        }
    }

    public void showBoard() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                if (this.board[i][j].isAlive()) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }

    public void setAliveCell(int row, int col) {
        this.board[row][col].setAlive(true);
    }

    public void setDeadCell(int row, int col) {
        this.board[row][col].setAlive(false);
    }

    public void checkNearCells(int row, int col) {
        int dead = 0, alive = 0, auxrow, auxcol;

        //checking top
        auxrow = row - 1;
        auxcol = col - 1;
        for (int i = 1; i < 4; i++) {
            if (auxrow >= 0 && auxrow < this.board.length
                    && auxcol >= 0 && auxcol < this.board.length) {
                if (this.board[auxrow][auxcol].isAlive()) {
                    alive++;
                } else {
                    dead++;
                }
            }
            auxcol++;
        }

        //checking bottom
        auxrow = row + 1;
        auxcol = col - 1;
        for (int i = 1; i < 4; i++) {
            if (auxrow >= 0 && auxrow < this.board.length
                    && auxcol >= 0 && auxcol < this.board.length) {
                if (this.board[auxrow][auxcol].isAlive()) {
                    alive++;
                } else {
                    dead++;
                }
            }
            auxcol++;
        }

        //checking right
        if (row >= 0 && row < this.board.length
                && col + 1 >= 0 && col + 1 < this.board.length) {
            if (this.board[row][col + 1].isAlive()) {
                alive++;
            } else {
                dead++;
            }
        }

        //checking left
        if (row >= 0 && row < this.board.length
                && col - 1 >= 0 && col - 1 < this.board.length) {
            if (this.board[row][col - 1].isAlive()) {
                alive++;
            } else {
                dead++;
            }
        }

        //setting near values
        this.board[row][col].setAliveNear(alive);
        this.board[row][col].setDeadNear(dead);
    }

    public void startGame() throws InterruptedException {
        while (true) {
            for (int i = 0; i < this.board.length; i++) {
                for (int j = 0; j < this.board.length; j++) {
                    checkNearCells(i, j);
                }
            }
            showBoard();
            for (int i = 0; i < this.board.length; i++) {
                for (int j = 0; j < this.board.length; j++) {
                    if (this.board[i][j].isAlive()) {
                        if (this.board[i][j].getAliveNear() > 3
                                || this.board[i][j].getAliveNear() < 2) {
                            this.auxBoard[i][j].setAlive(false);
                        }
                    } else {
                        if (this.board[i][j].getAliveNear() == 3) {
                            this.auxBoard[i][j].setAlive(true);
                        }
                    }
                }
            }
            System.out.println("_____________________________________________");
            this.board = this.auxBoard;
            Thread.sleep(2000);
        }
    }

}
