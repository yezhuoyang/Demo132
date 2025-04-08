# Demo132





Generate syntax tree and visitor class

```bash
java -jar jtb132.jar tiniJava.jj
```

Generate tiniJava parser:

```bash
cd tiniJavaParser/
javacc ../jtb.out.jj
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

