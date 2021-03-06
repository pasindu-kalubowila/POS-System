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
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.view.JasperViewer;

public class coconut_oil extends javax.swing.JFrame {

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

    public coconut_oil() {
        initComponents();
    }

    public coconut_oil(Main mMenu, Invoice inv) {
        this();
        this.menu = mMenu;
        this.invoice = inv;
        menu.setEnabled(false);
        jLabel1.setText("Uncount Items");
        i_qty.setFocusable(true);
    }

//    public uncount_items(Main mMenu, AddCustomer customer, String total) {
//        this();
//        this.menu = mMenu;
//        this.customer = customer;
//        this.total = total;
//        menu.setEnabled(false);
//        jLabel1.setText("Credit Payments");
//        jLabel7.setVisible(false);
//        i_qty.setVisible(false);
//    }
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
        jLabel7 = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        i_qty = new javax.swing.JTextField();
        product_cocunut = new javax.swing.JComboBox<>();

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

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Quantity");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 25));

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
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 90, 30));

        btn_Add.setBackground(new java.awt.Color(41, 128, 185));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Add");
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
        jPanel1.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 90, 30));

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

        i_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_qtyActionPerformed(evt);
            }
        });
        i_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                i_qtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                i_qtyKeyReleased(evt);
            }
        });
        jPanel1.add(i_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 180, 30));

        product_cocunut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        product_cocunut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bottle", "Litre" }));
        jPanel1.add(product_cocunut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        invoice.productCode.setText("");
        clear();
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        try {
            String product_unit = "";
            String qty = i_qty.getText().toString();
            double qtydouble = Double.parseDouble(i_qty.getText().toString());
            if (product_cocunut.getSelectedItem().equals("Bottle")) {
                qtydouble = qtydouble * 0.75;
                product_unit = "Bottle";
            } else if (product_cocunut.getSelectedItem().equals("Litre")) {
                product_unit = "Litre";
            }
            ResultSet rs = DB.search("SELECT ps.idproduct_stock,p.id_product,ps.retail_price FROM product_stock ps INNER JOIN product p on p.id_product=ps.id_product WHERE ps.id_product='Coconut Oil'");
            if (rs.first()) {
                double price = rs.getDouble(3);
                DefaultTableModel dtm = (DefaultTableModel) invoice.table.getModel();
                Vector v = new Vector();
                if (invoice.rowNo == 0) {
                    invoice.rowNo = 1;
                } else {
                    invoice.rowNo++;
                }
                v.add(invoice.rowNo);
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add("Coconut Oil");
                v.add(product_unit);
                v.add(qty);
                v.add(price * qtydouble);
                v.add("0.00");
                v.add(price * qtydouble);
                dtm.addRow(v);
                invoice.productCode.setText("");
                invoice.getSubTotal();
                invoice.getNetTotal();
                invoice.getDiscount();
                menu.setEnabled(true);
                this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        clear();
        menu.setEnabled(true);
        invoice.productCode.setText("");
        this.dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void i_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_i_qtyKeyPressed
        Validation.setdigitanddot(evt, true, i_qty.getText());
    }//GEN-LAST:event_i_qtyKeyPressed

    private void i_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_i_qtyKeyReleased

    }//GEN-LAST:event_i_qtyKeyReleased

    private void i_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_qtyActionPerformed
        btn_Add.grabFocus();
    }//GEN-LAST:event_i_qtyActionPerformed

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
            java.util.logging.Logger.getLogger(coconut_oil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coconut_oil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coconut_oil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coconut_oil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coconut_oil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton exit;
    private javax.swing.JLabel header;
    private javax.swing.JTextField i_qty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> product_cocunut;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        i_qty.setText("");
        productBrand = null;
        productCategory = null;
    }

}
