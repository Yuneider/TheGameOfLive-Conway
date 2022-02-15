/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import java.awt.BorderLayout;
import javax.swing.*;
import tableConfig.*;

/**
 *
 * @author Yuneider
 */
public class view extends JFrame{
        
    private JTable board;
    
    public view(){
        this.setTitle("BOARD");
        this.setBounds(0, 0 ,500, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void renderBoard(String[][] rows){
        board = new JTable(new customeModel(rows)){
            
            public Class getColumnClass(int col){
                return ((customeModel)getModel()).data[0][col].getClass();
            }
        
        };
        
        board.setDefaultRenderer(String.class, new cellRenderer());
        board.setRowHeight((this.getHeight()-35)/rows.length);
        
        this.add(board, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
}
