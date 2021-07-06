/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SYSTEM
 */
public class generarmatrices {   
    
    public void genA(int fil,int col,JTable tabla,DefaultTableModel modelo){    
    modelo.setRowCount(fil);
    modelo.setColumnCount(col);
    tabla.setModel(modelo);
}
   
}
