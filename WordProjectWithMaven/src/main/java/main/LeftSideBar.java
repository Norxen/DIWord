/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 *
 * @author calde
 */
public class LeftSideBar extends javax.swing.JPanel {

    /**
     * Creates new form LeftSideBar
     */
    public LeftSideBar() {
        initComponents();
       jSlider1.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
               
                jSlider1.setValue(jSlider1.getValue() - e.getUnitsToScroll());
             
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();

        setLayout(new java.awt.GridLayout());

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(20);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintTrack(false);
        jSlider1.setSnapToTicks(true);
        jSlider1.setMaximumSize(new java.awt.Dimension(20, 32767));
        jSlider1.setMinimumSize(new java.awt.Dimension(20, 36));
        jSlider1.setPreferredSize(new java.awt.Dimension(20, 800));
        add(jSlider1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}