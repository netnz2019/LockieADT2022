/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package test.peonypeoplestocktaker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nzloc
 */
public class StocktakerGUI extends javax.swing.JPanel {

    /**
     * Creates new form StocktakerGUI
     */
    public StocktakerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        VeiwFlowerType = new javax.swing.JComboBox<>();
        VeiwData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        VeiwTotalGained = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        VeiwTotalSold = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        VeiwTotalStock = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AddFlowerType = new javax.swing.JComboBox<>();
        LoadSavedData = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddAmountGained = new javax.swing.JSpinner();
        AddAmountSold = new javax.swing.JSpinner();
        AddSavedData = new javax.swing.JButton();

        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("Type of Flower");

        VeiwFlowerType.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        VeiwFlowerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flower Type", "Coral Sunset", "Sarah Bernhardt", "Red Charm" }));
        VeiwFlowerType.setPreferredSize(new java.awt.Dimension(206, 36));
        VeiwFlowerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiwFlowerTypeActionPerformed(evt);
            }
        });

        VeiwData.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        VeiwData.setText("View Data");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Total Gained");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("Total Sold");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("Total Stock");

        VeiwTotalGained.setColumns(6);
        VeiwTotalGained.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        VeiwTotalGained.setRows(1);
        VeiwTotalGained.setPreferredSize(new java.awt.Dimension(60, 20));
        jScrollPane2.setViewportView(VeiwTotalGained);

        VeiwTotalSold.setColumns(6);
        VeiwTotalSold.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        VeiwTotalSold.setRows(1);
        VeiwTotalSold.setPreferredSize(new java.awt.Dimension(60, 20));
        jScrollPane3.setViewportView(VeiwTotalSold);

        VeiwTotalStock.setColumns(6);
        VeiwTotalStock.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        VeiwTotalStock.setRows(1);
        VeiwTotalStock.setPreferredSize(new java.awt.Dimension(60, 20));
        jScrollPane4.setViewportView(VeiwTotalStock);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(VeiwFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(VeiwData, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VeiwFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(VeiwData)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(73, 73, 73))
        );

        Tab.addTab("Veiw Data", jPanel1);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setText("Type of Flower");

        AddFlowerType.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        AddFlowerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flower Type", "Coral Sunset", "Sarah Bernhardt", "Red Charm" }));
        AddFlowerType.setPreferredSize(new java.awt.Dimension(170, 45));
        AddFlowerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFlowerTypeActionPerformed(evt);
            }
        });

        LoadSavedData.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        LoadSavedData.setText("Load Saved Data");
        LoadSavedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadSavedDataActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setText("Amount Gained");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setText("Amount Sold");

        AddAmountGained.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        AddAmountSold.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        AddSavedData.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        AddSavedData.setText("Save Data");
        AddSavedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSavedDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(LoadSavedData))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddAmountSold, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddAmountGained, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(AddSavedData)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AddFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(LoadSavedData)
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddAmountGained, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddAmountSold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(AddSavedData)
                .addGap(23, 23, 23))
        );

        Tab.addTab("Add Data", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VeiwFlowerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiwFlowerTypeActionPerformed
    String flowertype = VeiwFlowerType.getSelectedItem().toString();
    if (flowertype == "Coral Sunset")
    {PeonyPeopleStocktaker.Coralload();} 
        
    }//GEN-LAST:event_VeiwFlowerTypeActionPerformed

    private void AddFlowerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFlowerTypeActionPerformed
    String flowertype = AddFlowerType.getSelectedItem().toString();
    if (flowertype == "Coral Sunset")
    {PeonyPeopleStocktaker.();}
    
    
    }//GEN-LAST:event_AddFlowerTypeActionPerformed

    private void AddSavedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSavedDataActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_AddSavedDataActionPerformed

    private void LoadSavedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadSavedDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadSavedDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AddAmountGained;
    private javax.swing.JSpinner AddAmountSold;
    private javax.swing.JComboBox<String> AddFlowerType;
    private javax.swing.JButton AddSavedData;
    private javax.swing.JButton LoadSavedData;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JButton VeiwData;
    private javax.swing.JComboBox<String> VeiwFlowerType;
    private javax.swing.JTextArea VeiwTotalGained;
    private javax.swing.JTextArea VeiwTotalSold;
    private javax.swing.JTextArea VeiwTotalStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
