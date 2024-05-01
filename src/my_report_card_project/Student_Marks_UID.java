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
public class Student_Marks_UID extends javax.swing.JFrame {

    int count1 = 0;
    int count2 = 0;
    int count3 = 0;

    PreparedStatement ptst;
    ResultSet rt;
    String Roll_Number;
    DefaultTableModel table1;
    DefaultTableModel table2;
    DefaultTableModel table3;

    public Student_Marks_UID() {
        initComponents();

        String Year = cb_year_01.getSelectedItem().toString();
        selectYear(Year);
        seeData();

    }

    private void forEmpty() {

        tf_subject1_02.setText("");
        tf_subject2_03.setText("");
        tf_subject3_04.setText("");
        tf_subject4_05.setText("");
        tf_subject5_06.setText("");
        tf_subject6_07.setText("");
        tf_subject7_08.setText("");
        tf_subject8_09.setText("");
        tf_subject9_10.setText("");
    }

    private void selectYear(String year) {

        if (year.equals("1st Year")) {
            subject1_03.setText("Hindi");
            subject2_04.setText("English");
            subject3_05.setText("Mathematics");
            subject4_06.setText("Web_Designing");
            subject5_07.setText("Yoga");
            subject6_08.setText("Operating_System");
            subject7_09.setText("Community_Eng");
            subject8_10.setText("Enviroment");
            subject9_11.setText("Computer_Fundamental");

        } else if (year.equals("2nd Year")) {
            subject1_03.setText("Hindi");
            subject2_04.setText("English");
            subject3_05.setText("Women_Empower");
            subject4_06.setText("Enterpreneurship");
            subject5_07.setText("DBMS");
            subject6_08.setText("DCCN");
            subject7_09.setText("mySql");
            subject8_10.setText("java");
            subject9_11.setText("Php_Language");

        } else if (year.equals("3rd Year")) {
            subject1_03.setText("Hindi");
            subject2_04.setText("English");
            subject3_05.setText("Computer_Graphics");
            subject4_06.setText("Python");
            subject5_07.setText("Cloud_Computing");
            subject6_08.setText("Mysql");
            subject7_09.setText("Cyber_Security");
            subject8_10.setText("Web_Designing");
            subject9_11.setText("Personality Devlop");
        } else {
//            subject1_03.setText("Hindi");
//            subject2_04.setText("English");
//            subject3_05.setText("Mathematics");
//            subject4_06.setText("Web_Designing");
//            subject5_07.setText("Yoga");
//            subject6_08.setText("Operating_System");
//            subject7_09.setText("Community_Eng");
//            subject8_10.setText("Enviroment");
//            subject9_11.setText("Computer_Fundamental");

        }

    }

    private void seeData() {

        Statement st;
        ResultSet rs;
        try {
            ClassLoadingAndConnectivity.loadAndConnect();
            String Year = (String) cb_year_01.getSelectedItem();

            String query = "";

            switch (Year) {

                case "1st Year":
                    if (!(count1 == 0)) {
                        table1.setRowCount(0);
                    } else {
                        count1++;
                    }
                    query = "select * from Student_Results1";
                    st = ClassLoadingAndConnectivity.con.createStatement();
                    rs = st.executeQuery(query);
                    if (table1 == null) {
                        table1 = (DefaultTableModel) t_1stYearMarks_01.getModel();
                    }
                    while (rs.next()) {
                        Vector StudentMarksList = new Vector();
                        StudentMarksList.add(rs.getString("Roll_Num"));

                        StudentMarksList.add(String.valueOf(rs.getInt("Hindi")));
                        StudentMarksList.add(String.valueOf(rs.getInt("English")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Mathematics")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Web_Designing")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Yoga")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Operating_System")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Community_Eng")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Enviroment")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Computer_Fundamental")));

                        table1.addRow(StudentMarksList);
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
                    query = "select * from Student_Results2 ";
                    st = ClassLoadingAndConnectivity.con.createStatement();
                    rs = st.executeQuery(query);
                    if (table2 == null) {
                        table2 = (DefaultTableModel) t_2ndYearMarks_02.getModel();
                    }
                    while (rs.next()) {
                        Vector StudentMarksList = new Vector();
                        StudentMarksList.add(rs.getString("Roll_Num"));
                        StudentMarksList.add(String.valueOf(rs.getInt("Hindi")));
                        StudentMarksList.add(String.valueOf(rs.getInt("English")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Women_Empowerment")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Entrepreneurship")));
                        StudentMarksList.add(String.valueOf(rs.getInt("DBMS")));
                        StudentMarksList.add(String.valueOf(rs.getInt("DCCN")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Mysql")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Java_Language")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Php_Language")));

                        table2.addRow(StudentMarksList);
                    }

                    st.close();
                    rs.close();
                    break;

                case "3rd Year":

                    query = "select * from Student_Results3";
                    if (!(count3 == 0)) {
                        table3.setRowCount(0);
                    } else {
                        count3++;
                    }
                    st = ClassLoadingAndConnectivity.con.createStatement();
                    rs = st.executeQuery(query);
                    if (table3 == null) {
                        table3 = (DefaultTableModel) t_3rdYearMarks_03.getModel();
                    }
                    while (rs.next()) {

                        Vector StudentMarksList = new Vector();
                        StudentMarksList.add(rs.getString("Roll_Num"));
                        StudentMarksList.add(String.valueOf(rs.getInt("Hindi")));
                        StudentMarksList.add(String.valueOf(rs.getInt("English")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Computer_Graphics")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Python")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Cloud_Computing")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Mysql")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Cyber_Security")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Web_Designing")));
                        StudentMarksList.add(String.valueOf(rs.getInt("Personality_Development")));

                        table3.addRow(StudentMarksList);
                    }

                    st.close();
                    rs.close();

                    break;

                default:
                    table1 = (DefaultTableModel) t_1stYearMarks_01.getModel();
                    break;
            };
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection error");
        }
    }

    private void search(String str) {
        String Year = (String) cb_year_01.getSelectedItem();
        TableRowSorter<DefaultTableModel> trs;

        switch (Year) {

            case "1st  Year":

                table1 = (DefaultTableModel) t_1stYearMarks_01.getModel();
                trs = new TableRowSorter<>(table1);
                t_1stYearMarks_01.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(str));
                break;

            case "2nd Year":

                table2 = (DefaultTableModel) t_2ndYearMarks_02.getModel();
                trs = new TableRowSorter<>(table2);
                t_2ndYearMarks_02.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(str));

                break;

            case "3rd Year":

                table3 = (DefaultTableModel) t_3rdYearMarks_03.getModel();
                trs = new TableRowSorter<>(table3);
                t_3rdYearMarks_03.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(str));
                break;

            default:
                table1 = (DefaultTableModel) t_1stYearMarks_01.getModel();
                trs = new TableRowSorter<>(table1);
                t_1stYearMarks_01.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(str));
                break;
        }
    }

    private void rnAutoIncreament() {
        String Year = (String) cb_year_01.getSelectedItem();

        try {
            PreparedStatement ptst;
            ResultSet rt;
            ClassLoadingAndConnectivity.loadAndConnect();

            String query;

            switch (Year) {

                case "1st  Year":

                    query = "SELECT Roll_Num from Student_Results1 order by Roll_Num desc limit 1";
                    ptst = ClassLoadingAndConnectivity.con.prepareStatement(query);
                    rt = ptst.executeQuery();
                    if (rt.next()) {
                        String Roll_Number = rt.getString(1);
                        int roll = Integer.parseInt(Roll_Number);
                        int roll_Num = roll + 1;
                        if (Year.equals("1st Year")) {
                            tf_Roll_Number_01.setText(Integer.toString(roll_Num));
                            System.out.println("done");
                        }
                    }
                    break;

                case "2nd Year":

                    query = "SELECT Roll_Num from Student_Results2 order by Roll_Num desc limit 1";
                    ptst = ClassLoadingAndConnectivity.con.prepareStatement(query);
                    rt = ptst.executeQuery();
                    if (rt.next()) {
                        String Roll_Number = rt.getString(1);
                        int roll = Integer.parseInt(Roll_Number);
                        int roll_Num = roll + 1;
                        tf_Roll_Number_01.setText(Integer.toString(roll_Num));
                        System.out.println("done");
                    }
                    break;

                case "3rd Year":

                    query = "SELECT Roll_Num from Student_Results3 order by Roll_Num desc limit 1";
                    ptst = ClassLoadingAndConnectivity.con.prepareStatement(query);
                    rt = ptst.executeQuery();
                    if (rt.next()) {
                        String Roll_Number = "";
                        Roll_Number = rt.getString(1);
                        int roll = Integer.parseInt(Roll_Number);
                        int roll_Num = roll + 1;
                        tf_Roll_Number_01.setText(Integer.toString(roll_Num));
                    }
                    break;

                default:
                    query = "SELECT Roll_Num from Student_Results1 order by Roll_Num desc limit 1";
                    ptst = ClassLoadingAndConnectivity.con.prepareStatement(query);
                    rt = ptst.executeQuery();
                    if (rt.next()) {
                        String Roll_Number = rt.getString(1);
                        int roll = Integer.parseInt(Roll_Number);
                        int roll_Num = roll + 1;
                        if (Year.equals("1st Year")) {
                            tf_Roll_Number_01.setText(Integer.toString(roll_Num));
                            System.out.println("done");
                        }
                    }
                    break;
            };

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_insertMarks_01 = new javax.swing.JPanel();
        collageLogo_01 = new javax.swing.JLabel();
        Roll_Number_02 = new javax.swing.JLabel();
        subject1_03 = new javax.swing.JLabel();
        subject2_04 = new javax.swing.JLabel();
        subject3_05 = new javax.swing.JLabel();
        subject4_06 = new javax.swing.JLabel();
        subject5_07 = new javax.swing.JLabel();
        subject6_08 = new javax.swing.JLabel();
        subject7_09 = new javax.swing.JLabel();
        subject8_10 = new javax.swing.JLabel();
        subject9_11 = new javax.swing.JLabel();
        tf_Roll_Number_01 = new javax.swing.JTextField();
        tf_subject1_02 = new javax.swing.JTextField();
        tf_subject2_03 = new javax.swing.JTextField();
        tf_subject3_04 = new javax.swing.JTextField();
        tf_subject4_05 = new javax.swing.JTextField();
        tf_subject5_06 = new javax.swing.JTextField();
        tf_subject6_07 = new javax.swing.JTextField();
        tf_subject7_08 = new javax.swing.JTextField();
        tf_subject8_09 = new javax.swing.JTextField();
        tf_subject9_10 = new javax.swing.JTextField();
        insertButton_01 = new javax.swing.JButton();
        backButton_02 = new javax.swing.JButton();
        year_02 = new javax.swing.JLabel();
        cb_year_01 = new javax.swing.JComboBox<>();
        updateButton_03 = new javax.swing.JButton();
        deleteButton_04 = new javax.swing.JButton();
        refreshButton_01 = new javax.swing.JButton();
        tf_Searchbar_01 = new javax.swing.JTextField();
        searchButton_01 = new javax.swing.JButton();
        tp_AllStudentMarks_01 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_1stYearMarks_01 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_2ndYearMarks_02 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_3rdYearMarks_03 = new javax.swing.JTable();
        Student_data_Button_02 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p_insertMarks_01.setBackground(new java.awt.Color(0, 102, 102));
        p_insertMarks_01.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        collageLogo_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/1595483733332-removebg-preview200.png"))); // NOI18N
        p_insertMarks_01.add(collageLogo_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        Roll_Number_02.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Roll_Number_02.setText("Roll Number");
        p_insertMarks_01.add(Roll_Number_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 169, 124, -1));

        subject1_03.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject1_03.setText("Hindi");
        p_insertMarks_01.add(subject1_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 203, 124, -1));

        subject2_04.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject2_04.setText("English");
        p_insertMarks_01.add(subject2_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 237, 124, -1));

        subject3_05.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject3_05.setText("Women Empower.");
        p_insertMarks_01.add(subject3_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 271, -1, -1));

        subject4_06.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject4_06.setText("Enterpreneurship");
        p_insertMarks_01.add(subject4_06, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 305, 124, -1));

        subject5_07.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject5_07.setText("DBMS");
        p_insertMarks_01.add(subject5_07, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 339, 124, -1));

        subject6_08.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject6_08.setText("DCCN");
        p_insertMarks_01.add(subject6_08, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 373, 124, -1));

        subject7_09.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject7_09.setText("MySql");
        p_insertMarks_01.add(subject7_09, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 407, 124, -1));

        subject8_10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject8_10.setText("Java");
        p_insertMarks_01.add(subject8_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 441, 124, -1));

        subject9_11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subject9_11.setText("Php Language");
        p_insertMarks_01.add(subject9_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 475, 124, -1));

        tf_Roll_Number_01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_Roll_Number_01KeyReleased(evt);
            }
        });
        p_insertMarks_01.add(tf_Roll_Number_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 169, 180, -1));
        p_insertMarks_01.add(tf_subject1_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 203, 180, -1));
        p_insertMarks_01.add(tf_subject2_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 237, 180, -1));
        p_insertMarks_01.add(tf_subject3_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 271, 180, -1));
        p_insertMarks_01.add(tf_subject4_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 305, 180, -1));
        p_insertMarks_01.add(tf_subject5_06, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 339, 180, -1));
        p_insertMarks_01.add(tf_subject6_07, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 373, 180, -1));
        p_insertMarks_01.add(tf_subject7_08, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 407, 180, -1));
        p_insertMarks_01.add(tf_subject8_09, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 441, 180, -1));
        p_insertMarks_01.add(tf_subject9_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 475, 180, -1));

        insertButton_01.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        insertButton_01.setText("Insert");
        insertButton_01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButton_01ActionPerformed(evt);
            }
        });
        p_insertMarks_01.add(insertButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 70, 30));

        backButton_02.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        backButton_02.setText("Back");
        backButton_02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton_02ActionPerformed(evt);
            }
        });
        p_insertMarks_01.add(backButton_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 70, 30));

        year_02.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        year_02.setText(" Year");
        p_insertMarks_01.add(year_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, -1));

        cb_year_01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "1st Year", "2nd Year", "3rd Year" }));
        cb_year_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_year_01ActionPerformed(evt);
            }
        });
        p_insertMarks_01.add(cb_year_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 180, -1));

        updateButton_03.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        updateButton_03.setText("Update");
        updateButton_03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton_03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton_03ActionPerformed(evt);
            }
        });
        p_insertMarks_01.add(updateButton_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 70, 30));

        deleteButton_04.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton_04.setText("Delete");
        deleteButton_04.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton_04ActionPerformed(evt);
            }
        });
        p_insertMarks_01.add(deleteButton_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 70, 30));

        refreshButton_01.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        refreshButton_01.setForeground(new java.awt.Color(0, 0, 0));
        refreshButton_01.setText("Refresh");
        refreshButton_01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        refreshButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton_01ActionPerformed(evt);
            }
        });
        p_insertMarks_01.add(refreshButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 70, 30));

        tf_Searchbar_01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_Searchbar_01KeyReleased(evt);
            }
        });
        p_insertMarks_01.add(tf_Searchbar_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 230, 30));

        searchButton_01.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        searchButton_01.setText("Search");
        searchButton_01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton_01ActionPerformed(evt);
            }
        });
        p_insertMarks_01.add(searchButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 70, 30));

        tp_AllStudentMarks_01.setBackground(new java.awt.Color(51, 51, 51));
        tp_AllStudentMarks_01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tp_AllStudentMarks_01.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_1stYearMarks_01.setBackground(new java.awt.Color(51, 51, 51));
        t_1stYearMarks_01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t_1stYearMarks_01.setForeground(new java.awt.Color(255, 255, 255));
        t_1stYearMarks_01.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll Number", "Hindi", "English", "Mathematics", "Web Designing", "Yoga", "Operating Sys.", "Community Eng.", "Enviroment", "Computer Funda."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_1stYearMarks_01.getTableHeader().setReorderingAllowed(false);
        t_1stYearMarks_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_1stYearMarks_01MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_1stYearMarks_01);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 560));

        tp_AllStudentMarks_01.addTab("1st Year", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_2ndYearMarks_02.setBackground(new java.awt.Color(51, 51, 51));
        t_2ndYearMarks_02.setForeground(new java.awt.Color(255, 255, 255));
        t_2ndYearMarks_02.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll Number", "Hindi", "English", "Women Empower.", "Enterpreneurship", "DBMS", "DCCN", "MySql", "Java", "PHP Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_2ndYearMarks_02.getTableHeader().setReorderingAllowed(false);
        t_2ndYearMarks_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_2ndYearMarks_02MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(t_2ndYearMarks_02);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 580));

        tp_AllStudentMarks_01.addTab("2nd Year", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_3rdYearMarks_03.setBackground(new java.awt.Color(51, 51, 51));
        t_3rdYearMarks_03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t_3rdYearMarks_03.setForeground(new java.awt.Color(255, 255, 255));
        t_3rdYearMarks_03.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll Number", "Hindi", "English", "Computer Graphics", "Python", "Cloud Computing", "Mysql", "Cyber Security", "Web Designing", "Personality Devlopment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_3rdYearMarks_03.getTableHeader().setReorderingAllowed(false);
        t_3rdYearMarks_03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_3rdYearMarks_03MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(t_3rdYearMarks_03);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 580));

        tp_AllStudentMarks_01.addTab("3rd Year", jPanel5);

        Student_data_Button_02.setBackground(new java.awt.Color(0, 102, 102));
        Student_data_Button_02.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Student_data_Button_02.setForeground(new java.awt.Color(255, 255, 255));
        Student_data_Button_02.setText("Student_Data_UID");
        Student_data_Button_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_data_Button_02ActionPerformed(evt);
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
                        .addComponent(p_insertMarks_01, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Student_data_Button_02, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tp_AllStudentMarks_01, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tp_AllStudentMarks_01, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Student_data_Button_02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p_insertMarks_01, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButton_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton_02ActionPerformed
        setVisible(false);
        new Admin_Management().setVisible(true);
    }//GEN-LAST:event_backButton_02ActionPerformed

    private void insertButton_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButton_01ActionPerformed
        String Year = cb_year_01.getSelectedItem().toString();
        switch (Year) {
            case "1st Year":
                Roll_Number = tf_Roll_Number_01.getText();
                int Hindi = Integer.parseInt(tf_subject1_02.getText());
                int English = Integer.parseInt(tf_subject2_03.getText());
                int Mathematics = Integer.parseInt(tf_subject3_04.getText());
                int Web_Designing = Integer.parseInt(tf_subject4_05.getText());
                int Yoga = Integer.parseInt(tf_subject5_06.getText());
                int Operating_System = Integer.parseInt(tf_subject6_07.getText());
                int Community_Eng = Integer.parseInt(tf_subject7_08.getText());
                int Enviroment = Integer.parseInt(tf_subject8_09.getText());
                int Computer_Funda = Integer.parseInt(tf_subject9_10.getText());
                System.out.println("1");
                if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !((tf_subject1_02.getText()).isEmpty()) && !(tf_subject2_03.getText().isEmpty()) && !(tf_subject3_04.getText().isEmpty()) && !(tf_subject4_05.getText().isEmpty()) && !(tf_subject5_06.getText().isEmpty()) && !(tf_subject6_07.getText().isEmpty()) && !(tf_subject7_08.getText().isEmpty()) && !(tf_subject8_09.getText().isEmpty()) && !(tf_subject9_10.getText().isEmpty())) {
                    System.out.println("2");
                    try {
                        System.out.println("3");
                        ClassLoadingAndConnectivity.loadAndConnect();
                        Statement st = ClassLoadingAndConnectivity.con.createStatement();
                        String query1 = "insert into student_results1 (Roll_Num,Hindi,English,Mathematics,Web_Designing,Yoga,Operating_System,Community_Eng,Enviroment,Computer_Fundamental)values(?,?,?,?,?,?,?,?,?,?)";
                        rt = st.executeQuery("Select * from Student_results1 where Roll_Num = '" + Roll_Number + "'");
                        ptst = ClassLoadingAndConnectivity.con.prepareStatement(query1);
                        ptst.setString(1, Roll_Number);
                        if ((Hindi <= 75 && Hindi >= 0) && (English <= 75 && English >= 0) && (Mathematics <= 75 && Mathematics >= 0) && (Web_Designing <= 75 && Web_Designing >= 0) && (Yoga <= 75 && Yoga >= 0) && (Operating_System <= 75 && Operating_System >= 0) && (Community_Eng <= 75 && Community_Eng >= 0) && (Enviroment <= 75 && Enviroment >= 0) && (Computer_Funda <= 75 && Computer_Funda >= 0)) {
                            ptst.setInt(2, Hindi);
                            ptst.setInt(3, English);
                            ptst.setInt(4, Mathematics);
                            ptst.setInt(5, Web_Designing);
                            ptst.setInt(6, Yoga);
                            ptst.setInt(7, Operating_System);
                            ptst.setInt(8, Community_Eng);
                            ptst.setInt(9, Enviroment);
                            ptst.setInt(10, Computer_Funda);
                        }
                        ptst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Result has Inserted Succesfully");

                        seeData();
                        rnAutoIncreament();
                        forEmpty();

//                        setVisible(false);
//                        new Insert_Marks().setVisible(true);
                        ptst.close();
                    } catch (SQLException | ClassNotFoundException e) {
                        try {
                            if (!(rt.next())) {
                                if ((Hindi <= 75 && Hindi >= 0) && (English <= 75 && English >= 0) && (Mathematics <= 75 && Mathematics >= 0) && (Web_Designing <= 75 && Web_Designing >= 0) && (Yoga <= 75 && Yoga >= 0) && (Operating_System <= 75 && Operating_System >= 0) && (Community_Eng <= 75 && Community_Eng >= 0) && (Enviroment <= 75 && Enviroment >= 0) && (Computer_Funda <= 75 && Computer_Funda >= 0)) {
                                    JOptionPane.showMessageDialog(null, "Roll Number Does not Exist Our Database");
                                    tf_Roll_Number_01.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Your marks is not under ----> 75 ");
                                    if (Hindi > 75) {
                                        tf_subject1_02.setText("");
                                    }
                                    if (English > 75) {
                                        tf_subject2_03.setText("");
                                    }
                                    if (Mathematics > 75) {
                                        tf_subject2_03.setText("");
                                    }
                                    if (Web_Designing > 75) {
                                        tf_subject3_04.setText("");
                                    }
                                    if (Yoga > 75) {
                                        tf_subject4_05.setText("");
                                    }
                                    if (Operating_System > 75) {
                                        tf_subject5_06.setText("");
                                    }
                                    if (Community_Eng > 75) {
                                        tf_subject6_07.setText("");
                                    }
                                    if (Enviroment > 75) {
                                        tf_subject7_08.setText("");
                                    }
                                    if (Computer_Funda > 75) {
                                        tf_subject8_09.setText("");
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Roll_Number Already Exsists");
                                tf_Roll_Number_01.setText("");

                            }
                        } catch (SQLException e1) {
                            JOptionPane.showMessageDialog(null, e1.getMessage());
                        }
                    }

                } else {
                    if (!(Roll_Number.matches("[0-9]+"))) {
                        JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
                    }
                }

                break;

            case "2nd Year":

                Roll_Number = tf_Roll_Number_01.getText();
                int Hindi2 = Integer.parseInt(tf_subject1_02.getText());
                int English2 = Integer.parseInt(tf_subject2_03.getText());
                int Women_Empowerment = Integer.parseInt(tf_subject3_04.getText());
                int Entrepreneurship = Integer.parseInt(tf_subject4_05.getText());
                int DBMS = Integer.parseInt(tf_subject5_06.getText());
                int DCCN = Integer.parseInt(tf_subject6_07.getText());
                int Mysql = Integer.parseInt(tf_subject7_08.getText());
                int Java_Language = Integer.parseInt(tf_subject8_09.getText());
                int Php_Language = Integer.parseInt(tf_subject9_10.getText());
                if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !((tf_subject1_02.getText()).isEmpty()) && !(tf_subject2_03.getText().isEmpty()) && !(tf_subject3_04.getText().isEmpty()) && !(tf_subject4_05.getText().isEmpty()) && !(tf_subject5_06.getText().isEmpty()) && !(tf_subject6_07.getText().isEmpty()) && !(tf_subject7_08.getText().isEmpty()) && !(tf_subject8_09.getText().isEmpty()) && !(tf_subject9_10.getText().isEmpty())) {

                    try {
                        ClassLoadingAndConnectivity.loadAndConnect();
                        Statement st = ClassLoadingAndConnectivity.con.createStatement();

                        String query1 = "insert into student_results2(Roll_Num, Hindi, English, Women_Empowerment, Entrepreneurship, DBMS, DCCN, Mysql, Java_Language, Php_Language)values(?,?,?,?,?,?,?,?,?,?)";
                        rt = st.executeQuery("Select * from Student_results2 where Roll_Num = '" + Roll_Number + "'");
                        ptst = ClassLoadingAndConnectivity.con.prepareStatement(query1);
                        ptst.setString(1, Roll_Number);
                        if ((Hindi2 <= 75 && Hindi2 >= 0) && (English2 <= 75 && English2 >= 0) && (Women_Empowerment <= 75 && Women_Empowerment >= 0) && (Entrepreneurship <= 75 && Entrepreneurship >= 0) && (DBMS <= 75 && DBMS >= 0) && (DCCN <= 75 && DCCN >= 0) && (Mysql <= 75 && Mysql >= 0) && (Java_Language <= 75 && Java_Language >= 0) && (Php_Language <= 75 && Php_Language >= 0)) {
                            ptst.setInt(2, Hindi2);
                            ptst.setInt(3, English2);
                            ptst.setInt(4, Women_Empowerment);
                            ptst.setInt(5, Entrepreneurship);
                            ptst.setInt(6, DBMS);
                            ptst.setInt(7, DCCN);
                            ptst.setInt(8, Mysql);
                            ptst.setInt(9, Java_Language);
                            ptst.setInt(10, Php_Language);
                        }
                        ptst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Result has Inserted Succesfully");

                        seeData();
                        rnAutoIncreament();
                        forEmpty();
//setVisible(false);
//                        new Insert_Marks().setVisible(true);
                        ptst.close();
                    } catch (SQLException | ClassNotFoundException e) {
                        try {
                            if (!(rt.next())) {
                                if ((Hindi2 <= 75 && Hindi2 >= 0) && (English2 <= 75 && English2 >= 0) && (Women_Empowerment <= 75 && Women_Empowerment >= 0) && (Entrepreneurship <= 75 && Entrepreneurship >= 0) && (DBMS <= 75 && DBMS >= 0) && (DCCN <= 75 && DCCN >= 0) && (Mysql <= 75 && Mysql >= 0) && (Java_Language <= 75 && Java_Language >= 0) && (Php_Language <= 75 && Php_Language >= 0)) {
                                    JOptionPane.showMessageDialog(null, "Roll Number Does not Exist Our Database");
//                                    setVisible(false);
//                                    new Insert_Marks().setVisible(true);
                                    tf_Roll_Number_01.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Your marks is not under ----> 75 ");
//                                    setVisible(false);
//                                    new Insert_Marks().setVisible(true);

                                    if (Hindi2 > 75) {
                                        tf_subject1_02.setText("");
                                    }
                                    if (English2 > 75) {
                                        tf_subject2_03.setText("");
                                    }
                                    if (Women_Empowerment > 75) {
                                        tf_subject2_03.setText("");
                                    }

                                    if (Entrepreneurship > 75) {
                                        tf_subject3_04.setText("");
                                    }
                                    if (DBMS > 75) {
                                        tf_subject4_05.setText("");
                                    }
                                    if (DCCN > 75) {
                                        tf_subject5_06.setText("");
                                    }
                                    if (Mysql > 75) {
                                        tf_subject6_07.setText("");
                                    }
                                    if (Java_Language > 75) {
                                        tf_subject7_08.setText("");
                                    }
                                    if (Php_Language > 75) {
                                        tf_subject8_09.setText("");
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Roll_Number Already Exsists");
                                tf_Roll_Number_01.setText("");
                            }
                        } catch (SQLException e1) {
                            JOptionPane.showMessageDialog(null, e1.getMessage());
                        }
                    }
                } else {
                    if (!(Roll_Number.matches("[0-9]+"))) {
                        JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                        tf_Roll_Number_01.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
                    }
                }
                break;

            case "3rd Year":

                Roll_Number = tf_Roll_Number_01.getText();
                int Hindi3 = Integer.parseInt(tf_subject1_02.getText());
                int English3 = Integer.parseInt(tf_subject2_03.getText());
                int Computer_Graphics = Integer.parseInt(tf_subject3_04.getText());
                int Python = Integer.parseInt(tf_subject4_05.getText());
                int Cloud_Computing = Integer.parseInt(tf_subject5_06.getText());
                int Mysql3 = Integer.parseInt(tf_subject7_08.getText());
                int Cyber_Security = Integer.parseInt(tf_subject8_09.getText());
                int Web_Designing3 = Integer.parseInt(tf_subject9_10.getText());
                int Personality_Development = Integer.parseInt(tf_subject9_10.getText());
                if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !((tf_subject1_02.getText()).isEmpty()) && !(tf_subject2_03.getText().isEmpty()) && !(tf_subject3_04.getText().isEmpty()) && !(tf_subject4_05.getText().isEmpty()) && !(tf_subject5_06.getText().isEmpty()) && !(tf_subject6_07.getText().isEmpty()) && !(tf_subject7_08.getText().isEmpty()) && !(tf_subject8_09.getText().isEmpty()) && !(tf_subject9_10.getText().isEmpty())) {

                    try {
                        ClassLoadingAndConnectivity.loadAndConnect();
                        Statement st = ClassLoadingAndConnectivity.con.createStatement();

                        String query1 = "insert into Student_results3(Roll_Num, Hindi, English, Computer_Graphics, Python, Cloud_Computing,  Mysql, Cyber_Security , Web_Designing,Personality_Development)values(?,?,?,?,?,?,?,?,?,?)";

                        rt = st.executeQuery("Select * from Student_results3 where Roll_Num = '" + Roll_Number + "'");

                        ptst = ClassLoadingAndConnectivity.con.prepareStatement(query1);

                        ptst.setString(1, Roll_Number);

                        if ((Hindi3 <= 75 && Hindi3 >= 0) && (English3 <= 75 && English3 >= 0) && (Computer_Graphics <= 75 && Computer_Graphics >= 0) && (Python <= 75 && Python >= 0) && (Cloud_Computing <= 75 && Cloud_Computing >= 0) && (Mysql3 <= 75 && Mysql3 >= 0) && (Cyber_Security <= 75 && Cyber_Security >= 0) && (Web_Designing3 <= 75 && Web_Designing3 >= 0) && (Personality_Development <= 75 && Personality_Development >= 0)) {

                            ptst.setInt(2, Hindi3);
                            ptst.setInt(3, English3);
                            ptst.setInt(4, Computer_Graphics);
                            ptst.setInt(5, Python);
                            ptst.setInt(6, Cloud_Computing);
                            ptst.setInt(7, Mysql3);
                            ptst.setInt(8, Cyber_Security);
                            ptst.setInt(9, Web_Designing3);
                            ptst.setInt(10, Personality_Development);
                        }

                        ptst.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Result has Inserted Succesfully");
                        seeData();
                        rnAutoIncreament();
                        forEmpty();

                        ptst.close();
                    } catch (SQLException | ClassNotFoundException e) {
                        try {
                            if (!(rt.next())) {
                                if ((Hindi3 <= 75 && Hindi3 >= 0) && (English3 <= 75 && English3 >= 0) && (Computer_Graphics <= 75 && Computer_Graphics >= 0) && (Python <= 75 && Python >= 0) && (Cloud_Computing <= 75 && Cloud_Computing >= 0) && (Mysql3 <= 75 && Mysql3 >= 0) && (Cyber_Security <= 75 && Cyber_Security >= 0) && (Web_Designing3 <= 75 && Web_Designing3 >= 0) && (Personality_Development <= 75 && Personality_Development >= 0)) {
                                    JOptionPane.showMessageDialog(null, "Roll Number Does not Exist Our Database");
                                    tf_Roll_Number_01.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Your marks is not under ----> 75 ");
                                    if (Hindi3 > 75) {
                                        tf_subject1_02.setText("");
                                    }
                                    if (English3 > 75) {
                                        tf_subject2_03.setText("");
                                    }
                                    if (Computer_Graphics > 75) {
                                        tf_subject2_03.setText("");
                                    }

                                    if (Python > 75) {
                                        tf_subject3_04.setText("");
                                    }
                                    if (Cloud_Computing > 75) {
                                        tf_subject4_05.setText("");
                                    }
                                    if (Mysql3 > 75) {
                                        tf_subject5_06.setText("");
                                    }
                                    if (Cyber_Security > 75) {
                                        tf_subject6_07.setText("");
                                    }
                                    if (Web_Designing3 > 75) {
                                        tf_subject7_08.setText("");
                                    }
                                    if (Personality_Development > 75) {
                                        tf_subject8_09.setText("");
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, " Roll_Number Already Exsists");
                                tf_Roll_Number_01.setText("");
                            }
                        } catch (SQLException e1) {
                            JOptionPane.showMessageDialog(null, e1.getMessage());
                        }
                    }

                } else {
                    if (!(Roll_Number.matches("[0-9]+"))) {
                        JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                        tf_Roll_Number_01.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
                    }
                }

                break;
            default:
                insertButton_01ActionPerformed(null);
                break;
        };

    }//GEN-LAST:event_insertButton_01ActionPerformed

    private void tf_Roll_Number_01KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_Roll_Number_01KeyReleased
        String searchrollnumber = tf_Roll_Number_01.getText();
        search(searchrollnumber);
    }//GEN-LAST:event_tf_Roll_Number_01KeyReleased

    private void cb_year_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_year_01ActionPerformed
        String Year = cb_year_01.getSelectedItem().toString();
        switch (Year) {
            case "1st Year":
                tp_AllStudentMarks_01.setSelectedIndex(0);
                break;

            case "2nd Year":
                tp_AllStudentMarks_01.setSelectedIndex(1);
                break;

            case "3rd Year":
                tp_AllStudentMarks_01.setSelectedIndex(2);
                break;
        }

        selectYear(Year);
        seeData();
        rnAutoIncreament();
    }//GEN-LAST:event_cb_year_01ActionPerformed

    private void updateButton_03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton_03ActionPerformed
        String Year = cb_year_01.getSelectedItem().toString();

        switch (Year) {

            case "1st Year":
                Roll_Number = tf_Roll_Number_01.getText();
                int Hindi = Integer.parseInt(tf_subject1_02.getText());
                int English = Integer.parseInt(tf_subject2_03.getText());
                int Mathematics = Integer.parseInt(tf_subject3_04.getText());
                int Web_Designing = Integer.parseInt(tf_subject4_05.getText());
                int Yoga = Integer.parseInt(tf_subject5_06.getText());
                int Operating_System = Integer.parseInt(tf_subject6_07.getText());
                int Community_Eng = Integer.parseInt(tf_subject7_08.getText());
                int Enviroment = Integer.parseInt(tf_subject8_09.getText());
                int Computer_Funda = Integer.parseInt(tf_subject9_10.getText());
                if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !((tf_subject1_02.getText()).isEmpty()) && !(tf_subject2_03.getText().isEmpty()) && !(tf_subject3_04.getText().isEmpty()) && !(tf_subject4_05.getText().isEmpty()) && !(tf_subject5_06.getText().isEmpty()) && !(tf_subject6_07.getText().isEmpty()) && !(tf_subject7_08.getText().isEmpty()) && !(tf_subject8_09.getText().isEmpty()) && !(tf_subject9_10.getText().isEmpty())) {

                    try {

                        ClassLoadingAndConnectivity.loadAndConnect();
                        Statement st = ClassLoadingAndConnectivity.con.createStatement();
                        String query1 = "update student_results1 set Roll_Num = ? ,Hindi = ? ,English=? ,Mathematics=? ,Web_Designing=?,Yoga=?,Operating_System=?,Community_Eng=?,Enviroment=?,Computer_Fundamental=? where Roll_Num=?";
                        rt = st.executeQuery("Select * from Student_results1 where Roll_Num = '" + Roll_Number + "'");
                        ptst = ClassLoadingAndConnectivity.con.prepareStatement(query1);
                        ptst.setString(1, Roll_Number);
                        if ((Hindi <= 75 && Hindi >= 0) && (English <= 75 && English >= 0) && (Mathematics <= 75 && Mathematics >= 0) && (Web_Designing <= 75 && Web_Designing >= 0) && (Yoga <= 75 && Yoga >= 0) && (Operating_System <= 75 && Operating_System >= 0) && (Community_Eng <= 75 && Community_Eng >= 0) && (Enviroment <= 75 && Enviroment >= 0) && (Computer_Funda <= 75 && Computer_Funda >= 0)) {

                            ptst.setInt(2, Hindi);
                            ptst.setInt(3, English);
                            ptst.setInt(4, Mathematics);
                            ptst.setInt(5, Web_Designing);
                            ptst.setInt(6, Yoga);
                            ptst.setInt(7, Operating_System);
                            ptst.setInt(8, Community_Eng);
                            ptst.setInt(9, Enviroment);
                            ptst.setInt(10, Computer_Funda);
                            ptst.setString(11, Roll_Number);

                        }
                        ptst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Result has Updated Succesfully");

                        seeData();
                        rnAutoIncreament();
                        forEmpty();

                        ptst.close();
                    } catch (SQLException | ClassNotFoundException e) {
                        try {
                            if ((rt.next())) {
                                if ((Hindi <= 75 && Hindi >= 0) && (English <= 75 && English >= 0) && (Mathematics <= 75 && Mathematics >= 0) && (Web_Designing <= 75 && Web_Designing >= 0) && (Yoga <= 75 && Yoga >= 0) && (Operating_System <= 75 && Operating_System >= 0) && (Community_Eng <= 75 && Community_Eng >= 0) && (Enviroment <= 75 && Enviroment >= 0) && (Computer_Funda <= 75 && Computer_Funda >= 0)) {
                                    JOptionPane.showMessageDialog(null, "Roll Number Does not Exist Our Database");
                                    tf_Roll_Number_01.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Your marks is not under ----> 75 ");
                                    if (Hindi > 75) {
                                        tf_subject1_02.setText("");
                                    }
                                    if (English > 75) {
                                        tf_subject2_03.setText("");
                                    }
                                    if (Mathematics > 75) {
                                        tf_subject2_03.setText("");
                                    }

                                    if (Web_Designing > 75) {
                                        tf_subject3_04.setText("");
                                    }
                                    if (Yoga > 75) {
                                        tf_subject4_05.setText("");
                                    }
                                    if (Operating_System > 75) {
                                        tf_subject5_06.setText("");
                                    }
                                    if (Community_Eng > 75) {
                                        tf_subject6_07.setText("");
                                    }
                                    if (Enviroment > 75) {
                                        tf_subject7_08.setText("");
                                    }
                                    if (Computer_Funda > 75) {
                                        tf_subject8_09.setText("");
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Roll_Number Already Exsists");
                                tf_Roll_Number_01.setText("");
                            }
                        } catch (SQLException e1) {
                            JOptionPane.showMessageDialog(null, e1.getMessage());
                        }
                    }
                } else {
                    if (!(Roll_Number.matches("[0-9]+"))) {
                        JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
                    }
                }
                break;

            case "2nd Year":
                Roll_Number = tf_Roll_Number_01.getText();
                int Hindi2 = Integer.parseInt(tf_subject1_02.getText());
                int English2 = Integer.parseInt(tf_subject2_03.getText());
                int Women_Empowerment = Integer.parseInt(tf_subject3_04.getText());
                int Entrepreneurship = Integer.parseInt(tf_subject4_05.getText());
                int DBMS = Integer.parseInt(tf_subject5_06.getText());
                int DCCN = Integer.parseInt(tf_subject6_07.getText());
                int Mysql = Integer.parseInt(tf_subject7_08.getText());
                int Java_Language = Integer.parseInt(tf_subject8_09.getText());
                int Php_Language = Integer.parseInt(tf_subject9_10.getText());
                if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !((tf_subject1_02.getText()).isEmpty()) && !(tf_subject2_03.getText().isEmpty()) && !(tf_subject3_04.getText().isEmpty()) && !(tf_subject4_05.getText().isEmpty()) && !(tf_subject5_06.getText().isEmpty()) && !(tf_subject6_07.getText().isEmpty()) && !(tf_subject7_08.getText().isEmpty()) && !(tf_subject8_09.getText().isEmpty()) && !(tf_subject9_10.getText().isEmpty())) {

                    try {
                        ClassLoadingAndConnectivity.loadAndConnect();
                        System.out.println("1");
                        Statement st = ClassLoadingAndConnectivity.con.createStatement();
                        System.out.println("2");
                        //    try{
                        String query1 = "update  student_results2 set Roll_Num=?, Hindi=?, English=?, Women_Empowerment=?, Entrepreneurship=?, DBMS=?, DCCN=?, Mysql=?, Java_Language=?, Php_Language=? where Roll_Num=?";
                        System.out.println("3");
                        rt = st.executeQuery("Select * from Student_results2 where Roll_Num = '" + Roll_Number + "'");
                        System.out.println("4");
                        ptst = ClassLoadingAndConnectivity.con.prepareStatement(query1);
                        System.out.println("5");
                        ptst.setString(1, Roll_Number);
                        System.out.println("6");
                        if ((Hindi2 <= 75 && Hindi2 >= 0) && (English2 <= 75 && English2 >= 0) && (Women_Empowerment <= 75 && Women_Empowerment >= 0) && (Entrepreneurship <= 75 && Entrepreneurship >= 0) && (DBMS <= 75 && DBMS >= 0) && (DCCN <= 75 && DCCN >= 0) && (Mysql <= 75 && Mysql >= 0) && (Java_Language <= 75 && Java_Language >= 0) && (Php_Language <= 75 && Php_Language >= 0)) {
                            ptst.setInt(2, Hindi2);
                            ptst.setInt(3, English2);
                            ptst.setInt(4, Women_Empowerment);
                            ptst.setInt(5, Entrepreneurship);
                            ptst.setInt(6, DBMS);
                            ptst.setInt(7, DCCN);
                            ptst.setInt(8, Mysql);
                            ptst.setInt(9, Java_Language);
                            ptst.setInt(10, Php_Language);
                            ptst.setString(11, Roll_Number);
                        }
                        ptst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Result has Updated Succesfully");
                        seeData();
                        rnAutoIncreament();
                        forEmpty();
                        ptst.close();
                    } catch (SQLException | ClassNotFoundException e) {
                        try {
                            if ((rt.next())) {
                                if ((Hindi2 <= 75 && Hindi2 >= 0) && (English2 <= 75 && English2 >= 0) && (Women_Empowerment <= 75 && Women_Empowerment >= 0) && (Entrepreneurship <= 75 && Entrepreneurship >= 0) && (DBMS <= 75 && DBMS >= 0) && (DCCN <= 75 && DCCN >= 0) && (Mysql <= 75 && Mysql >= 0) && (Java_Language <= 75 && Java_Language >= 0) && (Php_Language <= 75 && Php_Language >= 0)) {
                                    JOptionPane.showMessageDialog(null, "Roll Number Does not Exist Our Database");
                                    tf_Roll_Number_01.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Your marks is not under ----> 75 ");
                                    if (Hindi2 > 75) {
                                        tf_subject1_02.setText("");
                                    }
                                    if (English2 > 75) {
                                        tf_subject2_03.setText("");
                                    }
                                    if (Women_Empowerment > 75) {
                                        tf_subject2_03.setText("");
                                    }

                                    if (Entrepreneurship > 75) {
                                        tf_subject3_04.setText("");
                                    }
                                    if (DBMS > 75) {
                                        tf_subject4_05.setText("");
                                    }
                                    if (DCCN > 75) {
                                        tf_subject5_06.setText("");
                                    }
                                    if (Mysql > 75) {
                                        tf_subject6_07.setText("");
                                    }
                                    if (Java_Language > 75) {
                                        tf_subject7_08.setText("");
                                    }
                                    if (Php_Language > 75) {
                                        tf_subject8_09.setText("");
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Roll Number Already Exsists");
                                tf_Roll_Number_01.setText("");
                            }
                        } catch (SQLException e1) {
                            JOptionPane.showMessageDialog(null, e1.getMessage());
                        }
                    }
                } else {
                    if (!(Roll_Number.matches("[0-9]+"))) {
                        JOptionPane.showMessageDialog(null, "Roll Number is not right Format");
                        tf_Roll_Number_01.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
                    }
                }
                break;

            case "3rd Year":
                Roll_Number = tf_Roll_Number_01.getText();
                int Hindi3 = Integer.parseInt(tf_subject1_02.getText());
                int English3 = Integer.parseInt(tf_subject2_03.getText());
                int Computer_Graphics = Integer.parseInt(tf_subject3_04.getText());
                int Python = Integer.parseInt(tf_subject4_05.getText());
                int Cloud_Computing = Integer.parseInt(tf_subject5_06.getText());
                int Mysql3 = Integer.parseInt(tf_subject7_08.getText());
                int Cyber_Security = Integer.parseInt(tf_subject8_09.getText());
                int Web_Designing3 = Integer.parseInt(tf_subject9_10.getText());
                int Personality_Development = Integer.parseInt(tf_subject9_10.getText());
                if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !((tf_subject1_02.getText()).isEmpty()) && !(tf_subject2_03.getText().isEmpty()) && !(tf_subject3_04.getText().isEmpty()) && !(tf_subject4_05.getText().isEmpty()) && !(tf_subject5_06.getText().isEmpty()) && !(tf_subject6_07.getText().isEmpty()) && !(tf_subject7_08.getText().isEmpty()) && !(tf_subject8_09.getText().isEmpty()) && !(tf_subject9_10.getText().isEmpty())) {

                    try {
                        ClassLoadingAndConnectivity.loadAndConnect();
                        Statement st = ClassLoadingAndConnectivity.con.createStatement();
                        //    try{
                        String query1 = "Update student_results3 set Roll_Num=?, Hindi=?, English=?, Computer_Graphics=?, Python=?, Cloud_Computing=?,  Mysql=?, Cyber_Security=? , Web_Designing=?,Personality_Development=? where Roll_Num=?";
                        rt = st.executeQuery("Select * from Student_results3 where Roll_Num = '" + Roll_Number + "'");
                        ptst = ClassLoadingAndConnectivity.con.prepareStatement(query1);
                        ptst.setString(1, Roll_Number);
                        if ((Hindi3 <= 75 && Hindi3 >= 0) && (English3 <= 75 && English3 >= 0) && (Computer_Graphics <= 75 && Computer_Graphics >= 0) && (Python <= 75 && Python >= 0) && (Cloud_Computing <= 75 && Cloud_Computing >= 0) && (Mysql3 <= 75 && Mysql3 >= 0) && (Cyber_Security <= 75 && Cyber_Security >= 0) && (Web_Designing3 <= 75 && Web_Designing3 >= 0) && (Personality_Development <= 75 && Personality_Development >= 0)) {
                            ptst.setInt(2, Hindi3);
                            ptst.setInt(3, English3);
                            ptst.setInt(4, Computer_Graphics);
                            ptst.setInt(5, Python);
                            ptst.setInt(6, Cloud_Computing);
                            ptst.setInt(7, Mysql3);
                            ptst.setInt(8, Cyber_Security);
                            ptst.setInt(9, Web_Designing3);
                            ptst.setInt(10, Personality_Development);
                            ptst.setString(11, Roll_Number);
                        }
                        ptst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Result has Updated Succesfully");
                        seeData();
                        rnAutoIncreament();
                        forEmpty();
                        ptst.close();
                    } catch (SQLException | ClassNotFoundException e) {
                        try {
                            if ((rt.next())) {
                                if ((Hindi3 <= 75 && Hindi3 >= 0) && (English3 <= 75 && English3 >= 0) && (Computer_Graphics <= 75 && Computer_Graphics >= 0) && (Python <= 75 && Python >= 0) && (Cloud_Computing <= 75 && Cloud_Computing >= 0) && (Mysql3 <= 75 && Mysql3 >= 0) && (Cyber_Security <= 75 && Cyber_Security >= 0) && (Web_Designing3 <= 75 && Web_Designing3 >= 0) && (Personality_Development <= 75 && Personality_Development >= 0)) {
                                    JOptionPane.showMessageDialog(null, "Roll Number Does not Exist Our Database");
                                    tf_Roll_Number_01.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Your marks is not under ----> 75 ");
                                    if (Hindi3 > 75) {
                                        tf_subject1_02.setText("");
                                    }
                                    if (English3 > 75) {
                                        tf_subject2_03.setText("");
                                    }
                                    if (Computer_Graphics > 75) {
                                        tf_subject2_03.setText("");
                                    }

                                    if (Python > 75) {
                                        tf_subject3_04.setText("");
                                    }
                                    if (Cloud_Computing > 75) {
                                        tf_subject4_05.setText("");
                                    }
                                    if (Mysql3 > 75) {
                                        tf_subject5_06.setText("");
                                    }
                                    if (Cyber_Security > 75) {
                                        tf_subject6_07.setText("");
                                    }
                                    if (Web_Designing3 > 75) {
                                        tf_subject7_08.setText("");
                                    }
                                    if (Personality_Development > 75) {
                                        tf_subject8_09.setText("");
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, " Roll_Number Already Exsists");
                                tf_Roll_Number_01.setText("");
                            }
                        } catch (SQLException e1) {
                            JOptionPane.showMessageDialog(null, e1.getMessage());
                        }
                    }
                } else {
                    if (!(Roll_Number.matches("[0-9]+"))) {
                        JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                        tf_Roll_Number_01.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
                    }
                }
                break;

            default:

                Roll_Number = tf_Roll_Number_01.getText();
                Hindi = Integer.parseInt(tf_subject1_02.getText());
                English = Integer.parseInt(tf_subject2_03.getText());
                Mathematics = Integer.parseInt(tf_subject3_04.getText());
                Web_Designing = Integer.parseInt(tf_subject4_05.getText());
                Yoga = Integer.parseInt(tf_subject5_06.getText());
                Operating_System = Integer.parseInt(tf_subject6_07.getText());
                Community_Eng = Integer.parseInt(tf_subject7_08.getText());
                Enviroment = Integer.parseInt(tf_subject8_09.getText());
                Computer_Funda = Integer.parseInt(tf_subject9_10.getText());
                if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !((tf_subject1_02.getText()).isEmpty()) && !(tf_subject2_03.getText().isEmpty()) && !(tf_subject3_04.getText().isEmpty()) && !(tf_subject4_05.getText().isEmpty()) && !(tf_subject5_06.getText().isEmpty()) && !(tf_subject6_07.getText().isEmpty()) && !(tf_subject7_08.getText().isEmpty()) && !(tf_subject8_09.getText().isEmpty()) && !(tf_subject9_10.getText().isEmpty())) {

                    try {

                        ClassLoadingAndConnectivity.loadAndConnect();
                        Statement st = ClassLoadingAndConnectivity.con.createStatement();
                        String query1 = "update student_results1 set Roll_Num = ? ,Hindi = ? ,English=? ,Mathematics=? ,Web_Designing=?,Yoga=?,Operating_System=?,Community_Eng=?,Enviroment=?,Computer_Fundamental=? where Roll_Num=?";
                        rt = st.executeQuery("Select * from Student_results1 where Roll_Num = '" + Roll_Number + "'");
                        ptst = ClassLoadingAndConnectivity.con.prepareStatement(query1);
                        ptst.setString(1, Roll_Number);
                        if ((Hindi <= 75 && Hindi >= 0) && (English <= 75 && English >= 0) && (Mathematics <= 75 && Mathematics >= 0) && (Web_Designing <= 75 && Web_Designing >= 0) && (Yoga <= 75 && Yoga >= 0) && (Operating_System <= 75 && Operating_System >= 0) && (Community_Eng <= 75 && Community_Eng >= 0) && (Enviroment <= 75 && Enviroment >= 0) && (Computer_Funda <= 75 && Computer_Funda >= 0)) {

                            ptst.setInt(2, Hindi);
                            ptst.setInt(3, English);
                            ptst.setInt(4, Mathematics);
                            ptst.setInt(5, Web_Designing);
                            ptst.setInt(6, Yoga);
                            ptst.setInt(7, Operating_System);
                            ptst.setInt(8, Community_Eng);
                            ptst.setInt(9, Enviroment);
                            ptst.setInt(10, Computer_Funda);
                            ptst.setString(11, Roll_Number);

                        }
                        ptst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Result has Updated Succesfully");
                        seeData();
                        rnAutoIncreament();
                        forEmpty();

                        ptst.close();
                    } catch (SQLException | ClassNotFoundException e) {
                        try {
                            if ((rt.next())) {
                                if ((Hindi <= 75 && Hindi >= 0) && (English <= 75 && English >= 0) && (Mathematics <= 75 && Mathematics >= 0) && (Web_Designing <= 75 && Web_Designing >= 0) && (Yoga <= 75 && Yoga >= 0) && (Operating_System <= 75 && Operating_System >= 0) && (Community_Eng <= 75 && Community_Eng >= 0) && (Enviroment <= 75 && Enviroment >= 0) && (Computer_Funda <= 75 && Computer_Funda >= 0)) {
                                    JOptionPane.showMessageDialog(null, "Roll Number Does not Exist Our Database");
                                    tf_Roll_Number_01.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Your marks is not under ----> 75 ");
                                    if (Hindi > 75) {
                                        tf_subject1_02.setText("");
                                    }
                                    if (English > 75) {
                                        tf_subject2_03.setText("");
                                    }
                                    if (Mathematics > 75) {
                                        tf_subject2_03.setText("");
                                    }

                                    if (Web_Designing > 75) {
                                        tf_subject3_04.setText("");
                                    }
                                    if (Yoga > 75) {
                                        tf_subject4_05.setText("");
                                    }
                                    if (Operating_System > 75) {
                                        tf_subject5_06.setText("");
                                    }
                                    if (Community_Eng > 75) {
                                        tf_subject6_07.setText("");
                                    }
                                    if (Enviroment > 75) {
                                        tf_subject7_08.setText("");
                                    }
                                    if (Computer_Funda > 75) {
                                        tf_subject8_09.setText("");
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Roll_Number Already Exsists");
                                tf_Roll_Number_01.setText("");
                            }
                        } catch (SQLException e1) {
                            JOptionPane.showMessageDialog(null, e1.getMessage());
                        }
                    }
                } else {
                    if (!(Roll_Number.matches("[0-9]+"))) {
                        JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
                    }
                }
                break;
        };
    }//GEN-LAST:event_updateButton_03ActionPerformed

    private void deleteButton_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton_04ActionPerformed
        String Year = cb_year_01.getSelectedItem().toString();
        Roll_Number = tf_Roll_Number_01.getText();
        if ((Roll_Number.matches("[0-9]+")) && !(Roll_Number.isEmpty()) && !((tf_subject1_02.getText()).isEmpty()) && !(tf_subject2_03.getText().isEmpty()) && !(tf_subject3_04.getText().isEmpty()) && !(tf_subject4_05.getText().isEmpty()) && !(tf_subject5_06.getText().isEmpty()) && !(tf_subject6_07.getText().isEmpty()) && !(tf_subject7_08.getText().isEmpty()) && !(tf_subject8_09.getText().isEmpty()) && !(tf_subject9_10.getText().isEmpty())) {

            try {
                ClassLoadingAndConnectivity.loadAndConnect();
                String query1 = "";
                switch (Year) {
                    case "1st Year":
                        query1 = "Delete from student_results1 where Roll_Num=?";
                        break;
                    case "2nd Year":
                        query1 = "Delete from Student_Results2 where Roll_Num=?";
                        break;
                    case "3rd Year":
                        query1 = "Delete from Student_Results3 where Roll_Num=?";
                        break;
                    default:
                        query1 = "Delete from Student_Results1 where Roll_Num=?";
                        break;
                }
                PreparedStatement ptst = ClassLoadingAndConnectivity.con.prepareStatement(query1);
                ptst.setString(1, Roll_Number);
                ptst.executeUpdate();
                ptst.close();
                JOptionPane.showMessageDialog(null, "Data has Deleted Succesfully");
                seeData();
                rnAutoIncreament();
                forEmpty();
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {

                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "RollNumber not Exist in Database");
                tf_Roll_Number_01.setText("");
            }
        } else {
            if (!(Roll_Number.matches("[0-9]+"))) {
                JOptionPane.showMessageDialog(null, "RollNumber is not right Format");
                tf_Roll_Number_01.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please Fillup all the Coloums");
            }
        }
    }//GEN-LAST:event_deleteButton_04ActionPerformed

    private int getRollNumberColumnIndex(DefaultTableModel model) {
        for (int i = 0; i < model.getColumnCount(); i++) {
            String columnName = model.getColumnName(i);
            if (columnName.equals("Roll Number")) {
                return i;
            }
        }
        return -1;
    }


    private void t_1stYearMarks_01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_1stYearMarks_01MouseClicked

        String rollNumber = tf_Searchbar_01.getText();

        DefaultTableModel model = (DefaultTableModel) t_1stYearMarks_01.getModel();

        int rollNumberColumnIndex = getRollNumberColumnIndex(model);

        int matchingRowIndex = -1;

        if (rollNumberColumnIndex != -1) {
            for (int row = 0; row < model.getRowCount(); row++) {
                String forColumnMatch = model.getValueAt(row, rollNumberColumnIndex).toString();
                if (forColumnMatch.equals(rollNumber)) {
                    matchingRowIndex = row;
                    break;
                } else {
                    int i = t_1stYearMarks_01.getSelectedRow();
                    t_All_MouseClick(i, model);
                }
            }
        } else {
            System.out.println("Roll number column not found!");
        }

        if (matchingRowIndex != -1) {
            t_All_MouseClick(matchingRowIndex, model);
        } else {

        }
        tf_Searchbar_01.setText("");
    }//GEN-LAST:event_t_1stYearMarks_01MouseClicked

    private void t_2ndYearMarks_02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_2ndYearMarks_02MouseClicked

        String rollNumber = tf_Searchbar_01.getText();

        DefaultTableModel model = (DefaultTableModel) t_2ndYearMarks_02.getModel();

        int rollNumberColumnIndex = getRollNumberColumnIndex(model);

        int matchingRowIndex = -1;

        if (rollNumberColumnIndex != -1) {
            for (int row = 0; row < model.getRowCount(); row++) {
                String forColumnMatch = model.getValueAt(row, rollNumberColumnIndex).toString();
                if (forColumnMatch.equals(rollNumber)) {
                    matchingRowIndex = row;
                    break;
                } else {
                    int i = t_2ndYearMarks_02.getSelectedRow();
                    t_All_MouseClick(i, model);
                }
            }
        } else {
            System.out.println("Roll number column not found!");
        }

        if (matchingRowIndex != -1) {
            t_All_MouseClick(matchingRowIndex, model);
        } else {

        }
        tf_Searchbar_01.setText("");
    }//GEN-LAST:event_t_2ndYearMarks_02MouseClicked

    private void t_3rdYearMarks_03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_3rdYearMarks_03MouseClicked
        String rollNumber = tf_Searchbar_01.getText();

        DefaultTableModel model = (DefaultTableModel) t_3rdYearMarks_03.getModel();

        int rollNumberColumnIndex = getRollNumberColumnIndex(model);

        int matchingRowIndex = -1;

        if (rollNumberColumnIndex != -1) {
            for (int row = 0; row < model.getRowCount(); row++) {
                String forColumnMatch = model.getValueAt(row, rollNumberColumnIndex).toString();
                if (forColumnMatch.equals(rollNumber)) {
                    matchingRowIndex = row;
                    break;
                } else {
                    int i = t_3rdYearMarks_03.getSelectedRow();
                    t_All_MouseClick(i, model);
                }
            }
        } else {
            System.out.println("Roll number column not found!");
        }

        if (matchingRowIndex != -1) {
            t_All_MouseClick(matchingRowIndex, model);
        } else {

        }
        tf_Searchbar_01.setText("");
    }//GEN-LAST:event_t_3rdYearMarks_03MouseClicked

    private void refreshButton_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton_01ActionPerformed
        String searchrollnumber = tf_Searchbar_01.getText();
        search(searchrollnumber);
        forEmpty();
    }//GEN-LAST:event_refreshButton_01ActionPerformed

    private void tf_Searchbar_01KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_Searchbar_01KeyReleased
//      String data = tf_Searchbar_01.getText();
//      search(data);
    }//GEN-LAST:event_tf_Searchbar_01KeyReleased

    private void searchButton_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton_01ActionPerformed
        String data = tf_Searchbar_01.getText();
        search(data);
    }//GEN-LAST:event_searchButton_01ActionPerformed

    private void Student_data_Button_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_data_Button_02ActionPerformed
        setVisible(false);
        new Student_Data_UID().setVisible(true);
    }//GEN-LAST:event_Student_data_Button_02ActionPerformed

    private void t_All_MouseClick(int i, DefaultTableModel model) {

        tf_Roll_Number_01.setText(model.getValueAt(i, 0).toString());
        tf_subject1_02.setText(model.getValueAt(i, 1).toString());
        tf_subject2_03.setText(model.getValueAt(i, 2).toString());
        tf_subject3_04.setText(model.getValueAt(i, 3).toString());
        tf_subject4_05.setText(model.getValueAt(i, 4).toString());
        tf_subject5_06.setText(model.getValueAt(i, 5).toString());
        tf_subject6_07.setText(model.getValueAt(i, 6).toString());
        tf_subject7_08.setText(model.getValueAt(i, 7).toString());
        tf_subject8_09.setText(model.getValueAt(i, 8).toString());
        tf_subject9_10.setText(model.getValueAt(i, 9).toString());

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Marks_UID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Roll_Number_02;
    private javax.swing.JButton Student_data_Button_02;
    private javax.swing.JButton backButton_02;
    private javax.swing.JComboBox<String> cb_year_01;
    private javax.swing.JLabel collageLogo_01;
    private javax.swing.JButton deleteButton_04;
    private javax.swing.JButton insertButton_01;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel p_insertMarks_01;
    private javax.swing.JButton refreshButton_01;
    private javax.swing.JButton searchButton_01;
    private javax.swing.JLabel subject1_03;
    private javax.swing.JLabel subject2_04;
    private javax.swing.JLabel subject3_05;
    private javax.swing.JLabel subject4_06;
    private javax.swing.JLabel subject5_07;
    private javax.swing.JLabel subject6_08;
    private javax.swing.JLabel subject7_09;
    private javax.swing.JLabel subject8_10;
    private javax.swing.JLabel subject9_11;
    private javax.swing.JTable t_1stYearMarks_01;
    private javax.swing.JTable t_2ndYearMarks_02;
    private javax.swing.JTable t_3rdYearMarks_03;
    private javax.swing.JTextField tf_Roll_Number_01;
    private javax.swing.JTextField tf_Searchbar_01;
    private javax.swing.JTextField tf_subject1_02;
    private javax.swing.JTextField tf_subject2_03;
    private javax.swing.JTextField tf_subject3_04;
    private javax.swing.JTextField tf_subject4_05;
    private javax.swing.JTextField tf_subject5_06;
    private javax.swing.JTextField tf_subject6_07;
    private javax.swing.JTextField tf_subject7_08;
    private javax.swing.JTextField tf_subject8_09;
    private javax.swing.JTextField tf_subject9_10;
    private javax.swing.JTabbedPane tp_AllStudentMarks_01;
    private javax.swing.JButton updateButton_03;
    private javax.swing.JLabel year_02;
    // End of variables declaration//GEN-END:variables
}
