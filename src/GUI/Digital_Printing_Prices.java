/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Digital_Printing_Prices extends javax.swing.JFrame {

    private String type_id;
    private String quality_id;
    private String price_id;

    public Digital_Printing_Prices() {
        initComponents();
        msg.setVisible(false);
        tableSettings();
        loadPricesData();
        loadQualitiesData();
        loadTypesData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        quality = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_Add = new javax.swing.JButton();
        msg = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 73, 94));
        jLabel5.setText("Prices");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 50));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 73, 73));
        jLabel6.setText("Quality");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 70, 25));

        price.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        price.setForeground(new java.awt.Color(39, 55, 70));
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        panel.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 200, 25));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        table.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Type", "Quality", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(25);
        table.setRowMargin(0);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(150);
            table.getColumnModel().getColumn(1).setPreferredWidth(180);
            table.getColumnModel().getColumn(2).setPreferredWidth(180);
            table.getColumnModel().getColumn(3).setPreferredWidth(128);
        }

        panel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 580, 240));

        quality.setEditable(true);
        quality.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        quality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Quality -" }));
        quality.setFocusable(false);
        quality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualityActionPerformed(evt);
            }
        });
        panel.add(quality, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 200, 25));

        type.setEditable(true);
        type.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Type -" }));
        type.setFocusable(false);
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        panel.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 200, 25));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText(" per square feet");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 100, 25));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 73, 73));
        jLabel8.setText("Type");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, 25));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 73, 73));
        jLabel9.setText("Price");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 50, 25));

        btn_Add.setBackground(new java.awt.Color(41, 128, 185));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        panel.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 90, 25));

        msg.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        msg.setForeground(new java.awt.Color(0, 204, 51));
        msg.setText("Update Price");
        panel.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 44, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        Validation.setDecimalNumbersOnly(evt);
    }//GEN-LAST:event_priceKeyTyped

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if (type.getSelectedIndex() != 0) {
            type_id = type.getSelectedItem().toString().split(" _ ")[0];
        }
    }//GEN-LAST:event_typeActionPerformed

    private void qualityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualityActionPerformed
        if (quality.getSelectedIndex() != 0) {
            quality_id = quality.getSelectedItem().toString().split(" _ ")[0];
        }
    }//GEN-LAST:event_qualityActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        if (!(type_id == null && quality_id == null && price.getText().isEmpty())) {
            try {
                if (price_id == null) {
                    DB.iud("INSERT INTO print_price (type_id, quality_id, price) VALUES('" + type_id + "', '" + quality_id + "', '" + price.getText() + "') ");
                    new Save().setVisible(true);
                    
                } else if (JOptionPane.showConfirmDialog(this, "Do you want update this price?", "Update Price", JOptionPane.YES_NO_OPTION) == 0) {
                    // update price
                    DB.iud("UPDATE print_price SET price = '" + price.getText() + "' WHERE id = '" + price_id + "' ");
                    new Save().setVisible(true);
                }
                
                loadPricesData();
                clearAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2) {
            updatePrice(table.getValueAt(table.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Digital_Printing_Prices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Digital_Printing_Prices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Digital_Printing_Prices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Digital_Printing_Prices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Digital_Printing_Prices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel msg;
    public javax.swing.JPanel panel;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> quality;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables

    private void tableSettings() {
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 14));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer right = new DefaultTableCellRenderer();
        right.setHorizontalAlignment(JLabel.RIGHT);

        table.getColumnModel().getColumn(0).setCellRenderer(center);
        table.getColumnModel().getColumn(3).setCellRenderer(right);
    }

    private void loadTypesData() {
        try {
            ResultSet rs = DB.search("SELECT * FROM print_type");
            while (rs.next()) {
                type.addItem(rs.getString(1) + " _ " + rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadQualitiesData() {
        try {
            ResultSet rs = DB.search("SELECT * FROM print_quality");
            while (rs.next()) {
                quality.addItem(rs.getString(1) + " _ " + rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadPricesData() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setNumRows(0);
        try {
            ResultSet rs = DB.search("SELECT print_price.id, print_type.`type`, print_quality.quality, FORMAT(print_price.price,2) AS price "
                    + "FROM print_price INNER JOIN print_type ON print_price.type_id=print_type.id INNER JOIN print_quality ON print_price.quality_id=print_quality.id");
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

    private void clearAll() {
        msg.setVisible(false);
        type.setEnabled(true);
        quality.setEnabled(true);
        type_id = null;
        quality_id = null;
        type.setSelectedIndex(0);
        quality.setSelectedIndex(0);
        price.setText(null);
    }

    private void updatePrice(String id) {
        try {
            ResultSet rs = DB.search("SELECT print_type.`*`,print_quality.*,print_price.price FROM print_price INNER JOIN print_type ON print_price.type_id=print_type.id "
                    + "INNER JOIN print_quality ON print_price.quality_id=print_quality.id WHERE print_price.id ='" + id + "' ");
            if (rs.next()) {
                price_id = id;
                msg.setVisible(true);
                type_id = rs.getString(1);
                type.setSelectedItem(rs.getString(1) + " _ " + rs.getString(2));
                type.setEnabled(false);
                quality_id = rs.getString(3);
                quality.setSelectedItem(rs.getString(3) + " _ " + rs.getString(4));
                quality.setEnabled(false);
                price.setText(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
