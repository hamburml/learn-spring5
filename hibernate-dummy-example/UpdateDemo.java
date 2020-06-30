import org.hibernate.Session;

public class QueryDemo {

    public static void main() {
        SessionFactory factory = new Configuration()
                                .configure(PATH_TO_HIBERNATE_CONFIG)
                                .addAnnotatedClass(CLASS.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            // 1 is already in db
            int classId = 1;

            Class myClass = session.get(Class.class, classId);

            myClass.name = "NewName";

            // no need to call something like "update" or "save" because myClass is already a 'stored' object
            session.getTransaction().commit();

        }
        finally
        {
            factory.close();
        }
    }

}

