package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

/**
 * @author zawadma
 * @date 04/01/2021 12:28
 */
@Service
class RecipeServiceImpl implements RecipeService {

	private RecipeRepository recipeRepository;

	RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Iterable<Recipe> getRecipes() {
		return recipeRepository.findAll();
	}
}
