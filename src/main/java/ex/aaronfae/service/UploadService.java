package ex.aaronfae.service;

import java.util.List;
import java.util.Map;

public interface UploadService {

    void up(String uper, String fileName);

    List<Map<String, Object>> list();
}
