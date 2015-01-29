/**
 * 
 */
package skivcirkeln;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author leon
 *
 */
public interface RecordRepository extends MongoRepository<Record, String> {
}
