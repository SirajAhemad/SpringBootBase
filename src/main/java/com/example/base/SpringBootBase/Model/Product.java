package com.example.base.SpringBootBase.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "price")
    private String price;

    @Column(name = "qty")
    private String qty;

    @Column(name = "quoteQty")
    private String quoteQty;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "isBuyerMaker")
    private boolean isBuyerMaker;

    @Column(name = "isBestMatch")
    private boolean isBestMatch;

}
