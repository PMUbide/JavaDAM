package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import algorithm.Par;
import algorithm.Criteria;
import algorithm.BuscadorPar;
import algorithm.Person;

public class FinderTests {

	Person	sue		= new Person("Sue",new Date(50, 0, 1) );
	Person	greg	= new Person("Greg", new Date(50, 0, 1));
	Person	sarah	= new Person("Sarah", new Date(82, 0, 1));
	Person	mike	= new Person("Mike", new Date(79, 0, 1));

//	@Before
//	public void setup() {
//		sue.name = "Sue";
//		sue.birthDate = new Date(50, 0, 1);
//		greg.name = "Greg";
//		greg.birthDate = new Date(52, 5, 1);
//		sarah.name = "Sarah";
//		sarah.birthDate = new Date(82, 0, 1);
//		mike.name = "Mike";
//		mike.birthDate = new Date(79, 0, 1);
//	}

	@Test
	public void Returns_Empty_Results_When_Given_Empty_List() {
		List<Person> list = new ArrayList<Person>();
		BuscadorPar finder = new BuscadorPar(list);

		Par result = finder.find(Criteria.Cercano);
		assertEquals(null, result.jovenPerson);

		assertEquals(null, result.viejoPerson);
	}

	@Test
	public void Returns_Empty_Results_When_Given_One_Person() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);

		BuscadorPar finder = new BuscadorPar(list);

		Par par = finder.find(Criteria.Cercano);

		assertEquals(null, par.jovenPerson);
		assertEquals(null, par.viejoPerson);
	}

	@Test
	public void Returns_Closest_Two_For_Two_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);
		list.add(greg);
		BuscadorPar finder = new BuscadorPar(list);

		Par result = finder.find(Criteria.Cercano);

		assertEquals(sue, result.jovenPerson);
		assertEquals(greg, result.viejoPerson);
	}

	@Test
	public void Returns_Furthest_Two_For_Two_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(mike);
		list.add(greg);

		BuscadorPar finder = new BuscadorPar(list);

		Par result = finder.find(Criteria.Lejano);

		assertEquals(greg, result.jovenPerson);
		assertEquals(mike, result.viejoPerson);
	}

	@Test
	public void Returns_Furthest_Two_For_Four_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);
		list.add(sarah);
		list.add(mike);
		list.add(greg);
		BuscadorPar finder = new BuscadorPar(list);

		Par result = finder.find(Criteria.Lejano);

		assertEquals(sue, result.jovenPerson);
		assertEquals(sarah, result.viejoPerson);
	}

	@Test
	public void Returns_Closest_Two_For_Four_People() {
		List<Person> list = new ArrayList<Person>();
		list.add(sue);
		list.add(sarah);
		list.add(mike);
		list.add(greg);

		BuscadorPar finder = new BuscadorPar(list);

		Par result = finder.find(Criteria.Cercano);

		assertEquals(sue, result.jovenPerson);
		assertEquals(greg, result.viejoPerson);
	}

}
