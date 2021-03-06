package GUI;

import Database.DB;
import Model.AreUSure;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class Cash_Register extends javax.swing.JFrame {

    private final DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private String openDate;
    private String openTime;
    private String cashRegID;
    private Main menu;
    private String user_Type;

    public Cash_Register() {
        initComponents();
    }

    public Cash_Register(Main men, String userType) {
        this();
        this.menu = men;
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

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_CloseReg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        net_Sales = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cash_Sales = new javax.swing.JLabel();
        card_Sales = new javax.swing.JLabel();
        total_Sales = new javax.swing.JLabel();
        salesRetuns = new javax.swing.JLabel();
        open = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        netSales = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        closingBalance = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        srnCount = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        invoiceCount = new javax.swing.JLabel();
        openBy = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        credit_Sales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setMaximumSize(new java.awt.Dimension(1024, 768));
        panel.setMinimumSize(new java.awt.Dimension(1024, 768));
        panel.setPreferredSize(new java.awt.Dimension(1024, 768));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 73, 94));
        jLabel2.setText("Cash Register");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 360, 50));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 101, 115));
        jLabel1.setText("Net Sales Amount");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, 190, 35));

        btn_CloseReg.setBackground(new java.awt.Color(41, 128, 185));
        btn_CloseReg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_CloseReg.setForeground(new java.awt.Color(255, 255, 255));
        btn_CloseReg.setText("Close Register");
        btn_CloseReg.setBorder(null);
        btn_CloseReg.setBorderPainted(false);
        btn_CloseReg.setContentAreaFilled(false);
        btn_CloseReg.setFocusPainted(false);
        btn_CloseReg.setOpaque(true);
        btn_CloseReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CloseRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CloseRegMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_CloseRegMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_CloseRegMouseReleased(evt);
            }
        });
        btn_CloseReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseRegActionPerformed(evt);
            }
        });
        panel.add(btn_CloseReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 250, 60));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("SALES SUMMARY _______________________");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 460, 35));

        net_Sales.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        net_Sales.setForeground(new java.awt.Color(86, 101, 115));
        net_Sales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        net_Sales.setText("0.00");
        net_Sales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(net_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, 190, 35));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(86, 101, 115));
        jLabel5.setText("Card");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 80, 35));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(86, 101, 115));
        jLabel6.setText("Total Sales");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 120, 35));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(86, 101, 115));
        jLabel7.setText("Sales Returns");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 150, 35));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(86, 101, 115));
        jLabel8.setText("Cash");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 80, 35));

        cash_Sales.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        cash_Sales.setForeground(new java.awt.Color(86, 101, 115));
        cash_Sales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cash_Sales.setText("0.00");
        cash_Sales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(cash_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 200, 35));

        card_Sales.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        card_Sales.setForeground(new java.awt.Color(86, 101, 115));
        card_Sales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        card_Sales.setText("0.00");
        card_Sales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(card_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 200, 35));

        total_Sales.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        total_Sales.setForeground(new java.awt.Color(86, 101, 115));
        total_Sales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_Sales.setText("0.00");
        total_Sales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(total_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, 200, 35));

        salesRetuns.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        salesRetuns.setForeground(new java.awt.Color(86, 101, 115));
        salesRetuns.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salesRetuns.setText("0.00");
        salesRetuns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(salesRetuns, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, 200, 35));

        open.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        open.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        open.setText("0.00");
        open.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(open, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 240, 38));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(52, 73, 94));
        jLabel14.setText("No. of Sales Returns");
        panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 170, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(52, 73, 94));
        jLabel15.setText("Net Sales Amount");
        panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 250, 38));

        netSales.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        netSales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        netSales.setText("0.00");
        netSales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(netSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 240, 38));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(52, 73, 94));
        jLabel17.setText("Closing Balance");
        panel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 250, 40));

        closingBalance.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        closingBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        closingBalance.setText("0.00");
        closingBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(closingBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 240, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(52, 73, 94));
        jLabel19.setText("Openning Float");
        panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 38));

        date.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        date.setForeground(new java.awt.Color(0, 153, 51));
        panel.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 650, 25));

        srnCount.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        srnCount.setForeground(new java.awt.Color(52, 73, 94));
        panel.add(srnCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 210, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(52, 73, 94));
        jLabel22.setText("Opened by");
        panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 110, 30));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(52, 73, 94));
        jLabel23.setText("No. of Invoices");
        panel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 130, 30));

        invoiceCount.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        invoiceCount.setForeground(new java.awt.Color(52, 73, 94));
        panel.add(invoiceCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 210, 30));

        openBy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        openBy.setForeground(new java.awt.Color(52, 73, 94));
        panel.add(openBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 210, 30));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(86, 101, 115));
        jLabel9.setText("Credit");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 80, 35));

        credit_Sales.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        credit_Sales.setForeground(new java.awt.Color(86, 101, 115));
        credit_Sales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        credit_Sales.setText("0.00");
        credit_Sales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(credit_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 200, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CloseRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseRegMouseEntered
        btn_CloseReg.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_CloseRegMouseEntered

    private void btn_CloseRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseRegMouseExited
        btn_CloseReg.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_CloseRegMouseExited

    private void btn_CloseRegMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseRegMousePressed
        btn_CloseReg.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_CloseRegMousePressed

    private void btn_CloseRegMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseRegMouseReleased
        btn_CloseReg.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_CloseRegMouseReleased

    private void btn_CloseRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseRegActionPerformed
        AreUSure aru = new AreUSure();
        if (JOptionPane.showConfirmDialog(this, aru.panel, "Close this Cash Register...", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE) == 0) {
            try {
                DB.iud("UPDATE cash_register SET total_cash_sales = '" + cash_Sales.getText().replace(",", "") + "', total_card_sales = '" + card_Sales.getText().replace(",", "")
                        + "',total_credit_sales='"+credit_Sales.getText().replace(",", "")+"', total_sales_returns = '" + salesRetuns.getText().replace(",", "") + "', closing_balance = '" + closingBalance.getText().replace(",", "")
                        + "', closed_date = '" + dateFormat.format(new Date()) + "', closed_time = '" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "', status = 'Closed' WHERE id = '" + cashRegID + "' ");

                printReport(cashRegID);
                Cash_RegOpen cr = new Cash_RegOpen(menu, user_Type);
                menu.view.removeAll();
                menu.view.revalidate();
                menu.view.repaint();
                menu.view.add((JPanel) cr.panel);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_CloseRegActionPerformed

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
            java.util.logging.Logger.getLogger(Cash_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cash_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cash_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cash_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cash_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CloseReg;
    private javax.swing.JLabel card_Sales;
    private javax.swing.JLabel cash_Sales;
    private javax.swing.JLabel closingBalance;
    private javax.swing.JLabel credit_Sales;
    private javax.swing.JLabel date;
    private javax.swing.JLabel invoiceCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel netSales;
    private javax.swing.JLabel net_Sales;
    private javax.swing.JLabel open;
    private javax.swing.JLabel openBy;
    public javax.swing.JPanel panel;
    private javax.swing.JLabel salesRetuns;
    private javax.swing.JLabel srnCount;
    private javax.swing.JLabel total_Sales;
    // End of variables declaration//GEN-END:variables

    public void loadCashRegister(String id) {
        cashRegID = id;
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        SimpleDateFormat stf = new SimpleDateFormat("hh.mm a");

        try {
            ResultSet rs = DB.search("SELECT openning_balance, open_date, open_time, user FROM cash_register WHERE id = '" + id + "' ");
            if (rs.next()) {
                open.setText(decimalFormat.format(rs.getDouble(1)));
                openDate = rs.getString(2);
                openTime = rs.getString(3);
                date.setText("Opened : " + sdf.format(dateFormat.parse(openDate)) + "   at   " + stf.format(new SimpleDateFormat("HH:mm:ss").parse(rs.getString(3))));
                openBy.setText(rs.getString(4));
            }
            salesData();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void salesData() {

        try {
            String openDetail=openDate +" "+openTime;
            String currentDetail=dateFormat.format(new Date())+" "+LocalTime.now();
            ResultSet rs1 = DB.search("SELECT COUNT(invoice.id_invoice) AS rowcount, SUM( invoice.net_total) AS total FROM invoice "
                    + "WHERE CONCAT(invoice.`date` ,' ',invoice.`time`) BETWEEN '" + openDetail + "'  AND '" + currentDetail+ "'");
            
            if (rs1.next()) {
                invoiceCount.setText(rs1.getString(1));
                
            }

            ResultSet rs2 = DB.search("SELECT SUM( invoice.net_total) AS total FROM invoice WHERE invoice.payment_type='Cash' "
                    + "and CONCAT(invoice.`date` ,' ',invoice.`time`) BETWEEN '" + openDetail + "'  AND '" + currentDetail+ "'");
            if (rs2.next()) {
                cash_Sales.setText(decimalFormat.format(rs2.getDouble(1)));
            }
            
            ResultSet rs5 = DB.search("SELECT SUM( v.cash_payments) AS total FROM invoice i join various_payments v on i.id_invoice=v.invoice_id WHERE i.payment_type='Various' and CONCAT(i.`date` ,' ',i.`time`) BETWEEN '"+openDetail+"'  AND '"+currentDetail+"'");
            if (rs5.next()) {
                double cashsales=0;
                if (cash_Sales.getText().isEmpty()) {
                    cashsales=rs5.getDouble(1);
                } else {
                    cashsales=rs5.getDouble(1)+Double.parseDouble(cash_Sales.getText().replace(",", ""));
                }
                cash_Sales.setText(decimalFormat.format(cashsales));
            }

            ResultSet rs3 = DB.search("SELECT SUM( invoice.net_total) AS total FROM invoice WHERE invoice.payment_type='Card' "
                    + "and CONCAT(invoice.`date` ,' ',invoice.`time`) BETWEEN '" + openDetail + "'  AND '" + currentDetail+ "'");
            if (rs3.next()) {
                card_Sales.setText(decimalFormat.format(rs3.getDouble(1)));
            }
            
            ResultSet rs6 = DB.search("SELECT SUM( v.card_payments) AS total FROM invoice i join various_payments v on i.id_invoice=v.invoice_id WHERE i.payment_type='Various' and CONCAT(i.`date` ,' ',i.`time`) BETWEEN '"+openDetail+"'  AND '"+currentDetail+"'");
            if (rs6.next()) {
                double cardsales=0;
                if (card_Sales.getText().isEmpty()) {
                    cardsales=rs6.getDouble(1);
                } else {
                    cardsales=rs6.getDouble(1)+Double.parseDouble(card_Sales.getText().replace(",", ""));
                }
                card_Sales.setText(decimalFormat.format(cardsales));
            }
            
            ResultSet rs7 = DB.search("SELECT SUM( invoice.net_total) AS total FROM invoice WHERE invoice.payment_type='Credit' "
                    + "and CONCAT(invoice.`date` ,' ',invoice.`time`) BETWEEN '" + openDetail + "'  AND '" + currentDetail+ "'");
            if (rs7.next()) {
                credit_Sales.setText(decimalFormat.format(rs7.getDouble(1)));
            }
            
            ResultSet rs8 = DB.search("select SUM(cash_pay) from customer_payment WHERE CONCAT(date ,' ',time) BETWEEN '"+openDetail+"'  AND '"+currentDetail+"'");
            if (rs8.next()) {
                double creditsales=0;
                if (cash_Sales.getText().isEmpty()) {
                    creditsales=rs8.getDouble(1);
                } else {
                    creditsales=rs8.getDouble(1)+Double.parseDouble(cash_Sales.getText().replace(",", ""));
                }
                cash_Sales.setText(decimalFormat.format(creditsales));
            }
            
            ResultSet rs9 = DB.search("select SUM(card_pay) from customer_payment WHERE CONCAT(date ,' ',time) BETWEEN '"+openDetail+"'  AND '"+currentDetail+"'");
            if (rs9.next()) {
                double creditsales=0;
                if (card_Sales.getText().isEmpty()) {
                    creditsales=rs9.getDouble(1);
                } else {
                    creditsales=rs9.getDouble(1)+Double.parseDouble(card_Sales.getText().replace(",", ""));
                }
                card_Sales.setText(decimalFormat.format(creditsales));
            }
            
            ResultSet rs10 = DB.search("SELECT SUM( v.credit_payment) AS total FROM invoice i join various_payments v on i.id_invoice=v.invoice_id WHERE i.payment_type='Various' and CONCAT(i.`date` ,' ',i.`time`) BETWEEN '"+openDetail+"'  AND '"+currentDetail+"'");
            if (rs10.next()) {
                double creditsales=0;
                if (credit_Sales.getText().isEmpty()) {
                    creditsales=rs10.getDouble(1);
                } else {
                    creditsales=rs10.getDouble(1)+Double.parseDouble(credit_Sales.getText().replace(",", ""));
                }
                credit_Sales.setText(decimalFormat.format(creditsales));
            }

            ResultSet rs4 = DB.search("SELECT COUNT(sales_return.id_srn) AS rowcount, SUM( sales_return.value) AS total FROM sales_return "
                    + "WHERE CONCAT(sales_return.date_created ,' ',sales_return.time_created) BETWEEN '" + openDetail + "'  AND '" + currentDetail+ "'");
            if (rs4.next()) {
                srnCount.setText(rs4.getString(1));
                salesRetuns.setText(decimalFormat.format(rs4.getDouble(2)));
            }
            double total_sales=Double.parseDouble(cash_Sales.getText().replace(",", ""))+Double.parseDouble(card_Sales.getText().replace(",", ""))+Double.parseDouble(credit_Sales.getText().replace(",", ""));
            total_Sales.setText(decimalFormat.format(total_sales));
            getNetSales();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getNetSales() {
        if (total_Sales.getText().isEmpty() | salesRetuns.getText().isEmpty()) {
        } else {
            double totalSales = Double.parseDouble(total_Sales.getText().replace(",", ""));
            double cashSales = Double.parseDouble(cash_Sales.getText().replace(",", ""));
            double totalReturns = Double.parseDouble(salesRetuns.getText().replace(",", ""));
            net_Sales.setText(decimalFormat.format(totalSales - totalReturns));
            netSales.setText(decimalFormat.format(cashSales - totalReturns));
            getClosingBalance();
        }
    }

    private void getClosingBalance() {
        if (open.getText().isEmpty() | netSales.getText().isEmpty()) {
        } else {
            double openBalance = Double.parseDouble(open.getText().replace(",", ""));
            double netSale = Double.parseDouble(netSales.getText().replace(",", ""));
            closingBalance.setText(decimalFormat.format(netSale + openBalance));
        }
    }

    private void printReport(String id) {
        menu.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            String path = "jasperReports\\CashRegister.jrxml";
            Map<String, Object> m = new HashMap();
            m.put("id", id);

            JasperReport cp = JasperCompileManager.compileReport(path);
            JasperPrint fr = JasperFillManager.fillReport(cp, m, DB.getConnection());
            JasperViewer.viewReport(fr, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        menu.setCursor(null);
    }

}
