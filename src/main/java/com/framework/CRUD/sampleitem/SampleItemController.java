package com.framework.CRUD.sampleitem;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SampleItemController {

    private final SampleItemIRepository sampleItemIRepository;

    public SampleItemController(SampleItemIRepository sampleItemIRepository) {
        this.sampleItemIRepository = sampleItemIRepository;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    List<SampleItem> getAllItems() {
        return sampleItemIRepository.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    SampleItem getItemById(@PathVariable int id) {
        Optional<SampleItem> item = sampleItemIRepository.findById(id);
        if (item.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return item.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    void createItem(@RequestBody SampleItem sampleItem) {
        sampleItemIRepository.create(sampleItem);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void updateItem(@RequestBody SampleItem sampleItem, @PathVariable int id) {
        sampleItemIRepository.update(sampleItem, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id) {
        sampleItemIRepository.delete(id);
    }

}
