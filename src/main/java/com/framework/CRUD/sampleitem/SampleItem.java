package com.framework.CRUD.sampleitem;

import java.math.BigDecimal;

public record SampleItem(
        int id,
        String name,
        String description,
        BigDecimal price,
        SampleType sampleType
) {

}
