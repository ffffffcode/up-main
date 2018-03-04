package ex.aaronfae.service;

import ex.aaronfae.entity.Homework;

public interface UploadService {
    Homework getHomeWork(String uper, String filename);
}
