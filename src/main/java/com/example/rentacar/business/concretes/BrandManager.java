package com.example.rentacar.business.concretes;

import com.example.rentacar.business.abstracts.BrandService;
import com.example.rentacar.dataAccess.abstracs.BrandRepository;
import com.example.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandService {

    BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.getAll();
    }
}
