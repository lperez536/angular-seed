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

import com.cafeto.users.User;

/**
 * This is the simple and base representation of a fish catch.
 * 
 * @author Luis Perez
 */
public class Catch
{
    private int catchId;
    private User user;
    private FishingType fishingType;
    private Fish fishType; 
    private double weigth;
    private double length;
    private long time;
    private String geoLocation;
    private Lake lake;
    private double temperature;
    private String weatherConditions;
    private BufferedImage[] pictures;
    
    /**
     * @return the catchId
     */
    public final int getCatchId()
    {
        return catchId;
    }
    
    /**
     * @param catchId the catchId to set
     */
    public final void setCatchId(int catchId)
    {
        this.catchId = catchId;
    }
    
    /**
     * @return the user
     */
    public final User getUser()
    {
        return user;
    }
    
    /**
     * @param userId the user to set
     */
    public final void setUserId(User user)
    {
        this.user = user;
    }
    
    /**
     * @return the fishingType
     */
    public final FishingType getFishingWaterType()
    {
        return fishingType;
    }
    
    /**
     * @param fishingWaterType the fishingWaterType to set
     */
    public final void setFishingWaterType(FishingType fishingType)
    {
        this.fishingType = fishingType;
    }
    
    /**
     * @return the fishType
     */
    public final Fish getFishType()
    {
        return fishType;
    }
    
    /**
     * @param fishType the fishType to set
     */
    public final void setFishType(Fish fishType)
    {
        this.fishType = fishType;
    }
    
    /**
     * @return the weigth
     */
    public final double getWeigth()
    {
        return weigth;
    }
    
    /**
     * @param weigth the weigth to set
     */
    public final void setWeigth(double weigth)
    {
        this.weigth = weigth;
    }
    
    /**
     * @return the length
     */
    public final double getLength()
    {
        return length;
    }
    
    /**
     * @param length the length to set
     */
    public final void setLength(double length)
    {
        this.length = length;
    }
    
    /**
     * @return the time
     */
    public final long getTime()
    {
        return time;
    }
    
    /**
     * @param time the time to set
     */
    public final void setTime(long time)
    {
        this.time = time;
    }
    
    /**
     * @return the geoLocation
     */
    public final String getGeoLocation()
    {
        return geoLocation;
    }
    
    /**
     * @param geoLocation the geoLocation to set
     */
    public final void setGeoLocation(String geoLocation)
    {
        this.geoLocation = geoLocation;
    }
    
    /**
     * @return the lake
     */
    public final Lake getLake()
    {
        return lake;
    }
    
    /**
     * @param lake the lake to set
     */
    public final void setLake(Lake lake)
    {
        this.lake = lake;
    }
    
    /**
     * @return the temperature
     */
    public final double getTemperature()
    {
        return temperature;
    }
    
    /**
     * @param temperature the temperature to set
     */
    public final void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }
    
    /**
     * @return the weatherConditions
     */
    public final String getWeatherConditions()
    {
        return weatherConditions;
    }
    
    /**
     * @param weatherConditions the weatherConditions to set
     */
    public final void setWeatherConditions(String weatherConditions)
    {
        this.weatherConditions = weatherConditions;
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
    public final void setPicture(BufferedImage[] pictures)
    {
        this.pictures = pictures.clone();
    } 
}
