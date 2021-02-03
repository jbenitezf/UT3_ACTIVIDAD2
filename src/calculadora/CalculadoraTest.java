package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	@Before
		public void before() {
		System.out.println("before()");
		calc = new Calculadora();
	}
	
	@After
		public void After() {
		System.out.println("After()");
		calc.clear();
		
	}
	
	@Test
	public void testSuma() {
		System.out.println("sum()");
		int resul = calc.add(3, 2);
		int esper = 5; //2 + 3 =5
		assertEquals(esper, resul);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("ans()");
		calc.add(3, 2);
		int resul = calc.ans();
		int esper = 5; //2 + 3 =5
		assertEquals(esper, resul);
	}
}