package com.framework.CRUD.sampleJDBCh2;

import java.util.List;

/**
 *
 * This record is use for reading objects from JSON file
 * using InputStream and ObjectMapper
 *
 * 'InputStream inputStream = TypeReference.class.getResourceAsStream("/data/objects.json")'
 * 'SampleObjects allObjects = objectMapper.readValue(inputStream, SampleObjects.class);'
 *
 * @param objects
 */
public record SampleObjects(
        List<SampleObject> objects
) {
}
