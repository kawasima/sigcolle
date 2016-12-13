package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author kawasima
 */
public class V3__CreateSignatureAttribute implements JdbcMigration {
    @Override
    public void migrate(Connection connection) throws Exception {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("CREATE TABLE signature_attribute (" +
                    "signature_attribute_id INTEGER NOT NULL PRIMARY KEY," +
                    "campaign_id INTEGER NOT NULL," +
                    "name VARCHAR(30) NOT NULL," +
                    "type VARCHAR(30) NOT NULL" +
                    ")"
            );
        }
    }
}
