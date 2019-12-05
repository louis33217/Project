package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.CoordinateEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.MatchingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MatchingRole.MatchingJPanel;

/**
 *
 * @author david
 */
public class MatchingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new MatchingJPanel(userProcessContainer, account, (MatchingOrganization)organization, (CoordinateEnterprise)enterprise);
    }
    
}
