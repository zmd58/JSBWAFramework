package com.framework.CRUD.sampleitem;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SampleItemController {

    private final SampleItemRepository sampleItemRepository;

    public SampleItemController(SampleItemRepository sampleItemRepository) {
        this.sampleItemRepository = sampleItemRepository;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    List<SampleItem> getAllItems() {
        return sampleItemRepository.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    SampleItem getItemById(@PathVariable int id) {
        Optional<SampleItem> item = sampleItemRepository.findById(id);
        if (item.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return item.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    void createItem(@RequestBody SampleItem sampleItem) {
        sampleItemRepository.create(sampleItem);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void updateItem(@RequestBody SampleItem sampleItem, @PathVariable int id) {
        sampleItemRepository.update(sampleItem, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id) {
        sampleItemRepository.delete(id);
    }

}
