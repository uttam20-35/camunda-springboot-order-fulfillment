package com.crossasyst.camunda.mapper;

import com.crossasyst.camunda.entity.ProductEntity;
import com.crossasyst.camunda.model.Product;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-08T12:46:02+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductEntity modelToEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setProductName( product.getProductName() );
        productEntity.setPrize( product.getPrize() );

        return productEntity;
    }

    @Override
    public Product entityToModel(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductName( productEntity.getProductName() );
        product.setPrize( productEntity.getPrize() );

        return product;
    }
}
