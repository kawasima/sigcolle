package net.unit8.sigcolle;

import enkan.system.devel.DevelCommandRegister;
import enkan.system.repl.PseudoRepl;
import enkan.system.repl.ReplBoot;
import enkan.system.repl.pseudo.ReplClient;
import kotowari.system.KotowariCommandRegister;

/**
 * @author kawasima
 */
public class ReplMain {
    public static void main(String[] args) throws Exception {
        PseudoRepl repl = new PseudoRepl(MyExampleSystemFactory.class.getName());
        ReplBoot.start(repl,
                //new ScaffoldCommandRegister(),
                new KotowariCommandRegister(),
                new DevelCommandRegister());

        new ReplClient().start(repl.getPort().get());
    }
}
