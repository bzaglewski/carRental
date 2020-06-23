package carRental;

import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class zwroc extends javax.swing.JFrame {

    private Connection conn;
    private Statement stat;
    
    public zwroc() {
        initComponents();
        odswiezanieTabeli();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numerVin = new javax.swing.JLabel();
        pokazRachunek = new javax.swing.JButton();
        zwroc = new javax.swing.JButton();
        wstecz = new javax.swing.JButton();
        DataZwrotu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wypozyczoneTabela = new javax.swing.JTable();
        txtNRvin = new javax.swing.JTextField();
        txtNRpesel = new javax.swing.JTextField();
        txtdataWypozyczenia = new javax.swing.JTextField();
        numerPesel = new javax.swing.JLabel();
        DataWypozyczenia = new javax.swing.JLabel();
        txtdataZwrotu = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtKlasa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNrrej = new javax.swing.JTextField();
        txtMarka = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        numerrej = new javax.swing.JLabel();
        marka = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNazwisko = new javax.swing.JTextField();
        txtImie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Zwróć pojazd");

        numerVin.setText("Numer VIN");

        pokazRachunek.setText("Pobierz rachunek");
        pokazRachunek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazRachunekActionPerformed(evt);
            }
        });

        zwroc.setText("Zwróć");
        zwroc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zwrocActionPerformed(evt);
            }
        });

        wstecz.setText("Wstecz");
        wstecz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wsteczActionPerformed(evt);
            }
        });

        DataZwrotu.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        DataZwrotu.setText("Wprowadź datę zwrotu");

        wypozyczoneTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numer VIN", "Numer rej", "Marka", "Model", "Klasa", "Numer Pesel", "Nazwisko", "Imie", "Data wypożyczenia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        wypozyczoneTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wypozyczoneTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(wypozyczoneTabela);
        if (wypozyczoneTabela.getColumnModel().getColumnCount() > 0) {
            wypozyczoneTabela.getColumnModel().getColumn(0).setPreferredWidth(120);
            wypozyczoneTabela.getColumnModel().getColumn(1).setMaxWidth(80);
            wypozyczoneTabela.getColumnModel().getColumn(3).setMaxWidth(80);
            wypozyczoneTabela.getColumnModel().getColumn(4).setMaxWidth(80);
            wypozyczoneTabela.getColumnModel().getColumn(7).setMaxWidth(80);
        }

        numerPesel.setText("Numer Pesel");

        DataWypozyczenia.setText("Data wypożyczenia");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setText("Pojazdy aktualnie wypożyczone:");

        jLabel2.setText("Klasa");

        numerrej.setText("Numer rejestracyjny");

        marka.setText("Marka");

        model.setText("Model");

        jLabel3.setText("Nazwisko");

        jLabel4.setText("Imie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(DataZwrotu, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdataZwrotu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numerVin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(numerrej)
                                            .addComponent(marka)
                                            .addComponent(model)
                                            .addComponent(jLabel6)
                                            .addComponent(numerPesel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(DataWypozyczenia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdataWypozyczenia, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtImie)
                                        .addComponent(txtNRvin)
                                        .addComponent(txtNrrej)
                                        .addComponent(txtMarka)
                                        .addComponent(txtModel)
                                        .addComponent(txtKlasa)
                                        .addComponent(txtNRpesel, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(txtNazwisko)))
                                .addGap(0, 15, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zwroc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pokazRachunek, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(736, 736, 736)
                        .addComponent(wstecz))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(wstecz)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerVin)
                    .addComponent(txtNRvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNrrej, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numerrej))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerPesel)
                    .addComponent(txtNRpesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataWypozyczenia)
                    .addComponent(txtdataWypozyczenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdataZwrotu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataZwrotu))
                .addGap(18, 18, 18)
                .addComponent(pokazRachunek, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zwroc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
   
    public void odswiezanieTabeli(){
        int c;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
            PreparedStatement prepStmt = conn.prepareStatement("select * from wypozyczone");
            ResultSet Rs = prepStmt.executeQuery();
            
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)wypozyczoneTabela.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++){
                    v2.add(Rs.getString("NRvin"));
                    v2.add(Rs.getString("NRrej"));
                    v2.add(Rs.getString("Marka"));
                    v2.add(Rs.getString("Model"));
                    v2.add(Rs.getString("Klasa"));
                    v2.add(Rs.getString("nrPesel"));
                    v2.add(Rs.getString("Nazwisko"));
                    v2.add(Rs.getString("Imie"));
                   
                    v2.add(Rs.getString("data"));
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
        // przycisk wstecz
        this.toBack();
        setVisible(false);
        new Main().toFront();
        new Main().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_wsteczActionPerformed

    private void zwrocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zwrocActionPerformed
        //dodanie pojazdu do tabeli historia
        
            String nrvin = txtNRvin.getText();
            String nrrej = txtNrrej.getText();
            String Marka = txtMarka.getText();
            String Model = txtModel.getText();
            String Klasa = txtKlasa.getText();
            String nrpesel = txtNRpesel.getText();
            String Nazwisko = txtNazwisko.getText();
            String Imie = txtImie.getText();
            String dataWypozyczenia = txtdataWypozyczenia.getText();
            SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
            String dataZwrotu = Date_Format.format(txtdataZwrotu.getDate());
            
               
            try {
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
                PreparedStatement prepStmt = conn.prepareStatement(
                      "INSERT INTO historia VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
                prepStmt.setString(1, nrvin); 
                prepStmt.setString(2, nrrej); 
                prepStmt.setString(3, Marka); 
                prepStmt.setString(4, Model); 
                prepStmt.setString(5, Klasa); 
                prepStmt.setString(6, nrpesel);
                prepStmt.setString(7, Nazwisko); 
                prepStmt.setString(8, Imie); 
                prepStmt.setString(9, dataWypozyczenia); 
                prepStmt.setString(10, dataZwrotu); 
                prepStmt.execute();
               
        
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
            }  
         
        
        //usunięcie pojazdu z tabeli wypozyczone
        int reply = JOptionPane.showConfirmDialog(null, "Czy pobrałeś rachunek?", "Pobrałeś rachunek?",  JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION)
            {
                DefaultTableModel klikniecieMyszka = (DefaultTableModel)wypozyczoneTabela.getModel();
                int selectIndex = wypozyczoneTabela.getSelectedRow();
        
                String numervin = klikniecieMyszka.getValueAt(selectIndex, 0).toString();
         
                try {
                    Class.forName("org.sqlite.JDBC");
                    conn = DriverManager.getConnection("jdbc:sqlite:src/data/pojazdy.db");
                    PreparedStatement prepStmt = conn.prepareStatement(
                      "DELETE FROM wypozyczone WHERE NRvin =?");
                    prepStmt.setString(1, numervin); 
               
                    prepStmt.execute();
                    JOptionPane.showMessageDialog(this,"Pojazd zwrócony");
                    odswiezanieTabeli();
              
            
                    txtNRvin.setText(""); //czyszczenie pola selectnrVin
                    txtNrrej.setText("");
                    txtMarka.setText("");
                    txtModel.setText("");
                    txtKlasa.setText("");
                    txtNRpesel.setText("");
                    txtNazwisko.setText("");
                    txtImie.setText("");
                    txtdataWypozyczenia.setText("");
             
            
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                Logger.getLogger(Pojazdy.class.getName()).log(Level.SEVERE, null, ex);
                }                                                                                             
            }
    }//GEN-LAST:event_zwrocActionPerformed

    private void wypozyczoneTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wypozyczoneTabelaMouseClicked
        //wpisywanie danych do pól tekstowych po kliknięciu myszką
        
        DefaultTableModel klikniecieMyszka = (DefaultTableModel) wypozyczoneTabela.getModel();
        int selectIndex = wypozyczoneTabela.getSelectedRow();
        
        txtNRvin.setText(klikniecieMyszka.getValueAt(selectIndex, 0).toString());
        txtNrrej.setText(klikniecieMyszka.getValueAt(selectIndex, 1).toString());
        txtMarka.setText(klikniecieMyszka.getValueAt(selectIndex, 2).toString());
        txtModel.setText(klikniecieMyszka.getValueAt(selectIndex, 3).toString());
        txtKlasa.setText(klikniecieMyszka.getValueAt(selectIndex, 4).toString());
        txtNRpesel.setText(klikniecieMyszka.getValueAt(selectIndex, 5).toString());
        txtNazwisko.setText(klikniecieMyszka.getValueAt(selectIndex, 6).toString());
        txtImie.setText(klikniecieMyszka.getValueAt(selectIndex, 7).toString());
        txtdataWypozyczenia.setText(klikniecieMyszka.getValueAt(selectIndex, 8).toString());
        
                                        
        
    }//GEN-LAST:event_wypozyczoneTabelaMouseClicked
    
    private void pokazRachunekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazRachunekActionPerformed
        //liczenie ilości dni wynajmu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        String dataWypozyczenia = txtdataWypozyczenia.getText();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String dataZwrotu = Date_Format.format(txtdataZwrotu.getDate());
        String Klasa = txtKlasa.getText();
        String nrvin = txtNRvin.getText();
        String nrrej = txtNrrej.getText();
        String Marka = txtMarka.getText();
        String Model = txtModel.getText();
        String nrpesel = txtNRpesel.getText();
        String Nazwisko = txtNazwisko.getText();
        String Imie = txtImie.getText();
        
   
        LocalDate date1 = LocalDate.parse(dataWypozyczenia, formatter);
        LocalDate date2 = LocalDate.parse(dataZwrotu, formatter);
        
        long dniPomiedzy = ChronoUnit.DAYS.between(date1, date2);
      
        long cena = 0; //Liczenie kwoty do zapłaty według klasy pojazdu
        if ("Ekonomiczna".equals(Klasa)){
            cena = dniPomiedzy * 200;
            
        }
        else if ("Standard".equals(Klasa)){
            cena= dniPomiedzy *300;
        }
        else if ("Premium".equals(Klasa)){
            cena = dniPomiedzy *500;
        }
       
        String Cena = Long.toString(cena);
        // generowanie rachunku PDF z danymi pojazdu, klienta i kwotą do zapłaty
        try{
            
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("src/Data/rachunek.pdf"));
            document.open();
            document.add(Image.getInstance("src/Data/logo.png"));
            document.add(new Paragraph("Rachunek za wypozyczony pojazd"));

           // document.add(new Paragraph("Rachunek za wypozyczony pojazd"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Dokument wystawiony dla: "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable klient = new PdfPTable(3);
            PdfPCell c1 = new PdfPCell(new Phrase("Numer PESEL"));
            klient.addCell(c1);
            c1 = new PdfPCell(new Phrase("Nazwisko"));
            klient.addCell(c1);
            c1 = new PdfPCell (new Phrase("Imie"));
            klient.addCell(c1);
            klient.addCell(nrpesel);
            klient.addCell(Nazwisko);
            klient.addCell(Imie);
            document.add(klient);
            document.add(new Paragraph("Za wypozyczenie pojazdu :"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable pojazd = new PdfPTable(5);
            PdfPCell c2 = new PdfPCell(new Phrase("Numer VIN"));
            pojazd.addCell(c2);
            c2 = new PdfPCell(new Phrase("Numer rejestracyjny"));
            pojazd.addCell(c2);
            c2 = new PdfPCell (new Phrase("Marka"));
            pojazd.addCell(c2);
            c2 = new PdfPCell(new Phrase("Model"));
            pojazd.addCell(c2);
            c2 = new PdfPCell(new Phrase("Klasa"));
            pojazd.addCell(c2);
            pojazd.addCell(nrvin);
            pojazd.addCell(nrrej);
            pojazd.addCell(Marka);
            pojazd.addCell(Model);
            pojazd.addCell(Klasa);
            
            document.add(pojazd);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Wypozyczony od: " + (dataWypozyczenia)));
            document.add(new Paragraph("Wypozyczony do: " + (dataZwrotu)));
            document.add(new Paragraph("Ilosc dni: " + (dniPomiedzy)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable doZaplaty = new PdfPTable(3);
            PdfPCell c3 = new PdfPCell(new Phrase("Do zapłaty:  "));
            doZaplaty.addCell(c3);
            c3 = new PdfPCell(new Phrase(Cena));
            doZaplaty.addCell(c3);
            c3 = new PdfPCell (new Phrase(" PLN"));
            doZaplaty.addCell(c3);          
            document.add(doZaplaty);
            
            document.close();
        }catch(Exception e){
            System.out.println(e);
                
        }
        // otwieranie dokumentu po wygenerowaniu go
         if (Desktop.isDesktopSupported()) {
    try {
        File myFile = new File("src/Data/rachunek.pdf");
        Desktop.getDesktop().open(myFile);
    } catch (IOException ex) {
        
    }
}
    
	  

                                                  
    }//GEN-LAST:event_pokazRachunekActionPerformed

    
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
            java.util.logging.Logger.getLogger(zwroc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zwroc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zwroc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zwroc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zwroc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataWypozyczenia;
    private javax.swing.JLabel DataZwrotu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel marka;
    private javax.swing.JLabel model;
    private javax.swing.JLabel numerPesel;
    private javax.swing.JLabel numerVin;
    private javax.swing.JLabel numerrej;
    private javax.swing.JButton pokazRachunek;
    private javax.swing.JTextField txtImie;
    private javax.swing.JTextField txtKlasa;
    private javax.swing.JTextField txtMarka;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNRpesel;
    private javax.swing.JTextField txtNRvin;
    private javax.swing.JTextField txtNazwisko;
    private javax.swing.JTextField txtNrrej;
    private javax.swing.JTextField txtdataWypozyczenia;
    private com.toedter.calendar.JDateChooser txtdataZwrotu;
    private javax.swing.JButton wstecz;
    private javax.swing.JTable wypozyczoneTabela;
    private javax.swing.JButton zwroc;
    // End of variables declaration//GEN-END:variables

    
}
