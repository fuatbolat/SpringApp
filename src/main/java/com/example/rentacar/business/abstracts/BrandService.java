package com.example.rentacar.business.abstracts;

import com.example.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BrandService {

    List<Brand> getAllBrands();
}
