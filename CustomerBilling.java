
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ayush
 */
public class CustomerBilling extends javax.swing.JFrame {

    /**
     * Creates new form CustomerBilling
     */
    public CustomerBilling() {
        initComponents();
        setIcon();
        setResizable(false);
        setTitle("Customer Billing");
        setCustomerComboBox();
        setStockComboBox();
        setRentalComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        print = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        finalamount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        selectfrom = new com.toedter.calendar.JDateChooser();
        From = new javax.swing.JLabel();
        selectto = new com.toedter.calendar.JDateChooser();
        to = new javax.swing.JLabel();
        selectcustomername = new javax.swing.JComboBox<>();
        customername = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        selectfinalamount = new javax.swing.JTextField();
        selectlastbalance = new javax.swing.JTextField();
        lastbalace = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        amountreceived = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        finalamount.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        finalamount.setText("Final Amount      :");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Customer Bill", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        selectfrom.setDateFormatString("yyyy-MM-dd");

        From.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        From.setText("From :- ");

        selectto.setDateFormatString("yyyy-MM-dd");

        to.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        to.setText("To :- ");

        selectcustomername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        customername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customername.setText("Account  :");

        calculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calculate.setText("Calculate Bill");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(From)
                .addGap(18, 18, 18)
                .addComponent(selectfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(to)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(selectto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(to, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(From, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(selectfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(calculate)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        selectfinalamount.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N

        selectlastbalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lastbalace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastbalace.setText("Last Balance :");

        Logo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 0, 153));
        Logo.setText("PAWAN Builder Material Supplier");

        amountreceived.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        amountreceived.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Amount", "Balance"
            }
        ));
        jScrollPane3.setViewportView(amountreceived);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(finalamount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastbalace, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectlastbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectfinalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastbalace)
                            .addComponent(selectlastbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finalamount)
                            .addComponent(selectfinalamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(711, Short.MAX_VALUE)))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(print))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Bill");

        job.setPrintable(new Printable() {

            public int print(Graphics pg, PageFormat pf, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.24, 0.24);
                jPanel2.paint(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_printActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String from = df.format(selectfrom.getDate());
        String too = df.format(selectto.getDate());
        String prod = selectcustomername.getSelectedItem().toString();
        String choose = null;
        String selectcategory=null;
        String columnName=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawandb", "root", "");
            PreparedStatement p1=con.prepareStatement("select CustomerPlotNumber from  customerdetail");
            ResultSet r1=p1.executeQuery();
            while(r1.next()){
            if(prod.equals(r1.getString("CustomerPlotNumber"))){
                selectcategory="addmoneytopn";
                columnName="PlotNumber";
            }
            }
            PreparedStatement p2=con.prepareStatement("select NameOfStock from  stockdetails");
            ResultSet r2=p2.executeQuery();
            while(r2.next()){
            if(prod.equals(r2.getString("NameOfStock"))){
                selectcategory="addmoneytos";
                columnName="StockName";
            }
            }
             PreparedStatement p3=con.prepareStatement("select CustName from  rentalcustomerdetails");
            ResultSet r3=p3.executeQuery();
            while(r3.next()){
            if(prod.equals(r3.getString("CustName"))){
                selectcategory="addmoneytorc";
            columnName="Name";
            }
            }
            PreparedStatement pre =con.prepareStatement("select * from "+selectcategory+" where "+columnName+" = '"+prod+"' AND Date BETWEEN '" + from + "' AND '" + too + "' ");
            ResultSet res=pre.executeQuery();
            DefaultTableModel dtmA = (DefaultTableModel) amountreceived.getModel();
            dtmA.setRowCount(0);
            while(res.next()){
                Object o[] ={(res.getDate("Date")),(res.getInt("Amount"))}; 
                        dtmA.addRow(o);
            }
             double sumA = 0;
                int rnumA =amountreceived.getRowCount();
                for (int i = 0; i < rnumA; i++) {
                    sumA = sumA + Integer.parseInt(amountreceived.getValueAt(i, 1).toString());
                   amountreceived.setValueAt(sumA, i, 2);
                }
                
            
            PreparedStatement pst = con.prepareStatement("select Amount from last_balance where Plot_Number='" + prod + "'");
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                selectlastbalance.setText(rst.getDouble("Amount") + "");
            }
            PreparedStatement ps = con.prepareStatement("select * from AddEntry");
            ResultSet rs = ps.executeQuery();
            PreparedStatement ps1 = con.prepareStatement("select * from AddEntry");
            ResultSet rs1 = ps1.executeQuery();
            PreparedStatement ps2 = con.prepareStatement("select * from  rentcustentry");
            ResultSet rs2 = ps2.executeQuery();
            while (rs.next()) {
                if (rs.getString("PlotNumber").equals(prod)) {
                    choose = "AddEntry1";
                }
            }
            while (rs1.next()) {
                if (rs1.getString("StockName").equals(prod)) {
                    choose = "AddEntry2";
                }
            }
            while (rs2.next()) {
                if (rs2.getString("CustomerName").equals(prod)) {
                    choose = "rentcustentry";
                }
            }
            if (choose.equals("AddEntry1")) {
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Date", "Quantity", "Product", "Rate", "Amount", "Balance"
                        }
                ));
            }
            if (choose.equals("AddEntry2")) {
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Date", "Quantity", "Product", "Rate", "Filling", "Amount", "Balance"
                        }
                ));
            }
            if (choose.equals("rentcustentry")) {
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Date", "Quantity", "Product", "PlotNumber", "StockName", "Amount", "Balance"
                        }
                ));
            }
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            if (choose.equals("AddEntry1")) {
                PreparedStatement pss1 = con.prepareStatement("select * from AddEntry where EntryDate BETWEEN '" + from + "' AND '" + too + "' ");
                ResultSet rss1 = pss1.executeQuery();
                while (rss1.next()) {
                    Object o[] = {rss1.getDate("EntryDate"), rss1.getInt("CQuantity"), rss1.getString("Product"), rss1.getDouble("CRate"), rss1.getDouble("CAmount")};
                    dtm.addRow(o);
                }
            } else if (choose.equals("AddEntry2")) {
                PreparedStatement pss2 = con.prepareStatement("select * from AddEntry where EntryDate BETWEEN '" + from + "' AND '" + too + "' ");
                ResultSet rss2 = pss2.executeQuery();
                while (rss2.next()) {
                    Object o[] = {rss2.getDate("EntryDate"), rss2.getInt("SQuantity"), rss2.getString("Product"), rss2.getDouble("SRate"), rss2.getInt("Filling"), rss2.getDouble("SAmount")};
                    dtm.addRow(o);
                }
            } else if (choose.equals("rentcustentry")) {
                PreparedStatement pss3 = con.prepareStatement("select * from rentcustentry where Date BETWEEN '" + from + "' AND '" + too + "'");
                ResultSet rss3 = pss3.executeQuery();
                while (rss3.next()) {
                    Object o[] = {rss3.getDate("Date"), rss3.getInt("EnterQuantity"), rss3.getString("Product"), rss3.getString("PlotNumber"), rss3.getString("StockName"), rss3.getInt("Rent")};
                    dtm.addRow(o);
                }
            }
          
                double lb1 = Double.parseDouble(selectlastbalance.getText());
                double ft1 =Double.parseDouble( amountreceived.getValueAt(rnumA-1,2 ).toString());
                double flb=lb1-ft1;
                selectlastbalance.setText(flb+"");

            if (choose.equals("AddEntry1")) {
                double sum = 0;
                int rnum = jTable1.getRowCount();
                for (int i = 0; i < rnum; i++) {
                    sum = sum + Double.parseDouble(jTable1.getValueAt(i, 4).toString());
                    jTable1.setValueAt(sum, i, 5);
                }
               double lb = Double.parseDouble(selectlastbalance.getText());
               double ft = Double.parseDouble(jTable1.getValueAt(rnum - 1, 5).toString());
               double fa = lb + ft;
                selectfinalamount.setText(fa + "/-");
            } else if (choose.equals("AddEntry2")) {
                double sum1 = 0;
                int rnum1 = jTable1.getRowCount();
                for (int i = 0; i < rnum1; i++) {
                    sum1 = sum1 + Double.parseDouble(jTable1.getValueAt(i, 5).toString());
                    jTable1.setValueAt(sum1, i, 6);
                }
            double lb = Double.parseDouble(selectlastbalance.getText());
            double ft = Double.parseDouble(jTable1.getValueAt(rnum1 - 1, 6).toString());
           double fa = lb + ft;
                selectfinalamount.setText(fa + "/-");
            } else if (choose.equals("rentcustentry")){
                double sum2 = 0;
                int rnum2 = jTable1.getRowCount();
                for (int i = 0; i < rnum2; i++) {
                    sum2 = sum2 + Double.parseDouble(jTable1.getValueAt(i, 5).toString());
                    jTable1.setValueAt(sum2, i, 6);
                }
              double  lb = Double.parseDouble(selectlastbalance.getText());
              double  ft = Double.parseDouble(jTable1.getValueAt(rnum2-1, 6).toString());
               double  fa = lb + ft;
                selectfinalamount.setText(fa + "/-");
            }
                    } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
          
           
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        close();
        MenuSelection ms = new MenuSelection();
        ms.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBilling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel From;
    private javax.swing.JLabel Logo;
    private javax.swing.JTable amountreceived;
    private javax.swing.JButton back;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel customername;
    private javax.swing.JLabel finalamount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lastbalace;
    private javax.swing.JButton print;
    private javax.swing.JComboBox<String> selectcustomername;
    private javax.swing.JTextField selectfinalamount;
    private com.toedter.calendar.JDateChooser selectfrom;
    private javax.swing.JTextField selectlastbalance;
    private com.toedter.calendar.JDateChooser selectto;
    private javax.swing.JLabel to;
    // End of variables declaration//GEN-END:variables
   private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images\\truck.png")));
    }

    public void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }

    private void setCustomerComboBox() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawandb", "root", "");
            PreparedStatement ps = con.prepareStatement("select * from CustomerDetail");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                selectcustomername.addItem(rs.getString("CustomerPlotNumber"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problem in to assign values in ComboBox");
        }
    }

    private void setStockComboBox() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawandb", "root", "");
            PreparedStatement ps = con.prepareStatement("select NameOfStock from StockDetails");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                selectcustomername.addItem(rs.getString("NameOfStock"));
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problem in to assign values in ComboBox");
        }
    }

    private void setRentalComboBox() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawandb", "root", "");
            PreparedStatement ps = con.prepareStatement("select * from  RentalCustomerDetails");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                selectcustomername.addItem(rs.getString("CustName"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problem in to assign values in ComboBox");
        }
    }
}
