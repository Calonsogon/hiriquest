package com.hiriquest.hiriquest.controller;

import com.hiriquest.hiriquest.model.Mision;
import com.hiriquest.hiriquest.service.MisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/misiones")
public class MisionController {
    @Autowired
    private MisionService misionService;

    @GetMapping
    public List<Mision> getAllMisiones() {
        return misionService.getAllMisiones();
    }

  @GetMapping("/{id}")
    public Mision getMisionById(@PathVariable Long id) {
        return misionService.getMisionById(id);
    }

    @PostMapping
    public Mision createMision(@RequestBody Mision mision) {
        return misionService.createMision(mision);
    }

   @PutMapping("/{id}")
    public Mision updateMision(@PathVariable Long id, @RequestBody Mision mision) {
        return misionService.updateMision(id, mision);
    }

    @DeleteMapping("/{id}")
    public void deleteMision(@PathVariable Long id) {
        misionService.deleteMision(id);
    }
} 
