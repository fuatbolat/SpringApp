package com.example.rentacar.webapi.controllers;


import com.example.rentacar.business.abstracts.BrandService;
import com.example.rentacar.business.requests.CreateBrandRequest;
import com.example.rentacar.business.responses.GetAllBrandsResponse;
import com.example.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands-controller")
public class BrandsController {
    private final BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAllBrands() {
        return brandService.getAllBrands();
    }
    @PostMapping("/post")
    void createBrand(@RequestBody CreateBrandRequest createBrandRequest) {
        this.brandService.addBrand(createBrandRequest);
    }


}
