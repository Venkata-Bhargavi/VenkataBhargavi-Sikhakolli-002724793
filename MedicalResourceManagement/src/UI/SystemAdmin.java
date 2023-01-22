/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import medicalresourcemanagement.CityDirectory;
import medicalresourcemanagement.CommunityDirectory;
import medicalresourcemanagement.Doctor;
import medicalresourcemanagement.DoctorDirectory;
import medicalresourcemanagement.EncounterHistory;
import medicalresourcemanagement.Hospital;
import medicalresourcemanagement.HospitalDirectory;
import medicalresourcemanagement.Patient;
import medicalresourcemanagement.PatientDirectory;
import java.awt.CardLayout;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class SystemAdmin extends javax.swing.JFrame {
    
    PatientDirectory patientlist;
    Patient patient;
    DoctorDirectory doctorlist;
    Doctor doctor;
    EncounterHistory encounterhistory;
    HospitalDirectory hospitallist;
    Hospital hospital;
    
    CommunityDirectory communitylist;
    CityDirectory citylist;
    /**
     * Creates new form SystemAdmin
     */
    public SystemAdmin(PatientDirectory patientlist, DoctorDirectory doctorlist, EncounterHistory encounterhistory, CityDirectory citylist, CommunityDirectory communitylist) {
        initComponents();
        this.patientlist = patientlist;
        this.doctorlist = doctorlist;
        this.encounterhistory = encounterhistory;
        this.hospitallist = hospitallist;
        this.communitylist = communitylist;
        this.citylist = citylist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        patientbtn = new javax.swing.JButton();
        doctorbtn = new javax.swing.JButton();
        hospitalbtn = new javax.swing.JButton();
        encounterbtn = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        controlPanel.setBackground(new java.awt.Color(204, 204, 204));
        controlPanel.setForeground(new java.awt.Color(102, 102, 0));
        controlPanel.setPreferredSize(new java.awt.Dimension(200, 700));

        patientbtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        patientbtn.setText("Manage Patient");
        patientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientbtnActionPerformed(evt);
            }
        });

        doctorbtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        doctorbtn.setText("Manage Doctor");
        doctorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorbtnActionPerformed(evt);
            }
        });

        hospitalbtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        hospitalbtn.setText("Manage Hospitals");
        hospitalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalbtnActionPerformed(evt);
            }
        });

        encounterbtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        encounterbtn.setText("Manage Encounters");
        encounterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterbtnActionPerformed(evt);
            }
        });

        btnlogout.setText("Log Out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doctorbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(encounterbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(patientbtn)
                .addGap(30, 30, 30)
                .addComponent(doctorbtn)
                .addGap(26, 26, 26)
                .addComponent(encounterbtn)
                .addGap(28, 28, 28)
                .addComponent(hospitalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnlogout, hospitalbtn});

        SplitPane.setLeftComponent(controlPanel);

        WorkArea.setBackground(new java.awt.Color(204, 204, 255));
        WorkArea.setPreferredSize(new java.awt.Dimension(1100, 700));
        WorkArea.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(WorkArea);

        getContentPane().add(SplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hospitalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalbtnActionPerformed
        // TODO add your handling code here:
        manageHospitaljPanel mp = new manageHospitaljPanel(citylist, communitylist, hospitallist);
//        SplitPane.setRightComponent(mp);
//        AddHospitaljPanel hp = new AddHospitaljPanel(HospitalDirectory hospitallist);
        WorkArea.add("manageHospitaljPanel", mp);
        CardLayout cardlayout = (CardLayout) WorkArea.getLayout();
        cardlayout.next(WorkArea);
        
    }//GEN-LAST:event_hospitalbtnActionPerformed

    private void patientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientbtnActionPerformed
        // TODO add your handling code here:
        managePatientJPanel mp = new managePatientJPanel(WorkArea, patientlist, encounterhistory, communitylist, citylist, doctorlist);
        WorkArea.add("managePatientJPanel", mp);
        CardLayout cardlayout = (CardLayout) WorkArea.getLayout();
        cardlayout.next(WorkArea);
//        SplitPane.setRightComponent(mp);
    }//GEN-LAST:event_patientbtnActionPerformed

    private void doctorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorbtnActionPerformed
        // TODO add your handling code here:
        oldmanageDoctorjPanel mp = new oldmanageDoctorjPanel(citylist, communitylist, doctorlist);
//        SplitPane.setRightComponent(mp);
        WorkArea.add("manageDoctorjPanel", mp);
        CardLayout cardlayout = (CardLayout) WorkArea.getLayout();
        cardlayout.next(WorkArea);
        
    }//GEN-LAST:event_doctorbtnActionPerformed

    private void encounterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterbtnActionPerformed
        // TODO add your handling code here:
        manageEncounterjPanel encounterPanel = new manageEncounterjPanel(patientlist, communitylist, doctorlist);
        
        WorkArea.add("manageEncounterjPanel", encounterPanel);
        CardLayout cardlayout = (CardLayout) WorkArea.getLayout();
        cardlayout.next(WorkArea);
    }//GEN-LAST:event_encounterbtnActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        userLoginPage ulp = new userLoginPage(patientlist, doctorlist, encounterhistory, citylist, communitylist);
        ulp.setVisible(true);   
    }//GEN-LAST:event_btnlogoutActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
////                new SystemAdmin(patientlist, patient, doctorlist, doctor,  encounterhistory, hospitallist).setVisible(true);
////                new SystemAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton doctorbtn;
    private javax.swing.JButton encounterbtn;
    private javax.swing.JButton hospitalbtn;
    private javax.swing.JButton patientbtn;
    // End of variables declaration//GEN-END:variables
}
