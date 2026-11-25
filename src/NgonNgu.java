public class NgonNgu {

    //Cac thuoc tinh
    private String maNgonNgu;
    private String tenNgonNgu;
    private String quocGia;

    //Constructor Mac dinh
    public NgonNgu() {
        this.maNgonNgu = "";
        this.tenNgonNgu = "";
        this.quocGia = "";
    }

    //Constructor voi 3 tham so
    public NgonNgu(String id, String name, String country){
        this.maNgonNgu = id;
        this.tenNgonNgu = name;
        this.quocGia = country;
    }

    //get/set
    public void setMaNgonNgu(String maNgonNgu) {
        this.maNgonNgu = maNgonNgu;
    }

    public String getMaNgonNgu() {
        return this.maNgonNgu;
    }

    public void setTenNgonNgu(String tenNgonNgu) {
        this.tenNgonNgu = tenNgonNgu;
    }

    public String getTenNgonNgu() {
        return this.tenNgonNgu;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getQuocGia() {
        return this.quocGia;
    }

    public void hienThiThongTin(){
        System.out.println("\n---THÔNG TIN NGÔN NGỮ---");
        System.out.println("Mã ngôn ngữ: " + this.maNgonNgu);
        System.out.println("Tên ngôn ngữ: " + this.tenNgonNgu);
        System.out.print("Quốc gia: " + this.quocGia);
    }
}
