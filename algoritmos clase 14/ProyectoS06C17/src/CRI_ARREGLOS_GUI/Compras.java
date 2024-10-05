
package CRI_ARREGLOS_GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Compras extends javax.swing.JFrame {
    //Declaracion de un objeto modelo de tipo DefaultTableModel
    private DefaultTableModel modelo = new DefaultTableModel();
    private int filaSeleccionada;
    String codigo, producto;
    int cantidad;
    double precio, total;
    double sumatotal = 0;
    //Declaracion de un arreglo de tipo objeto
    Object datos [] = new Object[5];
    
    //Producto predefinido
    String[] codigos = {"Ninguna","1000", "2000", "3000", "4000", "5000", "6000"};
    String[] nombres = {"", "Aspidadora", "Lavadora","television","Celular","Cocina","Plancha" };
    double[] precios = {1500.0, 2000.0, 3000.0, 4500, 500, 200};

    public Compras() {
        initComponents();
        setLocationRelativeTo(this);
        modelo.addColumn("Codigo");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");
        tblSalida.setModel(modelo);
        
         for (String codigo : codigos) {
            cboCodigo.addItem(codigo);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalida = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        cboCodigo = new javax.swing.JComboBox<>();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Compras");

        jLabel1.setText("Codigo de producto:");

        jLabel2.setText("Nombre del producto:");

        jLabel3.setText("Cantidad del producto:");

        jLabel4.setText("Precio del producto:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Registro de compras");

        jScrollPane1.setViewportView(tblSalida);

        jLabel6.setText("Total a pagar :");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        cboCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(cboCodigo, 0, 105, Short.MAX_VALUE)
                    .addComponent(txtPrecio)
                    .addComponent(txtCantidad))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(jLabel1)
                    .addComponent(cboCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       // Validar que todos los campos estén llenos
    if (cboCodigo.getSelectedIndex() == 0 || txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtCantidad.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Error, falta completar campos!", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        // Entrada de datos
        codigo = (String) cboCodigo.getSelectedItem();
        producto = txtNombre.getText();
        precio = Double.parseDouble(txtPrecio.getText());
        cantidad = Integer.parseInt(txtCantidad.getText());

        // Validar que la cantidad y el precio sean positivos
        if (cantidad <= 0 || precio < 0) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que 0 y el precio no puede ser negativo!", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        total = precio * cantidad;
        sumatotal += total;
        txtTotal.setText(String.valueOf(sumatotal));

        // Proceso de datos llenar el arreglo
        datos[0] = codigo;
        datos[1] = producto;
        datos[2] = precio;
        datos[3] = cantidad;
        datos[4] = total;

        // Llenar la tabla
        modelo.addRow(datos);
        
        // Limpiar campos
        clearFields();
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error, ingrese valores numericos ", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
    }
}

private void clearFields() {
    cboCodigo.setSelectedIndex(0);
    txtNombre.setText("");
    txtPrecio.setText("");
    txtCantidad.setText("");

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(tblSalida.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Error, selecione la fila a eliminar!!", "ERROR!!!, al eliminar registro!!!", JOptionPane.ERROR_MESSAGE);
        }else{
            String totalEliminadoStr = modelo.getValueAt(tblSalida.getSelectedRow(), 4).toString();
            double totalEliminado = Double.parseDouble(totalEliminadoStr);
            
            // Restar el total eliminado de la suma total
            sumatotal -= totalEliminado;
            txtTotal.setText(String.valueOf(sumatotal)); 
            modelo.removeRow(tblSalida.getSelectedRow());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if(tblSalida.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Error, Selecciona la fila a editar!!", "ERROR!!!, Faltan Datos!!!", JOptionPane.ERROR_MESSAGE);
        }else{
            filaSeleccionada = tblSalida.getSelectedRow();
            cboCodigo.setSelectedItem(modelo.getValueAt(filaSeleccionada, 0).toString());
            txtNombre.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
            txtPrecio.setText(modelo.getValueAt(filaSeleccionada, 2).toString()); 
            txtCantidad.setText(modelo.getValueAt(filaSeleccionada,3).toString());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    // Verificar que se ha seleccionado una fila
    if (tblSalida.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(null, "Error, No ha seleccionado un registro!!", "ERROR!!!, al modificar registro!!!", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si no se seleccionó un registro
    }

    filaSeleccionada = tblSalida.getSelectedRow();
    
    // Almacenar los valores originales de la fila seleccionada
    String codigoOriginal = modelo.getValueAt(filaSeleccionada, 0).toString();
    String productoOriginal = modelo.getValueAt(filaSeleccionada, 1).toString();
    double precioOriginal = (double) modelo.getValueAt(filaSeleccionada, 2);
    int cantidadOriginal = (int) modelo.getValueAt(filaSeleccionada, 3);
    
    // Entrada de datos: Lectura de las cajas de texto
    codigo = (String) cboCodigo.getSelectedItem();
    producto = txtNombre.getText();
    
    // Validar que los campos de precio y cantidad sean válidos antes de convertir
    try {
        precio = Double.parseDouble(txtPrecio.getText());
        cantidad = Integer.parseInt(txtCantidad.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error, falta editar un campo!", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
        return; // Salir si hay un error de conversión
    }

    total = precio * cantidad;

    // Verificar si realmente se han editado los campos
    if (codigo.equals(codigoOriginal) && producto.equals(productoOriginal) && 
        precio == precioOriginal && cantidad == cantidadOriginal) {
        JOptionPane.showMessageDialog(null, "Primero tienes que editar los campos antes de modificar!", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return; // Salir si no se han realizado cambios
    }

    // Restar el total anterior y sumar el nuevo total
    double totalAnterior = (double) modelo.getValueAt(filaSeleccionada, 4);
    sumatotal = sumatotal - totalAnterior + total;
    
    // Actualiza la fila seleccionada
    modelo.setValueAt(codigo, filaSeleccionada, 0);
    modelo.setValueAt(producto, filaSeleccionada, 1);
    modelo.setValueAt(precio, filaSeleccionada, 2);
    modelo.setValueAt(cantidad, filaSeleccionada, 3);
    modelo.setValueAt(total, filaSeleccionada, 4);

    // Limpia los campos después de la modificación
    cboCodigo.setSelectedIndex(0); // O el índice que desees establecer por defecto
    txtNombre.setText("");
    txtPrecio.setText("");
    txtCantidad.setText("");

    }//GEN-LAST:event_btnModificarActionPerformed

    private void cboCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCodigoActionPerformed
        // TODO add your handling code here:
        int index = cboCodigo.getSelectedIndex();
        if (index == 0) { // Si se selecciona "Ninguna"
        txtNombre.setText("");
        txtPrecio.setText("");
    } else {
        txtNombre.setText(nombres[index]);
        txtPrecio.setText(String.valueOf(precios[index - 1])); // Ajustar índice para precios
    }

        // Actualiza el total mostrado en la interfaz
        txtTotal.setText(String.valueOf(sumatotal));
    }//GEN-LAST:event_cboCodigoActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblSalida;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
