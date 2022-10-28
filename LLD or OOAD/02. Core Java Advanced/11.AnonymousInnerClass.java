abstract class Operation {
    abstract int applyOperation(int a, int b);
}

// Normal Class
class Sum extends Operation {
    @Override
    int applyOperation(int a, int b) {
        return a + b;
    }
}

class Driver {
    public static void main(String[] args) {
        Operation obj1 = new Sum();
        System.out.println(obj1.applyOperation(5, 10));

        // Local Inner Class
        class Difference extends Operation {
            @Override
            int applyOperation(int a, int b) {
                return a - b;
            }
        }

        Operation obj2 = new Difference();
        System.out.println(obj2.applyOperation(5, 10));

        // Anonymous Inner Class
        Operation multiply = new Operation() {
            int applyOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(multiply.applyOperation(5, 10));

        Operation divide = new Operation() {
            int applyOperation(int a, int b) {
                return a / b;
            }
        };

        System.out.println(divide.applyOperation(5, 15));
    }
}