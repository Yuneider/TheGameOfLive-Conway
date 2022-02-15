/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Views.view;

/**
 *
 * @author Yuneider
 */
public class boardController {

    private board board;
    private board auxBoard;
    private view view;

    public boardController(int size) {
        board = new board(size);
        auxBoard = new board(size);
    } 
    
    public void insertAliveCells(){
        
    }
    
    public void showBoard(){
        
    }
    
//    public void startGame() throws InterruptedException {
//        while (true) {
//            for (int i = 0; i < this.board.length; i++) {
//                for (int j = 0; j < this.board.length; j++) {
//                    checkNearCells(i, j);
//                }
//            }
//            showBoard();
//            for (int i = 0; i < this.board.length; i++) {
//                for (int j = 0; j < this.board.length; j++) {
//                    if (this.board[i][j].isAlive()) {
//                        if (this.board[i][j].getAliveNear() > 3
//                                || this.board[i][j].getAliveNear() < 2) {
//                            this.auxBoard[i][j].setAlive(false);
//                        }
//                    } else {
//                        if (this.board[i][j].getAliveNear() == 3) {
//                            this.auxBoard[i][j].setAlive(true);
//                        }
//                    }
//                }
//            }
//            System.out.println("_____________________________________________");
//            this.board = this.auxBoard;
//            Thread.sleep(2000);
//        }
//    }

}
