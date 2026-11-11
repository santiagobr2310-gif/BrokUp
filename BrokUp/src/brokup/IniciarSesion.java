/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package brokup;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bravo
 */
public class IniciarSesion extends javax.swing.JFrame {
Connection conexion;
PreparedStatement pst;
ResultSet rs;

    public IniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);
        conectarBD();
        setSize(600, 650);
        setLocationRelativeTo(null);//centra la ventana.
        setExtendedState(javax.swing.JFrame.NORMAL);//evita que se abra minimizada o maximizada.
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JtxtUsuario = new javax.swing.JTextField();
        JbtnIngresar = new javax.swing.JButton();
        JbtnSalir = new javax.swing.JButton();
        JtxtClave = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clave");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 163, -1, -1));

        JtxtUsuario.addActionListener(this::JtxtUsuarioActionPerformed);
        getContentPane().add(JtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 87, 181, 41));

        JbtnIngresar.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        JbtnIngresar.setText("Ingresar");
        JbtnIngresar.addActionListener(this::JbtnIngresarActionPerformed);
        getContentPane().add(JbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 224, 103, 50));

        JbtnSalir.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        JbtnSalir.setText("Salir");
        JbtnSalir.addActionListener(this::JbtnSalirActionPerformed);
        getContentPane().add(JbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 224, 96, 50));
        getContentPane().add(JtxtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, 30));

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton1.setText("Ir a Registrarse");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        jLabel4.setText("LblFondo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -1, 390, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtUsuarioActionPerformed

    private void JbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnIngresarActionPerformed
          
    String usuario = JtxtUsuario.getText().trim();
    String clave = new String(JtxtClave.getPassword());
    
   /* if (usuario.isEmpty() || clave.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar el usuario y la contraseña");
        }
    else
        {
            // Aquí continúa el proceso de validación del usuario en MySQL
        }
    if (usuario.isEmpty() || clave.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this,"Debe ingresar el usuario y la contraseña");
            return;
        }
    if (conexion == null) 
        {
            JOptionPane.showMessageDialog(this,"No hay conexión con la base de datos.");
            return;
        }
    */
if (usuario.isEmpty() || clave.isEmpty()) 
    {JOptionPane.showMessageDialog(this,"Debe ingresar el usuario y la contraseña");
    }
else if (conexion == null) 
    {   JOptionPane.showMessageDialog(this,"No hay conexión con la base de datos.");
    }
else
    {
    try 
        {
        String sql = "SELECT * FROM usuarios " + "WHERE usuario = ? AND clave = ? " + "AND estado = 1";
        pst = conexion.prepareStatement(sql);

        pst.setString(1, usuario);
        pst.setString(2, clave);

        rs = pst.executeQuery();
        if (rs.next()) 
            {
                String rol = rs.getString("rol");
                JOptionPane.showMessageDialog(this,"Bienvenido " + usuario);
                brokup inicio = new brokup();// Abrir la ventana principal
                inicio.setExtendedState(javax.swing.JFrame.NORMAL);
                inicio.setLocationRelativeTo(null);
                //ventana.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);//para que la ventana se abra maximizada
                inicio.setVisible(true);
                inicio.toFront();//hacer que aparezca por delante de las demás ventanas abiertas
                this.dispose();// Cerrar solamente el inicio de sesión
                inicio.ocultar.ocultarBotonesSesion();
                dispose();
            } 
        else 
            {
                JOptionPane.showMessageDialog(this,"Usuario o contraseña incorrectos");
                JtxtClave.setText("");
                JtxtUsuario.requestFocus();
            }
        } 
    catch (HeadlessException | SQLException e) 
        {
            JOptionPane.showMessageDialog(this,"Error al validar el usuario: " + e.getMessage());
        } 
    finally 
        {
        try 
            {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
            } 
        catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_JbtnIngresarActionPerformed

    private void JbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       Registrarme registrate = new Registrarme();
       registrate.setSize(600, 731);
       registrate.setLocationRelativeTo(null);
       registrate.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnIngresar;
    private javax.swing.JButton JbtnSalir;
    private javax.swing.JPasswordField JtxtClave;
    private javax.swing.JTextField JtxtUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    final void conectarBD() // se usa final para que no lo sobreescriba
    {
        try 
            {
                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
            } 
        catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(this,"Error al conectar con la base de datos: " + e.getMessage());
            }
    } 
    public static void main(String args[]) 
        {   java.awt.EventQueue.invokeLater(new Runnable() 
                {   public void run() 
                        {   new IniciarSesion().setVisible(true);
                       
                        }
                });
        }
}
