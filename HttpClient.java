package interviewQuestionProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {
	private static String sendRequest(String urlString) throws IOException {
	    URL url = new URL(urlString);
	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	    connection.setRequestMethod("GET");

	    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    String inputLine;
	    StringBuilder response = new StringBuilder();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	    }
	    in.close();

	    return response.toString();
	}

	public static void main(String[] args) throws IOException {
		String respons = sendRequest("www.w3schools.com");
		System.out.println(respons);

	}

}
