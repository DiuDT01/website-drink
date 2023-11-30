package com.web.diu.drink.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username,password;
    private String name, email;
    private int isadmin=0;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "cart_Id", referencedColumnName = "id")
    private Cart shoppingCart;
}
