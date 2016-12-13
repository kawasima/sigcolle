package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;
import org.pegdown.Extensions;
import org.pegdown.PegDownProcessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.stream.Collectors;

/**
 * @author kawasima
 */
public class V4__InsertCampaign implements JdbcMigration {
    private String read(InputStream in) throws IOException {
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(in))) {
            return buf.lines().collect(Collectors.joining("\n"));
        }
    }

    @Override
    public void migrate(Connection connection) throws Exception {
        String sql = "INSERT INTO campaign(campaign_id, title, statement, goal, created_by) " +
                "VALUES(?,?,?,?,?)";
        String statement = read(ClassLoader.getSystemResourceAsStream("statement.md"));
        PegDownProcessor processor = new PegDownProcessor(Extensions.ALL);

        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, 1L);
            stmt.setString(2, "開発に必要なサイトはプロキシでのブロックをやめたい！");
            stmt.setString(3, processor.markdownToHtml(statement));
            stmt.setLong(4, 1000L);
            stmt.setString(5, "kawasima");
            stmt.executeUpdate();
            connection.commit();
        }
    }
}
