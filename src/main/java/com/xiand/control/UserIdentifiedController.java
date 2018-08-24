package com.xiand.control;

import com.xiand.entity.MemberInfo;
import com.xiand.server.interFace.UserIdentiServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserIdentifiedController {
    @Resource
    private UserIdentiServer userIdentiServer;
    @RequestMapping("/userIdentifide.go")
    public ModelAndView userIdentifide(HttpSession httpSession,@RequestParam("userName")String username, @RequestParam("passWord") String password){
        String message="Input Message Error!";
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("login");
        MemberInfo curruser=(MemberInfo) httpSession.getAttribute("curruser");
        if(curruser!=null){
            modelAndView.setViewName("home");
        }else{
            if (username != null && username.trim().length() > 4 && password != null && password.trim().length() > 4) {
                MemberInfo memberInfo = userIdentiServer.selectMeber(username, password);
                if (memberInfo != null) {
                    httpSession.setAttribute("curruser", memberInfo);
                    modelAndView.setViewName("home");
                } else {
                    modelAndView.addObject("message", message);
                }
            } else {
                modelAndView.addObject("message", message);
            }
        }
        return modelAndView;
    }
}
