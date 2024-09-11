package com.project.cxsupershy;

import com.project.cxsupershy.service.FileService;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileServiceTest {

//    @Test
//    public void 제이슨열리는거테스트() {
//        FileService fs = new FileService();
//        String path = "C:\\Users\\trainee220\\cxsupershy\\cxsupershy\\src\\main\\resources\\static\\json\\embeddings.json";
//        fs.jsonReader(path);
//    }

    @Test
    public void 해쉬맵을제이슨으로() {
        Map<String, Object> map = Map.of("test1", 1, "test2", 2);
        System.out.println(map);

        FileService fileService = new FileService();
        String rs = fileService.mapToJson(map);
        System.out.println(rs);
    }

    @Test
    public void 제이슨을맵으로() throws Exception {
        String jsonString = "{\"test2\":2,\"test1\":1}";
        FileService fileService = new FileService();
        Map<String, Object> rs = fileService.jsonToMap(jsonString);
        System.out.println(rs);
        System.out.println(rs.get("test1"));
        System.out.println(rs.get("test2"));
    }
}
