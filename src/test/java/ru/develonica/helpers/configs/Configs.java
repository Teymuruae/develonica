package ru.develonica.helpers.configs;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:config.properties"
})
public interface Configs extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();
}