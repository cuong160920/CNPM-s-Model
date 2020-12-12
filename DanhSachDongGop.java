package models;

import java.sql.Date;

public class DanhSachDongGop {
	private int id_donggop;
	private String tendonggop;
	private Date batdau;
	private Date ketthuc;
	private int tongtien;
	public int getId_donggop() {
		return id_donggop;
	}
	public void setId_donggop(int id_donggop) {
		this.id_donggop = id_donggop;
	}
	public String getTendonggop() {
		return tendonggop;
	}
	public void setTendonggop(String tendonggop) {
		this.tendonggop = tendonggop;
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
	public int getTongtien() {
		return tongtien;
	}
	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}
	
}
