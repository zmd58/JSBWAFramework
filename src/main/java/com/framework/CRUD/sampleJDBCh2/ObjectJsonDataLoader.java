package com.framework.CRUD.sampleJDBCh2;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.asm.TypeReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * Loading data from JSON file and then map it into a record containing a list of object.
 * Then save all those objects into the in-memory database aka H2
 * Logging to the commandline in the process
 *
 */
@Component
public class ObjectJsonDataLoader implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ObjectJsonDataLoader.class);
    private final SampleObjectIRepository sampleObjectIRepository;
    private final ObjectMapper objectMapper;

    public ObjectJsonDataLoader(SampleObjectIRepository sampleObjectIRepository, ObjectMapper objectMapper) {
        this.sampleObjectIRepository = sampleObjectIRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        if (sampleObjectIRepository.count() == 0) {
             try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/objects.json")) {
                 SampleObjects allObjects = objectMapper.readValue(inputStream, SampleObjects.class);
                 log.info("Reading {} objects from JSON data and saving to in-memory collection.", allObjects.objects().size());
                 sampleObjectIRepository.saveAll(allObjects.objects());
             } catch (IOException e) {
                 throw new RuntimeException("Failed to read JSON data", e);
             }
        } else {
            log.info("Not loading Objects from JSON because the collection contains data");
        }
    }
}
