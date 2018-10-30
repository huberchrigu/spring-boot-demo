package com.example.demo;

import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
public class MongoPerson {
	@Id
	private String id;

	private String name;
}
