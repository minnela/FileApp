package entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Table(appliesTo = "fileEntity")
public class FileEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@NonNull private String name;
	@NonNull private String category;
	@NonNull private String extension;
	private String url;
	@NonNull private MultipartFile file;

}
