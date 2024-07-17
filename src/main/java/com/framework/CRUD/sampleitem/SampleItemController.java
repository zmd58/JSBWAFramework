package com.framework.CRUD.sampleitem;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SampleItemController {

<<<<<<< HEAD
<<<<<<< HEAD
    private final SampleItemIRepository sampleItemIRepository;

    public SampleItemController(SampleItemIRepository sampleItemIRepository) {
        this.sampleItemIRepository = sampleItemIRepository;
=======
    private final SampleItemRepository sampleItemRepository;

    public SampleItemController(SampleItemRepository sampleItemRepository) {
        this.sampleItemRepository = sampleItemRepository;
>>>>>>> 138388e (added .http file)
=======
    private final SampleItemIRepository sampleItemIRepository;

    public SampleItemController(SampleItemIRepository sampleItemIRepository) {
        this.sampleItemIRepository = sampleItemIRepository;
>>>>>>> 81bd8e1 (renamed repository classes)
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    List<SampleItem> getAllItems() {
<<<<<<< HEAD
<<<<<<< HEAD
        return sampleItemIRepository.findAll();
=======
        return sampleItemRepository.findAll();
>>>>>>> 138388e (added .http file)
=======
        return sampleItemIRepository.findAll();
>>>>>>> 81bd8e1 (renamed repository classes)
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    SampleItem getItemById(@PathVariable int id) {
<<<<<<< HEAD
<<<<<<< HEAD
        Optional<SampleItem> item = sampleItemIRepository.findById(id);
=======
        Optional<SampleItem> item = sampleItemRepository.findById(id);
>>>>>>> 138388e (added .http file)
=======
        Optional<SampleItem> item = sampleItemIRepository.findById(id);
>>>>>>> 81bd8e1 (renamed repository classes)
        if (item.isEmpty()) {
            throw new SampleItemNotFoundException();
        }
        return item.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
<<<<<<< HEAD
    void createItem(@RequestBody SampleItem sampleItem) {
<<<<<<< HEAD
        sampleItemIRepository.create(sampleItem);
=======
        sampleItemRepository.create(sampleItem);
>>>>>>> 138388e (added .http file)
=======
    void createItem(@Valid @RequestBody SampleItem sampleItem) {
        sampleItemIRepository.create(sampleItem);
>>>>>>> 81bd8e1 (renamed repository classes)
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
<<<<<<< HEAD
    void updateItem(@RequestBody SampleItem sampleItem, @PathVariable int id) {
<<<<<<< HEAD
        sampleItemIRepository.update(sampleItem, id);
=======
        sampleItemRepository.update(sampleItem, id);
>>>>>>> 138388e (added .http file)
=======
    void updateItem(@Valid @RequestBody SampleItem sampleItem, @PathVariable int id) {
        sampleItemIRepository.update(sampleItem, id);
>>>>>>> 81bd8e1 (renamed repository classes)
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id) {
<<<<<<< HEAD
<<<<<<< HEAD
        sampleItemIRepository.delete(id);
=======
        sampleItemRepository.delete(id);
>>>>>>> 138388e (added .http file)
=======
        sampleItemIRepository.delete(id);
>>>>>>> 81bd8e1 (renamed repository classes)
    }

}
