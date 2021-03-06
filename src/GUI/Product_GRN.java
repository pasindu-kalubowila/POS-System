package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Product_GRN extends javax.swing.JFrame {

    private Main menu;
    private final DecimalFormat decimalformat = new DecimalFormat("00.00");
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Product_GRN() {
        initComponents();
        tableSettings();
        generateID();
        dateGRN.setDate(new Date());
        supplierID.grabFocus();
        JTextFieldDateEditor f = (JTextFieldDateEditor) dateGRN.getDateEditor();
        f.setEditable(false);
        f.setBackground(Color.WHITE);
    }

    public Product_GRN(Main menu) {
        this();
        this.menu = menu;
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
        grnNo = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        unit = new javax.swing.JLabel();
        supplierID = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        buyingPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        retailPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        grnValue = new javax.swing.JLabel();
        dateGRN = new com.toedter.calendar.JDateChooser();
        productCode = new javax.swing.JTextField();
        btn_Add = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_find = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1080, 660));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grnNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        panel.add(grnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 240, 25));

        productName.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        productName.setForeground(new java.awt.Color(0, 102, 153));
        panel.add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 350, 25));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("Supplier ID");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 73, 73));
        jLabel5.setText("Date");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 40, 25));

        unit.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        unit.setForeground(new java.awt.Color(0, 51, 204));
        unit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panel.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 70, 25));

        supplierID.setEditable(false);
        supplierID.setBackground(new java.awt.Color(255, 255, 255));
        supplierID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        supplierID.setForeground(new java.awt.Color(39, 55, 70));
        panel.add(supplierID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 220, -1));

        qty.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        qty.setForeground(new java.awt.Color(39, 55, 70));
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });
        panel.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 220, -1));

        table.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        table.setForeground(new java.awt.Color(39, 55, 70));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product", "Unit", "Qty", "Buying Price", "Ratail Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(25);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(250);
            table.getColumnModel().getColumn(1).setPreferredWidth(300);
            table.getColumnModel().getColumn(2).setPreferredWidth(200);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setPreferredWidth(100);
            table.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1100, 330));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Quantity");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 70, 25));

        btn_Cancel.setBackground(new java.awt.Color(179, 182, 183));
        btn_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.setToolTipText("Clear your entered data");
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
        panel.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 670, 110, 30));

        btn_Save.setBackground(new java.awt.Color(41, 128, 185));
        btn_Save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Save.setForeground(new java.awt.Color(255, 255, 255));
        btn_Save.setText("Save");
        btn_Save.setBorder(null);
        btn_Save.setBorderPainted(false);
        btn_Save.setContentAreaFilled(false);
        btn_Save.setFocusPainted(false);
        btn_Save.setOpaque(true);
        btn_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_SaveMouseReleased(evt);
            }
        });
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        panel.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 670, 110, 30));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 73, 73));
        jLabel8.setText("Buying Price");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, 25));

        buyingPrice.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        buyingPrice.setForeground(new java.awt.Color(39, 55, 70));
        buyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyingPriceActionPerformed(evt);
            }
        });
        buyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buyingPriceKeyTyped(evt);
            }
        });
        panel.add(buyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 200, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel9.setText("Total Value");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 670, 80, 25));

        retailPrice.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        retailPrice.setForeground(new java.awt.Color(39, 55, 70));
        retailPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retailPriceActionPerformed(evt);
            }
        });
        retailPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                retailPriceKeyTyped(evt);
            }
        });
        panel.add(retailPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 210, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(52, 73, 94));
        jLabel10.setText("Good Receive Note");
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 360, 50));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(66, 73, 73));
        jLabel11.setText("Product Code");
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("GRN NO");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 25));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(66, 73, 73));
        jLabel12.setText("Retail Price");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 80, 25));

        grnValue.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        grnValue.setForeground(new java.awt.Color(0, 0, 102));
        grnValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grnValue.setText("000.00");
        panel.add(grnValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 180, 25));

        dateGRN.setBackground(new java.awt.Color(255, 255, 255));
        dateGRN.setDateFormatString("yyyy-MM-dd");
        dateGRN.setFocusable(false);
        dateGRN.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        panel.add(dateGRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 170, 25));

        productCode.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        productCode.setForeground(new java.awt.Color(39, 55, 70));
        productCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCodeActionPerformed(evt);
            }
        });
        panel.add(productCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 220, -1));

        btn_Add.setBackground(new java.awt.Color(41, 128, 185));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Add");
        btn_Add.setToolTipText("Add to table");
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
        panel.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 240, 40, 25));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/find.png"))); // NOI18N
        jButton1.setToolTipText("Search Supplier");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 30, 30));

        btn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/find_1.png"))); // NOI18N
        btn_find.setToolTipText("Search Product");
        btn_find.setBorderPainted(false);
        btn_find.setFocusPainted(false);
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });
        panel.add(btn_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 25, 25));
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 178, 1120, 10));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseReleased
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseReleased

    private void btn_AddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMousePressed
        btn_Add.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_AddMousePressed

    private void btn_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseExited
        btn_Add.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_AddMouseExited

    private void btn_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseEntered
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseEntered

    private void retailPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retailPriceKeyTyped
        if (Character.isLetter(evt.getKeyChar()) | evt.getKeyChar() == KeyEvent.VK_COMMA | evt.getKeyChar() == KeyEvent.VK_SLASH | evt.getKeyChar() == KeyEvent.VK_SEMICOLON) {
            evt.consume();
        }
        Validation.setLength(evt, retailPrice.getText(), 10);
    }//GEN-LAST:event_retailPriceKeyTyped

    private void buyingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyingPriceKeyTyped
        if (Character.isLetter(evt.getKeyChar()) | evt.getKeyChar() == KeyEvent.VK_COMMA | evt.getKeyChar() == KeyEvent.VK_SLASH | evt.getKeyChar() == KeyEvent.VK_SEMICOLON) {
            evt.consume();
        }
        Validation.setLength(evt, buyingPrice.getText(), 10);
    }//GEN-LAST:event_buyingPriceKeyTyped

    private void btn_SaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseReleased
        btn_Save.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_SaveMouseReleased

    private void btn_SaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMousePressed
        btn_Save.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_SaveMousePressed

    private void btn_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseExited
        btn_Save.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_SaveMouseExited

    private void btn_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseEntered
        btn_Save.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_SaveMouseEntered

    private void btn_CancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseReleased
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseReleased

    private void btn_CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMousePressed
        btn_Cancel.setBackground(new Color(98, 101, 103));
    }//GEN-LAST:event_btn_CancelMousePressed

    private void btn_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseExited
        btn_Cancel.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_CancelMouseExited

    private void btn_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseEntered
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseEntered

    private void qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        Validation.setLength(evt, qty.getText(), 10);
    }//GEN-LAST:event_qtyKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SearchSupplier s = new SearchSupplier(menu, this);
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productCodeActionPerformed
        try {
            ResultSet rs = DB.search("SELECT productname, unit FROM product WHERE id_product='" + productCode.getText() + "' ");
            if (rs.next()) {
                productName.setText(rs.getString(1));
                unit.setText(rs.getString(2));
                qty.grabFocus();
            } else {
                productName.setText("Product is wrong, Please Check that");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_productCodeActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        buyingPrice.grabFocus();
    }//GEN-LAST:event_qtyActionPerformed

    private void buyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyingPriceActionPerformed
        retailPrice.grabFocus();
    }//GEN-LAST:event_buyingPriceActionPerformed

    private void retailPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retailPriceActionPerformed
        if (qty.getText().equals("")|| productName.getText().equals("Product is wrong, Please Check that") || productName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the product quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            qty.grabFocus();
        } else {
            if (buyingPrice.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter Buying Price of the product", "Warning", JOptionPane.WARNING_MESSAGE);
                buyingPrice.grabFocus();
            } else {
                if (retailPrice.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Enter Retail Price of the product", "Warning", JOptionPane.WARNING_MESSAGE);
                    retailPrice.grabFocus();
                } else if (Double.parseDouble(buyingPrice.getText()) > Double.parseDouble(retailPrice.getText())) {
                    int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Selling price is small than buying price", "Are you sure?", JOptionPane.YES_NO_OPTION);
                    if (ConfirmDialog == JOptionPane.YES_OPTION) {
                        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                        Vector v = new Vector();
                        v.add(productCode.getText());
                        v.add(productName.getText());
                        v.add(unit.getText());
                        v.add(qty.getText());
                        v.add(decimalformat.format(Double.parseDouble(buyingPrice.getText())));
                        v.add(decimalformat.format(Double.parseDouble(retailPrice.getText())));
                        dtm.addRow(v);
                        TotalValue();
                        clear();
                    }
                } else {

                    DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                    Vector v = new Vector();
                    v.add(productCode.getText());
                    v.add(productName.getText());
                    v.add(unit.getText());
                    v.add(qty.getText());
                    v.add(decimalformat.format(Double.parseDouble(buyingPrice.getText())));
                    v.add(decimalformat.format(Double.parseDouble(retailPrice.getText())));
                    dtm.addRow(v);
                    TotalValue();
                    clear();
                }
            }
        }
    }//GEN-LAST:event_retailPriceActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed

        if (qty.getText().equals("") ||Double.parseDouble(qty.getText())==0 || productName.getText().equals("Product is wrong, Please Check that")|| productName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid product", "Warning", JOptionPane.WARNING_MESSAGE);
            qty.grabFocus();
        } else {
            if (buyingPrice.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Enter Buying Price of the product", "Warning", JOptionPane.WARNING_MESSAGE);
                buyingPrice.grabFocus();
            } else {
                if (retailPrice.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Enter Retail Price of the product", "Warning", JOptionPane.WARNING_MESSAGE);
                    retailPrice.grabFocus();
                } else {

                    DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                    Vector v = new Vector();
                    v.add(productCode.getText());
                    v.add(productName.getText());
                    v.add(unit.getText());
                    v.add(qty.getText());
                    v.add(decimalformat.format(Double.parseDouble(buyingPrice.getText())));
                    v.add(decimalformat.format(Double.parseDouble(retailPrice.getText())));
                    dtm.addRow(v);
                    TotalValue();
                    clear();
                }
            }
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (table.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "First Select a Row", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                dtm.removeRow(table.getSelectedRow());
            }
        }
    }//GEN-LAST:event_tableKeyPressed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        if (JOptionPane.showConfirmDialog(menu, "Do you want clear this data", "Clear", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            clearAll();
        }
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        menu.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        if (supplierID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a Supplier before save", "Warning", JOptionPane.WARNING_MESSAGE);
        }else if(dateGRN.getDate().compareTo(new Date())>0){
        JOptionPane.showMessageDialog(this, "Invalid date", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if (dateGRN.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Enter a Date before save", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    DB.iud("INSERT INTO grn (grn_no, id_supplier, date, value, state) VALUES('" + grnNo.getText() + "','" + supplierID.getText() + "','" + sdf.format(dateGRN.getDate()) + "','" + grnValue.getText() + "','1')");
                    DB.iud("INSERT INTO payble_grn (grn_no, grn_value) VALUES('" + grnNo.getText() + "', '" + grnValue.getText() + "')");

                    for (int i = 0; i < table.getRowCount(); i++) {
                        DB.iud("INSERT INTO grn_item (grn_no, id_product, qty, buying_price, retail_price) VALUES"
                                + "( '" + grnNo.getText() + "','" + dtm.getValueAt(i, 0).toString() + "','" + dtm.getValueAt(i, 3).toString() + "','" + dtm.getValueAt(i, 4).toString() + "','" + dtm.getValueAt(i, 5).toString() + "' ) ");

                        ResultSet stock = DB.search(" SELECT idproduct_stock FROM product_stock WHERE id_product='" + dtm.getValueAt(i, 0).toString() + "' AND retail_price='" + dtm.getValueAt(i, 5).toString() + "' AND qty > 0 ");
                        if (stock.next()) { //if available same retail price
                            DB.iud("UPDATE product_stock SET qty=qty+'" + dtm.getValueAt(i, 3).toString() + "' WHERE idproduct_stock='" + stock.getString("idproduct_stock") + "' ");
                        } else {
                            // insert data into stock
                            DB.iud("INSERT INTO product_stock ( idproduct_stock, id_product, unit, qty, retail_price) VALUES"
                                    + "( '" + generateStockID() + "', '" + dtm.getValueAt(i, 0).toString() + "','" + dtm.getValueAt(i, 2).toString() + "','" + dtm.getValueAt(i, 3).toString() + "', '" + dtm.getValueAt(i, 5).toString() + "' ) ");
                        }
                    }

                    new Save().setVisible(true);
                    clearAll();
                    generateID();
                    dateGRN.setDate(new Date());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        menu.setCursor(null);
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        SearchProduct sp = new SearchProduct(menu, this);
        sp.setVisible(true);
    }//GEN-LAST:event_btn_findActionPerformed

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
            java.util.logging.Logger.getLogger(Product_GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_GRN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_find;
    private javax.swing.JTextField buyingPrice;
    private com.toedter.calendar.JDateChooser dateGRN;
    private javax.swing.JLabel grnNo;
    private javax.swing.JLabel grnValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JPanel panel;
    public javax.swing.JTextField productCode;
    private javax.swing.JLabel productName;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField retailPrice;
    private javax.swing.JTextField supplierID;
    private javax.swing.JTable table;
    private javax.swing.JLabel unit;
    // End of variables declaration//GEN-END:variables

    private void tableSettings() {
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 14));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer right = new DefaultTableCellRenderer();
        right.setHorizontalAlignment(JLabel.RIGHT);

        table.getColumnModel().getColumn(2).setCellRenderer(center);
        table.getColumnModel().getColumn(3).setCellRenderer(center);
        table.getColumnModel().getColumn(4).setCellRenderer(right);
        table.getColumnModel().getColumn(5).setCellRenderer(right);
    }

    private void generateID() {
        try {
            ResultSet rs = DB.search("SELECT COUNT(grn_no) AS id FROM grn");
            if (rs.next()) {
                int rowcount = rs.getInt("id");
                rowcount++;
                grnNo.setText("GRN" + String.format("%0" + 6 + "d", rowcount));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String generateStockID() {
        String id = null;
        try {
            ResultSet rs = DB.search("SELECT COUNT(idproduct_stock) AS id FROM product_stock");
            if (rs.next()) {
                int rowcount = rs.getInt("id");
                rowcount++;
                id = "ITS" + String.format("%0" + 7 + "d", rowcount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public void setID(String ID) {
        supplierID.setText(ID);
        productCode.grabFocus();
    }

    private void TotalValue() {
        double value = 0;
        double value1;
        double value2;
        for (int i = 0; i < table.getRowCount(); i++) {
            value1 = Double.parseDouble(table.getValueAt(i, 3).toString());
            value2 = Double.parseDouble(table.getValueAt(i, 4).toString());
            value += value1 * value2;
        }
        grnValue.setText(decimalformat.format(value));
    }

    private void clear() {
        productName.setText(null);
        productCode.setText(null);
        qty.setText(null);
        unit.setText(null);
        buyingPrice.setText(null);
        retailPrice.setText(null);

    }

    private void clearAll() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dateGRN.setDate(null);
        supplierID.setText(null);
        productName.setText(null);
        productCode.setText(null);
        qty.setText(null);
        unit.setText(null);
        buyingPrice.setText(null);
        retailPrice.setText(null);
        grnValue.setText(null);
        dtm.setRowCount(0);
    }
    
    public void productData(String productID) {
        try {
            ResultSet rs = DB.search("SELECT productname, unit FROM product WHERE id_product='" + productCode.getText() + "' ");
            if (rs.next()) {
                productName.setText(rs.getString(1));
                unit.setText(rs.getString(2));
                qty.grabFocus();
            } else {
                productName.setText("Product is wrong, Please Check that");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
