package entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(appliesTo = "fileEntity")
public class FileEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String name;
	private String category;
	private String extension;
	private String url;
	private MultipartFile file;

}
