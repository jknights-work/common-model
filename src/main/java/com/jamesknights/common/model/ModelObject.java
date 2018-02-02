/*
 *  File: ModelObject.java
    Author: James Knights
    Date: 15th January 2018

    The initial version
 */

package com.jamesknights.common.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * This class represents the common components for models which are type Object around the application
 * @author James Knights <james@i-studio.co.uk>
 * @param <T> - Any type of Object
 */
public interface ModelObject <T extends Object> extends Serializable {
    
    void set (T propertyName, T propertyValue);
    
    void set (HashMap<T, T> data);
    
    T get (String propertyName); 

}
