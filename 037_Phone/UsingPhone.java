public class UsingPhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone("11", "pink", 20, 4);
        myPhone.updatedVersion("11");
        myPhone.getColor("pink");
        myPhone.batteryAmount(20);
        myPhone.totalAge(4);
    }
}