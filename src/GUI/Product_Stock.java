package GUI;

import Model.Access_Denied;
import Database.DB;
import Model.StockExcelReport;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Product_Stock extends javax.swing.JFrame {

    private Main menu;
    private String user_Type;

    public Product_Stock() {
        initComponents();
        btn_loadAll.grabFocus();
        tableSettings();
        loadTableData();
    }

    public Product_Stock(Main m, String user) {
        this();
        this.menu = m;
        this.user_Type = user;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_Export = new javax.swing.JButton();
        btn_loadAll = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1080, 660));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 73, 73));
        jLabel2.setText("Product");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 35));

        table.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product", "Unit", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(35);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(250);
            table.getColumnModel().getColumn(1).setPreferredWidth(320);
            table.getColumnModel().getColumn(2).setPreferredWidth(250);
            table.getColumnModel().getColumn(3).setPreferredWidth(250);
        }

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 1070, 510));

        btn_Export.setBackground(new java.awt.Color(179, 182, 183));
        btn_Export.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Export.setText("Export");
        btn_Export.setBorder(null);
        btn_Export.setBorderPainted(false);
        btn_Export.setContentAreaFilled(false);
        btn_Export.setFocusPainted(false);
        btn_Export.setOpaque(true);
        btn_Export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ExportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ExportMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ExportMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_ExportMouseReleased(evt);
            }
        });
        btn_Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExportActionPerformed(evt);
            }
        });
        panel.add(btn_Export, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 90, 30));

        btn_loadAll.setBackground(new java.awt.Color(41, 128, 185));
        btn_loadAll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_loadAll.setForeground(new java.awt.Color(255, 255, 255));
        btn_loadAll.setText("Load All");
        btn_loadAll.setBorder(null);
        btn_loadAll.setBorderPainted(false);
        btn_loadAll.setContentAreaFilled(false);
        btn_loadAll.setFocusPainted(false);
        btn_loadAll.setOpaque(true);
        btn_loadAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loadAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loadAllMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_loadAllMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_loadAllMouseReleased(evt);
            }
        });
        btn_loadAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadAllActionPerformed(evt);
            }
        });
        panel.add(btn_loadAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 90, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 73, 94));
        jLabel3.setText("Product Stock");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 360, 50));

        searchBox.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        searchBox.setForeground(new java.awt.Color(39, 55, 70));
        searchBox.setToolTipText("");
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBoxKeyReleased(evt);
            }
        });
        panel.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 350, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMouseEntered
        btn_Export.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_ExportMouseEntered

    private void btn_ExportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMouseExited
        btn_Export.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_ExportMouseExited

    private void btn_ExportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMousePressed
        btn_Export.setBackground(new Color(98, 101, 103));
    }//GEN-LAST:event_btn_ExportMousePressed

    private void btn_ExportMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMouseReleased
        btn_Export.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_ExportMouseReleased

    private void btn_loadAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loadAllMouseEntered
        btn_loadAll.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_loadAllMouseEntered

    private void btn_loadAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loadAllMouseExited
        btn_loadAll.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_loadAllMouseExited

    private void btn_loadAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loadAllMousePressed
        btn_loadAll.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_loadAllMousePressed

    private void btn_loadAllMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loadAllMouseReleased
        btn_loadAll.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_loadAllMouseReleased

    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        try {
            ResultSet rs = DB.search(" SELECT product_stock.id_product, product.productname, product_stock.unit, SUM(qty) FROM "
                    + "product_stock INNER JOIN product ON product_stock.id_product = product.id_product  WHERE product_stock.id_product like '" + searchBox.getText() + "%' OR product.productname like '%" + searchBox.getText() + "%' GROUP BY id_product ");
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBoxKeyReleased

    private void btn_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExportActionPerformed
        if (user_Type.equals("Admin") | user_Type.equals("Manager")) {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd__HH-mm-ss");
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Save As");
            chooser.setSelectedFile(new File("StockExcelReport" + sdf.format(new Date())));
            chooser.setFileFilter(new FileNameExtensionFilter("Excel Workbook (* .xlsx)", ".xlsx"));
            int retrival = chooser.showSaveDialog(null);

            if (retrival == JFileChooser.APPROVE_OPTION) {
                menu.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                
                String saveFile = chooser.getSelectedFile().getAbsolutePath().replace("\\", "/") + ".xlsx";
                StockExcelReport.writeExcel("Product Stock", saveFile);
                menu.setCursor(null);
            }

        } else if (user_Type.equals("Cashier") | user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_ExportActionPerformed

    private void btn_loadAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadAllActionPerformed
        loadTableData();
    }//GEN-LAST:event_btn_loadAllActionPerformed

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
            java.util.logging.Logger.getLogger(Product_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Export;
    private javax.swing.JButton btn_loadAll;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panel;
    private javax.swing.JTextField searchBox;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void tableSettings() {
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 14));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setCellRenderer(center);
        table.getColumnModel().getColumn(2).setCellRenderer(center);
        table.getColumnModel().getColumn(3).setCellRenderer(center);
    }

    private void loadTableData() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        try {
            dtm.setRowCount(0);
            ResultSet rs = DB.search("SELECT product_stock.id_product, product.productname, product_stock.unit, SUM(qty) FROM product_stock INNER JOIN product ON product_stock.id_product = product.id_product  GROUP BY id_product");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
