package com.web.diu.drink.controllers.customer;

import com.web.diu.drink.model.Cart;
import com.web.diu.drink.model.Product;
import com.web.diu.drink.model.User;
import com.web.diu.drink.repository.CartRepository;
import com.web.diu.drink.repository.ProductRepository;
import com.web.diu.drink.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CartController {
    @Autowired
    private final ProductRepository productRepository;
    @Autowired
    private final CartRepository cartRepository;
    @Autowired
    private final UserRepository userRepository;

    public CartController(ProductRepository productRepository, CartRepository cartRepository, UserRepository userRepository) {
        this.productRepository = productRepository;
        this.cartRepository = cartRepository;
        this.userRepository = userRepository;
    }


    @PostMapping("/cart/{idProduct}")
    public String addToCart(@PathVariable("idProduct") int id, HttpSession session) {
        List<Product> list = (List<Product>) session.getAttribute("listProduct");
        User user = (User) session.getAttribute("user");

        Product p = new Product();
        for (Product i : list)
            if (i.getId() == id) {
                p = i;
                break;
            }
        //set data vao cart
        Cart cart = new Cart();
        cart.setProduct(p);
        cart.setUser(user);
        cart.setQuantity(1);
        cart.setTotal(p.getPrice());
        cartRepository.save(cart);

        //luu cart vao session
        List<Cart> listCart = cartRepository.findAll();
        session.setAttribute("listCart", listCart);

        return "customer/cart";
    }
    @GetMapping("/delete/{idCart}")
    public String delete(@PathVariable("idCart") int id, HttpSession session) {
        //lay list cart roi xoa theo id, sau do cap nhat lai session
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        for (Cart i : listCart) {
            if (i.getId() == id) {
                cartRepository.deleteById(id);
                listCart.remove(i);
                break;
            }
        }
        session.setAttribute("listCart", listCart);
        return "customer/cart";
    }
    @GetMapping("/customer/cart")
    public String moveToCart(HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<Cart> listCart = cartRepository.findAll();
        session.setAttribute("listCart", listCart);
        return "customer/cart";
    }

    @GetMapping("/cart/update/{idCart}")
    public String updateCart() {

        return "customer/cart";
    }
}
