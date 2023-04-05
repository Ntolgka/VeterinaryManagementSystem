package veterinary.management;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservationForm extends javax.swing.JFrame {
    EklemeIslemeleri eislem = new EklemeIslemeleri();
    GuncellemeIslemleri gi = new GuncellemeIslemleri();
    SilmeIslemleri si = new SilmeIslemleri();

    /**
     * Creates new form ReservationForm
     */
    public ReservationForm() {
        initComponents();
        ssnComboBox();
        setTitle("Reservations");
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

        insertBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updateBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        deleteBut = new javax.swing.JButton();
        txtdate = new javax.swing.JTextField();
        tableBut = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        ssnCombo = new javax.swing.JComboBox<>();
        showClientsBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insertBut.setText("INSERT");
        insertBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButActionPerformed(evt);
            }
        });

        jLabel1.setText("Date:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Date", "Client SSN"
                }));
        jScrollPane1.setViewportView(jTable1);

        updateBut.setText("UPDATE");
        updateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButActionPerformed(evt);
            }
        });

        jLabel2.setText("clientSSN:");

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

        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        showClientsBut.setText("Show Clients");
        showClientsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showClientsButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(29, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2))
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(txtdate,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                125, Short.MAX_VALUE)
                                                                        .addComponent(ssnCombo, 0,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tableBut,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(showClientsBut,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 101,
                                                                        Short.MAX_VALUE)))
                                                .addGap(40, 40, 40)
                                                .addComponent(insertBut, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(updateBut, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(deleteBut,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(menuButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 112,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(21, 21, 21)))))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(ssnCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(insertBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(updateBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deleteBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tableBut, javax.swing.GroupLayout.DEFAULT_SIZE, 38,
                                                Short.MAX_VALUE)
                                        .addComponent(menuButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showClientsBut, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(146, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ssnComboBox() {

        String query = "SELECT clientSSN FROM client;";
        Database db = new Database();
        try {
            PreparedStatement pst = db.getCon().prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                String ssn = rs.getString("clientSSN");

                ssnCombo.addItem(ssn);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private void insertButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_insertButActionPerformed
        eislem.reservationekle(txtdate.getText(), String.valueOf(ssnCombo.getSelectedItem()));
    }// GEN-LAST:event_insertButActionPerformed

    int temp = 1;
    String oldDate = "";

    private void updateButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateButActionPerformed

        temp++;
        String newDate = null;
        String newClientSSN = null;

        if (temp == 2) {

            oldDate = txtdate.getText();

        }

        else if (temp == 3) {

            newDate = txtdate.getText();
            newClientSSN = String.valueOf(ssnCombo.getSelectedItem());

            gi.reservationGuncelle(newDate, newClientSSN, oldDate);

        } else if (temp > 3) {

            txtdate.setText("");
            oldDate = "";

            temp = 1;
        }

    }// GEN-LAST:event_updateButActionPerformed

    private void deleteButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButActionPerformed
        String curDate = txtdate.getText();
        si.reservationDelete(curDate);
    }// GEN-LAST:event_deleteButActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuButtonActionPerformed
        MainPage mp = new MainPage();
        setVisible(false);
        mp.setVisible(true);
    }// GEN-LAST:event_menuButtonActionPerformed

    private void tableButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tableButActionPerformed
        TableAdder ta = new TableAdder();
        ta.reservationTable(jTable1);
    }// GEN-LAST:event_tableButActionPerformed

    private void showClientsButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showClientsButActionPerformed
        ClientForm cf = new ClientForm();
        cf.setVisible(true);
        cf.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

    }// GEN-LAST:event_showClientsButActionPerformed

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
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationForm().setVisible(true);
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
    private javax.swing.JButton menuButton;
    private javax.swing.JButton showClientsBut;
    private javax.swing.JComboBox<String> ssnCombo;
    private javax.swing.JButton tableBut;
    private javax.swing.JTextField txtdate;
    private javax.swing.JButton updateBut;
    // End of variables declaration//GEN-END:variables
}
