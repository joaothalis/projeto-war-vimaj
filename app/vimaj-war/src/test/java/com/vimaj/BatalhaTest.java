package com.vimaj;

import static org.junit.Assert.fail;


import java.util.ArrayList;
import java.util.List;
import com.vimaj.model.Rolagem;
import com.vimaj.model.Territorio;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matcher.*;
import static org.junit.Assert.*;
public class BatalhaTest {

	static int min = 1;
	static int max = 6;
	private static List<Integer> resultadoRolagem = new ArrayList<>();
<<<<<<< Updated upstream
=======
	Rolagem r = new Rolagem("x", 30);
>>>>>>> Stashed changes

	@Test
	public void test01MaximoDeDados() {
		int expected = 3;
		try {
			List<Integer> result = r.rolarDados("x", 30);
			int actual = result.size();
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void test02MinimoDeDados() {
		int expected = 1;
		resultadoRolagem.clear();
		try {
			List<Integer> result = r.rolarDados("x", 2);
			int actual = result.size();
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
