
package assignment3sample.Interface;

import assignment3sample.Business.CustomerDirectory;
import assignment3sample.Business.Flight;
import assignment3sample.Business.Flightschedule;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class BookFlightPanel extends javax.swing.JPanel {

    private CustomerDirectory custdir;
    private JPanel rightPanel;
    private Flightschedule carInfor;
    private List<String> brandList;
    
    public BookFlightPanel(CustomerDirectory custdir, JPanel rightPanel, Flightschedule carInfor, List<String> brandList) {
        initComponents();
        this.custdir = custdir;
        this.rightPanel = rightPanel;
        this.carInfor = carInfor;
        this.brandList = brandList;
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Book Your Flight");

        tblCarlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Seats", "Departure time", "Arrive time", "From", "To"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(228, 228, 228))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numNotava, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numAva, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNotava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAvacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(554, 554, 554)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numAva)
                            .addComponent(lbAvacar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numNotava)
                            .addComponent(lbNotava, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if (jTextField1 == null){
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAvacar;
    private javax.swing.JLabel lbNotava;
    private javax.swing.JLabel numAva;
    private javax.swing.JLabel numNotava;
    private javax.swing.JTable tblCarlist;
    // End of variables declaration//GEN-END:variables
}
