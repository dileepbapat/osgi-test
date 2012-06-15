package org.motechproject.test.adder.impl;

import org.motechproject.test.adder.api.AdderService;

public class AdderImpl implements AdderService {
    @Override
    public int add(int x, int y) {
        return x + y;
    }
}
