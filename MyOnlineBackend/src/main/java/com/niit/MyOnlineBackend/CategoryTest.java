package com.niit.MyOnlineBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.MyOnlineBackend.DAO.CategoryDAO;
import com.niit.MyOnlineBackend.model.Category;

public class CategoryTest {
	private Category c;
	private static CategoryDAO categoryDao;
	private static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyOnlineBackend");
		context.refresh();
		
		categoryDao = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test 
	public void insertTest()
	{
		c=new Category();
		c.setActive(true);
		c.setCategoryName("Washing Machine");
		c.setDescription("LG");
		
		assertEquals("error",true,categoryDao.insert(c));
	}
	//@Test
	public void getTest()
	{
		c=new Category();
		c=categoryDao.getCategory(1);
		
		assertEquals("error","smart watch",c.getCategoryName());
	}
	
	  //@Test
		public void getcategorylisttest()
		{
			
			
			assertEquals("error",1,categoryDao.categoryList().size());
		}
	
	 
	

}
