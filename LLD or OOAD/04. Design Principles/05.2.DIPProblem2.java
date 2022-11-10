class SQLDatabase {
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
    SQLDatabase db;

    DBConnection(SQLDatabase db) {
        this.db = db;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        SQLDatabase sql = new SQLDatabase();
        DBConnection dbConnection = new DBConnection(sql);
    }
}

class MongoDatabase {
    public void create() {
    }

    public void read() {
    }

    public void update() {
    }

    public void delete() {
    }
}
