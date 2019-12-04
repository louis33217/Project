package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PersonalOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PersonalRole.PersonalJPanel;

/**
 *
 * @author david
 */
public class PersonalRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new PersonalJPanel(userProcessContainer, account, (PersonalOrganization)organization, enterprise, network);
    }
    
}
