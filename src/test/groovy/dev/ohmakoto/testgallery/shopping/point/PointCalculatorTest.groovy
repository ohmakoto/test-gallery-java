package dev.ohmakoto.testgallery.shopping.point

import dev.ohmakoto.testgallery.shopping.product.Product
import dev.ohmakoto.testgallery.shopping.user.UserClass
import spock.lang.Specification

class PointCalculatorTest extends Specification {
    def "通常会員の場合、通常会員用のポイント計算を行う"() {
        setup:
        def normalPointCalculator = Mock(NormalPointCalculator)
        def premiumPointCalculator = Mock(PremiumPointCalculator)
        def target = new PointCalculator(normalPointCalculator, premiumPointCalculator)

        when:
        target.calc(Stub(Product), UserClass.NORMAL)

        then:
        1 * normalPointCalculator.calc(_)
        0 * premiumPointCalculator.calc(_, _)
    }

    def "プレミアム会員の場合、プレミアム会員用のポイント計算を行う"() {
        setup:
        def normalPointCalculator = Mock(NormalPointCalculator)
        def premiumPointCalculator = Mock(PremiumPointCalculator)
        def target = new PointCalculator(normalPointCalculator, premiumPointCalculator)

        when:
        target.calc(Stub(Product), UserClass.PREMIUM)

        then:
        0 * normalPointCalculator.calc(_)
        1 * premiumPointCalculator.calc(_, UserClass.PREMIUM)
    }

    def "スーパープレミアム会員の場合、プレミアム会員用のポイント計算を行う"() {
        setup:
        def normalPointCalculator = Mock(NormalPointCalculator)
        def premiumPointCalculator = Mock(PremiumPointCalculator)
        def target = new PointCalculator(normalPointCalculator, premiumPointCalculator)

        when:
        target.calc(Stub(Product), UserClass.SUPER_PREMIUM)

        then:
        0 * normalPointCalculator.calc(_)
        1 * premiumPointCalculator.calc(_, UserClass.SUPER_PREMIUM)
    }
}
