package dev.ohmakoto.testgallery.shopping.price;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaxIncluded {
    private final int price;

    public NonTaxedPrice nonTaxedPrice() {
        return new NonTaxedPrice((int) (price * 0.09));
    }

    public int value() {
        return price;
    }
}
