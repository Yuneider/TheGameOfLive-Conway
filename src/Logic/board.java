/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Yuneider
 */
public class board {
    
    private cell[][] board;
    
    public board(int size){
        this.board = new cell[size][size];
        initBoard();
    }
    
    public cell[][] getBoard(){
        return this.board;
    }
    
    private void initBoard(){
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                this.board[i][j] = new cell(false);
            }
        }
    }
    
    public void setAliveCell(int row, int col){
        this.board[row][col].setAlive(true);
    }
    
    public void setDeadCell(int row, int col){
        this.board[row][col].setAlive(false);
    }  
    
    public void checkNearCells(int row, int col){
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
    
    public void showBoardConsole() {
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
    
}
