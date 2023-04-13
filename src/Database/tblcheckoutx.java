
package Database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class tblcheckoutx {
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
    
    public tblcheckoutx(){
        cons.Connect();
    }
    DefaultTableModel d;
    ResultSet rs;
        public void user_load(JTable tblRoom3){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cons.con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms", "root", "urwa123");
            cons.pst= cons.con.prepareStatement("select * from checkin");
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
                }
                d.addRow(v2);
        }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    } 
       
    Checkout checkout = new Checkout();
     public void btnClick(JTable tblRoom3){
          d = (DefaultTableModel)tblRoom3.getModel();
        int selectedIndex = tblRoom3.getSelectedRow();

        int Id = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
        //txtrId.setSelectedItem(d.getValueAt(selectedIndex, 0).toString());
//        crType.setSelectedItem(d.getValueAt(selectedIndex, 1).toString());
//        cbType.setSelectedItem(d.getValueAt(selectedIndex, 2).toString());
//        txtamt.setText(d.getValueAt(selectedIndex, 3).toString());
//        crStatus.setSelectedItem(d.getValueAt(selectedIndex, 4).toString());
        
        TableModel model = tblRoom3.getModel();
        
        String firstname =model.getValueAt(selectedIndex, 0).toString();
        String lastname =model.getValueAt(selectedIndex, 1).toString();
        String phno =model.getValueAt(selectedIndex, 2).toString();
        String email =model.getValueAt(selectedIndex, 3).toString();
        String address =model.getValueAt(selectedIndex, 4).toString();
        String nationality =model.getValueAt(selectedIndex, 5).toString();
        String CNIC =model.getValueAt(selectedIndex, 6).toString();
        String roomId = model.getValueAt(selectedIndex, 7).toString();
        String roomtype =model.getValueAt(selectedIndex, 8).toString();
        String bedtype =model.getValueAt(selectedIndex, 9).toString();
        String amount =model.getValueAt(selectedIndex,10).toString();
        String checkin =model.getValueAt(selectedIndex,11).toString();
        
        
        checkout.setVisible(true);
        checkout.pack();
        checkout.setLocationRelativeTo(null);
        checkout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        checkout.txtfname.setText(firstname);
        checkout.txtlname.setText(lastname);
        checkout.txtphno.setText(phno);
        checkout.txtemail.setText(email);
        checkout.txtaddress.setText(address);
        checkout.txtnationality.setText(nationality);
        checkout.txtcnic.setText(CNIC);
        checkout.txtrId.setText(roomId);
        checkout.txtrtype.setText(roomtype);
        checkout.txtbtype.setText(bedtype);
        checkout.txtamt.setText(amount);
        checkout.txtcheckin.setText(checkin);
        
        
     }
}
