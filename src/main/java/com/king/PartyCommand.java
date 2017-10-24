package com.king;

import org.springframework.stereotype.Service;

/**
 * Created by Rafal on 2017-10-24.
 */
@Service(value = "party")
public class PartyCommand implements KingCommand {

    public void command() {
        System.out.println("PARTY !!!");
    }
}
