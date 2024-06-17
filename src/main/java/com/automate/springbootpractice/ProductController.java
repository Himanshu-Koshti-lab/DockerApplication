package com.automate.springbootpractice;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    private ProductRepository productRepository;

    @GetMapping("/products")
    public Page<Product> getProducts(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "10") int size) {
        Product product = new Product();
        product.setId(1L);
        product.setName("asd");
        product.setPrice(20D);
        productRepository.save(product);
        return productService.getProducts(page, size);
    }
}
