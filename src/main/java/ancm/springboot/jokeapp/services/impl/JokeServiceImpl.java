package ancm.springboot.jokeapp.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ancm.springboot.jokeapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
@Primary
public class JokeServiceImpl implements JokeService{
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	

	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}


	@Override
	public String generateJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
