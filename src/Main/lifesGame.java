/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Logic.boardController;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuneider
 */
public class lifesGame {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        String boardSize = JOptionPane.showInputDialog(null, "Insert Board size");
        boardController board = new boardController(Integer.parseInt(boardSize));
        
        board.insertAliveCells();
        
//        System.out.print("How many cell will be alive?:");
//        int alive = sc.nextInt();
//        board.showBoard();
//        for(int i=0;i<alive;i++){
//            System.out.print("Insert row:");
//            int row = sc.nextInt();
//            System.out.print("Insert Column:");
//            int column = sc.nextInt();
//            board.setAliveCell(row, column);
//            board.showBoard();
//        }
//        
//        System.out.println("Game will start in...");
//        Thread.sleep(1000);
//        System.out.println("3");
//        Thread.sleep(1000);
//        System.out.println("2");
//        Thread.sleep(1000);
//        System.out.println("1");
//        Thread.sleep(1000);
//        System.out.println("Game started:");
//        
//        board.startGame();
        
    }
    
}
