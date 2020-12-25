package com.hgx.service.impl;

import com.hgx.dao.CityDao;
import com.hgx.entity.City;
import com.hgx.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityDao cityDao;

    @Override
    public List<City> selectAllCity(int provinceid) {
        List<City> cities=cityDao.selectAllCity(provinceid);
        return cities;
    }
}
