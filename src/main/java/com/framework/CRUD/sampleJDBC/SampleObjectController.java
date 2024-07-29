package com.framework.CRUD.sampleJDBC;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * Sample endpoints connecting through the repository interface
 * to better complies with SOLID aka I - Interface segregation
 *
 * Create/Read/Update/Delete
 */
@RequestMapping("/h2")
@RestController
public class SampleObjectController {

    private final SampleObjectIRepository sampleObjectIRepository;

    public SampleObjectController(SampleObjectIRepository sampleObjectIRepository) {
        this.sampleObjectIRepository = sampleObjectIRepository;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    List<SampleObject> findAll() {
       return sampleObjectIRepository.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    SampleObject findById(@PathVariable int id) {
        Optional<SampleObject> object = sampleObjectIRepository.findById(id);
        if (object.isEmpty()) {
            throw new SampleObjectNotFoundException();
        }
        return object.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    void create(@Valid @RequestBody SampleObject sampleObject) {
        Optional<SampleObject> object = sampleObjectIRepository.findById(sampleObject.id());
        if (!object.isEmpty()) {
            throw new SampleObjectFoundException();
        }
        sampleObjectIRepository.create(sampleObject);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@Valid @RequestBody SampleObject sampleObject, @PathVariable int id) {
        Optional<SampleObject> object = sampleObjectIRepository.findById(id);
        if (object.isEmpty()) {
            throw new SampleObjectNotFoundException();
        }
        sampleObjectIRepository.update(sampleObject, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable int id) {
        Optional<SampleObject> object = sampleObjectIRepository.findById(id);
        if (object.isEmpty()) {
            throw new SampleObjectNotFoundException();
        }
        sampleObjectIRepository.delete(id);
    }

}
