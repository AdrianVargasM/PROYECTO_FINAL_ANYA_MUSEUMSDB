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
import javax.print.attribute.standard.MediaSize;
import javax.swing.*;

public class InsertMembers extends javax.swing.JDialog {
    /**
     * Creates new form InsertAuthorDialog
     */
    private final HashMap ht;
    private final Database db;

    public InsertMembers(java.awt.Frame parent, Database db) {
        super(parent, true);
        initComponents();
        this.db = db;
        this.setSize(450,530);
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
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        Member_ID = new JTextField();
        Name = new JTextField();
        Contact_details = new JTextField();
        Date_Joined = new JTextField();
        Date_Membership_Lapsed = new JTextField();
        Date_Membership_Due = new JTextField();
        Date_Last_Visit = new JTextField();
        Date_Last_Contact = new JTextField();
        Other_Details = new JTextField();
        Museum_ID = new JTextField();
        okButton = new JButton();
        cancelButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Members");
        setResizable(false);

        jLabel1.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Member ID:");
        jLabel1.setBounds(40,40,160,30);

        jLabel2.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name:");
        jLabel2.setBounds(40,80,160,30);

        jLabel3.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact details:");
        jLabel3.setBounds(40,120,160,30);

        jLabel4.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date joined:");
        jLabel4.setBounds(40,160,160,30);

        jLabel5.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date membership lapsed:");
        jLabel5.setBounds(40,200,160,30);

        jLabel6.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date membership is due:");
        jLabel6.setBounds(40,240,160,30);

        jLabel7.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date of last visit:");
        jLabel7.setBounds(40,280,160,30);

        jLabel8.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Date of last contact:");
        jLabel8.setBounds(40,320,160,30);

        jLabel9.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Other details:");
        jLabel9.setBounds(40,360,160,30);

        jLabel10.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Museum_ID:");
        jLabel10.setBounds(40,400,160,30);

        //txtId.setColumns(42);
        Member_ID.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Member_ID.setBounds(200,40,200,30);
        Member_ID.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        //listed_building_yn.setColumns(11);
        Name.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Name.setBounds(200,80,200,30);
        //shop_yn.setColumns(11);
        Contact_details.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Contact_details.setBounds(200,120,200,30);
        //smoking_yn.setColumns(11);
        Date_Joined.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Date_Joined.setBounds(200,160,200,30);
        //admission_charge.setColumns(11);
        Date_Membership_Lapsed.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Date_Membership_Lapsed.setBounds(200,200,200,30);

        Date_Membership_Due.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Date_Membership_Due.setBounds(200,240,200,30);

        Date_Last_Visit.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Date_Last_Visit.setBounds(200,280,200,30);

        Date_Last_Contact.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Date_Last_Contact.setBounds(200,320,200,30);

        Other_Details.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Other_Details.setBounds(200,360,200,30);

        Museum_ID.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        Museum_ID.setBounds(200,400,200,30);

        okButton.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        okButton.setText("Add");
        okButton.setBounds(120, 440, 100, 30);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setBounds(250, 440, 100, 30);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        add(jLabel1);
        add(Member_ID);
        add(jLabel2);
        add(Name);
        add(jLabel3);
        add(Contact_details);
        add(jLabel4);
        add(Date_Joined);
        add(jLabel5);
        add(Date_Membership_Lapsed);
        add(jLabel6);
        add(Date_Membership_Due);
        add(jLabel7);
        add(Date_Last_Visit);
        add(jLabel8);
        add(Date_Last_Contact);
        add(jLabel9);
        add(Other_Details);
        add(jLabel10);
        add(Museum_ID);
        add(okButton);
        add(cancelButton);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        Integer memberid = Integer.parseInt(Member_ID.getText());
        System.out.println("Member ID = " + memberid);
        String nametxt = Name.getText();
        System.out.println("Name = " + nametxt);
        String contact = Contact_details.getText();
        System.out.println("Contact details= " + contact);
        String joined = Date_Joined.getText();
        System.out.println("Date joined = " + joined);
        String mem_lapsed = Date_Membership_Lapsed.getText();
        System.out.println("Date membership lapsed = " + mem_lapsed);
        String mem_due = Date_Membership_Due.getText();
        System.out.println("Date membership due = " + mem_due);
        String last_visit = Date_Last_Visit.getText();
        System.out.println("Date of last visit = " + last_visit);
        String last_contact = Date_Last_Contact.getText();
        System.out.println("Date of last contact = " + last_contact);
        String other = Other_Details.getText();
        System.out.println("Other details = " + other);
        String museum_idText = Museum_ID.getText();
        System.out.println("Museum ID = " + museum_idText);


        StringBuilder sql
                = new StringBuilder("INSERT INTO \"Members\" VALUES (");
        sql.append(memberid);
        sql.append(",\'");
        sql.append(nametxt);
        sql.append("\',\'");
        sql.append(contact);
        sql.append("\',\'");
        sql.append(joined);
        sql.append("\',\'");
        sql.append(mem_lapsed);
        sql.append("\',\'");
        sql.append(mem_due);
        sql.append("\',\'");
        sql.append(last_visit);
        sql.append("\',\'");
        sql.append(last_visit);
        sql.append("\',\'");
        sql.append(other);
        sql.append("\',");
        sql.append(museum_idText);
        sql.append(")");

        System.out.println( sql.toString() );

        try {
            db.update( sql.toString() );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error inserting the address data.");
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String text = Member_ID.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduce the Member ID");
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField Member_ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Contact_details;
    private javax.swing.JTextField Date_Joined;
    private javax.swing.JTextField Date_Membership_Lapsed;
    private javax.swing.JTextField Date_Membership_Due;
    private javax.swing.JTextField Date_Last_Visit;
    private javax.swing.JTextField Date_Last_Contact;
    private javax.swing.JTextField Other_Details;
    private javax.swing.JTextField Museum_ID;
    // End of variables declaration//GEN-END:variables
}