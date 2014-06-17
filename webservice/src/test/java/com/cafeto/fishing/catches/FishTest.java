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
import static org.junit.Assert.fail;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Luis Perez
 */
public class FishTest
{
	private Fish fish;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		fish = new Fish();
	}

	/**
	 * Test method for {@link com.cafeto.fishing.catches.Fish#getFishId()}.
	 */
	@Test
	public void testGetFishId()
	{
		fish.setFishId(1234);
		assertEquals(1234, fish.getFishId());
	}

	/**
	 * Test method for {@link com.cafeto.fishing.catches.Fish#getName()}.
	 */
	@Test
	public void testGetName()
	{
		fish.setName("Fishcat");
		assertEquals("Fishcat", fish.getName());
	}

	/**
	 * Test method for {@link com.cafeto.fishing.catches.Fish#getDescription()}.
	 */
	@Test
	public void testGetDescription()
	{
		fish.setDescription("Long hairy fisch");
		assertEquals("Long hairy fisch", fish.getDescription());
	}

	/**
	 * Test method for {@link com.cafeto.fishing.catches.Fish#getPictures()}.
	 */
	@Test
	public void testGetPictures()
	{
		BufferedImage img = null;
		try
		{
			img = ImageIO.read(new File("Jenkins.png"));
		}
		catch (IOException exception)
		{
			fail("Failed to load image: " + exception.toString());
		}
	}

}
