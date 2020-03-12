package com.shiro.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
@Api(value = "视图",tags = "跳转试图的控制器")
public class IndexController {

    @ApiOperation(value = "登陆页面",notes = "跳转登陆页面")
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @ApiOperation(value = "首页",notes = "跳转首页页面")
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @ApiOperation(value = "首页",notes = "跳转主体页面")
    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @ApiOperation(value = "菜单权限管理页面", notes = "权限管理页面")
    @GetMapping("/menus")
    public String menus(){
        return "menus/menu";
    }

    @ApiOperation(value = "跳转角色管理页面", notes = "角色管理页面")
    @GetMapping("/roles")
    public String roles(){
        return "roles/role";
    }

    @ApiOperation(value = "跳转部门管理页面",notes = "部门管理页面")
    @GetMapping("/depts")
    public String depts(){
        return "depts/dept";
    }

    @ApiOperation(value = "跳转用户管理页面",notes = "用户管理页面")
    @GetMapping("/users")
    public String users(){
        return "users/user";
    }

    @ApiOperation(value = "404",notes = "跳转404错误页面")
    @GetMapping("/404")
    public String error404(){
        return "error/404";
    }
}
