package com.example.rentacar.business.abstracts;

import com.example.rentacar.business.requests.CreateBrandRequest;
import com.example.rentacar.business.responses.GetAllBrandsResponse;
import com.example.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAllBrands();

    void addBrand(CreateBrandRequest createBrandRequest);

}
