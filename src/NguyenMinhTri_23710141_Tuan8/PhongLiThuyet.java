package NguyenMinhTri_23710141_Tuan8;

public class PhongLiThuyet extends PhongHoc{

	@Override
	public boolean getDatChuan() {
		return (duAnhSang()&& isMayChieu());
	}
	private boolean mayChieu;
	public boolean isMayChieu() {
		return mayChieu;
	}
	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	public PhongLiThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}
	public PhongLiThuyet() {
		super();
	}
	public PhongLiThuyet(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
	}
	@Override
	public String toString() {
		String mayChieu=(isMayChieu()?"Co may chieu":"Khong co may chieu");
		return super.toString()+String.format("%10s|",mayChieu);
	}
}
