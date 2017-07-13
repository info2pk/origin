package com.mkyong;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class AppTest
{

    public static void main( String[] args )
    {
        AppTest obj = new AppTest();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }

    public String generateUniqueKey(){

    	String id = UUID.randomUUID().toString();
    	return id;

    }
}