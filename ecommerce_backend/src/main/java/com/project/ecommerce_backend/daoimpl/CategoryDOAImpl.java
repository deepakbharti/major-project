package com.project.ecommerce_backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.ecommerce_backend.dao.CategoryDAO;
import com.project.ecommerce_backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDOAImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is some description for televission");
		category.setImageURL("s.png");

		categories.add(category);

		// second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is some description for Mobile");
		category.setImageURL("m.png");

		categories.add(category);
		
		// third category
				category = new Category();
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("this is some description for Laptop");
				category.setImageURL("l.png");

				categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enchanced for loop
		for(Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
