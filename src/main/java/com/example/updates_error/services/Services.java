package com.example.updates_error.services;

import com.example.updates_error.tablitsa.SecondTable;

import java.util.List;
import java.util.Optional;

public interface Services {

    public List<SecondTable> malumotniOlish();

    public Optional<SecondTable> idBilanOlish(long ids);

    public SecondTable malumotniSaqlash(SecondTable secondTable);

    public SecondTable malumotniYangilash(SecondTable secondTable);

    public void malumotniIdBilanUchirish(long ids);

}
