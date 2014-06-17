/*
 * This source code is the confidential, proprietary information of
 * Cafeto Software S.A.S. here in, you may not disclose such Information, 
 * and may only use it in accordance with the terms of the license 
 * agreement you entered into with Cafeto Software S.A.S.
 *
 * 2014: Cafeto Software S.A.S.  
 * All Rights Reserved.
 */

package com.cafeto.users;

/**
 * @author Luis Perez
 */
public class User
{
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    /**
     * @return the userId
     */
    public final int getUserId()
    {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public final void setUserId(int userId)
    {
        this.userId = userId;
    }

    /**
     * @return the firstName
     */
    public final String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public final void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public final String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public final void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public final String getEmail()
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public final void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return the password
     */
    public final String getPassword()
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public final void setPassword(String password)
    {
        this.password = password;
    }
}
