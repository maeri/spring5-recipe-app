package guru.springframework.services;

import guru.springframework.domain.Recipe;

/**
 * @author zawadma
 * @date 04/01/2021 12:28
 */
public interface RecipeService {
		Iterable<Recipe> getRecipes();
}
