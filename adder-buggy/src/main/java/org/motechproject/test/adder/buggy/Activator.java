package org.motechproject.test.adder.buggy;

import org.motechproject.test.adder.api.AdderService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting Bundle buggy adder");
        context.registerService(AdderService.class.getName(), new AdderService() {
            @Override
            public int add(int x, int y) {
                return 0;
            }
        }, null);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping buggy adder");
    }
}
