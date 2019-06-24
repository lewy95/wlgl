package cn.xzxy.lewy.util;

public class SystemContext {
    private static ThreadLocal<Integer> pageSize = new ThreadLocal<Integer>();
    private static ThreadLocal<Integer> pageIndex = new ThreadLocal<Integer>();

    public static int getPageSize() {
        return pageSize.get();//获取线程中的数据
    }

    public static void setPageSize(int _pageSize) {
        pageSize.set(_pageSize);//把数据存入到线程中
    }

    public static void removePageSize() {
        pageSize.remove();//清空线程中的数据
    }

    public static int getPageIndex() {
        return pageIndex.get();
    }

    public static void setPageIndex(int _pageIndex) {
        pageIndex.set(_pageIndex);
    }

    public static void removePageIndex() {
        pageIndex.remove();
    }
}
