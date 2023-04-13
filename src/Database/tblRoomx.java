
package Database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class tblRoomx {
    Connections cons = new Connections();
    String roomId;
    String roomtype;
    String bedtype;
    String amount;
    
    
    public tblRoomx(){
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
                
                }
                d.addRow(v2);
        }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    } 
        
        
    Reservation reservation = new Reservation();
     public void btnClick(JTable tblRoom3){
          d = (DefaultTableModel)tblRoom3.getModel();
        int selectedIndex = tblRoom3.getSelectedRow();

        //int Id = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
        //txtrId.setSelectedItem(d.getValueAt(selectedIndex, 0).toString());
//        crType.setSelectedItem(d.getValueAt(selectedIndex, 1).toString());
//        cbType.setSelectedItem(d.getValueAt(selectedIndex, 2).toString());
//        txtamt.setText(d.getValueAt(selectedIndex, 3).toString());
//        crStatus.setSelectedItem(d.getValueAt(selectedIndex, 4).toString());
        
        TableModel model = tblRoom3.getModel();
        String roomId = model.getValueAt(selectedIndex, 0).toString();
        String roomtype =model.getValueAt(selectedIndex, 1).toString();
        String bedtype =model.getValueAt(selectedIndex, 2).toString();
        String amount =model.getValueAt(selectedIndex, 3).toString();
        
        reservation.setVisible(true);
        reservation.pack();
        reservation.setLocationRelativeTo(null);
        reservation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        reservation.txtrId.setText(roomId);
        reservation.txtrtype.setText(roomtype);
        reservation.txtbtype.setText(bedtype);
        reservation.txtamt.setText(amount);
     }
}
