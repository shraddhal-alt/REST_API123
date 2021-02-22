package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base_c {

	
		public Properties prop;

	
  public Base_c() 
  {
	  prop=new Properties();
	  try {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/Config/Confi.prop");
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
		
		
}
