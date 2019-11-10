package modifier;

public class AccessModifier {

    String defaultname;
    public String publicname;

    public String getDefaultname() {
        return defaultname;
    }

    public void setDefaultname(String defaultname) {
        this.defaultname = defaultname;
    }

    public String getPublicname() {
        return publicname;
    }

    public void setPublicname(String publicname) {
        this.publicname = publicname;
    }

    public static void main(String[] args) {
        Modfier2.method();
    }

}
