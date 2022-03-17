package analizador2.pkg1;

import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Principal extends javax.swing.JFrame {
   
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null); 

    }

    String reservadas = "incluir|automatico|entero|caracter|decimal|texto|dobledecimal|invariable|seleccionar|opcion|terminar|predeterminado|limpio|si|sino|repetir|mientras|hacer|retornar|vacio|mostrar|tomar|funcion|principal|definir";
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextPane();
        Entrada = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextPane();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSalidaSintc = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSalidaError = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(53, 59, 72));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jScrollPane1.setViewportView(txtEntrada);

        Entrada.setBackground(new java.awt.Color(39, 131, 51));
        Entrada.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Entrada.setForeground(new java.awt.Color(255, 255, 255));
        Entrada.setText("Analizar");
        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(39, 131, 51));
        limpiar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        txtSalida.setEditable(false);
        jScrollPane2.setViewportView(txtSalida);

        jButton3.setBackground(new java.awt.Color(231, 76, 60));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Analizador lexico");

        jScrollPane3.setViewportView(txtSalidaSintc);

        jScrollPane4.setViewportView(txtSalidaError);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(358, 358, 358)
                        .addComponent(jButton3)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
       
        String fuente;
        fuente = txtEntrada.getText();
        fuente = fuente.trim();
        if (fuente.length() == 0) {
            txtSalida.setText("El cuadro de entrada no contiene\ncaracteres a" + " evaluar. ");
        } else {
           
            AnalizadorLex();
        
        }

        //analizarIdentifiador();
    }//GEN-LAST:event_EntradaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        txtEntrada.setText("");
        txtSalida.setText("");

    }//GEN-LAST:event_limpiarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    

    

    public void AnalizadorLex() {
        
        String  TextoEntrada="";
        TextoEntrada = txtEntrada.getText();
        TextoEntrada = TextoEntrada.trim();
      
        String salidaLexico ="";    
        String salidaError =""; 
        String[] split = TextoEntrada.split("                  ");
        //se crea un patron con expresiones regulares
      
        for (int i = 0; i < split.length; i++) {
            Pattern patron = Pattern.compile("(["+reservadas+"]+[0-9]+[0-9])|"
                + "(["+reservadas+"]+[0-9])|"
                +    "("+reservadas+")+|" //reservadas         ------    gropu(1) listo
                + "([a-zA-Z]+[0-9]+)|"
                + "([a-zA-Z]+)|"                                           //identificadores    ------    gropu(2) listo
                + "([>|<|=|+|[-]|*|/]+)|"                                    //operadores         ------    gropu(3) listo
                + "([0-9]+[.]+[0-9]+[.]+[0-9]+)|"                        //error decimal        ------    gropu(4) listo
                + "([0-9]+[.]+[.]+[0-9]+)|"
                + "([.]+[0-9]+)|"                                     //decimal            ------    gropu(5) listo
                + "([0-9]+[.]+[0-9]+)|"
                + "([0-9]+[A-Za-z]+)|"                                     //errorIdentificador ------    gropu(6) listo
                + "([0-9]+)|"
                + "([{|}|;|_|-]+)|"                                              //simbolos           ------    gropu(7)
                                                             //punto y coma       ------    gropu(8)
            );
            Matcher mat = patron.matcher(TextoEntrada);
        
            int n = 0;
            while(mat.find()){
                 String tokentipo13 = mat.group(1);
                if(tokentipo13 != null){
               
                    salidaLexico += ("Es un Indentificador   \t\t  | "+"[ "+ tokentipo13+" ]"+"\n");
                    n=split.length;
                }
                String tokentipo14 = mat.group(2);
                if(tokentipo14 != null){
                 
                    salidaLexico += ("Es un Indentificador  \t\t  |  "+"[ "+ tokentipo14+" ]"+"\n");
                    n=split.length;
                }
                String tokentipo1 = mat.group(3);
                if(tokentipo1 != null){

                    salidaLexico += ("Es una palabra reservada \t\t |  "+"[ "+ tokentipo1+" ]"+"\n");
                    n=split.length;
                }
                String tokentipo2 = mat.group(4);
                if(tokentipo2 != null){
                    
                    salidaLexico += ("Es un identificador  \t\t  | "+"[ "+ tokentipo2+" ]"+"\n");
                    n=split.length;
                }
                String tokentipo3 = mat.group(5);
                if(tokentipo3 != null){
                   
                     salidaLexico+= ("Es un identificador \t\t  | "+ "[ "+ tokentipo3+" ]"+"\n");
                     n=split.length;
                }
                
                String tokentipo4 = mat.group(6);
                if(tokentipo4 != null){
                   
                    salidaLexico += ("Es un operador   \t\t  |   "+"[ "+ tokentipo4+" ]"+"\n");
                    n=split.length;
                }
                String tokentipo5 = mat.group(7);
                if(tokentipo5 != null){
                    
                     salidaError += ("Error! multiples puntos  \t\t  |  "+"[ "+ tokentipo5+" ]"+"\n");
                     n=split.length;
                }  
                
                String tokentipo6 = mat.group(8);
                if(tokentipo6 != null){
                  
                     salidaError += ("Error! Multiples puntos \t\t  |   "+"[ "+ tokentipo6+" ]"+"\n");
                     n=split.length;
                }
                
                String tokentipo7 = mat.group(9);
                if(tokentipo7 != null){
                   
                     salidaLexico += ("Es un Decimal  \t\t  |  "+"[ "+ tokentipo7+" ]"+"\n");
                     n=split.length;
                }
                
                String tokentipo8 = mat.group(10);
                if(tokentipo8 != null){
                    
                     salidaLexico += ("Es un Decimal    \t\t  |  "+"[ "+ tokentipo8+" ]"+"\n");
                     n=split.length;
                }
                  String tokentipo9 = mat.group(11);
                if(tokentipo9 != null){
                 
                     salidaError+= ("Error! numero antes que letra \t  |  "+"[ "+ tokentipo9+" ]"+"\n");
                     n=split.length;
                }
                
                 String tokentipo10 = mat.group(12);
                if(tokentipo10 != null){
                    
                     salidaLexico += ("Es un Numero \t\t  |"+ "["+ tokentipo10+"]\n");
                     n=split.length;
                }
              
                String tokentipo11 = mat.group(13);
                if(tokentipo11 != null){
                    
                     salidaLexico+= ("Es un Simbolo  \t\t  |  "+ "["+ tokentipo11+" ]"+"\n");
                     n=split.length;
                }
                         
            }
            
            
            for(int j = 0; j < n; j++) {
                    split[j] = " ";
            }           
        }
        
        txtSalida.setText(salidaLexico);
        txtSalidaError.setText(salidaError);
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrada;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextPane txtEntrada;
    private javax.swing.JTextPane txtSalida;
    private javax.swing.JTextPane txtSalidaError;
    private javax.swing.JTextPane txtSalidaSintc;
    // End of variables declaration//GEN-END:variables
}
