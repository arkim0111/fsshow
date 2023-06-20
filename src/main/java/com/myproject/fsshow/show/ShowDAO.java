package com.myproject.fsshow.show;

import com.myproject.fsshow.common.AbstractDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("showDAO")
public class ShowDAO extends AbstractDAO {

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectShowList(Map<String, Object> map) throws Exception{
        return (List<Map<String, Object>>) selectList("fsshow.selectShowList", map);
    }


}
