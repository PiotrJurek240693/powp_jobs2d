package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

import java.util.*;

public class CommandFactory {
    public static DriverCommand getRectangleCommand() {
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(50, 50));
        list.add(new OperateToCommand(-50, 50));
        list.add(new OperateToCommand( -50, -50));
        list.add(new OperateToCommand(50, -50));
        list.add(new OperateToCommand(50, 50));
        return new ComplexCommand(list);
    }

    public static DriverCommand getTriangleCommand() {
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand( 0, 50));
        list.add(new OperateToCommand( 50, 0));
        list.add(new OperateToCommand(-50, 0));
        list.add(new OperateToCommand(0, 50));
        return new ComplexCommand(list);
    }
}
