
package jelszo;

public class CreatePassword {
    private String password;
    
    private String kisbetu = "qwertzuiopőúasdfghjkléáíyxcvbnmöüóű";
    private String nagybetu = "QWERTZUIOPŐÚASDFGHJKLÉÁÍYXCVBNMÖÜÓŰ";
    private String jel ="§'+!%/=()<>#&@{};,.*-_:?~^˘|";
    
    public CreatePassword(int length, int upperCase, int sign) {
        password += kivesz(nagybetu, upperCase);
        password += kivesz(kisbetu, length-upperCase-sign);
        password += kivesz(jel, sign);
    }

    private String kivesz(String sztring, int szam){
        String vissza = "";
        for (int i = 0; i < szam; i++) {
            vissza += sztring.charAt((int) Math.round(Math.random()*(sztring.length()-1)));
        }
        return vissza;
    }
    
    public String getPassword() {
        return password;
    }
    
    
}
