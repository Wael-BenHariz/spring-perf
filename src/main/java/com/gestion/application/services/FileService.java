package com.gestion.application.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;

import java.io.IOException;

public interface FileService {
    public void save(MultipartFile file , String username);
    public ResponseEntity<Resource> load(String filename) throws IOException;
}
