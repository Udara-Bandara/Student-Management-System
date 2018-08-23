/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm.FRAMES.Administrator;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nsbm.FRAMES.HomeFrames.Home;
import nsbm.objects.DBoperation;
import nsbm.objects.buildTable;


/**
 *
 * @author ubandara
 */
public class Faculty_details extends javax.swing.JFrame {

    
    
    public Faculty_details() throws SQLException {
        initComponents();
        DBoperation db = new DBoperation();
        facultyTable.setModel(buildTable.buildTableModel(db.viewFaculty()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic1 = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        newFaculty = new javax.swing.JButton();
        delFaculty = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        facultyTable = new javax.swing.JTable();
        toback = new javax.swing.JButton();
        home = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("faculty_details");
        setPreferredSize(new java.awt.Dimension(2000, 1173));

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/index.png"))); // NOI18N

        heading.setBackground(java.awt.Color.darkGray);
        heading.setFont(new java.awt.Font("Lato", 1, 80)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("NSBM GREEN UNIVERSITY");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FACULTY  DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lato", 1, 20))); // NOI18N

        newFaculty.setBackground(java.awt.Color.gray);
        newFaculty.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        newFaculty.setText("NEW  FACULTY");
        newFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFacultyActionPerformed(evt);
            }
        });

        delFaculty.setBackground(java.awt.Color.gray);
        delFaculty.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        delFaculty.setText("REMOVE  FACULTY");
        delFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delFacultyActionPerformed(evt);
            }
        });

        facultyTable.setBackground(java.awt.Color.lightGray);
        facultyTable.setBorder(null);
        facultyTable.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        facultyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Faculty", "Faculty Id"
            }
        ));
        facultyTable.setGridColor(java.awt.Color.white);
        facultyTable.setRowHeight(36);
        jScrollPane1.setViewportView(facultyTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(newFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        toback.setBackground(java.awt.Color.gray);
        toback.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        toback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/back.png"))); // NOI18N
        toback.setText("BACK");
        toback.setMaximumSize(new java.awt.Dimension(160, 45));
        toback.setMinimumSize(new java.awt.Dimension(160, 45));
        toback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tobackActionPerformed(evt);
            }
        });

        home.setBackground(java.awt.Color.gray);
        home.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/home.png"))); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        logout.setBackground(java.awt.Color.gray);
        logout.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/logout.png"))); // NOI18N
        logout.setText("LOG OUT");
        logout.setMaximumSize(new java.awt.Dimension(160, 45));
        logout.setMinimumSize(new java.awt.Dimension(160, 45));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pic1)
                        .addGap(33, 33, 33)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toback, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addComponent(heading, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFacultyActionPerformed
        //NEW Faculty
        facultyAdd f = new facultyAdd();
        f.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_newFacultyActionPerformed

    private void delFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delFacultyActionPerformed
        // remove faculty
        removeFaculty r = new removeFaculty();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_delFacultyActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TO home
        admin_Details a = new admin_Details();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void tobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tobackActionPerformed
        // go back
        admin_Details a = new admin_Details();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tobackActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TO log out
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

  /*  private DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}*/
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
            java.util.logging.Logger.getLogger(Faculty_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Faculty_details().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Faculty_details.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delFaculty;
    private javax.swing.JTable facultyTable;
    private javax.swing.JLabel heading;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton newFaculty;
    private javax.swing.JLabel pic1;
    private javax.swing.JButton toback;
    // End of variables declaration//GEN-END:variables
}