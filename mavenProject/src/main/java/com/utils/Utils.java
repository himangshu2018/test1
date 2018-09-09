package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Utils {
	public void readPropertyFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("config.properties");
		Properties pop=new Properties();
		
	}

}
