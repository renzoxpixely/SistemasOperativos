/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorador;
//import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor
 */

public class Escritorio extends javax.swing.JFrame {

    /**
     * Creates new form Escritorio
     */
 //public Dimension dim;
    
    public void abreInternet(){
        try{
        Desktop.getDesktop().browse(URI.create("www.google.com"));
    }catch(Exception e){
         
    }
    
    }
    public void abreMipc(){
         try{

            Explorador ex=new Explorador();
                ex.inicializar();
                InterfazInicio i = new InterfazInicio();
        
             
             
             
  
    }catch(Exception e){
         
    }
    }
    public Escritorio() {
            
        
        initComponents();
     //   dim =super.getToolkit().getScreenSize();
      //  super.setSize(dim);
        this.setLocationRelativeTo(null);
        
 
    }
    
        public void abreMireproductor(){
         try{

            
        
             JPrincipal reproductor = new JPrincipal();
        reproductor.setVisible(true);
             
             
  
    }catch(Exception e){
         
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

        JPbarra = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        jInternet = new javax.swing.JLabel();
        jMipc = new javax.swing.JLabel();
        jInternet1 = new javax.swing.JLabel();
        jReproductor = new javax.swing.JLabel();
        jApagar = new javax.swing.JLabel();
        jFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPbarra.setBackground(new java.awt.Color(51, 51, 255));
        JPbarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        JPbarra.setForeground(new java.awt.Color(255, 255, 255));
        JPbarra.setFocusable(false);

        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/windows.png"))); // NOI18N
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPbarraLayout = new javax.swing.GroupLayout(JPbarra);
        JPbarra.setLayout(JPbarraLayout);
        JPbarraLayout.setHorizontalGroup(
            JPbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPbarraLayout.createSequentialGroup()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1004, 1004, 1004))
        );
        JPbarraLayout.setVerticalGroup(
            JPbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPbarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(JPbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1050, 40));

        jInternet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/internet.png"))); // NOI18N
        jInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInternetMouseClicked(evt);
            }
        });
        getContentPane().add(jInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 10, 60, 60));

        jMipc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMipc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mipc.png"))); // NOI18N
        jMipc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMipcMouseClicked(evt);
            }
        });
        getContentPane().add(jMipc, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 90, 60, 60));

        jInternet1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jInternet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reproductor.png"))); // NOI18N
        jInternet1.setToolTipText("");
        jInternet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInternet1MouseClicked(evt);
            }
        });
        getContentPane().add(jInternet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 170, 60, 60));

        jReproductor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jReproductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reproductor.png"))); // NOI18N
        getContentPane().add(jReproductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 250, 60, 60));

        jApagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apagar.png"))); // NOI18N
        jApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jApagarMouseClicked(evt);
            }
        });
        getContentPane().add(jApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 250, 60, 60));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoe_2.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        ImageIcon logowindow= new ImageIcon("src/images/windows.png");
        Icon Icono=new ImageIcon(logowindow.getImage().getScaledInstance(btnInicio.getWidth(),btnInicio.getHeight(),Image.SCALE_DEFAULT));
        btnInicio.setIcon(Icono);
        this.repaint();
        //movimiento
        
        
        
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        // TODO add your handling code here:
        AnimationClass internet =new AnimationClass();
        AnimationClass apagar =new AnimationClass();
        AnimationClass mipc =new AnimationClass();
        AnimationClass internet1= new AnimationClass();
        
        internet.jLabelXRight(-60, 10, 10, 5,jInternet);
        internet.jLabelXLeft(10, -60, 10, 5,jInternet); 
        
        
        internet1.jLabelXRight(-60, 10, 10, 5,jInternet1);
        internet1.jLabelXLeft(10, -60, 10, 5,jInternet1); 
        
        apagar.jLabelXRight(-60, 10, 10, 5,jApagar);
        apagar.jLabelXLeft(10, -60, 10, 5,jApagar);
        
        mipc.jLabelXRight(-60, 10, 10, 5,jMipc);
        mipc.jLabelXLeft(10, -60, 10, 5,jMipc);
        
       
       
        
       
      
        
    }//GEN-LAST:event_btnInicioMouseClicked

    private void jInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInternetMouseClicked
        // TODO add your handling code here:
        abreInternet();

    }//GEN-LAST:event_jInternetMouseClicked

    private void jMipcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMipcMouseClicked
        // TODO add your handling code here:
        abreMipc();
         
    }//GEN-LAST:event_jMipcMouseClicked

    private void jInternet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInternet1MouseClicked
        // TODO add your handling code here:
         abreMireproductor();
    }//GEN-LAST:event_jInternet1MouseClicked

    private void jApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jApagarMouseClicked
        // TODO add your handling code here:
        int dialog =JOptionPane.YES_OPTION;
        int result=JOptionPane.showConfirmDialog(null,"¿Desea realmente Apagar ?","exit", dialog);
        if(result==0){
            System.exit(0);
        }

    }//GEN-LAST:event_jApagarMouseClicked
 

    public static void main(String[] args) {
               
      Escritorio escri=new Escritorio();
      escri.setVisible(true);
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPbarra;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jApagar;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jInternet;
    private javax.swing.JLabel jInternet1;
    private javax.swing.JLabel jMipc;
    private javax.swing.JLabel jReproductor;
    // End of variables declaration//GEN-END:variables
}
