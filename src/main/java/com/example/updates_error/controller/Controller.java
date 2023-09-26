package com.example.updates_error.controller;


import com.example.updates_error.services.extraService.ExtraService;
import com.example.updates_error.tablitsa.SecondTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/outpath")
public class Controller {

    @Autowired
    private final ExtraService extraService;

    public Controller (ExtraService extraService) {
        this.extraService = extraService;
    }


    @GetMapping("/inpath")
    public List <SecondTable> olish() {
        return extraService.malumotniOlish();
    }

    @GetMapping("/inpath/{ids}")
    public Optional<SecondTable> idOlish(@PathVariable long ids) {

        return extraService.idBilanOlish(ids);
    }


    @PostMapping("/inpath")
    public SecondTable saqlash(@RequestBody SecondTable secondTable) {
        return extraService.malumotniSaqlash(secondTable);
    }

    @PutMapping("/inpath")
    public SecondTable uzgartirish(@RequestBody SecondTable secondTable) {
        return extraService.malumotniYangilash(secondTable);
    }

    @DeleteMapping("/inpath/{ids}")
    public void uchirish(@PathVariable long ids) {
        extraService.malumotniIdBilanUchirish(ids);
    }

}
