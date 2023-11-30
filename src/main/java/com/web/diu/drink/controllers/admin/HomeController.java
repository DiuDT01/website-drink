package com.web.diu.drink.controllers.admin;

import com.web.diu.drink.model.Product;
import com.web.diu.drink.model.User;
import com.web.diu.drink.repository.ProductRepository;
import com.web.diu.drink.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private ProductRepository proRepo;
    @GetMapping("/admin/login")
    public String viewLoginAdmin() {
        return "login";
    }
    @PostMapping(value = "admin/home")
    public String loginPage(@RequestParam("username")String username, @RequestParam("pass")String password, Model model, HttpSession session){
        List<Product> list=proRepo.findAll();
        session.setAttribute("listProduct",list);
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);

        User response = userRepo.findByUsernameAndPassword(username, password);
        if (response == null) {
            model.addAttribute("result", "false");
            return "login";
        }
        session.setAttribute("user",response);
        return "admin/home";
    }
}
