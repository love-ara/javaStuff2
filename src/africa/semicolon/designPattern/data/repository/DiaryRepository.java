package africa.semicolon.designPattern.data.repository;


import africa.semicolon.designPattern.data.model.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends MongoRepository<Diary, String> {

}
