package waq.hbwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import waq.hbwl.po.User;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    // 跳转至登录页面
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    // 用户登录处理
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session) {

        // 获取用户名和密码
        String username = user.getUsername();
        String password = user.getPassword();

        // 模拟判断
        if (username != null && username.equals("ming") && password != null && password.equals("123456")) {

            session.setAttribute("User_Session", user);
            return "redirect:main";

        }
        model.addAttribute("msg", "用户名或密码错误");
        return "login";

    }

    // 主页面跳转
    @RequestMapping(value = "/main")
    public String toMain() {
        return "main";
    }

    // 退出登录
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {

        session.invalidate();
        return "redirect:login";

    }

}
