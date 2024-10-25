package NguyenMinhTri_23710141_Tuan8;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong,dayNha;
	protected double dienTich;
	protected int soBongDen;
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) throws Exception {
		if(maPhong!=null) {
			this.maPhong = maPhong;
		}else {
			throw new Exception("Loi ma phong");
		}
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public PhongHoc() {
		
	}
	public abstract boolean getDatChuan();
	String phongHocChuan=(getDatChuan())? "Dat chuan":"Khong dat chuan";
	public boolean duAnhSang() {
		return getDienTich()/getSoBongDen()<=10;
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("%10s|%10s|%10f|%10d|%10s|",getMaPhong(),getDayNha(),getDienTich(),getSoBongDen(),getDatChuan());
		return s;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dayNha, dienTich, maPhong, soBongDen);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PhongHoc))
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(dayNha, other.dayNha)
				&& Double.doubleToLongBits(dienTich) == Double.doubleToLongBits(other.dienTich)
				&& Objects.equals(maPhong, other.maPhong) && soBongDen == other.soBongDen;
	}
	
	
	
	
	
}
