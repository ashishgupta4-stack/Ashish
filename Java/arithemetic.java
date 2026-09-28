class IllegalNumberOfArguments extends Exception {
    public IllegalNumberOfArguments(String message) {
        super(message);
    }
}
class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String message) {
        super(message);
    }
}
class NegativeResultException extends Exception {
    public NegativeResultException(String message) {
        super(message);
    }
}
class myMain7 {
    public static void main(String[] args) {
        try {
            if (args.length < 3) {
                throw new IllegalNumberOfArguments(
                    "Illegal Number of Arguments"
                );
            }
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            String op = args[2];
            int result;
            if (op.equals("+")) {
                result = a + b;
            }
            else if (op.equals("-")) {
                result = a - b;
            }
            else if (op.equals("*")) {
                result = a * b;
            }
            else if (op.equals("/")) {
                result = a / b;
            }
            else {
                throw new InvalidOperatorException(
                    "Invalid Operator Exception"
                );
            }
            if (result < 0) {
                throw new NegativeResultException(
                    "Negative Result Exception"
                );
            }
            System.out.println("Result = " + result);
        }
        catch (IllegalNumberOfArguments e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        }
        catch (NegativeResultException e) {
            System.out.println(e.getMessage());
        }
    }
}