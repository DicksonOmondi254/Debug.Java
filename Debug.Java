package core;

import core.logging.Console;
import core.prefs.Prefs;
import core.prefs.PrefsValue;

public class Debug {

    public static void setDebug(boolean enabled) {
        Prefs.SETTINGS.updateValue("debug", enabled + "", PrefsValue.Type.BOOLEAN);

        if (enabled) {
            Console.openWindow();
        } else {
            Console.close();
        }
    }

}
