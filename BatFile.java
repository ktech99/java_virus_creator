import java.util.*;
import java.io.*;
import java.awt.*;

public class BatFile {

  public static void main(String args[])throws IOException, AWTException, InterruptedException{
    // try{
    //   Thread.sleep(100);
    // }catch (InterruptedException e){
    //   e.printStackTrace();
    // }

    PrintStream bash = new PrintStream(new File("vs.bat")); //creates a new bat file
    bash.println("@echo off\n start iexplore.exe http://www.facebook.com"); // opens facebook in IE
    PrintStream vb = new PrintStream(new File("hider.VBS")); // creates a vbs file
    vb.println("Set WshShell = CreateObject(\"WScript.Shell\" ) \nWshShell.Run chr(34) & \"vs.bat\" & Chr(34), 0 \nSet WshShell = Nothing "); //executing the bat
    vb.close(); //closing the printStream
    bash.close(); //closing the printStream
    Runtime run = Runtime.getRuntime();
    run.exec(new String[] {"cmd", "/K", "Start"}); //starting cmd
    ControlManager ctr = new ControlManager(); // creating an object of the ControlManager
    ctr.type("hider.vbs & exit"); //running the vbs file
  }
}
