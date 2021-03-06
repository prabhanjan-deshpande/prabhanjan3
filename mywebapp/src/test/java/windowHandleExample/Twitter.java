package windowHandleExample;

import org.testng.annotations.Test;

import java.io.IOException;

import javax.swing.text.html.parser.Entity;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("deprecation")
public class Twitter {
	public static void main(String[] args) throws ClientProtocolException, IOException, JSONException {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet("http://api.twitter.com/1/twitterapi/team/members.json");
		HttpResponse response = httpclient.execute(httpget);
		System.out.println("Response is: "+response.getStatusLine().getStatusCode());
		HttpEntity entity = response.getEntity();
		String finalBody = EntityUtils.toString(entity);
		System.out.println("Response Body is: " +finalBody);

		//String finalBody1 = EntityUtils.toString(entity);
		//System.out.println("Final Body2:" +finalBody);

		JSONObject json = new JSONObject(finalBody);
		JSONArray array = json.getJSONArray("users");
		JSONObject firstUser = array.getJSONObject(0);
		System.out.println(firstUser.getString("name"));
	}
}
