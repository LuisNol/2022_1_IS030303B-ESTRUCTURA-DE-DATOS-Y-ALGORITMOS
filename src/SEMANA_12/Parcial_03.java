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
import java.util.Random;
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
     private String peso;
     private String maduracion;
     private String  tamanio;
     private String tipo;
     

    public Fruta(String nombre,String color, String peso, String maduracion, String tamanio, String tipo) {
        this.nombre = nombre;
        this.color=color;
        this.peso = peso;
        this.maduracion = maduracion;
        this.tamanio = tamanio;
        this.tipo = tipo;
    }

    

    public String getPeso() {
        return peso;
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

    

    public String getMaduracion() {
        return maduracion;
    }

    public String getTamanio() {
        return tamanio;
    }

    
    public String datos() {
        return this.nombre + "," + this.color + "," + this.peso + "," + this.maduracion + "," + this.tamanio+","+this.tipo ;
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
            this.lista.add(new Fruta(cad2[0].trim(), cad2[1].trim(), cad2[2].trim(), cad2[3].trim(),cad2[4].trim(),cad2[5].trim()));
           // this.lista.add(new Fruta((cad2[0]).trim(),cad2[1].trim(),cad2[2].trim(),cad2[3].trim(),cad2[4].trim(),cad2[5].trim()));
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
      
      String  mostrar(){
          String acu="";
        nodo temp=origen;
        while(temp!=null){
             acu="-"+temp.dato.datos();
            temp=temp.sgte;
        }
        return acu;
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
        txt_lista_simple = new javax.swing.JRadioButton();
        txt_lista_doble = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_mostrar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel1.setText("        ALMACEN     DE       FRUTAS ");

        txt_lista_simple.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        txt_lista_simple.setText("Lista Simple");
        txt_lista_simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lista_simpleActionPerformed(evt);
            }
        });

        txt_lista_doble.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        txt_lista_doble.setText("Lista Doble");
        txt_lista_doble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lista_dobleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        jLabel7.setText("Tipo");

        jToggleButton1.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        jToggleButton1.setText("Realizar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_lista_doble, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(txt_lista_simple, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_lista_simple, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txt_lista_doble)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1))
                    .addComponent(txt_mostrar))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lista_simpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lista_simpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lista_simpleActionPerformed

    private void txt_lista_dobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lista_dobleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lista_dobleActionPerformed
  static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
                  this.txt_mostrar.setText("");
      String listaNombre[] = {"Limon", " Mandarina", "Naranja ","Durazno", "Melon", "Sandia","Aguacate","Caranbola","Coco"
      ,"Papaya","Platano"," Piña","Manzna","Uva","Pera"};
       String listTamamio[]={"Pequeño","Grande"};
       String listMaduracion[]={"Maduro","Verde"};
       String listColor[]={"Amarrillo","Rojo","Morado","VerdeC","Naranjado","Blanco"};
      String nombre=listaNombre[aletorioEntero(0, 14)];
      String color=listColor[aletorioEntero(0, 5)];
      String peso=String.valueOf(aletorioEntero(1, 20));
      String maduracion=listMaduracion[aletorioEntero(0, 1)];
      String  tamanio=listTamamio[aletorioEntero(0, 1)];
      String tipo;
      
       //nombre=this.txt_nombre.getText().trim();
      // color=this.txt_color.getText().trim();
       //peso=this.txt_peso.getText().trim();
       //maduracion=this.txt_madur.getText().trim();
       //tamanio=this.txt_tamanio.getText().trim();
      metodo m=new metodo();
      
    // String n1 =Integer.parseInt(n);
      // String numCadena= String.valueOf(n);
     
        if(txt_lista_simple.isSelected()){
            
         m.ingresarS(new Fruta(nombre, color, peso, maduracion, tamanio, "Simple"));
          lista.add(new Fruta(nombre,color,peso,maduracion,tamanio,"simple"));
         
        }else if(txt_lista_doble.isSelected()){
              
            m.ingresarD(new Fruta(nombre, color, peso, maduracion, tamanio, "Doble"));
             lista.add(new Fruta(nombre,color,peso,maduracion,tamanio,"Doble"));
        }else{
                JOptionPane.showMessageDialog(null, "No se selecciono");
                }
         // this.resultado_suma1.setText(m.mostrar(vec));
          this.txt_mostrar.setText(m.mostrar());
          mtxt = new metodoTXT(lista);
        try {
            mtxt.escribir();
        
         } catch (IOException ex) {
         }
           llenarTabla();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton txt_lista_doble;
    private javax.swing.JRadioButton txt_lista_simple;
    private javax.swing.JTextField txt_mostrar;
    // End of variables declaration//GEN-END:variables
}
