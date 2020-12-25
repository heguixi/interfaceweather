package com.hgx.service;

import com.hgx.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> selectAllArea(int provinceid,int cityid);
}
