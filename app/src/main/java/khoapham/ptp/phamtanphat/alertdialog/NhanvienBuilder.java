package khoapham.ptp.phamtanphat.alertdialog;

public class NhanvienBuilder implements Builder {
    private String ten;
    private int namsinh;
    private String diachi;

    @Override
    public NhanvienBuilder ten(String ten) {
        this.ten = ten;
        return this;
    }

    @Override
    public NhanvienBuilder namsinh(int namsinh) {
        this.namsinh = namsinh;
        return this;
    }

    @Override
    public NhanvienBuilder diachi(String diachi) {
        this.diachi = diachi;
        return this;
    }

    public Nhanvien builder(){
        return new Nhanvien(ten,namsinh,diachi);
    }
}
