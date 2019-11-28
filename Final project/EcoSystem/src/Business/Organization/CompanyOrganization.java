package Business.Organization;

import Business.Role.CompanyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class CompanyOrganization extends Organization{
    public CompanyOrganization(){
        super(Organization.Type.Company.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CompanyRole());
        return roles;
    }
}
