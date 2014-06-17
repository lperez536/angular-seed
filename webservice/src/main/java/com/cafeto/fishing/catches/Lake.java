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

/**
 * @author Luis Perez
 */
public class Lake
{
    private long lakeId;
    private String lakeName;
    private States state;
    private String county;

    /**
     * @return the lakeId
     */
    public final long getLakeId()
    {
        return lakeId;
    }

    /**
     * @param lakeId the lakeId to set
     */
    public final void setLakeId(long lakeId)
    {
        this.lakeId = lakeId;
    }

    /**
     * @return the lakeName
     */
    public final String getLakeName()
    {
        return lakeName;
    }

    /**
     * @param lakeName the lakeName to set
     */
    public final void setLakeName(String lakeName)
    {
        this.lakeName = lakeName;
    }

    /**
     * @return the state
     */
    public final States getState()
    {
        return state;
    }

    /**
     * @param state the state to set
     */
    public final void setState(States state)
    {
        this.state = state;
    }

    /**
     * @return the county
     */
    public final String getCounty()
    {
        return county;
    }

    /**
     * @param county the county to set
     */
    public final void setCounty(String county)
    {
        this.county = county;
    }
}
