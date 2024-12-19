
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author EXCALIBUR
 */
public class KullanicilarEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    DefaultTableModel model1;

KitapIslemleri islemler = KitapFactory.createKitapIslemleri();


    public KullanicilarEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) kitaplar_tablosu.getModel();
        kitapGoruntule();
        model1 = (DefaultTableModel) odunc_kitaplar_tablosu.getModel();
        oduncAlinanKitaplariGoruntule();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplar_tablosu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        odunc_kitaplar_tablosu = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        yazar_alani = new javax.swing.JTextField();
        kitap_konu_alani = new javax.swing.JTextField();
        kitap_tarih_alani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kitap_odunc_al = new javax.swing.JButton();
        kitap_iade_et = new javax.swing.JButton();
        kitap_ad_alani = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        arama_cubugu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jLabel1.setText("KÜTÜPHANEYE HOŞGELDİNİZ");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kitaplar_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Kitap Adı", "Yazar", "Konu", "Yayınlanma Tarihi", "Durum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kitaplar_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitaplar_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kitaplar_tablosu);
        if (kitaplar_tablosu.getColumnModel().getColumnCount() > 0) {
            kitaplar_tablosu.getColumnModel().getColumn(0).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(1).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(2).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(3).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(4).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("S&G HARMONY KÜTÜPHANESİNE HOŞGELDİNİZ");

        jLabel7.setText("Kitaplar");

        jLabel8.setText("Ödünç Alınan Kitaplar");

        odunc_kitaplar_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Kitap Adı", "Yazar", "Konu", "Yayınlanma Tarihi", "Durum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        odunc_kitaplar_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                odunc_kitaplar_tablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(odunc_kitaplar_tablosu);
        if (odunc_kitaplar_tablosu.getColumnModel().getColumnCount() > 0) {
            odunc_kitaplar_tablosu.getColumnModel().getColumn(0).setResizable(false);
            odunc_kitaplar_tablosu.getColumnModel().getColumn(1).setResizable(false);
            odunc_kitaplar_tablosu.getColumnModel().getColumn(2).setResizable(false);
            odunc_kitaplar_tablosu.getColumnModel().getColumn(3).setResizable(false);
            odunc_kitaplar_tablosu.getColumnModel().getColumn(4).setResizable(false);
            odunc_kitaplar_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\EXCALIBUR\\Desktop\\School\\Önemli Olabilecek Dosyalar\\Yazılım Mimarisi ve Tasarımı\\cropped-pic1.jpg")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\EXCALIBUR\\Downloads\\library.png")); // NOI18N

        kitap_tarih_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_tarih_alaniActionPerformed(evt);
            }
        });

        jLabel3.setText("Kitap Adı");

        jLabel4.setText("Kitap Yazarı");

        jLabel5.setText("Kitap Konusu");

        jLabel6.setText("Yayınlanma Tarihi");

        kitap_odunc_al.setText("Kitap Ödünç Al");
        kitap_odunc_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_odunc_alActionPerformed(evt);
            }
        });

        kitap_iade_et.setText("Kitap İade Et");
        kitap_iade_et.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_iade_etActionPerformed(evt);
            }
        });

        kitap_ad_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_ad_alaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitap_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yazar_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kitap_konu_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kitap_tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kitap_odunc_al)
                                    .addComponent(kitap_iade_et, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kitap_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yazar_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(kitap_tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitap_iade_et)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kitap_odunc_al)
                        .addGap(41, 41, 41)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(kitap_konu_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\EXCALIBUR\\Downloads\\library.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel12.setText("Kitap Ara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)
                        .addGap(174, 174, 174)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(mesaj_yazisi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(113, 113, 113))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kitaplar_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitaplar_tablosuMouseClicked
        // TODO add your handling code here:
        int selectedRow = kitaplar_tablosu.getSelectedRow();

        kitap_ad_alani.setText(model.getValueAt(selectedRow, 1).toString());

        yazar_alani.setText(model.getValueAt(selectedRow, 2).toString());

        kitap_konu_alani.setText(model.getValueAt(selectedRow, 3).toString());

        kitap_tarih_alani.setText(model.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_kitaplar_tablosuMouseClicked

    private void kitap_odunc_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_odunc_alActionPerformed
        // TODO add your handling code here:
        mesaj_yazisi.setText("");

        int selectedRow = kitaplar_tablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Kitaplar Tablosu şu anda boş.");
            } else {
                mesaj_yazisi.setText("Lütfen ödünç alınacak bir kitap seçin.");
            }
        } else {

            int id = (int) model.getValueAt(selectedRow, 0);

            islemler.kitapOduncAl(id);

            kitapGoruntule();
            oduncAlinanKitaplariGoruntule();
            mesaj_yazisi.setText("Kitap başarıyla ödünç alındı..");

        }
    }//GEN-LAST:event_kitap_odunc_alActionPerformed

    private void kitap_iade_etActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_iade_etActionPerformed
        mesaj_yazisi.setText("");

        int selectedRow = odunc_kitaplar_tablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model1.getRowCount() == 0) {
                mesaj_yazisi.setText("Ödünç Aldığınız kitap yok.");
            } else {
                mesaj_yazisi.setText("Lütfen iade edilecek bir kitap seçin.");
            }
        } else {

            int id = (int) model1.getValueAt(selectedRow, 0);

            islemler.kitapIadeEt(id);

            oduncAlinanKitaplariGoruntule();
            kitapGoruntule();

            mesaj_yazisi.setText("Kitap başarıyla iade edildi..");

        }
    }//GEN-LAST:event_kitap_iade_etActionPerformed

    private void odunc_kitaplar_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odunc_kitaplar_tablosuMouseClicked
        // TODO add your handling code here:

        int selectedRow = odunc_kitaplar_tablosu.getSelectedRow();

        kitap_ad_alani.setText(model1.getValueAt(selectedRow, 1).toString());

        yazar_alani.setText(model1.getValueAt(selectedRow, 2).toString());

        kitap_konu_alani.setText(model1.getValueAt(selectedRow, 3).toString());

        kitap_tarih_alani.setText(model1.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_odunc_kitaplar_tablosuMouseClicked

    private void kitap_tarih_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_tarih_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitap_tarih_alaniActionPerformed

    private void kitap_ad_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_ad_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitap_ad_alaniActionPerformed

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        // TODO add your handling code here:
         String aranan = arama_cubugu.getText();

        dinamikAra(aranan);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    
    
    
    public void dinamikAra(String arananString) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);

        kitaplar_tablosu.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(arananString));
    }


    public void kitapGoruntule1() {
        model.setRowCount(0);

        ArrayList<Kitap> kitaplar = new ArrayList<Kitap>();

        kitaplar = islemler.kitaplariGetir();

        if (kitaplar != null) {
            for (Kitap kitap : kitaplar) {
                Object[] eklenecek = {kitap.getId(), kitap.getKitap_adi(), kitap.getYazar(), kitap.getKitap_konu(), kitap.getTarih()};

                model.addRow(eklenecek);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public void kitapGoruntule() {
        model.setRowCount(0);

        ArrayList<Kitap> kitaplar = new ArrayList<Kitap>();

        kitaplar = islemler.kitaplariGetir();

        if (kitaplar != null) {
            for (Kitap kitap : kitaplar) {
                Object[] eklenecek = {kitap.getId(), kitap.getKitap_adi(), kitap.getYazar(), kitap.getKitap_konu(), kitap.getTarih(),kitap.getDurum()};

                model.addRow(eklenecek);
            }
        }
    }

    public void oduncAlinanKitaplariGoruntule() {
        model1.setRowCount(0);

        ArrayList<OduncAlinanKitap> oduncAlinanKitaps = new ArrayList<OduncAlinanKitap>();

        oduncAlinanKitaps = islemler.oduncAlinanKitaplariGetir();

        if (oduncAlinanKitaps != null) {
            for (OduncAlinanKitap kitap : oduncAlinanKitaps) {
                Object[] eklenecek = {kitap.getOdunc_id(), kitap.getOdunc_kitap(), kitap.getOdunc_yazar(), kitap.getOdunc_konu(), kitap.getOdunc_tarih(),kitap.getDurum()};

                model1.addRow(eklenecek);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(KullanicilarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullanicilarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullanicilarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullanicilarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KullanicilarEkrani dialog = new KullanicilarEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_cubugu;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kitap_ad_alani;
    private javax.swing.JButton kitap_iade_et;
    private javax.swing.JTextField kitap_konu_alani;
    private javax.swing.JButton kitap_odunc_al;
    private javax.swing.JTextField kitap_tarih_alani;
    private javax.swing.JTable kitaplar_tablosu;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTable odunc_kitaplar_tablosu;
    private javax.swing.JTextField yazar_alani;
    // End of variables declaration//GEN-END:variables
}
