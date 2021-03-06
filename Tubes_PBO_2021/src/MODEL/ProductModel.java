package MODEL;

public class ProductModel {
    private int id;
    private String nama;
    private String harga;
    private int kuantitas;
    private String deskripsi;
    private CategoryModel kategori;

    public ProductModel(int id, String nama, String harga, int kuantitas, String deskripsi, CategoryModel kategori) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.kuantitas = kuantitas;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
    }
    
    public ProductModel(String nama){
        this.nama = nama;
    }
    
    public ProductModel(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public CategoryModel getKategori() {
        return kategori;
    }

    public void setKategori(CategoryModel kategori) {
        this.kategori = kategori;
    }
}
