public class JpaConfig {
    
    private String hibernateDialect;
    private DdlMode DdlAutoMode;

    public String getHibernateDialect() {
        return this.hibernateDialect;
    }

    public void setHibernateDialect(String hibernateDialect) {
        this.hibernateDialect = hibernateDialect;
    }

    public DdlMode getDdlAutoMode() {
        return this.DdlAutoMode;
    }

    public void setDdlAutoMode(DdlMode DdlAutoMode) {
        this.DdlAutoMode = DdlAutoMode;
    }


    @Override
    public String toString() {
        return "{" +
            " hibernateDialect='" + getHibernateDialect() + "'" +
            ", DdlAutoMode='" + getDdlAutoMode() + "'" +
            "}";
    }
}
