/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CoordinateEnterprise extends Enterprise {
    private WorkQueue patientQueue;
    public CoordinateEnterprise(String name){
        super(name,EnterpriseType.Coordinate);
        patientQueue = new WorkQueue();
    }

    public WorkQueue getPatientQueue() {
        return patientQueue;
    }

    public void setPatientQueue(WorkQueue patientQueue) {
        this.patientQueue = patientQueue;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
