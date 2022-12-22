package com.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzeriaShilov/")
public class AdminController {



    //тут м добавим метод добавления пицц в БД
    @RequestMapping("admin")
    public String firstPageAdmin() {
        return "admin";
    }

}
