package carRental;

import static carRental.Pojazdy.pojazdybaza.DB_URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Pojazdy extends javax.swing.JFrame {

    private Connection conn;
    private Statement stat;

    
public Pojazdy() {
        initComponents();
        odswiezanieTabeli();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nrRej = new javax.swing.JLabel();
        marka = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        numerVin = new javax.swing.JLabel();
        txtnumerVin = new javax.swing.JTextField();
        txtnrRej = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        txtmarka = new javax.swing.JTextField();
        dodaj = new javax.swing.JButton();
        edytuj = new javax.swing.JButton();
        wstecz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        samochodyTabela = new javax.swing.JTable();
        klasa = new javax.swing.JLabel();
        chooseKlasa = new javax.swing.JComboBox<>();
        usun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zarządzaj pojazdami");
        setBackground(new java.awt.Color(0, 204, 0));

        nrRej.setText("Numer rejestracyjny");

        marka.setText("Marka");

        model.setText("Model");

        numerVin.setText("Numer VIN");

        txtnumerVin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerVinActionPerformed(evt);
            }
        });

        txtmarka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarkaActionPerformed(evt);
            }
        });

        dodaj.setText("Dodaj");
        dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajActionPerformed(evt);
            }
        });

        edytuj.setText("Edytuj");
        edytuj.setPreferredSize(new java.awt.Dimension(61, 25));
        edytuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edytujActionPerformed(evt);
            }
        });

        wstecz.setText("Wstecz");
        wstecz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wsteczActionPerformed(evt);
            }
        });

        samochodyTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numer VIN", "Nr rejestracyjny", "Marka", "Model", "Klasa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        samochodyTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                samochodyTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(samochodyTabela);
        if (samochodyTabela.getColumnModel().getColumnCount() > 0) {
            samochodyTabela.getColumnModel().getColumn(0).setResizable(false);
            samochodyTabela.getColumnModel().getColumn(0).setPreferredWidth(120);
        }

        klasa.setText("Klasa");

        chooseKlasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ekonomiczna", "Standard", "Premium" }));
        chooseKlasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseKlasaActionPerformed(evt);
            }
        });

        usun.setText("Usuń");
        usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nrRej, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numerVin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnumerVin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtnrRej, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(txtmarka, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(klasa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chooseKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(208, 208, 208))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wstecz)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(175, 175, 175)
                            .addComponent(edytuj, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usun, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerVin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumerVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrRej, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnrRej, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klasa)
                    .addComponent(chooseKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edytuj, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usun, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wstecz)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    public class pojazdybaza {
  
      public static final String DRIVER = "org.sqlite.JDBC";
      public static final String DB_URL = "jdbc:sqlite:src/data/pojazdy.db";
  
      private Connection conn;
      private Statement stat;
  
    public pojazdybaza() {
          try {
              Class.forName(pojazdybaza.DRIVER);
          } catch (ClassNotFoundException e) {
              System.err.println("Brak sterownika JDBC");
              e.printStackTrace();
          }
  
          try {
              conn = DriverManager.getConnection(DB_URL);
              stat = conn.createStatement();
          } catch (SQLException e) {
              System.err.println("Problem z otwarciem polaczenia");
              e.printStackTrace();
          }
      }
    }
  
      
    public void odswiezanieTabeli(){
        int c;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement("select * from pojazdy");
            ResultSet Rs = prepStmt.executeQuery();
            
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)samochodyTabela.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++){
                    v2.add(Rs.getString("NRvin"));
                    v2.add(Rs.getString("NRRej"));
                    v2.add(Rs.getString("Marka"));
                    v2.add(Rs.getString("Model"));
                    v2.add(Rs.getString("Klasa"));
                }
                df.addRow(v2);
            }
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
   
    private void wsteczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wsteczActionPerformed
            this.toBack();
            setVisible(false);
            new Main().toFront();
            new Main().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_wsteczActionPerformed

    private void txtmarkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarkaActionPerformed
        
    }//GEN-LAST:event_txtmarkaActionPerformed

    private void chooseKlasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseKlasaActionPerformed
        
    }//GEN-LAST:event_chooseKlasaActionPerformed

    private void txtnumerVinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerVinActionPerformed
        
    }//GEN-LAST:event_txtnumerVinActionPerformed

    private void dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajActionPerformed
        // dodawania pojazdu do bazy danych
                
         String numervin = txtnumerVin.getText();
         String nrrej = txtnrRej.getText();
         String Marka = txtmarka.getText();
         String Model = txtmodel.getText();
         String Klasa = chooseKlasa.getSelectedItem().toString();
         
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement(
                      "INSERT INTO pojazdy VALUES (?, ?, ?, ?, ?);");
              prepStmt.setString(1, numervin); 
              prepStmt.setString(2, nrrej); 
              prepStmt.setString(3, Marka); 
              prepStmt.setString(4, Model); 
              prepStmt.setString(5, Klasa); 
              prepStmt.execute();
              JOptionPane.showMessageDialog(this, "Pojazd dodany do bazy");
              odswiezanieTabeli(); //odświeżenie tabeli po dodaniu pojazdu
              
              txtnumerVin.setText(""); //czyszczenie pola txtnumerVin
              txtnrRej.setText(""); //czyszczenie pola txtnrRej
              txtmarka.setText(""); //czyszczenie pola txtmarka
              txtmodel.setText(""); //czyszczenie pola txtmodel
              chooseKlasa.setSelectedItem(-1); //czyszczenie pola chooseKlasa
             
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }                                               
    }//GEN-LAST:event_dodajActionPerformed

    private void samochodyTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samochodyTabelaMouseClicked
        //wpisywanie danych do pól tekstowych po dwukrotnym kliknięciu myszką
        
        DefaultTableModel klikniecieMyszka = (DefaultTableModel)samochodyTabela.getModel();
        int selectIndex = samochodyTabela.getSelectedRow();
        
        txtnumerVin.setText(klikniecieMyszka.getValueAt(selectIndex, 0).toString());
        txtnrRej.setText(klikniecieMyszka.getValueAt(selectIndex, 1).toString());
        txtmarka.setText(klikniecieMyszka.getValueAt(selectIndex, 2).toString());
        txtmodel.setText(klikniecieMyszka.getValueAt(selectIndex, 3).toString());
        chooseKlasa.setSelectedItem(klikniecieMyszka.getValueAt(selectIndex, 4).toString());
    }//GEN-LAST:event_samochodyTabelaMouseClicked

    private void usunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunActionPerformed
      // usuwanie pojazdu z bazy danych
        DefaultTableModel klikniecieMyszka = (DefaultTableModel)samochodyTabela.getModel();
        int selectIndex = samochodyTabela.getSelectedRow();

        String numervin = klikniecieMyszka.getValueAt(selectIndex, 0).toString();
        
        txtnumerVin.setText(klikniecieMyszka.getValueAt(selectIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(this,"Czy jesteś pewny?","Uwaga",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
                
                PreparedStatement prepStmt = conn.prepareStatement(
                      "DELETE FROM Pojazdy WHERE NRvin =?");
                prepStmt.setString(1, numervin);
                prepStmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Pojazd usunięty z bazy");
                odswiezanieTabeli(); //odświeżenie tabeli po usunięciu pojazdu
                
                txtnumerVin.setText(""); //czyszczenie pola txtnumerVin
                txtnrRej.setText(""); //czyszczenie pola txtnrRej
                txtmarka.setText(""); //czyszczenie pola txtmarka
                txtmodel.setText(""); //czyszczenie pola txtmodel
                chooseKlasa.setSelectedItem(-1); //czyszczenie pola chooseKlasa
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
            }
   
        }
  
    }//GEN-LAST:event_usunActionPerformed

    private void edytujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edytujActionPerformed
        // edycja pojazdu
        // NUMER VIN NIE JEST EDYTOWALNY
        DefaultTableModel klikniecieMyszka = (DefaultTableModel)samochodyTabela.getModel();
        int selectIndex = samochodyTabela.getSelectedRow();

        txtnumerVin.setText(klikniecieMyszka.getValueAt(selectIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(this,"Czy jesteś pewny?","Uwaga",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                String numervin = klikniecieMyszka.getValueAt(selectIndex, 0).toString();
                String nrrej = txtnrRej.getText();
                String Marka = txtmarka.getText();
                String Model = txtmodel.getText();
                String Klasa = chooseKlasa.getSelectedItem().toString();
                
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
                
                PreparedStatement prepStmt = conn.prepareStatement(
                      "UPDATE pojazdy SET NRrej=?, Marka=?, Model=?, Klasa=? WHERE NRvin = ?");
                prepStmt.setString(1, nrrej);
                prepStmt.setString(2, Marka);
                prepStmt.setString(3, Model);
                prepStmt.setString(4, Klasa);
                prepStmt.setString(5, numervin);
                prepStmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Pojazd zaktualizowany");
                odswiezanieTabeli(); //odświeżenie tabeli po usunięciu pojazdu
                
                txtnumerVin.setText(""); //czyszczenie pola txtnumerVin
                txtnrRej.setText(""); //czyszczenie pola txtnrRej
                txtmarka.setText(""); //czyszczenie pola txtmarka
                txtmodel.setText(""); //czyszczenie pola txtmodel
                chooseKlasa.setSelectedItem(-1); //czyszczenie pola chooseKlasa
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }
   
    }//GEN-LAST:event_edytujActionPerformed


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
            java.util.logging.Logger.getLogger(Pojazdy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pojazdy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pojazdy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pojazdy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pojazdy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseKlasa;
    private javax.swing.JButton dodaj;
    private javax.swing.JButton edytuj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel klasa;
    private javax.swing.JLabel marka;
    private javax.swing.JLabel model;
    private javax.swing.JLabel nrRej;
    private javax.swing.JLabel numerVin;
    private javax.swing.JTable samochodyTabela;
    private javax.swing.JTextField txtmarka;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtnrRej;
    private javax.swing.JTextField txtnumerVin;
    private javax.swing.JButton usun;
    private javax.swing.JButton wstecz;
    // End of variables declaration//GEN-END:variables
}
