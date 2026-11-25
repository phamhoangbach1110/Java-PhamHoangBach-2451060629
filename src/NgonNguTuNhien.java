public class NgonNguTuNhien extends NgonNgu{

    private long soNguoiNoi;
    private String heChuViet;

    public NgonNguTuNhien(){
        super();
        this.soNguoiNoi = 0;
        this.heChuViet = "Unknown";
    }

    public NgonNguTuNhien(String id, String name, String country, long so, String viet){
        super(id, name, country);
        this.soNguoiNoi = so;
        this.heChuViet = viet;
    }

    public void getSoNguoiNoi(){
        System.out.println("Số người nói: " + soNguoiNoi);
    }

    public void setSoNguoiNoi(long soNguoiNoi) {
        this.soNguoiNoi = soNguoiNoi;
    }

    public void getHeChuViet(){
        System.out.println("Hệ chữ viết: " + heChuViet);
    }

    public void setHeChuViet(String heChuViet) {
        this.heChuViet = heChuViet;
    }

    //Ghi đè: In phần chung của lớp cha rồi in thêm pần riêng
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Số người nói: " + soNguoiNoi);
        System.out.println("Hệ chữ viết: " + heChuViet);
    }
}
