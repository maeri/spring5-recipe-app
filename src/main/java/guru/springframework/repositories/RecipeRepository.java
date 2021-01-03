package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author zawadma
 * @date 03/01/2021 22:33
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
