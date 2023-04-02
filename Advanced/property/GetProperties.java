import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class GetProperties {
    public static void main(String[] args) {
        Properties application = new Properties();
        String filePropName = "application.properties";
        ThymleafConfig thymleafConfig = new ThymleafConfig();
        DataSources dataSources = new DataSources();
        JpaConfig jpaConfig = new JpaConfig();
        try {
            Reader reader = new FileReader(filePropName);
            application.load(reader);

            switch (application.getProperty("spring.jpa.hibernate.ddl-auto")) {
                case "create":
                case "CREATE":
                    jpaConfig.setDdlAutoMode(DdlMode.CREATE);
                    break;
                case "update":
                case "UPDATE":
                    jpaConfig.setDdlAutoMode(DdlMode.UPDATE);
                    break;
                case "none":
                case "NONE":
                    jpaConfig.setDdlAutoMode(DdlMode.NONE);
                    break;
                case "create-drop":
                case "CREATE-DROP":
                    jpaConfig.setDdlAutoMode(DdlMode.CREATE_DROP);
                    break;
                case "validate":
                case "VALIDATE":
                    jpaConfig.setDdlAutoMode(DdlMode.VALIDATE);
                    break;
                default:
                    break;
            }
            jpaConfig.setHibernateDialect(application.getProperty("spring.jpa.properties.hibernate.dialect"));

            dataSources.setUsername(application.getProperty("spring.datasource.username", "root"));
            dataSources.setPassword(application.getProperty("spring.datasource.password"));
            dataSources.setUrl(application.getProperty("spring.datasource.url"));

            thymleafConfig.setCache(Boolean.parseBoolean(application.getProperty("spring.thymeleaf.cache")));
            thymleafConfig.setResolverOrder(Integer.valueOf(application.getProperty("spring.thymeleaf.template-resolver-order")));
            thymleafConfig.setPrefix(application.getProperty("spring.thymeleaf.prefix"));
            thymleafConfig.setSuffix(application.getProperty("spring.thymeleaf.suffix"));

            System.out.println(dataSources + "\n" + thymleafConfig + "\n" + jpaConfig);
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}