package cn.appinfo.tools;

import java.util.List;

public class PageBean<T> {
	private int pageNow=1;
	private int pageSize=3;
	private int count=0;
	private int pageTotle=0;
	
	private List<T> list;

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if(count>0)
			this.pageTotle=count%this.pageSize==0?count/this.pageSize:count/this.pageSize+1;
		this.count = count;
	}

	public int getPageTotle() {
		return pageTotle;
	}

	public void setPageTotle(int pageTotle) {
		this.pageTotle = pageTotle;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
