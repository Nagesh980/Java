class VariableReference {
    public static void main(String[] args) {
        // Initializing variables
        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 10000L;
        float floatVar = 10.5f;
        double doubleVar = 100.55;
        char charVar = 'A';
        boolean boolVar = true;
        String strVar = "Hello";

        // Printing initial values
        System.out.println("Initial Values:");
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);
        System.out.println("strVar: " + strVar);

        // Re-initializing variables using references
        byteVar = 20;
        shortVar = byteVar;
        intVar = shortVar;
        longVar = intVar;
        floatVar = longVar;
        doubleVar = floatVar;
        charVar = 'B';
        boolVar = false;
        strVar = "World";

        // Printing updated values
        System.out.println("\nUpdated Values:");
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);
        System.out.println("strVar: " + strVar);
    }
}


class VariableScope {
    // Instance variable (belongs to the object)
    int instanceVar = 10;
    
    // Static variable (shared across all objects)
    static int staticVar = 20;

    void showScope() {
        // Local variable (exists only inside this method)
        int localVar = 30;
        
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        // Creating an object to access instance variables
        VariableScope obj1 = new VariableScope();
        obj1.showScope();
        
        // Accessing static variable directly without an object
        System.out.println("\nAccessing Static Variable: " + staticVar);
        
        // Creating another object to show instance variable is separate for each object
        VariableScope obj2 = new VariableScope();
        obj2.instanceVar = 50;
        
        System.out.println("\nAfter modifying obj2 instance variable:");
        System.out.println("obj1 instanceVar: " + obj1.instanceVar);
        System.out.println("obj2 instanceVar: " + obj2.instanceVar);
    }
}


class ControlStructuresExample {
    public static void main(String[] args) {
        
        // 1. If condition
        int num = 10;
        if (num > 5) {
            System.out.println("Number is greater than 5");
        }

        // 2. If-else condition
        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        // 3. While loop
        int count = 1;
        while (count <= 5) {
            System.out.println("While Loop Count: " + count);
            count++;
        }

        // 4. For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // 5. Switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

