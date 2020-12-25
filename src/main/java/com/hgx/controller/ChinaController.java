package com.hgx.controller;

import com.hgx.entity.Area;
import com.hgx.entity.City;
import com.hgx.entity.Province;
import com.hgx.service.AreaService;
import com.hgx.service.CityService;
import com.hgx.service.ProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ChinaController {

    @Resource
    private ProvinceService provinceService;
    @Resource
    private CityService cityService;
    @Resource
    private AreaService areaService;

    @RequestMapping("china")
    @ResponseBody
    public List<Province> SelectAllProvince(){
        List<Province> provinceList=provinceService.findAllProvince();
        return provinceList;
    }

    @RequestMapping("china/{provinceid}")
    @ResponseBody
    public List<City> SelectAllCity(@PathVariable("provinceid")Integer provinceid){
        List<City> cityList=cityService.selectAllCity(provinceid);
        return cityList;
    }

    @RequestMapping("china/{provinceid}/{cityid}")
    @ResponseBody
    public List<Area> SelectAllArea(@PathVariable("provinceid")Integer province_id,@PathVariable("cityid")Integer city_id){
        List<Area> areaList=areaService.selectAllArea(province_id, city_id);
        return areaList;
    }
}
