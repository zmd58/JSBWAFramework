package com.framework.CRUD.sampleJDBCh2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

/**
 *
 * Actual business logic of the repository
 * AKA coding with an interface
 *
 */
@Component
public class SampleObjectRepository implements SampleObjectIRepository {
    private static final Logger log = LoggerFactory.getLogger(SampleObjectRepository.class);
    private final JdbcClient jdbcClient;

    public SampleObjectRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public List<SampleObject> findAll() {
        return jdbcClient.sql("SELECT * FROM Objects")
                        .query(SampleObject.class)
                        .list();
    }

    @Override
    public Optional<SampleObject> findById(Integer id) {
        return jdbcClient.sql("SELECT id, title, description, price, option FROM Objects WHERE id == :id")
                .param("id", id)
                .query(SampleObject.class)
                .optional();
    }

    @Override
    public void create(SampleObject sampleObject) {
        var updated = jdbcClient.sql("INSERT INTO Objects (id, title, description, price, option) VALUES (?, ?, ?, ?, ?)")
                .params(List.of(sampleObject.id(), sampleObject.title(), sampleObject.description(), sampleObject.price(), sampleObject.option().toString()))
                .update();

        Assert.state(updated == 1, "Failed to create object " + sampleObject.title());
    }

    @Override
    public void update(SampleObject sampleObject, Integer id) {
        var updated = jdbcClient.sql("UPDATE Objects SET title = ? , description = ?, price = ?, option = ? WHERE id = ?")
                .params(List.of(sampleObject.title(), sampleObject.description(), sampleObject.price(), sampleObject.option().toString(), id))
                .update();

        Assert.state(updated == 1, "Failed to update object " + sampleObject.title());
    }

    @Override
    public void delete(Integer id) {
        var updated = jdbcClient.sql("DELETE FROM Objects WHERE id = :id")
                .param("id", id)
                .update();

        Assert.state(updated == 1, "Failed to delete object " + id);
    }

    @Override
    public int count() {
        return jdbcClient.sql("SELECT * FROM Objects")
                .query()
                .listOfRows()
                .size();
    }

    @Override
    public void saveAll(List<SampleObject> sampleObjectList) {
        sampleObjectList.forEach(this::create);
    }

    @Override
    public List<SampleObject> findByOption(Option option) {
        return jdbcClient.sql("SELECT * FROM Objects WHERE option = :option")
                .param("option", option)
                .query(SampleObject.class)
                .list();
    }
}
