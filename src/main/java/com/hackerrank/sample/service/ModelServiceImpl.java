package com.hackerrank.sample.service;

import com.hackerrank.sample.exception.BadResourceRequestException;
import com.hackerrank.sample.exception.NoSuchResourceFoundException;
import com.hackerrank.sample.model.Model;

import java.util.*;

import org.springframework.stereotype.Service;

@Service("modelService")
public class ModelServiceImpl implements ModelService{

    //In-memory storage used to keep insertion, as required by test cases.
    private final Map<Integer,Model> storage = new LinkedHashMap<>(); //I use final to keep the memory reference for storage

    @Override
    public void deleteAllModels() {
        storage.clear();
    }

    @Override
    public void deleteModelById(Integer id) {
        storage.remove(id);
    }

    // Reject duplicated IDs as defined by the test scenarios (HTTP 400)
    @Override
    public void createModel(Model model) {
        if (storage.containsKey(model.getId())) {
            throw new BadResourceRequestException("Model with same id exists");
        }
        storage.put(model.getId(), model);
    }

    // Throw exception is there was no item found as defined by the test scenarios (HTTP 404)
    @Override
    public Model getModelById(Integer id) {
        if(!storage.containsKey(id)) {
            throw new NoSuchResourceFoundException("Model with this id not found");
        }
        return storage.get(id);
    }

    @Override
    public List<Model> getAllModels() {
        return new ArrayList<>(storage.values());
    }

}
