package com.framework.CRUD.sampleJDBC;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * Repository interface to perform SOLID - I aka Interface segregation
 *
 */
@Repository
public interface SampleObjectIRepository {
    List<SampleObject> findAll();
    Optional<SampleObject> findById(Integer id);
    void create(SampleObject sampleObject);
    void update(SampleObject sampleObject, Integer id);
    void delete(Integer id);
    int count();
    void saveAll(List<SampleObject> sampleObjectList);
    List<SampleObject> findByOption(Option option);
}
