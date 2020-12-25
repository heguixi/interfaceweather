package com.hgx.service;

import com.hgx.entity.City;

import java.util.List;

public interface CityService {
    List<City> selectAllCity(int provinceid);
}
