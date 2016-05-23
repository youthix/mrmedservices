package org.presentation.entities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "reqparam")
public class RequestObj {
	
	private List<SearchFields> searchFieldsList;


	public List<SearchFields> getSearchFieldsList() {
		if (searchFieldsList == null) {
			searchFieldsList = new ArrayList<SearchFields>();
		}
		return searchFieldsList;
	}

	public void setSearchFieldsList(List<SearchFields> searchFieldsList) {
		this.searchFieldsList = searchFieldsList;
	}
	
	

}
