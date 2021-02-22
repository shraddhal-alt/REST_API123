package Test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base_c;

import Rest_client.Rest_cl;

public class Test1 extends  Base_c

{
	
	String serviceurl;
	String apiurl;
	String url;
	
	@BeforeMethod
	public void setup() 
	{
		Base_c Base=new Base_c();
		serviceurl=prop.getProperty("URL");
		apiurl=prop.getProperty("serviceURL");
		
		url=serviceurl+apiurl;
	}
	

	@Test
	public void getsetup() throws ClientProtocolException, IOException
	{
		Rest_cl rest=new Rest_cl();
		rest.get(url);
	}
	
}
