package com.tuyano.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
public class HeloController {

	String[] names = { "tuyano", "hanako", "taro", "sachiko", "ichiro" };
	String[] mails = { "syodaptuyano.com", "hanako@flower", "taro@yamada", "sachiko@happy", "ichiro@baseball" };

	@RequestMapping("/{id}")
	public DataObject index(@PathVariable int id) {
		return new DataObject(id, names[id], mails[id]);
	}
}

@Data
class DataObject {
	private int id;
	private String name;
	private String value;

	public DataObject(int id, String name, String value) {

		super();
		this.id = id;
		this.name = name;
		this.value = value;

	}

}
