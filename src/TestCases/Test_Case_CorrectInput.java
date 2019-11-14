package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import org.junit.*;
import org.junit.jupiter.api.Test;

class Test_Case_CorrectInput {

	double fixKosten = 0;
    double varKosten = 0;
    int personen = 0;
	
	void input() throws InputMismatchException {
		fixKosten = Input.getFixKosten();
		varKosten = Input.getVarKosten();
		personen = Input.getPersonen();
		Input.getScanner().close();
		
		System.out.println("\n" + fixKosten + "\n" +  varKosten + "\n" + personen);
	}
	
	@Test
	void correctInput() {
		
		input(); //liest den User Input
		
		assertTrue(fixKosten >= 0); //Schl�gt fehl wenn Fixkosten weniger als 0 betragen
		assertTrue(varKosten >= 0); //Schl�gt fehl wenn Variable Kosten weniger als 0 betragen
		assertTrue(personen > 0);   //Schl�gt fehl wenn Personenzahl 0 oder kleiner ist
		
	}

}
