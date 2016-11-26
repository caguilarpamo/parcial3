
import Conexion.JdbcOra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
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
public class Gui_FacturaCompra extends javax.swing.JFrame {

    /**
     * Creates new form Gui_FacturaCompra
     */
    
    String [] registra;
    int subTotal = 0;
    int iva = 0;
    int total = 0;
    String nombre = "";
    DefaultTableModel modelo;
    
    
    public Gui_FacturaCompra() {
        
        initComponents();
        
        JdbcOra conexionOracle = new JdbcOra();
        
        this.jComboBox1.removeAllItems();
        this.jComboBox2.removeAllItems();

        String SQLproveedores = "";
        String SQLproductos = "";

        SQLproveedores = "Select * from proveedor";
        SQLproductos = "Select * from productos";

        try {

            
            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(SQLproveedores);
           
            while (rs.next()) {
                this.jComboBox1.addItem(rs.getString("DESCRIPCION"));
            }
            
            ResultSet rs1 = stmt.executeQuery(SQLproductos);
            while (rs1.next()) {
                this.jComboBox2.addItem(rs1.getString("DESCRIPCION"));
            }
            
            conn.commit();

            stmt.close();
            conexionOracle.cerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        String [] titulos = { "Codigo","Descripcion","Cantidad","Valor Unitario","Total"};
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 241, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 60, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 241, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 98, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 136, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 173, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 440, 100));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SubTotal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 343, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Iva");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 378, -1, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 417, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("0");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 343, -1, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("0");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 378, -1, -1));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("0");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 417, -1, -1));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Factura Compra");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
        JdbcOra conexionOracle = new JdbcOra();
        
        int valorTotal = 0;
        int cantidad = 0;
        String SQLcodProducto ="";
        String SQLlistaPrecios = "";
        String codProducto = null;
        int precioProducto = 0;
        String precioProduc = null;
        
        
     
            
            SQLcodProducto = "Select * from  productos  where DESCRIPCION='" + this.jComboBox2.getSelectedItem() + "'";

            
            // consulta codigo del producto
            try {
               
                conexionOracle.conectar();
                Connection conn = conexionOracle.getConnection();
                Statement stmt = conn.createStatement();

                      // CONSULTA CODIGO DEL PRODUCTO
                ResultSet rs1 = stmt.executeQuery(SQLcodProducto);

                if (rs1.next() == true) {

                    codProducto = rs1.getString("CODPROD");
                    int codProducsto1 = Integer.parseInt(rs1.getString("CODPROD"));
                    
                    // CONSULTA LISTA PRECIOS 
                    SQLlistaPrecios = "Select * from  LISTAPRECIOS  where CODPROD='" + codProducsto1 + "'";
                    ResultSet rs2 = stmt.executeQuery(SQLlistaPrecios);
                    
                    if (rs2.next() == true) {
                    
                    precioProduc = rs2.getString("COSTO");
                    precioProducto = Integer.parseInt(rs2.getString("COSTO"));
                    }
                }
            
                conn.commit();

                stmt.close();
                conexionOracle.cerrar(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex + " consulta codigo producto");
            }
        
        
        
        
       String [] titulos = { "Codigo","Descripcion","Cantidad","Valor Unitario","Total"};
       String [] registra = new String [5];
        
            
            if(this.jTextField1.getText() != ""){
                
                registra [0] = codProducto;
                registra [1] = (String) this.jComboBox2.getSelectedItem();
                registra [2] = this.jTextField1.getText();
                registra [3] = precioProduc;
                String cadena = "" + (precioProducto * (cantidad = Integer.parseInt(this.jTextField1.getText())));
                registra [4] = cadena;
                
                modelo.addRow(registra);
            }else{
                JOptionPane.showMessageDialog(null,"Debe ingresar Cantidad del Producto.");
            }
            
            this.jTable1.setModel(modelo);
            
        //}catch(SQLException ex){
            
          //  JOptionPane.showMessageDialog(null, ex);            
            
     //   }
        
     subTotal =  subTotal + (precioProducto * (cantidad = Integer.parseInt(this.jTextField1.getText())));
     String cadenaSubTotal = "" + subTotal;
     this.jLabel7.setText(cadenaSubTotal);
     
     iva =  subTotal * 16 / 100;
     String cadenaIva = "" + iva;
     this.jLabel8.setText(cadenaIva);
     
     String cadenaTotal = ""+(subTotal + iva);
     this.jLabel9.setText(cadenaTotal);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JdbcOra conexionOracle = new JdbcOra();

        String SQLselectProveedor = "";
        String SQLselectProducto = "";
        String SQLMovimientos = "";
        String SQLupdateProductos = "";
        String mensaje = "";
        int nitProveedor = 0;
        String codProducto = null;
        int NumFactura = 0;
        int n = 0;
        int cantidadSaldo = 0;
        int CODMOV = 0;
        int saldoPro = 0;
        String SQLMovimiento = "";
        String SQLselectProducto1 = "";

        String fecha = fechaActual();

        //ConexionMySQL mysql = new ConexionMySQL();
        //Connection cn = mysql.Conectar();
        SQLselectProveedor = "Select * from proveedor where DESCRIPCION='" + this.jComboBox1.getSelectedItem() + "'";
        SQLselectProducto = "Select * from productos where DESCRIPCION='" + this.jComboBox2.getSelectedItem() + "'";
        SQLMovimientos = "INSERT INTO MOVIMIENTO (CODPROD,SALDOPROD,TIPOMOV,CLIENTPROV,CANTIDAD,VALOR,FECHAMOV,FECSYS) VALUES (?,?,?,?,?,?,?,?)";
        SQLMovimiento = "Select * from MOVIMIENTO";
        
        mensaje = "el registro ha sido exitoso\n";

        try {

            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            Statement stmt = conn.createStatement();
            Connection conn1 = conexionOracle.getConnection();

            // CONSULTA  NIT DEL PROVEEDOR
            ResultSet rs = stmt.executeQuery(SQLselectProveedor);
            if (rs.next() == true) {

                nitProveedor = Integer.parseInt(rs.getString("NIT"));
            }
            
            ResultSet rs1 = stmt.executeQuery(SQLMovimiento);
                while (rs1.next() == true) {

                    CODMOV = Integer.parseInt(rs1.getString("CODMOV"));

                }

            // ACTUALIZA LA TABLA PRODUCTOS
            for (int i = 0; i < modelo.getRowCount(); i++) {

                String Ncodigo = modelo.getValueAt(i, 0).toString();
                int NumCodigo = Integer.parseInt(Ncodigo);
                String descripcion = modelo.getValueAt(i, 1).toString();
                String Ncantidad = modelo.getValueAt(i, 2).toString();
                int NumCantidad = Integer.parseInt(Ncantidad);
                String Nvalor = modelo.getValueAt(i, 3).toString();
                int ValorUnitario = Integer.parseInt(Nvalor);

                SQLupdateProductos = "update productos "
                        + "Set SALDPROD=(SALDPROD+?)"
                        + " where CODPROD='" + Ncodigo + "'";

                PreparedStatement pst3 = conn.prepareStatement(SQLupdateProductos);

                pst3.setInt(1, NumCantidad);

                n = pst3.executeUpdate();
            }

            // INGRESA LOS DATOS EN LA TABLA MOVIMIENTOS
            for (int i = 0; i < modelo.getRowCount(); i++) {

                CODMOV = CODMOV + 1;

                String Ncodigo = modelo.getValueAt(i, 0).toString();
                int NumCodigo = Integer.parseInt(Ncodigo);
                String descripcion = modelo.getValueAt(i, 1).toString();
                String Ncantidad = modelo.getValueAt(i, 2).toString();
                int NumCantidad = Integer.parseInt(Ncantidad);
                String Nvalor = modelo.getValueAt(i, 3).toString();
                int ValorUnitario = Integer.parseInt(Nvalor);

                SQLselectProducto1 = "Select * from productos where CODPROD='" + NumCodigo + "'";

                ResultSet rs2 = stmt.executeQuery(SQLselectProducto1);
                if (rs2.next() == true) {

                    saldoPro = Integer.parseInt(rs2.getString("SALDPROD"));
                }

                SQLMovimientos = "INSERT INTO MOVIMIENTO(CODMOV,CODPROD,SALDOPROD,TIPOMOV,CLIENTPROV,CANTIDAD,VALOR,FECHAMOV,FECSYS) VALUES (?,?,?,?,?,?,?,?,?)";

                PreparedStatement pst3 = conn1.prepareStatement(SQLMovimientos);

                pst3.setInt(1, CODMOV);
                pst3.setInt(2, NumCodigo);
                pst3.setInt(3, saldoPro);
                pst3.setInt(4, 2);
                pst3.setInt(5, nitProveedor);
                pst3.setInt(6, NumCantidad);
                pst3.setInt(7, ValorUnitario);
                pst3.setString(8, fecha);
                pst3.setString(9, fecha);

                n = pst3.executeUpdate();
            }

            if (n > 0) {

                mensaje += "Proveedor: " + this.jComboBox1.getSelectedItem();
                JOptionPane.showMessageDialog(null, mensaje);
            }

            conn.commit();

            stmt.close();
            conexionOracle.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "Gui factura compra");
        }

        this.jTextField1.setText(null);
        this.jLabel7.setText("0");
        this.jLabel8.setText("0");
        this.jLabel9.setText("0");

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Menu().setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_FacturaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_FacturaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_FacturaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_FacturaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_FacturaCompra().setVisible(true);
            }
        });
    }
    
    public String fechaActual () {
        
        String fechaActu = "";
        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        
        fechaActu = año + "-" + (mes+1) + "-" + dia ;
        
        return  fechaActu;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
