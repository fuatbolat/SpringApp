package com.example.rentacar.dataAccess.concretes;

import com.example.rentacar.dataAccess.abstracs.BrandRepository;
import com.example.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        this.brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"mercedes"));
        brands.add(new Brand(2,"bmw"));
        brands.add(new Brand(3,"samsung"));
        brands.add(new Brand(4,"samsung"));
        brands.add(new Brand(5,"samsung"));
    }



    @Override
    public List<Brand> getAll() {

        return brands;
    }
}
