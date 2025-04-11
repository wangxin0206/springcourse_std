package org.itforjava.controller;


import jakarta.validation.constraints.Pattern;
import org.itforjava.entity.Result;
import org.itforjava.entity.User;
import org.itforjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*
    * 注册
    * */
    @PostMapping("/register")
    public Result register(@Pattern(regexp = "^\\S{5,16}$") String username,@Pattern(regexp = "^\\S{5,16}$") String password) {
        User user = userService.findByName(username);
        if (user == null) {
//            String md5String = Md5Util.getMD5String(password);
            userService.add(username,password);
            return Result.success("注册成功");
        }else{
            return Result.error("用户名已被占用");
        }
    }

    /*
     * 登录
     * */
    @PostMapping("/login")
    public Result login(@Pattern(regexp = "^\\S{5,16}$") String username,@Pattern(regexp = "^\\S{5,16}$") String password) {
        User user = userService.findByName(username);
        if (user == null) {
//            String md5String = Md5Util.getMD5String(password);
            userService.add(username,password);
            return Result.success("登录成功");
        }else{
            return Result.error("登录失败");
        }
    }

    /*
    * 更新用户信息
    * */
    @PostMapping("/update")
    public Result update(String username,String email,String userpic) {
        User updateUser = userService.findByName(username);
        updateUser.setEmail(email);
        updateUser.setUserPic(userpic);
        if(userService.update(updateUser)){
            return Result.success("更新数据成功");
        }else {
            return Result.error("更新数据失败");
        }
    }
}
