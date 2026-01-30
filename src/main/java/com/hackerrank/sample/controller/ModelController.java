package com.hackerrank.sample.controller;

import com.hackerrank.sample.model.Model;
import com.hackerrank.sample.service.ModelService;
import java.util.List;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ModelController {
    @Autowired
    private ModelService modelService;

    @GetMapping("/")
    public String home() {
        return "Default Java 21 Project Home Page";
    }

    @RequestMapping(value = "/model", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED) //201
    public void createNewModel(@RequestBody @Valid Model model) {
        /* write your code here */
        modelService.createModel(model);
    }

    @RequestMapping(value = "/erase", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK) //200
    public void deleteAllModels() {
        /* write your code here */
        modelService.deleteAllModels();
    }

    //@PathVariable was added to extract the id directly from the URL path segment.
    @RequestMapping(value = "/model/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteModelById(@PathVariable Integer id) {
        /* write your code here */
        modelService.deleteModelById(id);
    }

    @RequestMapping(value = "/model", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Model> getAllModels() {
        /* write your code here */
        return modelService.getAllModels();
    }

    @RequestMapping(value = "/model/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Model getModelById(@PathVariable Integer id) {
        /* write your code here */
        return modelService.getModelById(id);
    }
}
