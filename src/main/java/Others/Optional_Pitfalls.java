package Others;

import java.util.Optional;

public class Optional_Pitfalls {
    public static void main(String[] args){
        Optional<String> cellNumber = null;
        try {
            //cellNumber = Optional.ofNullable(findByCellNumber("cellNumber")).orElse(Optional.of("Hello"));
            Optional<Boolean> b2bTokenUser = Optional.ofNullable(null);
            boolean isB2bToken = b2bTokenUser.orElseGet(()->check());
            System.out.println(isB2bToken);
        } catch (Exception e) {
            System.out.println("Exception Occurred");
            e.printStackTrace();
        }


    }


    public static Optional<String> findByCellNumber(String cellNumber) {
            return Optional.of("MethodHello");

    }

    public static Boolean check(){

        System.out.println("Returning Value");
        return false;
    }
}
