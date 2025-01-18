package com.java.rk;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.java.rk.model.Product;
import com.java.rk.repository.ProductRepository;
import com.java.rk.service.ProductService;

import static org.mockito.Mockito.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    private final ProductRepository productRepository = mock(ProductRepository.class);
    private final ProductService productService = new ProductService(productRepository);

    @Test
    void testCreateProduct() {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(10.0);

        when(productRepository.save(product)).thenReturn(product);

        Product createdProduct = productService.createProduct(product);
        assertEquals("Test Product", createdProduct.getName());
    }

    @Test
    void testGetProductById() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");

        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        Optional<Product> foundProduct = productService.getProductById(1L);
        assertTrue(foundProduct.isPresent());
        assertEquals("Test Product", foundProduct.get().getName());
    }
}
