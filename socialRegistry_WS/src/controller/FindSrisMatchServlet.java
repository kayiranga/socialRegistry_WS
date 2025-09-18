
package controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
// No need for URLEncoder.encode if parameters are not in the URL
// import java.net.URLEncoder; 
// import java.nio.charset.StandardCharsets; 
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/find-sris-match")
public class FindSrisMatchServlet extends HttpServlet {

    // The API's base URL, without any query parameters
    private static final String API_BASE_URL = "https://api-gateway.uat.minaloc.gov.rw/households/find-sris-match";
    
    // IMPORTANT: This token will expire. You must generate a new one and update it here.
    // The previous token's expiry was July 15, 2025 12:31:29 AM GMT+2 (Kigali time).
    // Please update with a fresh token obtained from your Minaloc UAT environment.
    private static final String TOKEN = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJFWFRFUk5BTF9UVU5ORUxfT05FIiwiaWF0IjoxNzUyNDg2OTE0LCJleHAiOjE3NTI1NzMzMTQsInBlcm1pc3Npb25zIjpbIlZJRVdfVEFSR0VUSU5HIiwiVklFV19JTlNUSVRVVElPTiIsIlZJRVdfSE9VU0VfSE9MRCJdLCJyb2xlcyI6WyJJTlRFR1JBVElPTiJdLCJ1c2VyIjoiNzc3OGQyZjAtMzBiYi00MjI2LThlYTgtMzk2NDVkYzA4ODIxIn0.WEv4PCpMLg3DCLKO8zAPv9NMw_gfOIOdbJhBHOS6Bx_wqrdCbzdCVNKA6m4fR9HwQfuZiKWJbPeJhRyS5VMWSA"; 

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String identificationNumber = req.getParameter("id"); // Still get 'id' from your local request

        // Validate the incoming parameter
        if (identificationNumber == null || identificationNumber.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().println("Missing identification number from client request.");
            return;
        }

        URL url = new URL(API_BASE_URL); // The URL for the external API has no query parameters
        System.out.println("Calling external API URL (no query parameters): " + url);

        HttpURLConnection conn = null; // Declare outside try for finally block
        try {
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            // --- Set Authorization Header ---
            conn.setRequestProperty("Authorization", TOKEN);
            
            // --- Set  as a Custom Header ---
            // This is the key change based on your Postman success
            conn.setRequestProperty("identificationNumber", identificationNumber);
            
            System.out.println("Request Headers being sent to Minaloc API:");
            System.out.println("  Authorization: " + TOKEN);
            System.out.println("  identificationNumber: " + identificationNumber);

            // Get the response code from the external API
            int responseCode = conn.getResponseCode();
            System.out.println("API Response Code: " + responseCode);

            if (responseCode == HttpServletResponse.SC_OK) { // HTTP 200 OK
                // Read successful response from the API's input stream
                try (Scanner scanner = new Scanner(conn.getInputStream())) {
                    StringBuilder json = new StringBuilder();
                    while (scanner.hasNext()) {
                        json.append(scanner.nextLine());
                    }
                    resp.setContentType("application/json");
                    resp.getWriter().println(json.toString());
                }
            } else {
                // Read error response from the API's error stream
                StringBuilder errorDetails = new StringBuilder();
                try (Scanner errorScanner = new Scanner(conn.getErrorStream())) { // Use try-with-resources for Scanner
                    while (errorScanner.hasNext()) {
                        errorDetails.append(errorScanner.nextLine());
                    }
                } catch (Exception e) {
                    // Log if the error stream itself cannot be read
                    System.err.println("Failed to read error stream from Minaloc API: " + e.getMessage());
                }

                resp.setStatus(responseCode); // Set the client response status to match the API's error
                resp.getWriter().println("Failed to fetch data from Minaloc API. HTTP code: " + responseCode + ". API Error Details: " + errorDetails.toString());
            }
        } catch (IOException e) {
            // Handle network or connection-level errors (e.g., API not reachable, timeout)
            System.err.println("Network/Connection error when calling Minaloc API: " + e.getMessage());
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            resp.getWriter().println("Internal server error: Could not connect to external Minaloc API.");
        } finally {
            if (conn != null) {
                conn.disconnect(); // Ensure the connection is closed
            }
        }
    }
}