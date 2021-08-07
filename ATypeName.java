import java.util.Date;

public class ATypeName {

    public ATypeName() {

    }

    public String getSystem_value() {
        return system_value;
    }

    public void setSystem_value(String system_value) {
        this.system_value = system_value;
    }

    private String system_value = System.getProperty("os.name");


    public static void main(String[] args) {
        System.out.println(new Date());

        System.getProperties().list(System.out);



        System.out.println("System name from ATypeName class");


    }


    int storage(String s) {
        return s.length();
    }
}
