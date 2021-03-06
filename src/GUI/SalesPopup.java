package GUI;

import Model.Access_Denied;
import Database.DB;
import Model.AreUSure;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SalesPopup extends javax.swing.JFrame {

    private Main menu;
    private String user_Type;

    public SalesPopup() {
        initComponents();
    }

    public SalesPopup(Main m, String userType) {
        this();
        this.menu = m;
        this.user_Type = userType;
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
        btn_newInvoice = new javax.swing.JButton();
        btn_salesHistory = new javax.swing.JButton();
        btn_salesReturn = new javax.swing.JButton();
        btn_cashRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(38, 57, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_newInvoice.setBackground(new java.awt.Color(38, 57, 75));
        btn_newInvoice.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_newInvoice.setForeground(new java.awt.Color(204, 204, 204));
        btn_newInvoice.setText("New Invoice");
        btn_newInvoice.setBorder(null);
        btn_newInvoice.setBorderPainted(false);
        btn_newInvoice.setContentAreaFilled(false);
        btn_newInvoice.setFocusPainted(false);
        btn_newInvoice.setOpaque(true);
        btn_newInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_newInvoiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_newInvoiceMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_newInvoiceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_newInvoiceMouseReleased(evt);
            }
        });
        btn_newInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newInvoiceActionPerformed(evt);
            }
        });
        jPanel1.add(btn_newInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        btn_salesHistory.setBackground(new java.awt.Color(38, 57, 75));
        btn_salesHistory.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_salesHistory.setForeground(new java.awt.Color(204, 204, 204));
        btn_salesHistory.setText("Sales History");
        btn_salesHistory.setBorder(null);
        btn_salesHistory.setBorderPainted(false);
        btn_salesHistory.setContentAreaFilled(false);
        btn_salesHistory.setFocusPainted(false);
        btn_salesHistory.setOpaque(true);
        btn_salesHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salesHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salesHistoryMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_salesHistoryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_salesHistoryMouseReleased(evt);
            }
        });
        btn_salesHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salesHistoryActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salesHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 50));

        btn_salesReturn.setBackground(new java.awt.Color(38, 57, 75));
        btn_salesReturn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_salesReturn.setForeground(new java.awt.Color(204, 204, 204));
        btn_salesReturn.setText("Sales Return");
        btn_salesReturn.setBorder(null);
        btn_salesReturn.setBorderPainted(false);
        btn_salesReturn.setContentAreaFilled(false);
        btn_salesReturn.setFocusPainted(false);
        btn_salesReturn.setOpaque(true);
        btn_salesReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salesReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salesReturnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_salesReturnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_salesReturnMouseReleased(evt);
            }
        });
        btn_salesReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salesReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salesReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 190, 50));

        btn_cashRegister.setBackground(new java.awt.Color(38, 57, 75));
        btn_cashRegister.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_cashRegister.setForeground(new java.awt.Color(204, 204, 204));
        btn_cashRegister.setText("Cash Register");
        btn_cashRegister.setBorder(null);
        btn_cashRegister.setBorderPainted(false);
        btn_cashRegister.setContentAreaFilled(false);
        btn_cashRegister.setFocusPainted(false);
        btn_cashRegister.setOpaque(true);
        btn_cashRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cashRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cashRegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_cashRegisterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_cashRegisterMouseReleased(evt);
            }
        });
        btn_cashRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cashRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cashRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_newInvoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newInvoiceMouseEntered
        btn_newInvoice.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_newInvoiceMouseEntered

    private void btn_newInvoiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newInvoiceMouseExited
        btn_newInvoice.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_newInvoiceMouseExited

    private void btn_newInvoiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newInvoiceMousePressed
        btn_newInvoice.setForeground(new Color(0, 204, 204));
        btn_newInvoice.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_newInvoiceMousePressed

    private void btn_newInvoiceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newInvoiceMouseReleased
        btn_newInvoice.setForeground(new Color(204, 204, 204));
        btn_newInvoice.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_newInvoiceMouseReleased

    private void btn_salesHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesHistoryMouseEntered
        btn_salesHistory.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_salesHistoryMouseEntered

    private void btn_salesHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesHistoryMouseExited
        btn_salesHistory.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_salesHistoryMouseExited

    private void btn_salesHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesHistoryMousePressed
        btn_salesHistory.setForeground(new Color(0, 204, 204));
        btn_salesHistory.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_salesHistoryMousePressed

    private void btn_salesHistoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesHistoryMouseReleased
        btn_salesHistory.setForeground(new Color(204, 204, 204));
        btn_salesHistory.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_salesHistoryMouseReleased

    private void btn_salesReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesReturnMouseEntered
        btn_salesReturn.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_salesReturnMouseEntered

    private void btn_salesReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesReturnMouseExited
        btn_salesReturn.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_salesReturnMouseExited

    private void btn_salesReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesReturnMousePressed
        btn_salesReturn.setForeground(new Color(0, 204, 204));
        btn_salesReturn.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_salesReturnMousePressed

    private void btn_salesReturnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesReturnMouseReleased
        btn_salesReturn.setForeground(new Color(204, 204, 204));
        btn_salesReturn.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_salesReturnMouseReleased

    private void btn_newInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newInvoiceActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Cashier")) {

            try {
                ResultSet rs = DB.search("SELECT status FROM cash_register WHERE status='Open' ");
                if (rs.next()) {
                    if (rs.getString(1).equals("Open")) {
                        Invoice inv = new Invoice(menu);
                        menu.view.removeAll();
                        menu.view.revalidate();
                        menu.view.repaint();
                        menu.view.add((JPanel) inv.panel);
                        this.dispose();
                    }
                } else {
                    AreUSure s = new AreUSure("Open a new cash register", "Not available a ACTIVE cash register, Please create a new one");
                    JOptionPane.showMessageDialog(menu, s.panel, "Open Cash Register", JOptionPane.PLAIN_MESSAGE);

                    Cash_RegOpen cr = new Cash_RegOpen(menu, user_Type, this);
                    menu.view.removeAll();
                    menu.view.revalidate();
                    menu.view.repaint();
                    menu.view.add((JPanel) cr.panel);
                    this.dispose();
                    System.gc();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (user_Type.equals("Manager") | user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_newInvoiceActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void btn_salesHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salesHistoryActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager")) {
            SalesHistory inv = new SalesHistory(menu, user_Type);
            menu.view.removeAll();
            menu.view.revalidate();
            menu.view.repaint();
            menu.view.add((JPanel) inv.panel);
            this.dispose();

        } else if (user_Type.equals("Cashier") | user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }

    }//GEN-LAST:event_btn_salesHistoryActionPerformed

    private void btn_cashRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cashRegisterMouseEntered
        btn_cashRegister.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_cashRegisterMouseEntered

    private void btn_cashRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cashRegisterMouseExited
        btn_cashRegister.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_cashRegisterMouseExited

    private void btn_cashRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cashRegisterMousePressed
        btn_cashRegister.setForeground(new Color(0, 204, 204));
        btn_cashRegister.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_cashRegisterMousePressed

    private void btn_cashRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cashRegisterMouseReleased
        btn_cashRegister.setForeground(new Color(204, 204, 204));
        btn_cashRegister.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_cashRegisterMouseReleased

    private void btn_salesReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salesReturnActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("Cashier")) {

            try {
                ResultSet rs = DB.search("SELECT status FROM cash_register WHERE status='Open' ");
                if (rs.next()) {
                    if (rs.getString(1).equals("Open")) {
                        Sales_Returns srn = new Sales_Returns(menu);
                        menu.view.removeAll();
                        menu.view.revalidate();
                        menu.view.repaint();
                        menu.view.add((JPanel) srn.panel);
                        System.gc();
                        this.dispose();
                    }
                } else {
                    AreUSure s = new AreUSure("Open a new cash register", "Not available a ACTIVE cash register, Please create a new one");
                    JOptionPane.showMessageDialog(menu, s.panel, "Open Cash Register", JOptionPane.PLAIN_MESSAGE);

                    Cash_RegOpen cr = new Cash_RegOpen(menu, user_Type, this);
                    menu.view.removeAll();
                    menu.view.revalidate();
                    menu.view.repaint();
                    menu.view.add((JPanel) cr.panel);
                    this.dispose();
                    System.gc();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);
        }

    }//GEN-LAST:event_btn_salesReturnActionPerformed

    private void btn_cashRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cashRegisterActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("Cashier")) {

            try {
                ResultSet rs = DB.search("SELECT status,id FROM cash_register");
                while (rs.next()) {

                    if (rs.getString(1).equals("Open")) {

                        Cash_Register cr = new Cash_Register(menu, user_Type);
                        menu.view.removeAll();
                        menu.view.revalidate();
                        menu.view.repaint();
                        menu.view.add((JPanel) cr.panel);
                        cr.loadCashRegister(rs.getString(2));
                        this.dispose();
                        System.gc();

                    } else {

                        Cash_RegOpen cr = new Cash_RegOpen(menu, user_Type);
                        menu.view.removeAll();
                        menu.view.revalidate();
                        menu.view.repaint();
                        menu.view.add((JPanel) cr.panel);
                        this.dispose();
                        System.gc();

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_cashRegisterActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesPopup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cashRegister;
    private javax.swing.JButton btn_newInvoice;
    private javax.swing.JButton btn_salesHistory;
    private javax.swing.JButton btn_salesReturn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
