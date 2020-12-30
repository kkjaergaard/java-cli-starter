# Java CLI Starter

This is a small example of how you can build a Java command-line interface app. It uses Picocli (4.5.2) as the command-line 
library, tinylog (1.3.6) for logging, and shadowJar (6.1.0) for packing everything into one file.

I started this project as I needed to replace a lot of Python scripts with something that deploys with less concern 
for external libraries and version collisions.

To pack the CLI app into a single (fat) jar file that contains all necessary libraries, run the "shadowJar" gradle target. The file is saved to build/lib/\[title\]-\[version\]-all.jar.

## License

MIT.
