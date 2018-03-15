package ex.aaronfae.service;

import ex.aaronfae.dao.UpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UploadServiceImpl implements UploadService {

    private final UpDao upDao;

    @Autowired
    public UploadServiceImpl(UpDao upDao) {
        this.upDao = upDao;
    }

    @Override
    public void up(String uper, String fileName) {
        upDao.up(uper, fileName);
    }

    @Override
    public List<Map<String, Object>> list() {
        return upDao.list();
    }
}
