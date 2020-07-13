package waq.hbwl.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import waq.hbwl.po.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器
 */
public class LoginInter implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 获取请求的url
        String url = request.getRequestURI();
        // 拦截除login.jsp的所有访问
        if (url.indexOf("/login") > 0) {
            return true;
        }
        // 获取session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("User_Session");
        // 判断是否存在用户数据
        if (user != null) {
            return true;
        }
        request.setAttribute("msg", "还没有登录！！");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }

}
