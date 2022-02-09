/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Logic.boardController;
import java.util.Scanner;

/**
 *
 * @author Yuneider
 */
public class LifesGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insert board size:");
        boardController board = new boardController(sc.nextInt());
        
        System.out.print("How many cell will be alive?:");
        int alive = sc.nextInt();
        board.showBoard();
        for(int i=0;i<alive;i++){
            System.out.print("Insert row:");
            int row = sc.nextInt();
            System.out.print("Insert Column:");
            int column = sc.nextInt();
            board.setAliveCell(row, column);
            board.showBoard();
        }
        
        System.out.println("Game will start in...");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Game started:");
        
        board.startGame();
        
    }
    
}
