package com.example.rentacar.business.concretes;

import com.example.rentacar.business.abstracts.BrandService;
import com.example.rentacar.business.requests.CreateBrandRequest;
import com.example.rentacar.business.responses.GetAllBrandsResponse;
import com.example.rentacar.dataAccess.abstracs.BrandRepository;
import com.example.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BrandManager implements BrandService {
    @Autowired
    BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAllBrands() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> responses = new ArrayList<>();
        for (Brand brand : brands) {
            GetAllBrandsResponse response = new GetAllBrandsResponse();
            response.setId(brand.getId());
            response.setName(brand.getName());
            responses.add(response);
        }

        return responses;
    }

    @Override
    public void addBrand(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());

        brandRepository.save(brand);

    }




}
