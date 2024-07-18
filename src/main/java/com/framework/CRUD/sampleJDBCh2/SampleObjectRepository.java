package com.framework.CRUD.sampleJDBCh2;

import com.framework.CRUD.samplebasic.SampleItem;
import com.framework.CRUD.samplebasic.SampleItemIRepository;

import java.util.List;
import java.util.Optional;

public class SampleObjectRepository implements SampleItemIRepository {
    @Override
    public List<SampleItem> findAll() {
        return null;
    }

    @Override
    public Optional<SampleItem> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void create(SampleItem sampleItem) {

    }

    @Override
    public void update(SampleItem sampleItem, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
