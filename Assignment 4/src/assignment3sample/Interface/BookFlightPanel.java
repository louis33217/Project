
package assignment3sample.Interface;

import assignment3sample.Business.CustomerDirectory;
import assignment3sample.Business.Flight;
import assignment3sample.Business.Flightschedule;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class BookFlightPanel extends javax.swing.JPanel {

    private CustomerDirectory custdir;
    private JPanel rightPanel;
    private Flightschedule carInfor;
    private List<String> brandList;
    
    public BookFlightPanel(CustomerDirectory custdir, JPanel rightPanel, Flightschedule carInfor, List<String> brandList) {

        this.custdir = custdir;
        this.rightPanel = rightPanel;
        this.carInfor = carInfor;
        this.brandList = brandList;
        initComponents();
        populate(carInfor.getFlightList());
         
    }

     public void populate(ArrayList<Flight> carList) {
        DefaultTableModel dtm = (DefaultTableModel)tblCarlist.getModel();
        dtm.setRowCount(0);
        int i = 0, count = 0;
        
        for(Flight a : carList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getSeats();
            row[2]=a.getDeparute();
            row[3]=a.getArrive();
            row[4]=a.getFrom();
            row[5]=a.getTo();
            dtm.addRow(row);
            i++;
            count++;
        }
        lbAvacar.setText(String.valueOf(i));
        lbNotava.setText(String.valueOf(i-count));
    }
    
 public void cleanSearch() {
        cbBrand.setSelectedItem("All");
        cbDep.setSelectedItem("All");
        cbArr.setSelectedItem("All");
        txtFrom.setText("");
        txtTo.setText("");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarlist = new javax.swing.JTable();
        lbAvacar = new javax.swing.JLabel();
        numAva = new javax.swing.JLabel();
        lbNotava = new javax.swing.JLabel();
        numNotava = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbBrand = new javax.swing.JComboBox<>();
        lbBrand = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbDep = new javax.swing.JComboBox<>();
        txtFrom = new javax.swing.JTextField();
        lbMin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbMax = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        cbArr = new javax.swing.JComboBox<>();
        btnFilter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Book Your Flight");

        tblCarlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Seats", "Departure time", "Arrive time", "From", "To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarlist);

        lbAvacar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAvacar.setPreferredSize(new java.awt.Dimension(19, 19));

        numAva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numAva.setText("Available flight:");

        lbNotava.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNotava.setPreferredSize(new java.awt.Dimension(19, 19));

        numNotava.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numNotava.setText("Unavailable flights: ");

        jButton1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton1.setText("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Name: ");

        jLabel3.setText("plz enter ur name first");

        ArrayList<String> list = new ArrayList<String>() {{add("All");}};
        list.addAll(brandList);
        cbBrand.setModel(new DefaultComboBoxModel(list.toArray(new String[0])));
        cbBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBrandActionPerformed(evt);
            }
        });

        lbBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBrand.setText("Airliners:");

        jLabel5.setText("Departure time:");

        cbDep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Morning", "Day", "Evening", "Night" }));

        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });

        lbMin.setText("From:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Arrive time:");

        lbMax.setText("To:");

        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });

        cbArr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Morning", "Day", "Evening", "Night" }));

        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jButton2.setText("VIEW ALL TICKETS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(lbMin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbDep, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbArr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(87, 87, 87)
                                        .addComponent(lbMax)))
                                .addGap(18, 18, 18)
                                .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numAva, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbAvacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numNotava)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNotava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAvacar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numNotava)
                    .addComponent(numAva)
                    .addComponent(lbNotava, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBrand)
                            .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(cbDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbArr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMin)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMax)
                            .addComponent(btnFilter))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if (jTextField1 == null || jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "enter ur name plz");
        }else{
            String name = jTextField1.getText();
            int selectedRow = tblCarlist.getSelectedRow();
            if(selectedRow >=0) {
                Flight result = (Flight) tblCarlist.getValueAt(selectedRow, 0);
                CustomerFlightBooked panel = new CustomerFlightBooked(custdir, rightPanel, carInfor, result, brandList, name);
                rightPanel.add("CustomerFlightBooked", panel);
                CardLayout layout = (CardLayout) rightPanel.getLayout();
                layout.next(rightPanel);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row from table first!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBrandActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
        ArrayList<Flight> result = new ArrayList<>();
        String brand = cbBrand.getSelectedItem().toString();
        String dep = cbDep.getSelectedItem().toString();
        String arr = cbArr.getSelectedItem().toString();
        String from = txtFrom.getText();
        String to = txtTo.getText();

        for (Flight c : carInfor.getFlightList()) {
            if (!brand.equals("All") && !brand.equals(c.getAirliners())) {
                continue;
            }
            if (!dep.equals("All") && !dep.equals(c.getDeparute())) {
                continue;
            }
            if (!arr.equals("All") && !arr.equals(c.getArrive())) {
                continue;
            }
            if (!from.equals("") && !from.equals(c.getFrom())) {
                continue;
            }
            if (!to.equals("") && !to.equals(c.getTo())) {
                continue;
            }
            result.add(c);
        }
        if(result.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No match flight, please filter again", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            populate(result);
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       TicketsBooked panel = new TicketsBooked(rightPanel, custdir, carInfor);
       rightPanel.add("TicketsBooked", panel);
       CardLayout layout = (CardLayout) rightPanel.getLayout();
       layout.next(rightPanel);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JComboBox<String> cbArr;
    private javax.swing.JComboBox<String> cbBrand;
    private javax.swing.JComboBox<String> cbDep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAvacar;
    private javax.swing.JLabel lbBrand;
    private javax.swing.JLabel lbMax;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbNotava;
    private javax.swing.JLabel numAva;
    private javax.swing.JLabel numNotava;
    private javax.swing.JTable tblCarlist;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
