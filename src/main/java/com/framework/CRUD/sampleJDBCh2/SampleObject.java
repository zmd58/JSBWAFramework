package com.framework.CRUD.sampleJDBCh2;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record SampleObject(
        int id,
        @NotNull
        String title,
        String description,
        @Positive
        BigDecimal price,
        Option option
) {

}
