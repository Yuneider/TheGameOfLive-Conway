/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tableConfig;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Yuneider
 */
public class cellRenderer extends DefaultTableCellRenderer {

    private final Color color = new Color(200, 240, 200);

    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row, int col) {
        
        super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, col);
        
        customeModel model = (customeModel) table.getModel();
        
        if (model.getValueAt(row, col).equals("O")) {
            setBackground(color);
        } else{
            setBackground(null);
        }
        return this;
    
    }

}
