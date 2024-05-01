package my_report_card_project;
/**
 * @author Himanshu
 */
public class MainFrame extends javax.swing.JFrame {

   
    public MainFrame() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CollegeLogo_01 = new javax.swing.JLabel();
        StudentButton_01 = new javax.swing.JButton();
        AdminButton_02 = new javax.swing.JButton();
        CollegeName_07 = new javax.swing.JLabel();
        CollegeName2_08 = new javax.swing.JLabel();
        StudentLogo_09 = new javax.swing.JLabel();
        AdminLogo_03 = new javax.swing.JLabel();
        BackgroundImage_04 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/naibuilding.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CollegeLogo_01.setBackground(new java.awt.Color(255, 153, 0));
        CollegeLogo_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/1595483733332-removebg-preview200.png"))); // NOI18N
        CollegeLogo_01.setMaximumSize(new java.awt.Dimension(100, 100));
        CollegeLogo_01.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(CollegeLogo_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 127, 113));

        StudentButton_01.setBackground(new java.awt.Color(0, 0, 0));
        StudentButton_01.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StudentButton_01.setForeground(new java.awt.Color(255, 255, 255));
        StudentButton_01.setText("Student");
        StudentButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentButton_01ActionPerformed(evt);
            }
        });
        getContentPane().add(StudentButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 98, -1));

        AdminButton_02.setBackground(new java.awt.Color(0, 0, 0));
        AdminButton_02.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdminButton_02.setForeground(new java.awt.Color(255, 255, 255));
        AdminButton_02.setText("Admin");
        AdminButton_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButton_02ActionPerformed(evt);
            }
        });
        getContentPane().add(AdminButton_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 100, -1));

        CollegeName_07.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CollegeName_07.setText("Sant Singaji Institute of Science & Management ,");
        getContentPane().add(CollegeName_07, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, 50));

        CollegeName2_08.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CollegeName2_08.setText("Sandalpur (M.P.)");
        getContentPane().add(CollegeName2_08, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        StudentLogo_09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Student101.png"))); // NOI18N
        getContentPane().add(StudentLogo_09, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, 150));

        AdminLogo_03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/admin_logo-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(AdminLogo_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 190, 160));

        BackgroundImage_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/naibuilding.png"))); // NOI18N
        getContentPane().add(BackgroundImage_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1144, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdminButton_02ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new AdminIndex().setVisible(true);
    }
    private void StudentButton_01ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new Student_Result().setVisible(true);
    }
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton_02;
    private javax.swing.JLabel AdminLogo_03;
    private javax.swing.JLabel BackgroundImage_04;
    private javax.swing.JLabel CollegeLogo_01;
    private javax.swing.JLabel CollegeName2_08;
    private javax.swing.JLabel CollegeName_07;
    private javax.swing.JButton StudentButton_01;
    private javax.swing.JLabel StudentLogo_09;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        @Override
        public void run() {
            new MainFrame().setVisible(true);
        }
    }
}
