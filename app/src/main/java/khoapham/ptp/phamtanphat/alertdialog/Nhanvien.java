package khoapham.ptp.phamtanphat.alertdialog;

public class Nhanvien {
    private String ten;
    private int namsinh;
    private String diachi;

    public Nhanvien(String ten, int namsinh, String diachi) {
        this.ten = ten;
        this.namsinh = namsinh;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
