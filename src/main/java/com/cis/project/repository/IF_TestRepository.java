package com.cis.project.repository;

import com.cis.project.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IF_TestRepository {

    // INSERT 작업 테스트, DAO(Repository) 레이어
    public void insertDBTest(TestDTO testdto) throws Exception;

}
