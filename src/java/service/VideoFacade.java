/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import bean.Video;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JAOUAD
 */
@Stateless
public class VideoFacade extends AbstractFacade<Video> {
    @PersistenceContext(unitName = "JEE_MINIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VideoFacade() {
        super(Video.class);
    }
    
}
