package com.mlnx.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlnx.base.entity.TProvince;
import com.mlnx.base.mapper.TProvinceMapper;
import com.mlnx.base.service.DataService;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private TProvinceMapper tProvinceMapper;

	@Override
	public List<TProvince> getAllProvince() {
		return tProvinceMapper.selectAll();
	}

}
