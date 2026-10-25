public class Main {
    public static void main(String[] args) {
        Cookie cookieOne=new Cookie("Green");
        Cookie cookieTwo=new Cookie("Blue");

        cookieOne.setColour("Yellow");

        System.out.println(cookieOne.getColour());
        System.out.println(cookieTwo.getColour());
    }
}
