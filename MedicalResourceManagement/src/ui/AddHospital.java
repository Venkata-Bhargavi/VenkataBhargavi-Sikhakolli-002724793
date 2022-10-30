/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import medicalresourcemanagement.HospitalDirectory;
import medicalresourcemanagement.Hospital;
//import medicalresourcemanagement.Patient;

/**
 *
 * @author bhargavi
 */
public class AddHospital extends javax.swing.JPanel {

    HospitalDirectory hospitalHistory;
    private String checkError;
    JPanel workArea;
    HospitalDirectory newEncounterHospitalDirectory;
    /**
     * Creates new form AddHospital
     */
    public AddHospital(HospitalDirectory hospitalHistory) {
        initComponents();
        this.hospitalHistory = hospitalHistory;
        btnUpdate.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHptl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        cbCommunity = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtHospitalId = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        cbCity = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(900, 700));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Manage Hospitals");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 80));

        tblHptl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Community", "City", "Hospital Name", "Hospital Id"
            }
        ));
        tblHptl.setPreferredSize(new java.awt.Dimension(900, 80));
        jScrollPane1.setViewportView(tblHptl);

        jLabel2.setText("Community :");

        jLabel3.setText("City :");

        jLabel4.setText("Hospital Id :");

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        cbCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Community", "Brigham", "Huntington Avenue", "Mission Hill", "Brookline", "Fenway" }));

        jLabel5.setText("Hospital Name :");

        txtHospitalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalIdActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnView.setText("View & Update");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btnSave)
                                .addGap(61, 61, 61)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbCity, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbCommunity, javax.swing.GroupLayout.Alignment.LEADING, 0, 147, Short.MAX_VALUE)))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(jButton3))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtHospitalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if(checkError != null /*|| (txtname.getText() == null  || txtphone.getText() == null || txthouseaddress.getText() == null || txtcity.getText() ==null || txtusername.getText() == null ||txtpassword.getText() == null)*/){
            JOptionPane.showMessageDialog(this,"Please provide valid inputs to all fields");

        }
        else{
            String community = cbCommunity.getSelectedItem().toString();
            String city = cbCity.getSelectedItem().toString();
            String hospitalName = txtHospitalName.getText();
            String hospitalId = String.valueOf(txtHospitalId.getText());

            Hospital per = hospitalHistory.addNewHospital(); // 

            // sets value to ArrayList from the fields that the data is entered.

            per.setCommunityName(community);
            per.setCity(city);
            per.setHospitalId(Integer.parseInt(hospitalId));
            per.setHospitalName(hospitalName);
                    
          

            // shows a dialogue message when the data clicked save button
            JOptionPane.showMessageDialog(this,"Hospital details added");

            // empties all the fields after saving the entered data to ArrayList to facilitate new entries.
            
            cbCommunity.setSelectedIndex(-1);
            txtCity.setText("");
            txtHospitalName.setText("");
            txtHospitalId.setText("");
            populateDataToTable();
            

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        
        int selectedRowIndex = tblHptl.getSelectedRow();  // gives index of selected rows
        if(selectedRowIndex < 0)
        {
           JOptionPane.showMessageDialog(this, "Select a entry to view");
           return;
        }
        


          
        
        cbCommunity.setSelectedItem(hospitalHistory.getHospitalHistory().get(selectedRowIndex).getCommunityName());
//        txtCity.setText(hospitalHistory.getHospitalHistory().get(selectedRowIndex).getCity());
        txtHospitalName.setText(hospitalHistory.getHospitalHistory().get(selectedRowIndex).getHospitalName());
        txtHospitalId.setText(String.valueOf(hospitalHistory.getHospitalHistory().get(selectedRowIndex).getHospitalId()));
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        
        int selectedRowIndex = tblHptl.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Record to update the employee details");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblHptl.getModel();
        Hospital selectedEntry = hospitalHistory.getHospitalHistory().get(selectedRowIndex);

//        //Patient selectedEntry = (Patient) model.getValueAt(selectedRowIndex, 1);
////        selectedEntry.setEmployeeId(txtEmployeeId.getText());
//        selectedEntry.setName(txtname1.getText());
//        
//        selectedEntry.setAge(Integer.parseInt(txtage1.getText()));
//        selectedEntry.setPhone(Long.parseLong(txtphone1.getText()));

//            selectedEntry.setCity(txtCity.getText());
        selectedEntry.setCommunityName(cbCommunity.getSelectedItem().toString());
        selectedEntry.setHospitalName(txtHospitalName.getText());
        selectedEntry.setHospitalId(Integer.parseInt(txtHospitalId.getText()));
        
        

  
        populateDataToTable();
        
        //once deleted all the fiels in view model will be deleted
          txtCity.setText("");
          cbCommunity.setSelectedIndex(-1);
          txtHospitalName.setText("");
          txtHospitalId.setText("");
          btnSave.setEnabled(true);
           
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
          int selectedRowIndex = tblHptl.getSelectedRow();  // gives index of selected rows
        if(selectedRowIndex < 0)
        {
           JOptionPane.showMessageDialog(this, "Select a entry to delete");
           return;
        }
        
                DefaultTableModel model = (DefaultTableModel)tblHptl.getModel();
                Hospital selectedEntry = hospitalHistory.getHospitalHistory().get(selectedRowIndex);
                hospitalHistory.deleteHospital(selectedEntry);
                
        JOptionPane.showMessageDialog(this, "Selected hospital entry deleted");
         populateDataToTable(); //  deletes record from table and updates all entries

         
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cbCity;
    private javax.swing.JComboBox<String> cbCommunity;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHptl;
    private javax.swing.JTextField txtHospitalId;
    private javax.swing.JTextField txtHospitalName;
    // End of variables declaration//GEN-END:variables

 private void populateDataToTable() {
        //TableModel is used to manipulate table content.
        // type casts tablemodel to defaultTableModel.
    DefaultTableModel model = (DefaultTableModel) tblHptl.getModel();
    model.setRowCount(0); // deleting empty records
    
    // looping over profileHistory of employees.
    // getProfileHistory returns the history of employee records.
    for (Hospital p : hospitalHistory.getHospitalHistory()){
        
        // row is array of objects with 9 menbers. (1 for each column)
        Object[] row =  new Object[5];
        row[0] = p.getCommunityName(); 
//        row[1] = p.getCity();
        row[2] = p.getHospitalName();
        row[3] = p.getHospitalId();
        
                
        

        model.addRow(row); // adds row to model

    }
    }
}
