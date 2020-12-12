package models;

import java.sql.Date;

public class DanhSachKhoanThu {
	private int id_khoanthu;
	private String tenkhoanthu;
	private Date batdau;
	private Date ketthuc;
	private int sotien;
	private String trangthai;

	public int getId_khoanthu() {
		return id_khoanthu;
	}
	public void setId_khoanthu(int id_khoanthu) {
		this.id_khoanthu = id_khoanthu;
	}
	public String getTenkhoanthu() {
		return tenkhoanthu;
	}
	public void setTenkhoanthu(String tenkhoanthu) {
		this.tenkhoanthu = tenkhoanthu;
	}
	public Date getBatdau() {
		return batdau;
	}
	public void setBatdau(Date batdau) {
		this.batdau = batdau;
	}
	public Date getKetthuc() {
		return ketthuc;
	}
	public void setKetthuc(Date ketthuc) {
		this.ketthuc = ketthuc;
	}
	public int getSotien() {
		return sotien;
	}
	public void setSotien(int sotien) {
		this.sotien = sotien;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	
	
	
}
