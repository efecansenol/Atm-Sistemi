/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atmsistemi;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author efeca
 */
public class Hizliİslem extends javax.swing.JFrame {

    /**
     * Creates new form Hizliİslem
     */
    public Hizliİslem() {
        initComponents();
    }
    

   int MyAccNum;
        public Hizliİslem(int AccNum) {
            
        initComponents();
        MyAccNum = AccNum;
      
        
Getbalance();
        
        
        
    }
        Connection Con = null;
PreparedStatement pst = null;
ResultSet Rs = null;
Statement  St = null;
int OldBalance;
private void Getbalance(){

    String Query ="select Balance from accounttbl where AccNum='"+MyAccNum+"'";
        try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsistemi","root","");
        St = Con.createStatement();
       Rs = St.executeQuery(Query);
       
       
        if(Rs.next())
        {
           
           OldBalance = Rs.getInt(1);
           BalLbl.setText(+OldBalance+"TL");
        }
        else {
            
        }
        }
       
        
        catch(SQLException e){
    JOptionPane.showMessageDialog(this,e);
        
        }
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        DEPOSITBTN = new java.awt.Button();
        DEPOSITBTN1 = new java.awt.Button();
        DEPOSITBTN2 = new java.awt.Button();
        DEPOSITBTN3 = new java.awt.Button();
        DEPOSITBTN4 = new java.awt.Button();
        DEPOSITBTN5 = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BalLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("MONEY BANK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(282, 282, 282))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DEPOSITBTN.setActionCommand("YATIR");
        DEPOSITBTN.setBackground(new java.awt.Color(51, 51, 255));
        DEPOSITBTN.setLabel("100 TL");
        DEPOSITBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTNMouseClicked(evt);
            }
        });

        DEPOSITBTN1.setActionCommand("YATIR");
        DEPOSITBTN1.setBackground(new java.awt.Color(51, 51, 255));
        DEPOSITBTN1.setLabel("1000 TL");
        DEPOSITBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN1MouseClicked(evt);
            }
        });

        DEPOSITBTN2.setActionCommand("YATIR");
        DEPOSITBTN2.setBackground(new java.awt.Color(51, 51, 255));
        DEPOSITBTN2.setLabel("200 TL");
        DEPOSITBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN2MouseClicked(evt);
            }
        });

        DEPOSITBTN3.setActionCommand("YATIR");
        DEPOSITBTN3.setBackground(new java.awt.Color(51, 51, 255));
        DEPOSITBTN3.setLabel("500 TL");
        DEPOSITBTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN3MouseClicked(evt);
            }
        });

        DEPOSITBTN4.setActionCommand("YATIR");
        DEPOSITBTN4.setBackground(new java.awt.Color(51, 51, 255));
        DEPOSITBTN4.setLabel("10000 TL");
        DEPOSITBTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN4MouseClicked(evt);
            }
        });

        DEPOSITBTN5.setActionCommand("YATIR");
        DEPOSITBTN5.setBackground(new java.awt.Color(51, 51, 255));
        DEPOSITBTN5.setLabel("2000 TL");
        DEPOSITBTN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN5MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("Geri dön");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("HIZLI ÇEKİM İŞLEMLERİ");

        BalLbl.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        BalLbl.setText("BAKİYE");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setText("ÇIKIŞ");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(DEPOSITBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                        .addComponent(BalLbl)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel5)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DEPOSITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DEPOSITBTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(262, 262, 262))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DEPOSITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BalLbl)
                            .addComponent(DEPOSITBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DEPOSITBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITBTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DEPOSITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTNMouseClicked
        if (OldBalance < 100){
            JOptionPane.showMessageDialog(this, "Yeterli Bakiyeniz Bulunmuyor.");
        }
        else {
        try {
                String Query ="Update accounttbl set Balance=? where AccNum='"+MyAccNum+"'";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsistemi","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
           
            ps.setInt(1, OldBalance -100);
          
            if(ps.executeUpdate() == 1)
            {
                 JOptionPane.showMessageDialog(this, "Tebrikler");
                 new Mainmenu().setVisible(true);
             this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, "Eksik bilgi");
                
            }
       
           }
           catch(HeadlessException | NumberFormatException | SQLException e) {
               JOptionPane.showMessageDialog(this, e);
           }
        }
    }//GEN-LAST:event_DEPOSITBTNMouseClicked

    private void DEPOSITBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN2MouseClicked
         if (OldBalance < 200){
            JOptionPane.showMessageDialog(this, "Yeterli Bakiyeniz Bulunmuyor.");
        }
        else {
        try {
                String Query ="Update accounttbl set Balance=? where AccNum='"+MyAccNum+"'";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsistemi","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
           
            ps.setInt(1, OldBalance -200);
          
            if(ps.executeUpdate() == 1)
            {
                 JOptionPane.showMessageDialog(this, "Tebrikler");
                 new Mainmenu().setVisible(true);
             this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, "Eksik bilgi");
                
            }
       
           }
           catch(HeadlessException | NumberFormatException | SQLException e) {
               JOptionPane.showMessageDialog(this, e);
           }
        }
    }//GEN-LAST:event_DEPOSITBTN2MouseClicked

    private void DEPOSITBTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN3MouseClicked
         if (OldBalance < 500){
            JOptionPane.showMessageDialog(this, "Yeterli Bakiyeniz Bulunmuyor.");
        }
        else {
        try {
                String Query ="Update accounttbl set Balance=? where AccNum='"+MyAccNum+"'";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsistemi","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
           
            ps.setInt(1, OldBalance -500);
          
            if(ps.executeUpdate() == 1)
            {
                 JOptionPane.showMessageDialog(this, "Tebrikler");
                 new Mainmenu().setVisible(true);
             this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, "Eksik bilgi");
                
            }
       
           }
           catch(HeadlessException | NumberFormatException | SQLException e) {
               JOptionPane.showMessageDialog(this, e);
           }
        }
    }//GEN-LAST:event_DEPOSITBTN3MouseClicked

    private void DEPOSITBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN1MouseClicked
        if (OldBalance < 1000){
            JOptionPane.showMessageDialog(this, "Yeterli Bakiyeniz Bulunmuyor.");
        }
        else {
        try {
                String Query ="Update accounttbl set Balance=? where AccNum='"+MyAccNum+"'";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsistemi","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
           
            ps.setInt(1, OldBalance -1000);
          
            if(ps.executeUpdate() == 1)
            {
                 JOptionPane.showMessageDialog(this, "Tebrikler");
                 new Mainmenu().setVisible(true);
             this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, "Eksik bilgi");
                
            }
       
           }
           catch(HeadlessException | NumberFormatException | SQLException e) {
               JOptionPane.showMessageDialog(this, e);
           }
        }
    }//GEN-LAST:event_DEPOSITBTN1MouseClicked

    private void DEPOSITBTN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN5MouseClicked
         if (OldBalance < 2000){
            JOptionPane.showMessageDialog(this, "Yeterli Bakiyeniz Bulunmuyor.");
        }
        else {
        try {
                String Query ="Update accounttbl set Balance=? where AccNum='"+MyAccNum+"'";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsistemi","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
           
            ps.setInt(1, OldBalance -2000);
          
            if(ps.executeUpdate() == 1)
            {
                 JOptionPane.showMessageDialog(this, "Tebrikler");
                 new Mainmenu().setVisible(true);
             this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, "Eksik bilgi");
                
            }
       
           }
           catch(HeadlessException | NumberFormatException | SQLException e) {
               JOptionPane.showMessageDialog(this, e);
           }
        }
    }//GEN-LAST:event_DEPOSITBTN5MouseClicked

    private void DEPOSITBTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN4MouseClicked
         if (OldBalance < 10000){
            JOptionPane.showMessageDialog(this, "Yeterli Bakiyeniz Bulunmuyor.");
        }
        else {
        try {
                String Query ="Update accounttbl set Balance=? where AccNum='"+MyAccNum+"'";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsistemi","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
           
            ps.setInt(1, OldBalance -10000);
          
            if(ps.executeUpdate() == 1)
            {
                 JOptionPane.showMessageDialog(this, "Tebrikler");
                 new Mainmenu().setVisible(true);
             this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, "Eksik bilgi");
                
            }
       
           }
           catch(HeadlessException | NumberFormatException | SQLException e) {
               JOptionPane.showMessageDialog(this, e);
           }
        }
    }//GEN-LAST:event_DEPOSITBTN4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Mainmenu().setVisible(true);
             this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Hizliİslem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hizliİslem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hizliİslem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hizliİslem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hizliİslem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalLbl;
    private java.awt.Button DEPOSITBTN;
    private java.awt.Button DEPOSITBTN1;
    private java.awt.Button DEPOSITBTN2;
    private java.awt.Button DEPOSITBTN3;
    private java.awt.Button DEPOSITBTN4;
    private java.awt.Button DEPOSITBTN5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
