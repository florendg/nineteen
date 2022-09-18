package vultureweb.dev.incubator.demo;

public class SwitchBoard {

   public String showType(Object input) {
      return switch (input) {
         case Integer i -> "It is an integer " + i;
         case String s -> s;
         default -> "Don't know what type it is";
      };
   }
}
