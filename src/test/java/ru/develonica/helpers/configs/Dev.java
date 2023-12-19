package ru.develonica.helpers.configs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:dev.properties"
})
public interface Dev extends Config {

    @Key("baseUrl")
    String getBaseUrl();
}