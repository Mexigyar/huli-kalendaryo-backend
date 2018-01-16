package com.greenfoxacademy.opal.kalendaryo.kalendaryo;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import java.nio.charset.Charset;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@EnableWebMvc
public class KalendaryoApplicationTests {

	//private UserModel contentType;

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
		MediaType.APPLICATION_JSON.getSubtype(),
		Charset.forName("utf8"));

	@Autowired
	WebApplicationContext webApplicationContext;

	private MockMvc mock;

	@Before
	public void setUp() {
		mock = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void postAuthEndpointGivesBackUserModel() throws Exception {

		JSONObject response = new JSONObject();
		response.put("email", "huli.opal.kalendaryo@gmail.com");
		response.put("authCode", "4/AAD6M1w0SblnW7knWD3V6aFyncYfMzzQQgapjIEKPfi78YkX3n40EeO03L2_I7KUn1kyxEaqjexNJNfQBXaR3GI");
		response.put("displayName", "");
		response.put("accessToken", "ya29.GlxEBSXkW7ErQ_JsoDfC3r6V7w0wdk4_cPQsVnFvjDvFN0vFruHC1gyngjqJSKNpp1of81_ziEkmKUzN-SZ8oMffeGZXPjMHF8inG6_-xuQMoBgqt5cjKWA9qkvt7Q");
		response.put("refreshToken", "");
		response.put("userId", "12");
		response.put("calendarId", "");

		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Client-Token", "uih3/MUTrHq8KaZqhen2PKln680=");


		mock.perform(post("/auth")
			.contentType(MediaType.APPLICATION_JSON)
			.headers(headers)).andDo(print())
			.andExpect(content().contentType(String.valueOf(contentType)));

	}

	@Test
	public void contextLoads() {
	}

}
