
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;



public class Orders extends javax.swing.JFrame {

    DefaultTableModel model;
    Object[][] tablerow;
    String[] tablecol;
    
    QueryProcessor qp;
    
    public Orders() {
        initComponents();
        Backpic();
        Searchpic();
        Seticon();
        Outerpic();
        qp = new QueryProcessor();
        
        TableQuery();
        
        
        
        
    }
    
    private void Outerpic(){
        
        Icon i = outer.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(280, 253, Image.SCALE_SMOOTH);
        
        outer.setIcon(new ImageIcon(image));
    }
    
    private void Backpic(){
        
        Icon i = back.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        
        back.setIcon(new ImageIcon(image));
    }
    
     private void Searchpic(){
        
        Icon i = search.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(25, 15, Image.SCALE_SMOOTH);
        
        search.setIcon(new ImageIcon(image));
    }
     
     private void Seticon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Ubangs Kitchen Logo.png")));
    }
     
   private Stack<String> tableNameStack = new Stack<>();

    private void pushTableName() {
        Calendar calendar = Calendar.getInstance();
        int minute = calendar.get(Calendar.MINUTE);
        String tableName = "menu_" + minute;
        tableNameStack.push(tableName);
        System.out.println("Table Name: " + tableName);
    }

    private String popTableName() {
        if (!tableNameStack.isEmpty()) {
            return tableNameStack.pop();
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    private void TableQuery() {
        pushTableName(); // Push the current table name onto the stack

        // Use the database name in the query string
        String tableName = tableNameStack.peek(); // Get the latest table name from the stack
        String query = "SELECT * FROM `" + tableName + "`";

        tablerow = qp.getAllRecord(query);

        // Initialize tablecol array with column names
        tablecol = new String[]{"Dish_name", "Quantity", "Price"}; // Replace with your actual column names

        model = new DefaultTableModel(tablerow, tablecol);
        OrderList.setModel(model);

        String total = "SELECT SUM(Price) FROM `" + tableName + "`";
        String showtext = qp.getSpecificField(total);
        Prices.setText(showtext);
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        OrderList = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Prices = new javax.swing.JTextField();
        Order = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        outer = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Refresh = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OrderList.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(102, 102, 102)));
        OrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish", "Quantity", "Price"
            }
        ));
        OrderList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        OrderList.getTableHeader().setResizingAllowed(false);
        OrderList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(OrderList);

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel6.setText("Total Price:");

        Order.setBackground(new java.awt.Color(0, 0, 153));
        Order.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Order.setForeground(new java.awt.Color(255, 255, 0));
        Order.setText("Order Now!");
        Order.setToolTipText("");
        Order.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Order.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel7.setText("Order List");

        outer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outer.png"))); // NOI18N

        add.setBackground(new java.awt.Color(0, 0, 153));
        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 0));
        add.setText("Add Order");
        add.setToolTipText("");
        add.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(93, 67, 44));

        jTextField1.setText("Search");
        jTextField1.setPreferredSize(new java.awt.Dimension(64, 25));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ubang's Kitchen");
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Orders");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Payment");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("***");

        jMenuItem2.setText("Restart");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jMenu1.add(Refresh);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(outer, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(Prices, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(98, 98, 98))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Prices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       revalidate();
        repaint();
    }//GEN-LAST:event_addActionPerformed

    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed
       Frame f3 = new Payment();
        f3.show();
         String poppedTableName = popTableName(); // Pop the latest table name from the stack
        if (poppedTableName != null) {
            System.out.println("Popped Table Name: " + poppedTableName);
            // Add any other actions you want to perform on Order button click
        dispose();
    }//GEN-LAST:event_OrderActionPerformed
    }
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Frame f3 = new Menu();
        f3.show();
        
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        revalidate();
        repaint();
    }//GEN-LAST:event_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Order;
    private javax.swing.JTable OrderList;
    private javax.swing.JTextField Prices;
    private javax.swing.JMenuItem Refresh;
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel outer;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
