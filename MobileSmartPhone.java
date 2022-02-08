class MobilePhone {
    protected String number;    //전화번호

    public MobilePhone(String num) {
        number = num;
    }
    public void answer() {
        System.out.println("Hi~ from " + number);
    }
}

class SmartPhone extends MobilePhone {
    private String androidVer;     //안드로이드 운영체제 네임(버전)

    public SmartPhone(String num, String ver) {
        super(num);
        androidVer = ver;
    }
    public void playApp() {
        System.out.println("App is running in " + androidVer);
    }
}

public class MobileSmartPhone {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("010-6792-2533", "Nougat");
        phone.answer();
        phone.playApp();
    }
}
