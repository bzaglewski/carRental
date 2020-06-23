package carRental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class wypozycz extends javax.swing.JFrame {

    
     private Connection conn;
    private Statement stat;
   
    public wypozycz() {
        initComponents();
        wybierznrVin();
        wybierznrPesel();
    }
    
    //wybieranie numeru VIN pojazdu z tabeli pojazdy
    public void wybierznrVin()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement(       
                    "SELECT * FROM pojazdy WHERE NRvin NOT IN(SELECT NRvin FROM wypozyczone)");
            //pokażą się tylko pojazdy niewypożyczone
            ResultSet rs = prepStmt.executeQuery();
            selectnrVin.removeAllItems();
            while(rs.next())
            {
                selectnrVin.addItem(rs.getString(1));
            }
   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }                                         
    }
    // wybieranie numeru pesel klienta z tabeli klienci 
     public void wybierznrPesel()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement(
                     "SELECT * FROM klienci");
            //pokażą się wszystkie numery pesel - zakładamy że jedna osoba może wypożyczyć więcej niż jeden pojazd
            ResultSet rs = prepStmt.executeQuery();
            selectnrPesel.removeAllItems();
            while(rs.next())
            {
                selectnrPesel.addItem(rs.getString(1));
            }
    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }                                         
    }

        public void Klasa()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement(       
                    "SELECT Klasa FROM pojazdy where NRvin=? ");
            //pokażą się tylko pojazdy niewypożyczone
            ResultSet klasaRS = prepStmt.executeQuery();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }                                        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        wypozycz = new javax.swing.JButton();
        wstecz = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        selectnrVin = new javax.swing.JComboBox<>();
        selectnrPesel = new javax.swing.JComboBox<>();
        txtdataWypozyczenia = new com.toedter.calendar.JDateChooser();
        txtKlasa = new javax.swing.JTextField();
        txtNrrej = new javax.swing.JTextField();
        txtMarka = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNazwisko = new javax.swing.JTextField();
        txtImie = new javax.swing.JTextField();
        txtNrtel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wypożycz pojazd");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Wybierz pojazd");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Numer VIN");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Wybierz klienta");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Numer pesel");

        wypozycz.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        wypozycz.setText("Wypożycz");
        wypozycz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wypozyczActionPerformed(evt);
            }
        });

        wstecz.setText("Wstecz");
        wstecz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wsteczActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setText("Data wypożyczenia");

        selectnrVin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectnrVin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectnrVinActionPerformed(evt);
            }
        });

        selectnrPesel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectnrPesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectnrPeselActionPerformed(evt);
            }
        });

        txtKlasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKlasaActionPerformed(evt);
            }
        });

        jLabel2.setText("Numer rejestracyjny");

        jLabel7.setText("Marka");

        jLabel8.setText("Model");

        jLabel9.setText("Klasa");

        txtNazwisko.setText("jTextField1");

        jLabel10.setText("Nazwisko");

        jLabel11.setText("Imie");

        jLabel12.setText("Numer telefonu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNrrej, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectnrVin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdataWypozyczenia, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectnrPesel, 0, 169, Short.MAX_VALUE)
                                    .addComponent(txtNazwisko)
                                    .addComponent(txtImie)
                                    .addComponent(txtNrtel))
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(wstecz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(wypozycz, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectnrVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(selectnrPesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNrrej, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNrtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtdataWypozyczenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(wypozycz, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(wstecz)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void wsteczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wsteczActionPerformed
        this.toBack();
        setVisible(false);
        new Main().toFront();
        new Main().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_wsteczActionPerformed

    private void wypozyczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wypozyczActionPerformed
        // wypożyczenie pojazdu
                        
         String nrPesel = selectnrPesel.getSelectedItem().toString();
         String Nazwisko = txtNazwisko.getText();
         String Imie = txtImie.getText();
         String Nrtel = txtNrtel.getText();
        
         String numerVin = selectnrVin.getSelectedItem().toString();
         String nrrej = txtNrrej.getText();
         String marka = txtMarka.getText();
         String model = txtModel.getText();
         String klasa = txtKlasa.getText();
         SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
         String data = Date_Format.format(txtdataWypozyczenia.getDate());
   
         try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement(
                      "INSERT INTO wypozyczone VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
              prepStmt.setString(1, numerVin); 
              prepStmt.setString(2, nrrej); 
              prepStmt.setString(3, marka); 
              prepStmt.setString(4, model); 
              prepStmt.setString(5, klasa); 
    
              prepStmt.setString(6, nrPesel); 
              prepStmt.setString(7, Nazwisko); 
              prepStmt.setString(8, Imie); 
              prepStmt.setString(9, Nrtel); 
             
              prepStmt.setString(10, data);
              prepStmt.execute();
              JOptionPane.showMessageDialog(this, "Pojazd wypożyczony");
              selectnrVin.setSelectedItem(-1);
                         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }                                                   
    }//GEN-LAST:event_wypozyczActionPerformed

    private void selectnrVinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectnrVinActionPerformed
       // automatyczne wypełnianie pól nr rejestracyjny, marka, model, klasa po wybraniu nr vin
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement(
                     "SELECT * FROM pojazdy WHERE NRvin = ?");
            prepStmt.setString(1, (String)selectnrVin.getSelectedItem());
            //pokażą się wszystkie numery pesel - zakładamy że jedna osoba może wypożyczyć więcej niż jeden pojazd
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()){
                txtNrrej.setText(rs.getString(2));
                txtMarka.setText(rs.getString(3));
                txtModel.setText(rs.getString(4));
                txtKlasa.setText(rs.getString(5));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }                                        
    
    }//GEN-LAST:event_selectnrVinActionPerformed

    private void txtKlasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKlasaActionPerformed
        
    }//GEN-LAST:event_txtKlasaActionPerformed

    private void selectnrPeselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectnrPeselActionPerformed
         try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement(
                     "SELECT * FROM klienci WHERE nrPesel = ?");
            prepStmt.setString(1, (String)selectnrPesel.getSelectedItem());
            //pokażą się wszystkie numery pesel - zakładamy że jedna osoba może wypożyczyć więcej niż jeden pojazd
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()){
                txtNazwisko.setText(rs.getString(2));
                txtImie.setText(rs.getString(3));
                txtNrtel.setText(rs.getString(4));
               
            }  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
        }                                        
    }//GEN-LAST:event_selectnrPeselActionPerformed

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
            java.util.logging.Logger.getLogger(wypozycz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wypozycz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wypozycz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wypozycz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wypozycz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> selectnrPesel;
    private javax.swing.JComboBox<String> selectnrVin;
    private javax.swing.JTextField txtImie;
    private javax.swing.JTextField txtKlasa;
    private javax.swing.JTextField txtMarka;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNazwisko;
    private javax.swing.JTextField txtNrrej;
    private javax.swing.JTextField txtNrtel;
    private com.toedter.calendar.JDateChooser txtdataWypozyczenia;
    private javax.swing.JButton wstecz;
    private javax.swing.JButton wypozycz;
    // End of variables declaration//GEN-END:variables
}
