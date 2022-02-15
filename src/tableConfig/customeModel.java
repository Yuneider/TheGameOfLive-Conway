/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tableConfig;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Yuneider
 */
public class customeModel extends AbstractTableModel {
    
    public Object[][] data;
    
    public customeModel(String[][] rows){
        data = rows;
    }
    
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return data.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
    
}
