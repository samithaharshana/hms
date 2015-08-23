/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samitha
 */

public class getJTable extends JFrame {
    public static void main(String args[]) {
        getJTable table1 = new getJTable();
        table1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        table1.setSize(600, 200);
        table1.setVisible(true);
        table1.setTitle("My New Jtable");
       // jt.getJTable();
        
    }
    JTable table;
    
    public getJTable(){
      getJTable();
     
    }
    
    // method gettable
    private JTable getJTable() {
        
        setLayout(new FlowLayout());
    String[] colName = { "Name", "Email"};
        
    Object[][]  data = {
        {"samitha","dasead@gmail.com"},{"Harshana","sasasa@gmail.com"}, {"samitha","dasead@gmail.com"},{"Harshana","sasasa@gmail.com"},
         {"samitha","dasead@gmail.com"},{"Harshana","sasasa@gmail.com"}, {"samitha","dasead@gmail.com"},{"Harshana","sasasa@gmail.com"}
    };
    
    table = new JTable(data,colName);
    table.setPreferredScrollableViewportSize(new Dimension(500,100));
    table.setFillsViewportHeight(true);
    
      JScrollPane scroll = new JScrollPane(table);
       add(scroll);
   /* 
   if (jTable == null) {
        jTable = new JTable() {
            public boolean isCellEditable(int nRow, int nCol) {
                return false;
            }
        };
    }*/
    //DefaultTableModel contactTableModel = (DefaultTableModel) jTable.getModel();
   // contactTableModel.setColumnIdentifiers(colName);
   // jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    return  table;
}
}
