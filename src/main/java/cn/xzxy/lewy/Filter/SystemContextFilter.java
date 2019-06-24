package cn.xzxy.lewy.Filter;


import cn.xzxy.lewy.util.SystemContext;

import javax.servlet.*;
import java.io.IOException;

public class SystemContextFilter implements Filter{

    private static int pageSize;

    public void destroy() {
        // TODO Auto-generated method stub

    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        int pageIndex;
        try {
            pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            pageIndex = 1;
        }

        try {
            SystemContext.setPageIndex(pageIndex);
            SystemContext.setPageSize(pageSize);
            chain.doFilter(request, response);
        } finally {
            SystemContext.removePageIndex();
            SystemContext.removePageSize();
        }
    }

    public void init(FilterConfig config) throws ServletException {
        // TODO Auto-generated method stub
        pageSize = Integer.parseInt(config.getInitParameter("pageSize"));
    }
}
