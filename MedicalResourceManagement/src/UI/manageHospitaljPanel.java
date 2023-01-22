/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import medicalresourcemanagement.City;
import medicalresourcemanagement.CityDirectory;
import medicalresourcemanagement.Community;
import medicalresourcemanagement.CommunityDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import medicalresourcemanagement.HospitalDirectory;
import medicalresourcemanagement.Hospital;
import medicalresourcemanagement.Patient;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
//import medicalresourcemanagement.Patient;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class manageHospitaljPanel extends javax.swing.JPanel {

    HospitalDirectory hospitalHistory;
    private String checkError;
    
    CityDirectory citylist;
    CommunityDirectory communitylist;
    City chosenCity;
    Community chosenComm;
    
    /**
     * Creates new form AddHospital
     */
    public manageHospitaljPanel(CityDirectory citylist, CommunityDirectory communitylist, HospitalDirectory hospitalHistory) {
        initComponents();
        this.hospitalHistory = hospitalHistory;
        this.citylist = citylist;
        this.communitylist = communitylist;
        btnUpdate.setEnabled(false);
//        btnSearch.setEnabled(false);
//        btnSave.setEnabled(false);
        populatecity();
//        btnSearch.setEnabled(false);

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
        tblHptl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txthn = new javax.swing.JTextField();
        commdropdown = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txthid = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ecomm = new javax.swing.JLabel();
        ehn = new javax.swing.JLabel();
        ehi = new javax.swing.JLabel();
        ec = new javax.swing.JLabel();
        citydropdown = new javax.swing.JComboBox<>();
        srch = new javax.swing.JTextField();
        ddcom = new javax.swing.JComboBox<>();
        ddci = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(900, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 80));

        tblHptl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Id", "Hospital Name", "Community", "City"
            }
        ));
        tblHptl.setPreferredSize(new java.awt.Dimension(900, 80));
        jScrollPane1.setViewportView(tblHptl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1029, 100));

        jLabel2.setText("Community :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        jLabel3.setText("City :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel4.setText("Hospital Id :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 462, -1, -1));

        txthn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthnActionPerformed(evt);
            }
        });
        txthn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthnKeyReleased(evt);
            }
        });
        add(txthn, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 405, 155, -1));

        commdropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Community", "Brigham", "Huntington Avenue", "Mission Hill", "Brookline", "Fenway" }));
        commdropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commdropdownActionPerformed(evt);
            }
        });
        add(commdropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 150, -1));

        jLabel5.setText("Hospital Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 408, -1, -1));

        txthid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthidActionPerformed(evt);
            }
        });
        txthid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthidKeyReleased(evt);
            }
        });
        add(txthid, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 456, 155, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 530, -1, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, -1, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 530, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 51, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage Hospitals");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, 1068, -1));

        ecomm.setText(" ");
        add(ecomm, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 191, 30));

        ehn.setText(" ");
        add(ehn, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 405, 191, 30));

        ehi.setText(" ");
        add(ehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 456, 191, 30));

        ec.setText(" ");
        add(ec, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 191, 30));

        citydropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citydropdownActionPerformed(evt);
            }
        });
        add(citydropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 150, -1));

        srch.setText("Search Hospital by:");
        srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchActionPerformed(evt);
            }
        });
        add(srch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        ddcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddcomActionPerformed(evt);
            }
        });
        add(ddcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 190, -1));

        ddci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddciActionPerformed(evt);
            }
        });
        add(ddci, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 190, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    public void populatecity() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for(City c: this.citylist.getCitylist()) {
            model.addElement(c.getCityName());
        }
        
        citydropdown.setModel(model);
        ddci.setModel(model);
//        citydropdown.setSelectedIndex(-1);
    }
    
    public void populatecommunities() {
      
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for(Community com: this.chosenCity.getCommunitylist()) {
            model.addElement(com.getCommunityName());
        }
        
        commdropdown.setModel(model);
//        commdropdown.setSelectedIndex(-1);

    }
    
    public void populatecommunities(City c) {
      
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for(Community com: c.getCommunitylist()) {
            model.addElement(com.getCommunityName());
        }
        
        ddcom.setModel(model);
//        commdropdown.setSelectedIndex(-1);

    }
    
    
    private void txthnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthnActionPerformed

    private void txthidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthidActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if(ec.getText() == ""  && ecomm.getText() == "" && ehn.getText() == "" && ehi.getText() == "" )
        {   btnSave.setEnabled(true);
            String selectedCommText = commdropdown.getSelectedItem().toString();
            Community selectedComm = communitylist.searchCommunity(selectedCommText);
            boolean flag = selectedComm.isHospitalIdExist(Integer.parseInt(txthid.getText()));
//            JOptionPane.showMessageDialog(this,selectedComm.getHospitalist().isEmpty());

            if(flag){
                JOptionPane.showMessageDialog(this, "HospitalId Already Exists!, Please choose different ID ");            
            }
            else{
                selectedComm.addNewHospital(txthn.getText(),Integer.parseInt(txthid.getText()));
                JOptionPane.showMessageDialog(this, "Hospital added!");
            }
            
            txthid.setText("");
            txthn.setText("");
//            btnUpdate.setEnabled(false);
            btnSearch.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Please provide all details.");
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblHptl.getSelectedRow();  // gives index of selected rows
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Select a Hospital to make changes.");
            btnUpdate.setEnabled(false);
//            return;
        }
        else{
            btnUpdate.setEnabled(true);
        }
        
        DefaultTableModel model = (DefaultTableModel) tblHptl.getModel();
        
        
        Community selectedComm = communitylist.searchCommunity((String) ddcom.getSelectedItem());
        Hospital selectedHos = (Hospital) selectedComm.getHospitallist().get(selectedRowIndex);
        
        
        citydropdown.setSelectedItem(chosenCity);
        commdropdown.setSelectedItem(chosenComm);
        txthid.setText(String.valueOf(selectedHos.getHospitalId()));
        txthn.setText(selectedHos.getHospitalName());
        
        ec.setText("");
        ecomm.setText("");
        
        citydropdown.setEnabled(false);
        commdropdown.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHptl.getSelectedRow();  // gives index of selected rows
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Select a Hospital to make changes.");
        }
        
        DefaultTableModel model = (DefaultTableModel) tblHptl.getModel();

        Community selectedComm = communitylist.searchCommunity((String) ddcom.getSelectedItem());
        Hospital selectedHos = (Hospital) selectedComm.getHospitallist().get(selectedRowIndex);
        
        selectedHos.setHospitalId(Integer.parseInt(txthid.getText()));
        selectedHos.setHospitalName(txthn.getText());
        
//        populateDataToTable();
        populateDataTable(selectedComm, chosenComm.getCommunityName(), chosenCity.getCityName() );
//        
        //once deleted all the fiels in view model will be deleted
        txthid.setText("");
        txthn.setText("");
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        citydropdown.setEnabled(true);
        commdropdown.setEnabled(true);
           
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHptl.getSelectedRow();  // gives index of selected rows
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Select a Hospital to make changes.");
        }
        
        DefaultTableModel model = (DefaultTableModel) tblHptl.getModel();

        Community selectedComm = communitylist.searchCommunity((String) ddcom.getSelectedItem());
        Hospital selectedHos = (Hospital) selectedComm.getHospitallist().get(selectedRowIndex);
        
        
        selectedComm.deleteHospital(selectedHos);
        JOptionPane.showMessageDialog(this, "Selected Record Deleted");
        populateDataTable(selectedComm, chosenComm.getCommunityName(), chosenCity.getCityName() );

    }//GEN-LAST:event_jButton3ActionPerformed

    private void citydropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citydropdownActionPerformed
        // TODO add your handling code here:
        if(citydropdown.getSelectedIndex() != (-1)){
            ec.setText("");            
        }
        else{
            ec.setText("Select a City.");
        }
        
        //        this.chosenCity = (City) citydropdown.getSelectedItem();
//        JOptionPane.showMessageDialog(this, citydropdown.getSelectedItem());

        for(City x: this.citylist.getCitylist()){
            if(x.getCityName().equals(citydropdown.getSelectedItem())){
                chosenCity=x;
            }
        }
        populatecommunities();   
    }//GEN-LAST:event_citydropdownActionPerformed

    private void commdropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commdropdownActionPerformed
        // TODO add your handling code here:
        
        if(commdropdown.getSelectedIndex() != (-1)){
            ecomm.setText("");            
        }
        else{
            ecomm.setText("Select a Community.");
        }
        
        for(Community comm: chosenCity.getCommunitylist()){
            if(comm.getCommunityName().equals(commdropdown.getSelectedItem()))
                chosenComm = comm;
        }
        String selectedCommText = commdropdown.getSelectedItem().toString();
//        JOptionPane.showMessageDialog(this,selectedCommText);
        
        Community selectedComm = communitylist.searchCommunity(selectedCommText);

    }//GEN-LAST:event_commdropdownActionPerformed

    private void txthnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthnKeyReleased
        // TODO add your handling code here:
        
        String PatterN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PatterN);
        Matcher patternmatch = pattern.matcher(txthn.getText());
        if(!patternmatch.matches())
        {
            ehn.setText("Please Enter a Valid Name.");
        }
        else
        {
            ehn.setText("");
        }
    }//GEN-LAST:event_txthnKeyReleased

    private void txthidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthidKeyReleased
        // TODO add your handling code here:
        String PatterN = "^[0-9 +()-]{1,10}$";
        Pattern pattern = Pattern.compile(PatterN);
        Matcher patternmatch = pattern.matcher(txthid.getText());
        if(!patternmatch.matches())
        {
            ehi.setText("Please Enter a Valid Number.");
        }
        else
        {
            ehi.setText("");
        }
        
    }//GEN-LAST:event_txthidKeyReleased

    private void srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if(ddci.getSelectedIndex() != -1 || ddcom.getSelectedIndex() != -1){
            btnSearch.setEnabled(true);
            
            for(City x: this.citylist.getCitylist()){
                if(x.getCityName().equals(ddci.getSelectedItem())){
                    chosenCity=x;
            }
            for(Community comm: chosenCity.getCommunitylist()){
                if(comm.getCommunityName().equals(ddcom.getSelectedItem()))
                    chosenComm = comm;
            }
            
//            city, comm, pull hospital list and throw to the table
            Community selectedComm = communitylist.searchCommunity(chosenComm.getCommunityName());
            
            if(selectedComm.getHospitallist().size() > 0) {
                populateDataTable(selectedComm, chosenComm.getCommunityName(), chosenCity.getCityName() );
            }
            else{
                JOptionPane.showMessageDialog(this,"No Hospitals in selected Community.");
            }
//            boolean flag = selectedComm.isHouseExist(housetxt);
//    //        JOptionPane.showMessageDialog(this,flag);
//    //        JOptionPane.showMessageDialog(this,chosenComm.getCommunityName());
//
//            if(flag){
//                JOptionPane.showMessageDialog(this, "House Already Exists!");            
//            }
//            else{
//                selectedComm.addNewHouse(housetxt);
//                JOptionPane.showMessageDialog(this, "House added!");
//            }
            
            
        }
            
            
        }
        else{
            JOptionPane.showMessageDialog(this,"Select City and Community.");
        }
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void ddciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddciActionPerformed
        // TODO add your handling code here:
        
        
        //        this.chosenCity = (City) citydropdown.getSelectedItem();
//        JOptionPane.showMessageDialog(this, citydropdown.getSelectedItem());

        for(City x: this.citylist.getCitylist()){
            if(x.getCityName().equals(ddci.getSelectedItem())){
                chosenCity=x;
            }
        }
        populatecommunities(chosenCity);   
//        btnSearch.setEnabled(true);
        
        
    }//GEN-LAST:event_ddciActionPerformed

    private void ddcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddcomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddcomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> citydropdown;
    private javax.swing.JComboBox<String> commdropdown;
    private javax.swing.JComboBox<String> ddci;
    private javax.swing.JComboBox<String> ddcom;
    private javax.swing.JLabel ec;
    private javax.swing.JLabel ecomm;
    private javax.swing.JLabel ehi;
    private javax.swing.JLabel ehn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField srch;
    private javax.swing.JTable tblHptl;
    private javax.swing.JTextField txthid;
    private javax.swing.JTextField txthn;
    // End of variables declaration//GEN-END:variables

 private void populateDataTable(Community comm, String commN, String cityN) {
    DefaultTableModel model = (DefaultTableModel) tblHptl.getModel();
    model.setRowCount(0); // deleting empty records
    for (Hospital p : comm.getHospitallist()){
        Object[] row =  new Object[4];
        row[0] = p.getHospitalId();
        row[1] = p.getHospitalName();
        row[2] = commN;
        row[3] = cityN;
        model.addRow(row); // adds row to model
        }
    }
}