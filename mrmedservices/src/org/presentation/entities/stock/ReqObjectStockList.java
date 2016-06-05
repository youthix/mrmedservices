package org.presentation.entities.stock;

import java.util.ArrayList;
import java.util.List;

	public class ReqObjectStockList {
		private List<ReqObjStock> sl;
		private String bid;
		private String sp;
	
	public List<ReqObjStock> getSl() {
		if(null==this.sl){
			this.sl=new ArrayList<ReqObjStock>();
		}
		return sl;
	}
	public void setSl(List<ReqObjStock> sl) {
		this.sl = sl;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	
}