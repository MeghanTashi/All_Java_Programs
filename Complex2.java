class Complex {

    int real, imaginary;

    Complex() {
    }

    Complex(int tempReal, int tempImaginary) {
        real = tempReal;
        imaginary = tempImaginary;
    }

    Complex addComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }

    public static void main(String[] args) {

        Complex C1 = new Complex(3, 2);

        // printing first complex number
        System.out.println("Complex number 1 : " + C1.real
                + " + i" + C1.imaginary);

        // Second Complex number
        Complex C2 = new Complex(9, 5);

        // Printing second complex number
        System.out.println("Complex number 2 : " + C2.real
                + " + i" + C2.imaginary);

        // Storing the sum
        Complex C3 = new Complex();

        // Calling addComp() method
        C3 = C3.addComp(C1, C2);

        // Printing the sum
        System.out.println("Sum of complex number : "
                + C3.real + " + i"
                + C3.imaginary);
    }
}