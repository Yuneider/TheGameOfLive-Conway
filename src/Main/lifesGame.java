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
        
        JOptionPane.showMessageDialog(null, "The game will start soon");
        
        board.startGame();
        
    }
    
}
