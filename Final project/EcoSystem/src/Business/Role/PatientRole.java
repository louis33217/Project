package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.CoordinateEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PatientRole.PatientJPanel;

/**
 *
 * @author david
 */
public class PatientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new PatientJPanel(userProcessContainer, account, (PatientOrganization)organization, (CoordinateEnterprise)enterprise, system);
    }
    
}
