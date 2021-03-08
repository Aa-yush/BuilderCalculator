
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


public class MenuSelection extends javax.swing.JFrame {

    public MenuSelection() {
        initComponents();
        setIcon();
        setResizable(false);
        setTitle("Menu Selection");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deletestockdetails = new javax.swing.JButton();
        AddEntryButton = new javax.swing.JButton();
        DeleteEntryButton = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        RegisterStock = new javax.swing.JButton();
        EditEntry = new javax.swing.JButton();
        checkingprofit = new javax.swing.JButton();
        LogOut1 = new javax.swing.JButton();
        editcustomerentry = new javax.swing.JButton();
        editcustomerentry1 = new javax.swing.JButton();
        registerforrent = new javax.swing.JButton();
        deleteshowcustomerrent = new javax.swing.JButton();
        editcustentryrent = new javax.swing.JButton();
        editentryrent = new javax.swing.JButton();
        showdeleterententry = new javax.swing.JButton();
        customerregistraction = new javax.swing.JButton();
        addmoney = new javax.swing.JButton();
        moneymanagement = new javax.swing.JButton();
        editmoneyentry = new javax.swing.JButton();
        deletemoneyentry = new javax.swing.JButton();
        customerbilling = new javax.swing.JButton();
        addrententry = new javax.swing.JButton();
        assignlastbalance = new javax.swing.JButton();
        ShowAllEntriesButton1 = new javax.swing.JButton();

        deletestockdetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletestockdetails.setText("Delete Stock Details");
        deletestockdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestockdetailsActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AddEntryButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddEntryButton.setText("Add Entry");
        AddEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEntryButtonActionPerformed(evt);
            }
        });

        DeleteEntryButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteEntryButton.setText("Delete Entry");
        DeleteEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEntryButtonActionPerformed(evt);
            }
        });

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        RegisterStock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegisterStock.setText("Register Stock");
        RegisterStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterStockActionPerformed(evt);
            }
        });

        EditEntry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EditEntry.setText("Edit Entry");
        EditEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEntryActionPerformed(evt);
            }
        });

        checkingprofit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkingprofit.setText("Checking Profit ");
        checkingprofit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkingprofitActionPerformed(evt);
            }
        });

        LogOut1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogOut1.setText("Show/Delete Customer Details");
        LogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut1ActionPerformed(evt);
            }
        });

        editcustomerentry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editcustomerentry.setText("Edit Customer Entry");
        editcustomerentry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editcustomerentryActionPerformed(evt);
            }
        });

        editcustomerentry1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editcustomerentry1.setText("Edit Stock Entry");
        editcustomerentry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editcustomerentry1ActionPerformed(evt);
            }
        });

        registerforrent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerforrent.setText("Register Customer(Rent Only)");
        registerforrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerforrentActionPerformed(evt);
            }
        });

        deleteshowcustomerrent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteshowcustomerrent.setText("Delete/show Customers(Rent Only)");
        deleteshowcustomerrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteshowcustomerrentActionPerformed(evt);
            }
        });

        editcustentryrent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editcustentryrent.setText("Edit Customer Entry(Rent Only)");
        editcustentryrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editcustentryrentActionPerformed(evt);
            }
        });

        editentryrent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editentryrent.setText("Edit Entry(Rent Only)");
        editentryrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editentryrentActionPerformed(evt);
            }
        });

        showdeleterententry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showdeleterententry.setText("Show/delete Entry(Rent Only)");
        showdeleterententry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdeleterententryActionPerformed(evt);
            }
        });

        customerregistraction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerregistraction.setText("Customer Registration");
        customerregistraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerregistractionActionPerformed(evt);
            }
        });

        addmoney.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addmoney.setText("AddMoney");
        addmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmoneyActionPerformed(evt);
            }
        });

        moneymanagement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        moneymanagement.setText("Display Money Management");
        moneymanagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneymanagementActionPerformed(evt);
            }
        });

        editmoneyentry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editmoneyentry.setText("Edit Money Entry");
        editmoneyentry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editmoneyentryActionPerformed(evt);
            }
        });

        deletemoneyentry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletemoneyentry.setText("Delete Money Entry");
        deletemoneyentry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletemoneyentryActionPerformed(evt);
            }
        });

        customerbilling.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerbilling.setText("Customer Billing");
        customerbilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerbillingActionPerformed(evt);
            }
        });

        addrententry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addrententry.setText("Add Rent Entry");
        addrententry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrententryActionPerformed(evt);
            }
        });

        assignlastbalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assignlastbalance.setText("Assign Last Balance");
        assignlastbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignlastbalanceActionPerformed(evt);
            }
        });

        ShowAllEntriesButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowAllEntriesButton1.setText("Show Entry");
        ShowAllEntriesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAllEntriesButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moneymanagement, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(deletemoneyentry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(assignlastbalance, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(checkingprofit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerregistraction, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registerforrent, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegisterStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(customerbilling, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogOut1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(editcustomerentry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addmoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editmoneyentry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editcustentryrent, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editcustomerentry1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addrententry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(showdeleterententry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editentryrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteshowcustomerrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AddEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DeleteEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(722, 722, 722)
                    .addComponent(ShowAllEntriesButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerregistraction, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerforrent, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterStock, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editcustomerentry, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editcustentryrent, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editcustomerentry1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteshowcustomerrent, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerbilling, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addrententry, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editentryrent, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editmoneyentry, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showdeleterententry, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletemoneyentry, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignlastbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneymanagement, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkingprofit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(421, Short.MAX_VALUE)
                    .addComponent(ShowAllEntriesButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(234, 234, 234)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEntryButtonActionPerformed
       close();
       DeleteEntry st=new DeleteEntry();
       st.setVisible(true);
    }//GEN-LAST:event_DeleteEntryButtonActionPerformed

    private void AddEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEntryButtonActionPerformed
       close();
       AddEntry ae=new AddEntry();
       ae.setVisible(true);
    }//GEN-LAST:event_AddEntryButtonActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
       close();
       AdminLogin al=new AdminLogin();
       al.setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

    private void RegisterStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterStockActionPerformed
       close();
       RegisterStock rs=new RegisterStock();
       rs.setVisible(true);
    }//GEN-LAST:event_RegisterStockActionPerformed

    private void EditEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEntryActionPerformed
      close();
      EditEntry ee=new EditEntry();
      ee.setVisible(true);
    }//GEN-LAST:event_EditEntryActionPerformed

    private void checkingprofitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingprofitActionPerformed
      close();
      ProfitLoss pl=new ProfitLoss();
      pl.setVisible(true);
    }//GEN-LAST:event_checkingprofitActionPerformed

    private void deletestockdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestockdetailsActionPerformed
        close();
        DeleteRegisteredStockEntry drse=new DeleteRegisteredStockEntry();
        drse.setVisible(true);
    }//GEN-LAST:event_deletestockdetailsActionPerformed

    private void LogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut1ActionPerformed
        close();
        DeleteCustomerDetail dcd=new DeleteCustomerDetail();
        dcd.setVisible(true);
    }//GEN-LAST:event_LogOut1ActionPerformed

    private void editcustomerentryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editcustomerentryActionPerformed
       close();
       EditCustomerEntry ece=new EditCustomerEntry();
       ece.setVisible(true);
    }//GEN-LAST:event_editcustomerentryActionPerformed

    private void editcustomerentry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editcustomerentry1ActionPerformed
        close();
        EditStockEntry ese=new EditStockEntry();
        ese.setVisible(true);
    }//GEN-LAST:event_editcustomerentry1ActionPerformed

    private void registerforrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerforrentActionPerformed
     close();
     RegisterRentCustomer rrc=new RegisterRentCustomer();
     rrc.setVisible(true);
    }//GEN-LAST:event_registerforrentActionPerformed

    private void deleteshowcustomerrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteshowcustomerrentActionPerformed
        close();
        DeleteShowRentCustomer dsrc=new DeleteShowRentCustomer();
        dsrc.setVisible(true);
    }//GEN-LAST:event_deleteshowcustomerrentActionPerformed

    private void editcustentryrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editcustentryrentActionPerformed
        close();
        EditRentCustomer erc=new EditRentCustomer();
        erc.setVisible(true);
    }//GEN-LAST:event_editcustentryrentActionPerformed

    private void editentryrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editentryrentActionPerformed
       close();
       EditRentEntry ere=new EditRentEntry();
       ere.setVisible(true);
    }//GEN-LAST:event_editentryrentActionPerformed

    private void showdeleterententryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdeleterententryActionPerformed
       close();
       DeleteShowRentEntry dsre=new DeleteShowRentEntry();
       dsre.setVisible(true);
    }//GEN-LAST:event_showdeleterententryActionPerformed

    private void customerregistractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerregistractionActionPerformed
        close();
        CustomerRegistration cr=new CustomerRegistration();
        cr.setVisible(true);
    }//GEN-LAST:event_customerregistractionActionPerformed

    private void addmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmoneyActionPerformed
        close();
        AddMoney am =new AddMoney();
       am.setVisible(true);
    }//GEN-LAST:event_addmoneyActionPerformed

    private void moneymanagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneymanagementActionPerformed
       close();
       DisplayMoneyManagement dmm=new DisplayMoneyManagement();
       dmm.setVisible(true);
    }//GEN-LAST:event_moneymanagementActionPerformed

    private void editmoneyentryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editmoneyentryActionPerformed
        close();
        EditMoneyEntry eme =new EditMoneyEntry();
        eme.setVisible(true);
                
    }//GEN-LAST:event_editmoneyentryActionPerformed

    private void deletemoneyentryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletemoneyentryActionPerformed
        close();
        DeleteMoneyEntry dme=new DeleteMoneyEntry();
        dme.setVisible(true);
                
    }//GEN-LAST:event_deletemoneyentryActionPerformed

    private void customerbillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerbillingActionPerformed
        close();
        CustomerBilling cb=new CustomerBilling();
        cb.setVisible(true);
    }//GEN-LAST:event_customerbillingActionPerformed

    private void addrententryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrententryActionPerformed
        close();
        AddRentEntry are=new AddRentEntry();
        are.setVisible(true);
    }//GEN-LAST:event_addrententryActionPerformed

    private void assignlastbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignlastbalanceActionPerformed
        close();
        AssignLastBalance alb=new AssignLastBalance();
        alb.setVisible(true);
    }//GEN-LAST:event_assignlastbalanceActionPerformed

    private void ShowAllEntriesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllEntriesButton1ActionPerformed
       close();
        ShowTable st=new ShowTable();
        st.setVisible(true);
    }//GEN-LAST:event_ShowAllEntriesButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEntryButton;
    private javax.swing.JButton DeleteEntryButton;
    private javax.swing.JButton EditEntry;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton LogOut1;
    private javax.swing.JButton RegisterStock;
    private javax.swing.JButton ShowAllEntriesButton1;
    private javax.swing.JButton addmoney;
    private javax.swing.JButton addrententry;
    private javax.swing.JButton assignlastbalance;
    private javax.swing.JButton checkingprofit;
    private javax.swing.JButton customerbilling;
    private javax.swing.JButton customerregistraction;
    private javax.swing.JButton deletemoneyentry;
    private javax.swing.JButton deleteshowcustomerrent;
    private javax.swing.JButton deletestockdetails;
    private javax.swing.JButton editcustentryrent;
    private javax.swing.JButton editcustomerentry;
    private javax.swing.JButton editcustomerentry1;
    private javax.swing.JButton editentryrent;
    private javax.swing.JButton editmoneyentry;
    private javax.swing.JButton moneymanagement;
    private javax.swing.JButton registerforrent;
    private javax.swing.JButton showdeleterententry;
    // End of variables declaration//GEN-END:variables
public void close(){
    WindowEvent we=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
}
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images\\truck.png")));
    }
}

