package veterinary.management;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TreatsForm extends javax.swing.JFrame {

    EklemeIslemeleri eislem = new EklemeIslemeleri();
    GuncellemeIslemleri gi = new GuncellemeIslemleri();
    SilmeIslemleri si = new SilmeIslemleri();
    Database db = new Database();

    /**
     * Creates new form TreatsForm
     */
    public TreatsForm() {
        initComponents();
        dateComboBox();
        treatComboBox();
        setTitle("Treats");
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
        txt_treats = new javax.swing.JTextField();
        tableBut = new javax.swing.JButton();
        treatCombo = new javax.swing.JComboBox<>();
        dateCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        showTreatIdsBut = new javax.swing.JButton();
        showDatesBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insertBut.setText("INSERT");
        insertBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButActionPerformed(evt);
            }
        });

        jLabel1.setText("Treats:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Treats", "Date", "treatID"
                }));
        jScrollPane1.setViewportView(jTable1);

        updateBut.setText("UPDATE");
        updateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButActionPerformed(evt);
            }
        });

        jLabel2.setText("Date:");

        deleteBut.setText("DELETE");
        deleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButActionPerformed(evt);
            }
        });

        txt_treats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_treatsActionPerformed(evt);
            }
        });

        tableBut.setText("Get Table");
        tableBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButActionPerformed(evt);
            }
        });

        jLabel3.setText("Treat ID");

        showTreatIdsBut.setText("Show Treat IDs");
        showTreatIdsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTreatIdsButActionPerformed(evt);
            }
        });

        showDatesBut.setText("Show Dates");
        showDatesBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDatesButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel1)
                                                                                .addGap(47, 47, 47)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false)
                                                                                        .addComponent(treatCombo, 0,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                        .addComponent(dateCombo, 0, 145,
                                                                                                Short.MAX_VALUE)
                                                                                        .addComponent(txt_treats)))
                                                                        .addGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                layout.createSequentialGroup()
                                                                                        .addGap(9, 9, 9)
                                                                                        .addComponent(jLabel2))
                                                                        .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(tableBut)))
                                                .addGap(169, 169, 169)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(showDatesBut,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(insertBut, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(updateBut, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(showTreatIdsBut,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteBut, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(insertBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(updateBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deleteBut, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txt_treats,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(treatCombo,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tableBut, javax.swing.GroupLayout.DEFAULT_SIZE, 35,
                                                        Short.MAX_VALUE)
                                                .addGap(3, 3, 3))
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(showTreatIdsBut, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(showDatesBut, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateComboBox() {

        String query = "SELECT Date FROM reservation;";
        try {
            PreparedStatement pst = db.getCon().prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                String date = rs.getString("Date");

                dateCombo.addItem(date);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private void treatComboBox() {

        String query = "SELECT treatID FROM treatment;";
        try {
            PreparedStatement pst = db.getCon().prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                String tID = rs.getString("treatID");

                treatCombo.addItem(tID);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private void txt_treatsActionPerformed(ActionEvent evt) {
    }

    private void insertButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_insertButActionPerformed

        eislem.treatsekle(String.valueOf(txt_treats.getText()), String.valueOf(dateCombo.getSelectedItem()),
                Integer.parseInt((String) treatCombo.getSelectedItem()));

    }// GEN-LAST:event_insertButActionPerformed

    int temp = 1;
    String oldID = "";

    private void updateButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateButActionPerformed
        temp++;
        String newTreat = null;
        String newDate = null;
        String newTreatID = null;

        if (temp == 2) {

            oldID = (String) treatCombo.getSelectedItem();

        }

        else if (temp == 3) {

            newTreat = String.valueOf(txt_treats.getText());
            newDate = String.valueOf(dateCombo.getSelectedItem());
            newTreatID = String.valueOf(treatCombo.getSelectedItem());

            gi.treatsGuncelle(newTreat, newDate, newTreatID, oldID);

        } else if (temp > 3) {
            oldID = "";

            temp = 1;
        }
    }// GEN-LAST:event_updateButActionPerformed

    private void deleteButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButActionPerformed
        String curDate = String.valueOf(treatCombo.getSelectedItem());
        si.treatsDelete(curDate);
    }// GEN-LAST:event_deleteButActionPerformed

    private void tableButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tableButActionPerformed
        TableAdder ta = new TableAdder();
        ta.treatsTable(jTable1);
    }// GEN-LAST:event_tableButActionPerformed

    private void showDatesButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showDatesButActionPerformed
        ReservationForm rf = new ReservationForm();
        rf.setVisible(true);
        rf.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }// GEN-LAST:event_showDatesButActionPerformed

    private void showTreatIdsButActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showTreatIdsButActionPerformed
        treatmentForm tf = new treatmentForm();
        tf.setVisible(true);
        tf.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }// GEN-LAST:event_showTreatIdsButActionPerformed

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
            java.util.logging.Logger.getLogger(TreatsForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreatsForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreatsForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreatsForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreatsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JButton deleteBut;
    private javax.swing.JButton insertBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton showDatesBut;
    private javax.swing.JButton showTreatIdsBut;
    private javax.swing.JButton tableBut;
    private javax.swing.JComboBox<String> treatCombo;
    private javax.swing.JTextField txt_treats;
    private javax.swing.JButton updateBut;
    // End of variables declaration//GEN-END:variables
}
