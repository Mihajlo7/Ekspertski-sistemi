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
           Klima k=new Klima();
           k.setVelicinaStana(62);
           k.setBrojProstorija("vise");
           k.setNizeTemperature("postoje");
           k.setKoriscenje("hladjenje/grejanje");
           k.setUgradnjaNaZid("nije moguca");
           kSession.insert(k);
            kSession.fireAllRules();
           System.out.println(k);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


}
