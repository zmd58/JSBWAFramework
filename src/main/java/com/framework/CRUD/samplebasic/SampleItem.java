package com.framework.CRUD.samplebasic;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record SampleItem(
        int id,
        @NotNull
        String title,
        String description,
        @Positive
        BigDecimal price,
        Category category
) {

}
