
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush
 */
public class RegisterRentCustomer extends javax.swing.JFrame {

    /**
     * Creates new form RegisterRentCustomer
     */
    public RegisterRentCustomer() {
        initComponents();
        setIcon();
        setResizable(false);
        setTitle("Register Customer (Rent Only)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        PageHeading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        customerid = new javax.swing.JLabel();
        customername = new javax.swing.JLabel();
        selectcustomername = new javax.swing.JTextField();
        customermobilenumber = new javax.swing.JLabel();
        selectcustomermobilenumber = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        selectcustomerid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Logo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 0, 153));
        Logo.setText("PAWAN Builder Material Supplier");

        PageHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PageHeading.setForeground(new java.awt.Color(0, 102, 102));
        PageHeading.setText("Customer Register(Rent Only) :");

        customerid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerid.setText("Enter Customer ID                     :");

        customername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customername.setText("Enter Customer Name                :");

        selectcustomername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectcustomername.setText("Customer Name");
        selectcustomername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectcustomernameMouseClicked(evt);
            }
        });

        customermobilenumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customermobilenumber.setText("Enter Customer Mobile Number   :");

        selectcustomermobilenumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectcustomermobilenumber.setText("Customer MobileNum");
        selectcustomermobilenumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectcustomermobilenumberMouseClicked(evt);
            }
        });
        selectcustomermobilenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectcustomermobilenumberActionPerformed(evt);
            }
        });

        register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        selectcustomerid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectcustomerid.setText("Customer Id");
        selectcustomerid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectcustomeridMouseClicked(evt);
            }
        });
        selectcustomerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectcustomeridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(customerid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(selectcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectcustomermobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(270, 270, 270))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PageHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(customername)
                                    .addGap(186, 186, 186)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(customermobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PageHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customermobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectcustomermobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectcustomernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectcustomernameMouseClicked
        selectcustomername.setText("");
    }//GEN-LAST:event_selectcustomernameMouseClicked

    private void selectcustomermobilenumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectcustomermobilenumberMouseClicked
        selectcustomermobilenumber.setText("");
    }//GEN-LAST:event_selectcustomermobilenumberMouseClicked

    private void selectcustomermobilenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectcustomermobilenumberActionPerformed
        
    }//GEN-LAST:event_selectcustomermobilenumberActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pawandb","root","");
            PreparedStatement ps=con.prepareStatement("insert into RentalCustomerDetails values(?,?,?)");
            ps.setString(1, selectcustomerid.getText());
            ps.setString(2, selectcustomername.getText());
            ps.setString(3, selectcustomermobilenumber.getText());
           ps.execute();
            JOptionPane.showMessageDialog(null, "Customer entry added Successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please !! Fill Correct Entries");
        }
    }//GEN-LAST:event_registerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
        MenuSelection ms=new MenuSelection();
        ms.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void selectcustomeridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectcustomeridMouseClicked
        selectcustomerid.setText("");
    }//GEN-LAST:event_selectcustomeridMouseClicked

    private void selectcustomeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectcustomeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectcustomeridActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegisterRentCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterRentCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterRentCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterRentCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterRentCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel PageHeading;
    private javax.swing.JLabel customerid;
    private javax.swing.JLabel customermobilenumber;
    private javax.swing.JLabel customername;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton register;
    private javax.swing.JTextField selectcustomerid;
    private javax.swing.JTextField selectcustomermobilenumber;
    private javax.swing.JTextField selectcustomername;
    // End of variables declaration//GEN-END:variables
 private void setIcon() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images\\truck.png")));
    }
    public void close(){
    WindowEvent we=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
}
}