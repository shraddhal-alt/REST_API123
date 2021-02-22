package Rest_client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;

public class Rest_cl {

	public  void get(String url) throws ClientProtocolException, IOException
	{
		
		CloseableHttpClient clurl=HttpClients.createDefault();
		HttpGet htget=new HttpGet(url);
		CloseableHttpResponse res=clurl.execute(htget);
		
		

		int Statuscode=	res.getStatusLine().getStatusCode();
		System.out.println("Status code........"+ Statuscode);
		
		Assert.assertEquals(Statuscode, 200);
		
		
		String resp_String=EntityUtils.toString(res.getEntity(), "UTF-8");
		
		JSONObject resposc=new JSONObject(resp_String);
		System.out.println("response Json......"+ resposc);
		
		Header[] headerarray= res.getAllHeaders();
		
		HashMap<String,String> allheader=new HashMap<String, String>();
		
		for(Header head:headerarray) 
		{
			allheader.put(head.getName(),head.getValue());
		}
			System.out.println("headers array......."+ allheader);
		}
		

}
