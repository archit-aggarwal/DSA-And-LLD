package AbstractFactory.Solution;

public abstract class DatabaseFactory {
    DatabaseConnectionFactory dbConnection;
    DataFormatFactory dataformat;

    public DatabaseFactory(DatabaseConnectionFactory dbConnection, DataFormatFactory dataformat) {
        this.dbConnection = dbConnection;
        this.dataformat = dataformat;
    }

    public void setupDatabase() {
        // dbConnection.getDB();
        // dataformat.getDataFormat();
    }
}
