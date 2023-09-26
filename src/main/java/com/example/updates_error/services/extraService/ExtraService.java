package com.example.updates_error.services.extraService;

import com.example.updates_error.repositories.Repositories;
import com.example.updates_error.services.Services;
import com.example.updates_error.tablitsa.SecondTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@Service
public class ExtraService implements Services {

    @Autowired
    private final Repositories repositories;

    public ExtraService (Repositories repositories) {
        this.repositories = repositories;
    }

    @Override
    public List<SecondTable> malumotniOlish() {
        return repositories.findAll();
    }

    @Override
    public Optional<SecondTable> idBilanOlish(@PathVariable long ids) {
        return repositories.findById(ids);
    }

    @Override
    public SecondTable malumotniSaqlash(@RequestBody SecondTable secondTable) {
        return repositories.save(secondTable);
    }

    @Override
    public SecondTable malumotniYangilash(@RequestBody SecondTable secondTable) {
        return repositories.save(secondTable);
    }

    @Override
    public void malumotniIdBilanUchirish(@PathVariable long ids) {
        repositories.deleteById(ids);
    }


}
