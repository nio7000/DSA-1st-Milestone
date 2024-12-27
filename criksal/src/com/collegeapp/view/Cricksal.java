package com.collegeapp.view;

/**
 * @author Nikesh Oli
 */

public class Cricksal extends javax.swing.JFrame {

    private java.awt.CardLayout cardLayout;
    
    /**
     * Creates new form 
     */
    
    public Cricksal() {
        initComponents();
        initializeLayout(); // Set up CardLayout and add screens
        startProgress(); // Show loading screen and initiate progress  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnlMainScreen = new javax.swing.JPanel();
        pnlMainBar = new javax.swing.JPanel();
        lblMainBarSlogan = new javax.swing.JLabel();
        lblMainBarLogo = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        tabPaneMain = new javax.swing.JTabbedPane();
        pnlHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        pnlStudentList = new javax.swing.JPanel();
        pnlLoginScreen = new javax.swing.JPanel();
        pnlLoginLeft = new javax.swing.JPanel();
        lblLoginSlogan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblLoginTitle = new javax.swing.JLabel();
        txtFldLoginUsername = new javax.swing.JTextField();
        pwdFldLogin = new javax.swing.JPasswordField();
        lblLoginSubTitle = new javax.swing.JLabel();
        lblLoginForgotPwd = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblLoginError = new javax.swing.JLabel();
        pnlLoadingScreen = new javax.swing.JPanel();
        lblLoadingLogo = new javax.swing.JLabel();
        pgBarSplashScreen = new javax.swing.JProgressBar(0,100);
        lblLoading = new javax.swing.JLabel();

        pnlMainScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainScreen.setMaximumSize(new java.awt.Dimension(1130, 514));
        pnlMainScreen.setMinimumSize(new java.awt.Dimension(1130, 514));
        pnlMainScreen.setPreferredSize(new java.awt.Dimension(1130, 514));

        pnlMainBar.setBackground(new java.awt.Color(153, 153, 255));

        lblMainBarSlogan.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblMainBarSlogan.setForeground(new java.awt.Color(255, 255, 255));
        lblMainBarSlogan.setText("It's not just Cricket. It's an emotion.");

        lblMainBarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/collegeapp/resources/logo_sm.png"))); // NOI18N

        btnLogout.setBackground(new java.awt.Color(153, 153, 255));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainBarLayout = new javax.swing.GroupLayout(pnlMainBar);
        pnlMainBar.setLayout(pnlMainBarLayout);
        pnlMainBarLayout.setHorizontalGroup(
            pnlMainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMainBarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMainBarSlogan, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMainBarLayout.setVerticalGroup(
            pnlMainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMainBarLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMainBarSlogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPaneMain.setBackground(new java.awt.Color(153, 153, 255));
        tabPaneMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        tabPaneMain.setForeground(new java.awt.Color(255, 255, 255));
        tabPaneMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        pnlHome.setForeground(new java.awt.Color(153, 153, 255));

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("          Search");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Welcome back Admin, ");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Available Cricksal's near you");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Would you like to do some reservations?");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Kamalpokhari Cricksal", "City Centre", "9876543210", "cricksal@nio.com", "Rs.1500"},
                {"2", "Thamel", "Near The Kathmandu Guest House", "9876543210", "cricksal@nio.com", "Rs.1700"},
                {"3", "Nakxal", "Bhatbhatini Supermart", "987654320", "cricksal@nio.com", "Rs.1500"},
                {"4", "Durbarmarg", "Naryanhiti Palace", "987654320", "cricksal@nio.com", "Rs.1500"},
                {"5", "Kalopul", "Shifal Ground", "987654320", "cricksal@nio.com", "Rs.1500"},
                {"6", "Gyaneshor", "Near Rato pul", "987654320", "cricksal@nio.com", null},
                {"7", "New Baneshwor", "Eye Plex Mall", "987654320", "cricksal@nio.com", "Rs.1500"}
            },
            new String [] {
                "ID", "Name", "Address", "Phone Number", "Email", "Price/hrs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");

        jTextField1.setForeground(new java.awt.Color(153, 153, 255));

        jLabel6.setText("ID");

        jLabel7.setText("Name");

        jTextField2.setForeground(new java.awt.Color(153, 153, 255));

        jLabel8.setText("Address");

        jTextField3.setForeground(new java.awt.Color(153, 153, 255));

        jLabel9.setText("Phone Number");

        jTextField4.setForeground(new java.awt.Color(153, 153, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel10.setText("Email");

        jTextField5.setForeground(new java.awt.Color(153, 153, 255));

        jLabel11.setText("Price/hrs");

        jTextField6.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(624, 624, 624)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHomeLayout.createSequentialGroup()
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tabPaneMain.addTab("Home", pnlHome);

        pnlStudentList.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlStudentListLayout = new javax.swing.GroupLayout(pnlStudentList);
        pnlStudentList.setLayout(pnlStudentListLayout);
        pnlStudentListLayout.setHorizontalGroup(
            pnlStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1134, Short.MAX_VALUE)
        );
        pnlStudentListLayout.setVerticalGroup(
            pnlStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        tabPaneMain.addTab("Bookings", pnlStudentList);

        javax.swing.GroupLayout pnlMainScreenLayout = new javax.swing.GroupLayout(pnlMainScreen);
        pnlMainScreen.setLayout(pnlMainScreenLayout);
        pnlMainScreenLayout.setHorizontalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMainScreenLayout.setVerticalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addComponent(pnlMainBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPaneMain)
                .addContainerGap())
        );

        pnlLoginScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoginScreen.setMaximumSize(new java.awt.Dimension(1130, 514));
        pnlLoginScreen.setMinimumSize(new java.awt.Dimension(1130, 514));
        pnlLoginScreen.setPreferredSize(new java.awt.Dimension(1458, 508));

        pnlLoginLeft.setBackground(new java.awt.Color(153, 153, 255));
        pnlLoginLeft.setMaximumSize(new java.awt.Dimension(570, 514));
        pnlLoginLeft.setMinimumSize(new java.awt.Dimension(570, 514));
        pnlLoginLeft.setPreferredSize(new java.awt.Dimension(570, 514));

        lblLoginSlogan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoginSlogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginSlogan.setText("Empowering Your Academic Journey, One Login at a Time");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/collegeapp/resources/crik.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout pnlLoginLeftLayout = new javax.swing.GroupLayout(pnlLoginLeft);
        pnlLoginLeft.setLayout(pnlLoginLeftLayout);
        pnlLoginLeftLayout.setHorizontalGroup(
            pnlLoginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLeftLayout.createSequentialGroup()
                .addGap(2116, 2116, 2116)
                .addComponent(lblLoginSlogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlLoginLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLoginLeftLayout.setVerticalGroup(
            pnlLoginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLeftLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(lblLoginSlogan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblLoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(153, 153, 255));
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Sign in to CollegeApp");

        txtFldLoginUsername.setForeground(new java.awt.Color(153, 153, 255));
        txtFldLoginUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(234, 192, 32))); // NOI18N
        txtFldLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldLoginUsernameActionPerformed(evt);
            }
        });

        pwdFldLogin.setForeground(new java.awt.Color(153, 153, 255));
        pwdFldLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(234, 192, 32))); // NOI18N
        pwdFldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdFldLoginActionPerformed(evt);
            }
        });

        lblLoginSubTitle.setBackground(new java.awt.Color(153, 153, 255));
        lblLoginSubTitle.setForeground(new java.awt.Color(153, 153, 255));
        lblLoginSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginSubTitle.setText("Please enter your login details below using this app.");

        lblLoginForgotPwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoginForgotPwd.setForeground(new java.awt.Color(153, 153, 255));
        lblLoginForgotPwd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginForgotPwd.setText("Forgot your password?");

        btnLogin.setBackground(new java.awt.Color(153, 153, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblLoginError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoginError.setForeground(new java.awt.Color(255, 0, 0));
        lblLoginError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlLoginScreenLayout = new javax.swing.GroupLayout(pnlLoginScreen);
        pnlLoginScreen.setLayout(pnlLoginScreenLayout);
        pnlLoginScreenLayout.setHorizontalGroup(
            pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                .addGap(738, 738, 738)
                .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLoginSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLoginForgotPwd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLoginError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLoginLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdFldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFldLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        pnlLoginScreenLayout.setVerticalGroup(
            pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                .addComponent(pnlLoginLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblLoginError)
                .addGap(26, 26, 26)
                .addComponent(lblLoginTitle)
                .addGap(18, 18, 18)
                .addComponent(lblLoginSubTitle)
                .addGap(20, 20, 20)
                .addComponent(txtFldLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwdFldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLoginForgotPwd)
                .addGap(36, 36, 36)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 514));
        setSize(new java.awt.Dimension(1130, 514));

        pnlLoadingScreen.setBackground(new java.awt.Color(255, 255, 255));

        lblLoadingLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLoadingLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoadingLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/collegeapp/resources/logo_big.png"))); // NOI18N

        pgBarSplashScreen.setStringPainted(true);
        pgBarSplashScreen.setBackground(new java.awt.Color(153, 153, 255));
        pgBarSplashScreen.setForeground(new java.awt.Color(0, 0, 0));

        lblLoading.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoading.setText("Loading...");

        javax.swing.GroupLayout pnlLoadingScreenLayout = new javax.swing.GroupLayout(pnlLoadingScreen);
        pnlLoadingScreen.setLayout(pnlLoadingScreenLayout);
        pnlLoadingScreenLayout.setHorizontalGroup(
            pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoadingScreenLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoadingScreenLayout.createSequentialGroup()
                        .addComponent(lblLoadingLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoadingScreenLayout.createSequentialGroup()
                        .addComponent(pgBarSplashScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(498, 498, 498))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoadingScreenLayout.createSequentialGroup()
                        .addComponent(lblLoading)
                        .addGap(668, 668, 668))))
        );
        pnlLoadingScreenLayout.setVerticalGroup(
            pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoadingScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoadingLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(pgBarSplashScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoading)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    private void initializeLayout() {
        cardLayout = new java.awt.CardLayout();
        getContentPane().setLayout(cardLayout);

        // Add panels with unique identifiers
        getContentPane().add(pnlLoadingScreen, "LoadingScreen");
        getContentPane().add(pnlLoginScreen, "LoginScreen");
        getContentPane().add(pnlMainScreen, "MainScreen");

        // Start with the loading screen
        loadScreen("LoadingScreen");
    }

    private void startProgress() {
        javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(30); // Simulated delay for progress bar
                    publish(i); // Publish progress
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                pgBarSplashScreen.setValue(progress);
            }

            @Override
            protected void done() {
                loadScreen("LoginScreen"); // Switch to login screen
            }
        };
        worker.execute(); // Start the worker thread
    }


    /**
     * Switches the application screen to the specified screen name.
     *
     * @param screenName The name of the screen to display.
     */
    
    private void loadScreen(String screenName) {
        cardLayout.show(getContentPane(), screenName);
    }

    /**
     * Handles the login button action. Validates the username and password
     * input and navigates to the main screen if credentials are correct.
     * Displays appropriate error messages otherwise.
     *
     * @param evt The action event triggered by the login button.
     */
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Get the username and password input
        String username = txtFldLoginUsername.getText();
        String password = new String(pwdFldLogin.getPassword());

        // Check if username or password is empty
        if (username.isEmpty() || password.isEmpty()) {
            lblLoginError.setText("Please enter your username and password.");
        } // Check if username and password are incorrect
        else if (!username.equals("admin") || !password.equals("admin")) {
            lblLoginError.setText("Username and password mismatch.");
        } // If credentials are correct, proceed to load the main screen
        else {
            lblLoginError.setText(""); // Clear any previous error messages
            loadScreen("MainScreen"); // Load the main screen
        }
    }                                        

    /**
     * Handles the logout button action. Clears the login fields and switches
     * back to the login screen.
     *
     * @param evt The action event triggered by the logout button.
     */
    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        pwdFldLogin.setText("");
        txtFldLoginUsername.setText("");
        loadScreen("LoginScreen"); // Load the main screen
    }                                         

    private void pwdFldLoginActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void txtFldLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           
   
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
            java.util.logging.Logger.getLogger(Cricksal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cricksal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cricksal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cricksal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Cricksal app = new Cricksal();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            app.setVisible(true);
        });

        app.startProgress();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblLoadingLogo;
    private javax.swing.JLabel lblLoginError;
    private javax.swing.JLabel lblLoginForgotPwd;
    private javax.swing.JLabel lblLoginSlogan;
    private javax.swing.JLabel lblLoginSubTitle;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblMainBarLogo;
    private javax.swing.JLabel lblMainBarSlogan;
    private javax.swing.JProgressBar pgBarSplashScreen;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlLoadingScreen;
    private javax.swing.JPanel pnlLoginLeft;
    private javax.swing.JPanel pnlLoginScreen;
    private javax.swing.JPanel pnlMainBar;
    private javax.swing.JPanel pnlMainScreen;
    private javax.swing.JPanel pnlStudentList;
    private javax.swing.JPasswordField pwdFldLogin;
    private javax.swing.JTabbedPane tabPaneMain;
    private javax.swing.JTextField txtFldLoginUsername;
    // End of variables declaration                   
}
