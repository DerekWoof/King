package com.king;

import org.springframework.stereotype.Service;

/**
 * Created by Rafal on 2017-10-24.
 */
@Service(value = "promotion")
public class PromotionToKnightCommand implements KingCommand {
    public void command() {
        System.out.println("KIng promote knight ");
    }
}
