package ui.Authenticator;

public class Authentication {
        public static boolean authenticate(String user, char[] pass){
            char[] Welcome=new char[]{'h', 'i'};
            if(pass==Welcome) {
                return true;
            }
            else{
                return false;

            }
        }
}

