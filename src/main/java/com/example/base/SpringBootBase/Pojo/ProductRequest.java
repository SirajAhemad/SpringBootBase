package com.example.base.SpringBootBase.Pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductRequest implements Serializable {

    @JsonProperty("id")
    private int id;

    @JsonProperty("price")
    private String price;

    @JsonProperty("qty")
    private String qty;

    @JsonProperty("quoteQty")
    private String quoteQty;

    @JsonProperty("time")
    private Object time;

    @JsonProperty("isBuyerMaker")
    private boolean isBuyerMaker;

    @JsonProperty("isBestMatch")
    private boolean isBestMatch;


}
