public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    private float thanhTienDat;


    public GiaoDichDat() {
    }

    public GiaoDichDat(int maGD, String date, int price, int dienTich, String loaiDat) {
        super(maGD, date, price, dienTich);
        this.loaiDat = loaiDat;
    }

    public float getThanhTienDat() {
        if (loaiDat == "A") return (float) (getDienTich() * getPrice() * 1.5);
        else return getDienTich() * getPrice();
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichDat{" +
                "loaiDat='" + loaiDat + '\'' +"thanhTien= "+getThanhTienDat()+
                '}';
    }
}
