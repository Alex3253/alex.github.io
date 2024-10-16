package Laboratorio4;

public class Ejerciciocrcp_gui extends javax.swing.JFrame {

    public Ejerciciocrcp_gui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DULCERIA");

        jLabel1.setText("Tipo :");

        jLabel2.setText("Cantidad :");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primor", "Dulzura", "Tentacion", "Explocion" }));

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(cboTipo, 0, 89, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcesar))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // Declaracion de variable locales:
        int tipo, canChocolate, canCaramelos;
        double impcom, impdes, imppag;
        
        //Entradda de dtos
        tipo= cboTipo.getSelectedIndex();
        canChocolate= Integer.parseInt(txtCantidad.getText());
        
        //Proceso de datos------> estos son los parametros
        impcom=calcularImporteCompra(tipo, canChocolate);  //se usa para no ponerlo en global----hay que guardarlo en una variable para que se pueda ver
        impdes=calcularImporteDescuento(canChocolate, impcom);
        imppag=calculatrImportePagar(impcom, impdes);
        canCaramelos=calcularObsequioCaramelos(imppag, canChocolate);
        mostrarDatos(impcom, impdes, imppag, canCaramelos);
        
    }//GEN-LAST:event_btnProcesarActionPerformed
    //Metodo de calcular importe de compras
    public double calcularImporteCompra(int tipo, int canChocolate){     //va ser de retorno por eso el double //no global
        double impcom;
        if(tipo==0){
            impcom=canChocolate * 8.5;
        }else if(tipo==1){
            impcom=canChocolate * 10.0;
        }else if(tipo ==2){
            impcom=canChocolate * 7.0;
        }else{
            impcom=canChocolate * 12.5;
        }
        return impcom;
    }
    //Metodo  de calcular importe de decuento
    double calcularImporteDescuento(int canChocolate, double impcom){
        double impdes;
        if(canChocolate <5){
            impdes= impcom * 0.4;
        }else if(canChocolate >=5 && canChocolate <10){
            impdes=impcom * 0.065;
        }else if(canChocolate >10 && canChocolate <15){
            impdes=impcom * 0.09;
        }else{
            impdes=impcom * 0.115;
        }
        return impdes;   
    }
    //Metodo de calcular importe de pago
    double calculatrImportePagar(double impcom, double impdes){
        double imppag;
        imppag=impcom - impdes;
        return imppag;
    }
    
    //Metodo de calculo obsequio de caramelos
    int calcularObsequioCaramelos(double imppag, int canChocolate){   //aqui pongo int porque es cantidad , un entero
        int canCaramelos;
        if(imppag >=250)
            canCaramelos = canChocolate * 3;
        else{
            canCaramelos= canChocolate * 2;
        }
        return canCaramelos;
    }
    //Metodo mostrar resultados
    void mostrarDatos(double impcom, double impdes, double imppag, int canCaramelos){
        txtSalida.setText("Importe de compras: " + impcom + "\n");
        txtSalida.append("Importe de descuento: " + impdes + "\n");
        txtSalida.append("Importe de pago: " + imppag + "\n");
        txtSalida.append("Obsequio de caramelo: " + canCaramelos + "\n");
    }
        
        

    
    
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejerciciocrcp_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejerciciocrcp_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejerciciocrcp_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejerciciocrcp_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejerciciocrcp_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
