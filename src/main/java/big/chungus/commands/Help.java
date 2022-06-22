package big.chungus.commands;

import org.jcmds.commands.extendable.slash.SlashCommand;
import org.jcmds.commands.lambda.event.SlashCommandEvent;
import org.jcmds.commands.lambda.slash.Option;

public class Help extends SlashCommand {
    public Help() {
        super("help", "no", true);
    }
    @Override
    public void onInteraction(SlashCommandEvent slashCommandEvent) {
        slashCommandEvent.reply("No help for u");
    }
}
