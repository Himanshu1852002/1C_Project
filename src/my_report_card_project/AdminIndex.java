package my_report_card_project;

import javax.swing.JOptionPane;

/**
 *
 * @author Anikesh
 */
public class AdminIndex extends javax.swing.JFrame {

    String user_Name = "Admin";
    String passWord = "1234";

  
    

    public AdminIndex() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CollegeLogo_01 = new javax.swing.JLabel();
        TopMessage_02 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_UserName_01 = new javax.swing.JTextField();
        UserName_04 = new javax.swing.JLabel();
        tf_Password_02 = new javax.swing.JPasswordField();
        Password_05 = new javax.swing.JLabel();
        LoginButton_01 = new javax.swing.JButton();
        BackButton_02 = new javax.swing.JButton();
        AdminLogo_08 = new javax.swing.JLabel();
        BackgroundImage_09 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CollegeLogo_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_report_card_project/1595483733332-removebg-preview.png"))); // NOI18N
        getContentPane().add(CollegeLogo_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 130, -1));

        TopMessage_02.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TopMessage_02.setText("Welcome Admin!");
        getContentPane().add(TopMessage_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 460, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));
        getContentPane().add(tf_UserName_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 220, 30));

        UserName_04.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserName_04.setText("User Name");
        getContentPane().add(UserName_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 80, 30));
        getContentPane().add(tf_Password_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 220, 30));

        Password_05.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Password_05.setText("Password");
        getContentPane().add(Password_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 80, 30));

        LoginButton_01.setBackground(new java.awt.Color(0, 0, 0));
        LoginButton_01.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        LoginButton_01.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton_01.setText("Login");
        LoginButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton_01ActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 80, 30));

        BackButton_02.setBackground(new java.awt.Color(0, 0, 0));
        BackButton_02.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackButton_02.setForeground(new java.awt.Color(255, 255, 255));
        BackButton_02.setText("Back");
        BackButton_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton_02ActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 80, 30));

        AdminLogo_08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/admin_logo-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(AdminLogo_08, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 170, 190));

        BackgroundImage_09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/naibuilding.png"))); // NOI18N
        getContentPane().add(BackgroundImage_09, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1144, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButton_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton_01ActionPerformed
        String username = tf_UserName_01.getText();
        String password = tf_Password_02.getText();
        if (username.equals(user_Name) && password.equals(passWord)) {
            setVisible(false);
            new Admin_Management().setVisible(true);
        } else if (username.equals("") && password.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Username and Password");
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        } else if (!"Admin".equals(username)) {
            JOptionPane.showMessageDialog(null, "Username is Incorrect");
        } else if (!"1234".equals(password)) {
            JOptionPane.showMessageDialog(null, "Password is Incorrect");
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Input ");

        }

    }//GEN-LAST:event_LoginButton_01ActionPerformed

    private void BackButton_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton_02ActionPerformed
        setVisible(false);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_BackButton_02ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLogo_08;
    private javax.swing.JButton BackButton_02;
    private javax.swing.JLabel BackgroundImage_09;
    private javax.swing.JLabel CollegeLogo_01;
    private javax.swing.JButton LoginButton_01;
    private javax.swing.JLabel Password_05;
    private javax.swing.JLabel TopMessage_02;
    private javax.swing.JLabel UserName_04;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField tf_Password_02;
    private javax.swing.JTextField tf_UserName_01;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        @Override
        public void run() {
            new AdminIndex().setVisible(true);
        }
    }
}
