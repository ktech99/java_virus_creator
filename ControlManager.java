import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Scanner;

public class ControlManager {

  public void type(String str) throws IOException, AWTException, InterruptedException{
    Robot robot = new Robot();
    for(int i = 0; i < str.length(); i++){
      keyPresser(str.charAt(i), robot);
      }
      Robot robot2 = new Robot();
      robot2.keyPress(KeyEvent.VK_ENTER);
  }

  // Letter to keypress converter
  private void keyPresser(char ch, Robot robot){
    switch(ch){
      case 'a':
      case 'A':
      robot.keyPress(KeyEvent.VK_A);
      break;
      case 'b':
      case 'B':
      robot.keyPress(KeyEvent.VK_B);
      break;
      case 'c':
      case 'C':
      robot.keyPress(KeyEvent.VK_C);
      break;
      case 'd':
      case 'D':
      robot.keyPress(KeyEvent.VK_D);
      break;
      case 'e':
      case 'E':
      robot.keyPress(KeyEvent.VK_E);
      break;
      case 'f':
      case 'F':
      robot.keyPress(KeyEvent.VK_F);
      break;
      case 'g':
      case 'G':
      robot.keyPress(KeyEvent.VK_G);
      break;
      case 'h':
      case 'H':
      robot.keyPress(KeyEvent.VK_H);
      break;
      case 'i':
      case 'I':
      robot.keyPress(KeyEvent.VK_I);
      break;
      case 'j':
      case 'J':
      robot.keyPress(KeyEvent.VK_J);
      break;
      case 'k':
      case 'K':
      robot.keyPress(KeyEvent.VK_K);
      break;
      case 'l':
      case 'L':
      robot.keyPress(KeyEvent.VK_L);
      break;
      case 'm':
      case 'M':
      robot.keyPress(KeyEvent.VK_M);
      break;
      case 'n':
      case 'N':
      robot.keyPress(KeyEvent.VK_N);
      break;
      case 'o':
      case 'O':
      robot.keyPress(KeyEvent.VK_O);
      break;
      case 'p':
      case 'P':
      robot.keyPress(KeyEvent.VK_P);
      break;
      case 'q':
      case 'Q':
      robot.keyPress(KeyEvent.VK_Q);
      break;
      case 'r':
      case 'R':
      robot.keyPress(KeyEvent.VK_R);
      break;
      case 's':
      case 'S':
      robot.keyPress(KeyEvent.VK_S);
      break;
      case 't':
      case 'T':
      robot.keyPress(KeyEvent.VK_T);
      break;
      case 'u':
      case 'U':
      robot.keyPress(KeyEvent.VK_U);
      break;
      case 'v':
      case 'V':
      robot.keyPress(KeyEvent.VK_V);
      break;
      case 'w':
      case 'W':
      robot.keyPress(KeyEvent.VK_W);
      break;
      case 'x':
      case 'X':
      robot.keyPress(KeyEvent.VK_X);
      break;
      case 'y':
      case 'Y':
      robot.keyPress(KeyEvent.VK_Y);
      break;
      case 'z':
      case 'Z':
      robot.keyPress(KeyEvent.VK_Z);
      break;
      case ' ':
      robot.keyPress(KeyEvent.VK_SPACE);
      break;
      case '/':
      robot.keyPress(KeyEvent.VK_SLASH);
      break;
      case '.':
      robot.keyPress(KeyEvent.VK_PERIOD);
      break;
      case '\\':
      robot.keyPress(KeyEvent.VK_BACK_SLASH);
      break;
      case ':':
      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.keyPress(KeyEvent.VK_SEMICOLON);
      robot.keyRelease(KeyEvent.VK_SEMICOLON);
      robot.keyRelease(KeyEvent.VK_SHIFT);
      break;
      case '&':
      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.keyPress(KeyEvent.VK_7);
      robot.keyRelease(KeyEvent.VK_7);
      robot.keyRelease(KeyEvent.VK_SHIFT);
      break;
      default:
      break;
    }
  }
}
