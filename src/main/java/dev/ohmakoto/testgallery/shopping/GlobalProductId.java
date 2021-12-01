package dev.ohmakoto.testgallery.shopping;

import dev.ohmakoto.testgallery.shopping.product.ProductCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GlobalProductId {
    private final SellerId sellerId;
    private final ProductCode productCode;

    public String value() {
        return new StringBuilder()
                .append(sellerId.value())
                .append("-")
                .append(productCode.value())
                .toString();
    }
}
