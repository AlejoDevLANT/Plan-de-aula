package vista;


import Modelo.Productos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author stey
 */
public class InventarioProductos extends javax.swing.JFrame {

   public static ArrayList<Productos> listap = new ArrayList<>();    
    DefaultTableModel modelo ;
    int fila;
    
    /**
     * Creates new form InventarioProductos
     */
    public InventarioProductos() {
        initComponents();
        listap= new ArrayList<>();
        modelo= new DefaultTableModel();
    }
    
     private static InventarioProductos instanciaUnica = null;
 public static InventarioProductos getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new InventarioProductos();
        }
        return instanciaUnica;
    }
 
 
 
    void AgregarTabla(){
         modelo=(DefaultTableModel)TablaInventario.getModel();
       Object[] ob= new Object[5];
       for(int i=0 ;i<listap.size();i++){
           ob[0]=listap.get(i).getIdProducto();
           ob[1]=listap.get(i).getNombreProducto();
           ob[2]=listap.get(i).getCantidadProducto();
           ob[3]=listap.get(i).getPrecio();
            ob[4]=listap.get(i).getTotal();
           modelo.addRow(ob);
       }
           
           TablaInventario.setModel(modelo);
    }
    
    void LimpiarFields(){
        TextId.setText("");
        TextCantidad.setText("");
        TextNomP.setText("");
        TextPrecio.setText("");
    }
    void LimpiarTabla(){
        for( int i = 0 ; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
        
        
    }
    
    int validacion(String id, int vali){
        vali=0;
       for(int i=0;i<listap.size();i++){
           if(id.equals(listap.get(i).getIdProducto())){
               vali=1;
           } 
       }
       return vali;
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IdProducto = new javax.swing.JLabel();
        NombreProducto = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        CantidadProducto = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        TextNomP = new javax.swing.JTextField();
        TextCantidad = new javax.swing.JTextField();
        BotonP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        BotonModificar = new javax.swing.JButton();
        CantidadProducto1 = new javax.swing.JLabel();
        TextPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));
        setLocationByPlatform(true);

        IdProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IdProducto.setText("ID PRODUCTO");

        NombreProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreProducto.setText("NOMBRE PRODUCTO");

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("INVENTARIO DE PRODUCTOS");
        Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        CantidadProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CantidadProducto.setText("CANTIDAD DISPONIBLE:");

        TextNomP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomPActionPerformed(evt);
            }
        });

        BotonP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Plus_36851.png"))); // NOI18N
        BotonP.setText("AGREGAR");
        BotonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPActionPerformed(evt);
            }
        });

        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "NOMBRE", "CANTIDAD ", "PRECIO UNIT", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaInventario.setToolTipText("");
        TablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaInventario);
        // Crear el renderizador que centrará el texto
        DefaultTableCellRenderer centrarTexto = new DefaultTableCellRenderer();
        centrarTexto.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplicar el renderizador a las columnas de la tabla (por ejemplo, a la columna 0, 1, 2, etc.)
        TablaInventario.getColumnModel().getColumn(0).setCellRenderer(centrarTexto); // Columna 0
        TablaInventario.getColumnModel().getColumn(1).setCellRenderer(centrarTexto); // Columna 1
        TablaInventario.getColumnModel().getColumn(2).setCellRenderer(centrarTexto); // Columna 2
        TablaInventario.getColumnModel().getColumn(3).setCellRenderer(centrarTexto);
        TablaInventario.getColumnModel().getColumn(4).setCellRenderer(centrarTexto);

        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Plus_36851.png"))); // NOI18N
        BotonModificar.setText("MODIFICAR");
        BotonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        CantidadProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CantidadProducto1.setText("PRECIO PRODUCTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IdProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CantidadProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextNomP, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextNomP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CantidadProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextNomPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomPActionPerformed

    private void BotonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPActionPerformed
        // TODO add your handling code here:
        try{
             int  vali=0;
        String id,nom; int cantidad;
         id=TextId.getText();
         vali=validacion(id,vali);
        if(vali==1){
            JOptionPane.showMessageDialog(null, "LA ID YA SE ENCUENTRA REGISTRADA");
            LimpiarFields();
        }else{
           float total;
        nom=TextNomP.getText();
        cantidad=Integer.parseInt(TextCantidad.getText());
        float precio=Float.parseFloat(TextPrecio.getText());
        Productos p ;
        total =cantidad*precio;
        p = new Productos(id, nom, cantidad,precio,total);
        listap.add(p);
        LimpiarTabla();
        AgregarTabla();
        LimpiarFields();
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "INGRESE DATOS VALIDOS.....");
        }
       
        
        
    }//GEN-LAST:event_BotonPActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        
        try{
             if(listap.isEmpty()){
            JOptionPane.showMessageDialog(null, "NO HAY DATOS REGISTRADOS");
        }else{
                 if(fila != 0){
                      String Modid,Modinom;
        int modicantidad;
        Modid=TextId.getText();
        Modinom=TextNomP.getText();
        float Modiprecio=Float.parseFloat(TextPrecio.getText());
        modicantidad=Integer.parseInt(TextCantidad.getText());
        float total= modicantidad*Modiprecio;
        listap.get(fila).setIdProducto(Modid);
        listap.get(fila).setNombreProducto(Modinom);
        listap.get(fila).setCantidadProducto(modicantidad);
        listap.get(fila).setPrecio(Modiprecio);
        listap.get(fila).setTotal(total);
        
        modelo.setRowCount(0);
        for(int i=0 ; i<listap.size();i++){
            Object[] obj= {listap.get(i).getIdProducto(),listap.get(i).getNombreProducto(),listap.get(i).getCantidadProducto(),
                listap.get(i).getPrecio(),listap.get(i).getTotal()};
            modelo.addRow(obj);
        }
        LimpiarFields();
        BotonP.setEnabled(true);
        
                 }
           
        }
         
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "SELECCIONE UN VALOR DE LA TABLA....");
        }
                
       
        
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void TablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInventarioMouseClicked
       // TODO add your handling code here:
             modelo=(DefaultTableModel)TablaInventario.getModel();
       
        if((TablaInventario.getSelectedRow() == 0) || (TablaInventario.getSelectedRow() == 1) || (TablaInventario.getSelectedRow() == 2)){
        JOptionPane.showMessageDialog(null, "ESTOS VALORES NO SE PUEDEN MODIFICAR");
    }else{
             fila=TablaInventario.getSelectedRow();
             TextId.setText((String) TablaInventario.getValueAt(fila, 0));
        TextNomP.setText((String) TablaInventario.getValueAt(fila, 1));
        TextCantidad.setText((String) TablaInventario.getValueAt(fila, 2).toString());
         TextPrecio.setText((String) TablaInventario.getValueAt(fila, 3).toString());
        
        
        BotonP.setEnabled(false);
        }
       
    }//GEN-LAST:event_TablaInventarioMouseClicked

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
            java.util.logging.Logger.getLogger(InventarioProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonP;
    private javax.swing.JLabel CantidadProducto;
    private javax.swing.JLabel CantidadProducto1;
    private javax.swing.JLabel IdProducto;
    private javax.swing.JLabel NombreProducto;
    private javax.swing.JTable TablaInventario;
    private javax.swing.JTextField TextCantidad;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextNomP;
    private javax.swing.JTextField TextPrecio;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
