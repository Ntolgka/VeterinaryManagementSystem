package veterinary.management;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class vetsNoForm extends javax.swing.JFrame {
    EklemeIslemeleri ei = new EklemeIslemeleri();
    GuncellemeIslemleri gi = new GuncellemeIslemleri();
    SilmeIslemleri si = new SilmeIslemleri();

    /**
     * Creates new form vetsNoForm
     */
    public vetsNoForm() {
        initComponents();
        ssnComboBox();
        setTitle("Employees' Phone No");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        insertBut = new javax.swing.JButton();
        updateBut = new javax.swing.JButton();
        deleteBut = new javax.swing.JButton();
        tableBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ssnCombo = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(625, 539));

        jLabel1.setText("Vet's SSN:");

        jLabel2.setText("Vet's Phone No:");

        insertBut.setText("INSERT");
        insertBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButActionPerformed(evt);
            }
        });

        updateBut.setText("UPDATE");
        updateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButActionPerformed(evt);
            }
        });

        deleteBut.setText("DELETE");
        deleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButActionPerformed(evt);
            }
        });

        tableBut.setText("Get Table");
        tableBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Phone No", "SSN"
                }));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(phoneField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                141,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(ssnCombo,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(38, 38, 38)
                                                                .addComponent(insertBut,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(updateBut,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 83,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(tableBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteBut, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(ssnCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(phoneField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(insertBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(updateBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deleteBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11)))
                                .addGap(28, 28, 28)
                                .addComponent(tableBut, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ssnComboBox() {

        String query = "SELECT vetSSN FROM vet;";
        Database db = new Database();
        try {
            PreparedStatement pst = db.getCon().prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                String ssn = rs.getString("vetSSN");

                ssnCombo.addItem(ssn);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private void insertButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_insertButActionPerformed
        ei.vetPhoneekle(phoneField.getText(), String.valueOf(ssnCombo.getSelectedItem()));
    }// GEN-LAST:event_insertButActionPerformed

    int temp = 1;
    String oldSSN = "";

    private void updateButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateButActionPerformed
        temp++;
        String newPhoneNo = null;
        String newSSN = null;

        if (temp == 2) {

            oldSSN = String.valueOf(ssnCombo.getSelectedItem());

        }

        else if (temp == 3) {

            newPhoneNo = phoneField.getText();
            newSSN = String.valueOf(ssnCombo.getSelectedItem());

            gi.vetPhoneGuncelle(newPhoneNo, newSSN, oldSSN);

        } else if (temp > 3) {

            phoneField.setText("");
            oldSSN = "";

            temp = 1;
        }
    }// GEN-LAST:event_updateButActionPerformed

    private void deleteButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButActionPerformed
        si.vetPhoneDelete(String.valueOf(ssnCombo.getSelectedItem()));
    }// GEN-LAST:event_deleteButActionPerformed

    private void tableButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tableButActionPerformed
        TableAdder ta = new TableAdder();
        ta.vetPhoneTable(jTable1);
    }// GEN-LAST:event_tableButActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vetsNoForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vetsNoForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vetsNoForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vetsNoForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vetsNoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBut;
    private javax.swing.JButton insertBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JComboBox<String> ssnCombo;
    private javax.swing.JButton tableBut;
    private javax.swing.JButton updateBut;
    // End of variables declaration//GEN-END:variables
}
