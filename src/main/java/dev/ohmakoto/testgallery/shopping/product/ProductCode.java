package dev.ohmakoto.testgallery.shopping.product;

import lombok.NonNull;

public class ProductCode {
    private final String id;

    public ProductCode(@NonNull String id) {
        int length = id.length();
        if (length > 10 || length < 1) {
            throw new IllegalArgumentException(
                    "The length of Product Code must be at least 1 characters and no more than 10. Input:" + id);
        }
        this.id = id;
    }

    public String value() {
        return id;
    }
}
