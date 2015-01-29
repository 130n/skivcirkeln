/**
 * 
 */
package skivcirkeln;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author leon
 *
 */
public interface OpinionRepository extends MongoRepository<Opinion, String> {
}
