package dk.kkjaergaard.clistarter;

import org.pmw.tinylog.Configurator;
import org.pmw.tinylog.Level;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import org.pmw.tinylog.Logger;

import java.util.concurrent.Callable;

@Command(description="CLI Starter")
class Main implements Callable<Integer> {

    @Option(names = {"-v", "--verbose"})
    boolean verbose;

    @Parameters()
    String name;

    public static void main(String[] args) throws Exception {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    protected void init_logger() {
        Level level = (this.verbose) ? Level.DEBUG : Level.INFO;
        Configurator.defaultConfig()
                .level(level)
                .activate();
    }

    public Integer call() throws Exception {
        // here: make a list of files with errors or files with non-identical duplicates
        this.init_logger();
        Logger.warn("Example warning");
        Logger.info("Example information");
        Logger.debug("Example debug");
        System.out.println(String.format("Hello %s", this.name));
        return 0;
    }
}
