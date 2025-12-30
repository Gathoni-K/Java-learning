**Console Class in Java**
-Class interacting with the user through the terminal:
    1.read input.
    2.write output.
    3.read passwords securely.
-Lives in the 'java.io.Console'
-Is imported in every file it is used by:
    '

    import java.io.Console

# Uses:
1.Getting the console
    '

    Console console = System.console();

2.Writing output
    '

    console.printf("Hello world");

3.Reading input
    '

    String name = console.readLine("Enter your name: ");

4.Reading passwords, the most important use:
    '

    char[] password = console.readPassword("Enter Password: ");

-Scanner method is actually more preferred these days, so when do we actually use Console?
1.When writing a real CLI tool.
2.Need for a hidden password input.
3.Running in a real terminal and not an IDE.

-The class may return null.