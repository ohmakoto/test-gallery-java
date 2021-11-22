package dev.ohmakoto.testgallery.shopping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Seller {
    private final SellerId id;
    private final SellerName name;
    private final SellerType type;
}
