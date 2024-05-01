package my_report_card_project;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Anikesh
 */
public class Student_Data_UID extends javax.swing.JFrame {

    int count1 = 0;
    int count2 = 0;
    int count3 = 0;

    DefaultTableModel table1;
    DefaultTableModel table2;
    DefaultTableModel table3;

    public Student_Data_UID() {
        initComponents();

    }

    private void forEmpty() {
        tf_studentName_02.setText("");
        tf_fatherName_03.setText("");
        tf_motherName_04.setText("");

    }

    public void seeData() {

        try {
            Statement st;
            ResultSet rs;
            ClassLoadingAndConnectivity.loadAndConnect();
            String Year = (String) cb_year_02.getSelectedItem();

            String query = "";

            switch (Year) {

                case "1st Year":
                    if (!(count1 == 0)) {
                        table1.setRowCount(0);
                    } else {
                        count1++;
                    }

                    query = "select * from Student_Information1";
                    st = ClassLoadingAndConnectivity.con.createStatement();
                    rs = st.executeQuery(query);
                    if (table1 == null) {
                        table1 = (DefaultTableModel) t_StudentInfo_01.getModel();
                    }

                    while (rs.next()) {

                        Vector StudentList = new Vector();

                        StudentList.add(rs.getString("Student_Name"));
                        StudentList.add(rs.getString("Father_Name"));
                        StudentList.add(rs.getString("Mother_Name"));
                        StudentList.add(rs.getString("Gender"));
                        StudentList.add(rs.getString("Roll_Number"));
                        StudentList.add(rs.getString("Cyear"));
                        StudentList.add(rs.getString("Course_Name"));
                        table1.addRow(StudentList);
                    }

                    st.close();
                    rs.close();
                    break;

                case "2nd Year":

                    if (!(count2 == 0)) {
                        table2.setRowCount(0);
                    } else {
                        count2++;
                    }
                    query = "select * from Student_Information2";
                    st = ClassLoadingAndConnectivity.con.createStatement();
                    rs = st.executeQuery(query);
                    if (table2 == null) {
                        table2 = (DefaultTableModel) t_StudentInfo_2.getModel();
                    }
                    while (rs.next()) {
                        Vector StudentList = new Vector();

                        StudentList.add(rs.getString("Student_Name"));
                        StudentList.add(rs.getString("Father_Name"));
                        StudentList.add(rs.getString("Mother_Name"));
                        StudentList.add(rs.getString("Gender"));
                        StudentList.add(rs.getString("Roll_Number"));
                        StudentList.add(rs.getString("Cyear"));
                        StudentList.add(rs.getString("Course_Name"));

                        table2.addRow(StudentList);
                    }
                    st.close();
                    rs.close();
                    break;

                case "3rd Year":

                    if (!(count3 == 0)) {
                        table3.setRowCount(0);
                    } else {
                        count3++;
                    }
                    query = "select * from Student_Information3";
                    st = ClassLoadingAndConnectivity.con.createStatement();
                    rs = st.executeQuery(query);
                    if (table3 == null) {
                        table3 = (DefaultTableModel) t_StudentInfo_3.getModel();
                    }
                    while (rs.next()) {

                        Vector StudentList = new Vector();

                        StudentList.add(rs.getString("Student_Name"));
                        StudentList.add(rs.getString("Father_Name"));
                        StudentList.add(rs.getString("Mother_Name"));
                        StudentList.add(rs.getString("Gender"));
                        StudentList.add(rs.getString("Roll_Number"));
                        StudentList.add(rs.getString("Cyear"));
                        StudentList.add(rs.getString("Course_Name"));
                        table3.addRow(StudentList);
                    }

                    st.close();
                    rs.close();

                    break;
                default:
                    table1 = (DefaultTableModel) t_StudentInfo_01.getModel();
                    break;
            }
            //ClassLoadingAndConnectivity.con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection error");
        }
    }

    private void search(String str) {
        String Year = (String) cb_year_02.getSelectedItem();
        TableRowSorter<DefaultTableModel> trs;

        switch (Year) {

            case "1st  Year":

                table1 = (DefaultTableModel) t_StudentInfo_01.getModel();
                trs = new TableRowSorter<>(table1);
                t_StudentInfo_01.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(str));

                break;

            case "2nd Year":

                table2 = (DefaultTableModel) t_StudentInfo_2.getModel();
                trs = new TableRowSorter<>(table2);
                t_StudentInfo_2.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(str));
                break;

            case "3rd Year":

                table3 = (DefaultTableModel) t_StudentInfo_3.getModel();
                trs = new TableRowSorter<>(table3);
                t_StudentInfo_3.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(str));
                break;

            default:
                table1 = (DefaultTableModel) t_StudentInfo_01.getModel();
                trs = new TableRowSorter<>(table1);
                t_StudentInfo_01.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(str));
                break;

        }
    }

    private void rnAutoIncreament() {
        String Year = (String) cb_year_02.getSelectedItem();

        try {
            ClassLoadingAndConnectivity.loadAndConnect();

            String query = "";

            switch (Year) {

                case "1st  Year":
                    query = "SELECT Roll_Number from Student_Information1 order by Roll_Number desc limit 1";
                    break;

                case "2nd Year":
                    query = "SELECT Roll_Number from Student_Information2 order by Roll_Number desc limit 1";
                    break;

                case "3rd Year":
                    query = "SELECT Roll_Number from Student_Information3 order by Roll_Number desc limit 1";
                    break;

                default:
                    query = "SELECT Roll_Number from Student_Information1 order by Roll_Number desc limit 1";
                    break;
            }

            PreparedStatement ptst = ClassLoadingAndConnectivity.con.prepareStatement(query);
            ResultSet rt = ptst.executeQuery();
            if (rt.next()) {
                String Roll_Number = rt.getString(1);
                int roll = Integer.parseInt(Roll_Number);
                int roll_Num = roll + 1;
                if (Year.equals("1st Year") || Year.equals("2nd Year") || Year.equals("3rd Year")) {
                    tf_RollNumber_01.setText(Integer.toString(roll_Num));
                }
                rt.close();
                ptst.close();
               // ClassLoadingAndConnectivity.con.close();

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton_04 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        courseName_02 = new javax.swing.JLabel();
        year_03 = new javax.swing.JLabel();
        rollNumber_04 = new javax.swing.JLabel();
        studentName_05 = new javax.swing.JLabel();
        fatherName_06 = new javax.swing.JLabel();
        motherName_07 = new javax.swing.JLabel();
        genderr_08 = new javax.swing.JLabel();
        cb_courseName_01 = new javax.swing.JComboBox<>();
        cb_year_02 = new javax.swing.JComboBox<>();
        tf_RollNumber_01 = new javax.swing.JTextField();
        tf_studentName_02 = new javax.swing.JTextField();
        tf_fatherName_03 = new javax.swing.JTextField();
        tf_motherName_04 = new javax.swing.JTextField();
        cb_genderr_03 = new javax.swing.JComboBox<>();
        insertButton_05 = new javax.swing.JButton();
        deleteButton_05 = new javax.swing.JButton();
        updateButton_05 = new javax.swing.JButton();
        refreshButton_01 = new javax.swing.JButton();
        tf_Searchbar_01 = new javax.swing.JTextField();
        SearchButton_01 = new javax.swing.JButton();
        tp_AllYear_01 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_StudentInfo_01 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_StudentInfo_2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        t_StudentInfo_3 = new javax.swing.JTable();
        Student_Marks_Button_02 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton_04.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backButton_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/icons8-back-button-30.png"))); // NOI18N
        backButton_04.setText("Back");
        backButton_04.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton_04ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/1595483733332-removebg-preview200.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        courseName_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        courseName_02.setText(" Course Name  ");
        jPanel1.add(courseName_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, -1));

        year_03.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        year_03.setText(" Year");
        jPanel1.add(year_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, -1));

        rollNumber_04.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rollNumber_04.setText(" Roll Number   ");
        jPanel1.add(rollNumber_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, -1));

        studentName_05.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studentName_05.setText(" Student Name");
        jPanel1.add(studentName_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, -1));

        fatherName_06.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fatherName_06.setText(" Father Name   ");
        jPanel1.add(fatherName_06, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 140, -1));

        motherName_07.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        motherName_07.setText(" Mother Name   ");
        jPanel1.add(motherName_07, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 140, -1));

        genderr_08.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genderr_08.setText(" Gender   ");
        jPanel1.add(genderr_08, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 140, -1));

        cb_courseName_01.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cb_courseName_01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCA" }));
        cb_courseName_01.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cb_courseName_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 200, 30));

        cb_year_02.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cb_year_02.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "1st Year", "2nd Year", "3rd Year" }));
        cb_year_02.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cb_year_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_year_02ActionPerformed(evt);
            }
        });
        jPanel1.add(cb_year_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 200, 30));

        tf_RollNumber_01.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tf_RollNumber_01.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_RollNumber_01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_RollNumber_01KeyReleased(evt);
            }
        });
        jPanel1.add(tf_RollNumber_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 200, 30));

        tf_studentName_02.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tf_studentName_02.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tf_studentName_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 200, 30));

        tf_fatherName_03.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tf_fatherName_03.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tf_fatherName_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 200, 30));

        tf_motherName_04.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tf_motherName_04.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tf_motherName_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 200, 30));

        cb_genderr_03.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cb_genderr_03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female " }));
        cb_genderr_03.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cb_genderr_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 200, -1));

        insertButton_05.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        insertButton_05.setText("Insert");
        insertButton_05.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertButton_05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButton_05ActionPerformed(evt);
            }
        });
        jPanel1.add(insertButton_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 70, -1));

        deleteButton_05.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        deleteButton_05.setText("Delete");
        deleteButton_05.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton_05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton_05ActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 70, -1));

        updateButton_05.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        updateButton_05.setText("Update");
        updateButton_05.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton_05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton_05ActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 70, -1));

        refreshButton_01.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshButton_01.setText("Refresh");
        refreshButton_01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton_01ActionPerformed(evt);
            }
        });
        jPanel1.add(refreshButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 80, -1));

        tf_Searchbar_01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_Searchbar_01KeyReleased(evt);
            }
        });
        jPanel1.add(tf_Searchbar_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 250, 30));

        SearchButton_01.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        SearchButton_01.setText("Search");
        SearchButton_01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchButton_01.setPreferredSize(new java.awt.Dimension(68, 26));
        SearchButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton_01ActionPerformed(evt);
            }
        });
        jPanel1.add(SearchButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 80, 30));

        tp_AllYear_01.setBackground(new java.awt.Color(51, 51, 51));
        tp_AllYear_01.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_StudentInfo_01.setBackground(new java.awt.Color(51, 51, 51));
        t_StudentInfo_01.setForeground(new java.awt.Color(255, 255, 255));
        t_StudentInfo_01.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Father Name", "Mother Name", "Gender", "Roll Number", "Year", "Course Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_StudentInfo_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_StudentInfo_01MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(t_StudentInfo_01);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 580));

        tp_AllYear_01.addTab("1st Year", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_StudentInfo_2.setBackground(new java.awt.Color(51, 51, 51));
        t_StudentInfo_2.setForeground(new java.awt.Color(255, 255, 255));
        t_StudentInfo_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Father Name", "Mother Name", "Gender", "Rol Number", "Year", "Course Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_StudentInfo_2.getTableHeader().setReorderingAllowed(false);
        t_StudentInfo_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_StudentInfo_2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(t_StudentInfo_2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 580));

        tp_AllYear_01.addTab("2nd Year", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_StudentInfo_3.setBackground(new java.awt.Color(51, 51, 51));
        t_StudentInfo_3.setForeground(new java.awt.Color(255, 255, 255));
        t_StudentInfo_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Father Name", "Mother Name", "Gender", "Roll Number", "Year", "Course Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_StudentInfo_3.getTableHeader().setReorderingAllowed(false);
        t_StudentInfo_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_StudentInfo_3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(t_StudentInfo_3);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 580));

        tp_AllYear_01.addTab("3rd Year", jPanel5);

        Student_Marks_Button_02.setBackground(new java.awt.Color(0, 102, 102));
        Student_Marks_Button_02.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Student_Marks_Button_02.setForeground(new java.awt.Color(255, 255, 255));
        Student_Marks_Button_02.setText("Student_Marks_UID");
        Student_Marks_Button_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Marks_Button_02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Student_Marks_Button_02, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tp_AllYear_01, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Student_Marks_Button_02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tp_AllYear_01, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButton_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton_04ActionPerformed
        setVisible(false);
        new Admin_Management().setVisible(true);
    }//GEN-LAST:event_backButton_04ActionPerformed

    private void refreshButton_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton_01ActionPerformed

        String search = tf_studentName_02.getText();
        search(search);
        rnAutoIncreament();
        forEmpty();
    }//GEN-LAST:event_refreshButton_01ActionPerformed

    private void tf_RollNumber_01KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_RollNumber_01KeyReleased
//        String searchRN = tf_RollNumber_01.getText();
//        search(searchRN);
    }//GEN-LAST:event_tf_RollNumber_01KeyReleased

    private void tf_Searchbar_01KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_Searchbar_01KeyReleased
//        String searchRN = tf_Searchbar_01.getText();
//        search(searchRN);
    }//GEN-LAST:event_tf_Searchbar_01KeyReleased

    private void SearchButton_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton_01ActionPerformed
        String searchRN = tf_Searchbar_01.getText();
        search(searchRN);
    }//GEN-LAST:event_SearchButton_01ActionPerformed

    private void Student_Marks_Button_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_Marks_Button_02ActionPerformed
        setVisible(false);
        new Student_Marks_UID().setVisible(true);
    }//GEN-LAST:event_Student_Marks_Button_02ActionPerformed

    private void insertButton_05ActionPerformed(java.awt.event.ActionEvent evt) {

        String Course = (String) cb_courseName_01.getSelectedItem();
        String Year = (String) cb_year_02.getSelectedItem();
        String Roll_Number = tf_RollNumber_01.getText();
        String Name = tf_studentName_02.getText();
        String Father = tf_fatherName_03.getText();
        String Mother = tf_motherName_04.getText();
        String Gender = (String) cb_genderr_03.getSelectedItem();

        if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !(Name.isEmpty()) && !(Father.isEmpty())
                && !(Mother.isEmpty())) {
            try {
                ClassLoadingAndConnectivity.loadAndConnect();

                String query = "";

                switch (Year) {
                    case "1st Year":

                        query = "insert into Student_Information1 (Student_Name, Father_Name, Mother_Name, Gender, Roll_Number, Cyear, Course_Name)values(?,?,?,?,?,?,?)";
                        break;
                    case "2nd Year":

                        query = "insert into Student_Information2 (Student_Name, Father_Name, Mother_Name, Gender, Roll_Number, Cyear, Course_Name)values(?,?,?,?,?,?,?)";
                        break;
                    case "3rd Year":

                        query = "insert into Student_Information3 (Student_Name, Father_Name, Mother_Name, Gender, Roll_Number, Cyear, Course_Name)values(?,?,?,?,?,?,?)";
                        break;
                    default:

                        query = "insert into Student_Information1 (Student_Name, Father_Name, Mother_Name, Gender, Roll_Number, Cyear, Course_Name)values(?,?,?,?,?,?,?)";
                        break;
                };
                PreparedStatement ptst = ClassLoadingAndConnectivity.con.prepareStatement(query);
                ptst.setString(1, Name);
                ptst.setString(2, Father);
                ptst.setString(3, Mother);
                ptst.setString(4, Gender);
                ptst.setString(5, Roll_Number);
                ptst.setString(6, Year);
                ptst.setString(7, Course);
                ptst.executeUpdate();
                ptst.close();
                JOptionPane.showMessageDialog(null, "Data has Insered Succesfully");

                seeData();
                rnAutoIncreament();
                forEmpty();

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Roll Number Already Exist");
                tf_RollNumber_01.setText("");
                forEmpty();
            }
        } else {
            if (!(Roll_Number.matches("[0-9]+"))) {
                JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                tf_RollNumber_01.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
            }
        }
    }

    private void updateButton_05ActionPerformed(java.awt.event.ActionEvent evt) {

        String Course = (String) cb_courseName_01.getSelectedItem();
        String Year = (String) cb_year_02.getSelectedItem();
        String Roll_Number = tf_RollNumber_01.getText();
        String Name = tf_studentName_02.getText();
        String Father = tf_fatherName_03.getText();
        String Mother = tf_motherName_04.getText();
        String Gender = (String) cb_genderr_03.getSelectedItem();
        if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !(Name.isEmpty()) && !(Father.isEmpty())
                && !(Mother.isEmpty())) {
            try {
                ClassLoadingAndConnectivity.loadAndConnect();

                String query = "";

                switch (Year) {
                    case "1st Year":
                        query = "Update Student_Information1 set Student_Name=?,Father_Name=?,Mother_Name=?,Gender=? ,Roll_Number=?,Cyear=?,Course_Name=? where Roll_Number=?";
                        break;

                    case "2nd Year":
                        query = "Update Student_Information2 set Student_Name=?,Father_Name=?,Mother_Name=?,Gender=? ,Roll_Number=?,Cyear=?,Course_Name=? where Roll_Number=?";
                        break;

                    case "3rd Year":
                        query = "Update Student_Information3 set Student_Name=?,Father_Name=?,Mother_Name=?,Gender=? ,Roll_Number=?,Cyear=?,Course_Name=? where Roll_Number=?";
                        break;

                    default:
                        query = "Update Student_Information1 set Student_Name=?,Father_Name=?,Mother_Name=?,Gender=? ,Roll_Number=?,Cyear=?,Course_Name=? where Roll_Number=?";
                        break;

                };
                PreparedStatement ptst = ClassLoadingAndConnectivity.con.prepareStatement(query);

                ptst.setString(1, Name);
                ptst.setString(2, Father);
                ptst.setString(3, Mother);
                ptst.setString(4, Gender);
                ptst.setString(5, Roll_Number);
                ptst.setString(6, Year);
                ptst.setString(7, Course);
                ptst.setString(8, Roll_Number);
                ptst.executeUpdate();
                ptst.close();
                JOptionPane.showMessageDialog(null, "Data has Updated Succesfully");
                seeData();
                rnAutoIncreament();
                forEmpty();

            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                forEmpty();
                tf_RollNumber_01.setText("");

            }

        } else {
            if (!(Roll_Number.matches("[0-9]+"))) {
                JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                tf_RollNumber_01.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
            }
        }
    }

    private void deleteButton_05ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!deleteButton_05.getText().equals("Delete")) {
            return;
        }
        String Year = (String) cb_year_02.getSelectedItem();
        String Roll_Number = tf_RollNumber_01.getText();
        String Student_Name = tf_RollNumber_01.getText();
        if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty())) {
            String query = "";

            switch (Year) {
                case "1st Year":
                    query = "Delete from Student_Information1 where Roll_Number=? or Student_Name=?";
                    break;
                case "2nd Year":
                    query = "Delete from Student_Information2 where Roll_Number=? or Student_Name=?";
                    break;
                case "3rd Year":
                    query = "Delete from Student_Information3 where Roll_Number=? or Student_Name=?";
                    break;
                default:
                    query = "Delete frzom Student_Information1 where Roll_Number=? or Student_Name=?";
                    break;
            }
            ;
            try {
                ClassLoadingAndConnectivity.loadAndConnect();
                PreparedStatement ptst = ClassLoadingAndConnectivity.con.prepareStatement(query);
                ptst.setString(1, Roll_Number);
                ptst.setString(2, Student_Name);
                ptst.executeUpdate();
                ptst.close();
                JOptionPane.showMessageDialog(null, "Data has Deleted Succesfully");

                seeData();
                rnAutoIncreament();
                forEmpty();

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Data not Exist in Database");
                forEmpty();
                tf_RollNumber_01.setText("");
            }
        } else {
            if (!(Roll_Number.matches("[0-9]+"))) {
                JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                tf_RollNumber_01.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
            }
        }
    }

    private void cb_year_02ActionPerformed(java.awt.event.ActionEvent evt) {
        String year = (String) cb_year_02.getSelectedItem();

        switch (year) {
            case "1st Year":
                tp_AllYear_01.setSelectedIndex(0);
                break;

            case "2nd Year":
                tp_AllYear_01.setSelectedIndex(1);
                break;

            case "3rd Year":
                tp_AllYear_01.setSelectedIndex(2);
                break;

            default:
                tp_AllYear_01.setSelectedIndex(0);
                break;
        };
        seeData();
        rnAutoIncreament();
    }

    private void t_All_MouseClick(int i, DefaultTableModel model) {
        tf_studentName_02.setText(model.getValueAt(i, 0).toString());
        tf_fatherName_03.setText(model.getValueAt(i, 1).toString());
        tf_motherName_04.setText(model.getValueAt(i, 2).toString());

        String gen = model.getValueAt(i, 3).toString();
        if (gen.equals("Male")) {
            cb_genderr_03.setSelectedItem(true);
        } else {

            cb_genderr_03.setSelectedItem(true);
        }
        tf_RollNumber_01.setText(model.getValueAt(i, 4).toString());

        String year_ = model.getValueAt(i, 5).toString();
        if (year_.equals("1st Year")) {
            cb_year_02.setSelectedItem(true);
        } else if (year_.equals("2nd Year")) {

            cb_year_02.setSelectedItem(true);
        } else {
            cb_year_02.setSelectedItem(true);
        }

        String cName = model.getValueAt(i, 6).toString();
        if (cName.equals("BCA")) {
            cb_courseName_01.setSelectedItem(true);
        } else {
            cb_courseName_01.setSelectedItem(true);
        }
    }

    private int getRollNumberColumnIndex(DefaultTableModel model) {
        for (int i = 0; i < model.getColumnCount(); i++) {
            String columnName = model.getColumnName(i);
            if (columnName.equals("Student Name")) {
                return i;
            }
        }
        return -1;
    }

    private void t_StudentInfo_01MouseClicked(java.awt.event.MouseEvent evt) {
        //     String rollNumber = tf_Searchbar_01.getText();
        String Name = tf_Searchbar_01.getText();
        DefaultTableModel model = (DefaultTableModel) t_StudentInfo_01.getModel();

        int rollNumberColumnIndex = getRollNumberColumnIndex(model);

        int matchingRowIndex = -1;

        if (rollNumberColumnIndex != -1) {
            for (int row = 0; row < model.getRowCount(); row++) {
                String forColumnMatch = model.getValueAt(row, rollNumberColumnIndex).toString();
                if (forColumnMatch.equalsIgnoreCase(Name)) {
                    matchingRowIndex = row;
                    break;
                }
            }
        }

        if (matchingRowIndex != -1) {
            t_All_MouseClick(matchingRowIndex, model);
        } else {
            int i = t_StudentInfo_01.getSelectedRow();
            t_All_MouseClick(i, model);
        }
        tf_Searchbar_01.setText("");
    }

    private void t_StudentInfo_2MouseClicked(java.awt.event.MouseEvent evt) {
        //   String rollNumber = tf_Searchbar_01.getText();
        String Name = tf_Searchbar_01.getText();
        DefaultTableModel model = (DefaultTableModel) t_StudentInfo_2.getModel();

        int rollNumberColumnIndex = getRollNumberColumnIndex(model);

        int matchingRowIndex = -1;

        if (rollNumberColumnIndex != -1) {
            for (int row = 0; row < model.getRowCount(); row++) {
                String forColumnMatch = model.getValueAt(row, rollNumberColumnIndex).toString();
                if (forColumnMatch.equalsIgnoreCase(Name)) {
                    matchingRowIndex = row;
                    break;
                }
            }
        }

        if (matchingRowIndex != -1) {
            t_All_MouseClick(matchingRowIndex, model);
        } else {
            int i = t_StudentInfo_2.getSelectedRow();
            t_All_MouseClick(i, model);
        }
        tf_Searchbar_01.setText("");
    }

    private void t_StudentInfo_3MouseClicked(java.awt.event.MouseEvent evt) {

        //   String rollNumber = tf_Searchbar_01.getText();
        String Name = tf_Searchbar_01.getText();

        DefaultTableModel model = (DefaultTableModel) t_StudentInfo_3.getModel();

        int rollNumberColumnIndex = getRollNumberColumnIndex(model);

        int matchingRowIndex = -1;

        if (rollNumberColumnIndex != -1) {
            for (int row = 0; row < model.getRowCount(); row++) {
                String forColumnMatch = model.getValueAt(row, rollNumberColumnIndex).toString();
                if (forColumnMatch.equalsIgnoreCase(Name)) {
                    matchingRowIndex = row;
                    break;
                }
            }
        }

        if (matchingRowIndex != -1) {
            t_All_MouseClick(matchingRowIndex, model);
        } else {
            int i = t_StudentInfo_3.getSelectedRow();
            t_All_MouseClick(i, model);
        }
        tf_Searchbar_01.setText("");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Data_UID.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton_01;
    private javax.swing.JButton Student_Marks_Button_02;
    private javax.swing.JButton backButton_04;
    private javax.swing.JComboBox<String> cb_courseName_01;
    private javax.swing.JComboBox<String> cb_genderr_03;
    private javax.swing.JComboBox<String> cb_year_02;
    private javax.swing.JLabel courseName_02;
    private javax.swing.JButton deleteButton_05;
    private javax.swing.JLabel fatherName_06;
    private javax.swing.JLabel genderr_08;
    private javax.swing.JButton insertButton_05;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel motherName_07;
    private javax.swing.JButton refreshButton_01;
    private javax.swing.JLabel rollNumber_04;
    private javax.swing.JLabel studentName_05;
    private javax.swing.JTable t_StudentInfo_01;
    private javax.swing.JTable t_StudentInfo_2;
    private javax.swing.JTable t_StudentInfo_3;
    private javax.swing.JTextField tf_RollNumber_01;
    private javax.swing.JTextField tf_Searchbar_01;
    private javax.swing.JTextField tf_fatherName_03;
    private javax.swing.JTextField tf_motherName_04;
    private javax.swing.JTextField tf_studentName_02;
    private javax.swing.JTabbedPane tp_AllYear_01;
    private javax.swing.JButton updateButton_05;
    private javax.swing.JLabel year_03;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        @Override
        public void run() {
            new Student_Data_UID().setVisible(true);
        }
    }
}
