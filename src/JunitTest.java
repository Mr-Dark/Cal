import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Controller c=new Controller();
		double res;
		res=c.m.div(10,0);
		assertEquals(res,0,0);
		res=c.m.sq(-16);
		assertEquals(res,4,0);
		res=c.m.add(50, -50);
		assertEquals(res,0,0);
		res=c.m.sub(-50, -50);
		assertEquals(res,0,0);
		res=c.m.mul(0, -50);
		assertEquals(res,0,0);
		res=c.m.add(Double.parseDouble("15"), 15);
		assertEquals(res,30,0);
		
		
		
		
	}


}
