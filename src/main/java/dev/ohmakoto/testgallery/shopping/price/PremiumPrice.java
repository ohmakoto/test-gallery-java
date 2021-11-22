package dev.ohmakoto.testgallery.shopping.price;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PremiumPrice {
    private final int price;

    public int value() {
        return price;
    }
}
