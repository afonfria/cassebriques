package modelTests;

import static org.junit.Assert.*;

import java.awt.Rectangle;

import model.Bar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit Tests of Bar
 * 
 * @author Antoine Fonfria - 14 129 748
 * @author Baptiste Jaeckert 14 129 775
 * @author Jonathan Diaz-Muy 13 041 479
 * @author Adrien Burel 14 126 607
 * @author Landry Modeste Goutondji  14 000 626
 * @author J�r�my Collard 14 129 766
 * @author Mentor Bajraktari 14 129 757
 * @author Olivier Scheffler 12 179 288
 * @author Elliot G�mus-Pr�vost 13 111 198
 * @author Samuel Arseneault 13 161 801
 * @author Djenebou Monique Dembele 10 103 210
 * @author Florent Gargot 14 129 784
 */

public class BarTest {
	
	private Bar bar;
	

	@Before
	public void setUp() throws Exception {
		bar = new Bar();
	}

	@After
	public void tearDown() throws Exception {
		bar = null ;
	}

	@Test
	public void testBar() {
		
		// test initialisation of the bar
		assertTrue(	bar.getX() 	== 	400);
		assertTrue(	bar.getY() 	== 	500); 
		
		// test of setX() & getX()
		bar.setX(80);
		assertTrue(bar.getX() == 80);
		bar.setX(-18);
		assertTrue(bar.getX() == 80);
		bar.setX(900);
		assertTrue(bar.getX() == 80);
		
		// test of setY() & getY()
		bar.setY(80);
		assertTrue(bar.getY() == 80);
		bar.setY(-18);
		assertTrue(bar.getY() == 80);
		bar.setY(900);
		assertTrue(bar.getY() == 80);
		
		// test of setWidth() & getWidth()
		bar.setWidth(0);
		assertTrue(bar.getWidth() == 0);
		
		//test of setSpeed() & getSpeed()
		bar.setSpeed(10);
		assertTrue(bar.getSpeed() == 10);
	
	}
	
	@Test
	public void test_isWithinRange(){
		assertTrue(bar.isWithinBarRange(380, 420));
		assertFalse(bar.isWithinBarRange(451, 452));
		assertFalse(bar.isWithinBarRange(380, 349));
	}

	@Test
	public void test_Counter(){
		bar.setCounter(0);
		assertTrue(bar.getCounter() == 0);
		bar.incCounter();
		assertTrue(bar.getCounter() == 1);
	}
	
	@Test
	public void test_getBounds(){
		Rectangle rect = bar.getBounds();
		Rectangle result = new Rectangle(400, 500, 100, 15);
		assertTrue(rect.equals(result));
	}
	
	@Test
	public void test_getDistanceFromCenter(){
		assertTrue(bar.getDistanceFromCenter(400)==0);
		assertTrue(bar.getDistanceFromCenter(350)==100);
		assertTrue(bar.getDistanceFromCenter(450)==100);
		assertTrue(bar.getDistanceFromCenter(375)==50);
		assertTrue(bar.getDistanceFromCenter(425)==50);
	}
	
	@Test
	public void test_isOnTeRight(){
		assertTrue(bar.isOnTheRight(401));
		assertFalse(bar.isOnTheRight(399));
	}
}
