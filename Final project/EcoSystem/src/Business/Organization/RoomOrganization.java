package Business.Organization;

import Business.Role.Role;
import Business.Role.RoomRole;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class RoomOrganization extends Organization{
    public RoomOrganization() {
        super(Organization.Type.Room.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoomRole());
        return roles;
    }
}
