package com.zazdravnykh.bookstore.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomeControllerTest {

	@Test
	public void testLoginController() throws Exception {

		LoginController controller = new LoginController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

		mockMvc.perform(MockMvcRequestBuilders.get("/loginfailed"))

				.andExpect(MockMvcResultMatchers.view().name("login"));
	}

}
