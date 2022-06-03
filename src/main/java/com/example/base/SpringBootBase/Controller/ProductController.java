package com.example.base.SpringBootBase.Controller;

import com.example.base.SpringBootBase.Constants.ApplicationURLConstants;
import com.example.base.SpringBootBase.Model.Product;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping(ApplicationURLConstants.PRODUCT)
public class ProductController extends BaseController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(ApplicationURLConstants.GET_PRODUCT)
    public ResponseEntity<Object> getProducts(){

        UriComponentsBuilder builder = UriComponentsBuilder
                .fromHttpUrl("https://api.binance.com/api/v3/trades")
               .queryParam("symbol","ETHUSDT")
                .queryParam("limit","1000");
        final String URL = builder.toUriString();
        ResponseEntity<?> response = null;

        System.out.println("Siraj : Cursor inside controller");

        try {

            response = restTemplate
                    .getForEntity(URL, Product.class);
            System.out.println(response);


            ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            String json = mapper.writeValueAsString(response);

            Product productRequest = mapper.readValue(json,Product.class);
            getServiceRegistry().getProductService().saveProduct(productRequest);

        }catch (RestClientException e){
            if(e instanceof HttpStatusCodeException){
                String errorResponse=((HttpStatusCodeException)e).getResponseBodyAsString();
                System.out.println("error-response = "+errorResponse);

            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok(getCommonServices().generateGenericSuccessResponse(response));

    }

}
