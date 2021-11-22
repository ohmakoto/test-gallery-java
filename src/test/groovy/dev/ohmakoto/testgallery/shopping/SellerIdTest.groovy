package dev.ohmakoto.testgallery.shopping

import spock.lang.Specification

class SellerIdTest extends Specification {

    def "StoreIDは5文字以上10文字以下である必要がある"() {
        when:
        new SellerId(pattern)

        then:
        thrown IllegalArgumentException

        where:
        pattern | e
        "aaaa"  | "ss"
    }
}
