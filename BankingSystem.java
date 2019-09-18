import java.util.Random;
import java.sql.*;
public class BankingSystem extends java.awt.Frame {
   Random r=new Random();
   Connection con;
   Statement st;
   PreparedStatement ps;
   ResultSet rs;
    public BankingSystem() {
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:2346/database?user=root","root","iamabanker");
            st=con.createStatement();
            }
            catch(Exception e){}
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Open_Account = new javax.swing.JFrame();
        namelabel = new javax.swing.JLabel();
        nametext = new javax.swing.JTextField();
        addlabel = new javax.swing.JLabel();
        addtext = new javax.swing.JTextField();
        doblabel = new javax.swing.JLabel();
        dobtext = new javax.swing.JTextField();
        genlabel = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        panlabel = new javax.swing.JLabel();
        pantext = new javax.swing.JTextField();
        conlabel = new javax.swing.JLabel();
        context = new javax.swing.JTextField();
        idlabel = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        error1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Login = new javax.swing.JFrame();
        acclabel = new javax.swing.JLabel();
        acctext = new javax.swing.JTextField();
        atmlabel = new javax.swing.JLabel();
        atmtext = new javax.swing.JPasswordField();
        loglog = new javax.swing.JButton();
        logres = new javax.swing.JButton();
        error2 = new javax.swing.JLabel();
        Functions = new javax.swing.JFrame();
        transfer = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        cheque = new javax.swing.JButton();
        otherq = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        Loan = new javax.swing.JFrame();
        nlabel = new javax.swing.JLabel();
        alabel = new javax.swing.JLabel();
        dlabel = new javax.swing.JLabel();
        ntext = new javax.swing.JTextField();
        atext = new javax.swing.JTextField();
        dtext = new javax.swing.JTextField();
        glabel = new javax.swing.JLabel();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        o = new javax.swing.JRadioButton();
        plabel = new javax.swing.JLabel();
        clabel = new javax.swing.JLabel();
        elabel = new javax.swing.JLabel();
        ptext = new javax.swing.JTextField();
        ctext = new javax.swing.JTextField();
        etext = new javax.swing.JTextField();
        rbutton = new javax.swing.JButton();
        sbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        error4 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Transfer = new javax.swing.JFrame();
        benname = new javax.swing.JLabel();
        banacc = new javax.swing.JLabel();
        ifsc = new javax.swing.JLabel();
        atmp = new javax.swing.JLabel();
        transr = new javax.swing.JButton();
        transt = new javax.swing.JButton();
        bennamet = new javax.swing.JTextField();
        benacct = new javax.swing.JTextField();
        ifsct = new javax.swing.JTextField();
        error5 = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        amtt = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jDialog4 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Chequebook = new javax.swing.JFrame();
        noofcheques = new javax.swing.JComboBox<>();
        chlabel = new javax.swing.JLabel();
        req = new javax.swing.JButton();
        jDialog5 = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jDialog6 = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Close = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        yes = new javax.swing.JButton();
        jDialog7 = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        Changes = new javax.swing.JFrame();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jDialog8 = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        Tax = new javax.swing.JFrame();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pan = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        FD = new javax.swing.JFrame();
        jLabel24 = new javax.swing.JLabel();
        option = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        years = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        months = new javax.swing.JTextField();
        pa = new javax.swing.JLabel();
        princi = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        value = new javax.swing.JLabel();
        error6 = new javax.swing.JLabel();
        jDialog9 = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jDialog10 = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jDialog11 = new javax.swing.JDialog();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        open = new javax.swing.JButton();
        login = new javax.swing.JButton();
        loan = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();

        namelabel.setText("Name");

        nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextActionPerformed(evt);
            }
        });

        addlabel.setText("Address");

        addtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtextActionPerformed(evt);
            }
        });

        doblabel.setText("Date of Birth");

        genlabel.setText("Gender");

        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        others.setText("Others");
        others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersActionPerformed(evt);
            }
        });

        panlabel.setText("PAN");

        conlabel.setText("Contact Number");

        idlabel.setText("Email ID");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel15.setText("Password");

        jLabel16.setText("Initial Deposit");

        javax.swing.GroupLayout Open_AccountLayout = new javax.swing.GroupLayout(Open_Account.getContentPane());
        Open_Account.getContentPane().setLayout(Open_AccountLayout);
        Open_AccountLayout.setHorizontalGroup(
            Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Open_AccountLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Open_AccountLayout.createSequentialGroup()
                        .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(others, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nametext)
                                .addComponent(addtext)
                                .addComponent(dobtext)
                                .addComponent(female, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pantext)
                                .addComponent(context)
                                .addComponent(idtext, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordField1)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                    .addGroup(Open_AccountLayout.createSequentialGroup()
                        .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Open_AccountLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        Open_AccountLayout.setVerticalGroup(
            Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Open_AccountLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nametext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(namelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtext, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doblabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dobtext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(genlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(male))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(others)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pantext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(conlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(context, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idtext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Open_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(submit))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jButton1)
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        acclabel.setText("Account Number");

        atmlabel.setText("Password");

        atmtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atmtextActionPerformed(evt);
            }
        });

        loglog.setText("Login");
        loglog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loglogActionPerformed(evt);
            }
        });

        logres.setText("Reset");
        logres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(logres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loglog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(acctext)
                                .addComponent(atmtext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(atmlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acclabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acclabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acctext, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atmlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atmtext, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loglog)
                    .addComponent(logres))
                .addGap(40, 40, 40))
        );

        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        balance.setText("Check Balance");
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });

        cheque.setText("Request Chequebook");
        cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeActionPerformed(evt);
            }
        });

        otherq.setText("Request Changes");
        otherq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherqActionPerformed(evt);
            }
        });

        close.setText("Close Account");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jButton10.setText("Fixed Deposit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Pay Tax");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton18.setText("Generate ATM PIN");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Account Details");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FunctionsLayout = new javax.swing.GroupLayout(Functions.getContentPane());
        Functions.getContentPane().setLayout(FunctionsLayout);
        FunctionsLayout.setHorizontalGroup(
            FunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transfer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(balance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cheque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
            .addComponent(otherq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FunctionsLayout.setVerticalGroup(
            FunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FunctionsLayout.createSequentialGroup()
                .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherq, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        nlabel.setText("Name");

        alabel.setText("Address");

        dlabel.setText("Date of Birth");

        glabel.setText("Gender");

        m.setText("Male");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        f.setText("Female");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        o.setText("Others");
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });

        plabel.setText("PAN");

        clabel.setText("Contact Number");

        elabel.setText("Email ID");

        rbutton.setText("Reset");
        rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbuttonActionPerformed(evt);
            }
        });

        sbutton.setText("Submit");
        sbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbuttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Loan Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal Loan", "Home Loan", "Car Loan", "Education Loan" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoanLayout = new javax.swing.GroupLayout(Loan.getContentPane());
        Loan.getContentPane().setLayout(LoanLayout);
        LoanLayout.setHorizontalGroup(
            LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoanLayout.createSequentialGroup()
                        .addComponent(rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(sbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoanLayout.createSequentialGroup()
                        .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(elabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(plabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(glabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(o, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ntext)
                            .addComponent(atext)
                            .addComponent(dtext)
                            .addComponent(m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ptext)
                            .addComponent(ctext)
                            .addComponent(etext)))
                    .addGroup(LoanLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoanLayout.setVerticalGroup(
            LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(error4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ntext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(nlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(alabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(glabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ptext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(plabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(clabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(elabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(LoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbutton)
                    .addComponent(sbutton))
                .addGap(75, 75, 75))
        );

        jLabel3.setText("Application Submitted Successfully!");

        jLabel4.setText("Please Submit the required documents at the nearest branch");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        benname.setText("Beneficiary Name");

        banacc.setText("Beneficiary Account Number");

        ifsc.setText("IFS Code");

        atmp.setText("ATM PIN");

        transr.setText("Reset");
        transr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transrActionPerformed(evt);
            }
        });

        transt.setText("Transfer");
        transt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transtActionPerformed(evt);
            }
        });

        amt.setText("Amount");

        javax.swing.GroupLayout TransferLayout = new javax.swing.GroupLayout(Transfer.getContentPane());
        Transfer.getContentPane().setLayout(TransferLayout);
        TransferLayout.setHorizontalGroup(
            TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferLayout.createSequentialGroup()
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransferLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(transr, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(transt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransferLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(error5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TransferLayout.createSequentialGroup()
                                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(amt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(atmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ifsc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(banacc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(benname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bennamet, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(benacct)
                                    .addComponent(ifsct)
                                    .addComponent(amtt)
                                    .addComponent(jPasswordField2))))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        TransferLayout.setVerticalGroup(
            TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferLayout.createSequentialGroup()
                .addComponent(error5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bennamet, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(benname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(benacct, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(banacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ifsct, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(ifsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amtt, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atmp, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jPasswordField2))
                .addGap(18, 18, 18)
                .addGroup(TransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transr)
                    .addComponent(transt))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButton4)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        noofcheques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25", "50", "100" }));
        noofcheques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noofchequesActionPerformed(evt);
            }
        });

        chlabel.setText("No of cheques");

        req.setText("Request");
        req.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChequebookLayout = new javax.swing.GroupLayout(Chequebook.getContentPane());
        Chequebook.getContentPane().setLayout(ChequebookLayout);
        ChequebookLayout.setHorizontalGroup(
            ChequebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChequebookLayout.createSequentialGroup()
                .addGroup(ChequebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChequebookLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noofcheques, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChequebookLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(req)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ChequebookLayout.setVerticalGroup(
            ChequebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChequebookLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ChequebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noofcheques, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(req)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel8.setText("Request Submitted!");

        jButton6.setText("OK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(41, 41, 41))
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialog6Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton5)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel9.setText("Are you sure you want to close the Account?");

        yes.setText("Yes");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CloseLayout = new javax.swing.GroupLayout(Close.getContentPane());
        Close.getContentPane().setLayout(CloseLayout);
        CloseLayout.setHorizontalGroup(
            CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(CloseLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(yes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CloseLayout.setVerticalGroup(
            CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yes)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel10.setText("Account Closed Successfully!");

        jButton7.setText("OK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog7Layout = new javax.swing.GroupLayout(jDialog7.getContentPane());
        jDialog7.getContentPane().setLayout(jDialog7Layout);
        jDialog7Layout.setHorizontalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialog7Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog7Layout.setVerticalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Address", "Contact", "Email_ID", "Password" }));

        jLabel11.setText("Select Field");

        jLabel12.setText("New Value");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton8.setText("Submit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChangesLayout = new javax.swing.GroupLayout(Changes.getContentPane());
        Changes.getContentPane().setLayout(ChangesLayout);
        ChangesLayout.setHorizontalGroup(
            ChangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangesLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ChangesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(ChangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChangesLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ChangesLayout.createSequentialGroup()
                        .addGroup(ChangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ChangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, 100, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(110, 110, 110))))
        );
        ChangesLayout.setVerticalGroup(
            ChangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ChangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChangesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel13.setText("Request Submitted! Please submit the required documents at the nearest branch");

        jButton9.setText("OK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog8Layout = new javax.swing.GroupLayout(jDialog8.getContentPane());
        jDialog8.getContentPane().setLayout(jDialog8Layout);
        jDialog8Layout.setHorizontalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialog8Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog8Layout.setVerticalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        Tax.setTitle("Tax");
        Tax.setName("Tax "); // NOI18N

        jLabel17.setText("PAN");

        jLabel18.setText("Full Name (as on PAN Card)");

        pan.setName("pan"); // NOI18N

        name1.setName("name1"); // NOI18N

        jLabel19.setText("Assesment Year");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019-2020", "2018-2019", "2017-2018" }));

        jLabel20.setText("Tax Payer Category");

        jRadioButton1.setText("Company");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Individual");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("HUF(Hindu Undivided Family)");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Others");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton3)
                        .addGap(14, 14, 14)
                        .addComponent(jRadioButton4)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel21.setText("Tax Category");

        jRadioButton5.setText("Self-assesment");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Regular assesment");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setText("TDS");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("Advance Tax");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.setText("Others");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jLabel22.setText("Tax Amount");

        amount.setName("amount"); // NOI18N

        jLabel23.setText("Password");

        jButton12.setText("Pay");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Clear");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TaxLayout = new javax.swing.GroupLayout(Tax.getContentPane());
        Tax.getContentPane().setLayout(TaxLayout);
        TaxLayout.setHorizontalGroup(
            TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaxLayout.createSequentialGroup()
                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TaxLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(TaxLayout.createSequentialGroup()
                                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel19))
                                .addGap(39, 39, 39)
                                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name1)
                                    .addComponent(pan)
                                    .addComponent(jComboBox3, 0, 170, Short.MAX_VALUE)))))
                    .addGroup(TaxLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel21))
                    .addGroup(TaxLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton9)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(48, 48, 48)
                        .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton6)
                            .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPasswordField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(amount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                    .addGroup(TaxLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TaxLayout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        TaxLayout.setVerticalGroup(
            TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaxLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addGap(37, 37, 37))
        );

        Tax.getAccessibleContext().setAccessibleDescription("Tax ");

        jLabel24.setText("Account type");

        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fixed Deposit", "Recurring Deposit", "National Savings Certificate(NSC)", " " }));

        jLabel25.setText("Duration");

        years.setText("0");

        jLabel26.setText("Years");

        jLabel27.setText("Months");

        months.setText("0");

        pa.setText("Principal Amount");

        jButton14.setText("Deposit");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Clear");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FDLayout = new javax.swing.GroupLayout(FD.getContentPane());
        FD.getContentPane().setLayout(FDLayout);
        FDLayout.setHorizontalGroup(
            FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FDLayout.createSequentialGroup()
                .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FDLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(error6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FDLayout.createSequentialGroup()
                        .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                    .addComponent(pa)))
                            .addGroup(FDLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton14)))
                        .addGap(61, 61, 61)
                        .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton15)
                            .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(princi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FDLayout.createSequentialGroup()
                                    .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(years))
                                    .addGap(45, 45, 45)
                                    .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(months))))
                            .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        FDLayout.setVerticalGroup(
            FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(17, 17, 17)
                .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pa)
                    .addComponent(princi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error6)
                .addGap(26, 26, 26)
                .addGroup(FDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jLabel28.setText("Tax Payed Successfully!");

        jButton16.setText("OK");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog9Layout = new javax.swing.GroupLayout(jDialog9.getContentPane());
        jDialog9.getContentPane().setLayout(jDialog9Layout);
        jDialog9Layout.setHorizontalGroup(
            jDialog9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog9Layout.createSequentialGroup()
                .addGroup(jDialog9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog9Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog9Layout.setVerticalGroup(
            jDialog9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jButton17.setText("OK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog10Layout = new javax.swing.GroupLayout(jDialog10.getContentPane());
        jDialog10.getContentPane().setLayout(jDialog10Layout);
        jDialog10Layout.setHorizontalGroup(
            jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog10Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jButton17)
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(jDialog10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog10Layout.setVerticalGroup(
            jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jButton20.setText("OK");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog11Layout = new javax.swing.GroupLayout(jDialog11.getContentPane());
        jDialog11.getContentPane().setLayout(jDialog11Layout);
        jDialog11Layout.setHorizontalGroup(
            jDialog11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog11Layout.createSequentialGroup()
                .addGroup(jDialog11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jDialog11Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton20)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jDialog11Layout.setVerticalGroup(
            jDialog11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton20)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        open.setText("Open Savings Account");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        login.setText("Login");
        login.setMaximumSize(new java.awt.Dimension(125, 23));
        login.setPreferredSize(new java.awt.Dimension(125, 23));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        loan.setText("Apply for Loan");
        loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Lao UI", 3, 24)); // NOI18N
        jLabel39.setText("Banking System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loan, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void exitForm(java.awt.event.WindowEvent evt) {                          
        try{con.close();}catch(Exception e){}
        System.exit(0);
    }                         

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Login.setSize(321,202);
        acctext.setText("");
        atmtext.setText("");
        Login.setVisible(true);
    }                                     

    private void openActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Open_Account.setSize(450,500);
        nametext.setText("");
        addtext.setText("");
        dobtext.setText("");
        pantext.setText("");
        context.setText("");
        idtext.setText("");
        jPasswordField1.setText("");
        jTextField2.setText("");
        male.setSelected(false);
        female.setSelected(false);
        others.setSelected(false);
        Open_Account.setVisible(true);
    }                                    

    private void addtextActionPerformed(java.awt.event.ActionEvent evt) {                                        

    }                                       

    private void nametextActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        nametext.setText("");
        addtext.setText("");
        dobtext.setText("");
        pantext.setText("");
        context.setText("");
        idtext.setText("");
        jPasswordField1.setText("");
        jTextField2.setText("");
        male.setSelected(false);
        female.setSelected(false);
        others.setSelected(false);
    }                                     

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {                                       
        male.setSelected(false);
        others.setSelected(false);
    }                                      

    private void othersActionPerformed(java.awt.event.ActionEvent evt) {                                       
        male.setSelected(false);    
        female.setSelected(false);
    }                                      

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {                                     
        female.setSelected(false);
        others.setSelected(false);
    }                                    

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(nametext.getText().equals("")||addtext.getText().equals("")||dobtext.getText().equals("")||pantext.getText().equals("")||context.getText().equals("")||idtext.getText().equals("")||jTextField2.getText().equals("")||jPasswordField1.getText().equals("")||(male.isSelected()==false&&female.isSelected()==false&&others.isSelected()==false))
            error1.setText("No field can remain empty!");
        else{
            String x;
            error1.setText("");
        jDialog1.setSize(500,300);
        int a=r.nextInt(99999);
        int b=r.nextInt(99999);
        String s=Integer.toString(a)+Integer.toString(b);
        if(male.isSelected()==true)
            x="Male";
        else if(female.isSelected()==true)
            x="Female";
        else
            x="Others";
        String pass="";
        char ch[]=jPasswordField1.getPassword();
        for(int i=0;i<ch.length;i++)
            pass+=Character.toString(ch[i]);
        try{
        ps=con.prepareStatement("insert into `database`.`banking details` values(?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,s);
        ps.setString(2,nametext.getText());
        ps.setString(3,pantext.getText());
        ps.setString(4,context.getText());
        ps.setString(5,idtext.getText());
        ps.setString(6,addtext.getText());
        ps.setString(7,dobtext.getText());
        ps.setString(8,x);
        ps.setString(9,jTextField2.getText());
        ps.setString(10,"");
        ps.setString(11,pass);
        ps.execute();
        }catch(Exception e){}
        jLabel1.setText("Savings Account Opened! Account Number: "+s);
        jDialog1.setVisible(true); 
      }
    }                                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jDialog1.setVisible(false);
        Open_Account.setVisible(false);
    }                                        

    private void atmtextActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       

    private void loglogActionPerformed(java.awt.event.ActionEvent evt) {                                       
        char p[]=atmtext.getPassword();
        String pass="";
        for(int i=0;i<p.length;i++)
            pass+=Character.toString(p[i]);
        if(acctext.getText().equals("")||pass.equals(""))
            error2.setText("No field can remain empty!");
        else
        {
        error2.setText("");
        try{rs=st.executeQuery("Select * from `database`.`banking details`");
        int i=0;
        while(rs.next())
        {
            if(rs.getString("Account_Number").equals(acctext.getText())&&rs.getString("Password").equals(pass))
            {
                i=1;
                break;
            }
        }
        if(i==0)
            error2.setText("Details do not match!");
        else{
        Login.setVisible(false);
        Functions.setSize(330,680);
        Functions.setVisible(true);
        }}catch(Exception e){}       
        }
    }                                      

    private void logresActionPerformed(java.awt.event.ActionEvent evt) {                                       
        acctext.setText("");
        atmtext.setText("");   
    }                                      

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {                                        
       try{ rs=st.executeQuery("Select * from `database`.`banking details` where Account_Number='"+acctext.getText()+"'");
        rs.next();
        jLabel7.setText("Account Balance: Rs. "+rs.getString("Balance"));}catch(Exception e){}
       jDialog6.setSize(300,150);
        jDialog6.setVisible(true);
    }                                       

    private void otherqActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Changes.setSize(350,220);
        jTextField1.setText("");
        Changes.setVisible(true);
    }                                      

    private void chequeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Chequebook.setSize(220,140);
        Chequebook.setVisible(true);
    }                                      

    private void loanActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Loan.setSize(350,480);
        ntext.setText("");
        atext.setText("");
        dtext.setText("");
        m.setSelected(false);
        f.setSelected(false);
        o.setSelected(false);
        ptext.setText("");
        ctext.setText("");
        etext.setText("");
        Loan.setVisible(true);
    }                                    

    private void rbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                        
        ntext.setText("");
        atext.setText("");
        dtext.setText("");
        m.setSelected(false);
        f.setSelected(false);
        o.setSelected(false);
        ptext.setText("");
        ctext.setText("");
        etext.setText("");
    }                                       

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }                                          

    private void sbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(ntext.getText().equals("")||atext.getText().equals("")||dtext.getText().equals("")||ptext.getText().equals("")||ctext.getText().equals("")||etext.getText().equals("")||(m.isSelected()==false&&f.isSelected()==false&&o.isSelected()==false))
            error4.setText("No field can remain empty!");
        else
        {
         String x;
        error4.setText("");
        if(m.isSelected()==true)
            x="Male";
        else if(f.isSelected()==true)
            x="Female";
        else
            x="Others";
        try{
        ps=con.prepareStatement("insert into `database`.`loan applicants` values(?,?,?,?,?,?,?,?)");
        ps.setString(1,ptext.getText());
        ps.setString(2,ntext.getText());
        ps.setString(3,atext.getText());
        ps.setString(4,dtext.getText());
        ps.setString(5,x);
        ps.setString(6,ctext.getText());
        ps.setString(7,etext.getText());
        ps.setString(8,((String)jComboBox1.getSelectedItem().toString()));
        ps.execute();        
        jDialog2.setSize(420,260);
        jDialog2.setVisible(true);    }catch(Exception e){}
    }                                       
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Loan.setVisible(false);
        jDialog2.setVisible(false);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jDialog3.setVisible(false);
    }                                        

    private void transrActionPerformed(java.awt.event.ActionEvent evt) {                                       
        bennamet.setText("");
        benacct.setText("");
        ifsct.setText("");
        amtt.setText("");
        jPasswordField2.setText("");
    }                                      

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Transfer.setSize(380,300);  
        bennamet.setText("");
        benacct.setText("");
        ifsct.setText("");
        amtt.setText("");
        jPasswordField2.setText("");
        Transfer.setVisible(true);
    }                                        

    private void transtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(bennamet.getText().equals("")||benacct.getText().equals("")||ifsct.getText().equals("")||jPasswordField2.getText().equals("")||amtt.getText().equals(""))
            error5.setText("No field can remain empty!");
        else
        {
            error5.setText("");
        jDialog4.setSize(370,230);
        double amt=Double.parseDouble(amtt.getText());
        try{rs=st.executeQuery("Select * from `database`.`banking details` where Account_Number='"+acctext.getText()+"'");
        rs.next();
        String pass="";
        char ch[]=jPasswordField2.getPassword();
        for(int i=0;i<ch.length;i++)
            pass+=Character.toString(ch[i]);
        if(rs.getString("ATM_PIN").equals(pass)==false)
            error5.setText("Incorrect ATM PIN!");
        else{
        double bal=Double.parseDouble(rs.getString("Balance"));
        if(bal<amt)
        {
            jLabel6.setText("Insufficient funds!");
            jDialog4.setVisible(true);            
        }
        else
        {
        int a=r.nextInt(99999);
        int b=r.nextInt(99999);
        bal=bal-amt;
        String s=Integer.toString(a)+Integer.toString(b);
        st.executeUpdate("Update `database`.`banking details` set Balance='"+Double.toString(bal)+"' where Account_Number='"+acctext.getText()+"'");
        jLabel6.setText("Transfer Successful! Reference number: "+s);
        jDialog4.setVisible(true); 
        rs=st.executeQuery("Select * from `database`.`banking details` where Account_Number='"+benacct.getText()+"'");
        if(rs.next())
        {
            double bal1=Double.parseDouble(rs.getString("Balance"));
            bal1=bal1+amt;
        st.executeUpdate("Update `database`.`banking details` set Balance='"+Double.toString(bal1)+"' where Account_Number='"+benacct.getText()+"'");            
        }
        }}}catch(Exception e){}}
    }                                      

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Transfer.setVisible(false);
        jDialog4.setVisible(false);
    }                                        

    private void reqActionPerformed(java.awt.event.ActionEvent evt) {                                    
        jDialog5.setSize(150,130);
        jDialog5.setVisible(true);
    }                                   

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Chequebook.setVisible(false);
        jDialog5.setVisible(false);
    }                                        

    private void mActionPerformed(java.awt.event.ActionEvent evt) {                                  
        f.setSelected(false);
        o.setSelected(false);
    }                                 

    private void fActionPerformed(java.awt.event.ActionEvent evt) {                                  
        m.setSelected(false);
        o.setSelected(false);
    }                                 

    private void oActionPerformed(java.awt.event.ActionEvent evt) {                                  
        m.setSelected(false);
        f.setSelected(false);
    }                                 

    private void noofchequesActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jDialog6.setVisible(false);        // TODO add your handling code here:
    }                                        

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Close.setSize(320,150);
        Close.setVisible(true);        // TODO add your handling code here:
    }                                     

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try{st.executeUpdate("Delete from `database`.`banking details` where Account_Number='"+acctext.getText()+"'");}catch(Exception e){}
        Close.setVisible(false);
        Functions.setVisible(false);
        jDialog7.setSize(220,120);
        jDialog7.setVisible(true);        // TODO add your handling code here:
    }                                   

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jDialog7.setVisible(false);        // TODO add your handling code here:
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(jTextField1.getText().equals(""))
            jLabel14.setText("Please enter the new value!");
        else
        {
            jLabel14.setText("");
            try{
                st.executeUpdate("Update `database`.`banking details` set "+(String)jComboBox2.getSelectedItem().toString()+"='"+jTextField1.getText()+"' where Account_Number='"+acctext.getText()+"'");
            }
            catch(Exception e){}
            jDialog8.setSize(530,140);
            jDialog8.setVisible(true);
            }
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jDialog8.setVisible(false);
        Changes.setVisible(false);        // TODO add your handling code here:
    }                                        

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      jRadioButton1.setSelected(false);
      jRadioButton3.setSelected(false);
      jRadioButton4.setSelected(false);
      jRadioButton5.setSelected(false);
      jRadioButton6.setSelected(false);
      jRadioButton7.setSelected(false);
      jRadioButton8.setSelected(false);
      jRadioButton9.setSelected(false);         // TODO add your handling code here:
    }                                             

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
    if(pan.getText().equals("")||name1.getText().equals("")||amount.getText().equals("")||jPasswordField3.getText().equals(""))
    { 
       error.setText("Please fill all the details");
    }
    else
    {
        String pass="";
        char ch[]=jPasswordField3.getPassword();
        for(int i=0;i<ch.length;i++)
            pass+=Character.toString(ch[i]);
        try{
        rs=st.executeQuery("Select * from `database`.`banking details` where Account_Number='"+acctext.getText()+"'");
        rs.next();
        if(rs.getString("Password").equals(pass))
        {
            double bal=Double.parseDouble(rs.getString("Balance"))-Double.parseDouble(amount.getText());
            st.executeUpdate("Update `database`.`banking details` Set Balance='"+Double.toString(bal)+"' where Account_Number='"+acctext.getText()+"'");
            jDialog9.setSize(230,130);
            jDialog9.setVisible(true);
        }
        else
        {
            error.setText("Invalid Password!");
        }
        }catch(Exception e){}
    }
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
      pan.setText("");
      name1.setText("");
      amount.setText("");
      jPasswordField3.setText("");
      jRadioButton1.setSelected(false);
      jRadioButton2.setSelected(false);
      jRadioButton3.setSelected(false);
      jRadioButton4.setSelected(false);
      jRadioButton5.setSelected(false);
      jRadioButton6.setSelected(false);
      jRadioButton7.setSelected(false);
      jRadioButton8.setSelected(false);
      jRadioButton9.setSelected(false);      
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        years.setText("");
        months.setText("");
        princi.setText("");  
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
     if(princi.getText().equals(""))
         error6.setText("Please enter the principal amount");
     else{ 
     double a,b,c;
     int x,y,z;
     x=Integer.parseInt(princi.getText());
     y=Integer.parseInt(years.getText());
     z=Integer.parseInt(months.getText());
     a=x*(Math.pow(1.06,y));
     b=z*((a+(a*0.06))/12);
     c=a+b;
     if(option.getSelectedItem().toString().equals("Fixed Deposit"))
     {
         jLabel29.setText("Account created Successfully! Rate of Interest= 6.5%. Maturity Amount: Rs. "+Double.toString(c));
        value.setText(Double.toString(c));  
     }
     else if(option.getSelectedItem().toString().equals("Recurring Deposit"))
     {
         years.setText("5");
         months.setText("0");    
         jLabel29.setText("Account created Successfully! Maturity Amount: Rs. "+Double.toString(x*71.0));         
     }
     else if(option.getSelectedItem().toString().equals("National Savings Certificate(NSC)"))
     {
         years.setText("5");
         months.setText("0");
         jLabel29.setText("Account created Successfully! Rate of Ineterest= 8%. Maturity Amount: Rs. "+Double.toString(x*1.4693));
     }
     try{rs=st.executeQuery("Select * from `database`.`banking details` where Account_Number='"+acctext.getText()+"'");
     rs.next();
     double bal=Double.parseDouble(rs.getString("Balance"));
     bal-=Double.parseDouble(princi.getText());
     st.executeUpdate("Update `database`.`banking details` set Balance='"+Double.toString(bal)+"' where Account_Number='"+acctext.getText()+"'");}catch(Exception e){}
     jDialog10.setSize(480,130);
     jDialog10.setVisible(true);}
    }                                         

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        FD.setSize(430,330);
        years.setText("");
        months.setText("");
        princi.setText("");
        FD.setVisible(true);        // TODO add your handling code here:
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Tax.setSize(420,450);
      pan.setText("");
      name1.setText("");
      amount.setText("");
      jPasswordField3.setText("");
      jRadioButton1.setSelected(false);
      jRadioButton2.setSelected(false);
      jRadioButton3.setSelected(false);
      jRadioButton4.setSelected(false);
      jRadioButton5.setSelected(false);
      jRadioButton6.setSelected(false);
      jRadioButton7.setSelected(false);
      jRadioButton8.setSelected(false);
      jRadioButton9.setSelected(false);         
        Tax.setVisible(true);        // TODO add your handling code here:
    }                                         

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      jRadioButton2.setSelected(false);
      jRadioButton3.setSelected(false);
      jRadioButton4.setSelected(false);        // TODO add your handling code here:
    }                                             

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      jRadioButton1.setSelected(false);
      jRadioButton2.setSelected(false);
      jRadioButton4.setSelected(false);       // TODO add your handling code here:
    }                                             

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      jRadioButton1.setSelected(false);
      jRadioButton2.setSelected(false);
      jRadioButton3.setSelected(false);         // TODO add your handling code here:
    }                                             

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      jRadioButton6.setSelected(false);
      jRadioButton7.setSelected(false);
      jRadioButton8.setSelected(false);
      jRadioButton9.setSelected(false);        // TODO add your handling code here:
    }                                             

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      jRadioButton5.setSelected(false);
      jRadioButton7.setSelected(false);
      jRadioButton8.setSelected(false);
      jRadioButton9.setSelected(false);        // TODO add your handling code here:
    }                                             

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      jRadioButton5.setSelected(false);
      jRadioButton6.setSelected(false);
      jRadioButton8.setSelected(false);
      jRadioButton9.setSelected(false);        // TODO add your handling code here:
    }                                             

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      jRadioButton5.setSelected(false);
      jRadioButton6.setSelected(false);
      jRadioButton7.setSelected(false);
      jRadioButton9.setSelected(false);        // TODO add your handling code here:
    }                                             

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      jRadioButton5.setSelected(false);
      jRadioButton6.setSelected(false);
      jRadioButton7.setSelected(false);
      jRadioButton8.setSelected(false);      // TODO add your handling code here:
    }                                             

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jDialog9.setVisible(false);
        Tax.setVisible(false);        // TODO add your handling code here:
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jDialog10.setVisible(false);
        FD.setVisible(false);        // TODO add your handling code here:
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int pin=r.nextInt(9999);
        jDialog3.setSize(300,300);
        jDialog3.setVisible(true);
        jLabel5.setText("Your ATM PIN: "+Integer.toString(pin));
        try{st.executeUpdate("Update `database`.`banking details` set ATM_PIN='"+Integer.toString(pin)+"' where Account_Number='"+acctext.getText()+"'");}catch(Exception e){}        // TODO add your handling code here:
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jDialog11.setSize(480,380);
        try{
        rs=st.executeQuery("Select * from `database`.`banking details` where Account_Number='"+acctext.getText()+"'");
        rs.next();
        jLabel30.setText("Name: "+rs.getString("Name"));
        jLabel31.setText("Account Number: "+rs.getString("Account_Number"));
        jLabel32.setText("Address: "+rs.getString("Address"));
        jLabel33.setText("Date of Birth: "+rs.getString("DOB"));
        jLabel34.setText("Gender: "+rs.getString("Gender"));
        jLabel35.setText("PAN: "+rs.getString("PAN"));
        jLabel36.setText("Contact Number: "+rs.getString("Contact"));
        jLabel37.setText("Email ID: "+rs.getString("Email_ID"));
        jLabel38.setText("Balance: Rs. "+rs.getString("Balance"));
        }catch(Exception e){}
        jDialog11.setVisible(true);
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jDialog11.setVisible(false);        // TODO add your handling code here:
    }                                         

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BankingSystem obj=new BankingSystem();
                obj.setSize(485,360);
                obj.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify                     
    private javax.swing.JFrame Changes;
    private javax.swing.JFrame Chequebook;
    private javax.swing.JFrame Close;
    private javax.swing.JFrame FD;
    private javax.swing.JFrame Functions;
    private javax.swing.JFrame Loan;
    private javax.swing.JFrame Login;
    private javax.swing.JFrame Open_Account;
    private javax.swing.JFrame Tax;
    private javax.swing.JFrame Transfer;
    private javax.swing.JLabel acclabel;
    private javax.swing.JTextField acctext;
    private javax.swing.JLabel addlabel;
    private javax.swing.JTextField addtext;
    private javax.swing.JLabel alabel;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel amt;
    private javax.swing.JTextField amtt;
    private javax.swing.JTextField atext;
    private javax.swing.JLabel atmlabel;
    private javax.swing.JLabel atmp;
    private javax.swing.JPasswordField atmtext;
    private javax.swing.JButton balance;
    private javax.swing.JLabel banacc;
    private javax.swing.JTextField benacct;
    private javax.swing.JLabel benname;
    private javax.swing.JTextField bennamet;
    private javax.swing.JButton cheque;
    private javax.swing.JLabel chlabel;
    private javax.swing.JLabel clabel;
    private javax.swing.JButton close;
    private javax.swing.JLabel conlabel;
    private javax.swing.JTextField context;
    private javax.swing.JTextField ctext;
    private javax.swing.JLabel dlabel;
    private javax.swing.JLabel doblabel;
    private javax.swing.JTextField dobtext;
    private javax.swing.JTextField dtext;
    private javax.swing.JLabel elabel;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error4;
    private javax.swing.JLabel error5;
    private javax.swing.JLabel error6;
    private javax.swing.JTextField etext;
    private javax.swing.JRadioButton f;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel genlabel;
    private javax.swing.JLabel glabel;
    private javax.swing.JLabel idlabel;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel ifsc;
    private javax.swing.JTextField ifsct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog10;
    private javax.swing.JDialog jDialog11;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JDialog jDialog8;
    private javax.swing.JDialog jDialog9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loan;
    private javax.swing.JButton login;
    private javax.swing.JButton loglog;
    private javax.swing.JButton logres;
    private javax.swing.JRadioButton m;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField months;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField nametext;
    private javax.swing.JLabel nlabel;
    private javax.swing.JComboBox<String> noofcheques;
    private javax.swing.JTextField ntext;
    private javax.swing.JRadioButton o;
    private javax.swing.JButton open;
    private javax.swing.JComboBox<String> option;
    private javax.swing.JButton otherq;
    private javax.swing.JRadioButton others;
    private javax.swing.JLabel pa;
    private javax.swing.JTextField pan;
    private javax.swing.JLabel panlabel;
    private javax.swing.JTextField pantext;
    private javax.swing.JLabel plabel;
    private javax.swing.JTextField princi;
    private javax.swing.JTextField ptext;
    private javax.swing.JButton rbutton;
    private javax.swing.JButton req;
    private javax.swing.JButton reset;
    private javax.swing.JButton sbutton;
    private javax.swing.JButton submit;
    private javax.swing.JButton transfer;
    private javax.swing.JButton transr;
    private javax.swing.JButton transt;
    private javax.swing.JLabel value;
    private javax.swing.JTextField years;
    private javax.swing.JButton yes;
    // End of variables declaration                   
}