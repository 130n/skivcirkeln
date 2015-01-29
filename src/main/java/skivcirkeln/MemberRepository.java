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

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends MongoRepository<Member, String> {
    public Member findByCallsign();
}
