public class GiaoDich {
   private int maGD;
   private String date;
   private int price;
   private int dienTich;


    public GiaoDich() {
    }

    public GiaoDich(int maGD, String date, int price, int dienTich) {
        this.maGD = maGD;
        this.date = date;
        this.price = price;
        this.dienTich = dienTich;

    }



    public int getMaGD() {
        return maGD;
    }

    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGD=" + maGD +
                ", date=" + date +
                ", price=" + price +
                ", dienTich=" + dienTich +
                '}';
    }
}
