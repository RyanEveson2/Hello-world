import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * TODO: complete the following test, base the tests off of what was shown earlier test classes
 */
public class StudentTest {

    static Student bill, ben, bob;

    @BeforeAll
    static void initialize(){
        bob = new Student(18, "Bob Maher", new String []{"COSC 222","COSC 311", "MATH 200", "MATH 220"});
        bill = new Student(19, "Bill Cosby", new String []{"COSC 222", "COSC 404", "ENGL 112"});
        ben = new Student(24, "Ben Mckenny", new String []{"COSC 222", "COSC 111", "MATH 200", "PHYS 101"});
    }
    
	@Test
	void testGetClasses() {
		 //TODO: test that the classes array returned is correct
		
		assertTrue(Arrays.equals(bob.getClasses(), new String[]{"COSC 222","COSC 311", "MATH 200", "MATH 220"} ));
		assertTrue(Arrays.equals(bill.getClasses(), new String[]{"COSC 222", "COSC 404", "ENGL 112"}) );
		assertTrue(Arrays.equals(ben.getClasses(), new String[]{"COSC 222", "COSC 111", "MATH 200", "PHYS 101"}) ); 	
		
	}

	@Test
	void testGetAge() {
		//TODO: test that the age returned is correct
		
		assertEquals(bob.getAge(),18);
		assertEquals(ben.getAge(),24);
		assertEquals(bill.getAge(),19);	
	}
}