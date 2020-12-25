package com.hgx.dao;

import com.hgx.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> selectAllArea(int provinceid,int cityid);
}
