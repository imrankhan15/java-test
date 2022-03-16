public class Main {
    public static void main(String[] args){
        Lens lensOne = new Lens(
                "sony",
                "85mm",
                true);

        Lens lensTwo = new Lens(
                "sony",
                "30mm",
                true);

        Lens lensThree = new Lens(
                "canon",
                "24-70mm",
                true);

        System.out.println("lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

        System.out.println("lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);

        System.out.println("lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);

    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
