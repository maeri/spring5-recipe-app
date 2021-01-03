package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author zawadma
 * @date 03/01/2021 22:34
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
