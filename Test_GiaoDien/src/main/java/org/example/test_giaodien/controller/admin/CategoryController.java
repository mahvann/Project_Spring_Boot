package org.example.test_giaodien.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class CategoryController {
    @GetMapping("/category")
    public String index(){
        return "admin/category/index";
    }

    @RequestMapping("/add-category")
    public String add(){
        return "admin/category/add";
    }
}
