public class Ques03 {
    public static void main(String[] args) {
        int product=1;
        for(int i=0;i<args.length;i++)
            product=product*Integer.parseInt(args[i]);
        System.out.println("Total product of numbers : "+product);
    }
}
