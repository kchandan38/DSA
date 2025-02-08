package JavaVersions;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

public class Java15Features {

    public sealed interface Command
            permits LoginCommand{
        //...
    }

    // For a not permitted class, it throws compile-time errors:
  //  public static final class UnknownCommand implements Command {
        //...
   // }

    // close, dun extends me
    public static final class LoginCommand implements Command{
    }

    // another sealed class
    //  must have subclasses
   // public sealed static class LogoutCommand implements Command
    //        permits LogoutAndDeleteCachedCommand {
   // }

  //  public static class PluginCommand implements Command {
  //  }



    public static void main(String[] args)
        throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("Ed25519");
        KeyPair kp = kpg.generateKeyPair();

        byte[] msg = "abc".getBytes(StandardCharsets.UTF_8);

        Signature sig = Signature.getInstance("Ed25519");
        sig.initSign(kp.getPrivate());
        sig.update(msg);
        byte[] s = sig.sign();

        System.out.println(Base64.getEncoder().encodeToString(s));
    }
}