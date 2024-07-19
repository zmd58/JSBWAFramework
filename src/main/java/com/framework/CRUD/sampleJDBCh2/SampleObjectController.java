package com.framework.CRUD.sampleJDBCh2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
}
