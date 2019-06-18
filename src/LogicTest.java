import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class LogicTest {

	private static Logic logic =new Logic();
	private static Logic logic2 =new Logic();
	private static Map map=new Map(1);
	
	private static int [][]table = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1,0,1,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	};
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	
	//@Ignore("GetNeighbor()Not yet implemented")
	@Test
	public void testGetNeighbor() {
		int n;
		n=logic.getNeighbor(map, 7, 7);
		assertEquals(1,n);
		n=logic.getNeighbor(map, 7, 8);
		assertEquals(2,n);
		n=logic.getNeighbor(map, 7, 9);
		assertEquals(3,n);
		n=logic.getNeighbor(map, 12, 8);
		assertEquals(4,n);
		n=logic.getNeighbor(map, 12, 10);
		assertEquals(5,n);
		n=logic.getNeighbor(map, 11, 12);
		assertEquals(6,n);
		n=logic.getNeighbor(map, 9, 10);
		assertEquals(7,n);
		n=logic.getNeighbor(map, 9, 9);
		assertEquals(8,n);
		
	}

	 @Test
	public void testChangeStatus() {
		 map.table=logic2.changeStatus(map);
		 assertArrayEquals(table,map.table);
	}

}
