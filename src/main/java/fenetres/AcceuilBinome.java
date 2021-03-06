/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetres;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
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
        JBTChargeImage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBCorrigeBruit = new javax.swing.JButton();
        JBImageNB = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        JBDtctImageBinaire = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        JBLectureDirect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Systeme de Reconaissance de Plaque");
        setBackground(new java.awt.Color(239, 35, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 45, 66), 5));

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

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 45, 66), 5));

        JBTChargeImage.setBackground(new java.awt.Color(43, 45, 66));
        JBTChargeImage.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        JBTChargeImage.setForeground(new java.awt.Color(255, 255, 255));
        JBTChargeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/icon (3).png"))); // NOI18N
        JBTChargeImage.setText("Charger");
        JBTChargeImage.setContentAreaFilled(false);
        JBTChargeImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTChargeImage.setOpaque(true);
        JBTChargeImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTChargeImageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Image");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lecture Ocr");

        jLabel4.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Détection");

        JBCorrigeBruit.setBackground(new java.awt.Color(43, 45, 66));
        JBCorrigeBruit.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        JBCorrigeBruit.setForeground(new java.awt.Color(255, 255, 255));
        JBCorrigeBruit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/correction-fluid-with-open-cap-and-brush.png"))); // NOI18N
        JBCorrigeBruit.setText("<html>Corriger<br> le bruit");
        JBCorrigeBruit.setContentAreaFilled(false);
        JBCorrigeBruit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCorrigeBruit.setOpaque(true);
        JBCorrigeBruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCorrigeBruitActionPerformed(evt);
            }
        });

        JBImageNB.setBackground(new java.awt.Color(43, 45, 66));
        JBImageNB.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        JBImageNB.setForeground(new java.awt.Color(255, 255, 255));
        JBImageNB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/circles-overlapping-black-and-white.png"))); // NOI18N
        JBImageNB.setText("<html>Noire <br> et blanc ");
        JBImageNB.setContentAreaFilled(false);
        JBImageNB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBImageNB.setOpaque(true);
        JBImageNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImageNBActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(43, 45, 66));
        jButton7.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
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
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
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
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
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

        jScrollPane1.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setAutoscrolls(true);

        jButton5.setBackground(new java.awt.Color(43, 45, 66));
        jButton5.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
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

        JBDtctImageBinaire.setBackground(new java.awt.Color(43, 45, 66));
        JBDtctImageBinaire.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        JBDtctImageBinaire.setForeground(new java.awt.Color(255, 255, 255));
        JBDtctImageBinaire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/binary-code-numbers-on-monitor-screen.png"))); // NOI18N
        JBDtctImageBinaire.setText("<html> Image <br> binaire ");
        JBDtctImageBinaire.setContentAreaFilled(false);
        JBDtctImageBinaire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBDtctImageBinaire.setOpaque(true);
        JBDtctImageBinaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDtctImageBinaireActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(43, 45, 66));
        jButton10.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
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

        jButton6.setBackground(new java.awt.Color(43, 45, 66));
        jButton6.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(JBDtctImageBinaire, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBDtctImageBinaire, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel3);

        JBLectureDirect.setBackground(new java.awt.Color(43, 45, 66));
        JBLectureDirect.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        JBLectureDirect.setForeground(new java.awt.Color(255, 255, 255));
        JBLectureDirect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/template/man-reading.png"))); // NOI18N
        JBLectureDirect.setText("<html>Lire<br> Dirrectement");
        JBLectureDirect.setContentAreaFilled(false);
        JBLectureDirect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBLectureDirect.setOpaque(true);
        JBLectureDirect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLectureDirectActionPerformed(evt);
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
                    .addComponent(JBTChargeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCorrigeBruit, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBImageNB, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLectureDirect, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JBTChargeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(JBLectureDirect, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(JBCorrigeBruit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(JBImageNB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void JBTChargeImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTChargeImageActionPerformed
        // TODO add your handling code here:
        VisionneuseChargement visionneuseChargement = new VisionneuseChargement();
        logique.loadPlate(visionneuseChargement.getLabel());
        visionneuseChargement.setVisible(true);
    }//GEN-LAST:event_JBTChargeImageActionPerformed

    private void JBCorrigeBruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCorrigeBruitActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        JLabel jLabelResultat =  visionneuseTraitement.getImageTraiter();
        logique.smoothAndBlur(jLabelResultat);
        imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut(path.getOriginal());
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_JBCorrigeBruitActionPerformed

    private void JBImageNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImageNBActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        JLabel jLabelResultat =  visionneuseTraitement.getImageTraiter();
        logique.toB_W(jLabelResultat);
        imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut(path.getOriginal());
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_JBImageNBActionPerformed

    private void JBDtctImageBinaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDtctImageBinaireActionPerformed
        // TODO add your handling code here:
        VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
        imagePath path = new imagePath();
        visionneuseTraitement.setImageDebut("grey_"+path.getBlackAndWhite());
        visionneuseTraitement.setImageResultat(path.getBlackAndWhite());
        visionneuseTraitement.setVisible(true);
    }//GEN-LAST:event_JBDtctImageBinaireActionPerformed

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

    private void JBLectureDirectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLectureDirectActionPerformed
        try {
            // TODO add your handling code here:
            Tesseract instance = Tesseract.getInstance();;
            instance.setDatapath("C:\\Tess4J-3.3.0-src\\Tess4J\\tessdata");
          
            String doOCR = instance.doOCR(new File("original.jpg"));
            System.out.println("doOcr = "+doOCR);
            VisionneuseTraitement visionneuseTraitement = new VisionneuseTraitement();
            visionneuseTraitement.setImageDebut("original.jpg");
            visionneuseTraitement.getImageTraiter().setText(doOCR);
            visionneuseTraitement.setVisible(true);
        } catch (TesseractException ex) {
            Logger.getLogger(AcceuilBinome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBLectureDirectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCorrigeBruit;
    private javax.swing.JButton JBDtctImageBinaire;
    private javax.swing.JButton JBImageNB;
    private javax.swing.JButton JBLectureDirect;
    private javax.swing.JButton JBTChargeImage;
    private javax.swing.JButton jButton10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
