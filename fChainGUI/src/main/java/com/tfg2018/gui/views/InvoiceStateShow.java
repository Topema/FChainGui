/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.views;

import com.tfg2018.gui.ApiManager.GetOperation;
import com.tfg2018.gui.ApiManager.PostOperation;
import com.tfg2018.gui.ResponseObject.KeyPair;
import com.tfg2018.gui.ResponseObject.Token;
import com.tfg2018.gui.Utils.GlobalVariables;
import com.tfg2018.gui.factura.Factura;
import java.awt.Color;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class InvoiceStateShow extends javax.swing.JFrame {

    private String userName;
    private KeyPair userKeyPair;
    private Token invoice;

    /**
     * Creates new form InvoiceStateShow
     */
    public InvoiceStateShow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public InvoiceStateShow(String userName, KeyPair userKeyPair, Token invoice) {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            this.userName = userName;
            this.userKeyPair = userKeyPair;
            this.invoice = invoice;
            userNameLabel.setText(userName);
            Map<String, String> tokenDetails = invoice.getDetails();
            String details = "";
            for (Map.Entry<String, String> entry : tokenDetails.entrySet()) {
                details += entry.getKey() + "-->" + entry.getValue() + '\n';
            }
            GetOperation get = new GetOperation();
            pagadorText.setText(get.getTokenCreator(invoice.getName()));
            String owner = get.getTokenOwner(invoice.getName());
            if (owner.equals(GlobalVariables.burnAddress)) {
                actualBeneficiarioText.setText(get.getTokenLastOwner(invoice.getName()));
                actualJLabel.setText("Beneficiario final:");
                InvoiceStateLabel.setText("RESUELTA");
                InvoiceStateLabel.setForeground(Color.GREEN);
            } else {
                actualBeneficiarioText.setText(owner);
                InvoiceStateLabel.setText("NO RESUELTA");
                InvoiceStateLabel.setForeground(Color.RED);
            }
            inicialBeneficiarioText.setText(get.getTokenInitialOwner(invoice.getName()));
            invoiceInfoTextArea.setText(details);
        } catch (Exception ex) {
            Logger.getLogger(InvoiceStateShow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        InvoiceStateLabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pagadorText = new javax.swing.JTextField();
        PagadorNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceInfoTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        actualJLabel2 = new javax.swing.JLabel();
        actualBeneficiarioText = new javax.swing.JTextField();
        ActualBeneficiarioFieldText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        inicialBeneficiarioText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InicialBeneficiarioFieldText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        actualJLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1035, 837));

        jPanel1.setBackground(new java.awt.Color(177, 212, 229));

        jPanel2.setBackground(new java.awt.Color(18, 57, 98));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado de la factura:");

        InvoiceStateLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        InvoiceStateLabel.setForeground(new java.awt.Color(255, 0, 51));
        InvoiceStateLabel.setText("Pendiente");

        jPanel9.setBackground(new java.awt.Color(121, 158, 178));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userNameLabel.setBackground(new java.awt.Color(121, 158, 178));
        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tomas\\Pictures\\usuario.png")); // NOI18N
        userNameLabel.setText("Sabadell");

        logOutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tomas\\Pictures\\logout.png")); // NOI18N
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(logOutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameLabel)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userNameLabel)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(InvoiceStateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InvoiceStateLabel))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(121, 158, 178));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Dirección:");

        pagadorText.setEditable(false);
        pagadorText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pagadorText.setText("1CrLCRn5zUSXw2VVYimoiMGbj8Aw9JEWeBmsBc");

        PagadorNameTextField.setEditable(false);
        PagadorNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PagadorNameTextField.setText("PcComponentes");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nombre:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PagadorNameTextField)
                    .addComponent(pagadorText))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(PagadorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagadorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(121, 158, 178));

        invoiceInfoTextArea.setEditable(false);
        invoiceInfoTextArea.setColumns(20);
        invoiceInfoTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        invoiceInfoTextArea.setRows(5);
        invoiceInfoTextArea.setText("*****************************EMISOR*****************************\nNombre --> PcComponentes Mexico\nRfc --> PPL961114GZ1\nPaís --> Mexico\nEstado --> MEXICO, D.F.\nMunicipio --> BENITO JUAREZ\nCódigo Postal --> 03240\nCalle --> AV. RIO MIXCOAC\n\n****************************RECEPTOR****************************\nNombre --> informatica Paco Salas\nRfc --> PEPJ8001019Q8\nPaís --> Mexico\nEstado --> DISTRITO FEDERAL\nMunicipio --> COYOACAN\nCódigo Postal --> 04365\nCalle --> AV UNIVERSIDAD\n\n****************************CONCEPTO****************************\nconcepto 1 -->  unidad-> msi ge83Vr, importe-> 5000.00, cantidad-> 2.0, descripcion-> Portatil gaming, valorUnitario-> 10000.00\nconcepto 2 -->  unidad-> msi ge73VR, importe-> 2000.00, cantidad-> 5.0, descripcion-> Ordenador desobremesa, valorUnitario-> 10000.00\nconcepto 3 -->  unidad-> msi gv7XS, importe-> 1000.00, cantidad-> 10.0, descripcion-> Portatil gaming, valorUnitario-> 10000.00\n\n*****************************TASAS******************************\nimpuesto 1 --> tasa-> 0.00, importe-> 0.00, impuesto-> IVA\nimpuesto 2 --> tasa-> 16.00, importe-> 220.07, impuesto-> IVA\n\n*****************************INFO*******************************\nFecha de expedición --> 2012-01-01T20:38:12\nForma de pago --> PAGO EN UNA SOLA EXHIBICION\nLugar de expedición --> Mexico\nMétodo de pago --> cheque\nSubtotal --> 21500.50\nTotal --> 20000.50");
        jScrollPane1.setViewportView(invoiceInfoTextArea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Volver");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 57, 98));
        jLabel5.setText("Tomás Pérez Márquez");

        jPanel7.setBackground(new java.awt.Color(121, 158, 178));

        actualJLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        actualJLabel2.setText("Dirección:");

        actualBeneficiarioText.setEditable(false);
        actualBeneficiarioText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actualBeneficiarioText.setText("moiMGbj8We1CrLYiBmsBcCRn5zUSXw2VVAw9JE");

        ActualBeneficiarioFieldText.setEditable(false);
        ActualBeneficiarioFieldText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ActualBeneficiarioFieldText.setText("Sabadell");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nombre:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(actualJLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ActualBeneficiarioFieldText)
                    .addComponent(actualBeneficiarioText))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ActualBeneficiarioFieldText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualBeneficiarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualJLabel2))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(121, 158, 178));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Dirección:");

        inicialBeneficiarioText.setEditable(false);
        inicialBeneficiarioText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inicialBeneficiarioText.setText("RnCrLC2VVYimcoiMGbj8AW5zUSXJEw1eBmsBw9");
        inicialBeneficiarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicialBeneficiarioTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        InicialBeneficiarioFieldText.setEditable(false);
        InicialBeneficiarioFieldText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InicialBeneficiarioFieldText.setText("Paco Salas");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inicialBeneficiarioText)
                    .addComponent(InicialBeneficiarioFieldText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(InicialBeneficiarioFieldText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicialBeneficiarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 57, 98));
        jLabel10.setText("Pagador:");

        actualJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        actualJLabel.setForeground(new java.awt.Color(18, 57, 98));
        actualJLabel.setText("Beneficiario Actual:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(18, 57, 98));
        jLabel13.setText("Beneficiario Inicial:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualJLabel)
                .addGap(259, 259, 259)
                .addComponent(jLabel13)
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(702, 702, 702))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(679, 679, 679))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(actualJLabel)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        Log logFrame = new Log();
        Home homeFrame = new Home();
        logFrame.setVisible(true);
        homeFrame.setVisible(false);
        dispose();
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void inicialBeneficiarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicialBeneficiarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicialBeneficiarioTextActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceStateShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceStateShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceStateShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceStateShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceStateShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActualBeneficiarioFieldText;
    private javax.swing.JTextField InicialBeneficiarioFieldText;
    private javax.swing.JLabel InvoiceStateLabel;
    private javax.swing.JTextField PagadorNameTextField;
    private javax.swing.JTextField actualBeneficiarioText;
    private javax.swing.JLabel actualJLabel;
    private javax.swing.JLabel actualJLabel2;
    private javax.swing.JTextField inicialBeneficiarioText;
    private javax.swing.JTextArea invoiceInfoTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logOutButton;
    private javax.swing.JTextField pagadorText;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
