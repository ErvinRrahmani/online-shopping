package net.ervin.shoppingbackend.dao;

import net.ervin.shoppingbackend.dto.Category;

import java.util.List;

public interface CategoryDAO {
	
	
	
	
	List<Category> list();
	Category get(int id);
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);

}
