package org.dummy.brms.dummy_brms.model;

import java.util.Map;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Fact<T> {

    @Getter
    private final String factName;

    @Getter 
    private final Map<String, T> factParams;


    public Fact(String factName, Map<String, T> factValues){
        this.factParams = factValues;
        this.factName = factName;
    }
    
}
