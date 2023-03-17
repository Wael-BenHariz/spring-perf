package com.gestion.application.restcontrollers;


import com.gestion.application.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/file")
public class FileRestController {

    @Autowired
    FileService fileService ;

    @RequestMapping(value = "/upload/{username}" , method = RequestMethod.POST)
    public void save (@RequestParam("file")MultipartFile multipartFile , @PathVariable("username") String user) {
        fileService.save(multipartFile , user);
    }

    @RequestMapping(value = "/load/{filename}" , method = RequestMethod.GET)
    public ResponseEntity<Resource> loadFile(@PathVariable("filename") String filename) throws IOException {
        return fileService.load(filename);
    }
}
