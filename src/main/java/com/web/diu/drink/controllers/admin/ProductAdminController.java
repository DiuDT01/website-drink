package com.web.diu.drink.controllers.admin;

import com.web.diu.drink.model.Product;
import com.web.diu.drink.repository.ProductRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductAdminController {
    private final ProductRepository productRepository;

    public ProductAdminController(ProductRepository productRepo) {
        this.productRepository = productRepo;
    }

    @GetMapping("/admin")
    private String viewHomePage(Model model, HttpSession session) {
        List<Product> list=productRepository.findAll();
        session.setAttribute("listProduct",list);
        for(Product i: list)
            System.out.println(i.getLinkImg());
        return "admin/home";
    }

    @GetMapping("/admin/product/{id}")
    private String viewDetail(@PathVariable("id") int id, Model model) {
        Optional<Product> product = productRepository.findById(id);
        model.addAttribute("product", product.orElse(null));
        return "admin/product-management";
    }
}

