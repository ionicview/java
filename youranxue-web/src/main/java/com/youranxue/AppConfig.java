package com.youranxue;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "app")
@Component
@Data
public class AppConfig {
	private String secret;
	private long tokenValidityInSeconds;
	private String imageRoot;
}
