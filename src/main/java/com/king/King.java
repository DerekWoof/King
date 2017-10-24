package com.king;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Rafal on 2017-10-24.
 */
@Component(value = "king")
@Scope(value = "prototype")
public class King {

    @Value("${database.address}")
    private String dataBaseAddress;

    private Map<String, KingCommand> command;

    @Autowired
    public King(Map<String, KingCommand> command) {
        this.command = command;
    }

    public void kill() {
        KingCommand killKingCommand = command.get("kill");
        killKingCommand.command();
    }

    public void promote() {
        KingCommand promotionKingCommand = command.get("promotion");
        promotionKingCommand.command();
    }




}
