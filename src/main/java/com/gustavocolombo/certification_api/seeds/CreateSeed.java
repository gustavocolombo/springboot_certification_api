package com.gustavocolombo.certification_api.seeds;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CreateSeed {
  private final JdbcTemplate jdbcTemplate;

  public CreateSeed(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public static void main(String[] args) {
    DriverManagerDataSource datasource = new DriverManagerDataSource();
    datasource.setDriverClassName("org.postgresql.Driver");
    datasource.setUrl("jdbc:postgresql://localhost:5434/springcertification");
    datasource.setUsername("postgres");
    datasource.setPassword("postgres");

    CreateSeed createSeed = new CreateSeed(datasource);
    createSeed.run(args);
  }

  public void run(String... args) {
    executeSqlFile("src/main/resources/create.sql");
  }

  private void executeSqlFile(String filePath) {
    try {
      String sqlScript = new String(Files.readAllBytes(Paths.get(filePath)));

      jdbcTemplate.execute(sqlScript);

      System.out.println("Seed realizado com sucesso");

    } catch (IOException exception) {
      System.out.println("Erro ao executar o arquivo" + exception.getMessage());
    }
  } 
}
