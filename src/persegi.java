/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class persegi extends javax.swing.JFrame {

    /**
     * Creates new form persegi
     */
    public persegi() {
        initComponents();
        reset();
    }
    
    void reset() {
        tsisi.setText(null);
        vLuas1.setText(null);
        vKeliling1.setText(null);
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
        tsisi = new javax.swing.JTextField();
        bHitung1 = new javax.swing.JButton();
        bReset1 = new javax.swing.JButton();
        bKembali1 = new javax.swing.JButton();
        vLuas1 = new javax.swing.JLabel();
        vKeliling1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("PERSEGI");

        jLabel3.setText("Sisi");

        tsisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsisiActionPerformed(evt);
            }
        });

        bHitung1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keys.png"))); // NOI18N
        bHitung1.setText("Hitung");
        bHitung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitung1ActionPerformed(evt);
            }
        });

        bReset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undo-circular-arrow (1).png"))); // NOI18N
        bReset1.setText("Reset");
        bReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReset1ActionPerformed(evt);
            }
        });

        bKembali1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-arrow.png"))); // NOI18N
        bKembali1.setText("Kembali");
        bKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKembali1ActionPerformed(evt);
            }
        });

        vLuas1.setText("jLabel4");

        vKeliling1.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bHitung1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bReset1)
                                .addGap(18, 18, 18)
                                .addComponent(bKembali1))
                            .addComponent(tsisi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(vKeliling1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(vLuas1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tsisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset1)
                    .addComponent(bHitung1)
                    .addComponent(bKembali1))
                .addGap(43, 43, 43)
                .addComponent(vLuas1)
                .addGap(18, 18, 18)
                .addComponent(vKeliling1)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tsisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsisiActionPerformed

    private void bKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembali1ActionPerformed
        // TODO add your handling code here:
        new homee().setVisible(true);
        dispose();
    }//GEN-LAST:event_bKembali1ActionPerformed

    private void bReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReset1ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_bReset1ActionPerformed

    private void bHitung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitung1ActionPerformed
        // TODO add your handling code here:
        int sisi = Integer.parseInt(tsisi.getText());
        int luas = sisi * sisi;
        int keliling = 4 * sisi;
        vKeliling1.setText("Keliling: "+ keliling);
        vLuas1.setText("luas: "+ luas);
    }//GEN-LAST:event_bHitung1ActionPerformed

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
            java.util.logging.Logger.getLogger(persegi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(persegi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(persegi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(persegi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new persegi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHitung1;
    private javax.swing.JButton bKembali1;
    private javax.swing.JButton bReset1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tsisi;
    private javax.swing.JLabel vKeliling1;
    private javax.swing.JLabel vLuas1;
    // End of variables declaration//GEN-END:variables
}
