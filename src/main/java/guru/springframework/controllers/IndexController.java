package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zawadma
 * @date 03/01/2021 18:44
 */
@Controller
@RequiredArgsConstructor
public class IndexController {

	private final CategoryRepository categoryRepository;
	private final UnitOfMeasureRepository unitOfMeasureRepository;

	@RequestMapping({"/","/index.html","/index"})
	public String getIndex(){

		Optional<Category> category = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> teaspoon = unitOfMeasureRepository.findByDescription("Teaspoon");

		System.out.println(category.get().getId());
		System.out.println(teaspoon.get().getId());

		return "index";
	}
}
