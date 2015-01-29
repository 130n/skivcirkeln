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

@RepositoryRestResource(collectionResourceRel = "opinion", path = "opinion")
public interface OpinionRepository extends MongoRepository<Opinion, String> {
}
