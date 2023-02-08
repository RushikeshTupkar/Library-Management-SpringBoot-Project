package com.example.Library.Management.Project.service;

import com.example.Library.Management.Project.model.Library;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class LibraryService {

    static HashMap<String,Library> libraryBase = new HashMap<>();

    static{
        libraryBase.put("Study Town",new Library("Study Town","Gade vasti road , Bakori ,Wagholi",
                "8459281670","WIFI-AC-Seperate Seating",1500));
        libraryBase.put("Padhai Adda",new Library("Padhai Adda","Dil jaha padhai krne ka man kare wo jagah aa jana...ICOER",
                "8459281670","WIFI-AC-Seperate Seating-Peaceful Environment-cafeteria",2000));
        libraryBase.put("Dnyanganga",new Library("Dnyanganga","T-point S-kherda",
                "8459281670","Big place-AC-affordable",500));
    }
    public HashMap<String, Library> getAllLibraries() {
        return libraryBase;
    }

    public String addLibrary(Library library) {
        String newName = library.getName();
        if(libraryBase.containsKey(newName)){
            return "Library already exists with name - "+newName;
        }
        libraryBase.put(library.getName(),library);
        return "Library added";
    }

    public HashMap<String, Library> getLibrary(@Nullable String name) {
        HashMap<String, Library> desiredLibrary = new HashMap<>();
        if(null!=name && libraryBase.containsKey(name)){
            Library lab = libraryBase.get(name);
            String newName = lab.getName();
            desiredLibrary.put(newName,libraryBase.get(name));
            return desiredLibrary;
        }else{
            return libraryBase;
        }
    }

    public String updateLibrary(Library library) {
        String newName = library.getName();
        if(libraryBase.containsKey(newName)){
            libraryBase.put(newName,library);
            return "Library updated";
        }else{
            return "No library Found to update with name - "+ newName;
        }

    }

    public String deleteLibrary(String name) {
        if(libraryBase.containsKey(name)){
            libraryBase.remove(name);
            return "Library deleted with name - "+ name;
        }else{
            return "No library exits with name - "+ name;
        }
    }
}
