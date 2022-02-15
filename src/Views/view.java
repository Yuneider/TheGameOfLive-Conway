/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Yuneider
 */
public class view extends JFrame{
        
    public view(){
        this.setTitle("BOARD");
        this.setBounds(0, 0 ,500, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void initBoard(String[][] rows){
        String[] names = new String[rows.length];
        for(int i=0;i<rows.length;i++){
            names[i] = i+"";
        }
        JTable board = new JTable(rows,names);
        board.setTableHeader(null);
        board.setRowHeight((this.getHeight()-35)/rows.length);
        
        this.add(board, BorderLayout.CENTER);
    }
    
}
