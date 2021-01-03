
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Przydzielak {



    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("Nzk0ODc5MTU4MjYxMTIxMDM2.X_BO5w.o5denzKXq9y1GIGnxL7zYPrm1y8").build();
            jda.addEventListener(new Autorole());

        }

    }
