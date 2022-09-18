package vultureweb.dev.incubator.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SwitchBoardTest {

   private final SwitchBoard switchBoard = new SwitchBoard();

   @Test
   void shouldEchoString() {
      assertEquals("Hello",switchBoard.showType("Hello"));
   }

   @Test
   void shouldShowValueOfInteger() {
      assertEquals("It is an integer 100", switchBoard.showType(Integer.valueOf("100")));
   }
}
