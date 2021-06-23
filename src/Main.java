import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("1.Them");
            System.out.println("2.Tinh tong so luong GD");
            System.out.println("3.Xoa GD theo ngay");
            System.out.println("4.Tinh tien GD theo ngay");
            System.out.println("5.Tim GD theo MaGD By Binary");
            System.out.println("6.Sap xep theo maGD");
            System.out.println("7.Show");
            System.out.println("8.Exit");
            int choose=scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("1.GD Dat");
                    System.out.println("2.GD Nha");
                    int choose1=scanner.nextInt();
                    if(choose1==1){Manager.add("GiaoDichDat");}
                    else Manager.add("GiaoDichNha");
                    break;
                case 2:
                    System.out.println("1.GD Dat");
                    System.out.println("2.GD Nha");
                    int choose2=scanner.nextInt();
                    if(choose2==1){
                        System.out.println(Manager.tinhTongGD("GiaoDichDat"));
                    }else System.out.println(Manager.tinhTongGD("GiaoDichNha"));
                    break;
                case 3:
                    System.out.println("Nhap Date");
                    String date=scanner.next();
                    Manager.removeByDate(date);
                    break;
                case 4:
                    System.out.println("Nhap date");
                    String date1=scanner.next();
                    Manager.tinhTienGDByDate(date1);
                    break;
                case 5:
                    Manager.findByMaGDByBinare();break;
                case 6:
                    Manager.Sort();
                    break;
                case 7:
                    Manager.show();
                    break;
                case 8:
                    System.exit(0);

            }
        }
    }
}
