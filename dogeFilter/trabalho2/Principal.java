/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho2;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author breno
 */
public class Principal extends javax.swing.JFrame {

    BufferedImage imgOriginal;
    Boolean blnImgImportada;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.blnImgImportada = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlImagem = new trabalho2.ImagePanel();
        pnlImagemComFiltro = new trabalho2.ImagePanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCinza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPassaBaixa = new javax.swing.JButton();
        btnPassaAlta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSelpia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnDoge = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuImagem = new javax.swing.JMenu();
        jmiImportar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instadoge");

        pnlImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout pnlImagemLayout = new javax.swing.GroupLayout(pnlImagem);
        pnlImagem.setLayout(pnlImagemLayout);
        pnlImagemLayout.setHorizontalGroup(
            pnlImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlImagemLayout.setVerticalGroup(
            pnlImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlImagemComFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout pnlImagemComFiltroLayout = new javax.swing.GroupLayout(pnlImagemComFiltro);
        pnlImagemComFiltro.setLayout(pnlImagemComFiltroLayout);
        pnlImagemComFiltroLayout.setHorizontalGroup(
            pnlImagemComFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlImagemComFiltroLayout.setVerticalGroup(
            pnlImagemComFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnCinza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/gray60x60.png"))); // NOI18N
        btnCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCinzaActionPerformed(evt);
            }
        });

        jLabel1.setText("Escala de Cinza");

        jLabel2.setText("Passa-Alta");

        btnPassaBaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/gimli.jpg"))); // NOI18N
        btnPassaBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassaBaixaActionPerformed(evt);
            }
        });

        btnPassaAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/alta.jpg"))); // NOI18N
        btnPassaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassaAltaActionPerformed(evt);
            }
        });

        jLabel3.setText("Passa-Baixa");

        btnSelpia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/selpia.jpeg"))); // NOI18N
        btnSelpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelpiaActionPerformed(evt);
            }
        });

        jLabel4.setText("Sélpia");

        btnDoge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/doge.jpg"))); // NOI18N
        btnDoge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDogeActionPerformed(evt);
            }
        });

        jLabel5.setText("Much Doge");

        jMenuImagem.setText("Imagem");

        jmiImportar.setText("Importar");
        jmiImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiImportarActionPerformed(evt);
            }
        });
        jMenuImagem.add(jmiImportar);

        jMenuBar1.add(jMenuImagem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnCinza)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPassaAlta)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPassaBaixa)
                                .addGap(18, 18, 18)
                                .addComponent(btnSelpia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(btnDoge))
                        .addGap(0, 168, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlImagemComFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlImagemComFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCinza)
                            .addComponent(btnPassaAlta)
                            .addComponent(btnSelpia)
                            .addComponent(btnDoge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(btnPassaBaixa))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiImportarActionPerformed
        FileFilter imageFilter = new FileNameExtensionFilter("Arquivos de Imagem (.jpg, .bmp, .wbmp, .jpeg, .png, .gif)", 
                ImageIO.getReaderFileSuffixes());
        
        JFileChooser chooser = new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.addChoosableFileFilter(imageFilter);
        chooser.setDialogTitle("Selecione uma imagem...");
        //chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
        {
            try 
            {
                this.imgOriginal = ImageIO.read(chooser.getSelectedFile());
                
                this.pnlImagem.setImage(this.imgOriginal);
                this.blnImgImportada = true;
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(null, "Falha ao carregar arquivo.");
            }
        } 
        else
            JOptionPane.showMessageDialog(null, "Por favor selecione uma imagem!");
    }//GEN-LAST:event_jmiImportarActionPerformed

    private void btnCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinzaActionPerformed
        if(this.blnImgImportada)
        {
            this.pnlImagemComFiltro.setImage(Filtros.escalaDeCinza(imgOriginal));
        }
        else
            JOptionPane.showMessageDialog(null, "Por favor importe uma imagem antes de tentar aplicar um filtro.");
    }//GEN-LAST:event_btnCinzaActionPerformed

    private void btnPassaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassaAltaActionPerformed
        if(this.blnImgImportada)
        {
            this.pnlImagemComFiltro.setImage(Filtros.passaAlta(imgOriginal));
        }
        else
            JOptionPane.showMessageDialog(null, "Por favor importe uma imagem antes de tentar aplicar um filtro.");
    }//GEN-LAST:event_btnPassaAltaActionPerformed

    private void btnPassaBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassaBaixaActionPerformed
        if(this.blnImgImportada)
        {
            this.pnlImagemComFiltro.setImage(Filtros.passaBaixa(imgOriginal));
        }
        else
            JOptionPane.showMessageDialog(null, "Por favor importe uma imagem antes de tentar aplicar um filtro.");
    }//GEN-LAST:event_btnPassaBaixaActionPerformed

    private void btnSelpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelpiaActionPerformed
        if(this.blnImgImportada)
        {
            this.pnlImagemComFiltro.setImage(Filtros.selpia(imgOriginal));
        }
        else
            JOptionPane.showMessageDialog(null, "Por favor importe uma imagem antes de tentar aplicar um filtro.");
    }//GEN-LAST:event_btnSelpiaActionPerformed

    private void btnDogeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDogeActionPerformed
        if(this.blnImgImportada)
        {
            this.pnlImagemComFiltro.setImage(Filtros.doge(imgOriginal));
        }
        else
            JOptionPane.showMessageDialog(null, "Por favor importe uma imagem antes de tentar aplicar um filtro.");   
    }//GEN-LAST:event_btnDogeActionPerformed

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
    private javax.swing.JButton btnCinza;
    private javax.swing.JButton btnDoge;
    private javax.swing.JButton btnPassaAlta;
    private javax.swing.JButton btnPassaBaixa;
    private javax.swing.JButton btnSelpia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuImagem;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem jmiImportar;
    private trabalho2.ImagePanel pnlImagem;
    private trabalho2.ImagePanel pnlImagemComFiltro;
    // End of variables declaration//GEN-END:variables
}
