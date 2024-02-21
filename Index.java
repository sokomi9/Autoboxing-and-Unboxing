public class Index
{
    public static void main(String[] args) {
        int num = 50;
        Integer num1 = num; //Autoboxing

        System.out.println(num);

        int num3 = num1; //Auto-unboxing

        System.out.println(num3);

        String str = "25";
        int num4 = Integer.parseInt(str);
        System.out.println(num4 * 4);
    }
}