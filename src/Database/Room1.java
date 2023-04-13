package Database;

public class Room1 extends javax.swing.JFrame {
    Roomx roomx = new Roomx();

    public Room1() {
        initComponents();
        roomx.user_load(tblRoom3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rNo = new javax.swing.JLabel();
        rType = new javax.swing.JLabel();
        bType = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        txtamt = new javax.swing.JTextField();
        crType = new javax.swing.JComboBox<>();
        cbType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRoom2 = new javax.swing.JTable();
        crstatus = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRoom3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rNo.setText("Room Status");

        rType.setText("Room Type");

        bType.setText("Bed Type");

        amt.setText("Amount");

        crType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non_AC" }));

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", " " }));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setText("ROOM Info.");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        tblRoom2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Room ID", "Room Type", "Bed Type", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblRoom2);

        crstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "UnBooked" }));
        crstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rNo)
                                    .addComponent(rType)
                                    .addComponent(bType)
                                    .addComponent(amt))
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(crType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtamt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(crstatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(613, 613, 613))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rType)
                    .addComponent(crType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bType)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amt)
                    .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rNo)
                    .addComponent(crstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClr)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit)
                    .addComponent(btnSave))
                .addGap(22, 22, 22))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        tblRoom3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room Type", "Bed Type", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRoom3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoom3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblRoom3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblRoom3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoom3MouseClicked
       roomx.btnClick(tblRoom3, crType, cbType, txtamt,crstatus);
       btnSave.setEnabled(true);
//        d = (DefaultTableModel)tblRoom3.getModel();
//        int selectedIndex = tblRoom3.getSelectedRow();
//
//        int id = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
//        crType.setSelectedItem(d.getValueAt(selectedIndex, 1).toString());
//        cbType.setSelectedItem(d.getValueAt(selectedIndex, 2).toString());
//        txtamt.setText(d.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_tblRoom3MouseClicked

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
        // TODO add your handling code here:
        btnClr.setEnabled(true);
        crType.setSelectedIndex(-1);
        cbType.setSelectedIndex(-1);
        txtamt.setText("");
        crstatus.setSelectedIndex(-1);
    }//GEN-LAST:event_btnClrActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        roomx.dltRoom(tblRoom3, crType, cbType, txtamt,crstatus);
        roomx.user_load(tblRoom3);
        btnDelete.setEnabled(true);
        //        DefaultTableModel Df=(DefaultTableModel)tblRoom3.getModel();
        //        int selectedIndex = tblRoom3.getSelectedRow();
        //        int RoomID=Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
        //        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure to want to delete the record?", "Warning Message",JOptionPane.YES_NO_OPTION);
        //        if(dialogResult==JOptionPane.YES_OPTION){
            //            try {
                //                pst = con.prepareStatement("delete from roomtbl where roomId=?");
                //                pst.setInt(1, RoomID);
                //                int k = pst.executeUpdate();
                //                if(k==1){
                    //                    JOptionPane.showMessageDialog(this, "Record deleted Successfully.");
                    //                    user_load();
                    //
                    //                    btnDelete.setEnabled(true);
                    //                    crType.setSelectedIndex(-1);
                    //                    cbType.setSelectedIndex(-1);
                    //                    txtamt.setText("");
                    //                    txtamt.requestFocus();
                    //                }
                //                else{
                    //                    JOptionPane.showMessageDialog(this, "Error !!");
                    //                }
                //            } catch (SQLException ex) {
                //                Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
                //            }
            //        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        roomx.editRoom(tblRoom3, crType, cbType, txtamt,crstatus);
        roomx.user_load(tblRoom3);
        btnEdit.setEnabled(true);
        //        try {
            //            d = (DefaultTableModel)tblRoom3.getModel();
            //            int selectedIndex = tblRoom3.getSelectedRow();
            //
            //            int RoomID = Integer.parseInt(d.getValueAt(selectedIndex, 0).toString());
            //            String RoomType = crType.getSelectedItem().toString();
            //            String BedType = cbType.getSelectedItem().toString();
            //            String Amount = txtamt.getText();
            //            pst=con.prepareStatement("update roomtbl set roomtype=?,bedtype=?,amount=? where roomId=?");
            //            pst.setString(1,RoomType);
            //            pst.setString(2,BedType);
            //            pst.setString(3,Amount);
            //            pst.setInt(4,RoomID);
            //            int k = pst.executeUpdate();
            //            if(k==1){
                //                JOptionPane.showMessageDialog(this, "Category Updated !!");
                //                crType.setSelectedIndex(-1);
                //                cbType.setSelectedIndex(-1);
                //                txtamt.setText("");
                //                txtamt.requestFocus();
                //                user_load();
                //                btnEdit.setEnabled(true);
                //            }
            //            else{
                //                JOptionPane.showMessageDialog(this, "Error !!");
                //            }
            //        } catch (SQLException ex) {
            //            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        roomx.addRoom(crType.getSelectedItem().toString(),cbType.getSelectedItem().toString(),txtamt.getText(),crstatus.getSelectedItem().toString());
        crType.setSelectedItem("-1");
        cbType.setSelectedItem("-1");
        txtamt.setText("");
        crstatus.setSelectedItem("-1");
        roomx.user_load(tblRoom3);
        btnSave.setEnabled(true);
        //        try {
            //            d = (DefaultTableModel)tblRoom3.getModel();
            //            int selectedIndex = tblRoom3.getSelectedRow();
            //            String BedType = cbType.getSelectedItem().toString();
            //            String RoomType = crType.getSelectedItem().toString();
            //            String Amount = txtamt.getText();
            //            pst=con.prepareStatement("insert into roomtbl(roomtype, bedtype,amount) VALUES (?,?,?) ");
            //            pst.setString(1,RoomType);
            //            pst.setString(2,BedType);
            //            pst.setString(3,Amount);
            //            pst.executeUpdate();
            //
            //            JOptionPane.showMessageDialog(this, "Saved successfully.");
            //            user_load();
            //            btnSave.setEnabled(true);
            //            crType.setSelectedIndex(-1);
            //            cbType.setSelectedIndex(-1);
            //            txtamt.setText("");
            //            txtamt.requestFocus();
            //        } catch (SQLException ex) {
            //            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void crstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crstatusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amt;
    private javax.swing.JLabel bType;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JComboBox<String> crType;
    public static javax.swing.JComboBox<String> crstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel rNo;
    private javax.swing.JLabel rType;
    private javax.swing.JTable tblRoom2;
    private javax.swing.JTable tblRoom3;
    private javax.swing.JTextField txtamt;
    // End of variables declaration//GEN-END:variables
}
