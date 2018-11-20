
package com.airhacks.ping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author airhacks.com
 */
@Entity
public class Snoer {

    @Id
    @GeneratedValue
    private long id;

    public int lengte;
    public String kleur;

    public Snoer(int lengte, String kleur) {
        this.lengte = lengte;
        this.kleur = kleur;
    }

    public Snoer() {
    }



}
