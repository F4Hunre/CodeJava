package nguyenngochung_qldsv;

import java.util.Comparator;

// Lớp sắp xếp theo tên

public class Xeptheoten implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien student1, SinhVien student2) {
        return student1.getTen().compareTo(student2.getTen());
    }
}
