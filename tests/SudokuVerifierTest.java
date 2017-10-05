import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

//	@Test
//	public void testVerify() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testNumbersOnly(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.numbersOnly("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals("Only contains numbers", 1, result);
	}
	
	@Test
	public void testNumbersOnlyFail(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.numbersOnly("417369825632158947958724316825437169791586k432346912758289643571573291684164875293");
		assertEquals("Contains a character", 0, result);
	}
	
	@Test
	public void test81numbers(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.numbersOnly("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals("81 numbers", 1, result);
	}
	
		
	@Test
	public void testRowRepetitions(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.checkForRepetitions("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals("No Repetitions", 0, result);
	}
	
	@Test
	 	public void testColumnRepetitions() {
	 		SudokuVerifier verifier = new SudokuVerifier();
	 		assertEquals(0, verifier.verify("417369825632158947958724316825437169791586432346912758289643571573291684464875293"));
	 	}

}
