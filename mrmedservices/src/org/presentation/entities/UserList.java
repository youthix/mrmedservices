package org.presentation.entities;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.repository.BObjects.User;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class UserList {

	private List<User> userList;
	private String tag;	
	private String pageID;
	private String currChapterNo;
	private String totalChapters;
	private String totalUserCount;
	
	private SearchFields searchFields;

	public List<User> getUserList() {
		if (this.userList == null) {
			this.userList = new ArrayList<User>();
		}
		return userList;
	}

	public void setUserList(List<User> userList) {
				this.userList = userList;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getPageID() {
		return pageID;
	}

	public void setPageID(String pageID) {
		this.pageID = pageID;
	}

	public SearchFields getSearchFields() {
		return searchFields;
	}

	public void setSearchFields(SearchFields searchFields) {
		this.searchFields = searchFields;
	}

	public String getTotalChapters() {
		return totalChapters;
	}

	public void setTotalChapters(String totalChapters) {
		this.totalChapters = totalChapters;
	}

	public String getCurrChapterNo() {
		return currChapterNo;
	}

	public void setCurrChapterNo(String currChapterNo) {
		this.currChapterNo = currChapterNo;
	}

	public String getTotalUserCount() {
		return totalUserCount;
	}

	public void setTotalUserCount(String totalUserCount) {
		this.totalUserCount = totalUserCount;
	}
	
}
