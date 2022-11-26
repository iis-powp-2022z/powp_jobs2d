package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private final int x;
    private final int y;
    private final Job2dDriver driver;

    public SetPositionCommand(Job2dDriver driver, int x, int y) {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        if (this.driver == null) return;
        this.driver.setPosition(this.x, this.y);
    }

}
