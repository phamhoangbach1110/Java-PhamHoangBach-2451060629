public class NgonNguLapTrinh extends NgonNgu{

    private String moHinh;
    private String trinhBienDich;

    public NgonNguLapTrinh(){
        super();
        moHinh = "Unknown";
        trinhBienDich = "Unknown";
    }

    public NgonNguLapTrinh(String id, String name, String country, String model, String compiler){
        super(id, name, country);
        this.moHinh = model;
        this.trinhBienDich = compiler;
    }

    public void getMoHinh(){
        System.out.println(moHinh);
    }

    public void setMoHinh(String moHinh) {
        this.moHinh = moHinh;
    }

    public void getTrinhBienDich(){
        System.out.println(trinhBienDich);
    }

    public void setTrinhBienDich(String trinhBienDich) {
        this.trinhBienDich = trinhBienDich;
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Mô hình: " + moHinh);
        System.out.println("Trình biên dịch: " + trinhBienDich);
    }
}
