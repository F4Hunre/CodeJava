package nguyenngochung_qldsv;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
// Quan ly sinh vien class
public class Quanlydiemsinhvien extends SinhVien {
    public static Scanner scanner = new Scanner(System.in);
    private List<SinhVien> danhsachsinhvien;
    private Docghisinhvien docghisinhvien;
    public Quanlydiemsinhvien() {
    	super();
    	docghisinhvien = new Docghisinhvien();
        danhsachsinhvien = docghisinhvien.read();
    }
    // Nhập id sinh viên
    public int inputId() {
        System.out.print("Nhập id sinh viên: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Nhập lại: ");}}}   
    // Nhập tên sinh viên
    private String inputTen() {
        System.out.print("Nhập tên: ");
        return scanner.nextLine();}  
    // Nhập địa chỉ sinh viên
    private String inputDiachi() {
        System.out.print("Nhập địa chỉ: ");
        return scanner.nextLine();}
    // Nhập tuổi
    private byte inputTuoi() {
        System.out.print("Nhập tuổi sinh viên: ");
        while (true) {
            try {
                byte tuoi = Byte.parseByte((scanner.nextLine()));
                if (tuoi < 0 && tuoi > 100) {
                    throw new NumberFormatException();}
                return tuoi;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Nhập lại tuổi: ");}}}
 // Nhập điểm toán
    private float inputToan() {
        System.out.print("Nhập điểm toán: ");
        return scanner.nextFloat();}
 // Nhập điểm văn
    private float inputVan() {
        System.out.print("Nhập điểm văn: ");
        return scanner.nextFloat();}
 // Nhập điểm anh
    private float inputAnh() {
        System.out.print("Nhập điểm tiếng anh: ");
        return scanner.nextFloat();}
    // Nhập điểm trung bình
    private float inputDiemtb() {
        System.out.print("Nhập điểm trung bình: ");
        return scanner.nextFloat();}
    // getter && setter
    public List<SinhVien> getdanhsachsinhvien() {
        return danhsachsinhvien;}
    public void setdanhsachsinhvien(List<SinhVien> danhsachsinhvien) {
        this.danhsachsinhvien = danhsachsinhvien;}
    // Thêm sinh viên vào danh sách sinh viên
	public void add() {
        int id = (danhsachsinhvien.size() > 0) ? (danhsachsinhvien.size() + 1) : 1;
        System.out.println("id Sinh Viên = " + id);
        String ten = inputTen();
        byte tuoi = inputTuoi();
        String diachi = inputDiachi();
        float toan = inputToan();
        float van = inputVan();
        float anh = inputAnh();
        float diemtb = inputDiemtb();
        SinhVien student = new SinhVien(id, ten, tuoi, diachi, toan, van, anh, diemtb);
        danhsachsinhvien.add(student);
        docghisinhvien.write(danhsachsinhvien);}
    // sửa thông tin sinh viên theo id
    public void edit(int id) {
        boolean isExisted = false;
        int size = danhsachsinhvien.size();
        for (int i = 0; i < size; i++) {
            if (danhsachsinhvien.get(i).getId() == id) {
                isExisted = true;
                danhsachsinhvien.get(i).setTen(inputTen());
                danhsachsinhvien.get(i).setTuoi(inputTuoi());
                danhsachsinhvien.get(i).setDiachi(inputDiachi());
                danhsachsinhvien.get(i).setToan(inputToan());
                danhsachsinhvien.get(i).setVan(inputVan());
                danhsachsinhvien.get(i).setAnh(inputAnh());
                danhsachsinhvien.get(i).setDiemtb(inputDiemtb());
                break;}}
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
        	docghisinhvien.write(danhsachsinhvien);}}
    // xóa điểm theo id
    public void delete(int id) {
    	SinhVien student = null;
        int size = danhsachsinhvien.size();
        for (int i = 0; i < size; i++) {
            if (danhsachsinhvien.get(i).getId() == id) {
                student = danhsachsinhvien.get(i);
                break;}}
        if (student != null) {
        	danhsachsinhvien.remove(student);
        	docghisinhvien.write(danhsachsinhvien);
        } else {
            System.out.printf("id = %d not existed.\n", id);}}
    public void Xeptheoten() {
        Collections.sort(danhsachsinhvien, new Xeptheoten());}
    public void Xeptheodiemtb() {
        Collections.sort(danhsachsinhvien, new Xeptheodiemtb());}
    // in list ra màn hình
    public void show() {
        for (SinhVien student : danhsachsinhvien) {
            System.out.format("ID%5d | ", student.getId());
            System.out.format("Tên%20s | ", student.getTen());
            System.out.format("Tuổi%5d | ", student.getTuoi());
            System.out.format("Địa chỉ%15s%n| ", student.getDiachi());
            System.out.format("Toán%6.1f | ", student.getToan());
            System.out.format("Văn%6.1f | ", student.getVan());
            System.out.format("Anh%6.1f  | ", student.getAnh());
            System.out.format("Trung Bình%6.1f%n", student.getDiemtb());
}}}