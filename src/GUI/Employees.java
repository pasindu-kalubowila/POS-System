package GUI;

import Model.Access_Denied;
import Database.DB;
import Model.EmployeeExcelReport;
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

public class Employees extends javax.swing.JFrame {

    private Main menu;
    private String user_Type;

    public Employees() {
        initComponents();
        tableSettings();
        loadTableData();
    }

    public Employees(Main mMenu, String user) {
        this();
        this.menu = mMenu;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_Export = new javax.swing.JButton();
        btn_newProduct = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1080, 660));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        table.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID", "Emopyee", "Gender", "City", "Contact No"
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
        table.setOpaque(false);
        table.setRowHeight(35);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setPreferredWidth(250);
            table.getColumnModel().getColumn(3).setPreferredWidth(250);
            table.getColumnModel().getColumn(4).setPreferredWidth(250);
            table.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 1110, 450));

        btn_Export.setBackground(new java.awt.Color(179, 182, 183));
        btn_Export.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        panel.add(btn_Export, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 130, 35));

        btn_newProduct.setBackground(new java.awt.Color(41, 128, 185));
        btn_newProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_newProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_newProduct.setText("New Employee");
        btn_newProduct.setBorder(null);
        btn_newProduct.setBorderPainted(false);
        btn_newProduct.setContentAreaFilled(false);
        btn_newProduct.setFocusPainted(false);
        btn_newProduct.setOpaque(true);
        btn_newProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_newProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_newProductMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_newProductMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_newProductMouseReleased(evt);
            }
        });
        btn_newProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newProductActionPerformed(evt);
            }
        });
        panel.add(btn_newProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 130, 35));

        searchBox.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        searchBox.setForeground(new java.awt.Color(39, 55, 70));
        searchBox.setText("  Search");
        searchBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchBoxFocusLost(evt);
            }
        });
        panel.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 350, 35));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 73, 94));
        jLabel1.setText("Employees");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 360, 50));

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

    private void btn_newProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newProductMouseEntered
        btn_newProduct.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_newProductMouseEntered

    private void btn_newProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newProductMouseExited
        btn_newProduct.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_newProductMouseExited

    private void btn_newProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newProductMousePressed
        btn_newProduct.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_newProductMousePressed

    private void btn_newProductMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newProductMouseReleased
        btn_newProduct.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_newProductMouseReleased

    private void btn_newProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newProductActionPerformed
        AddEmployee emp = new AddEmployee(menu, this, true);
        emp.setVisible(true);
    }//GEN-LAST:event_btn_newProductActionPerformed

    private void searchBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBoxFocusGained
        searchBox.setText(null);
    }//GEN-LAST:event_searchBoxFocusGained

    private void searchBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBoxFocusLost
        if (searchBox.getText().equals("")) {
            searchBox.setText(" Search");
        }
    }//GEN-LAST:event_searchBoxFocusLost

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2) {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            String employeeID = (String) dtm.getValueAt(table.getSelectedRow(), 1);
            AddEmployee emp = new AddEmployee(menu, this, false);
            emp.setVisible(true);
            emp.updateData(employeeID);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btn_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExportActionPerformed
        if (user_Type.equals("Admin") | user_Type.equals("Manager")) {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd__HH-mm-ss");
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Save As");
            chooser.setSelectedFile(new File("EmployeeDetailsReport" + sdf.format(new Date())));
            chooser.setFileFilter(new FileNameExtensionFilter("Excel Workbook (* .xlsx)", ".xlsx"));
            int retrival = chooser.showSaveDialog(null);

            if (retrival == JFileChooser.APPROVE_OPTION) {
                menu.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                String saveFile = chooser.getSelectedFile().getAbsolutePath().replace("\\", "/") + ".xlsx";
                EmployeeExcelReport.writeExcel("Employees Details", saveFile);
                menu.setCursor(null);
            }

        } else if (user_Type.equals("Cashier") | user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_ExportActionPerformed

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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Export;
    private javax.swing.JButton btn_newProduct;
    private javax.swing.JLabel jLabel1;
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
        table.getColumnModel().getColumn(1).setCellRenderer(center);
        table.getColumnModel().getColumn(3).setCellRenderer(center);
        table.getColumnModel().getColumn(4).setCellRenderer(center);
        table.getColumnModel().getColumn(5).setCellRenderer(center);
    }

    public void loadTableData() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            ResultSet rs = DB.search("SELECT id_employee, fname, lname, gender, city, mobile FROM employee WHERE state = 1");
            int rawNo = 0;
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                rawNo++;
                v.add(rawNo);
                v.add(rs.getString(1));
                v.add(rs.getString(2) + " " + rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}