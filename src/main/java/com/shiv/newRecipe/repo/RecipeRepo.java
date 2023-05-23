package com.shiv.newRecipe.repo;


import com.shiv.newRecipe.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe,Integer> {
    Recipe findByName(String name);
}
