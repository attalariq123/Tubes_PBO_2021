package VIEW;

import CONTROLLER.AdminController;
import DBHelper.productDB;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ProductMenu extends javax.swing.JFrame {

    public ProductMenu() {
        initComponents();
        fetchDataProduct();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        IdLabel = new javax.swing.JLabel();
        NamaLabel = new javax.swing.JLabel();
        KuantitasLabel = new javax.swing.JLabel();
        DeskripsiLabel = new javax.swing.JLabel();
        KategoriLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        namaText = new javax.swing.JTextField();
        kuantitasText = new javax.swing.JTextField();
        deskripsiText = new javax.swing.JTextField();
        kategoriCB = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        hargaText = new javax.swing.JTextField();
        hargaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Product");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        welcomeLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 204, 102));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Manage Product");
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        refreshButton.setText("Refresh Data");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel)
                    .addComponent(backButton)
                    .addComponent(refreshButton))
                .addGap(9, 9, 9))
        );

        IdLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(0, 204, 102));
        IdLabel.setText("ID");

        NamaLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        NamaLabel.setForeground(new java.awt.Color(0, 204, 102));
        NamaLabel.setText("Nama");

        KuantitasLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        KuantitasLabel.setForeground(new java.awt.Color(0, 204, 102));
        KuantitasLabel.setText("Kuantitas");

        DeskripsiLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        DeskripsiLabel.setForeground(new java.awt.Color(0, 204, 102));
        DeskripsiLabel.setText("Deskripsi");

        KategoriLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        KategoriLabel.setForeground(new java.awt.Color(0, 204, 102));
        KategoriLabel.setText("Kategori");

        idText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        namaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kuantitasText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        deskripsiText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kategoriCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kategoriCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Elektronik" }));

        addButton.setBackground(new java.awt.Color(0, 204, 102));
        addButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");

        editButton.setBackground(new java.awt.Color(0, 204, 102));
        editButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");

        deleteButton.setBackground(new java.awt.Color(0, 204, 102));
        deleteButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");

        productTable.setAutoCreateRowSorter(true);
        productTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Harga", "Kuantitas", "Deskripsi", "Kategori"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productTable.setRowHeight(26);
        productTable.setRowMargin(4);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        clearButton.setBackground(new java.awt.Color(0, 204, 102));
        clearButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");

        hargaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        hargaLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        hargaLabel.setForeground(new java.awt.Color(0, 204, 102));
        hargaLabel.setText("Harga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(hargaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hargaText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(NamaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KuantitasLabel)
                            .addComponent(DeskripsiLabel)
                            .addComponent(KategoriLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deskripsiText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kuantitasText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kategoriCB, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IdLabel)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(NamaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(namaText)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hargaLabel)
                            .addComponent(hargaText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(KuantitasLabel)
                            .addComponent(kuantitasText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DeskripsiLabel)
                            .addComponent(deskripsiText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(KategoriLabel)
                            .addComponent(kategoriCB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(editButton)
                            .addComponent(deleteButton)
                            .addComponent(clearButton))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        AdminHome v = new AdminHome();
        AdminController c = new AdminController(v);
        c.initController();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        String id = getProductTable().getValueAt(getProductTable().getSelectedRow(), 0).toString();
        String nama = getProductTable().getValueAt(getProductTable().getSelectedRow(), 1).toString();
        String harga = getProductTable().getValueAt(getProductTable().getSelectedRow(), 2).toString();
        String kuantitas = getProductTable().getValueAt(getProductTable().getSelectedRow(), 3).toString();
        String deskripsi = getProductTable().getValueAt(getProductTable().getSelectedRow(), 4).toString();
        String kategori = getProductTable().getValueAt(getProductTable().getSelectedRow(), 5).toString();

        getIdText().setText(id);
        getNamaText().setText(nama);
        getHargaText().setText(harga);
        getKuantitasText().setText(kuantitas);
        getDeskripsiText().setText(deskripsi);
        getKategoriCB().setSelectedItem(kategori);
    }//GEN-LAST:event_productTableMouseClicked

    public void ProductButtonListener(ActionListener buttonListener) {
        clearButton.addActionListener(buttonListener);
        addButton.addActionListener(buttonListener);
        editButton.addActionListener(buttonListener);
        deleteButton.addActionListener(buttonListener);
        refreshButton.addActionListener(buttonListener);
    }
    
    public void fetchDataProduct() {
        DefaultTableModel dm = new productDB().getData();
        productTable.setModel(dm);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeskripsiLabel;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JLabel KategoriLabel;
    private javax.swing.JLabel KuantitasLabel;
    private javax.swing.JLabel NamaLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField deskripsiText;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField hargaText;
    private javax.swing.JTextField idText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategoriCB;
    private javax.swing.JTextField kuantitasText;
    private javax.swing.JTextField namaText;
    private javax.swing.JTable productTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public void setRefreshButton(JButton refreshButton) {
        this.refreshButton = refreshButton;
    }
    
    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton) {
        this.deleteButton = deleteButton;
    }

    public JTextField getDeskripsiText() {
        return deskripsiText;
    }

    public void setDeskripsiText(JTextField deskripsiText) {
        this.deskripsiText = deskripsiText;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }
    
    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }

    public JTextField getIdText() {
        return idText;
    }

    public void setIdText(JTextField idText) {
        this.idText = idText;
    }

    public JComboBox<String> getKategoriCB() {
        return kategoriCB;
    }

    public void setKategoriCB(JComboBox<String> kategoriCB) {
        this.kategoriCB = kategoriCB;
    }

    public JTextField getKuantitasText() {
        return kuantitasText;
    }

    public void setKuantitasText(JTextField kuantitasText) {
        this.kuantitasText = kuantitasText;
    }

    public JTextField getNamaText() {
        return namaText;
    }

    public void setNamaText(JTextField namaText) {
        this.namaText = namaText;
    }
    
    public JTextField getHargaText() {
        return hargaText;
    }
    
    public void setHargaText(JTextField hargaText) {
        this.hargaText = hargaText;
    }

    public JTable getProductTable() {
        return productTable;
    }

    public void setProductTable(JTable productTable) {
        this.productTable = productTable;
    }
}
