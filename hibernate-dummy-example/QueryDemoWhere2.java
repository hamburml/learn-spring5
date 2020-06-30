import org.hibernate.Session;

public class QueryDemo {

    public static void main() {
        SessionFactory factory = new Configuration()
                                .configure(PATH_TO_HIBERNATE_CONFIG) // default: hibernate.cfg.xml
                                .addAnnotatedClass(Class.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            List<Class> allClasses = session.createQuery("from Class c where c.email LIKE '%gmx.de'").getReturnList();

            for(class : allClasses)
            {
                System.out.println(class);
            }

            session.getTransaction().commit();

        }
        finally
        {
            factory.close();
        }
    }

}

