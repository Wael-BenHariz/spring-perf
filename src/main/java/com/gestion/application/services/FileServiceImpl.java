package com.gestion.application.services;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileServiceImpl implements FileService{

    private final Path root = Paths.get("uploads/");


    @Override
    public void save(MultipartFile file , String username) {
        try {
            Files.copy(file.getInputStream(), this.root.resolve(username));
        } catch (Exception e) {
            throw new RuntimeException("Could not store the file. Error: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity<Resource> load(String filename) throws IOException{
        Path filePath = root.toAbsolutePath().normalize().resolve(filename) ;
        Resource resource = new UrlResource(filePath.toUri()) ;
        HttpHeaders httpHeaders = new HttpHeaders() ;
        httpHeaders.add("File-Name" , filename);
        httpHeaders.add(HttpHeaders.CONTENT_DISPOSITION , "attachment;File-Name" + resource.getFilename());
        return ResponseEntity.ok().contentType(MediaType.parseMediaType(Files.probeContentType(filePath)))
                .headers(httpHeaders).body(resource);
    }
}
