package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CompanyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CompanyRole.CompanyJPanel;

/**
 *
 * @author david
 */
public class CompanyRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new CompanyJPanel(userProcessContainer, account, (CompanyOrganization)organization, enterprise, network);
    }
    
}
