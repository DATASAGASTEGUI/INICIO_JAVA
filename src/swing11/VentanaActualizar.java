package swing11;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class VentanaActualizar extends javax.swing.JFrame {

    public VentanaActualizar() {
        initComponents();
        personalizar_JFrame();
        inicio();
    }
    
    public void inicio() {
        for(Obrero o: Ventana.obreros_al) {
            String idObrero = Ventana.txtIdObrero.getText();
            if(o.getIdObrero().equalsIgnoreCase(idObrero)){  
               String nombre = o.getNombre();
               String horasTrabajadasSemana = o.getCantidadHorasSemana()+"";
               txtNombre.setText(nombre);
               txtHorasTrabajadasSemana.setText(horasTrabajadasSemana);
               txtIdObrero.setText(idObrero);
               txtIdObrero.setEditable(false);
            }    
        }
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("ACTUALIZAR");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtHorasTrabajadasSemana = new javax.swing.JTextField();
        cmdActualizar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblHorasTrabajadasSemana = new javax.swing.JLabel();
        txtIdObrero = new javax.swing.JTextField();
        lblIdObrero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ACTUALIZAR OBRERO");
        lblTitulo.setOpaque(true);

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtHorasTrabajadasSemana.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdActualizar.setText("ACTUALIZAR");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });

        lblNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");
        lblNombre.setOpaque(true);

        lblHorasTrabajadasSemana.setBackground(new java.awt.Color(0, 0, 0));
        lblHorasTrabajadasSemana.setForeground(new java.awt.Color(255, 255, 255));
        lblHorasTrabajadasSemana.setText("HORAS TRABAJADAS SEMANA");
        lblHorasTrabajadasSemana.setOpaque(true);

        txtIdObrero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblIdObrero.setBackground(new java.awt.Color(0, 0, 0));
        lblIdObrero.setForeground(new java.awt.Color(255, 255, 255));
        lblIdObrero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdObrero.setText("ID OBRERO");
        lblIdObrero.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(cmdActualizar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdObrero)
                    .addComponent(lblIdObrero, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHorasTrabajadasSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHorasTrabajadasSemana))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblHorasTrabajadasSemana)
                    .addComponent(lblIdObrero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorasTrabajadasSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdObrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(cmdActualizar)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        String idObrero = txtIdObrero.getText();
        String nombre = txtNombre.getText();
        String horasTrabajadaSemana = txtHorasTrabajadasSemana.getText();
        for(Obrero o: Ventana.obreros_al) {
            if(o.getIdObrero().equalsIgnoreCase(idObrero)) {
               o.setNombre(nombre);
               o.setCantidadHorasSemana(Integer.parseInt(horasTrabajadaSemana));
            }
        }
        JOptionPane.showMessageDialog(this, "SE ACTUALIZO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_cmdActualizarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JLabel lblHorasTrabajadasSemana;
    private javax.swing.JLabel lblIdObrero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtHorasTrabajadasSemana;
    private javax.swing.JTextField txtIdObrero;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
