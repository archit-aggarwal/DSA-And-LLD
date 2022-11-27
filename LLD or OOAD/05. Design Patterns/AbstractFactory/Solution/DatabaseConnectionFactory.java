package AbstractFactory.Solution;

public abstract class DatabaseConnectionFactory {

}

class SQLFactory extends DatabaseConnectionFactory {

}

class MongoFactory extends DatabaseConnectionFactory {

}

class FirestoreFactory extends DatabaseConnectionFactory {

}

