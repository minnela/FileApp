package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.FileEntity;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long>{
  List<FileEntity> findFilesByCategory(String category);
}
