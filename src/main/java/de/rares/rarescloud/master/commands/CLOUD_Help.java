package de.rares.rarescloud.master.commands;

import de.rares.rarescloud.master.MyLog;
import de.rares.rarescloud.master.master.Master;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLOUD_Help implements Command{

    public CLOUD_Help(){

        MyLog.log("HelpCommand initialisiert");

    }

    public void execute(String key) {
        for(Command c : Master.commands){
            System.out.println(c.getName().get(1) + " " +  c.getHelpMessage());
        }
    }

    public List<String> getName() {
        List<String> list = Arrays.asList("help", "?", "h");
        return list;
    }

    public String getHelpMessage() {
        return "| Schau dir alle Commands an!";
    }
}