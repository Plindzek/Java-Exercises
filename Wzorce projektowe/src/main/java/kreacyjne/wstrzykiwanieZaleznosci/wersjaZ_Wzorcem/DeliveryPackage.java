package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;
public class DeliveryPackage {
    private final String packageName;
    private final String content;
    private final String address;
   
    
    public DeliveryPackage(String packageName, String content, String address) {
        this.packageName = packageName;
        this.content = content;
        this.address = address;
    }
    public String getPackageName() {
        return packageName;
    }
    public String getContent() {
        return content;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "DeliveryPackage{" +
                "packageName='" + packageName + '\'' +
                ", content='" + content + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}