package com.areaazure.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AreaService {
    List<Area> areas = new ArrayList<>();

    public Area save(Area d) {
        areas.add(d);
        return d;
    }

    public List<Area> findAll() {
        return areas;
    }
}
