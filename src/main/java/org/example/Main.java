package org.example;

public class Main {

  public static void main(String[] args) {
    String s = """
    All good;
    Oh really?
    """;
    System.out.println(s);
    System.out.println(matchWithSwitch(-123));
    System.out.println(matchWithSwitch(123.1));
    System.out.println(matchWithSwitch(null));
  }

  public static String matchWithSwitch(Object in) {
    return switch (in) {
      case null -> "oh come on...";
      case Integer i when i < 0 -> "got a negative number: " + i;
      case Integer i -> "got a number:" + i;
      case String s -> "got a string of length: " + s.length();
      default -> "got something unknown";
    };
  }
}