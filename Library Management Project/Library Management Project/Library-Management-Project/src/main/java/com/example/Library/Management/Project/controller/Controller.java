package com.example.Library.Management.Project.controller;


import com.example.Library.Management.Project.model.Library;
import com.example.Library.Management.Project.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;

@RestController
@RequestMapping("/library")
public class Controller {
    @Autowired
    public LibraryService libraryService;

    @GetMapping("/get-all")
    public HashMap<String, Library> getAllLibraries(){
        return libraryService.getAllLibraries();
    }

    @PostMapping("/add-library")
    public String addLIbrary(@RequestBody Library library){
        return libraryService.addLibrary(library);
    }
    @GetMapping("/get-library-information")
    public HashMap<String, Library> getLibraryInformation(@Nullable @RequestParam String name){
        return libraryService.getLibrary(name);
    }

    @PutMapping("/update-library")
    public String updarteLibrary(@RequestBody Library library){
        return libraryService.updateLibrary(library);
    }

    @DeleteMapping("/delete-library/{name}")
    public String deleteLibrary(@PathVariable String name){
        return libraryService.deleteLibrary(name);
    }



}
