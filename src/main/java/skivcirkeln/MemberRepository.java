/**
 * 
 */
package skivcirkeln;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author leon
 *
 */
public interface MemberRepository extends MongoRepository<Member, String> {
    public Member findByCallsign();
}
