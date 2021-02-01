package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import java.awt.Color;
import java.awt.Cursor;
import java.io.File;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.PrinterName;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.view.JasperViewer;

public class various_payments extends javax.swing.JFrame {
    
    private int xMouse;
    private int yMouse;
    private Main menu;
    private Invoice invoice;
    private AddCustomer customer;
    private String productBrand;
    private String total;
    private String productCategory;
    private boolean sameId;
    private final DecimalFormat decimalformat = new DecimalFormat("00.00");
    private final SimpleDateFormat dateFomrmat = new SimpleDateFormat("yyyy-MM-dd");
    private final SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
    
    public various_payments() {
        initComponents();
    }
    
    public various_payments(Main mMenu, Invoice inv, String total) {
        this();
        this.menu = mMenu;
        this.invoice = inv;
        this.total = total;
        menu.setEnabled(false);
        loadnettotal();
        jLabel1.setText("Various Payments");
    }
    
    public various_payments(Main mMenu, AddCustomer customer, String total) {
        this();
        this.menu = mMenu;
        this.customer = customer;
        this.total = total;
        menu.setEnabled(false);
        loadnettotal();
        jLabel1.setText("Credit Payments");
        jLabel7.setVisible(false);
        credit_pay.setVisible(false);
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
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cash_pay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        card_pay = new javax.swing.JTextField();
        credit_pay = new javax.swing.JTextField();
        net_total = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit1.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit2.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 34, 32));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 57, 75));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Various Payments");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 73, 73));
        jLabel2.setText("Cash Payments");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("Card Payments");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 25));

        cash_pay.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cash_pay.setForeground(new java.awt.Color(39, 55, 70));
        cash_pay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cash_payFocusLost(evt);
            }
        });
        cash_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cash_payActionPerformed(evt);
            }
        });
        cash_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cash_payKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cash_payKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cash_payKeyTyped(evt);
            }
        });
        jPanel1.add(cash_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Credit payments");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 25));

        btn_Cancel.setBackground(new java.awt.Color(179, 182, 183));
        btn_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.setBorder(null);
        btn_Cancel.setBorderPainted(false);
        btn_Cancel.setContentAreaFilled(false);
        btn_Cancel.setFocusPainted(false);
        btn_Cancel.setOpaque(true);
        btn_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_CancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_CancelMouseReleased(evt);
            }
        });
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 90, 30));

        btn_Add.setBackground(new java.awt.Color(41, 128, 185));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Done");
        btn_Add.setBorder(null);
        btn_Add.setBorderPainted(false);
        btn_Add.setContentAreaFilled(false);
        btn_Add.setFocusPainted(false);
        btn_Add.setOpaque(true);
        btn_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_AddMouseReleased(evt);
            }
        });
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, 30));

        header.setBackground(new java.awt.Color(250, 251, 250));
        header.setOpaque(true);
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 400, 30));

        card_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card_payActionPerformed(evt);
            }
        });
        card_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                card_payKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                card_payKeyReleased(evt);
            }
        });
        jPanel1.add(card_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, 30));

        credit_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credit_payActionPerformed(evt);
            }
        });
        credit_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                credit_payKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                credit_payKeyReleased(evt);
            }
        });
        jPanel1.add(credit_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 180, 30));

        net_total.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        net_total.setForeground(new java.awt.Color(39, 55, 70));
        net_total.setEnabled(false);
        net_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                net_totalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                net_totalKeyTyped(evt);
            }
        });
        jPanel1.add(net_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("Net Total");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseEntered
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseEntered

    private void btn_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseExited
        btn_Cancel.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_CancelMouseExited

    private void btn_CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMousePressed
        btn_Cancel.setBackground(new Color(98, 101, 103));
    }//GEN-LAST:event_btn_CancelMousePressed

    private void btn_CancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseReleased
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseReleased

    private void btn_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseEntered
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseEntered

    private void btn_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseExited
        btn_Add.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_AddMouseExited

    private void btn_AddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMousePressed
        btn_Add.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_AddMousePressed

    private void btn_AddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseReleased
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseReleased

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        menu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void cash_payKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cash_payKeyTyped

    }//GEN-LAST:event_cash_payKeyTyped

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        try {
            if (invoice != null) {
                double payable = 0;
                double cardpay = 0;
                double cashpay = 0;
                double creditpay = 0;
                
                if (!(cash_pay.getText().isEmpty())) {
                    cashpay = Double.parseDouble(cash_pay.getText());
                }
                if (!(card_pay.getText().isEmpty())) {
                    cardpay = Double.parseDouble(card_pay.getText());
                    payable += cardpay;
                }
                if (!(credit_pay.getText().isEmpty())) {
                    creditpay = Double.parseDouble(credit_pay.getText());;
                    payable += creditpay;
                }
                double nettotal = Double.parseDouble(net_total.getText().split(" ")[1]);
                if (nettotal - payable >= 0) {
                    invoice.cash_pay = cashpay;
                    invoice.card_pay = cardpay;
                    invoice.credit_pay = creditpay;
                    menu.setEnabled(true);
                    this.dispose();
                    invoice.generatePayments();
                } else {
                    JOptionPane.showMessageDialog(this, "Net total exceeded", "Invalid payment", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                double payable = 0;
                double cardpay = 0;
                double cashpay = 0;
                double creditpay = 0;
                
                if (!(cash_pay.getText().isEmpty())) {
                    cashpay = Double.parseDouble(cash_pay.getText());
                    payable += cashpay;
                }
                if (!(card_pay.getText().isEmpty())) {
                    cardpay = Double.parseDouble(card_pay.getText());
                    payable += cardpay;
                }
                if (payable <= Double.parseDouble(net_total.getText().split(" ")[1])) {
                    DB.iud("INSERT INTO customer_payment (date, time, total_pay, cash_pay, card_pay, customer_id) values('" + dateFomrmat.format(new Date()) + "','" + time.format(new Date()) + "','" + net_total.getText().split(" ")[1] + "','" + cashpay + "','" + cardpay + "','" + customer.id_customer.getText() + "')");
                    DB.iud("UPDATE customer set credit_amount=credit_amount-'" + payable + "' where id_customer='" + customer.id_customer.getText() + "'");
                    ResultSet rs = DB.search("select * from customer_payment");
                    if (rs.last()) {
                        String id=rs.getString(1);
                        String totalpay=net_total.getText().split(" ")[1];
                        double balance=Double.parseDouble(totalpay)-payable;
                        printCustomerPayment(id, totalpay, decimalformat.format(balance));
                    }
                    clear();
                    menu.setEnabled(true);
                    this.dispose();
                    customer.updateData(customer.id_customer.getText());
                    customer.loadHistory(customer.id_customer.getText());
                } else {
                    JOptionPane.showMessageDialog(this, "Net total exceeded", "Invalid payment", JOptionPane.WARNING_MESSAGE);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void cash_payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cash_payKeyReleased

    }//GEN-LAST:event_cash_payKeyReleased

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        clear();
        menu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void card_payKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_card_payKeyPressed
        Validation.setdigitanddot(evt, true, card_pay.getText());
    }//GEN-LAST:event_card_payKeyPressed

    private void card_payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_card_payKeyReleased

    }//GEN-LAST:event_card_payKeyReleased

    private void credit_payKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_credit_payKeyPressed
        Validation.setdigitanddot(evt, true, credit_pay.getText());
    }//GEN-LAST:event_credit_payKeyPressed

    private void credit_payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_credit_payKeyReleased

    }//GEN-LAST:event_credit_payKeyReleased

    private void net_totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_net_totalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_net_totalKeyReleased

    private void net_totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_net_totalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_net_totalKeyTyped

    private void cash_payFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cash_payFocusLost

    }//GEN-LAST:event_cash_payFocusLost

    private void cash_payKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cash_payKeyPressed
        Validation.setdigitanddot(evt, true, cash_pay.getText());
    }//GEN-LAST:event_cash_payKeyPressed

    private void cash_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cash_payActionPerformed
        card_pay.grabFocus();
    }//GEN-LAST:event_cash_payActionPerformed

    private void card_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card_payActionPerformed
        credit_pay.grabFocus();
    }//GEN-LAST:event_card_payActionPerformed

    private void credit_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credit_payActionPerformed
        btn_Add.grabFocus();
    }//GEN-LAST:event_credit_payActionPerformed

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
            java.util.logging.Logger.getLogger(various_payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(various_payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(various_payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(various_payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new various_payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JTextField card_pay;
    private javax.swing.JTextField cash_pay;
    private javax.swing.JTextField credit_pay;
    private javax.swing.JButton exit;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField net_total;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        cash_pay.setText(null);
        card_pay.setText("");
        credit_pay.setText("");
        net_total.setText("");
        productBrand = null;
        productCategory = null;
    }
    
    private void loadnettotal() {
        net_total.setText("RS. " + decimalformat.format(Double.parseDouble(total)));
    }
    
    private void printCustomerPayment(String id,String avpay,String balance) {
        menu.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            String path = "jasperReports\\customer_payment.jasper";

            Map<String, Object> m = new HashMap();
            m.put("cpid", id);
            m.put("available pay", avpay);
            m.put("balance", balance);

//            JasperReport cp = JasperCompileManager.compileReport(path);
            JasperPrint fr = JasperFillManager.fillReport(path, m, DB.getConnection());
//            JasperViewer.viewReport(fr, false);
            PrintReportToPrinter(fr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        menu.setCursor(null);
    }
    
    private void PrintReportToPrinter(JasperPrint jp) throws JRException {
        // TODO Auto-generated method stub
        PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
        // printRequestAttributeSet.add(MediaSizeName.ISO_A4); //setting page size
        printRequestAttributeSet.add(new Copies(1));

        PrinterName printerName = new PrinterName("FK80 Printer", null); //gets printer 

        PrintServiceAttributeSet printServiceAttributeSet = new HashPrintServiceAttributeSet();
        printServiceAttributeSet.add(printerName);

        JRPrintServiceExporter exporter = new JRPrintServiceExporter();

        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jp);
        exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, printRequestAttributeSet);
        exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, printServiceAttributeSet);
        exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
        exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, Boolean.FALSE);
        exporter.exportReport();
    }
    
}
