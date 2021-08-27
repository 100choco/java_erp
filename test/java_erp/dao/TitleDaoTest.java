package java_erp.dao;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java_erp.dao.impl.TitleDaoImpl;
import java_erp.dto.Title;

public class TitleDaoTest {
private TitleDao dao;



	@Before
	public void setUp() throws Exception {
		dao = TitleDaoImpl.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelectTitleByAll() {
		System.out.println("testSelectTitleByAll()");
		ArrayList<Title> list = dao.selectTitleByAll();
		Assert.assertNotEquals(0, list.size());
		
		list.stream().forEach(System.out::println);
	}

	@Test
	public void testSelectTitleByNo() {
		System.out.println("testSelectTitleByAll()");
		Title selectTitle = dao.selectTitleByNo(new Title(2));
		Assert.assertNotNull(selectTitle);
		System.out.println(selectTitle);
	}

	@Test
	public void testInsertTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeletTitle() {
		fail("Not yet implemented");
	}

}
