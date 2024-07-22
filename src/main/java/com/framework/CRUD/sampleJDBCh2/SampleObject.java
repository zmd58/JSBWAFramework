package com.framework.CRUD.sampleJDBCh2;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

/**
 *
 * Object model with 5 sample params including a demo of enum and BigDecimal for money variable type
 *
 * @param id
 * @param title
 * @param description
 * @param price
 * @param option
 */
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
