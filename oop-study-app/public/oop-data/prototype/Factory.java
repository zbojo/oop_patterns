package com.company.prototype;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private Map<Class, Product> products;

    public Factory() {
        this.products = new HashMap<>();
        this.products.put(Chair.class, new Chair("quality chair", true));
        this.products.put(Table.class, new Table("kitchen table", false));
    }

    public <P extends Product> P createProduct(Class<P> c) {
        return (P) this.products.get(c).createClone();
    }
}
