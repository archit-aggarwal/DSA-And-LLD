interface Reader {
    public String read();
}

class StandardKeyboard implements Reader {
    public String read() {
        return "Keyboard Input";
    }
}

class VoiceInput implements Reader {
    public String read() {
        return "Voice Input";
    }
}

interface Writer {
    public void print(String str);
}

class BlackAndWhitePrinter implements Writer {
    public void print(String str) {
        System.out.println("Black & White Printout : " + str);
    }
}

class ColorPrinter implements Writer {
    public void print(String str) {
        System.out.println("Colored Printout : " + str);
    }
}

class ReaderWriter {

    private final Reader reader;
    private final Writer writer;

    public ReaderWriter() {
        reader = new VoiceInput();
        writer = new ColorPrinter();
    }

    public void copy() {
        String str = reader.read();
        writer.print(str);
    }
}
