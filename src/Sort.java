import java.util.Comparator;

public class Sort implements Comparator<GiaoDich> {

    @Override
    public int compare(GiaoDich o1, GiaoDich o2) {
        if(o1.getMaGD()>o2.getMaGD())return 1;
        return -1;
    }
}
