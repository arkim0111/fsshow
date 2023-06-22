package com.myproject.fsshow.show;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("showService")
public class ShowServiceImpl implements ShowService{

    protected final Logger logger = LoggerFactory.getLogger(ShowService.class);

    @Autowired
    private ShowDAO showDAO;

    @Override
    public List<Map<String, Object>> selectShowList(Map<String, Object> map) throws Exception {
        return showDAO.selectShowList(map);
    }
}
