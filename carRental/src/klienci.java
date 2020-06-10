
package carRental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class klienci extends javax.swing.JFrame {

     private Connection conn;
     private Statement stat;
     
    public klienci() {
        initComponents();
        odswiezanieTabeli();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imie = new javax.swing.JLabel();
        nazwisko = new javax.swing.JLabel();
        numerpesel = new javax.swing.JLabel();
        numertel = new javax.swing.JLabel();
        dodaj = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        usun = new javax.swing.JButton();
        wstecz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        klienciTabela = new javax.swing.JTable();
        txtNrpesel = new javax.swing.JTextField();
        txtNazwisko = new javax.swing.JTextField();
        txtImie = new javax.swing.JTextField();
        txtNrtel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zarządzaj klientami");

        imie.setText("Imie");

        nazwisko.setText("Nazwisko");

        numerpesel.setText("Numer pesel");

        numertel.setText("Numer telefonu");

        dodaj.setText("Dodaj");
        dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajActionPerformed(evt);
            }
        });

        jButton3.setText("Edytuj");
        jButton3.setPreferredSize(new java.awt.Dimension(61, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        usun.setText("Usuń");
        usun.setPreferredSize(new java.awt.Dimension(61, 25));
        usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunActionPerformed(evt);
            }
        });

        wstecz.setText("Wstecz");
        wstecz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wsteczActionPerformed(evt);
            }
        });

        klienciTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numer pesel", "Nazwisko", "Imie", "Nr telefonu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        klienciTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klienciTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(klienciTabela);

        txtNrpesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNrpeselActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numerpesel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imie, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numertel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNazwisko)
                            .addComponent(txtNrpesel)
                            .addComponent(txtImie)
                            .addComponent(txtNrtel, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 130, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wstecz)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numerpesel)
                            .addComponent(txtNrpesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nazwisko)
                            .addComponent(txtNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imie)
                            .addComponent(txtImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numertel)
                            .addComponent(txtNrtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addComponent(dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usun, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wstecz)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    public class kliencibaza {
  
      public static final String DRIVER = "org.sqlite.JDBC";
      public static final String DB_URL = "jdbc:sqlite:src/data/pojazdy.db";
  
      private Connection conn;
      private Statement stat;
  
      public kliencibaza() {
          try {
              Class.forName(kliencibaza.DRIVER);
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
           createTables();
      }
      
    public boolean createTables()  {
          String createklienci = "CREATE TABLE IF NOT EXISTS klienci (NrPesel VARCHAR PRIMARY KEY AUTOINCREMENT, Nazwisko varchar(255), Imie varchar(255), NrTel varchar(255))";
          
          try {
              stat.execute(createklienci);
              
          } catch (SQLException e) {
              System.err.println("Blad przy tworzeniu tabeli");
              e.printStackTrace();
              return false;
          }
          return true;
      }
    }
    
    public void odswiezanieTabeli(){
        int c;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement("select * from klienci");
            ResultSet Rs = prepStmt.executeQuery();
            
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)klienciTabela.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++){
                    v2.add(Rs.getString("NrPesel"));
                    v2.add(Rs.getString("Nazwisko"));
                    v2.add(Rs.getString("Imie"));
                    v2.add(Rs.getString("NrTel"));
                    
                }
                df.addRow(v2);
            }
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    private void txtNrpeselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNrpeselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNrpeselActionPerformed

    private void wsteczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wsteczActionPerformed
            this.toBack();
            setVisible(false);
            new Main().toFront();
            new Main().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_wsteczActionPerformed

    private void dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajActionPerformed
        // dodawanie nowego klienta do bazy
         String Nrpesel = txtNrpesel.getText();
         String Nazwisko = txtNazwisko.getText();
         String Imie = txtImie.getText();
         String Nrtel = txtNrtel.getText();
         
         
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement(
                      "INSERT INTO klienci VALUES ( ?, ?, ?, ?);");
              prepStmt.setString(1, Nrpesel);
              prepStmt.setString(2, Nazwisko);
              prepStmt.setString(3, Imie);
              prepStmt.setString(4, Nrtel);
              prepStmt.execute();
              JOptionPane.showMessageDialog(this, "Klient dodany do bazy");
              odswiezanieTabeli();
              
              txtNrpesel.setText("");
              txtNazwisko.setText("");
              txtImie.setText("");
              txtNrtel.setText("");
               
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_dodajActionPerformed

    private void usunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunActionPerformed
        // usuwanie klienta
        DefaultTableModel klikniecieMyszka = (DefaultTableModel)klienciTabela.getModel();
        int selectIndex = klienciTabela.getSelectedRow();
        
        String Nrpesel = klikniecieMyszka.getValueAt(selectIndex, 0).toString();
        
        txtNrpesel.setText(klikniecieMyszka.getValueAt(selectIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(this,"Czy jesteś pewny","Warining",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
                
                PreparedStatement prepStmt = conn.prepareStatement(
                      "DELETE FROM klienci WHERE nrPesel =?");
                prepStmt.setString(1, Nrpesel);
                prepStmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Pojazd usunięty z bazy");
                odswiezanieTabeli(); //odświeżenie tabeli po usunięciu pojazdu
                
                txtNrpesel.setText(""); //czyszczenie pola txtNrpesel
                txtNazwisko.setText(""); //czyszczenie pola txtNazwisko
                txtImie.setText(""); //czyszczenie pola txtImie
                txtNrtel.setText(""); //czyszczenie pola txtNrtel
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
            
        }
        
        
        
        
    }//GEN-LAST:event_usunActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // edycja pojazdu
        // NUMER VIN NIE JEST EDYTOWALNY
        
       
         
        DefaultTableModel klikniecieMyszka = (DefaultTableModel)klienciTabela.getModel();
        int selectIndex = klienciTabela.getSelectedRow();
        
        
        
        txtNrpesel.setText(klikniecieMyszka.getValueAt(selectIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(this,"Czy jesteś pewny?","Uwaga",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                String Nrpesel = klikniecieMyszka.getValueAt(selectIndex, 0).toString();
                String Nazwisko = txtNazwisko.getText();
                String Imie = txtImie.getText();
                String Nrtel = txtNrtel.getText();
                
                
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
                
                PreparedStatement prepStmt = conn.prepareStatement(
                      "UPDATE klienci SET Nazwisko=?, Imie=?, nrTel=? WHERE nrPesel = ?");
                prepStmt.setString(1, Nazwisko);
                prepStmt.setString(2, Imie);
                prepStmt.setString(3, Nrtel);
                prepStmt.setString(4, Nrpesel);
                prepStmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Dane klienta zaktualizowane");
                odswiezanieTabeli(); //odświeżenie tabeli po usunięciu pojazdu
                
                txtNrpesel.setText("");  //czyszczenie pola txtNrpesel
                txtNazwisko.setText(""); //czyszczenie pola txtNazwisko
                txtImie.setText("");     //czyszczenie pola txtImie
                txtNrtel.setText("");    //czyszczenie pola txtNrtel
                
               
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
            
        }
        
        
        
        
        
        
        
                                         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void klienciTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klienciTabelaMouseClicked
        
        //wypełnianie pól txt danymi z tabeli po kliknieciu na niego myszką
        
        DefaultTableModel klikniecieMyszka = (DefaultTableModel)klienciTabela.getModel();
        int selectIndex = klienciTabela.getSelectedRow();
        
        txtNrpesel.setText(klikniecieMyszka.getValueAt(selectIndex, 0).toString());
        txtNazwisko.setText(klikniecieMyszka.getValueAt(selectIndex, 1).toString());
        txtImie.setText(klikniecieMyszka.getValueAt(selectIndex, 2).toString());
        txtNrtel.setText(klikniecieMyszka.getValueAt(selectIndex, 2).toString());
    }//GEN-LAST:event_klienciTabelaMouseClicked

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
            java.util.logging.Logger.getLogger(klienci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(klienci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(klienci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(klienci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new klienci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dodaj;
    private javax.swing.JLabel imie;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable klienciTabela;
    private javax.swing.JLabel nazwisko;
    private javax.swing.JLabel numerpesel;
    private javax.swing.JLabel numertel;
    private javax.swing.JTextField txtImie;
    private javax.swing.JTextField txtNazwisko;
    private javax.swing.JTextField txtNrpesel;
    private javax.swing.JTextField txtNrtel;
    private javax.swing.JButton usun;
    private javax.swing.JButton wstecz;
    // End of variables declaration//GEN-END:variables
}
