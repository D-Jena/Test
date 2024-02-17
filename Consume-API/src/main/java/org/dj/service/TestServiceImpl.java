package org.dj.service;

import org.dj.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private RestTemplate template;
	
	@Value("${source.url}")
	String url;
	
	@Override
	public User getData() {
		return template.getForObject(url, User.class);
	}

}
