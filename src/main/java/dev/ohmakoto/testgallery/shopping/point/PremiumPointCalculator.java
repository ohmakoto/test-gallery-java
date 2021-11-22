package dev.ohmakoto.testgallery.shopping.point;

import dev.ohmakoto.testgallery.shopping.price.PremiumPrice;
import dev.ohmakoto.testgallery.shopping.user.UserClass;

class PremiumPointCalculator {
    public Point calc(PremiumPrice price, UserClass userCls) {
        switch (userCls) {
            case NORMAL:
                throw new IllegalArgumentException();
            case PREMIUM:
                return new Point((int) (price.value() * 0.1));
            case SUPER_PREMIUM:
                return new Point((int) (price.value() * 0.2));
        }
        return null;
    }
}
