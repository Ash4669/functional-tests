package Hooks;

import org.junit.jupiter.api.AfterAll;
import Browser.Browser;


import java.io.IOException;

public class Hooks {

    @AfterAll
    public void tearDown() throws IOException {
        if (Browser.isBrowserOpen()) {
            Browser.quit();
        }
    }
}
