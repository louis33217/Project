/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClientOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClientRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ClientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private ClientOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private ClientRequest request;
    /**
     * Creates new form ClientJPanel
     */
    public ClientJPanel(JPanel userProcessContainer, UserAccount account, ClientOrganization organization, Enterprise enterprise, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        initComponents();
        request = (ClientRequest) account.getWorkQueue().getWorkRequestList().get(0);
        populateMessage(request);
    }

    public void populateMessage(ClientRequest request) {
        String status = request.getStatus();
        String helper = (request.getReceiver() != null) ? request.getReceiver().getUsername() : "N/A";
        messageLabel.setText(request.getMessage());
        statusLabel.setText(status);
        helperLabel.setText(helper);
        if (status.equals("None")) {
            applyButton.setEnabled(true);
            applyTextField.setEnabled(true);
        } else {
            applyButton.setEnabled(false);
            applyTextField.setEnabled(false);
        }
        if (status.equals("Match")) {
            doneButton.setEnabled(true);
        } else {
            doneButton.setEnabled(false);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        applyTextField = new javax.swing.JTextField();
        applyButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        helperLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();

        jLabel1.setText("Message:");

        messageLabel.setText("jLabel2");

        jLabel3.setText("Status:");

        statusLabel.setText("jLabel2");

        applyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyTextFieldActionPerformed(evt);
            }
        });

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Helper:");

        helperLabel.setText("jLabel2");

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(helperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(applyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(applyButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(610, 610, 610)
                        .addComponent(doneButton)))
                .addContainerGap(627, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(messageLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(statusLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(helperLabel))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(applyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyButton))
                .addGap(79, 79, 79)
                .addComponent(doneButton)
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void applyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applyTextFieldActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        // TODO add your handling code here:
        String message = applyTextField.getText();
        request.setMessage(message);
        request.setStatus("Apply");
        applyTextField.setText("");
        populateMessage(request);
        system.getWorkQueue().getWorkRequestList().add(request);
    }//GEN-LAST:event_applyButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        request.setMessage("Done");
        request.setStatus("None");
        system.getWorkQueue().getWorkRequestList().remove(request);
        UserAccount userAccount = request.getReceiver();
        for (WorkRequest r : userAccount.getWorkQueue().getWorkRequestList()) {
            if (r.getReceiver() != null && account.getUsername().equals(r.getReceiver().getUsername())) {
                r.setMessage("Done");
                r.setStatus("Apply");
                r.setReceiver(null);
            }
        }
        request.setReceiver(null);
        populateMessage(request);
    }//GEN-LAST:event_doneButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JTextField applyTextField;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel helperLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
