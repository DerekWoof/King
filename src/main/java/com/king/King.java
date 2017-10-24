package com.king;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Rafal on 2017-10-24.
 */
@Component(value = "king")
public class King {

    @Value("${database.address}")
    private String dataBaseAddress;

    private Map<String, KingCommand> commands;

    @Autowired
    public King(Map<String, KingCommand> commands) {
        this.commands = commands;
    }

    public void kill() {
        KingCommand killKingCommand = commands.get("kill");
        killKingCommand.command();
    }

    public void promote() {
        KingCommand promotionKingCommand = commands.get("promotion");
        promotionKingCommand.command();
    }




}
