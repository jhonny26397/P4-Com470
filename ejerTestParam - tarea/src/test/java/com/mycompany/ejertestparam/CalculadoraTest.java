/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import junitparams.JUnitParamsRunner;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;


/**
 *
 * @author Jhon
 */
@RunWith(JUnitParamsRunner.class)
public class CalculadoraTest {
    
    Calculadora calc = new Calculadora();
    
      
    public CalculadoraTest() {
    }
    
    @Test
    @junitparams.Parameters({"1,3,4","5,5,10","6,8,14","98,1,99"})
    public void testSuma(int x, int y, int z) {
        assertThat(calc.suma(x, y), Matchers.is(z));
    }

    @Test
    @junitparams.Parameters({"5,1,4","15,5,10","16,2,14","98,7,91"})
    public void testResta(int x, int y, int z) {
        assertThat(calc.resta(x, y), Matchers.is(z));
    }

    @Test
    @junitparams.Parameters({"2,3,6","5,5,25","6,6,36","9,8,72"})
    public void testMultimplicacion(int x, int y, int z) {
        assertThat(calc.multimplicacion(x, y), Matchers.is(z));
    }

    @Test
    @junitparams.Parameters({"15,3,5","18,3,6","56,8,7","81,9,9"})
    public void testDivision(int x, int y, int z) {
        assertThat(calc.division(x, y), Matchers.is(z));
    }
}
