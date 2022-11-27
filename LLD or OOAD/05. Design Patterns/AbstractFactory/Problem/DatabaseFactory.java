package AbstractFactory.Problem;

public abstract class DatabaseFactory {
    public abstract DatabaseConnection getDatabase();

    public abstract DataFormat getDataFormat();
}

class PDFSQL extends DatabaseFactory {

    @Override
    public DataFormat getDataFormat() {
        return new PDF();
    }

    @Override
    public DatabaseConnection getDatabase() {
        return new SQL();
    }
}

class PDFMongo extends DatabaseFactory {

    @Override
    public DatabaseConnection getDatabase() {
        return new Mongo();
    }

    @Override
    public DataFormat getDataFormat() {
        // TODO Auto-generated method stub
        return new PDF();
    }

}

// There will be total 9 classes