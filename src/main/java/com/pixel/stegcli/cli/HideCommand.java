package com.pixel.stegcli.cli;
import com.pixel.stegcli.encoder.MessageEncoder;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;
@Command(name ="hide",description = "hide a secret message in file")
public class HideCommand implements Runnable{
    @Parameters(index="0",description = "Input file path")
    private String inputFile;
    @Parameters(index = "1", description = " Output file path")
    private String outputFile;
    @Parameters(index = "2" , description = " message to encode")
    private String data;
    @Option(names = {"-k","--key"},description = "Optional Key ")
    private String key;
    /* call encoder API */
    @Override
    public void run() {
        MessageEncoder encode = new MessageEncoder();
            try{
                encode.encoder(inputFile,outputFile,data,key);
                System.out.println("Message Encrypted Successfully!");
            } catch (Exception e) {
                System.err.println("Something went wrong : "+ e.getMessage());
            }
    }
}
