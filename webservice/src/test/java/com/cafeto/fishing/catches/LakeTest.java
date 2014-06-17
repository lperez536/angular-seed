/*
 * This source code is the confidential, proprietary information of
 * Cafeto Software S.A.S. here in, you may not disclose such Information, 
 * and may only use it in accordance with the terms of the license 
 * agreement you entered into with Cafeto Software S.A.S.
 *
 * 2014: Cafeto Software S.A.S.  
 * All Rights Reserved.
 */

package com.cafeto.fishing.catches;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Luis Perez
 */
public class LakeTest
{
	private Lake lake;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
        lake = new Lake();
	}

	/**
	 * Test method for {@link com.cafeto.fishing.catches.Lake#getLakeId()}.
	 */
	@Test
	public void testGetLakeId()
	{
        lake.setLakeId(1234);
        assertEquals(1234, lake.getLakeId());
	}

	/**
	 * Test method for {@link com.cafeto.fishing.catches.Lake#getLakeName()}.
	 */
	@Test
	public void testGetLakeName()
	{
        lake.setLakeName("Lake Conroe");
        assertEquals("Lake Conroe", lake.getLakeName());
	}

	/**
	 * Test method for {@link com.cafeto.fishing.catches.Lake#getState()}.
	 */
	@Test
	public void testGetState() {
        lake.setState(States.CA);
        assertEquals(States.CA, lake.getState());
	}

	/**
	 * Test method for {@link com.cafeto.fishing.catches.Lake#getCounty()}.
	 */
	@Test
	public void testGetCounty() {
        lake.setCounty("Conroe");
        assertEquals("Conroe", lake.getCounty());
	}
}
