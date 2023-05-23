package com.shiv.newRecipe.controller;


import com.shiv.newRecipe.model.Recipe;
import com.shiv.newRecipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recipe")
public class RecipeController {
    @Autowired
    RecipeService recipeService;
    @PostMapping()
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
    }

    @GetMapping()
    public List<Recipe> getRecipe(){
        return recipeService.getRecipe();
    }

    @PutMapping("/{id}")
    public String updateRecipe(@RequestBody Recipe recipe,@PathVariable Integer id){
        return recipeService.updateRecipe(recipe,id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Integer id){
        return recipeService.deleteById(id);
    }

}
