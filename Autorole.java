import com.sun.security.auth.callback.TextCallbackHandler;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.restaction.MessageAction;

import java.awt.*;

public class Autorole extends ListenerAdapter {
    private String textChannel;

    public void onGuildMessageReceived(GuildMessageReceivedEvent e){
        String mess = e.getMessage().getContentRaw();
        textChannel =e.getChannel().getId();
        if(mess.equalsIgnoreCase("!autorole-games")){
            e.getMessage().delete().queue();
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.red);
            embedBuilder.setTitle("GRA | \uD83E\uDD23 -CS:GO , \uD83D\uDE09 - LOL , \uD83D\uDE07 - WOT");
            e.getChannel().sendTyping().queue();
            e.getChannel().sendMessage(embedBuilder.build()).queue(
                    message ->
            { message.addReaction("\uD83E\uDD23").queue();
            message.addReaction("\uD83D\uDE09").queue();
            message.addReaction("\uD83D\uDE07").queue();
        });
            embedBuilder.clear();

    }
    }
    @Override
    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent ev){

        Guild guild = ev.getGuild();
        if(ev.getChannel().getId().equals(textChannel)){
            if(ev.getReactionEmote().getName().equals("\uD83E\uDD23")){

                Role role = ev.getGuild().getRolesByName("CS:GO",true).get(0);
                guild.addRoleToMember(ev.getMember(), role).queue();
            }
            if(ev.getReactionEmote().getName().equals("\uD83D\uDE09")){
                Role role = ev.getGuild().getRolesByName("LOL",true).get(0);
                guild.addRoleToMember(ev.getMember(), role).queue();
            }
            if(ev.getReactionEmote().getName().equals("\uD83D\uDE07")){
                Role role = ev.getGuild().getRolesByName("WOT",true).get(0);
                guild.addRoleToMember(ev.getMember(), role).queue();
            }
        }





    }

}
