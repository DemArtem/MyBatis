package org.itstep.repository;

import org.apache.ibatis.annotations.Mapper;
import org.itstep.domain.Product;
import java.util.List;

@Mapper
public interface ProductRepository {

    void save(Product product);

    List<Product> findAll();
}