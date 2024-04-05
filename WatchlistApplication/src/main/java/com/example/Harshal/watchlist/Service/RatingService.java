package com.example.Harshal.watchlist.Service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class RatingService {

	String apiUrl="https://www.omdbapi.com/?apikey=aefbbb53&t=  ";
	public String getMovieRating(String title) {
		// TODO Auto-generated method stub

		try {
			//try to fetch the rating by  calling omdb api
			RestTemplate template = new RestTemplate();
			// call to api + title
			ResponseEntity<ObjectNode> response = template.getForEntity(apiUrl + title, ObjectNode.class );
			
			ObjectNode jsonObject = response.getBody();
			System.out.println(jsonObject.path("imdbRating").asText());
			return jsonObject.path("imdbRating").asText();
			
			
			
		}catch(Exception e ) {
			//user entered rating will be displayed
			System.out.println("Either Movie Name is not available or api is down"+ e.getMessage());
			return null;
		}
	}
}
