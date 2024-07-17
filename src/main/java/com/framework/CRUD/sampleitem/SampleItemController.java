package com.framework.CRUD.sampleitem;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SampleItemController {

<<<<<<< HEAD
    private final SampleItemIRepository sampleItemIRepository;

    public SampleItemController(SampleItemIRepository sampleItemIRepository) {
        this.sampleItemIRepository = sampleItemIRepository;
=======
    private final SampleItemRepository sampleItemRepository;

    public SampleItemController(SampleItemRepository sampleItemRepository) {
        this.sampleItemRepository = sampleItemRepository;
>>>>>>> 138388e (added .http file)
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    List<SampleItem> getAllItems() {
<<<<<<< HEAD
        return sampleItemIRepository.findAll();
=======
        return sampleItemRepository.findAll();
>>>>>>> 138388e (added .http file)
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    SampleItem getItemById(@PathVariable int id) {
<<<<<<< HEAD
        Optional<SampleItem> item = sampleItemIRepository.findById(id);
=======
        Optional<SampleItem> item = sampleItemRepository.findById(id);
>>>>>>> 138388e (added .http file)
        if (item.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return item.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    void createItem(@RequestBody SampleItem sampleItem) {
<<<<<<< HEAD
        sampleItemIRepository.create(sampleItem);
=======
        sampleItemRepository.create(sampleItem);
>>>>>>> 138388e (added .http file)
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void updateItem(@RequestBody SampleItem sampleItem, @PathVariable int id) {
<<<<<<< HEAD
        sampleItemIRepository.update(sampleItem, id);
=======
        sampleItemRepository.update(sampleItem, id);
>>>>>>> 138388e (added .http file)
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id) {
<<<<<<< HEAD
        sampleItemIRepository.delete(id);
=======
        sampleItemRepository.delete(id);
>>>>>>> 138388e (added .http file)
    }

}
