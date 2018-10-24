package edu.collegeofcharleston.csci656;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BrainTest {
	@Test
	public void calculateMovieRatingTest(){
		Brain brainB = new Brain();
		
		String[] actors = {"Seth Rogan", "Zac Efron", "Jonah Hill", "Aubrey Plaza"};
		int rating = brainB.calculateMovieRating("Quentin Tarantino", actors, 180000000);
		
		int expectedRating = 10;
		
		assertEquals(rating, expectedRating);
		
	}

}