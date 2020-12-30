# Java CLI Starter

This is a small example of how you can build a Java command-line interface app. It uses Picocli as the command-line library and tinylog for logging.

I started this project as I needed to replace a lot of Python scripts with something that deploys with a little less concern for external libraries.

To pack the CLI app into a single (fat) jar file that contains all necessary libraries, run the "Build fat jar" gradle target. The file is saved to build/lib/\[title\]-\[version\]-all.jar.

## License

MIT.
