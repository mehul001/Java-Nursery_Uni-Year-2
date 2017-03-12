package JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Child;
import Model.Parent;

public class Fail_Child_Name {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Parent parent_1 = new Parent ("Sam","Leedham","01160000999","07000000999");
		
		Child child_1 = new Child("Mehul", "Chamunda", "16/08/1996", "22 Leicester Road", "--", "Leicester", "LE4 6PL", "None", parent_1, 2);
		
		assertEquals("Hello", child_1.getName()); //Test Should Fail
	}

}
