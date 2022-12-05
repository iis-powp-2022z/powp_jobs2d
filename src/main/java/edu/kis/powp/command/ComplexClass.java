package edu.kis.powp.command;

import java.util.LinkedList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexClass implements DriverCommand {

	private List<DriverCommand> driverCommandList = new LinkedList<>();

	private void addDriverCommand(DriverCommand driverCommand) {
		this.driverCommandList.add(driverCommand);
	}

	@Override
	public void execute(Job2dDriver driver) {
		driverCommandList.forEach(driverCommand -> driverCommand.execute(driver));
	}
}
