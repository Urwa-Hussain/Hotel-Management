package Database;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Clientx {
    Connections cons = new Connections();
    int clientId;
    String firstname;
    String lastname;
    String phno;
    String email;
    String address;
    
    public Clientx(){
        cons.Connect();
    }
    DefaultTableModel d;
    ResultSet rs;
        public void user_load(JTable tblRoom3){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cons.con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms", "root", "urwa123");
            cons.pst= cons.con.prepareStatement("select * from clienttbl");
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
                }
                d.addRow(v2);
        }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
        public void addRoom(String firstname, String lastname, String phno, String email, String address){
         
         try { 
             this.firstname = firstname;
             this.lastname = lastname;
             this.phno = phno;
             this.email = email;
             this.address = address;

            cons.pst=cons.con.prepareStatement("insert into clienttbl(firstname, lastname,phno,email,address) VALUES (?,?,?,?,?) ");
            cons.pst.setString(1,firstname);
            cons.pst.setString(2,lastname);
            cons.pst.setString(3,phno);
            cons.pst.setString(4,email);
            cons.pst.setString(5,address);
            cons.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved successfully.");
        } catch (SQLException ex) {
             System.out.println(ex);
        }
     }
        
        public void editClient(JTable tblRoom3,JTextField txtfname,JTextField txtlname,JTextField txtphno,JTextField txtemail,JTextField txtaddress){
          
        try {
            d = (DefaultTableModel)tblRoom3.getModel();
            int selectedIndex = tblRoom3.getSelectedRow();
            int clientId = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
            String firstname = txtphno.getText();
            String lastname = txtphno.getText();
            String phno = txtphno.getText();
            String email = txtemail.getText();
            String address = txtaddress.getText();
            cons.pst=cons.con.prepareStatement("update clienttbl set firstname=?,lastname=?,phno=?,email=?,address=? where clientId=?");
            cons.pst.setString(1,firstname);
            cons.pst.setString(2,lastname);
            cons.pst.setString(3,phno);
            cons.pst.setString(4,email);
            cons.pst.setString(5,address);
            cons.pst.setInt(6,clientId);
            int k = cons.pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(null, "Category Updated !!");
                txtfname.setText("");
                txtlname.setText("");
                txtphno.setText("");
                txtemail.setText("");
                txtaddress.setText("");
                txtfname.requestFocus();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error !!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
     }
        
        public void dltRoom(JTable tblRoom3,JTextField txtfname,JTextField txtlname,JTextField txtphno,JTextField txtemail,JTextField txtaddress){
         
            try {
                DefaultTableModel Df=(DefaultTableModel)tblRoom3.getModel();
                int selectedIndex = tblRoom3.getSelectedRow();
                int clientId=Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure to want to delete the record?", "Warning Message",JOptionPane.YES_NO_OPTION);
                if(dialogResult==JOptionPane.YES_OPTION){
                cons.pst = cons.con.prepareStatement("delete from clienttbl where clientId=?");
                cons.pst.setInt(1, clientId);
                int k = cons.pst.executeUpdate();
                if(k==1){
                    JOptionPane.showMessageDialog(null, "Record deleted Successfully.");
                    txtfname.setText("");
                    txtlname.setText("");
                    txtphno.setText("");
                    txtemail.setText("");
                    txtaddress.setText("");
                    txtfname.requestFocus();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error !!");
                }
            }
        } catch (SQLException ex) {
                System.out.println(ex);
        }
     }
     
     public void btnClick(JTable tblRoom3,JTextField txtfname,JTextField txtlname,JTextField txtphno,JTextField txtemail,JTextField txtaddress){
          d = (DefaultTableModel)tblRoom3.getModel();
        int selectedIndex = tblRoom3.getSelectedRow();

        int clientId = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
        txtfname.setText(d.getValueAt(selectedIndex, 1).toString());
        txtlname.setText(d.getValueAt(selectedIndex, 2).toString());
        txtphno.setText(d.getValueAt(selectedIndex, 3).toString());
        txtemail.setText(d.getValueAt(selectedIndex, 4).toString());
        txtaddress.setText(d.getValueAt(selectedIndex, 5).toString());
     }
}

