package comm;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

class Test {
   private static  EntityManagerFactory emf;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf=Persistence.createEntityManagerFactory("javaEE");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	 emf.close();
	}

	@org.junit.jupiter.api.Test
	void test() {
		fail("Not yet implemented");
	}

}
