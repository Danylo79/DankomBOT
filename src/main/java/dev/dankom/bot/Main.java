package dev.dankom.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    private static JDA jda;
    private static JDABuilder jdaBuilder;

    public Main(JDA jda, JDABuilder jdaBuilder) {
        this.jda = jda;
        this.jdaBuilder = jdaBuilder;
    }

    public static JDA getJda() {
        return jda;
    }

    public static JDABuilder getJdaBuilder() {
        return jdaBuilder;
    }
}
