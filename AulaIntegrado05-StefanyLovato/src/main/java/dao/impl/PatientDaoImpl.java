package dao.impl;

import dao.ConfigJDBC;
import dao.IDao;
import model.Patient;

import java.util.logging.Logger;

public class PatientDaoImpl implements IDao<Patient>{

    private ConfigJDBC configjdbc;
    final static Logger log = Logger.getLogger(PatientDaoImpl.class);

    public PatientDaoImpl(ConfigJDBC configjdbc) {
        this.configjdbc = configjdbc;
    }

}
