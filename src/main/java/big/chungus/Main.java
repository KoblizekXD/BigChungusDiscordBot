package big.chungus;

import big.chungus.commands.Help;
import org.jcmds.JAPI;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException, InterruptedException {
        JAPI.initialize(args[0]);
        JAPI.setGuildID("988441195011248138");
        registry();
    }
    public static void registry() {
        new Help();
    }
}