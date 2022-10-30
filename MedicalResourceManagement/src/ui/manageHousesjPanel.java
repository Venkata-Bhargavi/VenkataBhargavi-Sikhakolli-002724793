/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import medicalresourcemanagement.City;
import medicalresourcemanagement.CityDirectory;
import medicalresourcemanagement.Community;
import medicalresourcemanagement.CommunityDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import medicalresourcemanagement.HospitalDirectory;
import medicalresourcemanagement.Hospital;
import medicalresourcemanagement.House;
import medicalresourcemanagement.Patient;
import medicalresourcemanagement.PatientDirectory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
//import medicalresourcemanagement.Patient;

/**
 *
 * @author bhargavi
 */
public class manageHousesjPanel extends javax.swing.JPanel {

    CommunityDirectory communitylist;
    CityDirectory citylist;
    private String checkError;
    City chosenCity;
    Community chosenComm;
    House house;
    /**
     * Creates new form AddHospital
     */
    public manageHousesjPanel(CityDirectory citylist, CommunityDirectory communitylist) {
        initComponents();
        this.communitylist = communitylist;
        this.citylist = citylist;
//        btnAdd.setEnabled(false);
        
        lblCityVal.setText("Select a City.");
        lblCommval.setText("Select a Community.");
        
        
        populatecity();
        
//        citydropdown.setSelectedIndex(-1);

//        populateDataToTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHA = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblHAVal = new javax.swing.JLabel();
        lblCityVal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCommval = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHouse = new javax.swing.JTable();
        citydropdown = new javax.swing.JComboBox<>();
        commdropdown = new javax.swing.JComboBox<>();
        hdropdown = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(900, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Community :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 100, -1));

        jLabel3.setText("City :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        txtHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHAActionPerformed(evt);
            }
        });
        txtHA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHAKeyReleased(evt);
            }
        });
        add(txtHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 190, -1));

        btnView.setText("View & Update");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, -1));

        btnAdd.setText("Add House");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 51, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage Communities");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, 1068, -1));

        lblHAVal.setText(" ");
        add(lblHAVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 191, 30));

        lblCityVal.setText(" ");
        add(lblCityVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 191, 30));

        jLabel4.setText("House Address:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        lblCommval.setText(" ");
        add(lblCommval, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 191, 30));

        tblHouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "House Address", "Community"
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
        jScrollPane2.setViewportView(tblHouse);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 119, 1048, 139));

        citydropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citydropdownActionPerformed(evt);
            }
        });
        citydropdown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                citydropdownKeyReleased(evt);
            }
        });
        add(citydropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 190, -1));

        commdropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commdropdownActionPerformed(evt);
            }
        });
        commdropdown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                commdropdownKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                commdropdownKeyTyped(evt);
            }
        });
        add(commdropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 190, -1));

        hdropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hdropdownActionPerformed(evt);
            }
        });
        hdropdown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hdropdownKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hdropdownKeyTyped(evt);
            }
        });
        add(hdropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHAActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed
    
    public void populatecity() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for(City c: this.citylist.getCitylist()) {
            model.addElement(c.getCityName());
        }
        
        citydropdown.setModel(model);
//        citydropdown.setSelectedIndex(-1);
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        String housetxt = txtHA.getText().toUpperCase();
        String commtxt = (String) commdropdown.getSelectedItem();        
//        Checking and Adding community to community list
//        JOptionPane.showMessageDialog(this,this.communitylist.isCommunityExist(commtxt));

//        if(this.communitylist.isCommunityExist(commtxt)){
//            JOptionPane.showMessageDialog(this, "Community Already Exists!");            
//        }
//        else{
//            this.communitylist.addNewCommunity(commtxt);
//            JOptionPane.showMessageDialog(this, "Community added!");
//        }
//        JOptionPane.showMessageDialog(this,communitylist.size());
//        populatecity();
//        txtCity.setText("");
//      Finding Community object to add houses
//        for(Community x: this.communitylist.getCommunitylist()){
//            if(x.getCommunityName().equals((String)commdropdown.getSelectedItem())){
//                chosenComm= x;
//            }
//        }
//        
////        Checking for house whether exist or not and adding to commlist
        boolean flag = chosenComm.isHouseExist(housetxt);
//        JOptionPane.showMessageDialog(this,flag);
//        JOptionPane.showMessageDialog(this,chosenComm.getCommunityName());
                
        if(flag){
            JOptionPane.showMessageDialog(this, "House Already Exists!");            
        }
        else{
            chosenComm.addNewHouse(housetxt);
            JOptionPane.showMessageDialog(this, "House added!");
        }
        
        
//        //once deleted all the fiels in view model will be deleted
//        txtHA.setText("");
//        cbCommunity.setText("");
//        txtCity.setText("");
//        btnUpdate.setEnabled(false);

//        citydropdown.setSelectedIndex(-1);
//        commdropdown.setSelectedIndex(-1);
        txtHA.setText("");
        citydropdown.setSelectedIndex(-1);
        commdropdown.setSelectedIndex(-1);
//        populateDataToTable();
           
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtHAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHAKeyReleased
        // TODO add your handling code here:
        String PatterN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PatterN);
        Matcher patternmatch = pattern.matcher(txtHA.getText());
        if(!patternmatch.matches())
        {
            lblHAVal.setText("Wrong Input, Please Try Again.");
        }
        else
        {
            lblHAVal.setText("");
        }
    }//GEN-LAST:event_txtHAKeyReleased

    private void commdropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commdropdownActionPerformed
        // TODO add your handling code here:
        
        if(commdropdown.getSelectedIndex() != (-1)){
            lblCommval.setText(""); 
//           
        }
        else{
            lblCommval.setText("Select a Community.");
        }
        
        for(Community comm: chosenCity.getCommunitylist()){
            if(comm.getCommunityName().equals(commdropdown.getSelectedItem()))
                chosenComm = comm;
        }


//        populateDataToTable();
//        JOptionPane.showMessageDialog(this, chosenComm.getCommunityName());
        
        String commtxt = (String) commdropdown.getSelectedItem();
        
//        int flag = 0;
//        
//        for(Community z: communitylist.getCommunitylist()){
//            if(z.getCommunityName().equals(commtxt)){
//                flag=1;
//            }
//        }
//        
//        JOptionPane.showMessageDialog(this, flag);     
        
        
        
        if(this.communitylist.isCommunityExist(chosenComm.getCommunityName())){
//            JOptionPane.showMessageDialog(this, "Community Already Exists!");            
        }
        else{
            this.communitylist.addNewCommunity(chosenComm.getCommunityName());
//            JOptionPane.showMessageDialog(this, "Community added!");
        }
//        JOptionPane.showMessageDialog(this,communitylist.isEmpty());
        
        
    }//GEN-LAST:event_commdropdownActionPerformed
    
    public void populatecommunities() {
      
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for(Community com: this.chosenCity.getCommunitylist()) {
            model.addElement(com.getCommunityName());
        }
        
        commdropdown.setModel(model);
//        commdropdown.setSelectedIndex(-1);

    }
    
    public void populateHouses() {
      
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for(House h: this.chosenComm.getHouselist()) {
            model.addElement(h.getHouseAddress());
        }
        
        hdropdown.setModel(model);
//        commdropdown.setSelectedIndex(-1);

    }
    
    
    private void citydropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citydropdownActionPerformed
        // TODO add your handling code here:
        
        if(citydropdown.getSelectedIndex() != (-1)){
            lblCityVal.setText("");            
        }
        else{
            lblCityVal.setText("Select a City.");
        }
        
        //        this.chosenCity = (City) citydropdown.getSelectedItem();
//        JOptionPane.showMessageDialog(this, citydropdown.getSelectedItem());

        for(City x: this.citylist.getCitylist()){
            if(x.getCityName().equals(citydropdown.getSelectedItem())){
                chosenCity=x;
            }
        }
//        lblCityVal.setText("");
        populatecommunities();       
//        commdropdown.setSelectedIndex(-1);
    }//GEN-LAST:event_citydropdownActionPerformed

    private void citydropdownKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_citydropdownKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_citydropdownKeyReleased

    private void commdropdownKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commdropdownKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_commdropdownKeyTyped

    private void commdropdownKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commdropdownKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_commdropdownKeyReleased

    private void hdropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hdropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hdropdownActionPerformed

    private void hdropdownKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hdropdownKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_hdropdownKeyReleased

    private void hdropdownKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hdropdownKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_hdropdownKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> citydropdown;
    private javax.swing.JComboBox<String> commdropdown;
    private javax.swing.JComboBox<String> hdropdown;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCityVal;
    private javax.swing.JLabel lblCommval;
    private javax.swing.JLabel lblHAVal;
    private javax.swing.JTable tblHouse;
    private javax.swing.JTextField txtHA;
    // End of variables declaration//GEN-END:variables

 private void populateDataToTable() {
     
        //TableModel is used to manipulate table content.
        // type casts tablemodel to defaultTableModel.
        DefaultTableModel model = (DefaultTableModel) tblHouse.getModel();

        model.setRowCount(0); // used to delete empty records from table

        for(House xx: this.chosenComm.getHouselist()){
                Object[] row =  new Object[2];
                row[0] = xx.getHouseAddress(); 
                row[1] = chosenComm.getCommunityName();
                model.addRow(row);
            }
           
    }

    
}
