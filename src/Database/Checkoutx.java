
package Database;
import java.nio.channels.SelectableChannel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Checkoutx {
     Connections cons = new Connections();
    int clientId;
    String firstname;
    String lastname;
    String phno;
    String email;
    String address;
    String nationality;
    String CNIC;
    String roomId;
    String roomtype;
    String bedtype;
    String amount;
    String checkin;
    String checkout;
    String days;
    String tamount;
    
    public Checkoutx(){
        cons.Connect();
    }
    DefaultTableModel d;
        ResultSet rs;
        public void user_load(JTable tblRoom3){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cons.con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms", "root", "urwa123");
            cons.pst= cons.con.prepareStatement("select * from checkout");
            rs= cons.pst.executeQuery();
            ResultSetMetaData rsd = rs.getMetaData();
            c=rsd.getColumnCount();
            d=(DefaultTableModel)tblRoom3.getModel();
            d.setRowCount(0);
            while(rs.next()){
                Vector v2=new Vector();
                
                for(int a=1;a<=c;a++){
                v2.add(rs.getString("clientId"));
                v2.add(rs.getString("firstname"));
                v2.add(rs.getString("lastname"));
                v2.add(rs.getString("phno"));
                v2.add(rs.getString("email"));
                v2.add(rs.getString("address"));
                v2.add(rs.getString("nationality"));
                v2.add(rs.getString("CNIC"));
                v2.add(rs.getString("roomId"));
                v2.add(rs.getString("roomtype"));
                v2.add(rs.getString("bedtype"));
                v2.add(rs.getString("amount"));
                v2.add(rs.getString("checkin"));
                v2.add(rs.getString("checkout"));
                v2.add(rs.getString("days"));
                v2.add(rs.getString("tamount"));
                }
                d.addRow(v2);
        }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
        
        public void addRoom(String firstname, String lastname, String phno, String email, String address,String nationality,String CNIC,String roomId ,String roomtype,String bedtype,String amount,String checkin,String checkout,String days,String tamount){
         
         try { 
             this.firstname = firstname;
             this.lastname = lastname;
             this.phno = phno;
             this.email = email;
             this.address = address;
             this.nationality = nationality;
             this.CNIC = CNIC;
             this.roomId = roomId;
             this.roomtype = roomtype;
             this.bedtype = bedtype;
             this.amount = amount;
             this.checkin = checkin;
             this.checkout=checkout;
             this.days=days;
             this.tamount=tamount;

            cons.pst=cons.con.prepareStatement("insert into checkout(firstname, lastname,phno,email,address,nationality,CNIC,roomId,roomtype,bedtype,amount,checkin,checkout,days,tamount) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
            cons.pst.setString(1,firstname);
            cons.pst.setString(2,lastname);
            cons.pst.setString(3,phno);
            cons.pst.setString(4,email);
            cons.pst.setString(5,address);
            cons.pst.setString(6,nationality);
            cons.pst.setString(7,CNIC);
            cons.pst.setString(8,roomId);
            cons.pst.setString(9,roomtype);
            cons.pst.setString(10,bedtype);
            cons.pst.setString(11,amount);
            cons.pst.setString(12,checkin);
            cons.pst.setString(13,checkout);
            cons.pst.setString(14,days);
            cons.pst.setString(12,tamount);
            cons.pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Saved successfully.");
        } catch (SQLException ex) {
             System.out.println(ex);
        }
     }
        
        public void editClient(JTable tblRoom3,JTextField txtfname,JTextField txtlname,JTextField txtphno,JTextField txtemail,JTextField txtaddress,JTextField txtnationality,JTextField txtcnic,JTextField txtrId,JTextField txtrtype,JTextField txtbtype,JTextField txtamt,JTextField txtcheckin,JTextField txtcheckout,JTextField txtdays,JTextField txttamt){
          
        try {
            d = (DefaultTableModel)tblRoom3.getModel();
            int selectedIndex = tblRoom3.getSelectedRow();
            int clientId = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
            String firstname = txtfname.getText();
            String lastname = txtlname.getText();
            String phno = txtphno.getText();
            String email = txtemail.getText();
            String address = txtaddress.getText();
            String nationality = txtnationality.getText();
            String CNIC = txtcnic.getText();
            String roomId = txtrId.getText();
            String roomtype = txtrtype.getText();
            String bedtype = txtbtype.getText();
            String amount = txtamt.getText();
            String checkin = txtcheckin.getText();
            String checkout = txtcheckout.getText();
            String days = txtdays.getText();
            String tamount = txttamt.getText();
            cons.pst=cons.con.prepareStatement("update checkout set firstname=?,lastname=?,phno=?,email=?,address=?,nationality=?,CNIC=?,roomId=?,roomtype=?,bedtype=?,amount=?,checkin=?,checkout=?,days=?,tamount=? where clientId=?");
            cons.pst.setString(1,firstname);
            cons.pst.setString(2,lastname);
            cons.pst.setString(3,phno);
            cons.pst.setString(4,email);
            cons.pst.setString(5,address);
            cons.pst.setString(6,nationality);
            cons.pst.setString(7,CNIC);
            cons.pst.setString(8,roomId);
            cons.pst.setString(9,roomtype);
            cons.pst.setString(10,bedtype);
            cons.pst.setString(11,amount);
            cons.pst.setString(12,checkin);
            cons.pst.setString(13,checkout);
            cons.pst.setString(14,days);
            cons.pst.setString(15,tamount);
            cons.pst.setInt(16,clientId);
            int k = cons.pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(null, "Category Updated !!");
                txtfname.setText("");
                txtlname.setText("");
                txtphno.setText("");
                txtemail.setText("");
                txtaddress.setText("");
                txtnationality.setText("");
                txtcnic.setText("");
                txtrId.setText("");
                txtrtype.setText("");
                txtbtype.setText("");
                txtamt.setText("");
                txtcheckin.setText("");
                txtcheckout.setText("");
                txtdays.setText("");
                txttamt.setText("");
                txtfname.requestFocus();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error !!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
     }
        
        public void dltRoom(JTable tblRoom3,JTextField txtfname,JTextField txtlname,JTextField txtphno,JTextField txtemail,JTextField txtaddress,JTextField txtnationality,JTextField txtcnic,JTextField txtrId,JTextField txtrtype,JTextField txtbtype,JTextField txtamt,JTextField txtcheckin,JTextField txtcheckout,JTextField txtdays,JTextField txttamt){
          try {
                DefaultTableModel Df=(DefaultTableModel)tblRoom3.getModel();
                int selectedIndex = tblRoom3.getSelectedRow();
                int clientId=Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure to want to delete the record?", "Warning Message",JOptionPane.YES_NO_OPTION);
                if(dialogResult==JOptionPane.YES_OPTION){
                cons.pst = cons.con.prepareStatement("delete from checkout where clientId=?");
                cons.pst.setInt(1, clientId);
                int k = cons.pst.executeUpdate();
                if(k==1){
                    JOptionPane.showMessageDialog(null, "Record deleted Successfully.");
                    txtfname.setText("");
                    txtlname.setText("");
                    txtphno.setText("");
                    txtemail.setText("");
                    txtaddress.setText("");
                    txtnationality.setText("");
                    txtcnic.setText("");
                    txtrId.setText("");
                    txtrtype.setText("");
                    txtbtype.setText("");
                    txtamt.setText("");
                    txtcheckin.setText("");
                    txtcheckout.setText("");
                    txtdays.setText("");
                    txttamt.setText("");
                   // txtfname.requestFocus();
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
     
        public void btnClick(JTable tblRoom3,JTextField txtfname,JTextField txtlname,JTextField txtphno,JTextField txtemail,JTextField txtaddress,JTextField txtnationality,JTextField txtcnic,JTextField txtrId,JTextField txtrtype,JTextField txtbtype,JTextField txtamt,JTextField txtcheckin,JTextField txtcheckout,JTextField txtdays,JTextField txttamt){
        d = (DefaultTableModel)tblRoom3.getModel();
        int selectedIndex = tblRoom3.getSelectedRow();

        int clientId = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
        txtfname.setText(d.getValueAt(selectedIndex, 1).toString());
        txtlname.setText(d.getValueAt(selectedIndex, 2).toString());
        txtphno.setText(d.getValueAt(selectedIndex, 3).toString());
        txtemail.setText(d.getValueAt(selectedIndex, 4).toString());
        txtaddress.setText(d.getValueAt(selectedIndex, 5).toString());
        txtnationality.setText(d.getValueAt(selectedIndex, 6).toString());
        txtcnic.setText(d.getValueAt(selectedIndex, 7).toString());
        txtrId.setText(d.getValueAt(selectedIndex, 8).toString());
        txtrtype.setText(d.getValueAt(selectedIndex, 9).toString());
        txtbtype.setText(d.getValueAt(selectedIndex, 10).toString());
        txtamt.setText(d.getValueAt(selectedIndex, 11).toString());
        txtcheckin.setText(d.getValueAt(selectedIndex, 12).toString());
        txtcheckout.setText(d.getValueAt(selectedIndex, 13).toString());
        txtdays.setText(d.getValueAt(selectedIndex, 14).toString());
        txttamt.setText(d.getValueAt(selectedIndex, 15).toString());
        
     }
        
}
