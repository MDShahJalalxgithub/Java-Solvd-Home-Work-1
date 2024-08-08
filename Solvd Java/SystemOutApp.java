public class SystemOutApp {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java UserInfo <name> <age> <city>");
            return;
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        String city = args[2];

        System.out.println("User Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}