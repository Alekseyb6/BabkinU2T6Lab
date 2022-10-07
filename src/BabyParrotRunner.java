public class BabyParrotRunner {
    public static void main(String[] args) {
        BabyParrot baby = new BabyParrot("Toucan", 3, 4.25);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo(); // store returned string in variable
        System.out.println(info);

    }
}
