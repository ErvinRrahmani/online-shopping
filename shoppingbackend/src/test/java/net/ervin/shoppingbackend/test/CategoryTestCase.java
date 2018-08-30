package net.ervin.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.ervin.shoppingbackend.dao.CategoryDAO;
import net.ervin.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.ervin.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	/*
	@Test
	public void testAddCategory() {

		category = new Category();

		category.setName("Television");
		category.setDescription("This is a description for Television!");
		category.setImageURL("CAT_1.png");

		assertEquals("Test Failed", true, categoryDAO.add(category));
	}
	*/
	
	/*
	@Test
	public void testGetCategory() {
		
		category = categoryDAO.get(3);
		
		assertEquals("Successfully fetched a single category from the category","Hello", category.getName());
	}
	*/
	
	
	/*
	@Test
	public void testUpdateCategory() {
		
		category = categoryDAO.get(4);
		
		category.setName("ervin");
		
		assertEquals("Test failed",true, categoryDAO.update(category));
		
	}
	
	*/
	
	/*
	
	@Test
	public void testDeleteCategory() {
		category = categoryDAO.get(3);
		
		assertEquals("Succefully deleted a single category in the table", true, categoryDAO.delete(category));
	}
	*/
	
	/*
	
	@Test
	public void testListCategory() {
		
		assertEquals("Successfully fetched the list of categories in the table!", 6, categoryDAO.list().size());
	}
	*/
	
	
	@Test
	public void testCRUDCategory() {
		
		category = new Category();

		category.setName("Television");
		category.setDescription("This is a description for Television!");
		category.setImageURL("CAT_1.png");

		assertEquals("Test Failed", true, categoryDAO.add(category));
		
		category = new Category();

		category.setName("Mob");
		category.setDescription("This is a description for Mob!");
		category.setImageURL("CAT_2.png");

		assertEquals("Test Failed", true, categoryDAO.add(category));
		
		
		
		// succcessfully fetched and updated the category
		category = categoryDAO.get(2);
		
		category.setName("SAMS");
		
		assertEquals("Test failed",true, categoryDAO.update(category));
		
		
		 
		
		//	delete the category
		assertEquals("Succefully deleted a single category in the table", true, categoryDAO.delete(category));
		
		//	fetching the list
		assertEquals("Successfully fetched the list of categories in the table!", 1, categoryDAO.list().size());
		
	}
}
