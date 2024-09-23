package org.itstep.service;

import lombok.RequiredArgsConstructor;
import org.itstep.domain.Product;
import org.itstep.domain.Stock;
import org.itstep.domain.Warehouse;
import org.itstep.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StockService {

    private final StockRepository repository;

    public Stock save(Stock stock) {
        repository.save(stock);
        return stock;
    }

    public List<Stock> getAllByWarehouse(Warehouse warehouse) {
        return repository.findStockByWarehouse(warehouse);
    }

    public Stock getBy(Warehouse warehouse, Product product) {
        return repository.findStockByWarehouseAndProduct(warehouse.getId(), product.getId());
    }
}