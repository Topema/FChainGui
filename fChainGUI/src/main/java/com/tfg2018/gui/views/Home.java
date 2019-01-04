/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.views;

import com.tfg2018.gui.ApiManager.GetOperation;
import com.tfg2018.gui.RequestObjects.CreateTokenStructure;
import com.tfg2018.gui.RequestObjects.RequestMessage;
import com.tfg2018.gui.ResponseObject.KeyPair;
import com.tfg2018.gui.ResponseObject.Token;
import com.tfg2018.gui.factura.Factura;
import com.tfg2018.gui.factura.InvoiceReader;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tomas
 */
public class Home extends javax.swing.JFrame {

    private String userName;
    private KeyPair userKeyPair;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Home(String userName, KeyPair userKeyPair) {
        this.userName = userName;
        this.userKeyPair = userKeyPair;
        initComponents();
        userNameLabel.setText(userName);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        invoiceConsultButton = new javax.swing.JButton();
        registerInvoiceButton = new javax.swing.JButton();
        myInvoicesButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(177, 212, 229));
        jPanel1.setPreferredSize(new java.awt.Dimension(604, 385));

        jPanel2.setBackground(new java.awt.Color(18, 57, 98));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio");

        jPanel4.setBackground(new java.awt.Color(121, 158, 178));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userNameLabel.setBackground(new java.awt.Color(121, 158, 178));
        userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tomas\\Pictures\\usuario.png")); // NOI18N
        userNameLabel.setText("Bonny  SA");

        logOutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tomas\\Pictures\\logout.png")); // NOI18N
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(logOutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userNameLabel)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(102, 102, 102)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(121, 158, 178));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        invoiceConsultButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        invoiceConsultButton.setText("Consultar factura");
        invoiceConsultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceConsultButtonActionPerformed(evt);
            }
        });

        registerInvoiceButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registerInvoiceButton.setText("Registrar factura");
        registerInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerInvoiceButtonActionPerformed(evt);
            }
        });

        myInvoicesButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        myInvoicesButton.setText("Mis facturas");
        myInvoicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInvoicesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(invoiceConsultButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerInvoiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myInvoicesButton)
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(invoiceConsultButton)
                .addGap(49, 49, 49)
                .addComponent(registerInvoiceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(myInvoicesButton)
                .addGap(27, 27, 27))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 57, 98));
        jLabel3.setText("Tomás Pérez Márquez");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceConsultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceConsultButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Por favor, tenga en cuenta que la factura debe estar en formato .xml para poder ser consultada", "Formato de factura", JOptionPane.INFORMATION_MESSAGE);
        JFileChooser invoiceChooser = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter(
                "xml files (*.xml)", "xml");
        invoiceChooser.setDialogTitle("Por favor seleccione la factura");
        invoiceChooser.setFileFilter(xmlfilter);

        int selection = invoiceChooser.showOpenDialog(this);

        if (selection == JFileChooser.APPROVE_OPTION) {
            File file = invoiceChooser.getSelectedFile();
            try {
                InvoiceReader i = new InvoiceReader();
                Factura invoice = i.readInvoice(file);
                GetOperation get = new GetOperation();
                CreateTokenStructure requestToken = new CreateTokenStructure("", invoice.getTokenParameters());
                Token invoiceToken = get.getTokenInfo(requestToken.getTokenName());
                Home homeFrame = new Home();
                InvoiceStateShow invoiceStateShow = new InvoiceStateShow(this.userName, this.userKeyPair, invoiceToken);
                homeFrame.setVisible(false);
                invoiceStateShow.setVisible(true);
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Asegúrese de que la factura está en formato XML por favor", "ERROR", JOptionPane.WARNING_MESSAGE);
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_invoiceConsultButtonActionPerformed

    private void registerInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerInvoiceButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Por favor, tenga en cuenta que la factura debe estar en formato .xml para poder ser registrada en la cadena de bloques", "Formato de factura", JOptionPane.INFORMATION_MESSAGE);
        JFileChooser invoiceChooser = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter(
                "xml files (*.xml)", "xml");
        invoiceChooser.setDialogTitle("Por favor seleccione la factura");
        invoiceChooser.setFileFilter(xmlfilter);
        int selection = invoiceChooser.showOpenDialog(this);
        if (selection == JFileChooser.APPROVE_OPTION) {
            File file = invoiceChooser.getSelectedFile();
            try {
                InvoiceReader i = new InvoiceReader();
                Factura invoice = i.readInvoice(file);
                Home homeFrame = new Home();
                InvoiceDataShow invoiceDataFrame = new InvoiceDataShow(this.userName, this.userKeyPair, invoice);
                homeFrame.setVisible(false);
                invoiceDataFrame.setVisible(true);
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Asegúrese de que la factura está en formato XML por favor", "ERROR", JOptionPane.WARNING_MESSAGE);
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_registerInvoiceButtonActionPerformed

    private void myInvoicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInvoicesButtonActionPerformed
        Home homeFrame = new Home();
        MyInvoices myInvoicesFrame = new MyInvoices(this.userName, this.userKeyPair);
        homeFrame.setVisible(false);
        myInvoicesFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_myInvoicesButtonActionPerformed

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        Log logFrame = new Log();
        Home homeFrame = new Home();
        logFrame.setVisible(true);
        homeFrame.setVisible(false);
        dispose();
    }//GEN-LAST:event_logOutButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton invoiceConsultButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logOutButton;
    private javax.swing.JButton myInvoicesButton;
    private javax.swing.JButton registerInvoiceButton;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
