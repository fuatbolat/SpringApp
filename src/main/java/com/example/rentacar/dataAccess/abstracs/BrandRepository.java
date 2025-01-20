package com.example.rentacar.dataAccess.abstracs;

import com.example.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository {

    List<Brand> getAll();
}
