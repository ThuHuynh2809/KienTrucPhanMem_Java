package com.example.KienTrucPhanMem_Tuan07.repositories;

import com.example.KienTrucPhanMem_Tuan07.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

}
