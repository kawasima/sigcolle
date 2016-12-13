package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author kawasima
 */
public class V2__CreateSignature implements JdbcMigration {
    @Override
    public void migrate(Connection connection) throws Exception {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("CREATE TABLE signature (" +
                    "signature_id IDENTITY PRIMARY KEY," +
                    "name VARCHAR(30) NOT NULL," +
                    "signature_comment CLOB," +
                    "campaign_id INTEGER NOT NULL," +
                    ")"
            );
        }
    }
}
