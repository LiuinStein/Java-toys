package com.test.controller;

import com.test.mapper.CollegeMapper;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class TestController {

    private final CollegeMapper collegeMapper;
    private final TestService testService;

    @Autowired
    public TestController(CollegeMapper collegeMapper, TestService testService) {
        this.collegeMapper = collegeMapper;
        this.testService = testService;
    }

    @ResponseBody
    @RequestMapping(value = "/v1/{page}", method = RequestMethod.POST)
    public String test(@PathVariable String page) {
        return page;
//        College a = collegeMapper.getOneCollege();
//        return Integer.toString(testService.getRandom());
    }

    @ResponseBody
    @RequestMapping(value = "test.do", method = RequestMethod.POST)
    public String test2() {
        return "asdasdfsdfaasdf";
    }

}
