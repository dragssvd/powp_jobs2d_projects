package edu.kis.powp.jobs2d.drivers.composite;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface IDriverComposite extends Job2dDriver {
    void add(Job2dDriver driver);
    Job2dDriver getDriver(int k);
    void remove(Job2dDriver driver);
}