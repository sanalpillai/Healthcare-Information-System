/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Color;
import javax.swing.JOptionPane;
import model.ProductAddress;
/**
 *
 * @author sanal
 */
public class AddressJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanel
     */
    
    ProductAddress productaddress;
    
    public AddressJPanel(ProductAddress productaddress) {
        initComponents();
        this.productaddress = productaddress;
        this.setBackground(new Color(224, 255, 255));
        btnSaveAddress.setBackground(new Color(0, 128, 255));
        btnSaveAddress.setForeground(Color.WHITE);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblGPS = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtGPS = new javax.swing.JTextField();
        btnSaveAddress = new javax.swing.JButton();

        lblTitleAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitleAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleAddress.setText("Address");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCity.setText("City:");

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblState.setText("State:");

        lblCountry.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCountry.setText("Country:");

        lblGPS.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGPS.setText("GPS:");

        btnSaveAddress.setText("Save");
        btnSaveAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitleAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblState)
                            .addComponent(lblCity)
                            .addComponent(lblCountry)
                            .addComponent(lblGPS))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGPS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(83, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnSaveAddress)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCity, lblCountry, lblGPS, lblState});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCountry)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGPS)
                    .addComponent(txtGPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnSaveAddress)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAddressActionPerformed
        // TODO add your handling code here:
        
        if (txtCity.getText() == null || txtCity.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "City cannot be empty");
        return;
    }
        else {productaddress.setCity(txtCity.getText());}


    if (txtState.getText() == null || txtState.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "State cannot be empty");
        return;
    }
    else {productaddress.setCountry(txtCountry.getText());}

    if (txtCountry.getText() == null || txtCountry.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Country cannot be empty");
        return;
    }
    else {productaddress.setGps(txtGPS.getText());}

    if (txtGPS.getText() == null || txtGPS.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "GPS coordinates cannot be empty");
        return;
    }
    else {productaddress.setState(txtState.getText());}
        
        JOptionPane.showMessageDialog(this, "Address Information Saved!");

    }//GEN-LAST:event_btnSaveAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblGPS;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitleAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtGPS;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}