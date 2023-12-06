package com.web.diu.drink.controllers;

import com.web.diu.drink.model.Product;
import com.web.diu.drink.model.User;
import com.web.diu.drink.repository.ProductRepository;
import com.web.diu.drink.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String viewHome(HttpSession session) {
        List<Product> list = productRepository.findAll();
        session.setAttribute("listProduct", list);
        return "index";
    }

    @GetMapping("/login")
    public String viewLogin() {
        return "login";
    }

    @GetMapping("/product/{id}")
    public String viewDetail(@PathVariable("id") int id, Model model) {
        Optional<Product> product = productRepository.findById(id);
        model.addAttribute("product", product.orElse(null));
        return "product-detail";
    }

    @PostMapping(value = "login")
    public String loginPage(@RequestParam("name") String name, @RequestParam("pass") String pass, Model model, HttpSession session) {
        List<Product> list = productRepository.findAll();
        session.setAttribute("listProduct", list);
        User user = new User();
        user.setUsername(name);
        user.setPassword(pass);

        User isadmin = userRepository.findByUsernameAndPassword(name, pass);
        if (isadmin == null) {
            model.addAttribute("result", "false");
            return "login";
        }
        System.out.println(isadmin.getId());
        session.setAttribute("user", isadmin);
        if (isadmin.getIsadmin() == 0)
            return "customer/home";
        return "admin/home";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.setAttribute("user",null);
        return "login";
    }
}
