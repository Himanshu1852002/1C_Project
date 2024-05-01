package my_report_card_project;
public class Admin_Management extends javax.swing.JFrame {

    public Admin_Management() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopMessage_01 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ModiffyStudentInfo_Logo_04 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ModifyStudentInfoButton_01 = new javax.swing.JButton();
        ModifyReportCard_logo_05 = new javax.swing.JLabel();
        ModifyReportCard_Button_02 = new javax.swing.JButton();
        LogOut_Button_05 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BackgroundImage_10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopMessage_01.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TopMessage_01.setText("Student Management System!");
        getContentPane().add(TopMessage_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 57, 691, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 33, 146, -1));

        ModiffyStudentInfo_Logo_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Add_data_logo-removebg-preview.png"))); // NOI18N
        ModiffyStudentInfo_Logo_04.setText("jLabel4");
        getContentPane().add(ModiffyStudentInfo_Logo_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 109, 122));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 413, 37, -1));

        ModifyStudentInfoButton_01.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ModifyStudentInfoButton_01.setText("Modify Student Info");
        ModifyStudentInfoButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyStudentInfoButton_01ActionPerformed(evt);
            }
        });
        getContentPane().add(ModifyStudentInfoButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        ModifyReportCard_logo_05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/new data.png"))); // NOI18N
        ModifyReportCard_logo_05.setText("jLabel5");
        getContentPane().add(ModifyReportCard_logo_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 100, -1));

        ModifyReportCard_Button_02.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ModifyReportCard_Button_02.setText("Modify Report_Card");
        ModifyReportCard_Button_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyReportCard_Button_02ActionPerformed(evt);
            }
        });
        getContentPane().add(ModifyReportCard_Button_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 170, -1));

        LogOut_Button_05.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOut_Button_05.setText("Log Out");
        LogOut_Button_05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut_Button_05ActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut_Button_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/1595483733332-removebg-preview200.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 100, 90));

        BackgroundImage_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/naibuilding.png"))); // NOI18N
        getContentPane().add(BackgroundImage_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1144, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOut_Button_05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut_Button_05ActionPerformed
        setVisible(false);
        new AdminIndex().setVisible(true);
    }//GEN-LAST:event_LogOut_Button_05ActionPerformed

    private void ModifyStudentInfoButton_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyStudentInfoButton_01ActionPerformed
        setVisible(false);
        new Student_Data_UID().setVisible(true);
    }//GEN-LAST:event_ModifyStudentInfoButton_01ActionPerformed

    private void ModifyReportCard_Button_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyReportCard_Button_02ActionPerformed
        setVisible(false);
        new  Student_Marks_UID().setVisible(true);
    }//GEN-LAST:event_ModifyReportCard_Button_02ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage_10;
    private javax.swing.JButton LogOut_Button_05;
    private javax.swing.JLabel ModiffyStudentInfo_Logo_04;
    private javax.swing.JButton ModifyReportCard_Button_02;
    private javax.swing.JLabel ModifyReportCard_logo_05;
    private javax.swing.JButton ModifyStudentInfoButton_01;
    private javax.swing.JLabel TopMessage_01;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        @Override
        public void run() {
            new Admin_Management().setVisible(true);
        }
    }
}
