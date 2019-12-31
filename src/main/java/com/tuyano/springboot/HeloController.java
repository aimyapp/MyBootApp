package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.Data;

@Controller
public class HeloController {

	@RequestMapping(value = "/")
	public ModelAndView send(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("msg", "current data.");
		DataObject obj = new DataObject(123, "hanako", "hanako@flower");
		mav.addObject("object", obj);
		return mav;
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
