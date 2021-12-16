/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.VolunteerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.Organization.Organization;
import Business.Profile.Volunteer;
import Business.Profile.VolunteerDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodBankToVolunteerWorkRequest;
import Business.WorkQueue.FundingtoVolunteerWorkRequest;
import Business.WorkQueue.ShelterToVolunteerWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.db4o.cs.internal.messages.Message;
import java.awt.CardLayout;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author yibin
 */
public class ManageAssignmentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem bussiness;
    private VolunteerEnterprise enterprise;
    private VolunteerDirectory profileDirectory;

    public ManageAssignmentJPanel(JPanel userProcessContainer, UserAccount account, VolunteerEnterprise enterprise, EcoSystem business) {
        initComponents();
 
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.bussiness = business;
        this.profileDirectory = enterprise.getVolunteerdirectory();
        
        populateEnterpriseCombox();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblProfile.getModel();
        dtm.setRowCount(0);
        for (Volunteer profile : profileDirectory.getVolunteerDirectory()) { 
                Object[] row = new Object[11];
                row[0] = profile;
                row[1] = profile.getId();
                row[2] = profile.getFirstname();
                row[3] = profile.getLastname();
                row[4] = profile.getGender();
                row[5] = profile.getAge();
                row[6] = profile.getBirth();
                row[7] = profile.getPhone();
                row[8] = profile.getAddress();
                row[9] = profile.getEmail();
                row[10] = profile.getComment();
                dtm.addRow(row);
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfile = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Assign = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        EnterpriseComboBox = new javax.swing.JComboBox<>();
        OrganizationComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsubject = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnRefesh = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProfile1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnRefesh1 = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();

        setBackground(new java.awt.Color(233, 230, 225));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        tblProfile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "First Name", "Last Name", "Gender", "Age", "Birth Day", "Phone Number", "Home Address", "Email Address", "Comment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProfile);
        if (tblProfile.getColumnModel().getColumnCount() > 0) {
            tblProfile.getColumnModel().getColumn(0).setMinWidth(0);
            tblProfile.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblProfile.getColumnModel().getColumn(0).setMaxWidth(0);
            tblProfile.getColumnModel().getColumn(2).setHeaderValue("First Name");
            tblProfile.getColumnModel().getColumn(3).setHeaderValue("Last Name");
            tblProfile.getColumnModel().getColumn(4).setHeaderValue("Gender");
            tblProfile.getColumnModel().getColumn(5).setHeaderValue("Age");
            tblProfile.getColumnModel().getColumn(6).setHeaderValue("Birth Day");
            tblProfile.getColumnModel().getColumn(7).setHeaderValue("Phone Number");
            tblProfile.getColumnModel().getColumn(8).setHeaderValue("Home Address");
            tblProfile.getColumnModel().getColumn(9).setHeaderValue("Email Address");
            tblProfile.getColumnModel().getColumn(10).setHeaderValue("Commen");
        }

        jLabel1.setBackground(new java.awt.Color(43, 71, 92));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 71, 92));
        jLabel1.setText("Assignment");

        Assign.setBackground(new java.awt.Color(94, 138, 117));
        Assign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Assign.setForeground(new java.awt.Color(43, 71, 92));
        Assign.setText("Assign");
        Assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignActionPerformed(evt);
            }
        });

        viewBtn.setBackground(new java.awt.Color(94, 138, 117));
        viewBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewBtn.setForeground(new java.awt.Color(43, 71, 92));
        viewBtn.setText("View/Update");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setBackground(new java.awt.Color(43, 71, 92));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 71, 92));
        jLabel2.setText("Volunteer List");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel3.setBackground(new java.awt.Color(43, 71, 92));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 71, 92));
        jLabel3.setText("Task :");

        EnterpriseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EnterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpriseComboBoxActionPerformed(evt);
            }
        });

        OrganizationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setBackground(new java.awt.Color(43, 71, 92));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 71, 92));
        jLabel4.setText("Enterprise: ");

        jLabel5.setBackground(new java.awt.Color(43, 71, 92));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 71, 92));
        jLabel5.setText("Organization:");

        jLabel6.setBackground(new java.awt.Color(43, 71, 92));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 71, 92));
        jLabel6.setText("Subject: ");

        btnBack.setBackground(new java.awt.Color(94, 138, 117));
        btnBack.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(43, 71, 92));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefesh.setBackground(new java.awt.Color(94, 138, 117));
        btnRefesh.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRefesh.setForeground(new java.awt.Color(43, 71, 92));
        btnRefesh.setText("Refresh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setAutoscrolls(true);

        tblProfile1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblProfile1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "Sender", "Number", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblProfile1);
        if (tblProfile1.getColumnModel().getColumnCount() > 0) {
            tblProfile1.getColumnModel().getColumn(0).setMinWidth(0);
            tblProfile1.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblProfile1.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel7.setBackground(new java.awt.Color(43, 71, 92));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 71, 92));
        jLabel7.setText("Request List");

        btnRefesh1.setBackground(new java.awt.Color(94, 138, 117));
        btnRefesh1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRefesh1.setForeground(new java.awt.Color(43, 71, 92));
        btnRefesh1.setText("Refresh");
        btnRefesh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefesh1ActionPerformed(evt);
            }
        });

        btnComplete.setBackground(new java.awt.Color(94, 138, 117));
        btnComplete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(43, 71, 92));
        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EnterpriseComboBox, 0, 221, Short.MAX_VALUE)
                                    .addComponent(OrganizationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(viewBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Assign, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefesh1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(btnRefesh)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(btnComplete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnRefesh))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Assign)
                            .addComponent(viewBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EnterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OrganizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(144, 144, 144)
                        .addComponent(btnBack)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btnRefesh1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnComplete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignActionPerformed
        int selectedRow = tblProfile.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Volunteer profile = (Volunteer) tblProfile.getValueAt(selectedRow, 0);
        
        
      // Sending email  
        String ToEmail = profile.getEmail();
        String FromEmail = "zheng.fang.ndsu@gmail.com";//studyviral2@gmail.com
        String FromEmailPassword = "acmzplmvwiionmhp";//You email Password from you want to send emai    
        String Subjects = "Task";
        
        Properties properties = new Properties();
        properties.put("mail.smtp.user", "zheng.fang.ndsu@gamil.com");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.debug","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.socketFactory.port","587");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "true");
        properties.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");
        
        Session session = Session.getDefaultInstance(properties,new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
        });
        
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.setRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subjects);
            message.setText(jTextArea1.getText());
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "The email has sent");
//            profileDirectory.removeProfile(profile);
            profile.setComment("On Duty");
        }catch(Exception ex){
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(this, "Some thing Wrong with server, Please Try again later!");
        }
        
  
        
        txtsubject.setText("");
        jTextArea1.setText("");
        //=================
        
        
        Enterprise e = (Enterprise) EnterpriseComboBox.getSelectedItem();
        Organization o = (Organization) OrganizationComboBox.getSelectedItem();
        
        
        
        
        
//        profileDirectory.removeProfile(profile);
        populateTable();
    }//GEN-LAST:event_AssignActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        try {
            int selectedRow = tblProfile.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Volunteer profile = (Volunteer) tblProfile.getValueAt(selectedRow, 0);
            ModifyVolunteerProfileJPanel modifyProfile = new ModifyVolunteerProfileJPanel(userProcessContainer, account, enterprise,
                     profileDirectory, profile);
            userProcessContainer.add("ModifyVolunteerProfileJPanel", modifyProfile);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } catch (Exception ex) {
            Logger.getLogger(ManageAssignmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void EnterpriseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterpriseComboBoxActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) EnterpriseComboBox.getSelectedItem();
        if(enterprise != null){
            populateorganization(enterprise);
        }
        
    }//GEN-LAST:event_EnterpriseComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        // TODO add your handling code here:
                populateTable();
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void btnRefesh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefesh1ActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_btnRefesh1ActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tblProfile1.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            WorkRequest w = (WorkRequest) tblProfile1.getValueAt(selectedRow, 0);
            
            w.setStatus("Completed");
            
            populateRequestTable();

        } catch (Exception ex) {
            Logger.getLogger(ManageAssignmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Assign;
    private javax.swing.JComboBox<Object> EnterpriseComboBox;
    private javax.swing.JComboBox<Object> OrganizationComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnRefesh1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblProfile;
    private javax.swing.JTable tblProfile1;
    private javax.swing.JTextField txtsubject;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void populateorganization(Enterprise enterprise) {
        OrganizationComboBox.removeAllItems();
        
        for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
            OrganizationComboBox.addItem(o);
        }
        
    }

    private void populateEnterpriseCombox() {
        EnterpriseComboBox.removeAllItems();
        
        for(Enterprise e : bussiness.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()){
            EnterpriseComboBox.addItem(e);
        }
        
    }

    private void populateRequestTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblProfile.getModel();
        dtm.setRowCount(0);
  
        for(FoodBankToVolunteerWorkRequest v:enterprise.getWorkQueue().getFoodBankToVolunteerWorkRequestArrayList()){
                Object[] row = new Object[5];
                row[0] = v;
                row[1] = v.getSender();
                row[2] = v.getNum();
                row[3] = v.getStatus();
                row[4] = v.getMessage();
                dtm.addRow(row);
        }
        
        
        for(ShelterToVolunteerWorkRequest v:enterprise.getWorkQueue().getSheltertovolunteerlist()){
                Object[] row = new Object[5];
                row[0] = v;
                row[1] = v.getSender();
                row[2] = v.getHeadcount();
                row[3] = v.getStatus();
                row[4] = v.getMessage();
                dtm.addRow(row);
        }
        
        for(FundingtoVolunteerWorkRequest v:enterprise.getWorkQueue().getFundingtoVolunteerWorkRequestArrayList()){
                Object[] row = new Object[5];
                row[0] = v;
                row[1] = v.getSender();
                row[2] = v.getNum();
                row[3] = v.getStatus();
                row[4] = v.getMessage();
                dtm.addRow(row);
        }
    }
        

}
