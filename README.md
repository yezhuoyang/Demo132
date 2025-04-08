# Demo132



Generate tiniJava parser:

```bash
cd tiniJavaParser/
javacc ../tiniJava.jj 
```

Generate syntax tree and visitor class

```bash
java -jar jtb132.jar tiniJava.jj
```


Compile and run with example program input:


Compile:

```bash
javac -cp . demo.java
```


Execution:

```bash
java -cp . demo example.tinijava 
```

