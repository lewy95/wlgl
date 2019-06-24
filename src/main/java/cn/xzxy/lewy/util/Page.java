package cn.xzxy.lewy.util;

import java.util.List;

public class Page<T> {
    private List<T> pages;//具体传递的数据
    private int pageSize;//每页多少条数据
    private int totalPage;//一共多少页
    private int pageIndex;//当前第几页
    private int totalRecord;//一共多少条记录
    public List<T> getPages() {
        return pages;
    }
    public void setPages(List<T> pages) {
        this.pages = pages;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    public int getPageIndex() {
        return pageIndex;
    }
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
    public int getTotalRecord() {
        return totalRecord;
    }
    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }
}
