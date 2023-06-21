package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            Krov k=new Krov();
            k.setProkisnjava("po sredini/po ivici");
            k.setKvadratura(50.23);
            k.setUlegao(true);
            k.setNedostajuciCrepovi(40);
            k.setOluciZardjali(true);
            k.setPostojiDrvo(false);
            kSession.insert(k);
            kSession.fireAllRules();
            System.out.println(k);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


}
