package Business.Organization;

import Business.Role.MatchingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class MatchingOrganization extends Organization{
    public MatchingOrganization(){
        super(Organization.Type.Matching.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MatchingRole());
        return roles;
    }
}
