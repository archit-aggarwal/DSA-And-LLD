interface IDatabase {
    public void create();

    public void read();

    public void update();

    public void delete();
}

class SQLDatabase implements IDatabase {
    public void create() {
    }

    public void read() {
    }

    public void update() {
    }

    public void delete() {
    }
}

class MongoDatabase implements IDatabase {
    public void create() {
    }

    public void read() {
    }

    public void update() {
    }

    public void delete() {
    }
}

class DBConnection {
    IDatabase db;

    DBConnection(IDatabase db) {
        this.db = db;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        IDatabase sql = new SQLDatabase();
        DBConnection dbConnection = new DBConnection(sql);

        IDatabase mongoose = new MongoDatabase();
        dbConnection = new DBConnection(mongoose);
    }
}
