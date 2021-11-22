package dev.ohmakoto.testgallery.shopping.point;

import dev.ohmakoto.testgallery.shopping.product.Product;
import dev.ohmakoto.testgallery.shopping.user.UserClass;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PointCalculator {
    private final NormalPointCalculator normalPointCalculator;
    private final PremiumPointCalculator premiumPointCalculator;

    public Point calc(Product product, UserClass userCls) {
        if (userCls == UserClass.NORMAL) {
            return normalPointCalculator.calc(product.getPrice().getTaxIncluded().nonTaxedPrice());
        } else {
            return premiumPointCalculator.calc(product.getPrice().getPremiumPrice(), userCls);
        }
    }
}
