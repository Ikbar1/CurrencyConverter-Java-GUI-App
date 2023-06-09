
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ikbar
 */
public class Frame1 extends javax.swing.JFrame {

    String[] currencyUnits = {
        "Units",
        "Australian Dollar",
        "British Pound Sterling",
        "European Euro",
        "Indonesian Rupiah",
        "Singapore Dollar",
        "US Dollar"
    };
    
    double AU_Dollar = 1.43;
    double British_Pound = 0.81;
    double Europe_Euro = 0.98;
    double Singapore_Dollar = 1.44;
    double Indonesian_Rupiah = 15245.51;
    double US_Dollar = 1.06;
    
    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbCountry1 = new javax.swing.JComboBox<>();
        cbCountry2 = new javax.swing.JComboBox<>();
        tfVal1 = new javax.swing.JTextField();
        tfVal2 = new javax.swing.JTextField();
        lblCurr1 = new javax.swing.JLabel();
        lblCurr2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CURRENCY CONVERTER");

        jLabel2.setText("From");

        jLabel3.setText("To");

        cbCountry1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Country", "Australia", "British", "Europe", "Indonesia", "Singapore", "USA" }));
        cbCountry1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCountry1ItemStateChanged(evt);
            }
        });
        cbCountry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCountry1ActionPerformed(evt);
            }
        });

        cbCountry2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Country", "Australia", "British", "Europe", "Indonesia", "Singapore", "USA" }));
        cbCountry2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCountry2ItemStateChanged(evt);
            }
        });
        cbCountry2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCountry2ActionPerformed(evt);
            }
        });

        tfVal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVal1ActionPerformed(evt);
            }
        });

        lblCurr1.setText("Units");

        lblCurr2.setText("Units");

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLogout.setText("Menu");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbCountry1, 0, 150, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfVal1)
                            .addComponent(lblCurr1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbCountry2, 0, 150, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfVal2)
                            .addComponent(lblCurr2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCountry2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfVal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurr1)
                    .addComponent(lblCurr2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(4, 4, 4)
                .addComponent(btnLogout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCountry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCountry1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCountry1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (cbCountry2.getSelectedIndex()== 0 || cbCountry1.getSelectedIndex()== 0){
        JOptionPane.showMessageDialog(null,"Please Select Country", "Error", JOptionPane.ERROR_MESSAGE);
       }else if(tfVal1.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Please Enter Value", "Error", JOptionPane.ERROR_MESSAGE);
       }
        double valueConvert = Double.parseDouble(tfVal1.getText());
        
        double toSwiss = 0.0;
        
        double valueConverted = 0.0;
        
        switch(cbCountry1.getSelectedItem().toString()){
           
            case "Australia": toSwiss = valueConvert / AU_Dollar;
            break;
            
            case "British": toSwiss = valueConvert / British_Pound;
            break;

            case "Indonesia": toSwiss = valueConvert / Indonesian_Rupiah;
            break;
            
            case "Europe": toSwiss = valueConvert / Europe_Euro;
            break;
            
            case "Singapore": toSwiss = valueConvert / Singapore_Dollar;
            break;
            
            case "USA": toSwiss = valueConvert / US_Dollar;
            break;

            default: toSwiss = 0.0;
    }//GEN-LAST:event_jButton1ActionPerformed
   
        
        switch(cbCountry2.getSelectedItem().toString()){
            
            
            case "Australia": valueConverted = toSwiss * AU_Dollar;
            break;
            
            case "British": valueConverted = toSwiss * British_Pound;
            break;
            
            case "Indonesia": valueConverted = toSwiss * Indonesian_Rupiah;
            break;
            
            case "Europe": valueConverted = toSwiss * Europe_Euro;
            break;
            
            case "Singapore": valueConverted = toSwiss * Singapore_Dollar;
            break;

            case "USA": valueConverted = toSwiss * US_Dollar;
            break;
            
           
            default: valueConverted = toSwiss * 0.0;
   
        }
        
        String value = String.format("%.2f",valueConverted);
        
        tfVal2.setText(value);
        
    }
        
    private void cbCountry2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCountry2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCountry2ActionPerformed

    private void cbCountry1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCountry1ItemStateChanged
        
        int position = cbCountry1.getSelectedIndex();
        
        lblCurr1.setText(currencyUnits[position]);
    }//GEN-LAST:event_cbCountry1ItemStateChanged

    private void cbCountry2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCountry2ItemStateChanged
       int position = cbCountry2.getSelectedIndex();
        
        lblCurr2.setText(currencyUnits[position]);
    }//GEN-LAST:event_cbCountry2ItemStateChanged

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       Menu menu = new Menu();
            menu.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cbCountry1.setSelectedIndex(0);
        cbCountry2.setSelectedIndex(0);
        tfVal1.setText(null);
        tfVal2 .setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfVal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVal1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cbCountry1;
    private javax.swing.JComboBox<String> cbCountry2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCurr1;
    private javax.swing.JLabel lblCurr2;
    private javax.swing.JTextField tfVal1;
    private javax.swing.JTextField tfVal2;
    // End of variables declaration//GEN-END:variables
}
