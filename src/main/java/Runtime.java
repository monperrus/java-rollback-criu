import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public class Runtime {

private interface CLibrary extends Library {
CLibrary INSTANCE = (CLibrary) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"), CLibrary.class);
int system(String cmd);
int execlp(String cmd, String... args);
}

public static int system(String command) {
return CLibrary.INSTANCE.system(command);
}

public static int execlp(String command, String... args) {
return CLibrary.INSTANCE.execlp(command, args);
}

public static void main(String[] args) {
  execlp("java", new String[] {"java", "-version"} );
  execlp("uname", new String[] {"ls"} );
  //exec("uname");}
}


}
