/*
 * 
 */
package com.test.gwt.server;

import javax.persistence.Persistence;

/**
 *
 * @author Александр
 */
public class GenerateDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Persistence.generateSchema("persistenceUnit", null);
            System.exit(0);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(-1);
        }
    }

}
