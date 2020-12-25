package com.hgx.service.impl;

import com.hgx.dao.AreaDao;
import com.hgx.entity.Area;
import com.hgx.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaDao areaDao;

    @Override
    public List<Area> selectAllArea(int provinceid, int cityid) {
        List<Area> areas=areaDao.selectAllArea(provinceid, cityid);
        return areas;
    }
}
