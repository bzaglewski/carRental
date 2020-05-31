package carRental;
import javax.swing.*;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pojazdy = new javax.swing.JButton();
        klienci = new javax.swing.JButton();
        wypozycz = new javax.swing.JButton();
        zwroc = new javax.swing.JButton();
        wypozyczone = new javax.swing.JButton();
        wyjscie = new javax.swing.JButton();
        logo1 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System zarządzania wypożyczalnią samochodów");

        pojazdy.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pojazdy.setText("Zarządzaj pojazdami");
        pojazdy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pojazdyActionPerformed(evt);
            }
        });

        klienci.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        klienci.setText("Zarządzaj klientami");
        klienci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klienciActionPerformed(evt);
            }
        });

        wypozycz.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        wypozycz.setText("Wypożycz pojazd");
        wypozycz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wypozyczActionPerformed(evt);
            }
        });

        zwroc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        zwroc.setText("Zwróć pojazd");
        zwroc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zwrocActionPerformed(evt);
            }
        });

        wypozyczone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        wypozyczone.setText("Zobacz wypożyczone pojazdy");
        wypozyczone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wypozyczoneActionPerformed(evt);
            }
        });

        wyjscie.setText("Wyjście");
        wyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyjscieActionPerformed(evt);
            }
        });

        logo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        logo1.setText("System zarządzania");

        logo2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        logo2.setText("wypożyczalnią samochodów");

        jLabel3.setText("Projekt zaliczeniowy przedmiotu Programowanie Obiektowe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pojazdy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zwroc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wypozycz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(klienci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wypozyczone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(wyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(pojazdy)
                .addGap(30, 30, 30)
                .addComponent(klienci)
                .addGap(33, 33, 33)
                .addComponent(wypozycz)
                .addGap(27, 27, 27)
                .addComponent(zwroc)
                .addGap(25, 25, 25)
                .addComponent(wypozyczone)
                .addGap(22, 22, 22)
                .addComponent(wyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pojazdyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pojazdyActionPerformed
           
    }//GEN-LAST:event_pojazdyActionPerformed

    private void wypozyczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wypozyczActionPerformed
       
    }//GEN-LAST:event_wypozyczActionPerformed

    private void wyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyjscieActionPerformed
          
    }//GEN-LAST:event_wyjscieActionPerformed

    private void klienciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klienciActionPerformed
           
    }//GEN-LAST:event_klienciActionPerformed

    private void zwrocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zwrocActionPerformed
            
    }//GEN-LAST:event_zwrocActionPerformed

    private void wypozyczoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wypozyczoneActionPerformed
            
    }//GEN-LAST:event_wypozyczoneActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton klienci;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JButton pojazdy;
    private javax.swing.JButton wyjscie;
    private javax.swing.JButton wypozycz;
    private javax.swing.JButton wypozyczone;
    private javax.swing.JButton zwroc;
    // End of variables declaration//GEN-END:variables
}
