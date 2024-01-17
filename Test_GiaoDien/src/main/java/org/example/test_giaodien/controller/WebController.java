package org.example.test_giaodien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    // Đón nhận request GET
    @GetMapping("/") // Nếu người dùng request tới địa chỉ "/"
    public String index() {
        return "index"; // Trả về file index.html
    }
}
