package my_report_card_project;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Anikesh
 */
public class Student_Result extends javax.swing.JFrame {

    public Student_Result() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CollegeLogo_01 = new javax.swing.JLabel();
        TopMessage_02 = new javax.swing.JLabel();
        StudentLogo_03 = new javax.swing.JLabel();
        EnterRollNumber_01 = new javax.swing.JTextField();
        SearchButton_01 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BackButton_02 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_Year_01 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CollegeLogo_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/1595483733332-removebg-preview200.png"))); // NOI18N
        getContentPane().add(CollegeLogo_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 130, 120));

        TopMessage_02.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        TopMessage_02.setText("Get Your Result!");
        getContentPane().add(TopMessage_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 420, 40));

        StudentLogo_03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Student101.png"))); // NOI18N
        getContentPane().add(StudentLogo_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 250, 250));

        EnterRollNumber_01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterRollNumber_01KeyPressed(evt);
            }
        });
        getContentPane().add(EnterRollNumber_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 290, 30));

        SearchButton_01.setBackground(new java.awt.Color(0, 0, 0));
        SearchButton_01.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchButton_01.setForeground(new java.awt.Color(255, 255, 255));
        SearchButton_01.setText("Search");
        SearchButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton_01ActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 90, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(" Roll Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 100, 30));

        BackButton_02.setBackground(new java.awt.Color(0, 0, 0));
        BackButton_02.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackButton_02.setForeground(new java.awt.Color(255, 255, 255));
        BackButton_02.setText("Back");
        BackButton_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton_02ActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("    Year");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 70, 30));

        cb_Year_01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "1st Year", "2nd Year", "3rd Year" }));
        getContentPane().add(cb_Year_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 290, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/naibuilding.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButton_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton_02ActionPerformed
        setVisible(false);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_BackButton_02ActionPerformed

    private void SearchButton_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton_01ActionPerformed
        String roll_num = EnterRollNumber_01.getText();
        try {
            ClassLoadingAndConnectivity.loadAndConnect();
            Statement st = ClassLoadingAndConnectivity.con.createStatement();
            String year = cb_Year_01.getSelectedItem().toString();
            ResultSet rs;

            switch (year) {

                case "1st Year":
                    try {
                        rs = st.executeQuery("select * from Student_Information1 inner join Student_Results0 where Student_Information1.Roll_Number='" + roll_num + "' and Student_Results0.Roll_Num='" + roll_num + "' ");
                        if (rs.next()) {
                            setVisible(false);
                            new Show_Result(roll_num).setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Roll Number Does'nt Exsist in database ");
                            setVisible(false);
                            new Student_Result().setVisible(true);
                        }
                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Connection Error");
                    }
                    break;

                case "2nd Year":
                    try {
                        rs = st.executeQuery("select * from Student_Information2 inner join Student_Results1 where Student_Information2.Roll_Number='" + roll_num + "' and Student_Results1.Roll_Num='" + roll_num + "' ");
                        if (rs.next()) {
                            setVisible(false);
                            new Show_Result_2nd(roll_num).setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Roll Number Does'nt Exsist in database ");
                            setVisible(false);
                            new Student_Result().setVisible(true);
                        }
                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Connection Error");
                    }
                    break;

                case "3rd Year":
                    try {
                        rs = st.executeQuery("select * from Student_Information3 inner join Student_Results2 where Student_Information3.Roll_Number='" + roll_num + "' and Student_Results2.Roll_Num='" + roll_num + "' ");
                        if (rs.next()) {
                            setVisible(false);
                            new Show_Result_3rd(roll_num).setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Roll Number Does'nt Exsist in database ");
                            setVisible(false);
                            new Student_Result().setVisible(true);
                        }
                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Connection Error");
                    }
                    break;
                    
                default:
                    try {
                        rs = st.executeQuery("select * from Student_Information1 inner join Student_Results0 where Student_Information1.Roll_Number='" + roll_num + "' and Student_Results0.Roll_Num='" + roll_num + "' ");
                        if (rs.next()) {
                            setVisible(false);
                            new Show_Result(roll_num).setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Roll Number Does'nt Exsist in database ");
                            setVisible(false);
                            new Student_Result().setVisible(true);
                        }
                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Connection Error");
                    }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_SearchButton_01ActionPerformed

    private void EnterRollNumber_01KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterRollNumber_01KeyPressed
 if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SearchButton_01ActionPerformed(null);
        }
    }//GEN-LAST:event_EnterRollNumber_01KeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton_02;
    private javax.swing.JLabel CollegeLogo_01;
    private javax.swing.JTextField EnterRollNumber_01;
    private javax.swing.JButton SearchButton_01;
    private javax.swing.JLabel StudentLogo_03;
    private javax.swing.JLabel TopMessage_02;
    private javax.swing.JComboBox<String> cb_Year_01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        @Override
        public void run() {
            new Student_Result().setVisible(true);
        }
    }
}
