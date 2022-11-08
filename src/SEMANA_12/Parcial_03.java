/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SEMANA_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author sumaran
 */

class Fruta{
     private String nombre;
     private String color;
     private Long peso;
     private String maduracion;
     private String  tamanio;
     private String tipo;

    public Fruta(String nombre, String color, long peso, long parseLong1, String maduracion, String tamanio, String tipo) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.maduracion = maduracion;
        this.tamanio = tamanio;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    

   

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public Long getPeso() {
        return peso;
    }

    public String getMaduracion() {
        return maduracion;
    }

    public String getTamanio() {
        return tamanio;
    }

    
    public String datos() {
        return this.nombre + "," + this.color + "," + this.peso + "," + this.maduracion + "," + this.tamanio ;
    }
}  
  class metodoTXT {

    ArrayList<Fruta> lista = new ArrayList<>();
    File arch = new File("Archicvo_Frutas.txt");

    public metodoTXT(ArrayList<Fruta> lista) {
        this.lista = lista;
    }

    public metodoTXT() {
    }

    void escribir() throws IOException {
        if (!arch.exists()) {
            arch.createNewFile();
        }
        try (PrintWriter pw = new PrintWriter(arch)) {
            for (Fruta p : lista) {
                pw.println(p.datos());
            }
        }
    }

         void leer() throws IOException {
        if (!arch.exists()) {
            arch.createNewFile();
        }
        BufferedReader br = new BufferedReader(new FileReader(arch));
        String cad;
        while ((cad = br.readLine()) != null) {
            String cad2[] = cad.split(",");
            this.lista.add(new Fruta(cad2[0].trim(), cad2[1].trim(), Long.parseLong(cad2[2]), Long.parseLong(cad2[3]), cad2[4].trim(),cad2[5].trim(),cad2[6].trim()));
        }
    }

    void ingresar(Fruta p) {
        lista.add(p);
    }

    public ArrayList<Fruta> getLista() {
        return lista;
    }
}   
  class nodo{
    Fruta dato;
    nodo sgte,ant;
    public nodo(Fruta f){
        this.dato=f;
        this.ant=this.sgte=null;
    }
}  

class metodo{
    nodo origen, fin;
    public metodo(){
        this.origen=this.fin=null;
    }
     void ingresarD(Fruta f){
        nodo newnodo=new nodo(f);        
        if(origen==null){            
            fin=origen=newnodo;
        }else{
                newnodo.sgte=origen;
                origen.ant=newnodo;
                origen=newnodo;
                }
    }
     
      void ingresarS(Fruta n){
        nodo newnodo=new nodo(n);
        if(origen==null){
            origen=newnodo;
        }else{
            newnodo.sgte=origen;
            origen=newnodo;
        }
    }
      
      void mostrar(){
        nodo temp=origen;
        while(temp!=null){
            System.out.print(temp.dato.datos());
            temp=temp.sgte;
        }
    }
}
     
     
public class Parcial_03 extends javax.swing.JFrame {
      ArrayList<Fruta> lista;
    int vec[];
    int n=0;
    metodoTXT mtxt;
    metodo m=new metodo();
    /**
     * Creates new form Parcial_03
     */
    public Parcial_03() throws IOException {
        initComponents();
        lista=new ArrayList<>(); 
         mtxt = new metodoTXT();
         mtxt.leer();
        lista = mtxt.getLista();
        llenarTabla();
        buttonGroup1.add(txt_lista_simple);
        buttonGroup1.add(txt_lista_doble);
        // L U I S 
    }
     private void llenarTabla() {
        String cabeza[]={"Nombre","Color ","Peso","Maduracion","Tamaño","Tipo"};
        DefaultTableModel modelodef=new DefaultTableModel(cabeza,lista.size());
        jTable1.setModel(modelodef);
        
        TableModel modelo=jTable1.getModel();
         for (int i = 0; i < lista.size(); i++) {
            Fruta d=lista.get(i);
            modelo.setValueAt(d.getNombre(), i, 0);
            modelo.setValueAt(d.getColor(),i, 1);
               modelo.setValueAt(d.getPeso(),i, 2);
                  modelo.setValueAt(d.getMaduracion(),i, 3);
                     modelo.setValueAt(d.getTamanio(),i, 4);
                     modelo.setValueAt(d.getTipo(),i, 5);
        }
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_color = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        txt_madur = new javax.swing.JTextField();
        txt_tamanio = new javax.swing.JTextField();
        txt_lista_simple = new javax.swing.JRadioButton();
        txt_lista_doble = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        txt_guardar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("        ALMACEN     DE       FRUTAS ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Color : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Peso :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Maduracion  :  ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tamaño  : ");

        txt_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_colorActionPerformed(evt);
            }
        });

        txt_lista_simple.setText("Lista Simple");
        txt_lista_simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lista_simpleActionPerformed(evt);
            }
        });

        txt_lista_doble.setText("Lista Doble");
        txt_lista_doble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lista_dobleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tipo");

        jToggleButton1.setText("Realizar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        txt_guardar.setText("GUARDAR");
        txt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_guardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_peso, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txt_madur)
                    .addComponent(txt_tamanio)
                    .addComponent(txt_color)
                    .addComponent(txt_nombre))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_lista_simple, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_lista_doble, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(txt_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_lista_simple, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_lista_doble))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_madur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_tamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(txt_guardar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_colorActionPerformed

    private void txt_lista_simpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lista_simpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lista_simpleActionPerformed

    private void txt_lista_dobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lista_dobleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lista_dobleActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      String nombre;
      String color;
      Long peso;
      String maduracion;
      String  tamanio;
      String tipo;
      
       nombre=this.txt_nombre.getText().trim();
       color=this.txt_color.getText().trim();
       peso=Long.valueOf(this.txt_peso.getText().trim());
       maduracion=this.txt_madur.getText().trim();
       tamanio=this.txt_tamanio.getText().trim();
      metodo m=new metodo();
      
    // String n1 =Integer.parseInt(n);
      // String numCadena= String.valueOf(n);
     
        if(txt_lista_simple.isSelected()){
            
         m.ingresarS(new Fruta(nombre, color, 0, 0, maduracion, tamanio, "Simple"));
             lista.add(new Fruta(nombre, color, 0, 0, maduracion, tamanio, "Simple"));
         
        }else if(txt_lista_doble.isSelected()){
              
             m.ingresarD(new Fruta(nombre, color, 0, 0, maduracion, tamanio, "Doble"));
             lista.add(new Fruta(nombre, color, 0, 0, maduracion, tamanio, "Doble"));
        }else{
                JOptionPane.showMessageDialog(null, "No se selecciono");
                }
     
          mtxt = new metodoTXT(lista);
        try {
            mtxt.escribir();
        
         } catch (IOException ex) {
         }
           llenarTabla();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_guardarActionPerformed
        // TODO add your handling code
    }//GEN-LAST:event_txt_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(Parcial_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parcial_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parcial_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parcial_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Parcial_03().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Parcial_03.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txt_color;
    private javax.swing.JToggleButton txt_guardar;
    private javax.swing.JRadioButton txt_lista_doble;
    private javax.swing.JRadioButton txt_lista_simple;
    private javax.swing.JTextField txt_madur;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_tamanio;
    // End of variables declaration//GEN-END:variables
}
