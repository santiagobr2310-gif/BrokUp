
package brokup;


public class brokup extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(brokup.class.getName());

    
     public static brokup ocultar;
   
    public brokup() {
        initComponents();
        ocultar = this;
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage());
        getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        setSize(600, 650);
        setLocationRelativeTo(null);//centra la ventana.
        setExtendedState(javax.swing.JFrame.NORMAL);//evita que se abra minimizada o maximizada.
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnReservas = new javax.swing.JButton();
        btnRegistrarme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BrokUp");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        btnReservas.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnReservas.setText("Reservas");
        btnReservas.addActionListener(this::btnReservasActionPerformed);

        btnRegistrarme.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnRegistrarme.setText("Registrarme");
        btnRegistrarme.addActionListener(this::btnRegistrarmeActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N
        jLabel1.setText("BrokUp");

        btnIniciarSesion.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(this::btnIniciarSesionActionPerformed);

        btnServicios.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnServicios.setText("Servicios");
        btnServicios.addActionListener(this::btnServiciosActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnServicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciarSesion)
                .addGap(4, 4, 4)
                .addComponent(btnRegistrarme)
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservas)
                    .addComponent(btnRegistrarme)
                    .addComponent(jLabel1)
                    .addComponent(btnIniciarSesion)
                    .addComponent(btnServicios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¡Bienvenido a BrokUp!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(jLabel2)
                .addGap(0, 397, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarmeActionPerformed
       Registrarme registrarme = new Registrarme();
       registrarme.setSize(600, 731);
       registrarme.setLocationRelativeTo(null);
       registrarme.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnRegistrarmeActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
       IniciarSesion sesion = new IniciarSesion();
       sesion.setSize(415, 370);
       sesion.setLocationRelativeTo(null);
       sesion.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
       Servicios servicios = new Servicios();
       servicios.setSize(450, 370);
       servicios.setLocationRelativeTo(null);
       servicios.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
       Reservas reservas = new Reservas();
       reservas.setSize(450, 370);
       reservas.setLocationRelativeTo(null);
       reservas.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnReservasActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new brokup().setVisible(true));
    }
   public void ocultarBotonesSesion() {
    btnIniciarSesion.setVisible(false);
    btnRegistrarme.setVisible(false);
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarme;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
