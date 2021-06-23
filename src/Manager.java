import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    static ArrayList<GiaoDich> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int luongGDNha = 0;
    static int luongGDDat = 0;

    static GiaoDich create(String loaiGD) {
        System.out.println("maGD");
        int maGD = scanner.nextInt();
        System.out.println("date");
        String date = scanner.next();
        System.out.println("price");
        int price = scanner.nextInt();
        System.out.println("dienTich");
        int dienTich = scanner.nextInt();
        if (loaiGD == "GiaoDichNha") {
            luongGDNha++;
            System.out.println("loaiNha");
            String loaiNha = scanner.next();
            System.out.println("diaChi");
            String diaChi = scanner.next();
            return new GiaoDichNha(maGD, date, price, dienTich, loaiNha, diaChi);
        } else {
            luongGDDat++;
            System.out.println("loaiDat");
            String loaiDat = scanner.next();
            return new GiaoDichDat(maGD, date, price, dienTich, loaiDat);
        }
    }

    static void add(String loaiGD) {
        GiaoDich giaoDich = create(loaiGD);
        list.add(giaoDich);
    }

    static int tinhTongGD(String loaiGD) {
        if (loaiGD == "GiaoDichNha") return luongGDNha;
        else return luongGDDat;
    }

    static void removeByDate(String date) {
        boolean check = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDate().equals(date)) {
                list.remove(i);
                if (list.get(i) instanceof GiaoDichNha) {
                    luongGDNha--;
                } else if (list.get(i) instanceof GiaoDichDat) {
                    luongGDDat--;
                }
                check = false;
            }
        }
        if (check) {
            System.out.println("ko co");
        }
    }

    static void tinhTienGDByDate(String date) {
        System.out.println("Nhap date");
        date = scanner.next();
        float sum = 0;
        boolean check = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDate().equals(date)) {
                if (list.get(i) instanceof GiaoDichDat) {
                    sum += ((GiaoDichDat) list.get(i)).getThanhTienDat();
                } else if (list.get(i) instanceof GiaoDichNha) {
                    sum += ((GiaoDichNha) list.get(i)).getThanhTienNha();
                }
                check = false;
            }
        }

        if (check) {
            System.out.println("ko co");
        } else System.out.println(sum);
    }

    static void Sort() {
        Sort sort = new Sort();
        list.sort(sort);
    }

    static void findByMaGDByBinare() {
        System.out.println("Nhap MaGD");
        int maGD = scanner.nextInt();
        ArrayList<GiaoDich> newList = list;
        Sort sort = new Sort();
        newList.sort(sort);
        ArrayList<Integer> arrayListMaGD = new ArrayList<>();
        for (int j = 0; j < newList.size(); j++) {
            arrayListMaGD.add(newList.get(j).getMaGD());
        }
        int left = 0;
        int right = arrayListMaGD.size() - 1;
        int check = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (maGD == arrayListMaGD.get(mid)) {
                check = mid;break;
            } else if (maGD < arrayListMaGD.get(mid)) {
                right = mid - 1;
            } else left = mid + 1;
        }
        if (check < 0) {
            System.out.println("ko co");
        } else System.out.println(newList.get(check));
    }

    static public void show() {
        for (GiaoDich s : list
        ) {
            System.out.println(s);

        }
    }
}
