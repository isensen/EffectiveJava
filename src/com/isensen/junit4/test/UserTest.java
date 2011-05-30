package com.isensen.junit4.test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.isensen.junit4.User;

public class UserTest {

	@Test
	public void testGetName() {
		assertThat(new User().getName(), is ("isensen"));
	}

}
