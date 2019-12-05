/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MatchingRole;

import Business.Enterprise.CoordinateEnterprise;
import Business.Organization.MatchingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class MatchingJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private MatchingOrganization organization;
    private CoordinateEnterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form MatchingJPanel
     */
  

    public MatchingJPanel(JPanel userProcessContainer, UserAccount account, MatchingOrganization organization, CoordinateEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel houseModel = (DefaultTableModel) houseRequestJTable.getModel();
        DefaultTableModel clientModel = (DefaultTableModel) clientRequestJTable.getModel();
        
        houseModel.setRowCount(0);
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()){
            if (!request.getStatus().equals("Approve")) {
                continue;
            }
            Object[] row = new Object[2];
            row[0] = request.getMessage();
            row[1] = request;
            houseModel.addRow(row);
        }
        
        clientModel.setRowCount(0);
        for (WorkRequest request : enterprise.getPatientQueue().getWorkRequestList()){
            if (!request.getStatus().equals("Approve")) {
                continue;
            }
            Object[] row = new Object[2];
            row[0] = request.getMessage();
            row[1] = request;
            clientModel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        houseRequestJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        matchButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));

        houseRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        houseRequestJTable.setPreferredSize(new java.awt.Dimension(150, 65));
        houseRequestJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(houseRequestJTable);

        clientRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientRequestJTable.setMaximumSize(new java.awt.Dimension(2147483647, 65));
        clientRequestJTable.setMinimumSize(new java.awt.Dimension(30, 65));
        clientRequestJTable.setPreferredSize(new java.awt.Dimension(150, 65));
        clientRequestJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(clientRequestJTable);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setText("Room Match Status");

        matchButton.setText("Match");
        matchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(537, 537, 537)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(matchButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)))))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(matchButton)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void matchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchButtonActionPerformed
        // TODO add your handling code here:
        int clientRow = clientRequestJTable.getSelectedRow();
        int houseRow = houseRequestJTable.getSelectedRow();
        if (clientRow < 0 || houseRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select one target from client and house");
            return;
        }
        WorkRequest clientRequest = (WorkRequest) clientRequestJTable.getValueAt(clientRow, 1);
        WorkRequest housseRequest = (WorkRequest) houseRequestJTable.getValueAt(houseRow, 1);
        clientRequest.setStatus("Match");
        clientRequest.setReceiver(housseRequest.getSender());
        housseRequest.setStatus("Match");
        housseRequest.setReceiver(clientRequest.getSender());
        enterprise.getPatientQueue().getWorkRequestList().remove(clientRequest);
        populateTable();
    }//GEN-LAST:event_matchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clientRequestJTable;
    private javax.swing.JTable houseRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton matchButton;
    // End of variables declaration//GEN-END:variables
}
