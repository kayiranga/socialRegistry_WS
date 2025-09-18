package controller;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class TestSSL {
	public static void main(String[] args) throws Exception {
        URL url = new URL("https://api-gateway.uat.minaloc.gov.rw");
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.connect();
        System.out.println("Success! Response Code: " + conn.getResponseCode());
    }
}
