package edu.illinois.nondex.it;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.HashSet;

public class ExcludedGroupsTest {

    @Test
    @Category(edu.illinois.NonDexIgnore.class)
    public void testNonDexIgnore() {
        assertFalse(true);
    }
}
