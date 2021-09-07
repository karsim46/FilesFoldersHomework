package com.codeclan.example.filesandfolders;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.models.User;
import com.codeclan.example.filesandfolders.repository.FileRepository;
import com.codeclan.example.filesandfolders.repository.FolderRepository;
import com.codeclan.example.filesandfolders.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesandfoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddUser() {
		User user = new User("Simon");
		userRepository.save(user);
	}

	@Test
	public void canAddFolder() {
		User user = new User("Simon");
		userRepository.save(user);

		Folder folder = new Folder("Folder1", user);
		folderRepository.save(folder);
	}

	@Test
	public void canAddFileAndFolder() {
		User user = new User("Skye");
		userRepository.save(user);

		Folder folder = new Folder("Folder2", user);
		folderRepository.save(folder);

		File file = new File("File3", "python", 100, folder);
		fileRepository.save(file);
	}











}
