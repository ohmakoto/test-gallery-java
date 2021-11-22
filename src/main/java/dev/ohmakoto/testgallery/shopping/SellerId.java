package dev.ohmakoto.testgallery.shopping;

import lombok.NonNull;

public class SellerId {
    private final String id;

    public SellerId(@NonNull String id) {
        int length = id.length();
        if (length > 10 || length < 5) {
            throw new IllegalArgumentException(
                    "The length of Seller ID must be at least 5 characters and no more than 10. Input:" + id);
        }

        this.id = id;
    }

    public String value() {
        return this.id;
    }
}
