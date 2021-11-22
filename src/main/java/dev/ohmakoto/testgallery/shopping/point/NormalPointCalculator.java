package dev.ohmakoto.testgallery.shopping.point;

import dev.ohmakoto.testgallery.shopping.price.NonTaxedPrice;

public class NormalPointCalculator {
    public Point calc(NonTaxedPrice product) {
        return new Point((int) (product.value() * 0.01));
    }
}
