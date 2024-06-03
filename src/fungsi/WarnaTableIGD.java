/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Owner
 */
public class WarnaTableIGD extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (row % 2 == 1){
//            component.setBackground(new Color(255,244,244));
            component.setBackground(new Color(237, 237, 237));
        }else{
            component.setBackground(new Color(255,255,255));
        } 
        
            if(table.getValueAt(row,18).toString().equals("Berkas Diterima")){
//                try {
//                    if(table.getValueAt(row, 24)==null){
                        component.setBackground(new Color(252, 162, 162));
//                        component.setForeground(new Color(255,230,230));
//                    }
                
            }
//            else if(table.getValueAt(row,18).toString().equals("UMUM")){
////                try {
//                    if(table.getValueAt(row, 24)!=null){
//                        component.setBackground(new Color(252, 162, 162));
////                        component.setForeground(new Color(255,230,230));
//                    }
//            }
        if(table.getValueAt(row,18).toString().equals("Dirawat")){
            component.setBackground(new Color(204,255,229));
        }
        if(table.getValueAt(row,18).toString().equals("Batal")){
            component.setBackground(new Color(192,192,192));
        }
        return component;
    }
}
