package ex.aaronfae.service;

import ex.aaronfae.entity.Homework;
import org.springframework.stereotype.Service;

@Service
public class UploadServiceImpl implements UploadService {
    @Override
    public Homework getHomeWork(String uper, String filename) {
        return new Homework(uper, filename);
    }
}
