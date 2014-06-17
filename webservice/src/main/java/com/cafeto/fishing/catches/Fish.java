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

import java.awt.image.BufferedImage;

/**
 * @author Luis Perez
 */
public class Fish
{
    private long fishId;
    private String name;
    private String description;
    private BufferedImage[] pictures;
 
    /**
     * @return the fishId
     */
    public final long getFishId()
    {
        return fishId;
    }

    /**
     * @param fishId the fishId to set
     */
    public final void setFishId(long fishId)
    {
        this.fishId = fishId;
    }

    /**
     * @return the name
     */
    public final String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public final void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the description
     */
    public final String getDescription()
    {
        return description;
    }

    /**
     * @param description the description to set
     */
    public final void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @return the pictures
     */
    public final BufferedImage[] getPictures()
    {
        return pictures.clone();
    }

    /**
     * @param pictures the pictures to set
     */
    public final void setPictures(BufferedImage[] pictures)
    {
        this.pictures = pictures.clone();
    }

}
