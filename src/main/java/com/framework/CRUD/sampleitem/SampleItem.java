package com.framework.CRUD.sampleitem;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record SampleItem(
        int id,
        @NotNull
        String name,
        String description,
        @Positive
        BigDecimal price,
        SampleType sampleType
) {

}
