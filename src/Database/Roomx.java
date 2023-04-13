package Database;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Roomx {
    Connections cons = new Connections();
    int roomId;
    String roomtype;
    String bedtype;
    String amount;
    String roomstatus;
    
    public Roomx(){
        cons.Connect();
    }
     DefaultTableModel d;
    ResultSet rs;
        public void user_load(JTable tblRoom3){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cons.con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms", "root", "urwa123");
            cons.pst= cons.con.prepareStatement("select * from roomtbl");
            rs= cons.pst.executeQuery();
            ResultSetMetaData rsd = rs.getMetaData();
            c=rsd.getColumnCount();
            d=(DefaultTableModel)tblRoom3.getModel();
            d.setRowCount(0);
            while(rs.next()){
                Vector v2=new Vector();
                
                for(int a=1;a<=c;a++){
                v2.add(rs.getString("roomId"));
                v2.add(rs.getString("roomtype"));
                v2.add(rs.getString("bedtype"));
                v2.add(rs.getString("amount"));
                v2.add(rs.getString("roomstatus"));
                }
                d.addRow(v2);
        }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    } 
      
     public void addRoom(String roomtype,String bedtype,String amount,String roomstatus){
         
         try { 
             this.roomtype = roomtype;
             this.bedtype = bedtype;
             this.amount = amount;
             this.roomstatus = roomstatus;

            cons.pst=cons.con.prepareStatement("insert into roomtbl(roomtype, bedtype,amount,roomstatus) VALUES (?,?,?,?) ");
            cons.pst.setString(1,roomtype);
            cons.pst.setString(2,bedtype);
            cons.pst.setString(3,amount);
            cons.pst.setString(4,roomstatus);
            cons.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved successfully.");
        } catch (SQLException ex) {
             System.out.println(ex);
        }
     }
     
     public void editRoom(JTable tblRoom3,JComboBox crType,JComboBox cbType,JTextField txtamt,JComboBox crStatus){
          
        try {
            d = (DefaultTableModel)tblRoom3.getModel();
            int selectedIndex = tblRoom3.getSelectedRow();
            int roomId = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
            String roomtype = crType.getSelectedItem().toString();
            String bedtype = cbType.getSelectedItem().toString();
            String amount = txtamt.getText();
            String roomstatus = crStatus.getSelectedItem().toString();
            cons.pst=cons.con.prepareStatement("update roomtbl set roomtype=?,bedtype=?,amount=?,roomstatus=? where roomId=?");
            cons.pst.setString(1,roomtype);
            cons.pst.setString(2,bedtype);
            cons.pst.setString(3,amount);
            cons.pst.setString(4,roomstatus);
            cons.pst.setInt(5,roomId);
            int k = cons.pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(null, "Category Updated !!");
                crType.setSelectedIndex(-1);
                cbType.setSelectedIndex(-1);
                txtamt.setText("");
                crStatus.setSelectedIndex(-1);
                txtamt.requestFocus();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error !!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
     }
     
     public void dltRoom(JTable tblRoom3,JComboBox crType,JComboBox cbType,JTextField txtamt,JComboBox crStatus){
         
            try {
                DefaultTableModel Df=(DefaultTableModel)tblRoom3.getModel();
                int selectedIndex = tblRoom3.getSelectedRow();
                int roomId=Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure to want to delete the record?", "Warning Message",JOptionPane.YES_NO_OPTION);
                if(dialogResult==JOptionPane.YES_OPTION){
                cons.pst = cons.con.prepareStatement("delete from roomtbl where roomId=?");
                cons.pst.setInt(1, roomId);
                int k = cons.pst.executeUpdate();
                if(k==1){
                    JOptionPane.showMessageDialog(null, "Record deleted Successfully.");
                    crType.setSelectedIndex(-1);
                    cbType.setSelectedIndex(-1);
                    txtamt.setText("");
                    crStatus.setSelectedIndex(-1);
                    txtamt.requestFocus();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error !!");
                }
            }
        } catch (SQLException ex) {
                System.out.println(ex);
        }
     }
     Reservation reservation = new Reservation();
     public void btnClick(JTable tblRoom3,JComboBox crType,JComboBox cbType,JTextField txtamt,JComboBox crStatus){
          d = (DefaultTableModel)tblRoom3.getModel();
        int selectedIndex = tblRoom3.getSelectedRow();

        int Id = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
        //txtrId.setSelectedItem(d.getValueAt(selectedIndex, 0).toString());
        crType.setSelectedItem(d.getValueAt(selectedIndex, 1).toString());
        cbType.setSelectedItem(d.getValueAt(selectedIndex, 2).toString());
        txtamt.setText(d.getValueAt(selectedIndex, 3).toString());
        crStatus.setSelectedItem(d.getValueAt(selectedIndex, 4).toString());
        
//        TableModel model = tblRoom3.getModel();
//        String roomId = model.getValueAt(selectedIndex, 0).toString();
//        String roomtype =model.getValueAt(selectedIndex, 1).toString();
//        String bedtype =model.getValueAt(selectedIndex, 2).toString();
//        String amount =model.getValueAt(selectedIndex, 3).toString();
//        
//        reservation.setVisible(true);
//        reservation.pack();
//        reservation.setLocationRelativeTo(null);
//        reservation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        
//        reservation.txtrId.setText(roomId);
//        reservation.txtrtype.setText(roomtype);
//        reservation.txtbtype.setText(bedtype);
//        reservation.txtamt.setText(amount);
        
        
        
     }
     
     public void btnFetch(JComboBox crType){
       
     }
}


