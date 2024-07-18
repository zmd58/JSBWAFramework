package com.framework.CRUD.sampleJDBCh2;

import java.util.List;
import java.util.Optional;

public interface SampleObjectIRepository {
    List<SampleObject> findAll();
    Optional<SampleObject> findById(int id);
    void create(SampleObject sampleObject);
    void update(SampleObject sampleObject, int id);
    void delete(int id);
}
