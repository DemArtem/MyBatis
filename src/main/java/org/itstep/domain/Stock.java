package org.itstep.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.itstep.domain.Product;
import org.itstep.domain.Warehouse;

@Data
@Accessors(chain = true)
public class Stock {
    private Product product;
    private Warehouse warehouse;
    private int count;
}