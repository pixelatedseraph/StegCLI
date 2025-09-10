package com.pixel.stegcli.cli;
import com.pixel.stegcli.decoder.MessageDecoder;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;
@Command (name = "show", description = "reveals the hidden message")
public class RevealCommand implements Runnable {
    @Parameters (index = "0",description = "Input File Path")
    private String inputFile;
    @Option(names = {"-k","--key"},description = "Optional key")
    private String key;
/* call decoding API */
    @Override
    public void run() {
        MessageDecoder decoder = new MessageDecoder();
        try {
            String hiddenMessage = decoder.decode(inputFile,key);
            System.out.println("Message Successfully decoded : " +hiddenMessage);
        }
        catch (Exception e){
            System.err.println("Something went Wrong decoding the message "+ e.getMessage());
        }
    }
}
