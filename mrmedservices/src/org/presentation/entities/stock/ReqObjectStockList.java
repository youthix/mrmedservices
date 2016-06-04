package org.presentation.entities.stock;

import java.util.ArrayList;
import java.util.List;

public class ReqObjectStockList {
	List<ReqObjStock> sl;
	

public List<ReqObjStock> getSl() {
	if(null==this.sl){
		this.sl=new ArrayList<ReqObjStock>();
	}
	return sl;
}
public void setSl(List<ReqObjStock> sl) {
	this.sl = sl;
}
}