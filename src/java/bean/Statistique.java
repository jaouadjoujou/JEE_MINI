/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author JAOUAD
 */
@Entity
public class Statistique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int nbrFpartage; 
    private int nbrFvue;
    @OneToOne
    private Audio audio=new Audio();
    @OneToOne
    private Video video=new Video();
    @OneToOne
    private Text text=new Text();

    public int getNbrFpartage() {
        return nbrFpartage;
    }

    public void setNbrFpartage(int nbrFpartage) {
        this.nbrFpartage = nbrFpartage;
    }

    public int getNbrFvue() {
        return nbrFvue;
    }

    public void setNbrFvue(int nbrFvue) {
        this.nbrFvue = nbrFvue;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statistique)) {
            return false;
        }
        Statistique other = (Statistique) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Statistique[ id=" + id + " ]";
    }
    
}
