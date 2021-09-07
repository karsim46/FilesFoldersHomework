package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.models.User;
import com.codeclan.example.filesandfolders.repository.FileRepository;
import com.codeclan.example.filesandfolders.repository.FolderRepository;
import com.codeclan.example.filesandfolders.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        User simon = new User("Simon");
        userRepository.save(simon);

        Folder folder1 = new Folder("Folder1", simon);
        folderRepository.save(folder1);

        File file1 = new File("File1", "java",1,folder1);
        fileRepository.save(file1);

        File file2 = new File("File2", "txt",10,folder1);
        fileRepository.save(file2);

        File file3 = new File("File3", "python",100,folder1);
        fileRepository.save(file3);

        User skye = new User("Skye");
        userRepository.save(skye);

        Folder folder2 = new Folder("Folder2", skye);
        folderRepository.save(folder2);

        File file4 = new File("File4", "java",1,folder2);
        fileRepository.save(file4);

        File file5 = new File("File5", "javascript",10,folder2);
        fileRepository.save(file5);

        File file6 = new File("File6", "ppt",100,folder2);
        fileRepository.save(file6);









    }
}
