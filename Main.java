package nguyenngochung_qldsv;
import java.util.Scanner;
 // Main class
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Nguyễn Ngọc Hùng - Chương trình quản lý điểm sinh viên");
        String choose = null;
        boolean exit = false;
        Quanlydiemsinhvien quanlysinhvien = new Quanlydiemsinhvien();
        int IdSinhVien;
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
            	quanlysinhvien.add();
                break;
            case "2":
            	IdSinhVien = quanlysinhvien.inputId();
                quanlysinhvien.edit(IdSinhVien);
                break;
            case "3":
            	IdSinhVien = quanlysinhvien.inputId();
                quanlysinhvien.delete(IdSinhVien);
                break;
            case "4":
            	quanlysinhvien.Xeptheodiemtb();
                break;
            case "5":
            	quanlysinhvien.Xeptheoten();
                break;
            case "6":
            	quanlysinhvien.show();
                break;
            case "0":
                System.out.println("Đã thoát");
                exit = true;
                break;
            default:
                System.out.println("invalid! Vui lòng chọn trong menu:");
                break;}
            if (exit) {
                break;}
            // show menu
            showMenu();}}
    // Tạo menu
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm sinh viên.");
        System.out.println("2. Sửa sinh viên theo id.");
        System.out.println("3. Xóa sinh viên theo id.");
        System.out.println("4. Sắp xếp theo điểm trung bình.");
        System.out.println("5. Sắp xếp theo tên.");
        System.out.println("6. Hiển thị list sinh viên.");
        System.out.println("0. Thoát.");
        System.out.println("---------------------------");
        System.out.print("Vui lòng chọn: ");
    }
}
