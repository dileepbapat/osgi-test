package org.motechproject.test.client;

import org.motechproject.test.adder.api.AdderService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting adder client");
        final ServiceReference serviceReference = context.getServiceReference(AdderService.class.getName());
        System.out.println("service ref:" + serviceReference);
        final AdderService adderService = (AdderService) context.getService(serviceReference);
        final float result = adderService.add(34, 55);
        System.out.println("Result of adder " + result);

    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping adder client");

    }
}
