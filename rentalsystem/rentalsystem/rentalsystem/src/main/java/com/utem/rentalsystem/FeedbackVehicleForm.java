/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utem.rentalsystem;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class FeedbackVehicleForm extends javax.swing.JFrame 
{
    private FeedbackVehicleManager manager = new FeedbackVehicleManager();
    private FeedbackVehicle f;

    /**
     * Creates new form customerFeedbackForm
     */
    public FeedbackVehicleForm() 
    {
        initComponents();
    }
    
    private void clearForm()
    {
        messageTxt.setText("");
        improvementTxt.setText("");
    }
    
    private boolean isEmptyField()
    { 
        if (messageTxt.getText().isEmpty() || improvementTxt.getText().isEmpty())
        {
            return true;
        }
        else
        {
            return false;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        improvementTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        messageTxt = new javax.swing.JTextField();
        bookTypeComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        rentalComboBox = new javax.swing.JComboBox<>();
        satisfyComboBox = new javax.swing.JComboBox<>();
        problemComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(176, 133, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Suggestion of improvement");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 331, -1, -1));

        improvementTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                improvementTxtKeyPressed(evt);
            }
        });
        jPanel1.add(improvementTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 356, 520, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feedbackPage.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 54));

        submitBtn.setBackground(new java.awt.Color(0, 51, 204));
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.setBorder(null);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 394, 250, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicle Feedback Page");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 270, -1));

        clearBtn.setBackground(new java.awt.Color(255, 51, 51));
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Reset");
        clearBtn.setBorder(null);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 390, 240, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("We'd love some feedback from you to improve our system");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("What vehicle did you book ?             Overall vehicle satisfaction");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 142, 530, -1));

        messageTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                messageTxtKeyPressed(evt);
            }
        });
        jPanel1.add(messageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 293, 520, -1));

        bookTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Motorcycle", "Both" }));
        bookTypeComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookTypeComboBoxKeyPressed(evt);
            }
        });
        jPanel1.add(bookTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setText("Is this your first rental with us?       Any problem using our vehicle?");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 205, 540, -1));

        rentalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Not Sure" }));
        rentalComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rentalComboBoxKeyPressed(evt);
            }
        });
        jPanel1.add(rentalComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, -1));

        satisfyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Very Satisfied", "Satisfied", "Not Satisfied" }));
        satisfyComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                satisfyComboBoxKeyPressed(evt);
            }
        });
        jPanel1.add(satisfyComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 220, -1));

        problemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        problemComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                problemComboBoxKeyPressed(evt);
            }
        });
        jPanel1.add(problemComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 220, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("Message");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 268, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 570, 460));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car4.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 470));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if(!isEmptyField())
        {
            f = new FeedbackVehicle();
            
            f.setVehicleType((String)bookTypeComboBox.getSelectedItem());
            f.setSatisfaction((String)satisfyComboBox.getSelectedItem());
            f.setRental((String)rentalComboBox.getSelectedItem());
            f.setProblem((String)problemComboBox.getSelectedItem());
            f.setMessage(messageTxt.getText().trim());
            f.setImprovement(improvementTxt.getText().trim());
            
            manager.insertData(f);
            
            JOptionPane.showMessageDialog(null, "Your feedback has been saved!");
            clearForm();
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Complete the form!");
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void bookTypeComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookTypeComboBoxKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        satisfyComboBox.requestFocus();
    }//GEN-LAST:event_bookTypeComboBoxKeyPressed

    private void satisfyComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_satisfyComboBoxKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        rentalComboBox.requestFocus();
    }//GEN-LAST:event_satisfyComboBoxKeyPressed

    private void rentalComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rentalComboBoxKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        problemComboBox.requestFocus();
    }//GEN-LAST:event_rentalComboBoxKeyPressed

    private void problemComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_problemComboBoxKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        messageTxt.requestFocus();
    }//GEN-LAST:event_problemComboBoxKeyPressed

    private void messageTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageTxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        improvementTxt.requestFocus();
    }//GEN-LAST:event_messageTxtKeyPressed

    private void improvementTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_improvementTxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        submitBtn.requestFocus();
    }//GEN-LAST:event_improvementTxtKeyPressed

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
            java.util.logging.Logger.getLogger(FeedbackVehicleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackVehicleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackVehicleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackVehicleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackVehicleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bookTypeComboBox;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField improvementTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JComboBox<String> problemComboBox;
    private javax.swing.JComboBox<String> rentalComboBox;
    private javax.swing.JComboBox<String> satisfyComboBox;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}