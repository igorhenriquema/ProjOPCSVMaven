package br.com.csvreader.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.csvreader.model.School;
import br.com.csvreader.util.CSVReader;


@RestController
public class ServFindAllController {
	// http://localhost:8080/api/getAll
		@GetMapping("api/getAll")
		public String all(){
			return getAllFromDB();
		}
		
		private static String getAllFromDB() {
			String erro = "";
			
			try {
				URL url = new URL("http://localhost:8080/api/database/all");
				
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");
				
				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Erro: " + conn.getResponseCode());
				}
				
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
				
				String output;
				String response = "";
				
				while ((output = br.readLine()) != null) {
					response += output;
				}
				
				conn.disconnect();
				
				return response;
			} catch (MalformedURLException e) {
				erro = "MalformedURLException: " + e.getMessage();
				e.printStackTrace();
			} catch (IOException e) {
				erro = "IOException: " + e.getMessage();
				e.printStackTrace();
			} catch (RuntimeException e) {
				erro = "RuntimeException: " + e.getMessage();
				e.printStackTrace();
			}
			
			return erro;
	}
}
