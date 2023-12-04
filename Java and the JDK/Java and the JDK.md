# Java and the JDK

## About the Java Runtime Environment

- JRE is an application that runs Java applications
- Compiled to Java bytecode (platform independent)
- Java Development Kit (JDK) is a set of tools for Java software development (JRE, Java complier, debugger, tools for documenting, benchmarking, and analyzing code and projects)

## Background and Concepts

- ONe of Java's primary objectives was to fix the problem of cross-platfomr software development
- "Write once, run anywhere"
- Java's core engineers build a JRE per platform, responsible for managing platform-specific resources
- javac executable (Java Complier) complies Java code to bytecode, the intermediate language
- platform-independent so it can run on any machine with a JRE

## Complier vs. Interpreter

- An implementation is either a complier that translates the programming language into another language or an interpreter that translates the language and executes it immediately

1. javac complies Java to bytecode
2. Bytecode is stored in an output file, waiting to be run
   - Bytecode is binary, but we can decomplie it with the javap executable to print the instructions in human-readable format
3. An executable in the JRE, java, interprets the bytecode and executes it immedaiately
   - The bytecode file can run on any machine with a JRE, regardless of the machine used to complie it
   - Bytecode is the executable, we can save it, copy it, and share it

## The Java Virtual Machine (JVM)

- the application that executes bytecode
- the JRE is 3 things:
  1. The JVM
  2. Many pre-built Java libraries -- bytecode will load code from these libraries
  3. Plug-ins and utilities to help deploy and start Java applications
