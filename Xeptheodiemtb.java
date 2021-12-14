package nguyenngochung_qldsv;

import java.util.Comparator;

// Lop sap xep theo diem
public class Xeptheodiemtb implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien student1, SinhVien student2) {
        if (student1.getDiemtb() > student2.getDiemtb()) {
            return 1;
        }
        return -1;
    }
}
