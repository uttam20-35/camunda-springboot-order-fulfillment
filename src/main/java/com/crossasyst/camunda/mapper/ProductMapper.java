package com.crossasyst.camunda.mapper;

/*import com.crossasyst.camunda.camundaorderfulfillment.entity.ProductEntity;
import com.crossasyst.camunda.camundaorderfulfillment.model.Product;*/
import com.crossasyst.camunda.entity.ProductEntity;
import com.crossasyst.camunda.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductEntity modelToEntity(Product product);

    Product entityToModel(ProductEntity productEntity);
}
