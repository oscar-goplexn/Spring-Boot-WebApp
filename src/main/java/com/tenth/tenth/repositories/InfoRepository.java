package com.tenth.tenth.repositories;
import com.tenth.tenth.model.Info;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends MongoRepository<Info, String>{	
}
