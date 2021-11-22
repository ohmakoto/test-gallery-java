package dev.ohmakoto.testgallery.shopping.price;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 販売価格
 */
@RequiredArgsConstructor
public class SellingPrice {
    @Getter
    private final TaxIncluded taxIncluded;

    @Getter
    private final PremiumPrice premiumPrice;

    public SellingPrice(@NonNull TaxIncluded taxIncluded) {
        this(taxIncluded, new PremiumPrice(taxIncluded.value()));
    }
}
