package my_report_card_project;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Show_Result extends javax.swing.JFrame {

    int s1;
    int s2;
    int s3;
    int s4;
    int s5;
    int s6;
    int s7;
    int s8;
    int s9;

    PreparedStatement ptst;
    Statement st;
    ResultSet rs;

    String roll_num5;
    String Year1;
    String name2;
    String father3;
    String mother4;
    String Course6;
    String Gender7;
    String hindi8;
    String english9;
    String math10;
    String web_design11;
    String yoga12;
    String operating_sys13;
    String Community_eng14;
    String environment15;
    String ComputerFanda16;
    String total_Marks17;
    String result_18;

    public static void main(String args[]) {
     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Result.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }    
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }
    public Show_Result() {
        initComponents();
    }
    public Show_Result(String roll_num) {
        initComponents();
        tf_sRoll_Number_05.setText(roll_num);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CollegeName_01 = new javax.swing.JLabel();
        CollegeLogo_02 = new javax.swing.JLabel();
        CollegeName2_03 = new javax.swing.JLabel();
        CollegeName3_04 = new javax.swing.JLabel();
        sName_05 = new javax.swing.JLabel();
        sFName_07 = new javax.swing.JLabel();
        tf_Year_01 = new javax.swing.JTextField();
        tf_sName_02 = new javax.swing.JTextField();
        sMName_06 = new javax.swing.JLabel();
        tf_sFName_03 = new javax.swing.JTextField();
        sGender_08 = new javax.swing.JLabel();
        tf_sMName_04 = new javax.swing.JTextField();
        sRoll_Number_09 = new javax.swing.JLabel();
        tf_sRoll_Number_05 = new javax.swing.JTextField();
        sYear_11 = new javax.swing.JLabel();
        sCourse_12 = new javax.swing.JLabel();
        tf_sCourse_06 = new javax.swing.JTextField();
        sGender_07 = new javax.swing.JTextField();
        HindiRow_15 = new javax.swing.JLabel();
        tf_HindiRow_08 = new javax.swing.JTextField();
        EnglishRow_10 = new javax.swing.JLabel();
        tf_EnglishRow_09 = new javax.swing.JTextField();
        mathematicsRow_14 = new javax.swing.JLabel();
        tf_mathematicsRow_10 = new javax.swing.JTextField();
        Web_DesigningRow_16 = new javax.swing.JLabel();
        tf_Web_DesigningRow_11 = new javax.swing.JTextField();
        YogaRow_17 = new javax.swing.JLabel();
        tf_YogaRow_12 = new javax.swing.JTextField();
        Operating_SystemRow_18 = new javax.swing.JLabel();
        tf_Operating_SystemRow_13 = new javax.swing.JTextField();
        Community_EngRow_19 = new javax.swing.JLabel();
        tf_Community_EngRow_14 = new javax.swing.JTextField();
        EnviromentRow_20 = new javax.swing.JLabel();
        tf_EnviromentRow_15 = new javax.swing.JTextField();
        Computer_FundaRow_21 = new javax.swing.JLabel();
        tf_Computer_FundaRow_16 = new javax.swing.JTextField();
        BackButton_01 = new javax.swing.JButton();
        ResultRow_22 = new javax.swing.JLabel();
        tf_TotalMarksRow_17 = new javax.swing.JTextField();
        TotalMarksRow_23 = new javax.swing.JLabel();
        tf_ResultRow_18 = new javax.swing.JTextField();
        PDfGenerateButton_02 = new javax.swing.JButton();
        SchemaOfMarksheet_13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CollegeName_01.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CollegeName_01.setText("Sant Singaji Institute of Science & Management,");
        getContentPane().add(CollegeName_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 27, -1, -1));

        CollegeLogo_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/1595483733332-removebg-preview200.png"))); // NOI18N
        getContentPane().add(CollegeLogo_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 16, 125, -1));

        CollegeName2_03.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CollegeName2_03.setText("Sandalpur (M.P.)");
        getContentPane().add(CollegeName2_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 65, -1, -1));

        CollegeName3_04.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CollegeName3_04.setText("Session  -- 2021 - 22");
        getContentPane().add(CollegeName3_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 114, -1, -1));

        sName_05.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sName_05.setText("Name");
        getContentPane().add(sName_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 218, 87, -1));

        sFName_07.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sFName_07.setText("Father Name");
        getContentPane().add(sFName_07, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 252, -1, -1));
        getContentPane().add(tf_Year_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 184, 137, -1));
        getContentPane().add(tf_sName_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 218, 137, -1));

        sMName_06.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sMName_06.setText("Mother Name");
        getContentPane().add(sMName_06, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 286, -1, -1));
        getContentPane().add(tf_sFName_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 252, 136, -1));

        sGender_08.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sGender_08.setText("Gender");
        getContentPane().add(sGender_08, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 254, 94, -1));
        getContentPane().add(tf_sMName_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 286, 136, -1));

        sRoll_Number_09.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sRoll_Number_09.setText("Roll Number");
        getContentPane().add(sRoll_Number_09, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 184, -1, -1));
        getContentPane().add(tf_sRoll_Number_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 184, 137, -1));

        sYear_11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sYear_11.setText("Year");
        getContentPane().add(sYear_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 186, -1, -1));

        sCourse_12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sCourse_12.setText("Course");
        getContentPane().add(sCourse_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 222, 55, -1));
        getContentPane().add(tf_sCourse_06, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 220, 137, -1));
        getContentPane().add(sGender_07, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 254, 137, -1));

        HindiRow_15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HindiRow_15.setText("Hindi                              |              75             |                        23                   ");
        HindiRow_15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(HindiRow_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 354, -1, -1));
        getContentPane().add(tf_HindiRow_08, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 354, 117, -1));

        EnglishRow_10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EnglishRow_10.setText("English                           |              75             |                        23");
        EnglishRow_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(EnglishRow_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 382, 480, -1));
        getContentPane().add(tf_EnglishRow_09, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 382, 117, -1));

        mathematicsRow_14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mathematicsRow_14.setText("Mathematics                 |              75             |                        23");
        mathematicsRow_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(mathematicsRow_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 410, 480, -1));
        getContentPane().add(tf_mathematicsRow_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 410, 117, -1));

        Web_DesigningRow_16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Web_DesigningRow_16.setText("Web Designing             |              75             |                        23");
        Web_DesigningRow_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Web_DesigningRow_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 438, 480, -1));
        getContentPane().add(tf_Web_DesigningRow_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 438, 117, -1));

        YogaRow_17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        YogaRow_17.setText("Yoga                              |              75             |                        23");
        YogaRow_17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(YogaRow_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 480, -1));
        getContentPane().add(tf_YogaRow_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 470, 120, -1));

        Operating_SystemRow_18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Operating_SystemRow_18.setText("Operating System        |              75             |                        23 ");
        Operating_SystemRow_18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Operating_SystemRow_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 500, 480, -1));
        getContentPane().add(tf_Operating_SystemRow_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 500, 117, -1));

        Community_EngRow_19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Community_EngRow_19.setText("Community Eng.           |              75            |                        23");
        Community_EngRow_19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Community_EngRow_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 528, 480, -1));
        getContentPane().add(tf_Community_EngRow_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 528, 117, -1));

        EnviromentRow_20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EnviromentRow_20.setText("Enviroment                   |              75             |                        23");
        EnviromentRow_20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(EnviromentRow_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 556, 480, -1));
        getContentPane().add(tf_EnviromentRow_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 556, 117, -1));

        Computer_FundaRow_21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Computer_FundaRow_21.setText("Computer Funda.         |               75            |                        23");
        Computer_FundaRow_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Computer_FundaRow_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 584, 480, -1));
        getContentPane().add(tf_Computer_FundaRow_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 584, 117, -1));

        BackButton_01.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackButton_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/icons8-back-button-30.png"))); // NOI18N
        BackButton_01.setText("Back");
        BackButton_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton_01ActionPerformed(evt);
            }
        });
        BackButton_01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BackButton_01KeyPressed(evt);
            }
        });
        getContentPane().add(BackButton_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, 30));

        ResultRow_22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ResultRow_22.setText("Result");
        ResultRow_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(ResultRow_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 640, 480, -1));
        getContentPane().add(tf_TotalMarksRow_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 612, 117, -1));

        TotalMarksRow_23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalMarksRow_23.setText("Total Marks");
        TotalMarksRow_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(TotalMarksRow_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 612, 480, -1));
        getContentPane().add(tf_ResultRow_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 640, 117, -1));

        PDfGenerateButton_02.setBackground(new java.awt.Color(0, 0, 0));
        PDfGenerateButton_02.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        PDfGenerateButton_02.setForeground(new java.awt.Color(255, 255, 255));
        PDfGenerateButton_02.setText("Get PDF");
        PDfGenerateButton_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDfGenerateButton_02ActionPerformed(evt);
            }
        });
        PDfGenerateButton_02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PDfGenerateButton_02KeyPressed(evt);
            }
        });
        getContentPane().add(PDfGenerateButton_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, -1, 30));

        SchemaOfMarksheet_13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SchemaOfMarksheet_13.setText("Subject                           |          Marks          |               Passing Marks        |     Marks Obtained");
        SchemaOfMarksheet_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(SchemaOfMarksheet_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 710, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Result_Bckground.png"))); // NOI18N
        jLabel24.setText("jLabel24");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setTextt() {
        SchemaOfMarksheet_13.setText("Marksheet Data Store ");
    }

    private void BackButton_01ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new Student_Result().setVisible(true);
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {
        roll_num5 = tf_sRoll_Number_05.getText();
        try {
            ClassLoadingAndConnectivity.loadAndConnect();
            Statement st = ClassLoadingAndConnectivity.con.createStatement();
            
            rs = st.executeQuery(
                    "select * from Student_Information1 inner join Student_Results1 where Student_Information1.Roll_Number='"
                    + roll_num5 + "' and Student_Results1.Roll_Num='" + roll_num5 + "' ");
            
            if (rs.next()) {

                Year1 = rs.getString("Cyear");
                name2 = rs.getString("Student_Name");
                father3 = rs.getString("Father_Name");
                mother4 = rs.getString("Mother_Name");
                Course6 = rs.getString("Course_Name");
                Gender7 = rs.getString("Gender");
                hindi8 = rs.getString("Hindi");
                english9 = rs.getString("English");
                math10 = rs.getString("Mathematics");
                web_design11 = rs.getString("Web_Designing");
                yoga12 = rs.getString("Yoga");
                operating_sys13 = rs.getString("Operating_System");
                Community_eng14 = rs.getString("Community_Eng");
                environment15 = rs.getString("Enviroment");
                ComputerFanda16 = rs.getString("Computer_Fundamental");

                setTextt();
                tf_Year_01.setText(Year1);
                tf_sName_02.setText(name2);
                tf_sFName_03.setText(father3);
                tf_sMName_04.setText(mother4);
                tf_sCourse_06.setText(Course6);
                sGender_07.setText(Gender7);
                tf_HindiRow_08.setText(hindi8);
                tf_EnglishRow_09.setText(english9);
                tf_mathematicsRow_10.setText(math10);
                tf_Web_DesigningRow_11.setText(web_design11);
                tf_YogaRow_12.setText(yoga12);
                tf_Operating_SystemRow_13.setText(operating_sys13);
                tf_Community_EngRow_14.setText(Community_eng14);
                tf_EnviromentRow_15.setText(environment15);
                tf_Computer_FundaRow_16.setText(ComputerFanda16);

                s1 = Integer.parseInt(tf_HindiRow_08.getText());
                s2 = Integer.parseInt(tf_EnglishRow_09.getText());
                s3 = Integer.parseInt(tf_mathematicsRow_10.getText());
                s4 = Integer.parseInt(tf_Web_DesigningRow_11.getText());
                s5 = Integer.parseInt(tf_YogaRow_12.getText());
                s6 = Integer.parseInt(tf_Operating_SystemRow_13.getText());
                s7 = Integer.parseInt(tf_Community_EngRow_14.getText());
                s8 = Integer.parseInt(tf_EnviromentRow_15.getText());
                s9 = Integer.parseInt(tf_Computer_FundaRow_16.getText());
                int result = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9;
                total_Marks17 = String.valueOf(result);
                tf_TotalMarksRow_17.setText(total_Marks17);
                int count = 0;
                if (s1 < 23) {
                    count++;
                }
                if (s2 < 23) {
                    count++;
                }
                if (s3 < 23) {
                    count++;
                }
                if (s4 < 23) {
                    count++;
                }
                if (s5 < 23) {
                    count++;
                }
                if (s6 < 23) {
                    count++;
                }
                if (s7 < 23) {
                    count++;
                }
                if (s8 < 23) {
                    count++;
                }
                if (s9 < 23) {
                    count++;
                }
                if (count <= 3) {
                    result_18 = "ATKT";
                    tf_ResultRow_18.setText(result_18);
                }
                if (count > 3) {
                    result_18 = "Fail";
                    tf_ResultRow_18.setText(result_18);
                }
                if (count == 0) {
                    result_18 = "Pass";
                    tf_ResultRow_18.setText(result_18);
                }

            } else {
                if (roll_num5.equals("")) {
                    JOptionPane.showMessageDialog(null, "please Enter Roll_number ");
                    setVisible(false);
                    new Student_Result().setVisible(true);
                }
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tf_Year_01.setEditable(false);
        tf_sName_02.setEditable(false);
        tf_sFName_03.setEditable(false);
        tf_sMName_04.setEditable(false);
        tf_sRoll_Number_05.setEditable(false);
        tf_sCourse_06.setEditable(false);
        sGender_07.setEditable(false);
        tf_HindiRow_08.setEditable(false);
        tf_EnglishRow_09.setEditable(false);
        tf_mathematicsRow_10.setEditable(false);
        tf_Web_DesigningRow_11.setEditable(false);
        tf_YogaRow_12.setEditable(false);
        tf_Operating_SystemRow_13.setEditable(false);
        tf_Community_EngRow_14.setEditable(false);
        tf_EnviromentRow_15.setEditable(false);
        tf_Computer_FundaRow_16.setEditable(false);
        tf_TotalMarksRow_17.setEditable(false);
        tf_ResultRow_18.setEditable(false);

    }

    private void PDfGenerateButton_02ActionPerformed(java.awt.event.ActionEvent evt) {
        GeneretedPdf();
    }
    private void BackButton_01KeyPressed(java.awt.event.KeyEvent evt) {
  
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            formComponentShown(null);
        }
    }

    private void PDfGenerateButton_02KeyPressed(java.awt.event.KeyEvent evt) {  
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            GeneretedPdf();
        }
    }

    void GeneretedPdf() {
        try {
            Document document;
                String file = roll_num5 + "Result(1stYear).pdf";
                document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(file));
                document.open();
                float fntSize, lineSpacing;
                fntSize = 24.7f;
                lineSpacing = 30f;
                String line1 = "Sant Singaji Institute of Science &     \n     Management Sandalpur ( MP )\n\n         Session 2021--2022 \n\n                                    -----------------------------------";
                Paragraph p1 = new Paragraph(new Phrase(20f, line1,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, fntSize)));
                p1.setAlignment(5);
                document.add(p1);
                String line2 = "Roll_Number:           " + roll_num5;
                Paragraph p2 = new Paragraph(new Phrase(30f, line2,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p2.setAlignment(5);
                document.add(p2);
                String line3 = "Year:                  " + Year1;
                Paragraph p3 = new Paragraph(new Phrase(30f, line3,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p3.setAlignment(5);
                document.add(p3);
                String line4 = "Name:                  " + name2;
                Paragraph p4 = new Paragraph(new Phrase(30f, line4,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p4.setAlignment(5);
                document.add(p4);
                String line5 = "Father_Name:           " + father3;
                Paragraph p5 = new Paragraph(new Phrase(30f, line5,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p5.setAlignment(5);
                document.add(p5);
                String line6 = "Mother_Name:           " + mother4;
                Paragraph p6 = new Paragraph(new Phrase(30f, line6,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p6.setAlignment(5);
                document.add(p6);
                String line7 = "Course:                " + Course6;
                Paragraph p7 = new Paragraph(new Phrase(30f, line7,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p7.setAlignment(5);
                document.add(p7);
                String line8 = "Gender:                " + Gender7;
                Paragraph p8 = new Paragraph(new Phrase(30f, line8,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p8.setAlignment(5);
                document.add(p8);
                String line9 = "\n____________________________________________________\n";
                Paragraph p9 = new Paragraph(new Phrase(30f, line9,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p9.setAlignment(5);
                document.add(p9);
                String line10 = "\n";
                Paragraph p10 = new Paragraph(new Phrase(30f, line10,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p9.setAlignment(5);
                document.add(p10);
                PdfPTable pdft = new PdfPTable(4);
                pdft.getDefaultCell().setMinimumHeight(20f);
                pdft.setTotalWidth(510f);
                pdft.setLockedWidth(true);
                pdft.setSpacingBefore(12.4f);
                pdft.addCell("Subject");
                pdft.addCell("Marks");
                pdft.addCell("Passing Marks");
                pdft.addCell("Marks Obtained");
                ClassLoadingAndConnectivity.loadAndConnect();
                Statement st = ClassLoadingAndConnectivity.con.createStatement();
                ResultSet r = st.executeQuery(
                        "select * from Student_Information1 inner join Student_Results0 where Student_Information1.Roll_Number='"
                        + roll_num5 + "' and Student_Results0.Roll_Num='" + roll_num5 + "' ");
                if (r.next()) {
                    pdft.addCell("Hindi");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(hindi8);
                    pdft.addCell("English");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(english9);
                    pdft.addCell("Mathematics");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(math10);
                    pdft.addCell("Web Designing");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(web_design11);
                    pdft.addCell("Yoga");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(yoga12);
                    pdft.addCell("Operating System");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(operating_sys13);
                    pdft.addCell("Community_eng");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(Community_eng14);
                    pdft.addCell("Environment");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(environment15);
                    pdft.addCell("Computer Fandamental");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(ComputerFanda16);
                    pdft.addCell("Total Marks ");
                    pdft.addCell("675");
                    pdft.addCell("-");
                    pdft.addCell(total_Marks17);
                    pdft.addCell("Result");
                    pdft.addCell("-");
                    pdft.addCell("-");
                    pdft.addCell(result_18);
                }
                document.add(pdft);
                document.close();
                JOptionPane.showMessageDialog(null, "Pdf Created");
            } catch (DocumentException | HeadlessException | FileNotFoundException | ClassNotFoundException
                    | SQLException e) {
                 JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton_01;
    private javax.swing.JLabel CollegeLogo_02;
    private javax.swing.JLabel CollegeName2_03;
    private javax.swing.JLabel CollegeName3_04;
    private javax.swing.JLabel CollegeName_01;
    private javax.swing.JLabel Community_EngRow_19;
    private javax.swing.JLabel Computer_FundaRow_21;
    private javax.swing.JLabel EnglishRow_10;
    private javax.swing.JLabel EnviromentRow_20;
    private javax.swing.JLabel HindiRow_15;
    private javax.swing.JLabel Operating_SystemRow_18;
    private javax.swing.JButton PDfGenerateButton_02;
    private javax.swing.JLabel ResultRow_22;
    private javax.swing.JLabel SchemaOfMarksheet_13;
    private javax.swing.JLabel TotalMarksRow_23;
    private javax.swing.JLabel Web_DesigningRow_16;
    private javax.swing.JLabel YogaRow_17;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel mathematicsRow_14;
    private javax.swing.JLabel sCourse_12;
    private javax.swing.JLabel sFName_07;
    private javax.swing.JTextField sGender_07;
    private javax.swing.JLabel sGender_08;
    private javax.swing.JLabel sMName_06;
    private javax.swing.JLabel sName_05;
    private javax.swing.JLabel sRoll_Number_09;
    private javax.swing.JLabel sYear_11;
    private javax.swing.JTextField tf_Community_EngRow_14;
    private javax.swing.JTextField tf_Computer_FundaRow_16;
    private javax.swing.JTextField tf_EnglishRow_09;
    private javax.swing.JTextField tf_EnviromentRow_15;
    private javax.swing.JTextField tf_HindiRow_08;
    private javax.swing.JTextField tf_Operating_SystemRow_13;
    private javax.swing.JTextField tf_ResultRow_18;
    private javax.swing.JTextField tf_TotalMarksRow_17;
    private javax.swing.JTextField tf_Web_DesigningRow_11;
    private javax.swing.JTextField tf_Year_01;
    private javax.swing.JTextField tf_YogaRow_12;
    private javax.swing.JTextField tf_mathematicsRow_10;
    private javax.swing.JTextField tf_sCourse_06;
    private javax.swing.JTextField tf_sFName_03;
    private javax.swing.JTextField tf_sMName_04;
    private javax.swing.JTextField tf_sName_02;
    private javax.swing.JTextField tf_sRoll_Number_05;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {


        @Override
        public void run() {
            new Show_Result().setVisible(true);
        }
    }
}
