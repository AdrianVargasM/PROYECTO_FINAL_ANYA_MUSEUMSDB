/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.*;

public class InsertRefPeriods extends javax.swing.JDialog {
    /**
     * Creates new form InsertAuthorDialog
     */
    private final HashMap ht;
    private final Database db;

    public InsertRefPeriods(java.awt.Frame parent, Database db) {
        super(parent, true);
        initComponents();
        this.db = db;
        this.setSize(450,300);
        this.setLayout(null);
        ht = new HashMap<String, Integer>();
        // Construir el combo con el ID y Nombre de proveedor
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        Period_Code = new JTextField();
        Period_name = new JTextField();
        Period_Description = new JTextField();
        okButton = new JButton();
        cancelButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Reference Periods");
        setResizable(false);

        jLabel1.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Period code:");
        jLabel1.setBounds(40,40,160,30);

        jLabel2.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Period name:");
        jLabel2.setBounds(40,80,160,30);

        jLabel3.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Period description:");
        jLabel3.setBounds(40,120,160,30);

        //txtId.setColumns(42);
        Period_Code.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Period_Code.setBounds(200,40,200,30);
        Period_Code.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        //listed_building_yn.setColumns(11);
        Period_name.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Period_name.setBounds(200,80,200,30);
        //shop_yn.setColumns(11);
        Period_Description.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Period_Description.setBounds(200,120,200,30);

        okButton.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        okButton.setText("Add");
        okButton.setBounds(120, 160, 100, 30);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setBounds(250, 160, 100, 30);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        add(jLabel1);
        add(Period_Code);
        add(jLabel2);
        add(Period_name);
        add(jLabel3);
        add(Period_Description);
        add(okButton);
        add(cancelButton);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        Integer periodcode = Integer.parseInt(Period_Code.getText());
        System.out.println("Period Code = " + periodcode);
        String name = Period_name.getText();
        System.out.println("Period name = " + name);
        String description = Period_Description.getText();
        System.out.println("Period Description= " + description);

        StringBuilder sql
                = new StringBuilder("INSERT INTO \"Ref_Periods\" VALUES (");
        sql.append(periodcode);
        sql.append(",\'");
        sql.append(name);
        sql.append("\',\'");
        sql.append(description);
        sql.append("\')");

        System.out.println( sql.toString() );

        try {
            db.update( sql.toString() );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error inserting the period data.");
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String text = Period_Code.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduce the Period code");
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField Period_Code;
    private javax.swing.JTextField Period_name;
    private javax.swing.JTextField Period_Description;
    // End of variables declaration//GEN-END:variables
}