package skivcirkeln;

import org.springframework.data.annotation.Id;

public class Member {

    @Id
    private String id;

    private String callsign;
    private String realName;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", callsign=" + callsign + ", realName="
                + realName + ", email=" + email + "]";
    }

}
