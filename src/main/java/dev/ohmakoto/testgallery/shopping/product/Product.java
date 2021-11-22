package dev.ohmakoto.testgallery.shopping.product;

import dev.ohmakoto.testgallery.shopping.price.SellingPrice;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 商品
 */
@RequiredArgsConstructor
public class Product {
    private final String name;
    @Getter
    private final SellingPrice price;
}
