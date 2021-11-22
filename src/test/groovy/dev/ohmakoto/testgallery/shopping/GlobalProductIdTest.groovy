package dev.ohmakoto.testgallery.shopping

import dev.ohmakoto.testgallery.shopping.product.ProductCode
import spock.lang.Specification

class GlobalProductIdTest extends Specification {
    def "GlobalProductIdはSellerIdとProductIdを-で繋いだもの"() {
        when:
        var id = new GlobalProductId(new SellerId("sellerId"), new ProductCode("012345"))

        then:
        id.value() == "sellerId-012345"
    }
}
