package com.hgx.dao;

import com.hgx.entity.City;

import java.util.List;

public interface CityDao {
    List<City> selectAllCity(int provinceid);
}
