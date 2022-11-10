class StandardKeyboard {
    public String read() {
        return "Keyboard Input";
    }
}

class BlackAndWhitePrinter {
    public void print(String str) {
        System.out.println("Black & White Printout : " + str);
    }
}

class Windows7 {

    private final StandardKeyboard reader;
    private final BlackAndWhitePrinter writer;

    public Windows7() {
        reader = new StandardKeyboard();
        writer = new BlackAndWhitePrinter();
    }

    public void copy() {
        String str = reader.read();
        writer.print(str);
    }
}

