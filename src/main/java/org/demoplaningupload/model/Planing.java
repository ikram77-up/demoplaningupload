package org.demoplaningupload.model;



import javax.persistence.*;

@Entity
public class Planing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sites;
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "S1")),
            @AttributeOverride(name = "s2", column = @Column(name = "S2")),
            @AttributeOverride(name = "s3", column = @Column(name = "S3")),
            @AttributeOverride(name = "s4", column = @Column(name = "S4")),
    })
    private Mois janv22;
    private String s5;
    //fevrier
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s6")),
            @AttributeOverride(name = "s2", column = @Column(name = "s7")),
            @AttributeOverride(name = "s3", column = @Column(name = "s8")),
            @AttributeOverride(name = "s4", column = @Column(name = "s9"))

    })
    private Mois  feb22;
    //mars
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s10")),
            @AttributeOverride(name = "s2", column = @Column(name = "s11")),
            @AttributeOverride(name = "s3", column = @Column(name = "s12")),
            @AttributeOverride(name = "s4", column = @Column(name = "s13"))

    })
    private Mois mars22;

    //April
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s14")),
            @AttributeOverride(name = "s2", column = @Column(name = "s15")),
            @AttributeOverride(name = "s3", column = @Column(name = "s16")),
            @AttributeOverride(name = "s4", column = @Column(name = "s17"))

    })
    private Mois apr2022;

    //may
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s18")),
            @AttributeOverride(name = "s2", column = @Column(name = "s19")),
            @AttributeOverride(name = "s3", column = @Column(name = "s20")),
            @AttributeOverride(name = "s4", column = @Column(name = "s21"))

    })
    private Mois may2022;
    private String s22;

    //jui
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s23")),
            @AttributeOverride(name = "s2", column = @Column(name = "s24")),
            @AttributeOverride(name = "s3", column = @Column(name = "s25")),
            @AttributeOverride(name = "s4", column = @Column(name = "s26"))

    })
    private Mois jui22;
    //juillet
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s27")),
            @AttributeOverride(name = "s2", column = @Column(name = "s28")),
            @AttributeOverride(name = "s3", column = @Column(name = "s29")),
            @AttributeOverride(name = "s4", column = @Column(name = "s30"))

    })
    private Mois juil22;

    //Aout
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s31")),
            @AttributeOverride(name = "s2", column = @Column(name = "s32")),
            @AttributeOverride(name = "s3", column = @Column(name = "s33")),
            @AttributeOverride(name = "s4", column = @Column(name = "s34"))

    })
    private Mois Aug22;
    private String s35;

    //Septembre
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s36")),
            @AttributeOverride(name = "s2", column = @Column(name = "s37")),
            @AttributeOverride(name = "s3", column = @Column(name = "s38")),
            @AttributeOverride(name = "s4", column = @Column(name = "s39"))

    })
    private Mois sep22;

    //Octobre
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s40")),
            @AttributeOverride(name = "s2", column = @Column(name = "s41")),
            @AttributeOverride(name = "s3", column = @Column(name = "s42")),
            @AttributeOverride(name = "s4", column = @Column(name = "s43"))

    })
    private Mois oct22;
    private String s44;

    //novombre
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s45")),
            @AttributeOverride(name = "s2", column = @Column(name = "s46")),
            @AttributeOverride(name = "s3", column = @Column(name = "s47")),
            @AttributeOverride(name = "s4", column = @Column(name = "s48"))

    })
    private Mois nov22;

    //Decembre
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "s1", column = @Column(name = "s49")),
            @AttributeOverride(name = "s2", column = @Column(name = "s50")),
            @AttributeOverride(name = "s3", column = @Column(name = "s51")),
            @AttributeOverride(name = "s4", column = @Column(name = "s52"))

    })
    private Mois dec22;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSites() {
        return sites;
    }

    public void setSites(String sites) {
        this.sites = sites;
    }

    public Mois getJanv22() {
        return janv22;
    }

    public void setJanv22(Mois janv22) {
        this.janv22 = janv22;
    }

    public String getS5() {
        return s5;
    }

    public void setS5(String s5) {
        this.s5 = s5;
    }

    public Mois getFeb22() {
        return feb22;
    }

    public void setFeb22(Mois feb22) {
        this.feb22 = feb22;
    }

    public Mois getMars22() {
        return mars22;
    }

    public void setMars22(Mois mars22) {
        this.mars22 = mars22;
    }

    public Mois getApr2022() {
        return apr2022;
    }

    public void setApr2022(Mois apr2022) {
        this.apr2022 = apr2022;
    }

    public Mois getMay2022() {
        return may2022;
    }

    public void setMay2022(Mois may2022) {
        this.may2022 = may2022;
    }

    public String getS22() {
        return s22;
    }

    public void setS22(String s22) {
        this.s22 = s22;
    }

    public Mois getJui22() {
        return jui22;
    }

    public void setJui22(Mois jui22) {
        this.jui22 = jui22;
    }

    public Mois getJuil22() {
        return juil22;
    }

    public void setJuil22(Mois juil22) {
        this.juil22 = juil22;
    }

    public Mois getAug22() {
        return Aug22;
    }

    public void setAug22(Mois aug22) {
        Aug22 = aug22;
    }

    public String getS35() {
        return s35;
    }

    public void setS35(String s35) {
        this.s35 = s35;
    }

    public Mois getSep22() {
        return sep22;
    }

    public void setSep22(Mois sep22) {
        this.sep22 = sep22;
    }

    public Mois getOct22() {
        return oct22;
    }

    public void setOct22(Mois oct22) {
        this.oct22 = oct22;
    }

    public String getS44() {
        return s44;
    }

    public void setS44(String s44) {
        this.s44 = s44;
    }

    public Mois getNov22() {
        return nov22;
    }

    public void setNov22(Mois nov22) {
        this.nov22 = nov22;
    }

    public Mois getDec22() {
        return dec22;
    }

    public void setDec22(Mois dec22) {
        this.dec22 = dec22;
    }
}
