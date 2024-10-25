package NguyenMinhTri_23710141_Tuan8;

/**
 * 
 */
public class PhongThucHanh extends PhongHoc{

	@Override
	public boolean getDatChuan() {
		
		return (duAnhSang()&& getDatChuanMayTinh());
	}
	public boolean getDatChuanMayTinh() {
		return getDienTich()/getSoMayTinh()<=1.5;
	}
	private int soMayTinh;
	public int getSoMayTinh() {
		return soMayTinh;
	}
	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	public PhongThucHanh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}
	public PhongThucHanh() {
		super();
		
	}
	public PhongThucHanh(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		
	}
	@Override
		public String toString() {
			String phongThDatChuan=getDatChuanMayTinh()?"Da dat chuan":"Khong dat chuan";
			return super.toString()+String.format("%10s|%10d|",phongThDatChuan,getSoMayTinh());
		}
	
	

}
