package dev.dankom.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    private JDA jda;

    public Main() throws LoginException {
        String token = Token.getToken();
        jda = JDABuilder.createDefault(token).build();
    }
}
