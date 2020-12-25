package com.hgx.service.impl;

import com.hgx.dao.ProvinceDao;
import com.hgx.entity.Province;
import com.hgx.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Resource
    private  ProvinceDao provinceDao;

    @Override
    public List<Province> findAllProvince() {
        List<Province> provinces=provinceDao.selectAllProvince();
        return provinces;
    }
}
