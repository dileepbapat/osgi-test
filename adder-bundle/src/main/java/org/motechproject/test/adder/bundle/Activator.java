package org.motechproject.test.adder.bundle;

import org.motechproject.test.adder.api.AdderService;
import org.motechproject.test.adder.impl.AdderImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting Bundle bundle");
        context.registerService(AdderService.class.getName(), new AdderImpl(), null);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping bundle adder");
    }
}
