package com.mlnx.base.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mlnx.base.entity.TProvince;
import com.mlnx.base.service.DataService;

@RestController
@RequestMapping(value = "/data")
public class DataCol {
	
	@Autowired
	private DataService dataService;

	@RequestMapping(value = "/get/all/province", method = RequestMethod.GET)
	public List<TProvince> index() {
		return dataService.getAllProvince();
	}
}
