/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vending;

import javax.swing.JOptionPane;
import sun.misc.FloatingDecimal;

/**
 *
 * @author kadriye
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        purchase = new javax.swing.JButton();
        cansel = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MoneyTF = new javax.swing.JTextField();
        changeTF = new javax.swing.JTextField();
        itemsJP = new javax.swing.JPanel();
        colaRB = new javax.swing.JRadioButton();
        sodaRB = new javax.swing.JRadioButton();
        fantaRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Otomat Makinesi");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("Otomat Programı");

        purchase.setText("Para Ekle");
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });

        cansel.setText("İptal");
        cansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canselActionPerformed(evt);
            }
        });

        clear.setText("Vazgeç");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel2.setText("Eklenen Paranız :");

        jLabel3.setText("          Bakiyeniz :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        MoneyTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyTFActionPerformed(evt);
            }
        });

        changeTF.setEditable(false);
        changeTF.setText("0.0");
        changeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTFActionPerformed(evt);
            }
        });

        itemsJP.setBorder(javax.swing.BorderFactory.createTitledBorder("Bir ürün seçiniz"));

        buttonGroup1.add(colaRB);
        colaRB.setText("Kola  15 TL");
        colaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(sodaRB);
        sodaRB.setText("Gazoz 30 TL");
        sodaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodaRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(fantaRB);
        fantaRB.setText("Fanta 20 TL");
        fantaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantaRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemsJPLayout = new javax.swing.GroupLayout(itemsJP);
        itemsJP.setLayout(itemsJPLayout);
        itemsJPLayout.setHorizontalGroup(
            itemsJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colaRB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fantaRB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sodaRB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        itemsJPLayout.setVerticalGroup(
            itemsJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsJPLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(colaRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fantaRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sodaRB)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cansel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemsJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MoneyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(MoneyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(changeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(itemsJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(cansel)
                    .addComponent(purchase))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canselActionPerformed
        //cansel selections

        System.exit(0);
    }//GEN-LAST:event_canselActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        //clears all selections and textFields

        MoneyTF.setText("0.0");
        changeTF.setText("0.0");


    }//GEN-LAST:event_clearActionPerformed
    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        // this pays for our purchase if we have enougf money
       double money= Double.parseDouble(MoneyTF.getText());
  
     double bakiye=Double.parseDouble(changeTF.getText());
      System.out.println("bakiye: "+bakiye);
      System.out.println("money: "+money);
        if (Double.parseDouble(MoneyTF.getText()) == 0.50
                || Double.parseDouble(MoneyTF.getText()) == 1.0
                || Double.parseDouble(MoneyTF.getText()) == 5.0
                || Double.parseDouble(MoneyTF.getText()) == 10.0
                 ||Double.parseDouble(MoneyTF.getText()) == 0.0) {
            // money = Double.parseDouble(MoneyTF.getText()) + Double.parseDouble(changeTF.getText());
            money = Double.parseDouble(MoneyTF.getText());
            bakiye+=money;
           

           
            changeTF.setText(Double.toString(bakiye));
           MoneyTF.setText("0.0");
             

        } else {
            JOptionPane.showMessageDialog(rootPane, "Paranız iade ediliyor..Sadece 50 kuruş, 1 TL, 5 TL, 10 TL olarak para atınız!. ");
            changeTF.setText(Double.toString(money));
            changeTF.setText(changeTF.getText());
        }

        if (colaRB.isSelected()) {
            
            bakiye = bakiye - 15;
            
            
        } else if (fantaRB.isSelected()) {
             
            bakiye = bakiye - 20;
        } else if (sodaRB.isSelected()) {
            
            bakiye = bakiye - 30;
        }
        if (bakiye <0 ) {
            JOptionPane.showMessageDialog(rootPane, "Yeterli bakiyeniz bulunmamaktadır.");
        } else {
            changeTF.setText(Double.toString(bakiye));
            
        }
        
    }//GEN-LAST:event_purchaseActionPerformed

    private void colaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaRBActionPerformed
        if (Double.parseDouble(changeTF.getText())>=15) {
            JOptionPane.showMessageDialog(rootPane, "Kola ürünü verildi..");
            changeTF.setText(Double.toString(Double.parseDouble(changeTF.getText())- 15));
           
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Yeterli bakiyeniz bulunmamaktadır..");


    }//GEN-LAST:event_colaRBActionPerformed

    private void sodaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodaRBActionPerformed
        if (Double.parseDouble(changeTF.getText())>=30) {
            JOptionPane.showMessageDialog(rootPane, "Kola ürünü verildi..");
            changeTF.setText(Double.toString(Double.parseDouble(changeTF.getText())- 30));
            colaRB.setSelected(false);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Yeterli bakiyeniz bulunmamaktadır..");

    }//GEN-LAST:event_sodaRBActionPerformed

    private void fantaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantaRBActionPerformed
       if (Double.parseDouble(changeTF.getText())>=20) {
            JOptionPane.showMessageDialog(rootPane, "Fanta ürünü verildi..");
            changeTF.setText(Double.toString(Double.parseDouble(changeTF.getText())- 20));
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Yeterli bakiyeniz bulunmamaktadır..");

    }//GEN-LAST:event_fantaRBActionPerformed

    private void MoneyTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoneyTFActionPerformed

    private void changeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTFActionPerformed
    }//GEN-LAST:event_changeTFActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoneyTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cansel;
    private javax.swing.JTextField changeTF;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton colaRB;
    private javax.swing.JRadioButton fantaRB;
    private javax.swing.JPanel itemsJP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton purchase;
    private javax.swing.JRadioButton sodaRB;
    // End of variables declaration//GEN-END:variables
}