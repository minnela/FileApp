package service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import entity.FileEntity;
import lombok.AllArgsConstructor;
import repository.FileRepository;

@Service
@AllArgsConstructor
public class FileServiceImpl implements FileService{
	
	private FileRepository fileRepository;

	@Override
	public FileEntity upload(MultipartFile file, String category) {
		String extension = file.getOriginalFilename().split("\\.")[1];
		FileEntity fileEnt = new FileEntity(file.getName(), category, extension, file);
		fileRepository.save(fileEnt);
		return fileEnt;
	}

	@Override
	public List<FileEntity> findAllFiles() {
		return fileRepository.findAll();
	}

	@Override
	public List<FileEntity> findFilesByCategory(String category) {
		return fileRepository.findFilesByCategory(category);
	}

	@Override
	public void download(MultipartFile file) {
		// TODO Auto-generated method stub
	}

}
