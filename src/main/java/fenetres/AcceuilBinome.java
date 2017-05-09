/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetres;

import javax.swing.JLabel;
import pfe.InfLogique;
import pfe.InfSegmentation;
import pfe.Logique;
import pfe.Segmentation;
import pfe.imagePath;

/**
 *
 * @author Taleb
 */
public class AcceuilBinome extends javax.swing.JFrame {

    /**
     * Creates new form AcceuilBinome
     */
     // objet contenant le design de l interface graphique 
    Design design;

    InfLogique logique;
    InfSegmentation segmentation;

    
    public AcceuilBinome() {
        initComponents();
        this.design = new DesignImpl();
        this.logique = new Logique();
        this.segmentation = new Segmentation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Systeme de Reconaissance de Plaque");
        setBackground(new java.awt.Color(239, 35, 60));

        jPanel1.setBackground(new java.awt.Color(239, 35, 60));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 40, 45), 5));

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 45, 66));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Système de detection et de reconnaissance des plaque d'immatriculation. Imène & Souad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(237, 242, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 40, 45), 5));

        jButton1.setBackground(new java.awt.Color(43, 45, 66));
        jButton1.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(239, 35, 60));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/icon (3).png"))); // NOI18N
        jButton1.setText("Charger");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 45, 66));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Image");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 45, 66));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lecture Ocr");

        jLabel4.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 45, 66));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Détection");

        jButton2.setBackground(new java.awt.Color(43, 45, 66));
        jButton2.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(239, 35, 60));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/binary-code-numbers-on-monitor-screen.png"))); // NOI18N
        jButton2.setText("<html> Image <br> binaire\n");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(43, 45, 66));
        jButton3.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(239, 35, 60));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/correction-fluid-with-open-cap-and-brush.png"))); // NOI18N
        jButton3.setText("<html>Corriger<br> le bruit");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(43, 45, 66));
        jButton4.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(239, 35, 60));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/circles-overlapping-black-and-white.png"))); // NOI18N
        jButton4.setText("<html>Noire <br> et blanc ");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(43, 45, 66));
        jButton5.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(239, 35, 60));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/stretch.png"))); // NOI18N
        jButton5.setText("<html>Dilatation <br> et Erosion");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(43, 45, 66));
        jButton6.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(239, 35, 60));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/search.png"))); // NOI18N
        jButton6.setText("Délimitation");
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(43, 45, 66));
        jButton7.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(239, 35, 60));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/binary-code-numbers-on-monitor-screen.png"))); // NOI18N
        jButton7.setText("<html> Image <br> binaire <br> OCR");
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(43, 45, 66));
        jButton8.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(239, 35, 60));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/stretch.png"))); // NOI18N
        jButton8.setText("<html>Dilatation <br> et Erosion <br> OCR");
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setOpaque(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(43, 45, 66));
        jButton9.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(239, 35, 60));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/man-reading.png"))); // NOI18N
        jButton9.setText("<html> Lecture <br> OCR");
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setOpaque(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(43, 45, 66));
        jButton10.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(239, 35, 60));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/binary-code-loading-symbol.png"))); // NOI18N
        jButton10.setText("<html>Transformation <br> de Canny");
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setOpaque(true);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        JLabel jLabelResultat =  visionneuseTraitement.getImageTraiter();
        logique.findContours(jLabelResultat);
        imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut(path.getErosion());
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        OCRLogique ocrLogique = new OCRLogique();
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        JLabel jLabelResultat =  visionneuseTraitement.getImageTraiter();
        ocrLogique.doOCR(jLabelResultat);
      //  imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut("final_OcrReadFrom.jpg");
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VisionneuseChargement visionneuseChargement = new VisionneuseChargement();
        logique.loadPlate(visionneuseChargement.getLabel());
        visionneuseChargement.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        JLabel jLabelResultat =  visionneuseTraitement.getImageTraiter();
        logique.smoothAndBlur(jLabelResultat);
        imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut(path.getOriginal());
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        JLabel jLabelResultat =  visionneuseTraitement.getImageTraiter();
        logique.toB_W(jLabelResultat);
        imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut(path.getOriginal());
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut("grey_"+path.getBlackAndWhite());
        visionneuseTraitement.setImageResultat(path.getBlackAndWhite());
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitementDilatation = new VisionneuseTraitement();
        VisionneuseTraitement visionneuseTraitementErosion = new VisionneuseTraitement();
        JLabel imageTraiterDilatation = visionneuseTraitementDilatation.getImageTraiter();
        JLabel imageTraiterErosion = visionneuseTraitementErosion.getImageTraiter();
        segmentation.dilate_erose(imageTraiterErosion, imageTraiterDilatation);
        imagePath path = new imagePath();
        visionneuseTraitementDilatation.setImageDebut(path.getImagelines());
        visionneuseTraitementErosion.setImageDebut(path.getDilation());
        visionneuseTraitementDilatation.setVisible(true);
        visionneuseTraitementErosion.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        JLabel jLabelResultat =  visionneuseTraitement.getImageTraiter();
        logique.findLines(jLabelResultat);
        imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut(path.getBlackAndWhite());
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        JLabel jLabelResultat =  visionneuseTraitement.getImageTraiter();
       segmentation.toB_A_W(jLabelResultat);
       imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut(path.getOriginal());
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        JLabel jLabelResultat =  visionneuseTraitement.getImageTraiter();
        imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut(path.getOcrReadFrom());
        logique.toB_W_OCR(jLabelResultat);
        segmentation.dilate_erose_ocr();
        visionneuseTraitement.setImageResultat("final_OcrReadFrom.jpg");
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}