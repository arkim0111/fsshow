package com.myproject.fsshow.show;

import java.util.List;
import java.util.Map;

public interface ShowService {

    List<Map<String, Object>> selectShowList(Map<String, Object> map) throws Exception;
}
