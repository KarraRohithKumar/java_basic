package ExceptionHandling;

class AgeInvalidException extends Exception {
    public AgeInvalidException(String messager) {
        super(messager);
    }
}

public class Basic {
    public static void Atage(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("not valid");
        } else {
            System.out.println("valid");
        }
    }

    public static void main(String[] args) {
        try {
            Atage(98);
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }
        try {
            Atage(20);
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}
