
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;



 

public class UserNaming extends javax.swing.JFrame {

    
    String table;
    String service;
    
    QueryProcessor qp;
            
            
    public UserNaming() {
        initComponents();
        Logopic();
        Seticon();
        
        RBGTable();
        RBGService();
        
        qp = new QueryProcessor();
    }
    
    
    private void RBGTable(){
        buttonGroup1.add(table1);
        buttonGroup1.add(table2);
        buttonGroup1.add(table3);
        buttonGroup1.add(table4);
        buttonGroup1.add(table5);
        buttonGroup1.add(table6);
        buttonGroup1.add(table7);
        buttonGroup1.add(table8);
        
    }
    
    private void RBGService(){
        buttonGroup10.add(dine);
        buttonGroup10.add(take);
    }
    
     private void Logopic(){
        
        Icon i = Landscape.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(327, 115, Image.SCALE_SMOOTH);
        
        Landscape.setIcon(new ImageIcon(image));
    }
     
     private void Seticon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Ubangs Kitchen Logo.png")));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        table1 = new javax.swing.JRadioButton();
        table2 = new javax.swing.JRadioButton();
        table3 = new javax.swing.JRadioButton();
        table4 = new javax.swing.JRadioButton();
        table5 = new javax.swing.JRadioButton();
        table6 = new javax.swing.JRadioButton();
        table7 = new javax.swing.JRadioButton();
        table8 = new javax.swing.JRadioButton();
        Submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        dine = new javax.swing.JRadioButton();
        take = new javax.swing.JRadioButton();
        Landscape = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ubang's Kitchen");

        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 12)); // NOI18N
        jLabel2.setText("Welcome to");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo_6068823789392738107_x.jpg"))); // NOI18N
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setIconTextGap(0);

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        jLabel1.setText("Costumer's Name:");
        jLabel1.setIconTextGap(0);

        name.setFont(new java.awt.Font("Sitka Display", 0, 12)); // NOI18N
        name.setText("Insert Name");
        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        name.setMargin(new java.awt.Insets(0, 6, 2, 6));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        jLabel5.setText("Table's ID Area:");
        jLabel5.setIconTextGap(0);

        table1.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        table1.setText("Table01");
        table1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table1ActionPerformed(evt);
            }
        });

        table2.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        table2.setText("Table02");
        table2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table2ActionPerformed(evt);
            }
        });

        table3.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        table3.setText("Table03");
        table3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table3ActionPerformed(evt);
            }
        });

        table4.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        table4.setText("Table04");
        table4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table4ActionPerformed(evt);
            }
        });

        table5.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        table5.setText("Table05");
        table5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table5ActionPerformed(evt);
            }
        });

        table6.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        table6.setText("Table06");
        table6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table6ActionPerformed(evt);
            }
        });

        table7.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        table7.setText("SoloTable01");
        table7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table7ActionPerformed(evt);
            }
        });

        table8.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        table8.setText("SoloTable02");
        table8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table8ActionPerformed(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(0, 0, 153));
        Submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 0));
        Submit.setText("Submit");
        Submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel6.setText("Service Mode:");

        clear.setText("Clear");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        dine.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        dine.setText("Dine In");
        dine.setMargin(new java.awt.Insets(2, 0, 3, 0));
        dine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dineActionPerformed(evt);
            }
        });

        take.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        take.setText("Take Out");
        take.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeActionPerformed(evt);
            }
        });

        Landscape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LandscapeLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(dine)
                                                .addGap(18, 18, 18)
                                                .addComponent(take)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(table1)
                                        .addGap(18, 18, 18)
                                        .addComponent(table2)
                                        .addGap(18, 18, 18)
                                        .addComponent(table3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(table7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(table8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(table4)
                                            .addGap(18, 18, 18)
                                            .addComponent(table5)
                                            .addGap(18, 18, 18)
                                            .addComponent(table6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel5))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Landscape, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Landscape, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table1)
                    .addComponent(table2)
                    .addComponent(table3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table4)
                    .addComponent(table5)
                    .addComponent(table6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table7)
                    .addComponent(table8))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dine)
                    .addComponent(take))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(Submit))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void table1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table1ActionPerformed
        // TODO add your handling code here:
        table = table1.getText();
    }//GEN-LAST:event_table1ActionPerformed

    private void table3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table3ActionPerformed
        // TODO add your handling code here:
        table = table3.getText();
    }//GEN-LAST:event_table3ActionPerformed

    private void takeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeActionPerformed
        // TODO add your handling code here:
        service = take.getText();
    }//GEN-LAST:event_takeActionPerformed

    private void dineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dineActionPerformed
        // TODO add your handling code here:
        service = dine.getText();
    }//GEN-LAST:event_dineActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        Frame f3 = new Menu();
        f3.show();
        
        dispose();
        
        qp.executeUpdate("INSERT INTO `usersnaming` VALUES('"+name.getText()+"', '"+table+"', '"+service+"')");
    }//GEN-LAST:event_SubmitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        name.setText("");
        
        
        
        
        
    }//GEN-LAST:event_clearActionPerformed

    private void table2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table2ActionPerformed
        // TODO add your handling code here:
        table = table2.getText();
    }//GEN-LAST:event_table2ActionPerformed

    private void table4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table4ActionPerformed
        // TODO add your handling code here:
        table = table4.getText();
    }//GEN-LAST:event_table4ActionPerformed

    private void table5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table5ActionPerformed
        // TODO add your handling code here:
        table = table5.getText();
    }//GEN-LAST:event_table5ActionPerformed

    private void table6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table6ActionPerformed
        // TODO add your handling code here:
        table = table6.getText();
    }//GEN-LAST:event_table6ActionPerformed

    private void table7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table7ActionPerformed
        // TODO add your handling code here:
        table = table7.getText();
    }//GEN-LAST:event_table7ActionPerformed

    private void table8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table8ActionPerformed
        // TODO add your handling code here:
        table = table8.getText();
    }//GEN-LAST:event_table8ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserNaming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Landscape;
    private javax.swing.JButton Submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton dine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton table1;
    private javax.swing.JRadioButton table2;
    private javax.swing.JRadioButton table3;
    private javax.swing.JRadioButton table4;
    private javax.swing.JRadioButton table5;
    private javax.swing.JRadioButton table6;
    private javax.swing.JRadioButton table7;
    private javax.swing.JRadioButton table8;
    private javax.swing.JRadioButton take;
    // End of variables declaration//GEN-END:variables
}
