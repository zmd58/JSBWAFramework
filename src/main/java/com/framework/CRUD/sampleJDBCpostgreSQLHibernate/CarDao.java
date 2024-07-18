package com.framework.CRUD.sampleJDBCpostgreSQLHibernate;

import java.util.*;
import java.util.stream.Collectors;

public class CarDao implements Dao<Car> {
    private List<Car> carList = new ArrayList<>();

    @Override
    public Optional<Car> get(int id) {
        return Optional.ofNullable(carList.get(id));
    }

    @Override
    public Collection<Car> getAll() {
        return carList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    @Override
    public void save(Car car) {
        carList.add(car);
    }

    @Override
    public void update(Car car) {
        carList.set(car.id(), car);
    }

    @Override
    public void delete(Car car) {
        carList.set(car.id(), null);
    }
}
