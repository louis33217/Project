package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.RoomOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RoomRole.RoomJPanel;

/**
 *
 * @author david
 */
public class RoomRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new RoomJPanel(userProcessContainer, account, (RoomOrganization)organization, enterprise);
    }
    
}
