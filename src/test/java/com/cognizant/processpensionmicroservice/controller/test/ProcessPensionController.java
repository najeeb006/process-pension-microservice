package com.cognizant.processpensionmicroservice.controller.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;


import com.cognizant.processpensionmicroservice.model.ProcessPensionInput;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class ProcessPensionController {
	private static String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJOYWplZWIiLCJleHAiOjE2NTY1MzQ4MzYsImlhdCI6MTY1NjQ5ODgzNn0.2p-x3R04OUMIWepzr3SPy-FOAxL6_10jNiP5gLKEaDs";
	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void contextLoads() {
		assertNotNull(new ProcessPensionController());
	}
	@Test
	public void ProcessPensionSuccessTest() throws Exception {
		ProcessPensionInput processPensionInput = new ProcessPensionInput("123456789012");
		ResultActions actions = mockMvc.perform(post("/ProcessPension").contentType(MediaType.APPLICATION_JSON).content(asJsonString(processPensionInput)).header("Authorization","Bearer "+token));
		actions.andExpect(status().isOk());
	}
	@Test
	public void ProcessPensionFailureTest() throws Exception {
		ProcessPensionInput processPensionInput = new ProcessPensionInput("123456789012");
		ResultActions actions = mockMvc.perform(post("/ProcessPension").contentType(MediaType.APPLICATION_JSON).content(asJsonString(processPensionInput)));
		actions.andExpect(status().isBadRequest());
	}
	public static String asJsonString(ProcessPensionInput input) {
		try {
			return new ObjectMapper().writeValueAsString(input);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
			
		
	}
	

}
