package nguyenngochung_qldsv;
import java.io.Serializable;
// SinhVien class
public class SinhVien implements Serializable {
    private int id;
    private String ten;
    private byte tuoi;
    private String diachi;
    private float toan;
    private float van;
    private float anh;
    private float diemtb;
    public SinhVien() {}
    public SinhVien(int id, String ten, byte tuoi, 
            String diachi, float toan,float van, float anh, float diemtb) {
        super();
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
        this.diemtb = diemtb; }
    // Get/Set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public byte getTuoi() {
		return tuoi;
	}
	public void setTuoi(byte tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getVan() {
		return van;
	}
	public void setVan(float van) {
		this.van = van;
	}
	public float getAnh() {
		return anh;
	}
	public void setAnh(float anh) {
		this.anh = anh;
	}
	public float getDiemtb() {
		return diemtb;
	}
	public void setDiemtb(float diemtb) {
		this.diemtb = diemtb;
	}
}