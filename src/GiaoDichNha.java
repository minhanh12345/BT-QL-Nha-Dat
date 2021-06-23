public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;
    private float thanhTienNha;

    public GiaoDichNha() {
    }

    public GiaoDichNha(int maGD, String date, int price, int dienTich, String loaiNha, String diaChi) {
        super(maGD, date, price, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }
    public float getThanhTienNha(){
        if(loaiNha=="cao cap"){return getDienTich()*getPrice();}
        else return (float) (getDienTich()*getPrice()*0.9);
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichNha{" +
                "loaiNha='" + loaiNha + '\'' +
                ", diaChi='" + diaChi + '\'' +"thanhTien= "+getThanhTienNha()+
                '}';
    }
}
