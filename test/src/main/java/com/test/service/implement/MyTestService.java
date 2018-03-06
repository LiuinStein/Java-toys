package com.test.service.implement;

import com.test.mapper.CollegeMapper;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class MyTestService implements TestService {

    private final CollegeMapper collegeMapper;

    @Autowired
    public MyTestService(CollegeMapper collegeMapper) {
        this.collegeMapper = collegeMapper;
    }

    public int getRandom() {
        return (int) (Math.random() * 100);
    }
}
