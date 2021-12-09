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
	public void upload(MultipartFile file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FileEntity> findAllFiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FileEntity> findFilesByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void download(MultipartFile file) {
		// TODO Auto-generated method stub
		
	}

}
