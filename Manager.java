package pegawai;

public class Manager extends Pegawai {
    private String departemen;

    public Manager(String nama, int umur, double gaji, String departemen) {
        super(nama, umur, gaji);
        this.departemen = departemen;
    }

    // Method override untuk menampilkan informasi khusus manager
    @Override
    public void displayInfo() {
        super.displayInfo(); // Pangil metode displayInfo() dari superclass
        System.out.println("Departemen: " + departemen);
    }

    // Getter dan setter untuk variabel instance khusus manager
    // Penggunaan getter dan setter yang tepat dari superclass
    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); 
    }

    @Override
    public int getUmur() {
        return super.getUmur(); 
    }

    @Override
    public void setUmur(int umur) {
        super.setUmur(umur);
    }

    @Override
    public double getGaji() {
        return super.getGaji();
    }

    @Override
    public void setGaji(double gaji) {
        super.setGaji(gaji);
    }
    
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
}