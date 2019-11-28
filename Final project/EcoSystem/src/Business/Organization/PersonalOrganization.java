package Business.Organization;

import Business.Role.PersonalRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class PersonalOrganization extends Organization{
    public PersonalOrganization(){
        super(Organization.Type.Personal.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PersonalRole());
        return roles;
    }
}
