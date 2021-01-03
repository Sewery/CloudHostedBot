
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Przydzielak {



    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("Nzk0ODc5MTU4MjYxMTIxMDM2.X_BO5w.4JyH_vEPCbVPIdcKpE3fy0KCyew").build();
            jda.addEventListener(new Autorole());

        }

    }
