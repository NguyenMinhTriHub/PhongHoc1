package NguyenMinhTri_23710141_Tuan8;

public class TestPhongHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhongHoc ph1=new PhongLiThuyet("A2.05", "Day nha A", 100, 20, true);
		PhongHoc ph2=new PhongThucHanh("H8.02","Day nha H",60,25,40);
		PhongHoc ph3=new PhongThiNghiem("X6.05", "Day nha X", 150, 30, "Cong nghe hoa hoc", 60, true);
		System.out.println(ph1);
		System.out.println(ph2);
		System.out.println(ph3);
	}

}
