package service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import entity.FileEntity;

public interface FileService {
	void upload(MultipartFile file);
	List<FileEntity> findAllFiles();
	List<FileEntity> findFilesByCategory(String category);
	void download(MultipartFile file);
}
