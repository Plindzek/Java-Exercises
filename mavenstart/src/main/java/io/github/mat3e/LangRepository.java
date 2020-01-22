package io.github.mat3e;

import java.util.Optional;

/**
 * keeps list of Lang objects, and return specific  by given id
 */
class LangRepository {

/**
 * version commented without hibernate
  */
//    private List<Lang> languages;
//
//    LangRepository(){
//        languages = new ArrayList<>();
//        languages.add(new Lang(1, "Hello", "en"));
//        languages.add(new Lang(2, "Siemanko", "pl"));
//    }

    /**
     * return Lang object by given id
     * Optional because no default values allowed here
     * and null id is possible and it give info
     *  to implement error service in service
     */
//    Optional<Lang> findByID(Integer id){
//        return languages.stream()
//                .filter(l -> l.getId().equals(id))
//                .findFirst();
//    }
    private Lang result;
    Optional<Lang> findByID(Integer id){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        try {
             result = session.get(Lang.class, id);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }

        session.close();
return Optional.ofNullable(result);
    }
}
