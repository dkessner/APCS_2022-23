# Unit 6 - Processing libraries

Topics:
- `CLASSPATH`
- using the Processing libraries


## Set your CLASSPATH

On Mac, if you installed Processing in your Applications folder, the
Processing library (.jar) files are (usually) found here:
`/Applications/Processing.app/Contents/Java/core/library`

You can export the `CLASSPATH` environment variable to let `javac/java`
know where to look for .jar files.

```console
export CLASSPATH=".:/Applications/Processing.app/Contents/Java/core/library/*"
```

For Processing Sound, include the path to the Sound library in
CLASSPATH: 
```
"$HOME/Documents/Processing4/libraries/sound/library/*"
```

You will want to add this line to your shell initialization file, e.g.
```.bash_profile```, ```.bashrc```, or ```.zshrc``` depending on your
setup.


## Demo files

- <a href="../unit6_demo/HelloProcessing.java">HelloProcessing.java</a>

- <a href="../unit6_demo/Ball.java">Ball.java</a>
- <a href="../unit6_demo/Bounce.java">Bounce.java</a>

