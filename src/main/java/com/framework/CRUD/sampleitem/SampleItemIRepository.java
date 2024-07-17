package com.framework.CRUD.sampleitem;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SampleItemIRepository {
    List<SampleItem> findAll();
    Optional<SampleItem> findById(int id);
    void create(SampleItem sampleItem);
    void update(SampleItem sampleItem, int id);
    void delete(int id);

}
