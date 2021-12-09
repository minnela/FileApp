package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import entity.FileEntity;
import lombok.AllArgsConstructor;
import service.FileService;

@RestController
@RequestMapping("/files")
@AllArgsConstructor
public class FileController {
	private FileService fileService;
	
	@PostMapping()
	public ResponseEntity upload(@RequestBody MultipartFile file, 
			@RequestParam String category) {
		try {
			FileEntity fileEntity = fileService.upload(file, category);
			return new ResponseEntity(fileEntity, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
