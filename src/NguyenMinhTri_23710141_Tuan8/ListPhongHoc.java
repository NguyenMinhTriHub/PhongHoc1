package NguyenMinhTri_23710141_Tuan8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ListPhongHoc {
	List<PhongHoc> ls;
	public ListPhongHoc() {
		ls=new ArrayList<PhongHoc>(3);
	}
	public boolean themPhongHoc(PhongHoc ph) {
		if(ls.contains(ph)) {
			return false;
		}else {
			ls.add(ph);
			return true;
		}
	}
	public int soPhongHoc() {
		return ls.size();
	}
	public boolean xoaPhongHoc(String ma) {
		for (PhongHoc ph : ls) {
			if (ph.getMaPhong().equalsIgnoreCase(ma)) {
				ls.remove(ph);
				return true;
			}
		}
		return false;
	}
	public List<PhongHoc>xuatPhong() {
		return ls;
	}
	public List<PhongHoc> xuatDSDatChuan(){
		List<PhongHoc> dsDC=new ArrayList<PhongHoc>();
		for (PhongHoc ph : dsDC) 
			if(ph.getDatChuan()) {
				dsDC.add(ph);	
			}
		return dsDC;		
	}
	public void sapXep() {
		Collections.sort(ls,new Comparator<PhongHoc>() {
			public int compare(PhongHoc o1,PhongHoc o2) {
				String x=new String(o1.getMaPhong());
				String y=new String(o2.getMaPhong());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	public boolean capNhatBongDen(String maPhong,int soBongDen) {
		for (PhongHoc ph : ls) 
			if(maPhong.equalsIgnoreCase(ph.getMaPhong())) {
				ph.setSoBongDen(soBongDen);
				return true;
			}
		return false;	
	}
}
