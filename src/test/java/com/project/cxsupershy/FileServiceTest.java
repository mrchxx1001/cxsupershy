package com.project.cxsupershy;

import com.project.cxsupershy.service.FileService;
import org.junit.jupiter.api.Test;

public class FileServiceTest {

    @Test
    public void 제이슨열리는거테스트() {
        FileService fs = new FileService();
        String path = "C:\\Users\\trainee220\\cxsupershy\\cxsupershy\\src\\main\\resources\\static\\json\\embeddings.json";
        fs.jsonReader(path);
    }
}
