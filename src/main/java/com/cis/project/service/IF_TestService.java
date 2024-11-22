package com.cis.project.service;

import com.cis.project.dto.TestDTO;

public interface IF_TestService {

    // INSERT 작업 테스트, 서비스 레이어
    public void insertTest(TestDTO testdto) throws Exception;

}
