package GUI;

import Model.Access_Denied;
import Database.DB;
import Model.Exit_Warning;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main extends javax.swing.JFrame {

    private String user_Type;

    public Main() {
        initComponents();
        setExtendedState(Main.MAXIMIZED_BOTH);
        setTimeAndDate();
    }

    public Main(String userType, String empID, String userName) {
        this();
        user_Type = userType;
        this.userName.setText(userName);
        privilages(empID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Sales = new javax.swing.JButton();
        btn_Products = new javax.swing.JButton();
        btn_Inventory = new javax.swing.JButton();
        btn_Customers = new javax.swing.JButton();
        btn_Reports = new javax.swing.JButton();
        btn_Users = new javax.swing.JButton();
        btn_Settings = new javax.swing.JButton();
        date_label = new javax.swing.JLabel();
        time_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_Minimize = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_empName = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        txt_userType = new javax.swing.JLabel();
        btn_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(38, 57, 75));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Sales.setBackground(new java.awt.Color(0, 0, 0));
        btn_Sales.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pos1.png"))); // NOI18N
        btn_Sales.setBorderPainted(false);
        btn_Sales.setContentAreaFilled(false);
        btn_Sales.setFocusPainted(false);
        btn_Sales.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pos2.png"))); // NOI18N
        btn_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 68));

        btn_Products.setBackground(new java.awt.Color(38, 57, 75));
        btn_Products.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_Products.setForeground(new java.awt.Color(38, 57, 75));
        btn_Products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/products1.png"))); // NOI18N
        btn_Products.setBorderPainted(false);
        btn_Products.setContentAreaFilled(false);
        btn_Products.setFocusPainted(false);
        btn_Products.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/products2.png"))); // NOI18N
        btn_Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Products, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 68));

        btn_Inventory.setBackground(new java.awt.Color(38, 57, 75));
        btn_Inventory.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_Inventory.setForeground(new java.awt.Color(38, 57, 75));
        btn_Inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory1.png"))); // NOI18N
        btn_Inventory.setBorderPainted(false);
        btn_Inventory.setContentAreaFilled(false);
        btn_Inventory.setFocusPainted(false);
        btn_Inventory.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory2.png"))); // NOI18N
        btn_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 68));

        btn_Customers.setBackground(new java.awt.Color(38, 57, 75));
        btn_Customers.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_Customers.setForeground(new java.awt.Color(38, 57, 75));
        btn_Customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer1.png"))); // NOI18N
        btn_Customers.setBorderPainted(false);
        btn_Customers.setContentAreaFilled(false);
        btn_Customers.setFocusPainted(false);
        btn_Customers.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer2.png"))); // NOI18N
        btn_Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CustomersActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 200, 68));

        btn_Reports.setBackground(new java.awt.Color(38, 57, 75));
        btn_Reports.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_Reports.setForeground(new java.awt.Color(38, 57, 75));
        btn_Reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reports1.png"))); // NOI18N
        btn_Reports.setBorderPainted(false);
        btn_Reports.setContentAreaFilled(false);
        btn_Reports.setFocusPainted(false);
        btn_Reports.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reports2.png"))); // NOI18N
        btn_Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 200, 68));

        btn_Users.setBackground(new java.awt.Color(38, 57, 75));
        btn_Users.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_Users.setForeground(new java.awt.Color(38, 57, 75));
        btn_Users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user1.png"))); // NOI18N
        btn_Users.setBorderPainted(false);
        btn_Users.setContentAreaFilled(false);
        btn_Users.setFocusPainted(false);
        btn_Users.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user2.png"))); // NOI18N
        btn_Users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsersActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 200, 68));

        btn_Settings.setBackground(new java.awt.Color(38, 57, 75));
        btn_Settings.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_Settings.setForeground(new java.awt.Color(38, 57, 75));
        btn_Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings1.png"))); // NOI18N
        btn_Settings.setBorderPainted(false);
        btn_Settings.setContentAreaFilled(false);
        btn_Settings.setFocusPainted(false);
        btn_Settings.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings2.png"))); // NOI18N
        btn_Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SettingsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 200, 68));

        date_label.setBackground(new java.awt.Color(255, 255, 255));
        date_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        date_label.setForeground(new java.awt.Color(204, 204, 204));
        date_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_label.setText("2018-07-23");
        date_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(date_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 200, -1));

        time_label.setBackground(new java.awt.Color(255, 255, 255));
        time_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        time_label.setForeground(new java.awt.Color(204, 204, 204));
        time_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_label.setText("10:10:10");
        time_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(time_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 200, 770));

        view.setBackground(new java.awt.Color(255, 255, 255));
        view.setMaximumSize(new java.awt.Dimension(1024, 768));
        view.setPreferredSize(new java.awt.Dimension(1024, 768));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Plex.png"))); // NOI18N

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        getContentPane().add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 1170, 710));

        jPanel2.setBackground(new java.awt.Color(243, 246, 248));
        jPanel2.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel2.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize1.png"))); // NOI18N
        btn_Minimize.setBorder(null);
        btn_Minimize.setBorderPainted(false);
        btn_Minimize.setContentAreaFilled(false);
        btn_Minimize.setFocusPainted(false);
        btn_Minimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize2.png"))); // NOI18N
        btn_Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinimizeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 35, 25));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/users.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        txt_empName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.add(txt_empName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 230, 20));

        userName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        userName.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 20));

        txt_userType.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_userType.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(txt_userType, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, 80, 20));

        btn_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_1.png"))); // NOI18N
        btn_Exit.setBorder(null);
        btn_Exit.setBorderPainted(false);
        btn_Exit.setContentAreaFilled(false);
        btn_Exit.setFocusPainted(false);
        btn_Exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_2.png"))); // NOI18N
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 35, 25));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1170, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesActionPerformed
        SalesPopup sp = new SalesPopup(this, user_Type);
        sp.setLocation(200, 180);
        sp.setVisible(true);

    }//GEN-LAST:event_btn_SalesActionPerformed

    private void btn_ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductsActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("DataEntry")) {
            ProductsPopup pp = new ProductsPopup(this, user_Type);
            pp.setLocation(200, 250);
            pp.setVisible(true);

        } else if (user_Type.equals("Cashier")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(this, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_ProductsActionPerformed

    private void btn_MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizeActionPerformed
        setExtendedState(Main.ICONIFIED);
    }//GEN-LAST:event_btn_MinimizeActionPerformed

    private void btn_CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CustomersActionPerformed
        Customers cus = new Customers(this, user_Type);
        view.removeAll();
        view.revalidate();
        view.repaint();
        view.add((JPanel) cus.panel);
    }//GEN-LAST:event_btn_CustomersActionPerformed

    private void btn_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryActionPerformed
        InventoryPopup inpop = new InventoryPopup(this, user_Type);
        inpop.setLocation(200, 320);
        inpop.setVisible(true);
    }//GEN-LAST:event_btn_InventoryActionPerformed

    private void btn_ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportsActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager")) {
            Reports rep = new Reports(this);
            view.removeAll();
            view.revalidate();
            view.repaint();
            view.add((JPanel) rep.panel);

        } else if (user_Type.equals("Cashier") | user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(this, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }

    }//GEN-LAST:event_btn_ReportsActionPerformed

    private void btn_UsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsersActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager")) {
            UserPopup us = new UserPopup(this, user_Type);
            us.setLocation(200, 530);
            us.setVisible(true);

        } else if (user_Type.equals("Cashier") | user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(this, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_UsersActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        Exit_Warning ew = new Exit_Warning();
        if (JOptionPane.showConfirmDialog(this, ew.panel, "  Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE) == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SettingsActionPerformed
        if (user_Type.equals("Admin")) {
            Settings s = new Settings(this);
            view.removeAll();
            view.revalidate();
            view.repaint();
            view.add((JPanel) s.panel);

        } else if (user_Type.equals("Manager") | user_Type.equals("Cashier") | user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(this, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_SettingsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!userName.getText().equals("Static_User")) {
            ChangePassword cp = new ChangePassword(this, userName.getText());
            cp.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Customers;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Inventory;
    private javax.swing.JButton btn_Minimize;
    private javax.swing.JButton btn_Products;
    private javax.swing.JButton btn_Reports;
    private javax.swing.JButton btn_Sales;
    private javax.swing.JButton btn_Settings;
    private javax.swing.JButton btn_Users;
    private javax.swing.JLabel date_label;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel time_label;
    public javax.swing.JLabel txt_empName;
    private javax.swing.JLabel txt_userType;
    private javax.swing.JLabel userName;
    public final javax.swing.JPanel view = new javax.swing.JPanel();
    // End of variables declaration//GEN-END:variables

    Date d;
    SimpleDateFormat getDate = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat getTime = new SimpleDateFormat("HH:mm:ss");

    private void setTimeAndDate() {
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d = new Date();
                date_label.setText(getDate.format(d));
                time_label.setText(getTime.format(d));
            }
        });
        t.start();
    }

    private void privilages(String id) {
        if (id.equals("$Admin")) {
            txt_userType.setText("Super Admin");
            txt_empName.setText("$Admin");
        } else {
            try {
                ResultSet rs = DB.search(" SELECT fname, lname FROM employee WHERE id_employee = '" + id + "' ");
                if (rs.next()) {
                    txt_userType.setText(user_Type);
                    txt_empName.setText(rs.getString(1) + " " + rs.getString(2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
