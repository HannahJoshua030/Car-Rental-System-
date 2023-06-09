package OODJ_Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer_Menu extends javax.swing.JFrame {
    Main main = new Main();
    Customer.getCustomer cust = new Customer.getCustomer();
    boolean declared = false;
    boolean declared2 = false;
    
    /**
     * Creates new form CustomerGUI
     */
    public Customer_Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        TABS = new javax.swing.JTabbedPane();
        bookT1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        bookCarIDT = new javax.swing.JTextField();
        bookCarID = new javax.swing.JLabel();
        bookB = new javax.swing.JButton();
        bookPayL = new javax.swing.JLabel();
        bookPayC = new javax.swing.JComboBox<>();
        bookDateL = new javax.swing.JLabel();
        bookHourL = new javax.swing.JLabel();
        bookHourC = new javax.swing.JComboBox<>();
        bookNoL = new javax.swing.JLabel();
        bookNoC = new javax.swing.JComboBox<>();
        calendar = new com.toedter.calendar.JDateChooser();
        editP = new javax.swing.JPanel();
        editNameL = new javax.swing.JLabel();
        editPhoneL = new javax.swing.JLabel();
        editEmailL = new javax.swing.JLabel();
        EditPwL = new javax.swing.JLabel();
        editPPL = new javax.swing.JLabel();
        editNationalityL = new javax.swing.JLabel();
        editUsernameL = new javax.swing.JLabel();
        editSaveB = new javax.swing.JButton();
        editNameT = new javax.swing.JTextField();
        editPhoneT = new javax.swing.JTextField();
        editPWT = new javax.swing.JTextField();
        editEmailT = new javax.swing.JTextField();
        editPPT = new javax.swing.JLabel();
        editUsernameT = new javax.swing.JLabel();
        editNationalityT = new javax.swing.JLabel();
        historyP = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hisTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TABS.setBackground(new java.awt.Color(204, 255, 204));
        TABS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TABSStateChanged(evt);
            }
        });
        TABS.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TABSPropertyChange(evt);
            }
        });

        bookT1.setBackground(new java.awt.Color(0, 204, 204));

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        bookTable.setShowGrid(true);
        jScrollPane1.setViewportView(bookTable);

        bookCarIDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCarIDTActionPerformed(evt);
            }
        });

        bookCarID.setText("ENTER CAR ID:");

        bookB.setText("MAKE A BOOKING");
        bookB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBMouseClicked(evt);
            }
        });
        bookB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBActionPerformed(evt);
            }
        });

        bookPayL.setText("PAYMENT METHOD:");

        bookPayC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CREDIT CARD", "CASH" }));
        bookPayC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookPayCActionPerformed(evt);
            }
        });

        bookDateL.setText("DATE");

        bookHourL.setText("STARTING HOUR:");

        bookHourC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "00:00" }));
        bookHourC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookHourCActionPerformed(evt);
            }
        });

        bookNoL.setText("NUMBER OF DAYS:");

        bookNoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        bookNoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNoCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookT1Layout = new javax.swing.GroupLayout(bookT1);
        bookT1.setLayout(bookT1Layout);
        bookT1Layout.setHorizontalGroup(
            bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
            .addGroup(bookT1Layout.createSequentialGroup()
                .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bookT1Layout.createSequentialGroup()
                        .addComponent(bookCarID)
                        .addGap(36, 36, 36)
                        .addComponent(bookCarIDT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookT1Layout.createSequentialGroup()
                        .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookPayL)
                            .addComponent(bookDateL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookPayC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookT1Layout.createSequentialGroup()
                        .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookHourL)
                            .addComponent(bookNoL))
                        .addGap(18, 18, 18)
                        .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookNoC, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookHourC, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookT1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bookB)
                        .addGap(19, 19, 19))))
        );
        bookT1Layout.setVerticalGroup(
            bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookT1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookCarID)
                    .addComponent(bookCarIDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookHourL)
                    .addComponent(bookHourC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookPayL)
                    .addComponent(bookPayC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNoL))
                .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookT1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bookT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookDateL)
                            .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookT1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookB)
                        .addGap(16, 16, 16))))
        );

        TABS.addTab("Booking", bookT1);

        editP.setBackground(new java.awt.Color(0, 204, 204));
        editP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPMouseClicked(evt);
            }
        });

        editNameL.setText("EDIT FULL NAME:");

        editPhoneL.setText("EDIT PHONE NUMBER");

        editEmailL.setText("EDIT EMAIL");

        EditPwL.setText("EDIT PASSWORD");

        editPPL.setText("PASSPORT NO:");

        editNationalityL.setText("NATIONALITY:");

        editUsernameL.setText("USERNAME:");

        editSaveB.setText("SAVE");
        editSaveB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSaveBMouseClicked(evt);
            }
        });
        editSaveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSaveBActionPerformed(evt);
            }
        });

        editPPT.setText("jLabel9");

        editUsernameT.setText("jLabel11");

        editNationalityT.setText("jLabel12");

        javax.swing.GroupLayout editPLayout = new javax.swing.GroupLayout(editP);
        editP.setLayout(editPLayout);
        editPLayout.setHorizontalGroup(
            editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPLayout.createSequentialGroup()
                        .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPLayout.createSequentialGroup()
                                .addComponent(editPPL)
                                .addGap(81, 81, 81))
                            .addGroup(editPLayout.createSequentialGroup()
                                .addComponent(editNationalityL)
                                .addGap(91, 91, 91)))
                        .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editUsernameT)
                            .addComponent(editNationalityT)
                            .addComponent(editPPT)))
                    .addGroup(editPLayout.createSequentialGroup()
                        .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editNameL)
                            .addComponent(editPhoneL)
                            .addComponent(editEmailL)
                            .addComponent(EditPwL))
                        .addGap(40, 40, 40)
                        .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editNameT, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(editPhoneT)
                            .addComponent(editEmailT)
                            .addComponent(editPWT)))
                    .addComponent(editUsernameL))
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editSaveB)
                .addGap(77, 77, 77))
        );
        editPLayout.setVerticalGroup(
            editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNameL)
                    .addComponent(editNameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPhoneL)
                    .addComponent(editPhoneT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmailL)
                    .addComponent(editEmailT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditPwL)
                    .addComponent(editPWT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPPL)
                    .addComponent(editPPT))
                .addGap(18, 18, 18)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNationalityL)
                    .addComponent(editNationalityT))
                .addGap(18, 18, 18)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editUsernameL)
                    .addComponent(editUsernameT))
                .addGap(28, 28, 28)
                .addComponent(editSaveB)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        TABS.addTab("Edit Profile", editP);

        historyP.setBackground(new java.awt.Color(0, 204, 204));

        hisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        hisTable.setShowGrid(true);
        jScrollPane2.setViewportView(hisTable);

        jButton1.setText("MAIN MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historyPLayout = new javax.swing.GroupLayout(historyP);
        historyP.setLayout(historyPLayout);
        historyPLayout.setHorizontalGroup(
            historyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historyPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );
        historyPLayout.setVerticalGroup(
            historyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        TABS.addTab("History", historyP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TABS)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TABS)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookBActionPerformed

    private void bookCarIDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCarIDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookCarIDTActionPerformed

    private void editSaveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSaveBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editSaveBActionPerformed

    private void bookPayCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookPayCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookPayCActionPerformed

    private void bookBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookBMouseClicked
        // TODO add your handling code here:
        
        ArrayList<String> name = new ArrayList();
        ArrayList<String> model = new ArrayList();
        ArrayList<String> price = new ArrayList();
        ArrayList<String> dates = new ArrayList();
        ArrayList<String> id = new ArrayList();
        try(BufferedReader file = new BufferedReader(new FileReader("Cars.txt"))){
            String line;
            file.readLine();
            while((line = file.readLine()) != null){
                String[] commas = line.split(",");
                name.add(commas[1]);
                model.add(commas[2]);
                price.add(commas[6]);
            }

        }
        catch(IOException e){
            System.out.println("Incorrect File");
        }
        try(BufferedReader file = new BufferedReader(new FileReader("booking.txt"))){
            String line;
            file.readLine();
            while((line = file.readLine()) != null){
                String[] commas = line.split(",");
                id.add(commas[1]);
                dates.add(commas[4]);
            }

        }
        catch(IOException e){
            System.out.println("Incorrect File");
        }
        String x = bookCarIDT.getText();
        int xx = Integer.parseInt(x);
        String y = (String) bookPayC.getSelectedItem();
        Format formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String date = formatter.format(calendar.getDate());
        double total = Double.parseDouble(price.get(xx))*Double.parseDouble((String) bookNoC.getSelectedItem());
        boolean z = false;
        for(int i=0;i<dates.size();i++){
            if(dates.get(i).equals(date) && id.get(i).equals(x)){
                z = true;
            }
        }
        if(z == false){
            cust.createBooking(main.getID(), x, name.get(xx), model.get(xx), date, Double.toString(total), y, (String) bookHourC.getSelectedItem());
        }
        else{
            JOptionPane.showMessageDialog(null,"Car is not available on this date");
        }
        declared2 = false;
        hisTable.setModel(new DefaultTableModel());
    }//GEN-LAST:event_bookBMouseClicked

    private void editSaveBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSaveBMouseClicked
        cust.editCustomer(editNameT.getText(), editPhoneT.getText(), editNationalityT.getText(), editEmailT.getText(), editPPT.getText(), editUsernameT.getText(), editPWT.getText());
    }//GEN-LAST:event_editSaveBMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        if(!declared){
            declared = true;
            String filePath = "Cars.txt";
            File file = new File(filePath);
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");
                DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
                model.setColumnIdentifiers(columnsName);
                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);

                }
            } catch (IOException e) {
                System.out.println("Incorrect File");
            }
            
        }
        if(!declared2){
            declared2 = true;
            String filePath = "booking.txt";
            File file = new File(filePath);
            hisTable.removeAll();
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");
                DefaultTableModel model = (DefaultTableModel) hisTable.getModel();
                model.setColumnIdentifiers(columnsName);
                Object[] tableLines = br.lines().toArray();
                for (int i = 0; i < tableLines.length; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    if (dataRow[0].equals(main.getID())){
                        model.addRow(dataRow);
                    }
                }
                
            } catch (IOException e) {
                System.out.println("Incorrect File");
            }
        }
        ArrayList<String> info = cust.getCustomerInfo(main.getID());
        editNameT.setText(info.get(0));
        editPhoneT.setText(info.get(1));
        editNationalityT.setText(info.get(3));
        editEmailT.setText(info.get(4));
        editPPT.setText(info.get(5));
        editUsernameT.setText(info.get(6));
        editPWT.setText(info.get(7));

    }//GEN-LAST:event_formWindowActivated

    private void editPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPMouseClicked
        
    }//GEN-LAST:event_editPMouseClicked

    private void TABSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TABSStateChanged

        
    }//GEN-LAST:event_TABSStateChanged

    private void TABSPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TABSPropertyChange
        
    }//GEN-LAST:event_TABSPropertyChange

    private void bookHourCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookHourCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookHourCActionPerformed

    private void bookNoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNoCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu c = new MainMenu();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EditPwL;
    private javax.swing.JTabbedPane TABS;
    private javax.swing.JButton bookB;
    private javax.swing.JLabel bookCarID;
    private javax.swing.JTextField bookCarIDT;
    private javax.swing.JLabel bookDateL;
    private javax.swing.JComboBox<String> bookHourC;
    private javax.swing.JLabel bookHourL;
    private javax.swing.JComboBox<String> bookNoC;
    private javax.swing.JLabel bookNoL;
    private javax.swing.JComboBox<String> bookPayC;
    private javax.swing.JLabel bookPayL;
    private javax.swing.JPanel bookT1;
    private javax.swing.JTable bookTable;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.JLabel editEmailL;
    private javax.swing.JTextField editEmailT;
    private javax.swing.JLabel editNameL;
    private javax.swing.JTextField editNameT;
    private javax.swing.JLabel editNationalityL;
    private javax.swing.JLabel editNationalityT;
    private javax.swing.JPanel editP;
    private javax.swing.JLabel editPPL;
    private javax.swing.JLabel editPPT;
    private javax.swing.JTextField editPWT;
    private javax.swing.JLabel editPhoneL;
    private javax.swing.JTextField editPhoneT;
    private javax.swing.JButton editSaveB;
    private javax.swing.JLabel editUsernameL;
    private javax.swing.JLabel editUsernameT;
    private javax.swing.JTable hisTable;
    private javax.swing.JPanel historyP;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
