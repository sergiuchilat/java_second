public class Lesson8 {
    public void testAndStatement() {
        int count = 0;

        if (count > 5 && ++count < 20) {
            ++count;
        }

        System.out.println(count);

        count = 0;
        if (count > 5 & ++count < 20) {
            ++count;
            ++count;
        }
        System.out.println(count);

        int number = 25;

        System.out.print("Numarul " + number + " este");
        if (number % 2 == 0) {
            System.out.print(" par");
            if (number % 4 == 0) {
                System.out.print(" divizibil la 4");
            } else {
                System.out.print(" indivizibil la 4");
            }
        } else {
            System.out.print(" impar");
            if (number % 3 == 0) {
                System.out.print(" divizibil la 3");
            } else {
                System.out.print(" indivizibil la 3");
            }
        }

        System.out.println();
        System.out.println();
        byte digit = 0;
        String digitWord = "";
        if (digit == 0) {
            digitWord = "Zero";
        } else if (digit == 1) {
            digitWord = "Unu";
        } else if (digit == 2) {
            digitWord = "Doi";
        } else if (digit == 3) {
            digitWord = "Trei";
        } else if (digit == 4) {
            digitWord = "Patru";
        } else if (digit == 5) {
            digitWord = "Cinci";
        } else if (digit == 6) {
            digitWord = "Sase";
        } else if (digit == 7) {
            digitWord = "Sapte";
        } else if (digit == 8) {
            digitWord = "Opt";
        } else if (digit == 9) {
            digitWord = "Noua";
        } else {
            digitWord = "Nu este cifra";
        }


        switch (digit) {
            case 0:
                digitWord = "Zero";
                break;
            case 1:
                digitWord = "Unu";
                break;
            case 2:
                digitWord = "Doi";
                break;
            case 3:
                digitWord = "Trei";
                break;
            case 4:
                digitWord = "Patru";
                break;
            case 5:
                digitWord = "Cinci";
                break;
            case 6:
                digitWord = "Sase";
                break;
            case 7:
                digitWord = "Sapte";
                break;
            case 8:
                digitWord = "Opt";
                break;
            case 9:
                digitWord = "Noua";
                break;
            default:
                digitWord = "Nu este cifra";
        }
        System.out.println(digit + ": " + digitWord);

        boolean flag = true;
        String message = flag ? "Flag is true": "Flag is false";
        System.out.println(message);

        /*
        *  Loops
        * */
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i);
        }
        int i = 1;
        while ( i <= 10) {
            System.out.println( i++);
        }

        i = 11;
        do {
            System.out.println( i++);
        }while ( i <= 10);

        int k = 1;
        byte delta = 1;
        while (k > 0 && k < 100) {
            if(k >= 99) {
                delta = -1;
            } else if(k <= 1) {
                delta = 1;
            }
            k += delta;
            System.out.println(k);
        }

        {
            int localVariable = 1;
            System.out.println(localVariable);
        }
        // System.out.println(localVariable);

        /* ----- Hard code here ----*/
        System.out.println("Start");
        int rows = 3;
        int cols = 3;
        System.out.println("Label break");
        breakLabel:
        for (i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%10s", "(" + i + ", " + j + ")");
                break breakLabel;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Label continue");
        continueLabel:
        for (i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%10s", "(" + i + ", " + j + ")");
                continue continueLabel;
            }
            System.out.println();
        }

        System.out.println();

        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break");
                    if (t) // break out of second block
                        break second;
                    System.out.println("After third");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after the second block");
        }
    }
}
