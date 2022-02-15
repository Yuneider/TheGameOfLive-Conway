/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Views.view;
import javax.swing.JOptionPane;

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
        view = new view();
    } 
    
    public void insertAliveCells(){
        view.renderBoard(generateBoard());
        String aux = JOptionPane.showInputDialog(null, "Insert amoung of alive cells");
        for(int i=0;i<Integer.parseInt(aux);i++){
            String position = JOptionPane.showInputDialog(null, "Insert X,Y position:");
            String[] x = position.split(",");
            board.setAliveCell(Integer.parseInt(x[0]), Integer.parseInt(x[1]));
            view.renderBoard(generateBoard());
        }
    }
    
    private String[][] generateBoard(){
        String[][] result = new String[board.getBoard().length][board.getBoard().length];
        for(int i=0;i<board.getBoard().length;i++){
            for(int j=0;j<board.getBoard().length;j++){
                if(board.getBoard()[i][j].isAlive())
                    result[i][j] = "O";
                else
                    result[i][j] = "X";
            }
        }
        return result;
    } 
    
    public void startGame() throws InterruptedException {
        while (true) {
            for (int i = 0; i < board.getBoard().length; i++) {
                for (int j = 0; j < board.getBoard().length; j++) {
                    board.checkNearCells(i, j);
                }
            }
            view.renderBoard(generateBoard());
            for (int i = 0; i < board.getBoard().length; i++) {
                for (int j = 0; j < board.getBoard().length; j++) {
                    if (board.getBoard()[i][j].isAlive()) {
                        if (board.getBoard()[i][j].getAliveNear() > 3
                                || board.getBoard()[i][j].getAliveNear() < 2) {
                            auxBoard.getBoard()[i][j].setAlive(false);
                        }else{
                            auxBoard.getBoard()[i][j].setAlive(true);
                        }
                    } else {
                        if (board.getBoard()[i][j].getAliveNear() == 3) {
                            auxBoard.getBoard()[i][j].setAlive(true);
                        }
                    }
                }
            }
            board = auxBoard;
            Thread.sleep(1000);
        }
    }

}
