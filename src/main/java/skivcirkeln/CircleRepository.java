package skivcirkeln;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "circle", path = "circle")
public interface CircleRepository extends MongoRepository<Circle, String> {

}
