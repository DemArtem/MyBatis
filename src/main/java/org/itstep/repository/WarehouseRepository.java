package org.itstep.repository;

import org.apache.ibatis.annotations.Mapper;
import org.itstep.domain.Warehouse;

@Mapper
public interface WarehouseRepository {

    void save(Warehouse warehouse);

    Warehouse findOne(int id);
}