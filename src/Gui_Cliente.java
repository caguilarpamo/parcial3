
import Conexion.JdbcOra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Gui_Cliente extends javax.swing.JFrame {

    
    public void ingreso(String usua){
        
           
        //Ingreso client = new Ingreso();
        JLabel jlabel = new JLabel();
 
        jlabel.setText(usua);
                
      //JOptionPane.showMessageDialog(null, usua);  
      

        setVisible(true);   
        
    }
    
    Menu client = new Menu();
    
     String [] registra;
    int subTotal = 0;
    int iva = 0;
    int total = 0;
    String nombre = "";
    DefaultTableModel modelo;
    
    /**
     * Creates new form Gui_Cliente
     */
    public Gui_Cliente() {
        initComponents();
        
        String [] titulos = {"Nit", "Nombre", "Direccion", "Contacto", "Telefono"};
        modelo = new DefaultTableModel(null, titulos);
         this.jTable1.setModel(modelo);
        registra = new String [5];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 36, 130, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 69, 310, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 100, 150, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 310, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nit");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 39, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 72, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 103, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 129, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jButton2.setText("Grabar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 79, -1));

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registro de Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jButton4.setText("Mostrar Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 140, 20));

        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jButton7.setText("Mostrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 475, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        JdbcOra conexionOracle = new JdbcOra();
        
        //ConexionMySQL mysql = new ConexionMySQL();
        //Connection cn = mysql.Conectar();

        String vNit = "";
        String vNombre = "";
        String vCiudad = "";
        String vTelefono = "";
        String vEmail = "";
        String vActivo = "a";

        String SQL = ""; // PARA CREAR EL INTO PARA INSERTAR DATOS EN LA BASE DE DATOS
        String mensaje = "";
        vNit = this.jTextField1.getText();
        vNombre = this.jTextField2.getText();
        vCiudad = this.jTextField3.getText();
        vTelefono = this.jTextField4.getText();
        vEmail = this.jTextField5.getText();

        SQL = "INSERT INTO cliente (CEDULA,DESCRIPCION,DIRECCION,CONTACTO,TELEFONO) VALUES (?,?,?,?,?)";
        mensaje = "el registro ha sido exitoso";

        try {

            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            Statement stmt = conn.createStatement();

            PreparedStatement pst = conn.prepareStatement(SQL);
            
            
            pst.setString(1, vNit);
            pst.setString(2, vNombre);
            pst.setString(3, vCiudad);
            pst.setString(4, vTelefono);
            pst.setString(5, vEmail);


            int n = pst.executeUpdate();

            conn.commit();
            
            if (n > 0) {
                JOptionPane.showMessageDialog(null, mensaje);
            }

            stmt.close();
            conexionOracle.cerrar();
        } catch (SQLException e) {
            Object ex = null;
            JOptionPane.showMessageDialog(null, ex);
        }

        this.jTextField1.setText(null);
        this.jTextField2.setText(null);
        this.jTextField3.setText(null);
        this.jTextField4.setText(null);
        this.jTextField5.setText(null);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
                        
        new Menu().setVisible(rootPaneCheckingEnabled);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        // BUSCAR CLIENTE

        JdbcOra conexionOracle = new JdbcOra();

        String sSQL = "";

        sSQL = "Select * from cliente where CEDULA='" + Integer.parseInt(this.jTextField1.getText()) + "'";

        try {

            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sSQL);

            //Statement st = cn.createStatement();
            //ResultSet rs = st.executeQuery(sSQL);
            if (rs.next() == true) {

                // se entrega el campo de activo a la variable activo
                //condicional para no mostrar los datos si esta inactivo el cliente
                // si el cliente esta activo entra en la condicional 
                this.jTextField2.setText(rs.getString("DESCRIPCION"));
                this.jTextField3.setText(rs.getString("DIRECCION"));
                this.jTextField4.setText(rs.getString("CONTACTO"));
                this.jTextField5.setText(rs.getString("TELEFONO"));

            } else {

                this.jTextField2.setText("");
                this.jTextField3.setText("");
                this.jTextField4.setText("");
                this.jTextField5.setText("");
                JOptionPane.showMessageDialog(null, "Cliente no existe");

            }

            stmt.close();
            conexionOracle.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // ACTUALIZAR CLIENTES 
        
        JdbcOra conexionOracle = new JdbcOra();
  
        //declarar las variables de los campos de la tablas       
        String vNombre = "";
        String vCiudad = "";
        String vTelefono = "";
        String vEmail = "";

        //variable para la sentencia sql
        String ssSQL = "";
        //variable para mostrar si se actualizaron los datos
        String mensaje = "";

        vNombre = jTextField2.getText();
        vCiudad = jTextField3.getText();
        vTelefono = jTextField4.getText();
        vEmail = jTextField5.getText();

        ssSQL = "update cliente "
                + "Set DESCRIPCION=?, "
                + "DIRECCION=?, "
                + "CONTACTO=?, "
                + "TELEFONO=? "
                + " where CEDULA='" + this.jTextField1.getText() + "'";

        mensaje = "Registro guardado con exito!!";

        try {
            
            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            Statement stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement(ssSQL);

            pst.setString(1, vNombre);
            pst.setString(2, vCiudad);
            pst.setString(3, vTelefono);
            pst.setString(4, vEmail);

            int n = pst.executeUpdate();

            conn.commit();
            
            if (n > 0) {

                JOptionPane.showMessageDialog(null, mensaje);
            }

            stmt.close();
            conexionOracle.cerrar();
            
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
        // LISTAR CLIENTES
        
        JdbcOra conexionOracle = new JdbcOra();

        String[] titulos = {"Nit", "Nombre", "Direccion", "Contacto", "Telefono"};
        String[] registra = new String[5];
        String sSQL = "";

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        //ConexionMySQL mysql = new ConexionMySQL();
        //Connection cn = mysql.Conectar();

        sSQL = "Select * from cliente";

        try {
            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sSQL);

            while (rs.next()) {

                registra[0] = rs.getString("CEDULA");
                registra[1] = rs.getString("DESCRIPCION");
                registra[2] = rs.getString("DIRECCION");
                registra[3] = rs.getString("CONTACTO");
                registra[4] = rs.getString("TELEFONO");

                modelo.addRow(registra);
            }

            this.jTable1.setModel(modelo);
            conn.commit();

            stmt.close();
            conexionOracle.cerrar();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Cliente().setVisible(true);
            }
        });
    }
    
    public void Buscar(String cadena){

        JdbcOra conexionOracle = new JdbcOra();

        String[] titulos = {"Nit", "Nombre", "Ciudad", "Contacto", "Telefono"};
        String[] registra = new String[5];
        String sSQL = "";

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();

        sSQL = "Select * from cliente where DESCRIPCION Like '%" + this.jTextField2.getText() + "%'";

        try {
            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sSQL);

            while (rs.next()) {

                registra[0] = rs.getString("CEDULA");
                registra[1] = rs.getString("DESCRIPCION");
                registra[2] = rs.getString("DIRECCION");
                registra[3] = rs.getString("CONTACTO");
                registra[4] = rs.getString("TELEFONO");

                modelo.addRow(registra);
            }

            this.jTable1.setModel(modelo);

            conn.commit();

            stmt.close();
            conexionOracle.cerrar();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    // End of variables declaration//GEN-END:variables
}
