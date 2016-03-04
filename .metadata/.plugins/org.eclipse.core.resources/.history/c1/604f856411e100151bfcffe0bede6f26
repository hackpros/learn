package com.navigate.treat.base.io;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

public class RestBaseService {
	protected final Logger log = Logger.getLogger(this.getClass());

	public static final ObjectMapper objectMapper = new ObjectMapper();
	static {
		objectMapper
				.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
	}

	public static final String RETURN_INTERFACE_KEY = "ICResponse";

}
