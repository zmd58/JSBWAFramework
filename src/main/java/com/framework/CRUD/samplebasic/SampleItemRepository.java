//package com.framework.CRUD.samplebasic;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class SampleItemRepository implements SampleItemIRepository {
//    List<SampleItem> sampleItems = new ArrayList<>();
//
//    @Override
//    public List<SampleItem> findAll() {
//        return sampleItems;
//    }
//
//    @Override
//    public Optional<SampleItem> findById(int id) {
//        return sampleItems.stream().filter(sampleItem -> sampleItem.id() == id).findFirst();
//    }
//
//    @Override
//    public void create(SampleItem sampleItem) {
//        sampleItems.add(sampleItem);
//    }
//
//    @Override
//    public void update(SampleItem sampleItem, int id) {
//        Optional<SampleItem> existItem = findById(id);
//        existItem.ifPresent(value -> sampleItems.set(sampleItems.indexOf(value), sampleItem));
//    }
//
//    @Override
//    public void delete(int id) {
//        sampleItems.remove(sampleItems.stream().filter(sampleItem -> sampleItem.id() == id).findFirst().get());
//    }
//
//    @PostConstruct
//    private void init() {
//        sampleItems.add(new SampleItem(1, "Item 1", "Item 1 Description", BigDecimal.valueOf(100), Category.A));
//        sampleItems.add(new SampleItem(2, "Item 2", "Item 2 Description", BigDecimal.valueOf(1000), Category.B));
//        sampleItems.add(new SampleItem(3, "Item 3", "Item 1 Description", BigDecimal.valueOf(10000), Category.C));
//    }
//}
