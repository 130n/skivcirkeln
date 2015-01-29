/**
 * 
 */
package skivcirkeln;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author leon
 *
 */
@RepositoryRestResource(collectionResourceRel = "record", path = "record")
public interface RecordRepository extends MongoRepository<Record, String> {
}
