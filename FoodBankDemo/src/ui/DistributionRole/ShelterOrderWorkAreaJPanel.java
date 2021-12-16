/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DistributionRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Foodbank.DistributionOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShelterToFoodbankWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author zhengfang
 */
public class ShelterOrderWorkAreaJPanel extends javax.swing.JPanel {
    private ShelterToFoodbankWorkRequest q;
    private JPanel userProcessContainer;
    /**
     * Creates new form ShelterOrderWorkAreaJPanel
     */
    public ShelterOrderWorkAreaJPanel(JPanel userProcessContainer,ShelterToFoodbankWorkRequest w) {
        initComponents();
        this.q = w;
        this.userProcessContainer = userProcessContainer;
        
        q.getItemName();
        q.getQty();
        q.getUnit();
        q.getSender();
        q.getReceiver();
        q.getRequestDate();
        q.getResolveDate();
        q.getStatus();
        q.getMessage();
        jLabel1.setText(q.getItemName());
        jLabel2.setText(String.valueOf(q.getQty()));
        jLabel3.setText(q.getUnit());
        jLabel4.setText(q.getSender().toString());
        jLabel5.setText(q.getReceiver().toString());
        jLabel6.setText(q.getRequestDate().toString());
        jLabel7.setText(q.getResolveDate().toString());
        jLabel8.setText(q.getStatus());
        jLabel9.setText(q.getMessage());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("jLabel2");

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("jLabel3");

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("jLabel4");

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("jLabel5");

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("jLabel6");

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("jLabel7");

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("jLabel8");

        jLabel9.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("jLabel9");

        jLabel10.setBackground(new java.awt.Color(204, 255, 204));
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Name:");

        jLabel11.setBackground(new java.awt.Color(204, 255, 204));
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Quantity:");

        jLabel12.setBackground(new java.awt.Color(204, 255, 204));
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Unit:");

        jLabel13.setBackground(new java.awt.Color(204, 255, 204));
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Sender:");

        jLabel14.setBackground(new java.awt.Color(204, 255, 204));
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Reciver:");

        jLabel15.setBackground(new java.awt.Color(204, 255, 204));
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("Request Date: ");

        jLabel16.setBackground(new java.awt.Color(204, 255, 204));
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setText("Resolved Date: ");

        jLabel17.setBackground(new java.awt.Color(204, 255, 204));
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Status: ");

        jLabel18.setBackground(new java.awt.Color(204, 255, 204));
        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("Message: ");

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel17))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel18))
                .addGap(71, 71, 71)
                .addComponent(jButton1)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
