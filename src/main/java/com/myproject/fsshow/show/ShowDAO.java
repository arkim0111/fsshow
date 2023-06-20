package com.myproject.fsshow.show;

import com.myproject.fsshow.dao.AbstractDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("showDAO")
public class ShowDAO extends AbstractDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;


}
