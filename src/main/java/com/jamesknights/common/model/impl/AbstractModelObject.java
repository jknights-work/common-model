/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesknights.common.model.impl;

import com.jamesknights.common.event.impl.Publisher;
import com.jamesknights.common.model.ModelObject;
import java.util.HashMap;

/**
 *
 * @author James Knights <james@i-studio.co.uk>
 * @param <T>
 */
public abstract class AbstractModelObject <T extends ModelObject<?>> extends Publisher implements ModelObject <T>  {
    
    private final Publisher publisher = new Publisher();

    @Override
    public T get(String propertyName) {
        throw new UnsupportedOperationException("Unsupported");
    }

    @Override
    public void set(HashMap<T, T> newData) {
        //fireEvent(newData);
    }

    @Override
    public void set(T propertyName, T propertyValue) {}
    
    
    public void fireEvent (HashMap<T, T> changed) {
        publisher.publishEvent(this, changed);
    }
}
