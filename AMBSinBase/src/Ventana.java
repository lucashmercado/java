
import java.util.ArrayList;
import javax.swing.JOptionPane;




public class Ventana extends javax.swing.JFrame {

    ArrayList <Persona> agenda = new ArrayList();
    int posicion;
    
    private void crearArrayList(){
        agenda.add(new Persona("Carlos Bilardo","cbilardo@hotmail.com","11 1111 1111"));
        agenda.add(new Persona("Cesar Menotti","cmenoti@gmail.com","11 2222 2222"));
        agenda.add(new Persona("Valeria Mazza","vmazza@hotmail.com","11 3333 3333"));
    }
    private void limpiarTextos(){
        txtNombre.setText("");
        txtMail.setText("");
        txtTelefono.setText("");
    }
    
    
    public Ventana() {
        initComponents();
        
        crearArrayList();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btAltas = new javax.swing.JToggleButton();
        btBajas = new javax.swing.JToggleButton();
        btModificaciones = new javax.swing.JToggleButton();
        btConsultas = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        btAplicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        buttonGroup1.add(btAltas);
        btAltas.setText("ALTAS");
        btAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltasActionPerformed(evt);
            }
        });

        buttonGroup1.add(btBajas);
        btBajas.setText("BAJAS");
        btBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBajasActionPerformed(evt);
            }
        });

        buttonGroup1.add(btModificaciones);
        btModificaciones.setText("MODIFICACIONES");
        btModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificacionesActionPerformed(evt);
            }
        });

        buttonGroup1.add(btConsultas);
        btConsultas.setText("CONSULTAS");
        btConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btModificaciones)
                .addGap(14, 14, 14)
                .addComponent(btConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAltas)
                    .addComponent(btBajas)
                    .addComponent(btModificaciones)
                    .addComponent(btConsultas))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("NOMBRE :");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("MAIL :");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("TELEFONO :");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtTelefono.setEnabled(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtMail.setEnabled(false);
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        btAplicar.setText("APLICAR");
        btAplicar.setEnabled(false);
        btAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btAplicar)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btAplicar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultasActionPerformed
        // TODO add your handling code here:
        limpiarTextos();
        txtNombre.setEnabled(true);
        txtMail.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtNombre.requestFocus();
        btAplicar.setEnabled(true);
    }//GEN-LAST:event_btConsultasActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void btAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltasActionPerformed
        // TODO add your handling code here:
        limpiarTextos();
        btAplicar.setEnabled(true);
        txtNombre.setEnabled(true);
        txtMail.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtNombre.requestFocus();
    }//GEN-LAST:event_btAltasActionPerformed

    private void btBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBajasActionPerformed
        // TODO add your handling code here:
        limpiarTextos();
        txtNombre.setEnabled(true);
        txtMail.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtNombre.requestFocus();
        btAplicar.setEnabled(true);
    }//GEN-LAST:event_btBajasActionPerformed

    private void btModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificacionesActionPerformed

        limpiarTextos();
        txtNombre.setEnabled(true);
        txtMail.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtNombre.requestFocus();
        btAplicar.setEnabled(true);
    }//GEN-LAST:event_btModificacionesActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
        char c = (char)evt.getKeyCode();
        
        if(c==evt.VK_ENTER){
            boolean encontrado = false;
            for(int i=0;i<agenda.size();i++){
                if(agenda.get(i).getNombre().equalsIgnoreCase(txtNombre.getText())){
                    encontrado= true;
                    txtNombre.setEnabled(false);
                    txtMail.setText(agenda.get(i).getMail());
                    txtTelefono.setText(agenda.get(i).getTelefono());
                    posicion = i;
                    if(btConsultas.isSelected()){
                        btAplicar.setEnabled(false);
                    }
                    if(btBajas.isSelected()){
                        btAplicar.setEnabled(true);
                    }
                    if(btModificaciones.isSelected()){
                        txtNombre.setEnabled(true);
                        txtMail.setEnabled(true);
                        txtTelefono.setEnabled(true);
                        btAplicar.setEnabled(true);
                    }
                }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, "Persona no encontrada");
            }
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void btAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAplicarActionPerformed
        
        if(btAltas.isSelected()){
            Persona p1 = new Persona(txtNombre.getText(),txtMail.getText(),txtTelefono.getText());
            agenda.add(p1);
            limpiarTextos();
            JOptionPane.showMessageDialog(null, "Alta existosa");
            txtNombre.requestFocus();
        }
        
        if(btBajas.isSelected()){
            agenda.remove(posicion);
            limpiarTextos();
            btAplicar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Baja exitosa");
        }
        
        if(btModificaciones.isSelected()){
            Persona p1 = new Persona(txtNombre.getText(),txtMail.getText(),txtTelefono.getText());
            agenda.set(posicion, p1);
            btAplicar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            limpiarTextos();
            txtMail.setEnabled(false);
            txtTelefono.setEnabled(false);
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_btAplicarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAltas;
    private javax.swing.JButton btAplicar;
    private javax.swing.JToggleButton btBajas;
    private javax.swing.JToggleButton btConsultas;
    private javax.swing.JToggleButton btModificaciones;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
