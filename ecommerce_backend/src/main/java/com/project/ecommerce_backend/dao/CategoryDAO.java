package com.project.ecommerce_backend.dao;

import java.util.List;

import com.project.ecommerce_backend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
