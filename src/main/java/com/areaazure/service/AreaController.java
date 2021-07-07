package com.areaazure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService service;

    @PostMapping
    public Area create(@RequestBody Area d) {
        return service.save(d);
    }

    @GetMapping
    public List<Area> findAll() {
        return service.findAll();
    }
}
