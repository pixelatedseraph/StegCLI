package com.pixel.stegcli;
import picocli.CommandLine;
import com.pixel.stegcli.cli.*;
@CommandLine.Command(
        name="textSteg",
        mixinStandardHelpOptions = true,
        subcommands = {HideCommand.class,RevealCommand.class},
        description = "A Text Steganography Tool Written in Java"
)
public class textSteg implements Runnable {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new textSteg()).execute(args);
        System.exit(exitCode);
    }
    @Override
    public void run() {
        System.out.println("This is Main CLI use subcommands,Try --help ");
    }
}
