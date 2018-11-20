
package com.airhacks.ping.boundary;

import com.airhacks.ping.entity.Snoer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class SnoerWinkel {

    @PersistenceContext
    EntityManager em;

    public void save(Snoer snoer) {
        this.em.merge(snoer);
    }

    public List<Snoer> all() {
        return this.em.createQuery("select s FROM Snoer s", Snoer.class).getResultList();
    }


}
