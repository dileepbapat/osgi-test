package org.motechproject.test.adder.bundle;

import org.motechproject.test.adder.api.AdderService;

public class AdderImpl1 implements AdderService {
    @Override
    public int add(int x, int y) {
        return x + y;
    }
}
