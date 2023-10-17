package gestionpedidos;
/**
 *
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class JFrame_gestionPedidos extends javax.swing.JFrame {
    public JFrame_gestionPedidos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList<>();
        txtUnidades = new javax.swing.JTextField();
        lblEnviar = new javax.swing.JLabel();
        cboxDestino = new javax.swing.JComboBox<>();
        lblDestino = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblEntrega = new javax.swing.JLabel();
        cboxEntrega = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(114, 104, 104));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de pedidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lstProductos.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        lstProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Sistema de localizacion $120", "Centro de control $60", "Modem 65M $45" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstProductos);

        txtUnidades.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtUnidades.setForeground(new java.awt.Color(0, 0, 0));

        lblEnviar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        lblEnviar.setForeground(new java.awt.Color(255, 255, 255));
        lblEnviar.setText("Unidades:");

        cboxDestino.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        cboxDestino.setForeground(new java.awt.Color(204, 204, 255));
        cboxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Norte $20", "Centro $25", "Sur $30" }));

        lblDestino.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(255, 255, 255));
        lblDestino.setText("Destino:");

        btnTotal.setBackground(new java.awt.Color(168, 218, 95));
        btnTotal.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnTotal.setForeground(new java.awt.Color(23, 24, 26));
        btnTotal.setText("Calcular envio");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        lblTotal.setBackground(new java.awt.Color(49, 59, 66));
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setOpaque(true);

        lblEntrega.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        lblEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrega.setText("Tipo de entrega");

        cboxEntrega.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        cboxEntrega.setForeground(new java.awt.Color(204, 204, 255));
        cboxEntrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal $3", "Urgente $10" }));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnviar)
                            .addComponent(lblDestino))
                        .addGap(44, 44, 44)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidades)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblEntrega)
                        .addGap(18, 18, 18)
                        .addComponent(cboxEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTotal)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnviar)
                            .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDestino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEntrega))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
            //Declarar variables.
        int comprobador=0, TOTAL=0;
        double unidades, producto=0;
        
        //Productos.
                //Si 'Sistema de localizacion $120' es seleccionado...
        if(lstProductos.getSelectedIndex()==0){
            producto+=120;
            comprobador+=1;}
                //Si 'Centro de control $60' es seleccionado...
        if(lstProductos.getSelectedIndex()==1){
            producto+=60;
            comprobador+=1;}
                //Si 'Modem 65M $45' es seleccionado...
        if(lstProductos.getSelectedIndex()==2){
            producto+=45;
            comprobador+=1;}
                //Si nada ha sido seleccionado...
        if(lstProductos.getSelectedIndex()==-1){
            lblTotal.setText("No ha elegido un producto.");}
        
        //Unidades.
            //Convertir lo ingresado en el TextField a número.
        unidades = Double.parseDouble(txtUnidades.getText());
        if(unidades==0){
            lblTotal.setText("No ha ingresado la cantidad de unidades a llevar.");}
        
        //Destino
                //Si 'Norte $20' es seleccionado...
        if(cboxDestino.getSelectedIndex()==0){
            TOTAL+=20;
            comprobador+=1;}
                //Si 'Centro $25' es seleccionado...
        if(cboxDestino.getSelectedIndex()==1){
            TOTAL+=25;
            comprobador+=1;}
                //Si 'Sur $30' es seleccionado...
        if(cboxDestino.getSelectedIndex()==2){
            TOTAL+=30;
            comprobador+=1;}
                //Si nada es seleccionado...
        if(cboxDestino.getSelectedIndex()==-1){
            lblTotal.setText("No ha ingresado el destino de envio.");}
        
        //Tipo de entrega.
                //Si 'Normal $3' es seleccionado...
        if(cboxEntrega.getSelectedIndex()==0){
            TOTAL+=3;
            comprobador+=1;}
                //Si 'Urgente $10' es seleccionado...
        if(cboxEntrega.getSelectedIndex()==1){
            TOTAL+=10;
            comprobador+=1;}
                //Si nada es seleccionado...
        if(cboxEntrega.getSelectedIndex()==-1){
            lblTotal.setText("No ha ingresado el tipo de entrega.");}
        
        //Label Total.
        TOTAL+=(unidades*producto);
        if(comprobador==0){
            lblTotal.setText("Verique que haya llenado todos los campos.");
        }else{
            lblTotal.setText("El total a pagar sera de: "+TOTAL);}
    }//GEN-LAST:event_btnTotalActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_gestionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_gestionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_gestionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_gestionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_gestionPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTotal;
    private javax.swing.JComboBox<String> cboxDestino;
    private javax.swing.JComboBox<String> cboxEntrega;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEntrega;
    private javax.swing.JLabel lblEnviar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JList<String> lstProductos;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
