package com.example.rentacar.webapi.controllers;


import com.example.rentacar.business.abstracts.BrandService;
import com.example.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private final BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getall")
    public List<Brand> getAllBrands() {
        return brandService.getAllBrands();
    }

}
